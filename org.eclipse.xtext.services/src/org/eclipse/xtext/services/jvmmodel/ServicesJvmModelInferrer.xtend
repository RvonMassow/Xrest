package org.eclipse.xtext.services.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.services.services.Component
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider
import java.util.Map
import org.eclipse.xtext.common.types.JvmTypeReference

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
	@Inject extension XbaseTypeProvider types

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
   		// An example based on the initial hellow world example could look like this:
   		
   		acceptor.accept(component.toClass(component.packageName + "." +component.name)).initializeLater [
			val injectedMembers = <JvmTypeReference>newHashSet()
   			for(service : component.services) {
   				members += service.toMethod(service.name, service.type) [
   					if(service.get) {
						service.toAnnotation("javax.ws.rs.GET")	
   					} else if(service.post) {
						service.toAnnotation("javax.ws.rs.POST")
   					}
  					for (p : service.params) {
						parameters += p.toParameter(p.name, p.parameterType)
					}
					injectedMembers += service.uses
   					body = service.body
   				]
   			}
   			for(injectedMember : injectedMembers) {
   				members += injectedMember.toField(injectedMember.simpleName.toFirstLower, injectedMember) [
   					annotations += injectedMember.toAnnotation("javax.inject.Inject")
   				]
   			}
   		]
   	}
}