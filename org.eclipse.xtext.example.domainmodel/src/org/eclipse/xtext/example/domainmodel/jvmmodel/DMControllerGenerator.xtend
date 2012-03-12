
package org.eclipse.xtext.example.domainmodel.jvmmodel

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation
import org.eclipse.xtext.example.domainmodel.domainmodel.Property
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
				annotations += e.createPathAnnotation(
					e.fullyQualifiedName.segments.map[toLowerCase].join("/")
				)
				members += e.toConstructor(simpleName) [
					setBody [
						trace(e)
						append(
							'''
							this._emf = javax.persistence.Persistence.createEntityManagerFactory("messageboard");
							'''
						)
					]
				]
				members += injectedEntityManagerFactory(e)
				members += createJsonPut(forType, e)
				members += createDelete(forType, e)
				members += createJsonGetById(forType, e)
				members += createJsonPost(forType, e)
				members += createJsonGetAll(forType, e)
			]
		}
	}

	def private injectedEntityManagerFactory(Entity e) {
		e.toField("_emf", "javax.persistence.EntityManagerFactory".getTypeForName(e))
	}

	def private createJsonGetById(JvmGenericType t, EObject e) {
		val ref = t.createTypeRef
		e.toMethod('''get«t.simpleName»AsJSON'''.toString, ref) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createGetAnnotation()
			annotations += e.createProducesAnnotation("application/json")
			annotations += e.createPathAnnotation("{id}")
			parameters += e.toParameter("id", typeof(int).getTypeForName(e)) [
				annotations += e.createPathParamAnnotation("id")
			]
			setBody [
				trace(e)
				append('''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				«t.simpleName» «t.simpleName.toFirstLower» = _entityManager.find(«t.simpleName».class, id);
				_entityManager.getTransaction().commit();
				_entityManager.close();
				return «t.simpleName.toFirstLower»;
	  			'''.toString)
			]
		]
	}

	def private createJsonGetAll(JvmGenericType t, EObject e) {
		val tRet = typeof(List).getTypeForName(e, t.createTypeRef)
		e.toMethod('''get«t.simpleName»AllAsJSON'''.toString, tRet) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createGetAnnotation()
			annotations += e.createProducesAnnotation("application/json")
			setBody [
				trace(e)
				append('''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				javax.persistence.Query _q = _entityManager.createQuery("select results from «t.simpleName» results");
				java.util.List<«t.simpleName»> _results = _q.getResultList();
				_entityManager.getTransaction().commit();
				_entityManager.close();
				return _results;
	  			'''.toString)
			]
		]
	}

	def private createJsonPost(JvmGenericType t, Entity e) {
		e.toMethod('''post«t.simpleName»'''.toString, typeof(void).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createPostAnnotation()
			annotations += e.createConsumesAnnotation("application/x-www-form-urlencoded")
			for(n : e.features.filter(typeof(Property)).filter[!derive]) {
				parameters += e.toParameter(n.name, n.type)[
					annotations += e.createFormParamAnnotation(n.name)
				]
			}
			setBody [
				trace(e)
				val derive = e.features.filter(typeof(Operation)).findFirst[name == "derive"]
				val validate = e.features.filter(typeof(Operation)).findFirst[name == "validate"]
				append('''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				«t.simpleName» _inst«t.simpleName» = new «t.simpleName»();
				«FOR prop : e.features.filter(typeof(Property))»
					«IF !prop.derive»
						_inst«t.simpleName».set«prop.name.toFirstUpper»(«prop.name»);
					«ENDIF»
				«ENDFOR»
				«IF derive != null»
				_inst«t.simpleName».derive();
				«ENDIF»
				«IF validate != null»
				if(_inst«t.simpleName».validate())
				«ENDIF»
				{
				  _entityManager.getTransaction().begin();
				  _entityManager.persist(_inst«t.simpleName»);
				  _entityManager.getTransaction().commit();
				  _entityManager.close();
				}
«««				//return _inst«t.simpleName».getId();
	  			'''.toString)
	  		]
		]
	}
	
	def private createJsonPut(JvmGenericType t, EObject e) {
		val ref = t.createTypeRef
		e.toMethod('''put«t.simpleName»'''.toString, typeof(int).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createPutAnnotation()
			annotations += e.createConsumesAnnotation("application/json")
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, ref)
			setBody [
				trace(e)
				append(
				'''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				«t.simpleName» entity = _entityManager.merge(«t.simpleName.toFirstLower»);
				_entityManager.getTransaction().commit();
				_entityManager.close();
				return entity.getId();
	  			'''.toString)
			]
		]
	}
	
	def private createDelete(JvmGenericType t, EObject e) {
		e.toMethod('''delete«t.simpleName»'''.toString, typeof(void).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createDeleteAnnotation()
			annotations += e.createPathAnnotation("{id}")
			parameters += e.toParameter("id", typeof(int).getTypeForName(e)) [
				annotations += e.createPathParamAnnotation("id")
			]
			setBody [
				trace(e)
				append(
				'''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				«t.simpleName» _«t.simpleName.toFirstLower» = _entityManager.find(«t.simpleName».class, id);
				_entityManager.remove(_«t.simpleName.toFirstLower»);
				_entityManager.getTransaction().commit();
				_entityManager.close();
	  			'''.toString)
	  		]
	  	]
	}

//	def testDom() {
//		createDOMTemplate(null, null)
//	}

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