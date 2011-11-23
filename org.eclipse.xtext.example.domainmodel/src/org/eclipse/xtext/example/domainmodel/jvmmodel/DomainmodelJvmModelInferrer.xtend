package org.eclipse.xtext.example.domainmodel.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation
import org.eclipse.xtext.example.domainmodel.domainmodel.Property
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.common.types.JvmAnnotationType

class DomainmodelJvmModelInferrer extends AbstractModelInferrer {
	
	@Inject extension JvmTypesBuilder
	@Inject extension TypesBuilderExtensions
	@Inject extension IQualifiedNameProvider
	@Inject extension TypesFactory
	@Inject TypeReferences tRefs

	def dispatch infer(Entity e, IAcceptor<JvmDeclaredType> acceptor, boolean prelinkingPhase) {
		val entityClass = e.toEntityClass(acceptor)
		acceptor.accept(entityClass)
		val controllerClass = e.toControllerClass(entityClass, acceptor)
		acceptor.accept(controllerClass)
	}

	def private toControllerClass(Entity e, JvmGenericType forType, IAcceptor acceptor) {
		if(e.name != null) {
			e.toClass(e.fullyQualifiedName?.toString + "Controller") [
				annotations += e.toAnnotation("javax.ws.rs.Path",
					e.fullyQualifiedName.segments.map[toLowerCase].join("/")
				)
				members += createJSONById(forType, e)
			]
		}
	}

	def private createJSONById(JvmGenericType t, EObject e) {
		val ref = tRefs.createTypeRef(t)
		e.toMethod('''get«t.simpleName»AsJSON'''.toString, ref) [
			visibility = JvmVisibility::PUBLIC
			annotations += e.createGetAnnotation()
			annotations += e.createProducesAnnotation("application/json")
			parameters += e.toParameter("id", tRefs.getTypeForName(typeof(int), e )) [
				annotations += e.createPathParamAnnotation("id")
			]
		]
	}

	def private toEntityClass(Entity e, IAcceptor<JvmDeclaredType> acceptor) {
		e.toClass( e.fullyQualifiedName ) [
			documentation = e.documentation
			annotations += e.createEntityAnnotation
			if (e.superType != null)
				superTypes += e.superType.cloneWithProxies
			val id = "id"
			if(! e.features.exists[name == id]) {
				val intType = tRefs.getTypeForName(typeof(int), e)
				members += toField(id, intType) [
					annotations += e.createIdAnnotation()
				]
				members += toGetter(id, intType)
				members += toSetter(id, intType)
			}
			generateFeatures(e)
		]
	}

	def generateFeatures(JvmGenericType it, Entity e) {
		for ( f : e.features ) {
			switch f {
				Property : {
					members += f.toField(f.name, f.type)
					members += f.toGetter(f.name, f.type)
					members += f.toSetter(f.name, f.type)
				}
		
				Operation : {
					members += f.toMethod(f.name, f.type) [
						documentation = f.documentation
						for (p : f.params) {
							parameters += p.toParameter(p.name, p.parameterType)
						}
						body = f.body
					]
				}
			}
		}
	}

	def createIdAnnotation(EObject it) {
		toAnnotation("javax.persistence.Id")
	}

	def createEntityAnnotation(EObject it) {
		toAnnotation("javax.persistence.Entity")
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