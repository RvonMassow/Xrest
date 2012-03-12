package org.eclipse.xtext.example.domainmodel.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.lib.Procedures$Procedure1

class TypesBuilderExtensions {

	@Inject extension JvmTypesBuilder builder

	def toParameter(EObject sourceElement, String name, JvmTypeReference typeRef, Procedures$Procedure1<JvmFormalParameter> init) {
		val parameter = toParameter(sourceElement, name, typeRef)
		if(name != null && init != null)
			init.apply(parameter)
		parameter
	} 

	def toGetter(EObject sourceElement, String name, JvmTypeReference typeRef, Procedures$Procedure1<JvmOperation> init) {
		val getter = toGetter(sourceElement, name, typeRef)
		if(name != null && init != null)
			init.apply(getter)
		getter
	}

}