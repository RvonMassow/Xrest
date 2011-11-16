package org.eclipse.xtext.example.domainmodel.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation
import org.eclipse.xtext.example.domainmodel.domainmodel.Property
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class DomainmodelJvmModelInferrer extends AbstractModelInferrer {
	
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypesFactory
	@Inject TypeReferences tRefs

	def dispatch infer(Entity e, IAcceptor<JvmDeclaredType> acceptor, boolean prelinkingPhase) {
		acceptor.accept(
			e.toClass( e.fullyQualifiedName ) [
				documentation = e.documentation
				if (e.superType != null)
					superTypes += e.superType.cloneWithProxies
				val path = createJvmAnnotationReference
				path.annotation = (tRefs.findDeclaredType("javax.ws.rs.Path", e) as JvmAnnotationType)
				val value = createJvmStringAnnotationValue
				value.values += e.fullyQualifiedName.segments.join("/")
				path.values += value
				annotations += path
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
	
}