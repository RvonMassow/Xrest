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
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.services.jvmmodel.TypesBuilderExtensions;
import org.eclipse.xtext.services.services.Component;
import org.eclipse.xtext.services.services.ParameterSegment;
import org.eclipse.xtext.services.services.Path;
import org.eclipse.xtext.services.services.PathSegment;
import org.eclipse.xtext.services.services.RequireDeclaration;
import org.eclipse.xtext.services.services.Service;
import org.eclipse.xtext.services.services.SimpleSegment;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
  private TypesBuilderExtensions _typesBuilderExtensions;
  
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
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          String _packageName = component.getPackageName();
          String _lowerCase = _packageName.toLowerCase();
          String _replace = _lowerCase.replace(".", "/");
          String _plus = (_replace + "/");
          String _name = component.getName();
          String _plus_1 = (_plus + _name);
          JvmAnnotationReference _annotation = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(component, "javax.ws.rs.Path", _plus_1);
          ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
          EList<JvmParameterizedTypeReference> _implements = component.getImplements();
          for (final JvmParameterizedTypeReference interface_ : _implements) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmTypeReference _cloneWithProxies = ServicesJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(interface_);
            ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
          }
          EList<RequireDeclaration> _requires = component.getRequires();
          for (final RequireDeclaration injectedMember : _requires) {
            {
              String _xifexpression = null;
              String _name_1 = injectedMember.getName();
              boolean _notEquals = (!Objects.equal(_name_1, null));
              if (_notEquals) {
                String _name_2 = injectedMember.getName();
                _xifexpression = _name_2;
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
            Path _name_1 = service.getName();
            EList<PathSegment> _segments = _name_1.getSegments();
            final Function1<PathSegment,String> _function = new Function1<PathSegment,String>() {
                public String apply(final PathSegment it) {
                  String _stringValue = ServicesJvmModelInferrer.this.stringValue(it);
                  return _stringValue;
                }
              };
            String _join = IterableExtensions.<PathSegment>join(_segments, "$", _function);
            JvmTypeReference _type = service.getType();
            final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  boolean _isGet = service.isGet();
                  if (_isGet) {
                    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                    JvmAnnotationReference _annotation = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.GET");
                    ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                    EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
                    JvmAnnotationReference _annotation_1 = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.Produces", "application/json");
                    ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
                  } else {
                    boolean _isPost = service.isPost();
                    if (_isPost) {
                      EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
                      JvmAnnotationReference _annotation_2 = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.POST");
                      ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_2, _annotation_2);
                      EList<JvmAnnotationReference> _annotations_3 = it.getAnnotations();
                      JvmAnnotationReference _annotation_3 = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.Consumes", "application/json, application/xml");
                      ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_3, _annotation_3);
                    } else {
                      boolean _isPut = service.isPut();
                      if (_isPut) {
                        EList<JvmAnnotationReference> _annotations_4 = it.getAnnotations();
                        JvmAnnotationReference _annotation_4 = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.PUT");
                        ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_4, _annotation_4);
                        EList<JvmAnnotationReference> _annotations_5 = it.getAnnotations();
                        JvmAnnotationReference _annotation_5 = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.Consumes", "application/json, application/xml");
                        ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_5, _annotation_5);
                      } else {
                        boolean _isDelete = service.isDelete();
                        if (_isDelete) {
                          EList<JvmAnnotationReference> _annotations_6 = it.getAnnotations();
                          JvmAnnotationReference _annotation_6 = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.DELETE");
                          ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_6, _annotation_6);
                        }
                      }
                    }
                  }
                  EList<JvmAnnotationReference> _annotations_7 = it.getAnnotations();
                  JvmAnnotationReference _xifexpression = null;
                  EList<JvmAnnotationReference> _annotations_8 = it.getAnnotations();
                  boolean _isEmpty = _annotations_8.isEmpty();
                  boolean _not = (!_isEmpty);
                  if (_not) {
                    Path _name = service.getName();
                    EList<PathSegment> _segments = _name.getSegments();
                    final Function1<PathSegment,String> _function = new Function1<PathSegment,String>() {
                        public String apply(final PathSegment it) {
                          String _pathStringValue = ServicesJvmModelInferrer.this.pathStringValue(it);
                          return _pathStringValue;
                        }
                      };
                    String _join = IterableExtensions.<PathSegment>join(_segments, "/", _function);
                    JvmAnnotationReference _annotation_7 = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.Path", _join);
                    _xifexpression = _annotation_7;
                  }
                  ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_7, _xifexpression);
                  Path _name_1 = service.getName();
                  EList<PathSegment> _segments_1 = _name_1.getSegments();
                  for (final PathSegment p : _segments_1) {
                    if ((p instanceof ParameterSegment)) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      String _stringValue = ServicesJvmModelInferrer.this.stringValue(p);
                      JvmFormalParameter _param = ((ParameterSegment) p).getParam();
                      JvmTypeReference _parameterType = _param.getParameterType();
                      final Procedure1<JvmFormalParameter> _function_1 = new Procedure1<JvmFormalParameter>() {
                          public void apply(final JvmFormalParameter it) {
                            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                            String _stringValue = ServicesJvmModelInferrer.this.stringValue(p);
                            JvmAnnotationReference _annotation = ServicesJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(service, "javax.ws.rs.PathParam", _stringValue);
                            ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
                          }
                        };
                      JvmFormalParameter _parameter = ServicesJvmModelInferrer.this._typesBuilderExtensions.toParameter(p, _stringValue, _parameterType, _function_1);
                      ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    }
                  }
                  XExpression _body = service.getBody();
                  ServicesJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                }
              };
            JvmOperation _method = ServicesJvmModelInferrer.this._jvmTypesBuilder.toMethod(service, _join, _type, _function_1);
            ServicesJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          }
        }
      };
    _accept.initializeLater(_function);
  }
  
  protected String _stringValue(final SimpleSegment ss) {
    String _name = ss.getName();
    return _name;
  }
  
  protected String _stringValue(final ParameterSegment ps) {
    JvmFormalParameter _param = ps.getParam();
    String _name = _param.getName();
    return _name;
  }
  
  protected String _pathStringValue(final SimpleSegment ss) {
    String _name = ss.getName();
    return _name;
  }
  
  protected String _pathStringValue(final ParameterSegment ps) {
    JvmFormalParameter _param = ps.getParam();
    String _name = _param.getName();
    String _plus = ("{" + _name);
    String _plus_1 = (_plus + "}");
    return _plus_1;
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
  
  public String stringValue(final PathSegment ps) {
    if (ps instanceof ParameterSegment) {
      return _stringValue((ParameterSegment)ps);
    } else if (ps instanceof SimpleSegment) {
      return _stringValue((SimpleSegment)ps);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ps).toString());
    }
  }
  
  public String pathStringValue(final PathSegment ps) {
    if (ps instanceof ParameterSegment) {
      return _pathStringValue((ParameterSegment)ps);
    } else if (ps instanceof SimpleSegment) {
      return _pathStringValue((SimpleSegment)ps);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ps).toString());
    }
  }
}
