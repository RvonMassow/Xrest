package org.eclipse.xtext.services.scoping;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.emptyList;

import java.util.Collection;
import java.util.List;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.scoping.featurecalls.AbstractFeaturesForTypeProvider;

import com.google.common.collect.Lists;

@SuppressWarnings("restriction")
public class ServiceUseProvider extends AbstractFeaturesForTypeProvider {

	private JvmTypeReference context;
	private boolean noParameters;

	public void setContext(JvmTypeReference context) {
		this.context = context;
	}
	
	@Override
	public boolean isExtensionProvider() {
		return false;
	}

	@Override
	public Iterable<JvmFeature> getFeaturesByName(String name,
			JvmTypeReference declarator, Iterable<JvmTypeReference> hierarchy) {
		if(context == null)
			return emptyList();
		List<JvmFeature> result = Lists.newArrayList();
		List<JvmType> rawTypes = getRawTypeHelper().getAllRawTypes(context, null);
		for(JvmType rawType: rawTypes) {
			if (rawType instanceof JvmDeclaredType) {
				Iterable<JvmFeature> candidates = ((JvmDeclaredType) rawType).findAllFeaturesByName(name);
				collectExtensionMethods(hierarchy, candidates, result);
			}
		}
		return result;
	}

	public void setExpectNoParameters(boolean isThis) {
		this.noParameters = isThis;
	}

	protected void collectExtensionMethods(Iterable<JvmTypeReference> hierarchy, Iterable<JvmFeature> candidates,
			Collection<JvmFeature> result) {
		boolean atLeastOneCandidate = false;
		for(JvmTypeReference reference: hierarchy) {
			for(JvmFeature candidate: candidates) {
				if (candidate instanceof JvmOperation && !isFiltered((JvmOperation)candidate)) {
					JvmOperation operation = (JvmOperation) candidate;
					List<JvmFormalParameter> parameters = operation.getParameters();
					atLeastOneCandidate = true;
					if (parameters.size()>0 && !noParameters) {
						JvmTypeReference parameterType = parameters.get(0).getParameterType();
						if (isSameTypeOrAssignableToUpperBound(reference, parameterType)) {
							result.add(operation);
						}
					} else if (noParameters) {
						result.add(operation);
					}
				} else if (candidate instanceof JvmField && noParameters) {
					result.add(candidate);
				}
			}
			if (!atLeastOneCandidate || noParameters)
				return;
		}
	}

	public Iterable<JvmFeature> getAllFeatures(JvmTypeReference typeReference,
			Iterable<JvmTypeReference> hierarchy) {
		if(context == null)
			return emptyList();
		List<JvmFeature> result = newArrayList();
		List<JvmType> rawTypes = getRawTypeHelper().getAllRawTypes(context, null);
		for(JvmType rawType: rawTypes) {
			if (rawType instanceof JvmDeclaredType) {
				Iterable<JvmFeature> candidates = ((JvmDeclaredType) rawType).getAllFeatures();
				collectExtensionMethods(hierarchy, candidates, result);
			}
		}
		return result;
	}
	protected boolean isFiltered(JvmOperation candidate) {
		return Object.class.getCanonicalName().equals(candidate.getDeclaringType().getIdentifier());
	}

}
