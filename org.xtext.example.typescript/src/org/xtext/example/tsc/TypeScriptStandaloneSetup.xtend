/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.tsc


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TypeScriptStandaloneSetup extends TypeScriptStandaloneSetupGenerated {

	def static void doSetup() {
		new TypeScriptStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
