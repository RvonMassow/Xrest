package org.eclipse.xtext.example.domainmodel.jvmmodel

import org.eclipse.emf.ecore.EObject

import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.common.types.util.TypeReferences


import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmVisibility

class DMControllerGenerator {

	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypesBuilderExtensions
	@Inject extension TypeReferences
	
	def toControllerClass(Entity e, JvmGenericType forType, IAcceptor acceptor) {
		if(e.name != null) {
			e.toClass(e.fullyQualifiedName?.toString + "Controller") [
				annotations += e.toAnnotation("javax.ws.rs.Path",
					e.fullyQualifiedName.segments.map[toLowerCase].join("/")
				)
				members += injectedEntityManagerFactory(e)
				members += createJSONById(forType, e)
			]
		}
	}

	def private injectedEntityManagerFactory(Entity e) {
		e.toField("_emf", "javax.persistence.EntityManagerFactory".getTypeForName(e)) [
			annotations += e.toAnnotation("javax.persistence.PersistenceUnit")
		]
	}

	def private createJSONById(JvmGenericType t, EObject e) {
		val ref = t.createTypeRef
			e.toMethod('''get«t.simpleName»AsJSON'''.toString, ref) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createGetAnnotation()
			annotations += e.createProducesAnnotation("application/json")
			parameters += e.toParameter("id", typeof(int).getTypeForName(e)) [
				annotations += e.createPathParamAnnotation("id")
			]
			setBody [
				addImportFor("javax.persistence.EntityManager".findDeclaredType(e))
				'''
				EntityManager entityManager = _emf.createEntityManager();
				«t.simpleName» «t.simpleName.toFirstLower» = entityManager.find(«t.simpleName».class, id);
				return «t.simpleName.toFirstLower»;
	  			'''
			]
		]
	}

	def createGetAnnotation(EObject it) {
		toAnnotation("javax.ws.rs.GET")
	}

	def createPathParamAnnotation(EObject it, String name) {
		toAnnotation("javax.ws.rs.PathParam", name)
	}

	def createProducesAnnotation(EObject it, String mime) {
		toAnnotation("javax.ws.rs.Produces", mime)
	}
}