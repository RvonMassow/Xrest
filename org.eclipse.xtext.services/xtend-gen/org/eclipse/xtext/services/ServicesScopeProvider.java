package org.eclipse.xtext.services;

import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

@SuppressWarnings("all")
public class ServicesScopeProvider extends XbaseScopeProvider {
  public IScope createLocalVarScope(final IScope parentScope, final LocalVariableScopeContext scopeContext) {
    return null;
  }
}
