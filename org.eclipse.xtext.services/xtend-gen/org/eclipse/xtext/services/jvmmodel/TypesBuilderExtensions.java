package org.eclipse.xtext.services.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class TypesBuilderExtensions {
  @Inject
  private JvmTypesBuilder builder;
  
  public JvmFormalParameter toParameter(final EObject sourceElement, final String name, final JvmTypeReference typeRef, final Procedure1<JvmFormalParameter> init) {
    JvmFormalParameter _xblockexpression = null;
    {
      final JvmFormalParameter parameter = this.builder.toParameter(sourceElement, name, typeRef);
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(name, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _notEquals_1 = (!Objects.equal(init, null));
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
      final JvmOperation getter = this.builder.toGetter(sourceElement, name, typeRef);
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(name, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _notEquals_1 = (!Objects.equal(init, null));
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
