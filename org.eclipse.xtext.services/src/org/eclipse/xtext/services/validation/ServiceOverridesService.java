package org.eclipse.xtext.services.validation;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.transform;

import java.util.Set;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.FeatureOverridesService;
import org.eclipse.xtext.common.types.util.ITypeArgumentContext;
import org.eclipse.xtext.common.types.util.SuperTypeCollector;
import org.eclipse.xtext.common.types.util.TypeArgumentContextProvider;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.services.services.Service;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;

import com.google.common.base.Function;
import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ServiceOverridesService {
	@Inject
	private FeatureOverridesService featureOverridesService;
	
	@Inject
	private TypeArgumentContextProvider typeArgumentContextProvider;
	
	@Inject
	private TypeReferences typeReferences;
	
	@Inject
	private SuperTypeCollector superTypeCollector;

	@Inject
	private JvmModelAssociator jvmModelAssociator;
	
	public JvmOperation findOverriddenOperation(Service service) {
		JvmOperation inferredOperation = getDirectlyInferredOperation(service);
		if (inferredOperation == null)
			return null;
		return findOverriddenOperation(inferredOperation);
	}

	public JvmOperation findOverriddenOperation(JvmOperation operation) {
		final JvmTypeReference typeRef = typeReferences.createTypeRef(operation.getDeclaringType());
		ITypeArgumentContext typeArgumentContext = typeArgumentContextProvider.getTypeArgumentContext(
				new TypeArgumentContextProvider.ReceiverRequest(typeRef));
		for (JvmOperation superOperation : allSuperOperations(operation.getDeclaringType())) {
			if (superOperation.getVisibility() != JvmVisibility.PRIVATE) {
				if (featureOverridesService.isOverridden(operation, superOperation, typeArgumentContext,
						false)) {
					return superOperation;
				}
			}
		}
		return null;
	}
	
	protected Iterable<JvmOperation> allSuperOperations(final JvmDeclaredType type) {
		Set<JvmTypeReference> superTypes = superTypeCollector.collectSuperTypes(type);
		superTypes.add(typeReferences.getTypeForName(Object.class, type));
		Iterable<JvmOperation> result = filter(concat(transform(
			superTypes, new Function<JvmTypeReference, Iterable<JvmFeature>>() {
				public Iterable<JvmFeature> apply(JvmTypeReference from) {
					return featureOverridesService.getAllJvmFeatures(from);
				}
			})), JvmOperation.class);
		return result;
	}
	
	public JvmTypeReference getOverriddenReturnType(Service service) {
		JvmOperation operation = findOverriddenOperation(service);
		if (operation==null)
			return null;
		return operation.getReturnType();
	}


	public JvmOperation getDirectlyInferredOperation(Service service) {
		final Iterable<JvmOperation> jvmElements = filter(jvmModelAssociator.getJvmElements(service), JvmOperation.class);
		String expectedName = service.getName();
		for (JvmOperation jvmOperation : jvmElements) {
			if (jvmOperation.getSimpleName().equals(expectedName)) {
				return jvmOperation;
			}
		}
		return null;
	}
}
