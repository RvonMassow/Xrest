
package org.eclipse.xtext.example.domainmodel.jvmmodel

import javax.inject.Inject
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
				members += injectedDaoClass(e)
				members += injectedUriInfo(e)
				members += createJsonPut(forType, e)
				members += createDelete(forType, e)
				members += createJsonGetById(forType, e)
				members += createJsonPost(forType, e)
				members += createJsonGetAll(forType, e)
			]
		}
	}

	def private injectedDaoClass(Entity e) {
		e.toField("_dao", (e.fullyQualifiedName.toString + "Dao").getTypeForName(e)) [
			annotations += e.createInjectAnnotation
		]
	}
	
	def private injectedUriInfo(Entity e) {
		e.toField("_uriInfo", ("javax.ws.rs.core.UriInfo").getTypeForName(e)) [
			annotations += e.createContextAnnotation
		]
	}

	def private createJsonGetById(JvmGenericType t, Entity e) {
		e.toMethod('''get«t.simpleName»AsJSON'''.toString, "javax.ws.rs.core.Response".getTypeForName(e)) [
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
				«t.simpleName» «t.simpleName.toFirstLower» = _dao.retrieve«t.simpleName»ById(id);
				if(«t.simpleName.toFirstLower» == null){
					return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND).build();
				}
				return Response.ok(«t.simpleName.toFirstLower»).build();
				'''.toString)
			]
		]
	}

	def private createJsonGetAll(JvmGenericType t, Entity e) {
		val type = 'java.util.List'.getTypeForName(e, t.createTypeRef)
//		type.typeParameters.remove(0);
//		type.typeParameters += 
		e.toMethod('''get«t.simpleName»AllAsJSON'''.toString, type) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createGetAnnotation()
			annotations += e.createProducesAnnotation("application/json")
			setBody [
				trace(e)
				append('''
				java.util.List<«t.simpleName»> _results = _dao.retrieveAll«t.simpleName»s();
				return _results;
				'''.toString)
			]
		]
	}
	
	def private createJsonPost(JvmGenericType t, Entity e) {
		val ref = t.createTypeRef
		e.toMethod('''post«t.simpleName»'''.toString, "javax.ws.rs.core.Response".getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createPostAnnotation()
			annotations += e.createConsumesAnnotation("application/json")
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, ref)
			setBody [
				trace(e)
				val validate = e.features.filter(typeof(Operation)).findFirst[name == "validate"]
				val derive = e.features.filter(typeof(Operation)).findFirst[name == "generate"]
				append('''
				«IF derive != null»
				«t.simpleName.toFirstLower».generate();
				«ENDIF»
				«IF validate != null»
				if(«t.simpleName.toFirstLower».validate()) {
				«ENDIF»
				int id = _dao.create«t.simpleName»(«t.simpleName.toFirstLower»);
				java.net.URI location = _uriInfo.getAbsolutePathBuilder().path("" + id).build();
				return Response.created(location).build();
				«IF validate != null»
				}
				return Response.status(javax.ws.rs.core.Response.Status.FORBIDDEN).build();
				«ENDIF»
	  			'''.toString)
	  		]
		]
	}
	
	def private createJsonPut(JvmGenericType t, Entity e) {
		val ref = t.createTypeRef
		e.toMethod('''put«t.simpleName»'''.toString, "javax.ws.rs.core.Response".getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createPutAnnotation()
			annotations += e.createConsumesAnnotation("application/json")
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, ref)
			setBody [
				trace(e)
				val validate = e.features.filter(typeof(Operation)).findFirst[name == "validate"]
				val derive = e.features.filter(typeof(Operation)).findFirst[name == "derive"]
				append('''
				«IF derive != null»
				«t.simpleName.toFirstLower».generate();
				«ENDIF»
				«IF validate != null»
				if(«t.simpleName.toFirstLower».validate()) {
				«ENDIF»
				try{
					«t.simpleName» modified«t.simpleName» = _dao.modify«t.simpleName»(«t.simpleName.toFirstLower»);
					return Response.ok(modified«t.simpleName»).build();
				}
				catch(IllegalArgumentException e){
					return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND).build();
				}
				«IF validate != null»
				}
				return Response.status(javax.ws.rs.core.Response.Status.NOT_MODIFIED).build();
				«ENDIF»
	  			'''.toString)
	  		]
		]
	}

	def private createDelete(JvmGenericType t, Entity e) {
		e.toMethod('''delete«t.simpleName»'''.toString, "javax.ws.rs.core.Response".getTypeForName(e)) [
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
				try{
					_dao.delete«t.simpleName»(id);
					return Response.noContent().build();
				}
				catch(IllegalArgumentException e){
				  		return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND).build();
				}
				'''.toString)
	  		]
	  	]
	}

//	def testDom() {
//		createDOMTemplate(null, null)
//	}

}