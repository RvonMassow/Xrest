/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.services.services.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.services.services.Path;
import org.eclipse.xtext.services.services.Service;
import org.eclipse.xtext.services.services.ServicesPackage;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#isGet <em>Get</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#isPost <em>Post</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#isPut <em>Put</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service
{
  /**
   * The default value of the '{@link #isGet() <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGet()
   * @generated
   * @ordered
   */
  protected static final boolean GET_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGet() <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGet()
   * @generated
   * @ordered
   */
  protected boolean get = GET_EDEFAULT;

  /**
   * The default value of the '{@link #isPost() <em>Post</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPost()
   * @generated
   * @ordered
   */
  protected static final boolean POST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPost() <em>Post</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPost()
   * @generated
   * @ordered
   */
  protected boolean post = POST_EDEFAULT;

  /**
   * The default value of the '{@link #isPut() <em>Put</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPut()
   * @generated
   * @ordered
   */
  protected static final boolean PUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPut() <em>Put</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPut()
   * @generated
   * @ordered
   */
  protected boolean put = PUT_EDEFAULT;

  /**
   * The default value of the '{@link #isDelete() <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelete()
   * @generated
   * @ordered
   */
  protected static final boolean DELETE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDelete() <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDelete()
   * @generated
   * @ordered
   */
  protected boolean delete = DELETE_EDEFAULT;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Path name;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected XExpression body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ServicesPackage.Literals.SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGet()
  {
    return get;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGet(boolean newGet)
  {
    boolean oldGet = get;
    get = newGet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__GET, oldGet, get));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPost()
  {
    return post;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPost(boolean newPost)
  {
    boolean oldPost = post;
    post = newPost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__POST, oldPost, post));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPut()
  {
    return put;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPut(boolean newPut)
  {
    boolean oldPut = put;
    put = newPut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__PUT, oldPut, put));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDelete()
  {
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelete(boolean newDelete)
  {
    boolean oldDelete = delete;
    delete = newDelete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__DELETE, oldDelete, delete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Path getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Path newName, NotificationChain msgs)
  {
    Path oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Path newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicesPackage.SERVICE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicesPackage.SERVICE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs)
  {
    JvmTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicesPackage.SERVICE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicesPackage.SERVICE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(XExpression newBody, NotificationChain msgs)
  {
    XExpression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(XExpression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicesPackage.SERVICE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicesPackage.SERVICE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ServicesPackage.SERVICE__NAME:
        return basicSetName(null, msgs);
      case ServicesPackage.SERVICE__TYPE:
        return basicSetType(null, msgs);
      case ServicesPackage.SERVICE__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ServicesPackage.SERVICE__GET:
        return isGet();
      case ServicesPackage.SERVICE__POST:
        return isPost();
      case ServicesPackage.SERVICE__PUT:
        return isPut();
      case ServicesPackage.SERVICE__DELETE:
        return isDelete();
      case ServicesPackage.SERVICE__NAME:
        return getName();
      case ServicesPackage.SERVICE__TYPE:
        return getType();
      case ServicesPackage.SERVICE__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ServicesPackage.SERVICE__GET:
        setGet((Boolean)newValue);
        return;
      case ServicesPackage.SERVICE__POST:
        setPost((Boolean)newValue);
        return;
      case ServicesPackage.SERVICE__PUT:
        setPut((Boolean)newValue);
        return;
      case ServicesPackage.SERVICE__DELETE:
        setDelete((Boolean)newValue);
        return;
      case ServicesPackage.SERVICE__NAME:
        setName((Path)newValue);
        return;
      case ServicesPackage.SERVICE__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case ServicesPackage.SERVICE__BODY:
        setBody((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ServicesPackage.SERVICE__GET:
        setGet(GET_EDEFAULT);
        return;
      case ServicesPackage.SERVICE__POST:
        setPost(POST_EDEFAULT);
        return;
      case ServicesPackage.SERVICE__PUT:
        setPut(PUT_EDEFAULT);
        return;
      case ServicesPackage.SERVICE__DELETE:
        setDelete(DELETE_EDEFAULT);
        return;
      case ServicesPackage.SERVICE__NAME:
        setName((Path)null);
        return;
      case ServicesPackage.SERVICE__TYPE:
        setType((JvmTypeReference)null);
        return;
      case ServicesPackage.SERVICE__BODY:
        setBody((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ServicesPackage.SERVICE__GET:
        return get != GET_EDEFAULT;
      case ServicesPackage.SERVICE__POST:
        return post != POST_EDEFAULT;
      case ServicesPackage.SERVICE__PUT:
        return put != PUT_EDEFAULT;
      case ServicesPackage.SERVICE__DELETE:
        return delete != DELETE_EDEFAULT;
      case ServicesPackage.SERVICE__NAME:
        return name != null;
      case ServicesPackage.SERVICE__TYPE:
        return type != null;
      case ServicesPackage.SERVICE__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (get: ");
    result.append(get);
    result.append(", post: ");
    result.append(post);
    result.append(", put: ");
    result.append(put);
    result.append(", delete: ");
    result.append(delete);
    result.append(')');
    return result.toString();
  }

} //ServiceImpl
