/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.tsc.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.typescript.ui.internal.TypescriptActivator;

public class TypeScriptUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TypescriptActivator.getInstance().getInjector("org.xtext.example.tsc.TypeScript");
	}

}