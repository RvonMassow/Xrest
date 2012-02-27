package org.eclipse.xtext.example.domainmodel.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class DMControllerGenerator {

	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypesBuilderExtensions
	@Inject extension TypeReferences

	def toControllerClass(Entity e, JvmGenericType forType, IJvmDeclaredTypeAcceptor acceptor) {
		if(e.name != null) {
			acceptor.accept(e.toClass(e.fullyQualifiedName.toString + "Controller")).initializeLater [
				annotations += e.toAnnotation("javax.ws.rs.Path",
					e.fullyQualifiedName.segments.map[toLowerCase].join("/")
				)
				members += injectedEntityManagerFactory(e)
				members += createJSONById(forType, e)
				members += createPost(forType, e)
				members += createPut(forType, e)
				members += createDelete(forType, e)
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
	
	def private createPost(JvmGenericType t, EObject e) {
		val ref = t.createTypeRef
		e.toMethod('''post«t.simpleName»'''.toString, typeof(int).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createPostAnnotation()
			annotations += e.createConsumesAnnotation("application/json")
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, ref)
			setBody [
				'''
				EntityManager entityManager = _emf.createEntityManager();
				entityManager.persist(«t.simpleName.toFirstLower»);
				return «t.simpleName.toFirstLower».getId();
	  			'''
			]
		]
	}
	
	def private createPut(JvmGenericType t, EObject e) {
		val ref = t.createTypeRef
		e.toMethod('''put«t.simpleName»'''.toString, typeof(int).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createPutAnnotation()
			annotations += e.createConsumesAnnotation("application/json")
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, ref)
			setBody [
				'''
				EntityManager entityManager = _emf.createEntityManager();
				«t.simpleName» entity = entityManager.merge(«t.simpleName.toFirstLower»);
				return entity.getId();
	  			'''
			]
		]
	}
	
	def private createDelete(JvmGenericType t, EObject e) {
		val ref = t.createTypeRef
		e.toMethod('''delete«t.simpleName»'''.toString, typeof(void).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createDeleteAnnotation()
			annotations += e.createConsumesAnnotation("application/json")
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, ref)
			setBody [
				'''
				EntityManager entityManager = _emf.createEntityManager();
				entityManager.remove(«t.simpleName.toFirstLower»);
	  			'''
			]
		]
	}

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

	def createPathParamAnnotation(EObject it, String name) {
		toAnnotation("javax.ws.rs.PathParam", name)
	}

	def createProducesAnnotation(EObject it, String mime) {
		toAnnotation("javax.ws.rs.Produces", mime)
	}
	
	def createConsumesAnnotation(EObject it, String mime) {
		toAnnotation("javax.ws.rs.Consumes", mime)
	}
}