
package org.eclipse.xtext.example.domainmodel.jvmmodel

import java.util.List
import javax.inject.Inject
import javax.xml.bind.JAXBElement
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class DMControllerGenerator {

	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypesBuilderExtensions
	@Inject extension TypeReferences
	@Inject extension AnnotationExtensions

	def toControllerClass(Entity e, JvmGenericType forType, IJvmDeclaredTypeAcceptor acceptor) {
		if(e.name != null) {
			acceptor.accept(e.toClass(e.fullyQualifiedName.toString + "Controller")).initializeLater [
				annotations += e.createPathAnnotation(
					e.fullyQualifiedName.segments.map[toLowerCase].join("/")
				)
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
		e.toField("_dao", (e.fullyQualifiedName.toString + "Dao").getTypeForName(e)) [
			annotations += e.createInjectAnnotation
		]
	}

	def private createJsonGetById(JvmGenericType t, Entity e) {
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
				«t.simpleName» «t.simpleName.toFirstLower» = _dao.find«t.simpleName»ById(id);
				return «t.simpleName.toFirstLower»;
	  			'''.toString)
			]
		]
	}

	def private createJsonGetAll(JvmGenericType t, Entity e) {
		val tRet = typeof(List).getTypeForName(e, t.createTypeRef)
		e.toMethod('''get«t.simpleName»AllAsJSON'''.toString, tRet) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createGetAnnotation()
			annotations += e.createProducesAnnotation("application/json")
			setBody [
				trace(e)
				append('''
				java.util.List<«t.simpleName»> _results = _dao.findAll«t.simpleName»s();
				return _results;
				'''.toString)
			]
		]
	}
	
	def private createJsonPost(JvmGenericType t, Entity e) {
		val ref = t.createTypeRef
		e.toMethod('''post«t.simpleName»'''.toString, typeof(int).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createPostAnnotation()
			annotations += e.createConsumesAnnotation("application/json")
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, typeof(JAXBElement).getTypeForName(e, ref))
			setBody [
				trace(e)
				val validate = e.features.filter(typeof(Operation)).findFirst[name == "validate"]
				val derive = e.features.filter(typeof(Operation)).findFirst[name == "derive"]
				append('''
				«t.simpleName» _inst«t.simpleName» = «t.simpleName.toFirstLower».getValue();
				int id = -1; 
				«IF derive != null»
				_inst«t.simpleName».derive();
				«ENDIF»
				«IF validate != null»
				if(_inst«t.simpleName».validate())
				«ENDIF»
				{
				  id = _dao.create«t.simpleName»(_inst«t.simpleName»);
				}
				return id;
	  			'''.toString)
	  		]
		]
	}
	
	def private createJsonPut(JvmGenericType t, Entity e) {
		val ref = t.createTypeRef
		e.toMethod('''put«t.simpleName»'''.toString, typeof(int).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createPutAnnotation()
			annotations += e.createConsumesAnnotation("application/json")
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, typeof(JAXBElement).getTypeForName(e, ref))
			setBody [
				trace(e)
				val validate = e.features.filter(typeof(Operation)).findFirst[name == "validate"]
				val derive = e.features.filter(typeof(Operation)).findFirst[name == "derive"]
				append('''
				«t.simpleName» _inst«t.simpleName» = «t.simpleName.toFirstLower».getValue();
				int id = -1; 
				«IF derive != null»
				_inst«t.simpleName».derive();
				«ENDIF»
				«IF validate != null»
				if(_inst«t.simpleName».validate())
				«ENDIF»
				{
				  id = _dao.modify«t.simpleName»(_inst«t.simpleName»);
				}
				return id;
	  			'''.toString)
	  		]
		]
	}

	def private createDelete(JvmGenericType t, Entity e) {
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
				_dao.delete«t.simpleName»(id);
	  			'''.toString)
	  		]
	  	]
	}

//	def testDom() {
//		createDOMTemplate(null, null)
//	}

}