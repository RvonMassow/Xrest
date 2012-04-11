package org.eclipse.xtext.example.domainmodel.jvmmodel

import java.util.List
import javax.inject.Inject
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.example.domainmodel.domainmodel.Entity
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.lib.Pair

class DMDaoGenerator {
	
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject extension TypeReferences
	
	def toDaoClass(Entity e, JvmGenericType forType, IJvmDeclaredTypeAcceptor acceptor) {
		if(e.name != null) {
			acceptor.accept(e.toClass(e.fullyQualifiedName.toString + "Dao")).initializeLater [
				members += e.toConstructor() [
					setBody [
						trace(e)
						append(
							'''
							this._emf = javax.persistence.Persistence.createEntityManagerFactory("messageboard");
							'''
						)
					]
				]	
				members += injectedEntityManagerFactory(e)
				members += createFindById(forType, e)
				members += createFindAll(forType, e)	
				members += createCreate(forType, e)
				members += createModify(forType, e)
				members += createDelete(forType, e)
				members += createFind(forType, e)
				members += createQuery(forType, e)
			]
		}
	}
	
	def private injectedEntityManagerFactory(Entity e) {
		e.toField("_emf", "javax.persistence.EntityManagerFactory".getTypeForName(e))
	}
	
	def private createFindById(JvmGenericType t, Entity e){
		val ref = t.createTypeRef
		e.toMethod('''find«t.simpleName»ById'''.toString, ref) [
			visibility = JvmVisibility::PUBLIC
			parameters += e.toParameter("id", typeof(int).getTypeForName(e))
			setBody [
				trace(e)
				append('''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				«t.simpleName» «t.simpleName.toFirstLower» = _entityManager.find(«t.simpleName».class, id);
				_entityManager.getTransaction().commit();
				_entityManager.close();
				return «t.simpleName.toFirstLower»;
	  			'''.toString)
			]
		]
	}
	
	def private createFindAll(JvmGenericType t, Entity e) {
		val tRet = typeof(List).getTypeForName(e, t.createTypeRef)
		e.toMethod('''findAll«t.simpleName»s'''.toString, tRet) [
			visibility = JvmVisibility::PUBLIC
			setBody [
				trace(e)
				append('''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				javax.persistence.TypedQuery<«t.simpleName»> _q = _entityManager.createQuery("select results from «t.simpleName» results", «t.simpleName».class);
				java.util.List<«t.simpleName»> _results = _q.getResultList();
				_entityManager.getTransaction().commit();
				_entityManager.close();
				return _results;
	  			'''.toString)
			]
		]
	}
	
	def private createCreate(JvmGenericType t, Entity e) {
		val ref = t.createTypeRef
		e.toMethod('''create«t.simpleName»'''.toString, typeof(int).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, ref)
			setBody [
				trace(e)
				append('''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				_entityManager.persist(«t.simpleName.toFirstLower»);
				_entityManager.getTransaction().commit();
				_entityManager.close();
				return «t.simpleName.toFirstLower».getId();
	  			'''.toString)
	  		]
		]
	}
	
	def private createModify(JvmGenericType t, Entity e) {
		val ref = t.createTypeRef
		e.toMethod('''modify«t.simpleName»'''.toString, ref) [
			visibility = JvmVisibility::PUBLIC
			parameters += e.toParameter('''«t.simpleName.toFirstLower»'''.toString, ref)
			setBody [
				trace(e)
				append('''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				_entityManager.merge(«t.simpleName.toFirstLower»);
				_entityManager.getTransaction().commit();
				_entityManager.close();
				return «t.simpleName.toFirstLower»;
	  			'''.toString)
	  		]
		]
	}
	
	def private createDelete(JvmGenericType t, Entity e) {
		e.toMethod('''delete«t.simpleName»'''.toString, typeof(void).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			parameters += e.toParameter("id", typeof(int).getTypeForName(e))
			setBody [
				trace(e)
				append('''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				«t.simpleName» _«t.simpleName.toFirstLower» = _entityManager.find(«t.simpleName».class, id);
				_entityManager.remove(_«t.simpleName.toFirstLower»);
				_entityManager.getTransaction().commit();
				_entityManager.close();
	  			'''.toString)
	  		]
		]
	}
	
	def private createFind(JvmGenericType t, Entity e){
		val p = typeof(Pair).getTypeForName(e, typeof(String).getTypeForName(e), typeof(String).getTypeForName(e))
		e.toMethod('''find'''.toString, typeof(List).getTypeForName(e)) [
			visibility = JvmVisibility::PUBLIC
			parameters += e.toParameter("query", typeof(String).getTypeForName(e))
			parameters += e.toParameter("args", typeof(List).getTypeForName(e, p))
			setBody [
				trace(e)
				append('''
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				javax.persistence.Query _q = _entityManager.createQuery(query);
				for(int i = 0; i < args.size(); i++){
					_q.setParameter(args.get(i).getKey(), String.valueOf(args.get(i).getValue()));  
				}
				List<?> _result = _q.getResultList();
				_entityManager.getTransaction().commit();
				_entityManager.close();
				return _result;
	 			'''.toString)
	 		]
		]
	}	
	
	
	def private createQuery(JvmGenericType t, Entity e){
		val p = typeof(Pair).getTypeForName(e, typeof(String).getTypeForName(e), typeof(String).getTypeForName(e))
		e.toMethod('''find«t.simpleName»ByMatchingPairs'''.toString, typeof(List).getTypeForName(e, t.createTypeRef())) [
			visibility = JvmVisibility::PUBLIC
			parameters += e.toParameter("pairs", typeof(List).getTypeForName(e, p))
			setBody [
				trace(e)
				append('''
				String query = "Select m From «t.simpleName» m Where";
				for(int i = 0 ; i < pairs.size() ; i++) {
					query += " m." + pairs.get(i).getKey() +  " = '" + pairs.get(0).getValue() + "'";
					if(i < pairs.size() - 1) {
						query += " and";
					}
				}
				javax.persistence.EntityManager _entityManager = _emf.createEntityManager();
				_entityManager.getTransaction().begin();
				javax.persistence.TypedQuery<«t.simpleName»> q = _entityManager.createQuery(query, «t.simpleName».class);
				List<«t.simpleName»> _results = q.getResultList();
				_entityManager.getTransaction().commit();
				_entityManager.close();
				return _results;
	  			'''.toString)
	  		]
		]
	}
}