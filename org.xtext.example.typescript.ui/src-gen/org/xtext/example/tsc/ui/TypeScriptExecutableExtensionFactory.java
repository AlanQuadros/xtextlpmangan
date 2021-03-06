/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.tsc.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.typescript.ui.internal.TypescriptActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TypeScriptExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(TypescriptActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		TypescriptActivator activator = TypescriptActivator.getInstance();
		return activator != null ? activator.getInjector(TypescriptActivator.ORG_XTEXT_EXAMPLE_TSC_TYPESCRIPT) : null;
	}

}
