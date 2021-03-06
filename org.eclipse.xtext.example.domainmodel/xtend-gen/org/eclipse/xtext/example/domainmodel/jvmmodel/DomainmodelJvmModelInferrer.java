package org.eclipse.xtext.example.domainmodel.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity;
import org.eclipse.xtext.example.domainmodel.domainmodel.Feature;
import org.eclipse.xtext.example.domainmodel.domainmodel.Generate;
import org.eclipse.xtext.example.domainmodel.domainmodel.Property;
import org.eclipse.xtext.example.domainmodel.domainmodel.Validate;
import org.eclipse.xtext.example.domainmodel.jvmmodel.DMControllerGenerator;
import org.eclipse.xtext.example.domainmodel.jvmmodel.DMDaoGenerator;
import org.eclipse.xtext.example.domainmodel.jvmmodel.TypesBuilderExtensions;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DomainmodelJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private DMControllerGenerator _dMControllerGenerator;
  
  @Inject
  private DMDaoGenerator _dMDaoGenerator;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private TypesBuilderExtensions _typesBuilderExtensions;
  
  protected void _infer(final Entity e, final IJvmDeclaredTypeAcceptor acceptor, final boolean prelinkingPhase) {
    final JvmGenericType entityClass = this.toEntityClass(e, acceptor, prelinkingPhase);
    this._dMControllerGenerator.toControllerClass(e, entityClass, acceptor);
    this._dMDaoGenerator.toDaoClass(e, entityClass, acceptor);
  }
  
  private JvmGenericType toEntityClass(final Entity e, final IJvmDeclaredTypeAcceptor acceptor, final boolean prelinkingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      final JvmGenericType clazz = this._jvmTypesBuilder.toClass(e, _fullyQualifiedName);
      IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(clazz);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            String _documentation = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(e);
            DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createEntityAnnotation = DomainmodelJvmModelInferrer.this.createEntityAnnotation(e);
            DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createEntityAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createXmlRootElement = DomainmodelJvmModelInferrer.this.createXmlRootElement(e);
            DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _createXmlRootElement);
            JvmParameterizedTypeReference _superType = e.getSuperType();
            boolean _notEquals = (!Objects.equal(_superType, null));
            if (_notEquals) {
              EList<JvmTypeReference> _superTypes = it.getSuperTypes();
              JvmParameterizedTypeReference _superType_1 = e.getSuperType();
              JvmTypeReference _cloneWithProxies = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.cloneWithProxies(_superType_1);
              DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _cloneWithProxies);
            }
            final String id = "id";
            EList<Feature> _features = e.getFeatures();
            final Function1<Feature,Boolean> _function = new Function1<Feature,Boolean>() {
                public Boolean apply(final Feature it) {
                  String _name = it.getName();
                  boolean _equals = Objects.equal(_name, id);
                  return Boolean.valueOf(_equals);
                }
              };
            boolean _exists = IterableExtensions.<Feature>exists(_features, _function);
            boolean _not = (!_exists);
            if (_not) {
              final JvmTypeReference intType = DomainmodelJvmModelInferrer.this._typeReferences.getTypeForName(int.class, e);
              EList<JvmMember> _members = it.getMembers();
              final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
                  public void apply(final JvmField it) {
                    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                    ArrayList<JvmAnnotationReference> _createIdAnnotations = DomainmodelJvmModelInferrer.this.createIdAnnotations(e);
                    DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createIdAnnotations);
                  }
                };
              JvmField _field = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toField(it, id, intType, _function_1);
              DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
              EList<JvmMember> _members_1 = it.getMembers();
              JvmOperation _getter = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toGetter(it, id, intType);
              DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _getter);
              EList<JvmMember> _members_2 = it.getMembers();
              JvmOperation _setter = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.toSetter(it, id, intType);
              DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _setter);
            }
            DomainmodelJvmModelInferrer.this.generateFeatures(it, e, prelinkingPhase);
          }
        };
      _accept.initializeLater(_function);
      this._jvmTypesBuilder.<JvmGenericType>associate(e, clazz);
      _xblockexpression = (clazz);
    }
    return _xblockexpression;
  }
  
  public void generateFeatures(final JvmGenericType it, final Entity e, final boolean prelinkingPhase) {
    EList<Feature> _features = e.getFeatures();
    for (final Feature f : _features) {
      boolean _matched = false;
      if (!_matched) {
        if (f instanceof Property) {
          final Property _property = (Property)f;
          _matched=true;
          EList<JvmMember> _members = it.getMembers();
          String _name = _property.getName();
          JvmTypeReference _type = _property.getType();
          JvmField _field = this._jvmTypesBuilder.toField(_property, _name, _type);
          this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
          EList<JvmMember> _members_1 = it.getMembers();
          String _name_1 = _property.getName();
          JvmTypeReference _type_1 = _property.getType();
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                Property _mappedBy = _property.getMappedBy();
                boolean _notEquals = (!Objects.equal(_mappedBy, null));
                if (_notEquals) {
                  final JvmAnnotationReference anno = DomainmodelJvmModelInferrer.this.createOneToMany(e);
                  final JvmStringAnnotationValue annoVal = TypesFactory.eINSTANCE.createJvmStringAnnotationValue();
                  JvmAnnotationType _annotation = anno.getAnnotation();
                  EList<JvmMember> _members = _annotation.getMembers();
                  final Function1<JvmMember,Boolean> _function = new Function1<JvmMember,Boolean>() {
                      public Boolean apply(final JvmMember it) {
                        String _simpleName = it.getSimpleName();
                        boolean _equals = Objects.equal(_simpleName, "mappedBy");
                        return Boolean.valueOf(_equals);
                      }
                    };
                  JvmMember _findFirst = IterableExtensions.<JvmMember>findFirst(_members, _function);
                  annoVal.setOperation(((JvmOperation) _findFirst));
                  EList<String> _values = annoVal.getValues();
                  Property _mappedBy_1 = _property.getMappedBy();
                  String _name = _mappedBy_1.getName();
                  DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<String>operator_add(_values, _name);
                  EList<JvmAnnotationValue> _values_1 = anno.getValues();
                  DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<JvmStringAnnotationValue>operator_add(_values_1, annoVal);
                  EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                  DomainmodelJvmModelInferrer.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, anno);
                }
              }
            };
          JvmOperation _getter = this._typesBuilderExtensions.toGetter(_property, _name_1, _type_1, _function);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _getter);
          EList<JvmMember> _members_2 = it.getMembers();
          String _name_2 = _property.getName();
          JvmTypeReference _type_2 = _property.getType();
          JvmOperation _setter = this._jvmTypesBuilder.toSetter(_property, _name_2, _type_2);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _setter);
        }
      }
      if (!_matched) {
        if (f instanceof Generate) {
          final Generate _generate = (Generate)f;
          _matched=true;
          EList<JvmMember> _members = it.getMembers();
          String _name = _generate.getName();
          JvmTypeReference _typeForName = this._typeReferences.getTypeForName(void.class, e);
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                String _documentation = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(_generate);
                DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                XExpression _body = _generate.getBody();
                DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
              }
            };
          JvmOperation _method = this._jvmTypesBuilder.toMethod(_generate, _name, _typeForName, _function);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        }
      }
      if (!_matched) {
        if (f instanceof Validate) {
          final Validate _validate = (Validate)f;
          _matched=true;
          EList<JvmMember> _members = it.getMembers();
          String _name = _validate.getName();
          JvmTypeReference _typeForName = this._typeReferences.getTypeForName(boolean.class, e);
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                String _documentation = DomainmodelJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(_validate);
                DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
                XExpression _body = _validate.getBody();
                DomainmodelJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
              }
            };
          JvmOperation _method = this._jvmTypesBuilder.toMethod(_validate, _name, _typeForName, _function);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
        }
      }
    }
  }
  
  public JvmAnnotationReference createXmlRootElement(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.xml.bind.annotation.XmlRootElement");
    return _annotation;
  }
  
  public JvmAnnotationReference createOneToMany(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.persistence.OneToMany");
    return _annotation;
  }
  
  public JvmAnnotationReference createManyToOne(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.persistence.ManyToOne");
    return _annotation;
  }
  
  public ArrayList<JvmAnnotationReference> createIdAnnotations(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.persistence.GeneratedValue");
    JvmAnnotationReference _annotation_1 = this._jvmTypesBuilder.toAnnotation(it, "javax.persistence.Id");
    ArrayList<JvmAnnotationReference> _newArrayList = Lists.<JvmAnnotationReference>newArrayList(_annotation, _annotation_1);
    return _newArrayList;
  }
  
  public JvmAnnotationReference createEntityAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.persistence.Entity");
    return _annotation;
  }
  
  public void infer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean prelinkingPhase) {
    if (e instanceof Entity) {
      _infer((Entity)e, acceptor, prelinkingPhase);
      return;
    } else if (e != null) {
      _infer(e, acceptor, prelinkingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e, acceptor, prelinkingPhase).toString());
    }
  }
}
