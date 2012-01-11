package org.eclipse.xtext.example.domainmodel.jvmmodel;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.JavaReflectAccess;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity;
import org.eclipse.xtext.example.domainmodel.domainmodel.Feature;
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation;
import org.eclipse.xtext.example.domainmodel.domainmodel.Property;
import org.eclipse.xtext.example.domainmodel.jvmmodel.DMControllerGenerator;
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
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DomainmodelJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypesFactory _typesFactory;
  
  @Inject
  private DMControllerGenerator _dMControllerGenerator;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private TypesBuilderExtensions _typesBuilderExtensions;
  
  @Inject
  private JavaReflectAccess _javaReflectAccess;
  
  protected void _infer(final Entity e, final IAcceptor<JvmDeclaredType> acceptor, final boolean prelinkingPhase) {
      JvmGenericType _entityClass = this.toEntityClass(e, acceptor);
      final JvmGenericType entityClass = _entityClass;
      acceptor.accept(entityClass);
      JvmGenericType _controllerClass = this._dMControllerGenerator.toControllerClass(e, entityClass, acceptor);
      final JvmGenericType controllerClass = _controllerClass;
      acceptor.accept(controllerClass);
  }
  
  private JvmGenericType toEntityClass(final Entity e, final IAcceptor<JvmDeclaredType> acceptor) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            String _documentation = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(e);
            DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createEntityAnnotation = DomainmodelJvmModelInferrer.this.createEntityAnnotation(e);
            CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _createEntityAnnotation);
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
                  return Boolean.valueOf(_operator_equals);
                }
              };
            boolean _exists = IterableExtensions.<Feature>exists(_features, _function);
            boolean _operator_not = BooleanExtensions.operator_not(_exists);
            if (_operator_not) {
              {
                JvmTypeReference _typeForName = DomainmodelJvmModelInferrer.this._typeReferences.getTypeForName(int.class, e);
                final JvmTypeReference intType = _typeForName;
                EList<JvmMember> _members = it.getMembers();
                final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
                    public void apply(final JvmField it) {
                      EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                      ArrayList<JvmAnnotationReference> _createIdAnnotation = DomainmodelJvmModelInferrer.this.createIdAnnotation(e);
                      CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _createIdAnnotation);
                    }
                  };
                JvmField _field = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toField(it, id, intType, _function_1);
                CollectionExtensions.<JvmField>operator_add(_members, _field);
                EList<JvmMember> _members_1 = it.getMembers();
                JvmOperation _setter = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toSetter(it, id, intType);
                CollectionExtensions.<JvmOperation>operator_add(_members_1, _setter);
              }
            }
            DomainmodelJvmModelInferrer.this.generateFeatures(it, e);
          }
        }
      };
    JvmGenericType _class = this._jvmTypesBuilder.toClass(e, _fullyQualifiedName, _function);
    return _class;
  }
  
  public void generateFeatures(final JvmGenericType it, final Entity e) {
    EList<Feature> _features = e.getFeatures();
    for (final Feature f : _features) {
      boolean matched = false;
      if (!matched) {
        if (f instanceof Property) {
          final Property _property = (Property)f;
          matched=true;
          {
            EList<JvmMember> _members = it.getMembers();
            String _name = _property.getName();
            JvmTypeReference _type = _property.getType();
            JvmField _field = this._jvmTypesBuilder.toField(_property, _name, _type);
            CollectionExtensions.<JvmField>operator_add(_members, _field);
            EList<JvmMember> _members_1 = it.getMembers();
            String _name_1 = _property.getName();
            JvmTypeReference _type_1 = _property.getType();
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  JvmTypeReference _returnType = it.getReturnType();
                  JvmType _type = _returnType.getType();
                  Class<? extends Object> _rawType = DomainmodelJvmModelInferrer.this._javaReflectAccess.getRawType(_type);
                  boolean _isAssignableFrom = java.util.List.class.isAssignableFrom(_rawType);
                  if (_isAssignableFrom) {
                    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                    JvmAnnotationReference _createOneToMany = DomainmodelJvmModelInferrer.this.createOneToMany(e);
                    CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _createOneToMany);
                  }
                }
              };
            JvmOperation _getter = this._typesBuilderExtensions.toGetter(_property, _name_1, _type_1, _function);
            CollectionExtensions.<JvmOperation>operator_add(_members_1, _getter);
            EList<JvmMember> _members_2 = it.getMembers();
            String _name_2 = _property.getName();
            JvmTypeReference _type_2 = _property.getType();
            JvmOperation _setter = this._jvmTypesBuilder.toSetter(_property, _name_2, _type_2);
            CollectionExtensions.<JvmOperation>operator_add(_members_2, _setter);
          }
        }
      }
      if (!matched) {
        if (f instanceof Operation) {
          final Operation _operation = (Operation)f;
          matched=true;
          EList<JvmMember> _members = it.getMembers();
          String _name = _operation.getName();
          JvmTypeReference _type = _operation.getType();
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                {
                  String _documentation = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(_operation);
                  DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                  EList<JvmFormalParameter> _params = _operation.getParams();
                  for (final JvmFormalParameter p : _params) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    String _name = p.getName();
                    JvmTypeReference _parameterType = p.getParameterType();
                    JvmFormalParameter _parameter = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
                    CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  }
                  XExpression _body = _operation.getBody();
                  DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                }
              }
            };
          JvmOperation _method = this._jvmTypesBuilder.toMethod(_operation, _name, _type, _function);
          CollectionExtensions.<JvmOperation>operator_add(_members, _method);
        }
      }
    }
  }
  
  public JvmAnnotationReference createOneToMany(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.persistence.OneToMany");
    return _annotation;
  }
  
  public ArrayList<JvmAnnotationReference> createIdAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.persistence.Id");
    ArrayList<JvmAnnotationReference> _newArrayList = Lists.<JvmAnnotationReference>newArrayList(_annotation);
    return _newArrayList;
  }
  
  public JvmAnnotationReference createEntityAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.persistence.Entity");
    return _annotation;
  }
  
  public void infer(final EObject e, final IAcceptor<JvmDeclaredType> acceptor, final boolean prelinkingPhase) {
    if (e instanceof Entity) {
      _infer((Entity)e, acceptor, prelinkingPhase);
    } else if (e != null) {
      _infer(e, acceptor, prelinkingPhase);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e, acceptor, prelinkingPhase).toString());
    }
  }
}
