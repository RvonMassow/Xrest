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
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DomainmodelPackage.PROPERTY__MAPPED_BY:
        if (resolve) return getMappedBy();
        return basicGetMappedBy();
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
    }
    return super.eIsSet(featureID);
  }

} //PropertyImpl
