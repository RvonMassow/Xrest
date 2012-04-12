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

import org.eclipse.xtext.common.types.JvmFormalParameter;

import org.eclipse.xtext.services.services.ParameterSegment;
import org.eclipse.xtext.services.services.ServicesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.services.services.impl.ParameterSegmentImpl#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterSegmentImpl extends PathSegmentImpl implements ParameterSegment
{
  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected JvmFormalParameter param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterSegmentImpl()
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
    return ServicesPackage.Literals.PARAMETER_SEGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmFormalParameter getParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParam(JvmFormalParameter newParam, NotificationChain msgs)
  {
    JvmFormalParameter oldParam = param;
    param = newParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicesPackage.PARAMETER_SEGMENT__PARAM, oldParam, newParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(JvmFormalParameter newParam)
  {
    if (newParam != param)
    {
      NotificationChain msgs = null;
      if (param != null)
        msgs = ((InternalEObject)param).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicesPackage.PARAMETER_SEGMENT__PARAM, null, msgs);
      if (newParam != null)
        msgs = ((InternalEObject)newParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicesPackage.PARAMETER_SEGMENT__PARAM, null, msgs);
      msgs = basicSetParam(newParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.PARAMETER_SEGMENT__PARAM, newParam, newParam));
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
      case ServicesPackage.PARAMETER_SEGMENT__PARAM:
        return basicSetParam(null, msgs);
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
      case ServicesPackage.PARAMETER_SEGMENT__PARAM:
        return getParam();
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
      case ServicesPackage.PARAMETER_SEGMENT__PARAM:
        setParam((JvmFormalParameter)newValue);
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
      case ServicesPackage.PARAMETER_SEGMENT__PARAM:
        setParam((JvmFormalParameter)null);
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
      case ServicesPackage.PARAMETER_SEGMENT__PARAM:
        return param != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterSegmentImpl
