/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.services.services.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

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
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#isService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#isGet <em>Get</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#isPost <em>Post</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ServiceImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service
{
  /**
   * The default value of the '{@link #isService() <em>Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isService()
   * @generated
   * @ordered
   */
  protected static final boolean SERVICE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isService() <em>Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isService()
   * @generated
   * @ordered
   */
  protected boolean service = SERVICE_EDEFAULT;

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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<JvmFormalParameter> params;

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
   * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUses()
   * @generated
   * @ordered
   */
  protected EList<JvmTypeReference> uses;

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
  public boolean isService()
  {
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setService(boolean newService)
  {
    boolean oldService = service;
    service = newService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__SERVICE, oldService, service));
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
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmFormalParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, ServicesPackage.SERVICE__PARAMS);
    }
    return params;
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
  public EList<JvmTypeReference> getUses()
  {
    if (uses == null)
    {
      uses = new EObjectContainmentEList<JvmTypeReference>(JvmTypeReference.class, this, ServicesPackage.SERVICE__USES);
    }
    return uses;
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
      case ServicesPackage.SERVICE__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case ServicesPackage.SERVICE__TYPE:
        return basicSetType(null, msgs);
      case ServicesPackage.SERVICE__USES:
        return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
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
      case ServicesPackage.SERVICE__SERVICE:
        return isService();
      case ServicesPackage.SERVICE__GET:
        return isGet();
      case ServicesPackage.SERVICE__POST:
        return isPost();
      case ServicesPackage.SERVICE__NAME:
        return getName();
      case ServicesPackage.SERVICE__PARAMS:
        return getParams();
      case ServicesPackage.SERVICE__TYPE:
        return getType();
      case ServicesPackage.SERVICE__USES:
        return getUses();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ServicesPackage.SERVICE__SERVICE:
        setService((Boolean)newValue);
        return;
      case ServicesPackage.SERVICE__GET:
        setGet((Boolean)newValue);
        return;
      case ServicesPackage.SERVICE__POST:
        setPost((Boolean)newValue);
        return;
      case ServicesPackage.SERVICE__NAME:
        setName((String)newValue);
        return;
      case ServicesPackage.SERVICE__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends JvmFormalParameter>)newValue);
        return;
      case ServicesPackage.SERVICE__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case ServicesPackage.SERVICE__USES:
        getUses().clear();
        getUses().addAll((Collection<? extends JvmTypeReference>)newValue);
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
      case ServicesPackage.SERVICE__SERVICE:
        setService(SERVICE_EDEFAULT);
        return;
      case ServicesPackage.SERVICE__GET:
        setGet(GET_EDEFAULT);
        return;
      case ServicesPackage.SERVICE__POST:
        setPost(POST_EDEFAULT);
        return;
      case ServicesPackage.SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ServicesPackage.SERVICE__PARAMS:
        getParams().clear();
        return;
      case ServicesPackage.SERVICE__TYPE:
        setType((JvmTypeReference)null);
        return;
      case ServicesPackage.SERVICE__USES:
        getUses().clear();
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
      case ServicesPackage.SERVICE__SERVICE:
        return service != SERVICE_EDEFAULT;
      case ServicesPackage.SERVICE__GET:
        return get != GET_EDEFAULT;
      case ServicesPackage.SERVICE__POST:
        return post != POST_EDEFAULT;
      case ServicesPackage.SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ServicesPackage.SERVICE__PARAMS:
        return params != null && !params.isEmpty();
      case ServicesPackage.SERVICE__TYPE:
        return type != null;
      case ServicesPackage.SERVICE__USES:
        return uses != null && !uses.isEmpty();
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
    result.append(" (service: ");
    result.append(service);
    result.append(", get: ");
    result.append(get);
    result.append(", post: ");
    result.append(post);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ServiceImpl
