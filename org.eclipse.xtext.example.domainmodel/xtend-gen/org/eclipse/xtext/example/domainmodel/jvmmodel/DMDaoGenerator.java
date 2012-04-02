package org.eclipse.xtext.example.domainmodel.jvmmodel;

import com.google.common.base.Objects;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
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
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DMDaoGenerator {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypeReferences _typeReferences;
  
  public void toDaoClass(final Entity e, final JvmGenericType forType, final IJvmDeclaredTypeAcceptor acceptor) {
    String _name = e.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      String _string = _fullyQualifiedName.toString();
      String _plus = (_string + "Dao");
      JvmGenericType _class = this._jvmTypesBuilder.toClass(e, _plus);
      IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            EList<JvmMember> _members = it.getMembers();
            final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
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
                  DMDaoGenerator.this._jvmTypesBuilder.setBody(it, _function);
                }
              };
            JvmConstructor _constructor = DMDaoGenerator.this._jvmTypesBuilder.toConstructor(e, _function);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
            EList<JvmMember> _members_1 = it.getMembers();
            JvmField _injectedEntityManagerFactory = DMDaoGenerator.this.injectedEntityManagerFactory(e);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _injectedEntityManagerFactory);
            EList<JvmMember> _members_2 = it.getMembers();
            JvmOperation _createFindById = DMDaoGenerator.this.createFindById(forType, e);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _createFindById);
            EList<JvmMember> _members_3 = it.getMembers();
            JvmOperation _createFindAll = DMDaoGenerator.this.createFindAll(forType, e);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _createFindAll);
            EList<JvmMember> _members_4 = it.getMembers();
            JvmOperation _createCreate = DMDaoGenerator.this.createCreate(forType, e);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _createCreate);
            EList<JvmMember> _members_5 = it.getMembers();
            JvmOperation _createModify = DMDaoGenerator.this.createModify(forType, e);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _createModify);
            EList<JvmMember> _members_6 = it.getMembers();
            JvmOperation _createDelete = DMDaoGenerator.this.createDelete(forType, e);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_6, _createDelete);
            EList<JvmMember> _members_7 = it.getMembers();
            JvmOperation _createFind = DMDaoGenerator.this.createFind(forType, e);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_7, _createFind);
            EList<JvmMember> _members_8 = it.getMembers();
            JvmOperation _createQuery = DMDaoGenerator.this.createQuery(forType, e);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_8, _createQuery);
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
  
  private JvmOperation createFindById(final JvmGenericType t, final Entity e) {
    JvmOperation _xblockexpression = null;
    {
      final JvmParameterizedTypeReference ref = this._typeReferences.createTypeRef(t);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("find");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      _builder.append("ById");
      String _string = _builder.toString();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeForName = DMDaoGenerator.this._typeReferences.getTypeForName(int.class, e);
            JvmFormalParameter _parameter = DMDaoGenerator.this._jvmTypesBuilder.toParameter(e, "id", _typeForName);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
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
            DMDaoGenerator.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, ref, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  private JvmOperation createFindAll(final JvmGenericType t, final Entity e) {
    JvmOperation _xblockexpression = null;
    {
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(t);
      final JvmTypeReference tRet = this._typeReferences.getTypeForName(List.class, e, _createTypeRef);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("findAll");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      _builder.append("s");
      String _string = _builder.toString();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  _builder.append("_entityManager.getTransaction().begin();");
                  _builder.newLine();
                  _builder.append("javax.persistence.TypedQuery<");
                  String _simpleName = t.getSimpleName();
                  _builder.append(_simpleName, "");
                  _builder.append("> _q = _entityManager.createQuery(\"select results from ");
                  String _simpleName_1 = t.getSimpleName();
                  _builder.append(_simpleName_1, "");
                  _builder.append(" results\", ");
                  String _simpleName_2 = t.getSimpleName();
                  _builder.append(_simpleName_2, "");
                  _builder.append(".class);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("java.util.List<");
                  String _simpleName_3 = t.getSimpleName();
                  _builder.append(_simpleName_3, "");
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
            DMDaoGenerator.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, tRet, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  private JvmOperation createCreate(final JvmGenericType t, final Entity e) {
    JvmOperation _xblockexpression = null;
    {
      final JvmParameterizedTypeReference ref = this._typeReferences.createTypeRef(t);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("create");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      String _string = _builder.toString();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(int.class, e);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            StringConcatenation _builder = new StringConcatenation();
            String _simpleName = t.getSimpleName();
            String _firstLower = StringExtensions.toFirstLower(_simpleName);
            _builder.append(_firstLower, "");
            String _string = _builder.toString();
            JvmFormalParameter _parameter = DMDaoGenerator.this._jvmTypesBuilder.toParameter(e, _string, ref);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  _builder.append("_entityManager.getTransaction().begin();");
                  _builder.newLine();
                  _builder.append("_entityManager.persist(");
                  String _simpleName = t.getSimpleName();
                  String _firstLower = StringExtensions.toFirstLower(_simpleName);
                  _builder.append(_firstLower, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("_entityManager.getTransaction().commit();");
                  _builder.newLine();
                  _builder.append("_entityManager.close();");
                  _builder.newLine();
                  _builder.append("return ");
                  String _simpleName_1 = t.getSimpleName();
                  String _firstLower_1 = StringExtensions.toFirstLower(_simpleName_1);
                  _builder.append(_firstLower_1, "");
                  _builder.append(".getId();");
                  _builder.newLineIfNotEmpty();
                  String _string = _builder.toString();
                  it.append(_string);
                }
              };
            DMDaoGenerator.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, _typeForName, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  private JvmOperation createModify(final JvmGenericType t, final Entity e) {
    JvmOperation _xblockexpression = null;
    {
      final JvmParameterizedTypeReference ref = this._typeReferences.createTypeRef(t);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("modify");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      String _string = _builder.toString();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            StringConcatenation _builder = new StringConcatenation();
            String _simpleName = t.getSimpleName();
            String _firstLower = StringExtensions.toFirstLower(_simpleName);
            _builder.append(_firstLower, "");
            String _string = _builder.toString();
            JvmFormalParameter _parameter = DMDaoGenerator.this._jvmTypesBuilder.toParameter(e, _string, ref);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  _builder.append("_entityManager.getTransaction().begin();");
                  _builder.newLine();
                  _builder.append("_entityManager.merge(");
                  String _simpleName = t.getSimpleName();
                  String _firstLower = StringExtensions.toFirstLower(_simpleName);
                  _builder.append(_firstLower, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                  _builder.append("_entityManager.getTransaction().commit();");
                  _builder.newLine();
                  _builder.append("_entityManager.close();");
                  _builder.newLine();
                  _builder.append("return ");
                  String _simpleName_1 = t.getSimpleName();
                  String _firstLower_1 = StringExtensions.toFirstLower(_simpleName_1);
                  _builder.append(_firstLower_1, "");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  String _string = _builder.toString();
                  it.append(_string);
                }
              };
            DMDaoGenerator.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, ref, _function);
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
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(void.class, e);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmTypeReference _typeForName = DMDaoGenerator.this._typeReferences.getTypeForName(int.class, e);
          JvmFormalParameter _parameter = DMDaoGenerator.this._jvmTypesBuilder.toParameter(e, "id", _typeForName);
          DMDaoGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
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
          DMDaoGenerator.this._jvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, _typeForName, _function);
    return _method;
  }
  
  private JvmOperation createFind(final JvmGenericType t, final Entity e) {
    JvmOperation _xblockexpression = null;
    {
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(String.class, e);
      JvmTypeReference _typeForName_1 = this._typeReferences.getTypeForName(String.class, e);
      final JvmTypeReference p = this._typeReferences.getTypeForName(Pair.class, e, _typeForName, _typeForName_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("find");
      String _string = _builder.toString();
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(t);
      JvmTypeReference _typeForName_2 = this._typeReferences.getTypeForName(List.class, e, _createTypeRef);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeForName = DMDaoGenerator.this._typeReferences.getTypeForName(String.class, e);
            JvmFormalParameter _parameter = DMDaoGenerator.this._jvmTypesBuilder.toParameter(e, "query", _typeForName);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            EList<JvmFormalParameter> _parameters_1 = it.getParameters();
            JvmTypeReference _typeForName_1 = DMDaoGenerator.this._typeReferences.getTypeForName(List.class, e, p);
            JvmFormalParameter _parameter_1 = DMDaoGenerator.this._jvmTypesBuilder.toParameter(e, "args", _typeForName_1);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  _builder.append("_entityManager.getTransaction().begin();");
                  _builder.newLine();
                  _builder.append("javax.persistence.Query _q = _entityManager.createQuery(query);");
                  _builder.newLine();
                  _builder.append("for(int i = 0; i < args.size(); i++){");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("_q.setParameter(args.get(i).getKey(), String.valueOf(args.get(i).getValue()));  ");
                  _builder.newLine();
                  _builder.append("}");
                  _builder.newLine();
                  _builder.append("List<?> _result = _q.getResultList();");
                  _builder.newLine();
                  _builder.append("_entityManager.getTransaction().commit();");
                  _builder.newLine();
                  _builder.append("_entityManager.close();");
                  _builder.newLine();
                  _builder.append("return _result;");
                  _builder.newLine();
                  String _string = _builder.toString();
                  it.append(_string);
                }
              };
            DMDaoGenerator.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, _typeForName_2, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
  
  private JvmOperation createQuery(final JvmGenericType t, final Entity e) {
    JvmOperation _xblockexpression = null;
    {
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(String.class, e);
      JvmTypeReference _typeForName_1 = this._typeReferences.getTypeForName(String.class, e);
      final JvmTypeReference p = this._typeReferences.getTypeForName(Pair.class, e, _typeForName, _typeForName_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("find");
      String _simpleName = t.getSimpleName();
      _builder.append(_simpleName, "");
      _builder.append("ByMatchingPairs");
      String _string = _builder.toString();
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(t);
      JvmTypeReference _typeForName_2 = this._typeReferences.getTypeForName(List.class, e, _createTypeRef);
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmTypeReference _typeForName = DMDaoGenerator.this._typeReferences.getTypeForName(List.class, e, p);
            JvmFormalParameter _parameter = DMDaoGenerator.this._jvmTypesBuilder.toParameter(e, "pairs", _typeForName);
            DMDaoGenerator.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  it.trace(e);
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("javax.persistence.EntityManager _entityManager = _emf.createEntityManager();");
                  _builder.newLine();
                  _builder.append("_entityManager.getTransaction().begin();");
                  _builder.newLine();
                  _builder.append("javax.persistence.TypedQuery<");
                  String _simpleName = t.getSimpleName();
                  _builder.append(_simpleName, "");
                  _builder.append("> q = _entityManager.createQuery(");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\"Select m \" +");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\"From ");
                  String _simpleName_1 = t.getSimpleName();
                  _builder.append(_simpleName_1, "	");
                  _builder.append(" m \" +");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\"Where `\" + pairs.get(0).getKey() + \"` = \'\" + pairs.get(0).getValue() + \"\'\"");
                  _builder.newLine();
                  _builder.append("\t ");
                  _builder.append(", ");
                  String _simpleName_2 = t.getSimpleName();
                  _builder.append(_simpleName_2, "	 ");
                  _builder.append(".class);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("_entityManager.getTransaction().commit();");
                  _builder.newLine();
                  _builder.append("_entityManager.close();");
                  _builder.newLine();
                  _builder.append("return q.getResultList();");
                  _builder.newLine();
                  String _string = _builder.toString();
                  it.append(_string);
                }
              };
            DMDaoGenerator.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(e, _string, _typeForName_2, _function);
      _xblockexpression = (_method);
    }
    return _xblockexpression;
  }
}
