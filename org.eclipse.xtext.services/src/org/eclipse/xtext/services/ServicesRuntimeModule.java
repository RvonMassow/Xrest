/*
 * generated by Xtext
 */
package org.eclipse.xtext.services;

import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.services.scoping.ServicesScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class ServicesRuntimeModule extends org.eclipse.xtext.services.AbstractServicesRuntimeModule {
	
	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return ServicesScopeProvider.class;
	}

}
