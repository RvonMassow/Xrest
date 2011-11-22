package org.eclipse.xtext.example.domainmodel.jvmmodel;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity;
import org.eclipse.xtext.example.domainmodel.domainmodel.Feature;
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation;
import org.eclipse.xtext.example.domainmodel.domainmodel.Property;
import org.eclipse.xtext.example.domainmodel.jvmmodel.TypesBuilderExtensions;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DomainmodelJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private TypesBuilderExtensions _typesBuilderExtensions;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypesFactory _typesFactory;
  
  @Inject
  private TypeReferences tRefs;
  
  protected void _infer(final Entity e, final IAcceptor<JvmDeclaredType> acceptor, final boolean prelinkingPhase) {
      JvmGenericType _entityClass = this.toEntityClass(e, acceptor);
      final JvmGenericType entityClass = _entityClass;
      acceptor.accept(entityClass);
      JvmGenericType _controllerClass = this.toControllerClass(e, entityClass, acceptor);
      final JvmGenericType controllerClass = _controllerClass;
      acceptor.accept(controllerClass);
  }
  
  private JvmGenericType toControllerClass(final Entity e, final JvmGenericType forType, final IAcceptor acceptor) {
    JvmGenericType _xifexpression = null;
    String _name = e.getName();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
    if (_operator_notEquals) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      String _string = _fullyQualifiedName==null?(String)null:_fullyQualifiedName.toString();
      String _operator_plus = StringExtensions.operator_plus(_string, "Controller");
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              QualifiedName _fullyQualifiedName_1 = DomainmodelJvmModelInferrer.this._iQualifiedNameProvider.getFullyQualifiedName(e);
              List<String> _segments = _fullyQualifiedName_1.getSegments();
              final Function1<String,String> _function = new Function1<String,String>() {
                  public String apply(final String it) {
                    String _lowerCase = it.toLowerCase();
                    return _lowerCase;
                  }
                };
              List<String> _map = ListExtensions.<String, String>map(_segments, _function);
              String _join = IterableExtensions.join(_map, "/");
              JvmAnnotationReference _annotation = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toAnnotation(e, "javax.ws.rs.Path", _join);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              EList<JvmMember> _members = it.getMembers();
              JvmOperation _createJSONById = DomainmodelJvmModelInferrer.this.createJSONById(forType, e);
              CollectionExtensions.<JvmOperation>operator_add(_members, _createJSONById);
            }
          }
        };
      JvmGenericType _class = this._jvmTypesBuilder.toClass(e, _operator_plus, _function);
      _xifexpression = _class;
    }
    return _xifexpression;
  }
  
  private JvmOperation createJSONById(final JvmGenericType t, final EObject e) {
    JvmOperation _xblockexpression = null;
    {
      JvmParameterizedTypeReference _createTypeRef = this.tRefs.createTypeRef(t);
      final JvmParameterizedTypeReference ref = _createTypeRef;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("get");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      _builder.append("AsJSON");
      String _string = _builder.toString();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              it.setVisibility(JvmVisibility.PUBLIC);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _createGetAnnotation = DomainmodelJvmModelInferrer.this.createGetAnnotation(e);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _createGetAnnotation);
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              JvmAnnotationReference _createProducesAnnotation = DomainmodelJvmModelInferrer.this.createProducesAnnotation(e, "application/json");
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _createProducesAnnotation);
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeForName = DomainmodelJvmModelInferrer.this.tRefs.getTypeForName(int.class, e);
              final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
                  public void apply(final JvmFormalParameter it) {
                    EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
                    JvmAnnotationReference _createPathParamAnnotation = DomainmodelJvmModelInferrer.this.createPathParamAnnotation(e, "id");
                    CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_2, _createPathParamAnnotation);
                  }
                };
              JvmFormalParameter _parameter = DomainmodelJvmModelInferrer.this._typesBuilderExtensions.toParameter(e, "id", _typeForName, _function);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
            }
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, ref, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  private JvmGenericType toEntityClass(final Entity e, final IAcceptor<JvmDeclaredType> acceptor) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            String _documentation = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(e);
            DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            JvmParameterizedTypeReference _superType = e.getSuperType();
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_superType, null);
            if (_operator_notEquals) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmParameterizedTypeReference _superType_1 = e.getSuperType();
              JvmTypeReference _cloneWithProxies = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(_superType_1);
              CollectionExtensions.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
            }
            final String id = "id";
            EList<Feature> _features = e.getFeatures();
            final Function1<Feature,Boolean> _function = new Function1<Feature,Boolean>() {
                public Boolean apply(final Feature it) {
                  String _name = it.getName();
                  boolean _operator_equals = ObjectExtensions.operator_equals(_name, id);
                  return ((Boolean)_operator_equals);
                }
              };
            boolean _exists = IterableExtensions.<Feature>exists(_features, _function);
            boolean _operator_not = BooleanExtensions.operator_not(_exists);
            if (_operator_not) {
              {
                JvmTypeReference _typeForName = DomainmodelJvmModelInferrer.this.tRefs.getTypeForName(int.class, e);
                final JvmTypeReference intType = _typeForName;
                EList<JvmMember> _members = it.getMembers();
                JvmField _field = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toField(it, id, intType);
                CollectionExtensions.<JvmField>operator_add(_members, _field);
                EList<JvmMember> _members_1 = it.getMembers();
                JvmOperation _getter = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toGetter(it, id, intType);
                CollectionExtensions.<JvmOperation>operator_add(_members_1, _getter);
                EList<JvmMember> _members_2 = it.getMembers();
                JvmOperation _setter = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toSetter(it, id, intType);
                CollectionExtensions.<JvmOperation>operator_add(_members_2, _setter);
              }
            }
            EList<Feature> _features_1 = e.getFeatures();
            for (final Feature f : _features_1) {
              boolean matched = false;
              if (!matched) {
                if (f instanceof Property) {
                  matched=true;
                  {
                    EList<JvmMember> _members_3 = it.getMembers();
                    String _name = ((Property)f).getName();
                    JvmTypeReference _type = ((Property)f).getType();
                    JvmField _field_1 = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toField(((Property)f), _name, _type);
                    CollectionExtensions.<JvmField>operator_add(_members_3, _field_1);
                    EList<JvmMember> _members_4 = it.getMembers();
                    String _name_1 = ((Property)f).getName();
                    JvmTypeReference _type_1 = ((Property)f).getType();
                    JvmOperation _getter_1 = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toGetter(((Property)f), _name_1, _type_1);
                    CollectionExtensions.<JvmOperation>operator_add(_members_4, _getter_1);
                    EList<JvmMember> _members_5 = it.getMembers();
                    String _name_2 = ((Property)f).getName();
                    JvmTypeReference _type_2 = ((Property)f).getType();
                    JvmOperation _setter_1 = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toSetter(((Property)f), _name_2, _type_2);
                    CollectionExtensions.<JvmOperation>operator_add(_members_5, _setter_1);
                  }
                }
              }
              if (!matched) {
                if (f instanceof Operation) {
                  matched=true;
                  EList<JvmMember> _members_6 = it.getMembers();
                  String _name_3 = ((Operation)f).getName();
                  JvmTypeReference _type_3 = ((Operation)f).getType();
                  final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        {
                          String _documentation_1 = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(((Operation)f));
                          DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation_1);
                          EList<JvmFormalParameter> _params = ((Operation)f).getParams();
                          for (final JvmFormalParameter p : _params) {
                            EList<JvmFormalParameter> _parameters = it.getParameters();
                            String _name_4 = p.getName();
                            JvmTypeReference _parameterType = p.getParameterType();
                            JvmFormalParameter _parameter = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name_4, _parameterType);
                            CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
                          }
                          XExpression _body = ((Operation)f).getBody();
                          DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                        }
                      }
                    };
                  JvmOperation _method = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toMethod(((Operation)f), _name_3, _type_3, _function_1);
                  CollectionExtensions.<JvmOperation>operator_add(_members_6, _method);
                }
              }
            }
          }
        }
      };
    JvmGenericType _class = this._jvmTypesBuilder.toClass(e, _fullyQualifiedName, _function);
    return _class;
  }
  
  public JvmAnnotationReference createGetAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.GET");
    return _annotation;
  }
  
  public JvmAnnotationReference createPathParamAnnotation(final EObject it, final String name) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.PathParam", name);
    return _annotation;
  }
  
  public JvmAnnotationReference createProducesAnnotation(final EObject it, final String mime) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.Produces", mime);
    return _annotation;
  }
  
  public void infer(final EObject e, final IAcceptor<JvmDeclaredType> acceptor, final boolean prelinkingPhase) {
    if (e instanceof Entity) {
      _infer((Entity)e, acceptor, prelinkingPhase);
    } else {
      _infer(e, acceptor, prelinkingPhase);
    }
  }
}
