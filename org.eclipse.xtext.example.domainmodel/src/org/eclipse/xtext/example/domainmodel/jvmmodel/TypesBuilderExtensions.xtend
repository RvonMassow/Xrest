package org.eclipse.xtext.example.domainmodel.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.lib.Procedures
import org.eclipse.xtext.common.types.JvmFormalParameter

class TypesBuilderExtensions {

	@Inject extension JvmTypesBuilder builder

	def toParameter(EObject sourceElement, String name, JvmTypeReference typeRef, Procedures$Procedure1<JvmFormalParameter> init) {
		val parameter = toParameter(sourceElement, name, typeRef)
		if(name != null && init != null)
			init.apply(parameter)
		parameter
	} 

}