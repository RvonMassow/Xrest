package org.eclipse.xtext.services.validation;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.JavaReflectAccess;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.services.services.Component;
import org.eclipse.xtext.services.services.Service;
import org.eclipse.xtext.services.services.ServicesPackage;
import org.eclipse.xtext.validation.Check;
 

@SuppressWarnings("restriction")
public class ServicesJavaValidator extends AbstractServicesJavaValidator {

	@Inject
	private TypeReferences types;
	@Inject 
	private JavaReflectAccess jra;

	@Check
	public void checkComponentStartsWithCapital(Component component) {
		if (!Character.isUpperCase(component.getName().charAt(0))) {
			warning("Name should start with a capital", ServicesPackage.Literals.COMPONENT__NAME);
		}
	}

	@Check
	public void checkServiceArguments(Service service) {
		if(service.isService()) {
			JvmType type = service.getType().getType();
			if(type != null)
				if((List.class).isAssignableFrom(jra.getRawType(type))) {
					type = ((JvmGenericType)type).getTypeParameters().get(0);
				}
				if( type instanceof JvmAnnotationTarget) {
				JvmAnnotationTarget targetType = (JvmAnnotationTarget)type;
				if(!targetType.getAnnotations().contains(types.findDeclaredType("javax.xml.bind.annotation.XmlRootElement", service))) {
					error("Return type is not an XmlRootElement", ServicesPackage.Literals.SERVICE__TYPE);
				}
			}
		}
	}

}
