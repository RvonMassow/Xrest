/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.example.domainmodel.domainmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage;
import org.eclipse.xtext.example.domainmodel.domainmodel.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.impl.PropertyImpl#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.impl.PropertyImpl#getReflectsOn <em>Reflects On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends FeatureImpl implements Property
{
  /**
   * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected Property mappedBy;

  /**
   * The cached value of the '{@link #getReflectsOn() <em>Reflects On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReflectsOn()
   * @generated
   * @ordered
   */
  protected Property reflectsOn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return DomainmodelPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getMappedBy()
  {
    if (mappedBy != null && mappedBy.eIsProxy())
    {
      InternalEObject oldMappedBy = (InternalEObject)mappedBy;
      mappedBy = (Property)eResolveProxy(oldMappedBy);
      if (mappedBy != oldMappedBy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.PROPERTY__MAPPED_BY, oldMappedBy, mappedBy));
      }
    }
    return mappedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetMappedBy()
  {
    return mappedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappedBy(Property newMappedBy)
  {
    Property oldMappedBy = mappedBy;
    mappedBy = newMappedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PROPERTY__MAPPED_BY, oldMappedBy, mappedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getReflectsOn()
  {
    if (reflectsOn != null && reflectsOn.eIsProxy())
    {
      InternalEObject oldReflectsOn = (InternalEObject)reflectsOn;
      reflectsOn = (Property)eResolveProxy(oldReflectsOn);
      if (reflectsOn != oldReflectsOn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainmodelPackage.PROPERTY__REFLECTS_ON, oldReflectsOn, reflectsOn));
      }
    }
    return reflectsOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetReflectsOn()
  {
    return reflectsOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReflectsOn(Property newReflectsOn)
  {
    Property oldReflectsOn = reflectsOn;
    reflectsOn = newReflectsOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainmodelPackage.PROPERTY__REFLECTS_ON, oldReflectsOn, reflectsOn));
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
      case DomainmodelPackage.PROPERTY__MAPPED_BY:
        if (resolve) return getMappedBy();
        return basicGetMappedBy();
      case DomainmodelPackage.PROPERTY__REFLECTS_ON:
        if (resolve) return getReflectsOn();
        return basicGetReflectsOn();
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
      case DomainmodelPackage.PROPERTY__MAPPED_BY:
        setMappedBy((Property)newValue);
        return;
      case DomainmodelPackage.PROPERTY__REFLECTS_ON:
        setReflectsOn((Property)newValue);
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
      case DomainmodelPackage.PROPERTY__MAPPED_BY:
        setMappedBy((Property)null);
        return;
      case DomainmodelPackage.PROPERTY__REFLECTS_ON:
        setReflectsOn((Property)null);
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
      case DomainmodelPackage.PROPERTY__MAPPED_BY:
        return mappedBy != null;
      case DomainmodelPackage.PROPERTY__REFLECTS_ON:
        return reflectsOn != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertyImpl
