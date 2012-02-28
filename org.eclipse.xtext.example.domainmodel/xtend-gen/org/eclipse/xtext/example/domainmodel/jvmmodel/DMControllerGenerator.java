package org.eclipse.xtext.example.domainmodel.jvmmodel;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.xtext.example.domainmodel.dom.DomGenerator;
import org.eclipse.xtext.example.domainmodel.dom.HTMLBuilder;
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity;
import org.eclipse.xtext.example.domainmodel.jvmmodel.TypesBuilderExtensions;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

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
  private HTMLBuilder _hTMLBuilder;
  
  public Object toControllerClass(final Entity e, final JvmGenericType forType, final IJvmDeclaredTypeAcceptor acceptor) {
    Object _xifexpression = null;
    String _name = e.getName();
    boolean _notEquals = !ObjectExtensions.equals(_name, null);
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
            JvmAnnotationReference _annotation = DMControllerGenerator.this._jvmTypesBuilder.toAnnotation(e, "javax.ws.rs.Path", _join);
            _annotations.add(_annotation);
            EList<JvmMember> _members = it.getMembers();
            JvmField _injectedEntityManagerFactory = DMControllerGenerator.this.injectedEntityManagerFactory(e);
            _members.add(_injectedEntityManagerFactory);
            EList<JvmMember> _members_1 = it.getMembers();
            JvmOperation _createPut = DMControllerGenerator.this.createPut(forType, e);
            _members_1.add(_createPut);
            EList<JvmMember> _members_2 = it.getMembers();
            JvmOperation _createDelete = DMControllerGenerator.this.createDelete(forType, e);
            _members_2.add(_createDelete);
            EList<JvmMember> _members_3 = it.getMembers();
            JvmOperation _createJsonGetById = DMControllerGenerator.this.createJsonGetById(forType, e);
            _members_3.add(_createJsonGetById);
            EList<JvmMember> _members_4 = it.getMembers();
            JvmOperation _createJsonPost = DMControllerGenerator.this.createJsonPost(forType, e);
            _members_4.add(_createJsonPost);
          }
        };
      _accept.initializeLater(_function);
    }
    return _xifexpression;
  }
  
  private JvmField injectedEntityManagerFactory(final Entity e) {
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName("javax.persistence.EntityManager", e);
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
        public void apply(final JvmField it) {
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _annotation = DMControllerGenerator.this._jvmTypesBuilder.toAnnotation(e, "javax.persistence.PersistenceContext");
          _annotations.add(_annotation);
        }
      };
    JvmField _field = this._jvmTypesBuilder.toField(e, "_entityManager", _typeForName, _function);
    return _field;
  }
  
  private JvmOperation createJsonGetById(final JvmGenericType t, final EObject e) {
    JvmOperation _xblockexpression = null;
    {
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(t);
      final JvmParameterizedTypeReference ref = _createTypeRef;
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
            _annotations.add(_createGetAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createProducesAnnotation = DMControllerGenerator.this.createProducesAnnotation(e, "application/json");
            _annotations_1.add(_createProducesAnnotation);
            EList<JvmAnnotationReference> _annotations_2 = it.getAnnotations();
            JvmAnnotationReference _annotation = DMControllerGenerator.this._jvmTypesBuilder.toAnnotation(e, "javax.ws.rs.Path", "{id}");
            _annotations_2.add(_annotation);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeForName = DMControllerGenerator.this._typeReferences.getTypeForName(int.class, e);
            final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
                public void apply(final JvmFormalParameter it) {
                  EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                  JvmAnnotationReference _createPathParamAnnotation = DMControllerGenerator.this.createPathParamAnnotation(e, "id");
                  _annotations.add(_createPathParamAnnotation);
                }
              };
            JvmFormalParameter _parameter = DMControllerGenerator.this._typesBuilderExtensions.toParameter(e, "id", _typeForName, _function);
            _parameters.add(_parameter);
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
                  _builder.append(" = _entityManager.find(");
                  String _simpleName_2 = t.getSimpleName();
                  _builder.append(_simpleName_2, "");
                  _builder.append(".class, id);");
                  _builder.newLineIfNotEmpty();
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
  
  private JvmOperation createJsonPost(final JvmGenericType t, final EObject e) {
    JvmOperation _xblockexpression = null;
    {
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(t);
      final JvmParameterizedTypeReference ref = _createTypeRef;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("post");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      String _string = _builder.toString();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(int.class, e);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmAnnotationReference> _annotations = it.getAnnotations();
            JvmAnnotationReference _createPostAnnotation = DMControllerGenerator.this.createPostAnnotation(e);
            _annotations.add(_createPostAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createConsumesAnnotation = DMControllerGenerator.this.createConsumesAnnotation(e, "application/json");
            _annotations_1.add(_createConsumesAnnotation);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            StringConcatenation _builder = new StringConcatenation();
            String _simpleName = t.getSimpleName();
            String _firstLower = StringExtensions.toFirstLower(_simpleName);
            _builder.append(_firstLower, "");
            String _string = _builder.toString();
            JvmFormalParameter _parameter = DMControllerGenerator.this._jvmTypesBuilder.toParameter(e, _string, ref);
            _parameters.add(_parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  String _simpleName = t.getSimpleName();
                  _builder.append(_simpleName, "");
                  _builder.append(" ");
                  String _simpleName_1 = t.getSimpleName();
                  String _firstLower = StringExtensions.toFirstLower(_simpleName_1);
                  _builder.append(_firstLower, "");
                  _builder.append(" = ");
                  String _simpleName_2 = t.getSimpleName();
                  String _firstLower_1 = StringExtensions.toFirstLower(_simpleName_2);
                  _builder.append(_firstLower_1, "");
                  _builder.append("Element.getValue();");
                  _builder.newLineIfNotEmpty();
                  _builder.append("_entityManager.persist(");
                  String _simpleName_3 = t.getSimpleName();
                  String _firstLower_2 = StringExtensions.toFirstLower(_simpleName_3);
                  _builder.append(_firstLower_2, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("return ");
                  String _simpleName_4 = t.getSimpleName();
                  String _firstLower_3 = StringExtensions.toFirstLower(_simpleName_4);
                  _builder.append(_firstLower_3, "");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
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
  
  private JvmOperation createPut(final JvmGenericType t, final EObject e) {
    JvmOperation _xblockexpression = null;
    {
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(t);
      final JvmParameterizedTypeReference ref = _createTypeRef;
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
            _annotations.add(_createPutAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createConsumesAnnotation = DMControllerGenerator.this.createConsumesAnnotation(e, "application/json");
            _annotations_1.add(_createConsumesAnnotation);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            StringConcatenation _builder = new StringConcatenation();
            String _simpleName = t.getSimpleName();
            String _firstLower = StringExtensions.toFirstLower(_simpleName);
            _builder.append(_firstLower, "");
            String _string = _builder.toString();
            JvmFormalParameter _parameter = DMControllerGenerator.this._jvmTypesBuilder.toParameter(e, _string, ref);
            _parameters.add(_parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("EntityManager entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  String _simpleName = t.getSimpleName();
                  _builder.append(_simpleName, "");
                  _builder.append(" entity = entityManager.merge(");
                  String _simpleName_1 = t.getSimpleName();
                  String _firstLower = StringExtensions.toFirstLower(_simpleName_1);
                  _builder.append(_firstLower, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
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
    JvmOperation _xblockexpression = null;
    {
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(t);
      final JvmParameterizedTypeReference ref = _createTypeRef;
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
            _annotations.add(_createDeleteAnnotation);
            EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
            JvmAnnotationReference _createConsumesAnnotation = DMControllerGenerator.this.createConsumesAnnotation(e, "application/json");
            _annotations_1.add(_createConsumesAnnotation);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            StringConcatenation _builder = new StringConcatenation();
            String _simpleName = t.getSimpleName();
            String _firstLower = StringExtensions.toFirstLower(_simpleName);
            _builder.append(_firstLower, "");
            String _string = _builder.toString();
            JvmFormalParameter _parameter = DMControllerGenerator.this._jvmTypesBuilder.toParameter(e, _string, ref);
            _parameters.add(_parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("EntityManager entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  _builder.append("entityManager.remove(");
                  String _simpleName = t.getSimpleName();
                  String _firstLower = StringExtensions.toFirstLower(_simpleName);
                  _builder.append(_firstLower, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
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
  
  public String testDom() {
    String _createDOMTemplate = this.createDOMTemplate(null, null);
    return _createDOMTemplate;
  }
  
  private String createDOMTemplate(final JvmGenericType t, final EObject o) {
    try {
      final Procedure1<Document> _function = new Procedure1<Document>() {
          public void apply(final Document it) {
            final Procedure1<Node> _function = new Procedure1<Node>() {
                public void apply(final Node it) {
                  final Procedure1<Node> _function = new Procedure1<Node>() {
                      public void apply(final Node it) {
                        final Procedure1<Node> _function = new Procedure1<Node>() {
                            public void apply(final Node it) {
                              it.setTextContent("Todd m\u00FCffelt");
                            }
                          };
                        DMControllerGenerator.this._hTMLBuilder.title(it, _function);
                      }
                    };
                  DMControllerGenerator.this._hTMLBuilder.head(it, _function);
                  final Procedure1<Node> _function_1 = new Procedure1<Node>() {
                      public void apply(final Node it) {
                        final Procedure1<Node> _function = new Procedure1<Node>() {
                            public void apply(final Node it) {
                              it.setTextContent("Extrablatt");
                            }
                          };
                        DMControllerGenerator.this._hTMLBuilder.h1(it, _function);
                      }
                    };
                  DMControllerGenerator.this._hTMLBuilder.body(it, _function_1);
                }
              };
            DMControllerGenerator.this._hTMLBuilder.html(it, _function);
          }
        };
      Document _newDoc = this._hTMLBuilder.newDoc(_function);
      String _generate = DomGenerator.generate(_newDoc);
      return _generate;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
  
  public JvmAnnotationReference createPathParamAnnotation(final EObject it, final String name) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.PathParam", name);
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
