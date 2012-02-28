package org.eclipse.xtext.example.domainmodel.jvmmodel;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TypesBuilderExtensions {
  @Inject
  private JvmTypesBuilder builder;
  
  public JvmFormalParameter toParameter(final EObject sourceElement, final String name, final JvmTypeReference typeRef, final Procedure1<JvmFormalParameter> init) {
    JvmFormalParameter _xblockexpression = null;
    {
      JvmFormalParameter _parameter = this.builder.toParameter(sourceElement, name, typeRef);
      final JvmFormalParameter parameter = _parameter;
      boolean _and = false;
      boolean _notEquals = !ObjectExtensions.equals(name, null);
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _notEquals_1 = !ObjectExtensions.equals(init, null);
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        init.apply(parameter);
      }
      _xblockexpression = (parameter);
    }
    return _xblockexpression;
  }
  
  public JvmOperation toGetter(final EObject sourceElement, final String name, final JvmTypeReference typeRef, final Procedure1<JvmOperation> init) {
    JvmOperation _xblockexpression = null;
    {
      JvmOperation _getter = this.builder.toGetter(sourceElement, name, typeRef);
      final JvmOperation getter = _getter;
      boolean _and = false;
      boolean _notEquals = !ObjectExtensions.equals(name, null);
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _notEquals_1 = !ObjectExtensions.equals(init, null);
        _and = (_notEquals && _notEquals_1);
      }
      if (_and) {
        init.apply(getter);
      }
      _xblockexpression = (getter);
    }
    return _xblockexpression;
  }
}
