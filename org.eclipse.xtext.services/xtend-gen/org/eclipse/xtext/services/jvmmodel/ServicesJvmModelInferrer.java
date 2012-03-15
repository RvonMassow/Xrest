package org.eclipse.xtext.services.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.services.services.Component;
import org.eclipse.xtext.services.services.RequireDeclaration;
import org.eclipse.xtext.services.services.Service;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class ServicesJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JvmTypes and their members.
   */
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private XbaseTypeProvider types;
  
  /**
   * Is called for each instance of the first argument's type contained in a resource.
   * 
   * @param element - the model to create one or more JvmDeclaredTypes from.
   * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
   *                   current resource.
   * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
   *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
   */
  protected void _infer(final Component component, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    String _packageName = component.getPackageName();
    String _plus = (_packageName + ".");
    String _name = component.getName();
    String _plus_1 = (_plus + _name);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(component, _plus_1);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<RequireDeclaration> _requires = component.getRequires();
          for (final RequireDeclaration injectedMember : _requires) {
            {
              String _xifexpression = null;
              String _name = injectedMember.getName();
              boolean _notEquals = (!Objects.equal(_name, null));
              if (_notEquals) {
                String _name_1 = injectedMember.getName();
                _xifexpression = _name_1;
              } else {
                JvmTypeReference _type = injectedMember.getType();
                String _simpleName = _type==null?(String)null:_type.getSimpleName();
                String _firstLower = _simpleName==null?(String)null:StringExtensions.toFirstLower(_simpleName);
                _xifexpression = _firstLower;
              }
              final String name = _xifexpression;
              EList<JvmMember> _members = it.getMembers();
              JvmTypeReference _type_1 = injectedMember.getType();
              final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
                  public void apply(final JvmField it) {
                    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                    JvmAnnotationReference _annotation = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(injectedMember, "javax.inject.Inject");
                    ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                  }
                };
              JvmField _field = ServicesJvmModelInferrer.this._jvmTypesBuilder.toField(injectedMember, name, _type_1, _function);
              ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
            }
          }
          EList<Service> _services = component.getServices();
          for (final Service service : _services) {
            EList<JvmMember> _members = it.getMembers();
            String _name = service.getName();
            JvmTypeReference _type = service.getType();
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  boolean _isGet = service.isGet();
                  if (_isGet) {
                    ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.GET");
                  } else {
                    boolean _isPost = service.isPost();
                    if (_isPost) {
                      ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.POST");
                    }
                  }
                  EList<JvmFormalParameter> _params = service.getParams();
                  for (final JvmFormalParameter p : _params) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    String _name = p.getName();
                    JvmTypeReference _parameterType = p.getParameterType();
                    JvmFormalParameter _parameter = ServicesJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
                    ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  }
                  XExpression _body = service.getBody();
                  ServicesJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                }
              };
            JvmOperation _method = ServicesJvmModelInferrer.this._jvmTypesBuilder.toMethod(service, _name, _type, _function);
            ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          }
        }
      };
    _accept.initializeLater(_function);
  }
  
  public void infer(final EObject component, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    if (component instanceof Component) {
      _infer((Component)component, acceptor, isPrelinkingPhase);
      return;
    } else if (component != null) {
      _infer(component, acceptor, isPrelinkingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(component, acceptor, isPrelinkingPhase).toString());
    }
  }
}
