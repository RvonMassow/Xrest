package org.eclipse.xtext.services.scoping;

import static com.google.common.collect.Iterables.filter;

import java.util.Iterator;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.services.services.Component;
import org.eclipse.xtext.services.services.Service;
import org.eclipse.xtext.services.services.ServicesFile;
import org.eclipse.xtext.services.services.UseDeclaration;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.DefaultConstructorDescriptionProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.IJvmFeatureDescriptionProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.XConstructorProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.google.common.collect.Sets;

@SuppressWarnings("restriction")
public class ServicesScopeProvider extends XbaseScopeProvider {

	private static final int DYNAMIC_EXTENSION_PRIORITY_OFFSET = 200;

	private static final int DEFAULT_EXTENSION_PRIORITY = 30;

	private static final int THIS_EXTENSION_PRIORITY_OFFSET = 250;

	@Inject 
	private TypeReferences typeReferences;

	@Inject
	private ILogicalContainerProvider logicalContainerProvider;

	@Inject
	private ITypeProvider typeProvider;

	@Inject
	private JvmModelAssociator jvmAssociations;

	@Inject
	private Provider<ServiceUseProvider> provider;

	@Override
	public IScope createLocalVarScope(final IScope parentScope,
			final LocalVariableScopeContext scopeContext) {
		IScope ret = super.createLocalVarScope(parentScope,
				scopeContext);
		return ret;
	}

	// Phone: Hannah 0174 66 50 3222
	@Override
	protected IScope createImplicitFeatureCallScope(EObject call, Resource resource, IScope parent, IScope localVariableScope) {
		JvmFeatureScopeAcceptor featureScopeDescriptions = new JvmFeatureScopeAcceptor();
		addFeatureCallScopes(call, localVariableScope, featureScopeDescriptions);
			
		JvmDeclaredType contextType = getContextType(call);
		IAcceptor<IJvmFeatureDescriptionProvider> acceptorWithoutContext = featureScopeDescriptions.curry(null, call);
		addStaticFeatureDescriptionProviders(resource, contextType, acceptorWithoutContext);
		if (contextType != null) {
			IAcceptor<IJvmFeatureDescriptionProvider> acceptorWithContext = featureScopeDescriptions.curry(typeReferences.createTypeRef(contextType), call);
			addFeatureDescriptionProviders(contextType, null, null, null, getImplicitStaticFeaturePriority(), true, acceptorWithContext);
		}

		IScope result = featureScopeDescriptions.createScope(parent);
		return result;
	}

	protected void addFeatureCallScopes(EObject featureCall, IScope localVariableScope,
			IJvmFeatureScopeAcceptor featureScopeDescriptions) {
		addFeatureCallScopes(featureCall, localVariableScope, THIS, getThisPriority(), featureScopeDescriptions);
		addFeatureCallScopes(featureCall, localVariableScope, IT, getItPriority(), featureScopeDescriptions);
		
		JvmIdentifiableElement logicalContainer = logicalContainerProvider.getNearestLogicalContainer(featureCall);
		if (logicalContainer instanceof JvmConstructor) {
			JvmConstructor constructor = (JvmConstructor) logicalContainer;
			JvmDeclaredType contextType = constructor.getDeclaringType();
			JvmTypeReference receiverType = typeReferences.createTypeRef(contextType);
			IAcceptor<IJvmFeatureDescriptionProvider> acceptor = featureScopeDescriptions.curry(receiverType, featureCall);
			DefaultConstructorDescriptionProvider defaultProvider = newDefaultConstructorDescriptionProvider();
			XConstructorProvider featureProvider = newConstructorProvider();
			defaultProvider.setContextType(contextType);
			defaultProvider.setPriority(getDefaultPriority());
			defaultProvider.setFeaturesForTypeProvider(featureProvider);
			acceptor.accept(defaultProvider);			
		}
	}

	protected void addFeatureCallScopes(
			EObject expression, 
			IScope localVariableScope,
			QualifiedName variableName,
			int priority,
			IJvmFeatureScopeAcceptor featureScopeDescriptions) {
		IEObjectDescription implicitVariable = localVariableScope.getSingleElement(variableName);
		if (implicitVariable != null) {
			EObject implicitReceiver = implicitVariable.getEObjectOrProxy();
			if (implicitReceiver instanceof JvmIdentifiableElement) {
				JvmTypeReference receiverType = typeProvider.getTypeForIdentifiable((JvmIdentifiableElement) implicitReceiver);
				receiverType = unkownToObject(receiverType, expression);
				if (receiverType != null) {
					XFeatureCall receiver = XbaseFactory.eINSTANCE.createXFeatureCall();
					receiver.setFeature((JvmIdentifiableElement) implicitReceiver);
					addFeatureScopes(receiverType, expression, getContextType(expression), receiver, null, priority, featureScopeDescriptions);
				}
			}
		}
	}

	@Override
	protected void addFeatureDescriptionProviders(
			Resource resource, 
			JvmDeclaredType contextType,
			XExpression implicitReceiver,
			XExpression implicitArgument,
			int priority,
			IAcceptor<IJvmFeatureDescriptionProvider> acceptor) {
		super.addFeatureDescriptionProviders(resource, contextType, implicitReceiver, implicitArgument, priority, acceptor);
		final Component component = ((ServicesFile) resource.getContents().get(0)).getComponent();
		// extensions for this
		JvmGenericType inferredJvmType = getFirstOrNull(jvmAssociations.getJvmElements(component), JvmGenericType.class);
		if (inferredJvmType != null) {
			boolean isThis = false;
			if (implicitReceiver instanceof XFeatureCall) {
				isThis = ((XFeatureCall) implicitReceiver).getFeature() == inferredJvmType;
			}
			if (implicitReceiver == null || isThis) {
				XFeatureCall callToThis = XbaseFactory.eINSTANCE.createXFeatureCall();
				callToThis.setFeature(inferredJvmType);
				// injected extensions
				Iterable<UseDeclaration> extensionFields = getExtensions(component);
				int extensionPriority = priority + DYNAMIC_EXTENSION_PRIORITY_OFFSET;
				if (isThis && implicitArgument == null)
					extensionPriority = DEFAULT_EXTENSION_PRIORITY;
//				boolean isStatic = isStaticContext(((SimpleAcceptor)acceptor).getExpression());
				for (UseDeclaration extensionField : extensionFields) {
					JvmIdentifiableElement dependencyImplicitReceiver = findImplicitReceiverFor(extensionField);
					XMemberFeatureCall callToDependency = XbaseFactory.eINSTANCE.createXMemberFeatureCall();
					callToDependency.setMemberCallTarget(EcoreUtil2.clone(callToThis));
					callToDependency.setFeature(dependencyImplicitReceiver);
					if (dependencyImplicitReceiver != null) {
						// TODO replace by provider
						ServiceUseProvider extensionFeatureProvider = provider.get();
						extensionFeatureProvider.setContext(extensionField.getType());
						extensionFeatureProvider.setExpectNoParameters(isThis);
						addFeatureDescriptionProviders(contextType, extensionFeatureProvider, callToDependency, implicitArgument, extensionPriority, false, acceptor);
					}
				}
				JvmTypeReference typeRef = typeReferences.createTypeRef(inferredJvmType);
				ServiceUseProvider featureProvider = provider.get();
				featureProvider.setContext(typeRef);
				featureProvider.setExpectNoParameters(isThis);
				addFeatureDescriptionProviders(contextType, featureProvider, callToThis, implicitArgument, priority + THIS_EXTENSION_PRIORITY_OFFSET, false, acceptor);
			}
		}
	}

	protected Iterable<UseDeclaration> getExtensions(Component context) {
		Set<UseDeclaration> ret = Sets.newHashSet();
		for(Service s: context.getServices()) {
			ret.addAll(s.getUses());
		}
		return ret;
	}

	protected <T> T getFirstOrNull(Iterable<EObject> elements, Class<T> type) {
		Iterator<T> iterator = filter(elements, type).iterator();
		return iterator.hasNext() ? iterator.next() : null;
	}

	protected JvmIdentifiableElement findImplicitReceiverFor(UseDeclaration use) {
		Set<EObject> elements = jvmAssociations.getJvmElements(use);
		if (!elements.isEmpty()) {
			final JvmIdentifiableElement field = (JvmIdentifiableElement) elements.iterator().next();
			return field;
		}
		return null;
	}
}
