/*
* generated by Xtext
*/
package org.eclipse.xtext.services;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ServicesUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.eclipse.xtext.services.ui.internal.ServicesActivator.getInstance().getInjector("org.eclipse.xtext.services.Services");
	}
	
}
