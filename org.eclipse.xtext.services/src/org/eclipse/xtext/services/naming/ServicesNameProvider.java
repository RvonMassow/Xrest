package org.eclipse.xtext.services.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.services.services.Component;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

import com.google.inject.Inject;

public class ServicesNameProvider extends XbaseQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if(obj instanceof Component) {
			Component c = (Component) obj;
			qualifiedNameConverter.toQualifiedName(c.getPackageName() + c.getName());
		}
		return super.getFullyQualifiedName(obj);
	}
}
