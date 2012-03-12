
package org.eclipse.xtext.services;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ServicesStandaloneSetup extends ServicesStandaloneSetupGenerated{

	public static void doSetup() {
		new ServicesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

