package org.eclipse.xtext.example.domainmodel.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation
import org.eclipse.xtext.example.domainmodel.domainmodel.Property
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer

class DomainmodelJvmModelInferrer extends AbstractModelInferrer {
	
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypesFactory
	@Inject TypeReferences tRefs

	def dispatch infer(Entity e, IAcceptor<JvmDeclaredType> acceptor, boolean prelinkingPhase) {
//		acceptor.accept(
//			e.toClass( e.fullyQualifiedName ) [
//				documentation = e.documentation
//				if (e.superType != null)
//					superTypes += e.superType.cloneWithProxies
//				val path = createJvmAnnotationReference
//				path.annotation = (tRefs.findDeclaredType("javax.ws.rs.Path", e) as JvmAnnotationType)
//				val value = createJvmStringAnnotationValue
//				value.values += e.fullyQualifiedName.segments.join("/")
//				path.values += value
//				annotations += path
//				for ( f : e.features ) {
//					switch f {
//						Property : {
//							members += f.toField(f.name, f.type)
//							members += f.toGetter(f.name, f.type)
//							members += f.toSetter(f.name, f.type)
//						}
//				
//						Operation : {
//							members += f.toMethod(f.name, f.type) [
//								documentation = f.documentation
//								for (p : f.params) {
//									parameters += p.toParameter(p.name, p.parameterType)
//								}
//								body = f.body
//							]
//						}
//					}
//				}
//			]
//		)
		e.toEntityClass(acceptor)
		e.toControllerClass(acceptor)
	}

	def private toControllerClass(Entity e, IAcceptor acceptor) {
		acceptor.accept(
			e.toClass(e.fullyQualifiedName.toString + "Controller") [
				val path = createJvmAnnotationReference
				path.annotation = (tRefs.findDeclaredType("javax.ws.rs.Path", e) as JvmAnnotationType)
				val value = createJvmStringAnnotationValue
				value.values += e.fullyQualifiedName.segments.map[toFirstLower].join("/")
				path.values += value
				annotations += path
				val operation = createJvmOperation
				operation.annotations += createGetAnnotation(e)
				operation.annotations += createProducesRawTextAnnotation(e)
				operation.simpleName = "rawText"
				operation.returnType = tRefs.getTypeForName(typeof(String), e)
				members += operation
			]
		)
	}

	def private toEntityClass(Entity e, IAcceptor<JvmDeclaredType> acceptor) {
		acceptor.accept(
			e.toClass( e.fullyQualifiedName ) [
				documentation = e.documentation
				if (e.superType != null)
					superTypes += e.superType.cloneWithProxies
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
			]
		)
	}

	def createGetAnnotation(EObject context) {
		val getAnno = createJvmAnnotationReference
		getAnno.annotation = (tRefs.findDeclaredType("javax.ws.rs.GET", context) as JvmAnnotationType)
		getAnno
	}

	def createProducesRawTextAnnotation(EObject context) {
		val anno = createJvmAnnotationReference
		anno.annotation = (tRefs.findDeclaredType("javax.ws.rs.Produces", context) as JvmAnnotationType)
		val value = createJvmStringAnnotationValue
		value.values += "text/plain"
		anno.values += value
//		val value = createJvmEnumAnnotationValue
//		value.values += tRefs.findDeclaredType()
		anno
	}
}