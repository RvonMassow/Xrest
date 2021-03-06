package org.eclipse.xtext.services.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.services.services.Component
import org.eclipse.xtext.services.services.ParameterSegment
import org.eclipse.xtext.services.services.SimpleSegment
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class ServicesJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JvmTypes and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension TypesBuilderExtensions

	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
   	def dispatch void infer(Component component, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
   		
   		// Here you explain how your model is mapped to Java elements, by writing the actual translation code.
   		// An example based on the initial hello world example could look like this:
   		
   		acceptor.accept(component.toClass(component.packageName + "." +component.name)).initializeLater [
   			annotations += component.toAnnotation("javax.ws.rs.Path", (component.packageName.toLowerCase.replace(".","/") + "/" + component.name))
			for(interface : component.^implements) {
				superTypes += interface.cloneWithProxies
			}
			for(injectedMember: component.requires ){
				val name = { 
   					if(injectedMember.name != null)
   						injectedMember.name 
   					else 
   						injectedMember.type?.simpleName?.toFirstLower
   				}
   				members += injectedMember.toField( name
   					, injectedMember.type
   				) [
   					annotations += injectedMember.toAnnotation("javax.inject.Inject")
   				]
			}
   			for(service : component.services) {
   				members += service.toMethod(service.name.segments.join('$')[stringValue], service.type) [
   					if(service.get) {
						annotations += service.toAnnotation("javax.ws.rs.GET")	
						annotations += service.toAnnotation("javax.ws.rs.Produces", "application/json")
   					} else if(service.post) {
						annotations += service.toAnnotation("javax.ws.rs.POST")
						annotations += service.toAnnotation("javax.ws.rs.Consumes", "application/json, application/xml")
   					} else if(service.put) {
						annotations += service.toAnnotation("javax.ws.rs.PUT")
						annotations += service.toAnnotation("javax.ws.rs.Consumes", "application/json, application/xml")
   					} else if(service.delete) {
						annotations += service.toAnnotation("javax.ws.rs.DELETE")
   					}
   					annotations += if(!annotations.empty) service.toAnnotation("javax.ws.rs.Path", 
   						service.name.segments.join('/')[pathStringValue]
   					)
  					for (p : service.name.segments) {
  						if(p instanceof ParameterSegment)
							parameters += p.toParameter(p.stringValue, (p as ParameterSegment).param.parameterType) [
								annotations += service.toAnnotation("javax.ws.rs.PathParam", p.stringValue)
							]
					}
   					body = service.body
   				]
   			}
   		]
   	}

   	def dispatch stringValue(SimpleSegment ss) {
   		ss.name
   	}

	def dispatch stringValue(ParameterSegment ps) {
   		ps.param.name
   	}


   	def dispatch pathStringValue(SimpleSegment ss) {
   		ss.name
   	}

	def dispatch pathStringValue(ParameterSegment ps) {
   		'{' + ps.param.name + '}'
   	}
}
