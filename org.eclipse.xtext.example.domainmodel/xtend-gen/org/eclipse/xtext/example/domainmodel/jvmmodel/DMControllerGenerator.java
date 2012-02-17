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
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity;
import org.eclipse.xtext.example.domainmodel.jvmmodel.TypesBuilderExtensions;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
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
  
  public Object toControllerClass(final Entity e, final JvmGenericType forType, final IJvmDeclaredTypeAcceptor acceptor) {
    Object _xifexpression = null;
    String _name = e.getName();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_name, null);
    if (_operator_notEquals) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      String _string = _fullyQualifiedName.toString();
      String _operator_plus = StringExtensions.operator_plus(_string, "Controller");
      JvmGenericType _class = this._jvmTypesBuilder.toClass(e, _operator_plus);
      IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            {
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
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              EList<JvmMember> _members = it.getMembers();
              JvmField _injectedEntityManagerFactory = DMControllerGenerator.this.injectedEntityManagerFactory(e);
              CollectionExtensions.<JvmField>operator_add(_members, _injectedEntityManagerFactory);
              EList<JvmMember> _members_1 = it.getMembers();
              JvmOperation _createJSONById = DMControllerGenerator.this.createJSONById(forType, e);
              CollectionExtensions.<JvmOperation>operator_add(_members_1, _createJSONById);
              EList<JvmMember> _members_2 = it.getMembers();
              JvmOperation _createPost = DMControllerGenerator.this.createPost(forType, e);
              CollectionExtensions.<JvmOperation>operator_add(_members_2, _createPost);
            }
          }
        };
      _accept.initializeLater(_function);
    }
    return _xifexpression;
  }
  
  private JvmField injectedEntityManagerFactory(final Entity e) {
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName("javax.persistence.EntityManagerFactory", e);
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
        public void apply(final JvmField it) {
          EList<JvmAnnotationReference> _annotations = it.getAnnotations();
          JvmAnnotationReference _annotation = DMControllerGenerator.this._jvmTypesBuilder.toAnnotation(e, "javax.persistence.PersistenceUnit");
          CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
        }
      };
    JvmField _field = this._jvmTypesBuilder.toField(e, "_emf", _typeForName, _function);
    return _field;
  }
  
  private JvmOperation createJSONById(final JvmGenericType t, final EObject e) {
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
            {
              it.setVisibility(JvmVisibility.PUBLIC);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _createGetAnnotation = DMControllerGenerator.this.createGetAnnotation(e);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _createGetAnnotation);
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              JvmAnnotationReference _createProducesAnnotation = DMControllerGenerator.this.createProducesAnnotation(e, "application/json");
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _createProducesAnnotation);
              EList<JvmFormalParameter> _parameters = it.getParameters();
              JvmTypeReference _typeForName = DMControllerGenerator.this._typeReferences.getTypeForName(int.class, e);
              final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
                  public void apply(final JvmFormalParameter it) {
                    EList<JvmAnnotationReference> _annotations = it.getAnnotations();
                    JvmAnnotationReference _createPathParamAnnotation = DMControllerGenerator.this.createPathParamAnnotation(e, "id");
                    CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _createPathParamAnnotation);
                  }
                };
              JvmFormalParameter _parameter = DMControllerGenerator.this._typesBuilderExtensions.toParameter(e, "id", _typeForName, _function);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Function1<ImportManager,CharSequence> _function_1 = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    CharSequence _xblockexpression = null;
                    {
                      JvmType _findDeclaredType = DMControllerGenerator.this._typeReferences.findDeclaredType("javax.persistence.EntityManager", e);
                      it.addImportFor(_findDeclaredType);
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("EntityManager entityManager = _emf.createEntityManager();");
                      _builder.newLine();
                      String _simpleName = t.getSimpleName();
                      _builder.append(_simpleName, "");
                      _builder.append(" ");
                      String _simpleName_1 = t.getSimpleName();
                      String _firstLower = StringExtensions.toFirstLower(_simpleName_1);
                      _builder.append(_firstLower, "");
                      _builder.append(" = entityManager.find(");
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
                      _xblockexpression = (_builder);
                    }
                    return _xblockexpression;
                  }
                };
              DMControllerGenerator.this._jvmTypesBuilder.setBody(it, _function_1);
            }
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, ref, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  private JvmOperation createPost(final JvmGenericType t, final EObject e) {
    JvmOperation _xblockexpression = null;
    {
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(t);
      final JvmParameterizedTypeReference ref = _createTypeRef;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("post");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      String _string = _builder.toString();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            {
              it.setVisibility(JvmVisibility.PUBLIC);
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _createPostAnnotation = DMControllerGenerator.this.createPostAnnotation(e);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _createPostAnnotation);
              EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
              JvmAnnotationReference _createConsumesAnnotation = DMControllerGenerator.this.createConsumesAnnotation(e, "application/json");
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations_1, _createConsumesAnnotation);
              EList<JvmFormalParameter> _parameters = it.getParameters();
              StringConcatenation _builder = new StringConcatenation();
              String _simpleName = t.getSimpleName();
              String _firstLower = StringExtensions.toFirstLower(_simpleName);
              _builder.append(_firstLower, "");
              _builder.append("Element");
              String _string = _builder.toString();
              JvmTypeReference _typeForName = DMControllerGenerator.this._typeReferences.getTypeForName(javax.xml.bind.JAXBElement.class, e, ref);
              JvmFormalParameter _parameter = DMControllerGenerator.this._jvmTypesBuilder.toParameter(e, _string, _typeForName);
              CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Function1<ImportManager,CharSequence> _function = new Function1<ImportManager,CharSequence>() {
                  public CharSequence apply(final ImportManager it) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("EntityManager entityManager = _emf.createEntityManager();");
                    _builder.newLine();
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
                    _builder.append("entityManager.persist(");
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
                    return _builder;
                  }
                };
              DMControllerGenerator.this._jvmTypesBuilder.setBody(it, _function);
            }
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, ref, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  public JvmAnnotationReference createGetAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.GET");
    return _annotation;
  }
  
  public JvmAnnotationReference createPostAnnotation(final EObject it) {
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(it, "javax.ws.rs.POST");
    return _annotation;
  }
  
  public JvmAnnotationReference createPuttAnnotation(final EObject it) {
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
