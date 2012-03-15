package org.eclipse.xtext.example.domainmodel.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity;
import org.eclipse.xtext.example.domainmodel.domainmodel.Feature;
import org.eclipse.xtext.example.domainmodel.domainmodel.Operation;
import org.eclipse.xtext.example.domainmodel.domainmodel.Property;
import org.eclipse.xtext.example.domainmodel.jvmmodel.TypesBuilderExtensions;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DMControllerGenerator {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypesBuilderExtensions _typesBuilderExtensions;
  
  @Inject
  private TypeReferences _typeReferences;
  
  public void toControllerClass(final Entity e, final JvmGenericType forType, final IJvmDeclaredTypeAcceptor acceptor) {
    String _name = e.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      String _string = _fullyQualifiedName.toString();
      String _plus = (_string + "Controller");
      JvmGenericType _class = this._jvmTypesBuilder.toClass(e, _plus);
      IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            QualifiedName _fullyQualifiedName = DMControllerGenerator.this._iQualifiedNameProvider.getFullyQualifiedName(e);
            List<String> _segments = _fullyQualifiedName.getSegments();
            final Function1<String,String> _function = new Function1<String,String>() {
                public String apply(final String it) {
                  String _lowerCase = it.toLowerCase();
                  return _lowerCase;
                }
              };
            List<String> _map = ListExtensions.<String, String>map(_segments, _function);
            String _join = IterableExtensions.join(_map, "/");
            JvmAnnotationReference _createPathAnnotation = DMControllerGenerator.this.createPathAnnotation(e, _join);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPathAnnotation);
            EList<JvmMember> _members = it.getMembers();
            final Procedure1<JvmConstructor> _function_1 = new Procedure1<JvmConstructor>() {
                public void apply(final JvmConstructor it) {
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable it) {
                        it.trace(e);
                        StringConcatenation _builder = new StringConcatenation();
                        _builder.append("this._emf = javax.persistence.Persistence.createEntityManagerFactory(\"messageboard\");");
                        _builder.newLine();
                        it.append(_builder);
                      }
                    };
                  DMControllerGenerator.this._jvmTypesBuilder.setBody(it, _function);
                }
              };
            JvmConstructor _constructor = DMControllerGenerator.this._jvmTypesBuilder.toConstructor(e, _function_1);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
            EList<JvmMember> _members_1 = it.getMembers();
            JvmField _injectedEntityManagerFactory = DMControllerGenerator.this.injectedEntityManagerFactory(e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _injectedEntityManagerFactory);
            EList<JvmMember> _members_2 = it.getMembers();
            JvmOperation _createJsonPut = DMControllerGenerator.this.createJsonPut(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _createJsonPut);
            EList<JvmMember> _members_3 = it.getMembers();
            JvmOperation _createDelete = DMControllerGenerator.this.createDelete(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _createDelete);
            EList<JvmMember> _members_4 = it.getMembers();
            JvmOperation _createJsonGetById = DMControllerGenerator.this.createJsonGetById(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _createJsonGetById);
            EList<JvmMember> _members_5 = it.getMembers();
            JvmOperation _createJsonPost = DMControllerGenerator.this.createJsonPost(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _createJsonPost);
            EList<JvmMember> _members_6 = it.getMembers();
            JvmOperation _createJsonGetAll = DMControllerGenerator.this.createJsonGetAll(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _createJsonGetAll);
          }
        };
      _accept.initializeLater(_function);
    }
  }
  
  private JvmField injectedEntityManagerFactory(final Entity e) {
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName("javax.persistence.EntityManagerFactory", e);
    JvmField _field = this._jvmTypesBuilder.toField(e, "_emf", _typeForName);
    return _field;
  }
  
  private JvmOperation createJsonGetById(final JvmGenericType t, final EObject e) {
    JvmOperation _xblockexpression = null;
    {
      final JvmParameterizedTypeReference ref = this._typeReferences.createTypeRef(t);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("get");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      _builder.append("AsJSON");
      String _string = _builder.toString();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createGetAnnotation = DMControllerGenerator.this.createGetAnnotation(e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createGetAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createProducesAnnotation = DMControllerGenerator.this.createProducesAnnotation(e, "application/json");
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _createProducesAnnotation);
            EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
            JvmAnnotationReference _createPathAnnotation = DMControllerGenerator.this.createPathAnnotation(e, "{id}");
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_2, _createPathAnnotation);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeForName = DMControllerGenerator.this._typeReferences.getTypeForName(int.class, e);
            final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
                public void apply(final JvmFormalParameter it) {
                  EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                  JvmAnnotationReference _createPathParamAnnotation = DMControllerGenerator.this.createPathParamAnnotation(e, "id");
                  DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPathParamAnnotation);
                }
              };
            JvmFormalParameter _parameter = DMControllerGenerator.this._typesBuilderExtensions.toParameter(e, "id", _typeForName, _function);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            final Procedure1<ITreeAppendable> _function_1 = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  _builder.append("_entityManager.getTransaction().begin();");
                  _builder.newLine();
                  String _simpleName = t.getSimpleName();
                  _builder.append(_simpleName, "");
                  _builder.append(" ");
                  String _simpleName_1 = t.getSimpleName();
                  String _firstLower = StringExtensions.toFirstLower(_simpleName_1);
                  _builder.append(_firstLower, "");
                  _builder.append(" = _entityManager.find(");
                  String _simpleName_2 = t.getSimpleName();
                  _builder.append(_simpleName_2, "");
                  _builder.append(".class, id);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("_entityManager.getTransaction().commit();");
                  _builder.newLine();
                  _builder.append("_entityManager.close();");
                  _builder.newLine();
                  _builder.append("return ");
                  String _simpleName_3 = t.getSimpleName();
                  String _firstLower_1 = StringExtensions.toFirstLower(_simpleName_3);
                  _builder.append(_firstLower_1, "");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  String _string = _builder.toString();
                  it.append(_string);
                }
              };
            DMControllerGenerator.this._jvmTypesBuilder.setBody(it, _function_1);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, ref, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  private JvmOperation createJsonGetAll(final JvmGenericType t, final EObject e) {
    JvmOperation _xblockexpression = null;
    {
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(t);
      final JvmTypeReference tRet = this._typeReferences.getTypeForName(List.class, e, _createTypeRef);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("get");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      _builder.append("AllAsJSON");
      String _string = _builder.toString();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createGetAnnotation = DMControllerGenerator.this.createGetAnnotation(e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createGetAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createProducesAnnotation = DMControllerGenerator.this.createProducesAnnotation(e, "application/json");
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _createProducesAnnotation);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  _builder.append("_entityManager.getTransaction().begin();");
                  _builder.newLine();
                  _builder.append("javax.persistence.Query _q = _entityManager.createQuery(\"select results from ");
                  String _simpleName = t.getSimpleName();
                  _builder.append(_simpleName, "");
                  _builder.append(" results\");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("java.util.List<");
                  String _simpleName_1 = t.getSimpleName();
                  _builder.append(_simpleName_1, "");
                  _builder.append("> _results = _q.getResultList();");
                  _builder.newLineIfNotEmpty();
                  _builder.append("_entityManager.getTransaction().commit();");
                  _builder.newLine();
                  _builder.append("_entityManager.close();");
                  _builder.newLine();
                  _builder.append("return _results;");
                  _builder.newLine();
                  String _string = _builder.toString();
                  it.append(_string);
                }
              };
            DMControllerGenerator.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, tRet, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  private JvmOperation createJsonPost(final JvmGenericType t, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("post");
    String _simpleName = t.getSimpleName();
    _builder.append(_simpleName, "");
    String _string = _builder.toString();
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(void.class, e);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _createPostAnnotation = DMControllerGenerator.this.createPostAnnotation(e);
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPostAnnotation);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          JvmAnnotationReference _createConsumesAnnotation = DMControllerGenerator.this.createConsumesAnnotation(e, "application/x-www-form-urlencoded");
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _createConsumesAnnotation);
          EList<Feature> _features = e.getFeatures();
          Iterable<Property> _filter = Iterables.<Property>filter(_features, Property.class);
          final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
              public Boolean apply(final Property it) {
                boolean _isDerive = it.isDerive();
                boolean _not = (!_isDerive);
                return Boolean.valueOf(_not);
              }
            };
          Iterable<Property> _filter_1 = IterableExtensions.<Property>filter(_filter, _function);
          for (final Property n : _filter_1) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            String _name = n.getName();
            JvmTypeReference _type = n.getType();
            final Procedure1<JvmFormalParameter> _function_1 = new Procedure1<JvmFormalParameter>() {
                public void apply(final JvmFormalParameter it) {
                  EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                  String _name = n.getName();
                  JvmAnnotationReference _createFormParamAnnotation = DMControllerGenerator.this.createFormParamAnnotation(e, _name);
                  DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createFormParamAnnotation);
                }
              };
            JvmFormalParameter _parameter = DMControllerGenerator.this._typesBuilderExtensions.toParameter(e, _name, _type, _function_1);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          }
          final Procedure1<ITreeAppendable> _function_2 = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                it.trace(e);
                EList<Feature> _features = e.getFeatures();
                Iterable<Operation> _filter = Iterables.<Operation>filter(_features, Operation.class);
                final Function1<Operation,Boolean> _function = new Function1<Operation,Boolean>() {
                    public Boolean apply(final Operation it) {
                      String _name = it.getName();
                      boolean _equals = Objects.equal(_name, "derive");
                      return Boolean.valueOf(_equals);
                    }
                  };
                final Operation derive = IterableExtensions.<Operation>findFirst(_filter, _function);
                EList<Feature> _features_1 = e.getFeatures();
                Iterable<Operation> _filter_1 = Iterables.<Operation>filter(_features_1, Operation.class);
                final Function1<Operation,Boolean> _function_1 = new Function1<Operation,Boolean>() {
                    public Boolean apply(final Operation it) {
                      String _name = it.getName();
                      boolean _equals = Objects.equal(_name, "validate");
                      return Boolean.valueOf(_equals);
                    }
                  };
                final Operation validate = IterableExtensions.<Operation>findFirst(_filter_1, _function_1);
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                _builder.newLine();
                String _simpleName = t.getSimpleName();
                _builder.append(_simpleName, "");
                _builder.append(" _inst");
                String _simpleName_1 = t.getSimpleName();
                _builder.append(_simpleName_1, "");
                _builder.append(" = new ");
                String _simpleName_2 = t.getSimpleName();
                _builder.append(_simpleName_2, "");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                {
                  EList<Feature> _features_2 = e.getFeatures();
                  Iterable<Property> _filter_2 = Iterables.<Property>filter(_features_2, Property.class);
                  for(final Property prop : _filter_2) {
                    {
                      boolean _isDerive = prop.isDerive();
                      boolean _not = (!_isDerive);
                      if (_not) {
                        _builder.append("_inst");
                        String _simpleName_3 = t.getSimpleName();
                        _builder.append(_simpleName_3, "");
                        _builder.append(".set");
                        String _name = prop.getName();
                        String _firstUpper = StringExtensions.toFirstUpper(_name);
                        _builder.append(_firstUpper, "");
                        _builder.append("(");
                        String _name_1 = prop.getName();
                        _builder.append(_name_1, "");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
                {
                  boolean _notEquals = (!Objects.equal(derive, null));
                  if (_notEquals) {
                    _builder.append("_inst");
                    String _simpleName_4 = t.getSimpleName();
                    _builder.append(_simpleName_4, "");
                    _builder.append(".derive();");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  boolean _notEquals_1 = (!Objects.equal(validate, null));
                  if (_notEquals_1) {
                    _builder.append("if(_inst");
                    String _simpleName_5 = t.getSimpleName();
                    _builder.append(_simpleName_5, "");
                    _builder.append(".validate())");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("{");
                _builder.newLine();
                _builder.append("  ");
                _builder.append("_entityManager.getTransaction().begin();");
                _builder.newLine();
                _builder.append("  ");
                _builder.append("_entityManager.persist(_inst");
                String _simpleName_6 = t.getSimpleName();
                _builder.append(_simpleName_6, "  ");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("  ");
                _builder.append("_entityManager.getTransaction().commit();");
                _builder.newLine();
                _builder.append("  ");
                _builder.append("_entityManager.close();");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                String _string = _builder.toString();
                it.append(_string);
              }
            };
          DMControllerGenerator.this._jvmTypesBuilder.setBody(it, _function_2);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, _typeForName, _function);
    return _method;
  }
  
  private JvmOperation createJsonPut(final JvmGenericType t, final EObject e) {
    JvmOperation _xblockexpression = null;
    {
      final JvmParameterizedTypeReference ref = this._typeReferences.createTypeRef(t);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("put");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      String _string = _builder.toString();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(int.class, e);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createPutAnnotation = DMControllerGenerator.this.createPutAnnotation(e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPutAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createConsumesAnnotation = DMControllerGenerator.this.createConsumesAnnotation(e, "application/json");
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _createConsumesAnnotation);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            StringConcatenation _builder = new StringConcatenation();
            String _simpleName = t.getSimpleName();
            String _firstLower = StringExtensions.toFirstLower(_simpleName);
            _builder.append(_firstLower, "");
            String _string = _builder.toString();
            JvmFormalParameter _parameter = DMControllerGenerator.this._jvmTypesBuilder.toParameter(e, _string, ref);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  _builder.append("_entityManager.getTransaction().begin();");
                  _builder.newLine();
                  String _simpleName = t.getSimpleName();
                  _builder.append(_simpleName, "");
                  _builder.append(" entity = _entityManager.merge(");
                  String _simpleName_1 = t.getSimpleName();
                  String _firstLower = StringExtensions.toFirstLower(_simpleName_1);
                  _builder.append(_firstLower, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("_entityManager.getTransaction().commit();");
                  _builder.newLine();
                  _builder.append("_entityManager.close();");
                  _builder.newLine();
                  _builder.append("return entity.getId();");
                  _builder.newLine();
                  String _string = _builder.toString();
                  it.append(_string);
                }
              };
            DMControllerGenerator.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, _typeForName, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  private JvmOperation createDelete(final JvmGenericType t, final EObject e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("delete");
    String _simpleName = t.getSimpleName();
    _builder.append(_simpleName, "");
    String _string = _builder.toString();
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(void.class, e);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _createDeleteAnnotation = DMControllerGenerator.this.createDeleteAnnotation(e);
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createDeleteAnnotation);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          JvmAnnotationReference _createPathAnnotation = DMControllerGenerator.this.createPathAnnotation(e, "{id}");
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _createPathAnnotation);
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _typeForName = DMControllerGenerator.this._typeReferences.getTypeForName(int.class, e);
          final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
              public void apply(final JvmFormalParameter it) {
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                JvmAnnotationReference _createPathParamAnnotation = DMControllerGenerator.this.createPathParamAnnotation(e, "id");
                DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPathParamAnnotation);
              }
            };
          JvmFormalParameter _parameter = DMControllerGenerator.this._typesBuilderExtensions.toParameter(e, "id", _typeForName, _function);
          DMControllerGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          final Procedure1<ITreeAppendable> _function_1 = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                it.trace(e);
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                _builder.newLine();
                _builder.append("_entityManager.getTransaction().begin();");
                _builder.newLine();
                String _simpleName = t.getSimpleName();
                _builder.append(_simpleName, "");
                _builder.append(" _");
                String _simpleName_1 = t.getSimpleName();
                String _firstLower = StringExtensions.toFirstLower(_simpleName_1);
                _builder.append(_firstLower, "");
                _builder.append(" = _entityManager.find(");
                String _simpleName_2 = t.getSimpleName();
                _builder.append(_simpleName_2, "");
                _builder.append(".class, id);");
                _builder.newLineIfNotEmpty();
                _builder.append("_entityManager.remove(_");
                String _simpleName_3 = t.getSimpleName();
                String _firstLower_1 = StringExtensions.toFirstLower(_simpleName_3);
                _builder.append(_firstLower_1, "");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("_entityManager.getTransaction().commit();");
                _builder.newLine();
                _builder.append("_entityManager.close();");
                _builder.newLine();
                String _string = _builder.toString();
                it.append(_string);
              }
            };
          DMControllerGenerator.this._jvmTypesBuilder.setBody(it, _function_1);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, _typeForName, _function);
    return _method;
  }
  
  public JvmAnnotationReference createGetAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.GET");
    return _annotation;
  }
  
  public JvmAnnotationReference createPostAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.POST");
    return _annotation;
  }
  
  public JvmAnnotationReference createPutAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.PUT");
    return _annotation;
  }
  
  public JvmAnnotationReference createDeleteAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.DELETE");
    return _annotation;
  }
  
  public JvmAnnotationReference createPathAnnotation(final EObject it, final String param) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.Path", param);
    return _annotation;
  }
  
  public JvmAnnotationReference createPathParamAnnotation(final EObject it, final String name) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.PathParam", name);
    return _annotation;
  }
  
  public JvmAnnotationReference createFormParamAnnotation(final EObject it, final String name) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.FormParam", name);
    return _annotation;
  }
  
  public JvmAnnotationReference createProducesAnnotation(final EObject it, final String mime) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.Produces", mime);
    return _annotation;
  }
  
  public JvmAnnotationReference createConsumesAnnotation(final EObject it, final String mime) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.Consumes", mime);
    return _annotation;
  }
}
