package org.eclipse.xtext.example.domainmodel.jvmmodel

import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

class AnnotationExtensions {
	@Inject extension JvmTypesBuilder
	
	def createGetAnnotation(EObject it) {
		toAnnotation("javax.ws.rs.GET")
	}
	
	def createPostAnnotation(EObject it) {
		toAnnotation("javax.ws.rs.POST")
	}
	
	def createPutAnnotation(EObject it) {
		toAnnotation("javax.ws.rs.PUT")
	}
	
	def createDeleteAnnotation(EObject it) {
		toAnnotation("javax.ws.rs.DELETE")
	}

	def createPathAnnotation(EObject it, String param) {
		toAnnotation("javax.ws.rs.Path", param)
	}

	def createInjectAnnotation(EObject it) {
		toAnnotation("javax.inject.Inject")
	}

	def createPathParamAnnotation(EObject it, String name) {
		toAnnotation("javax.ws.rs.PathParam", name)
	}

	def createFormParamAnnotation(EObject it, String name) {
		toAnnotation("javax.ws.rs.FormParam", name)
	}

	def createProducesAnnotation(EObject it, String mime) {
		toAnnotation("javax.ws.rs.Produces", mime)
	}
	
	def createConsumesAnnotation(EObject it, String mime) {
		toAnnotation("javax.ws.rs.Consumes", mime)
	}
}