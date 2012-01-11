package org.eclipse.xtext.example.domainmodel.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation
import org.eclipse.xtext.example.domainmodel.domainmodel.Property
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import com.google.common.collect.Lists
import java.util.List
import org.eclipse.xtext.common.types.util.JavaReflectAccess

class DomainmodelJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypesFactory
	@Inject extension DMControllerGenerator
	@Inject extension TypeReferences
	@Inject extension TypesBuilderExtensions
	@Inject extension JavaReflectAccess

	def dispatch infer(Entity e, IAcceptor<JvmDeclaredType> acceptor, boolean prelinkingPhase) {
		val entityClass = e.toEntityClass(acceptor)
		acceptor.accept(entityClass)
		val controllerClass = e.toControllerClass(entityClass, acceptor)
		acceptor.accept(controllerClass)
	}

	def private toEntityClass(Entity e, IAcceptor<JvmDeclaredType> acceptor) {
		e.toClass( e.fullyQualifiedName ) [
			documentation = e.documentation
			annotations += e.createEntityAnnotation
			if (e.superType != null)
				superTypes += e.superType.cloneWithProxies
			val id = "id"
			if(! e.features.exists[name == id]) {
				val intType = typeof(int).getTypeForName(e)
				members += toField(id, intType) [
					annotations += e.createIdAnnotation()
				]
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
					members += f.toGetter(f.name, f.type) [
						if(typeof(List).isAssignableFrom(returnType.type.rawType)){
							annotations += createOneToMany(e)
						}
					]
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

	def createOneToMany(EObject it) {
		toAnnotation("javax.persistence.OneToMany")
	}

	def createIdAnnotation(EObject it) {
		Lists::newArrayList(
			toAnnotation("javax.persistence.Id")
		)
	}

	def createEntityAnnotation(EObject it) {
		toAnnotation("javax.persistence.Entity")
	}
}