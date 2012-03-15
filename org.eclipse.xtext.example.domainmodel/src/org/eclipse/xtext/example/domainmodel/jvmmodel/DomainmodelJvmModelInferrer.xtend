package org.eclipse.xtext.example.domainmodel.jvmmodel

import com.google.common.collect.Lists
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation
import org.eclipse.xtext.example.domainmodel.domainmodel.Property
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class DomainmodelJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension DMControllerGenerator
	@Inject extension TypeReferences
	@Inject extension TypesBuilderExtensions

	def dispatch void infer(Entity e, IJvmDeclaredTypeAcceptor acceptor, boolean prelinkingPhase) {
		val entityClass = e.toEntityClass(acceptor, prelinkingPhase)
		e.toControllerClass(entityClass, acceptor)
	}

	def private toEntityClass(Entity e, IJvmDeclaredTypeAcceptor acceptor, boolean prelinkingPhase) {
		val clazz = e.toClass( e.fullyQualifiedName )
		acceptor.accept(clazz).initializeLater [
			documentation = e.documentation
			annotations += e.createEntityAnnotation
			annotations += e.createXmlRootElement
			if (e.superType != null)
				superTypes += e.superType.cloneWithProxies
			val id = "id"
			if(! e.features.exists[name == id]) {
				val intType = typeof(int).getTypeForName(e)
				members += toField(id, intType) [
					annotations += e.createIdAnnotations()
				]
				members += toGetter(id, intType)
				members += toSetter(id, intType)
			}
			generateFeatures(e, prelinkingPhase)
		]
		e.associate(clazz)
		clazz
	}

	def generateFeatures(JvmGenericType it, Entity e, boolean prelinkingPhase) {
			for ( f : e.features ) {
				switch f {
					Property : {
						members += f.toField(f.name, f.type)
						members += f.toGetter(f.name, f.type) [
							if(f.mappedBy != null) {
								val anno = createOneToMany(e)// FIXME compatibility
								val annoVal = TypesFactory::eINSTANCE.createJvmStringAnnotationValue
								annoVal.operation = anno.annotation.members.findFirst[simpleName == "mappedBy"] as JvmOperation
								annoVal.values += f.mappedBy.name
								anno.values += annoVal
								annotations += anno
							}
						]
						members += f.toSetter(f.name, f.type)
					}
	
					Operation : {
						members += f.toMethod(f.name, typeof(void).getTypeForName(e)) [
							documentation = f.documentation
							body = f.body
						]
					}
				}
			}
	}
	
	def createXmlRootElement(EObject it){
		toAnnotation("javax.xml.bind.annotation.XmlRootElement")
	}
	
	def createOneToMany(EObject it) {
		toAnnotation("javax.persistence.OneToMany")
	}
	
	def createManyToOne(EObject it) {
		toAnnotation("javax.persistence.ManyToOne")
	}

	def createIdAnnotations(EObject it) {
		Lists::newArrayList(
			toAnnotation("javax.persistence.GeneratedValue"),
			toAnnotation("javax.persistence.Id")
		)
	}

	def createEntityAnnotation(EObject it) {
		toAnnotation("javax.persistence.Entity")
	}
}