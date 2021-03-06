/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.tsc.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.tsc.TypeScriptRuntimeModule;
import org.xtext.example.tsc.TypeScriptStandaloneSetup;
import org.xtext.example.tsc.ide.TypeScriptIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TypeScriptIdeSetup extends TypeScriptStandaloneSetup {
  @Override
  public Injector createInjector() {
    TypeScriptRuntimeModule _typeScriptRuntimeModule = new TypeScriptRuntimeModule();
    TypeScriptIdeModule _typeScriptIdeModule = new TypeScriptIdeModule();
    return Guice.createInjector(Modules2.mixin(_typeScriptRuntimeModule, _typeScriptIdeModule));
  }
}
