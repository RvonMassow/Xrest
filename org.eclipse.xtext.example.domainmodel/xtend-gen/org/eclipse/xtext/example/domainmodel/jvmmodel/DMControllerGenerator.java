package org.eclipse.xtext.example.domainmodel.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
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
import org.eclipse.xtext.example.domainmodel.jvmmodel.AnnotationExtensions;
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
  
  @Inject
  private AnnotationExtensions _annotationExtensions;
  
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
            JvmAnnotationReference _createPathAnnotation = DMControllerGenerator.this._annotationExtensions.createPathAnnotation(e, _join);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPathAnnotation);
            EList<JvmMember> _members = it.getMembers();
            JvmField _injectedDaoClass = DMControllerGenerator.this.injectedDaoClass(e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmField>operator_add(_members, _injectedDaoClass);
            EList<JvmMember> _members_1 = it.getMembers();
            JvmOperation _createJsonPut = DMControllerGenerator.this.createJsonPut(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _createJsonPut);
            EList<JvmMember> _members_2 = it.getMembers();
            JvmOperation _createDelete = DMControllerGenerator.this.createDelete(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _createDelete);
            EList<JvmMember> _members_3 = it.getMembers();
            JvmOperation _createJsonGetById = DMControllerGenerator.this.createJsonGetById(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _createJsonGetById);
            EList<JvmMember> _members_4 = it.getMembers();
            JvmOperation _createJsonPost = DMControllerGenerator.this.createJsonPost(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _createJsonPost);
            EList<JvmMember> _members_5 = it.getMembers();
            JvmOperation _createJsonGetAll = DMControllerGenerator.this.createJsonGetAll(forType, e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _createJsonGetAll);
          }
        };
      _accept.initializeLater(_function);
    }
  }
  
  private JvmField injectedDaoClass(final Entity e) {
    JvmField _xblockexpression = null;
    {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      String _string = _fullyQualifiedName.toString();
      String _plus = (_string + "Dao");
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(_plus, e);
      final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createInjectAnnotation = DMControllerGenerator.this._annotationExtensions.createInjectAnnotation(e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createInjectAnnotation);
          }
        };
      this._jvmTypesBuilder.toField(e, "_dao", _typeForName, _function);
      JvmTypeReference _typeForName_1 = this._typeReferences.getTypeForName("javax.ws.rs.core.UriInfo", e);
      final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createContextAnnotation = DMControllerGenerator.this._annotationExtensions.createContextAnnotation(e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createContextAnnotation);
          }
        };
      JvmField _field = this._jvmTypesBuilder.toField(e, "_uriInfo", _typeForName_1, _function_1);
      _xblockexpression = (_field);
    }
    return _xblockexpression;
  }
  
  private JvmOperation createJsonGetById(final JvmGenericType t, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("get");
    String _simpleName = t.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append("AsJSON");
    String _string = _builder.toString();
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName("javax.ws.rs.core.Response", e);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _createGetAnnotation = DMControllerGenerator.this._annotationExtensions.createGetAnnotation(e);
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createGetAnnotation);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          JvmAnnotationReference _createProducesAnnotation = DMControllerGenerator.this._annotationExtensions.createProducesAnnotation(e, "application/json");
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _createProducesAnnotation);
          EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
          JvmAnnotationReference _createPathAnnotation = DMControllerGenerator.this._annotationExtensions.createPathAnnotation(e, "{id}");
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_2, _createPathAnnotation);
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _typeForName = DMControllerGenerator.this._typeReferences.getTypeForName(int.class, e);
          final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
              public void apply(final JvmFormalParameter it) {
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                JvmAnnotationReference _createPathParamAnnotation = DMControllerGenerator.this._annotationExtensions.createPathParamAnnotation(e, "id");
                DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPathParamAnnotation);
              }
            };
          JvmFormalParameter _parameter = DMControllerGenerator.this._typesBuilderExtensions.toParameter(e, "id", _typeForName, _function);
          DMControllerGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          final Procedure1<ITreeAppendable> _function_1 = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                it.trace(e);
                StringConcatenation _builder = new StringConcatenation();
                String _simpleName = t.getSimpleName();
                _builder.append(_simpleName, "");
                _builder.append(" ");
                String _simpleName_1 = t.getSimpleName();
                String _firstLower = StringExtensions.toFirstLower(_simpleName_1);
                _builder.append(_firstLower, "");
                _builder.append(" = _dao.find");
                String _simpleName_2 = t.getSimpleName();
                _builder.append(_simpleName_2, "");
                _builder.append("ById(id);");
                _builder.newLineIfNotEmpty();
                _builder.append("if(");
                String _simpleName_3 = t.getSimpleName();
                String _firstLower_1 = StringExtensions.toFirstLower(_simpleName_3);
                _builder.append(_firstLower_1, "");
                _builder.append(" == null){");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND).build();");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                _builder.append("return Response.ok(");
                String _simpleName_4 = t.getSimpleName();
                String _firstLower_2 = StringExtensions.toFirstLower(_simpleName_4);
                _builder.append(_firstLower_2, "");
                _builder.append(").build();");
                _builder.newLineIfNotEmpty();
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
  
  private JvmOperation createJsonGetAll(final JvmGenericType t, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("get");
    String _simpleName = t.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append("AllAsJSON");
    String _string = _builder.toString();
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName("javax.ws.rs.core.Response", e);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _createGetAnnotation = DMControllerGenerator.this._annotationExtensions.createGetAnnotation(e);
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createGetAnnotation);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          JvmAnnotationReference _createProducesAnnotation = DMControllerGenerator.this._annotationExtensions.createProducesAnnotation(e, "application/json");
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _createProducesAnnotation);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                it.trace(e);
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("java.util.List<");
                String _simpleName = t.getSimpleName();
                _builder.append(_simpleName, "");
                _builder.append("> _results = _dao.findAll");
                String _simpleName_1 = t.getSimpleName();
                _builder.append(_simpleName_1, "");
                _builder.append("s();");
                _builder.newLineIfNotEmpty();
                _builder.append("return Response.ok(_results).build();");
                _builder.newLine();
                String _string = _builder.toString();
                it.append(_string);
              }
            };
          DMControllerGenerator.this._jvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, _typeForName, _function);
    return _method;
  }
  
  private JvmOperation createJsonPost(final JvmGenericType t, final Entity e) {
    JvmOperation _xblockexpression = null;
    {
      final JvmParameterizedTypeReference ref = this._typeReferences.createTypeRef(t);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("post");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      String _string = _builder.toString();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName("javax.ws.rs.core.Response", e);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createPostAnnotation = DMControllerGenerator.this._annotationExtensions.createPostAnnotation(e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPostAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createConsumesAnnotation = DMControllerGenerator.this._annotationExtensions.createConsumesAnnotation(e, "application/json");
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
                  EList<Feature> _features = e.getFeatures();
                  Iterable<Operation> _filter = Iterables.<Operation>filter(_features, Operation.class);
                  final Function1<Operation,Boolean> _function = new Function1<Operation,Boolean>() {
                      public Boolean apply(final Operation it) {
                        String _name = it.getName();
                        boolean _equals = Objects.equal(_name, "validate");
                        return Boolean.valueOf(_equals);
                      }
                    };
                  final Operation validate = IterableExtensions.<Operation>findFirst(_filter, _function);
                  EList<Feature> _features_1 = e.getFeatures();
                  Iterable<Operation> _filter_1 = Iterables.<Operation>filter(_features_1, Operation.class);
                  final Function1<Operation,Boolean> _function_1 = new Function1<Operation,Boolean>() {
                      public Boolean apply(final Operation it) {
                        String _name = it.getName();
                        boolean _equals = Objects.equal(_name, "derive");
                        return Boolean.valueOf(_equals);
                      }
                    };
                  final Operation derive = IterableExtensions.<Operation>findFirst(_filter_1, _function_1);
                  StringConcatenation _builder = new StringConcatenation();
                  {
                    boolean _notEquals = (!Objects.equal(derive, null));
                    if (_notEquals) {
                      String _simpleName = t.getSimpleName();
                      String _firstLower = StringExtensions.toFirstLower(_simpleName);
                      _builder.append(_firstLower, "");
                      _builder.append(".derive();");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  {
                    boolean _notEquals_1 = (!Objects.equal(validate, null));
                    if (_notEquals_1) {
                      _builder.append("if(");
                      String _simpleName_1 = t.getSimpleName();
                      String _firstLower_1 = StringExtensions.toFirstLower(_simpleName_1);
                      _builder.append(_firstLower_1, "");
                      _builder.append(".validate())");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  _builder.append("{");
                  _builder.newLine();
                  _builder.append("int id = _dao.create");
                  String _simpleName_2 = t.getSimpleName();
                  _builder.append(_simpleName_2, "");
                  _builder.append("(");
                  String _simpleName_3 = t.getSimpleName();
                  String _firstLower_2 = StringExtensions.toFirstLower(_simpleName_3);
                  _builder.append(_firstLower_2, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("java.net.URI location = _uriInfo.getAbsolutePathBuilder().path(\"\" + id).build();");
                  _builder.newLine();
                  _builder.append("return Response.created(location).build();");
                  _builder.newLine();
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("return Response.status(javax.ws.rs.core.Response.Status.FORBIDDEN).build();");
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
  
  private JvmOperation createJsonPut(final JvmGenericType t, final Entity e) {
    JvmOperation _xblockexpression = null;
    {
      final JvmParameterizedTypeReference ref = this._typeReferences.createTypeRef(t);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("put");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      String _string = _builder.toString();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName("javax.ws.rs.core.Response", e);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createPutAnnotation = DMControllerGenerator.this._annotationExtensions.createPutAnnotation(e);
            DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPutAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createConsumesAnnotation = DMControllerGenerator.this._annotationExtensions.createConsumesAnnotation(e, "application/json");
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
                  EList<Feature> _features = e.getFeatures();
                  Iterable<Operation> _filter = Iterables.<Operation>filter(_features, Operation.class);
                  final Function1<Operation,Boolean> _function = new Function1<Operation,Boolean>() {
                      public Boolean apply(final Operation it) {
                        String _name = it.getName();
                        boolean _equals = Objects.equal(_name, "validate");
                        return Boolean.valueOf(_equals);
                      }
                    };
                  final Operation validate = IterableExtensions.<Operation>findFirst(_filter, _function);
                  EList<Feature> _features_1 = e.getFeatures();
                  Iterable<Operation> _filter_1 = Iterables.<Operation>filter(_features_1, Operation.class);
                  final Function1<Operation,Boolean> _function_1 = new Function1<Operation,Boolean>() {
                      public Boolean apply(final Operation it) {
                        String _name = it.getName();
                        boolean _equals = Objects.equal(_name, "derive");
                        return Boolean.valueOf(_equals);
                      }
                    };
                  final Operation derive = IterableExtensions.<Operation>findFirst(_filter_1, _function_1);
                  StringConcatenation _builder = new StringConcatenation();
                  {
                    boolean _notEquals = (!Objects.equal(derive, null));
                    if (_notEquals) {
                      String _simpleName = t.getSimpleName();
                      String _firstLower = StringExtensions.toFirstLower(_simpleName);
                      _builder.append(_firstLower, "");
                      _builder.append(".derive();");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  {
                    boolean _notEquals_1 = (!Objects.equal(validate, null));
                    if (_notEquals_1) {
                      _builder.append("if(");
                      String _simpleName_1 = t.getSimpleName();
                      String _firstLower_1 = StringExtensions.toFirstLower(_simpleName_1);
                      _builder.append(_firstLower_1, "");
                      _builder.append(".validate())");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  _builder.append("{");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("try{");
                  _builder.newLine();
                  _builder.append("\t\t");
                  String _simpleName_2 = t.getSimpleName();
                  _builder.append(_simpleName_2, "		");
                  _builder.append(" modified");
                  String _simpleName_3 = t.getSimpleName();
                  _builder.append(_simpleName_3, "		");
                  _builder.append(" = _dao.modify");
                  String _simpleName_4 = t.getSimpleName();
                  _builder.append(_simpleName_4, "		");
                  _builder.append("(");
                  String _simpleName_5 = t.getSimpleName();
                  String _firstLower_2 = StringExtensions.toFirstLower(_simpleName_5);
                  _builder.append(_firstLower_2, "		");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("  \t\t");
                  _builder.append("return Response.ok(modified");
                  String _simpleName_6 = t.getSimpleName();
                  _builder.append(_simpleName_6, "  		");
                  _builder.append(").build();");
                  _builder.newLineIfNotEmpty();
                  _builder.append("  \t");
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("  \t");
                  _builder.append("catch(IllegalArgumentException e){");
                  _builder.newLine();
                  _builder.append("  \t\t");
                  _builder.append("return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND).build();");
                  _builder.newLine();
                  _builder.append("  \t");
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("return Response.status(javax.ws.rs.core.Response.Status.NOT_MODIFIED).build();");
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
  
  private JvmOperation createDelete(final JvmGenericType t, final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("delete");
    String _simpleName = t.getSimpleName();
    _builder.append(_simpleName, "");
    String _string = _builder.toString();
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName("javax.ws.rs.core.Response", e);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _createDeleteAnnotation = DMControllerGenerator.this._annotationExtensions.createDeleteAnnotation(e);
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createDeleteAnnotation);
          EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
          JvmAnnotationReference _createPathAnnotation = DMControllerGenerator.this._annotationExtensions.createPathAnnotation(e, "{id}");
          DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _createPathAnnotation);
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _typeForName = DMControllerGenerator.this._typeReferences.getTypeForName(int.class, e);
          final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
              public void apply(final JvmFormalParameter it) {
                EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                JvmAnnotationReference _createPathParamAnnotation = DMControllerGenerator.this._annotationExtensions.createPathParamAnnotation(e, "id");
                DMControllerGenerator.this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _createPathParamAnnotation);
              }
            };
          JvmFormalParameter _parameter = DMControllerGenerator.this._typesBuilderExtensions.toParameter(e, "id", _typeForName, _function);
          DMControllerGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          final Procedure1<ITreeAppendable> _function_1 = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                it.trace(e);
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("try{");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("_dao.delete");
                String _simpleName = t.getSimpleName();
                _builder.append(_simpleName, "	");
                _builder.append("(id);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("return Response.noContent().build();");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                _builder.append("catch(IllegalArgumentException e){");
                _builder.newLine();
                _builder.append("  \t\t");
                _builder.append("return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND).build();");
                _builder.newLine();
                _builder.append("}");
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
}
