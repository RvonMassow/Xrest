/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.example.domainmodel.domainmodel;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.Property#isDerive <em>Derive</em>}</li>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.Property#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.Property#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Feature
{
  /**
   * Returns the value of the '<em><b>Derive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Derive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Derive</em>' attribute.
   * @see #setDerive(boolean)
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getProperty_Derive()
   * @model
   * @generated
   */
  boolean isDerive();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.domainmodel.domainmodel.Property#isDerive <em>Derive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Derive</em>' attribute.
   * @see #isDerive()
   * @generated
   */
  void setDerive(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getProperty_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.domainmodel.domainmodel.Property#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' reference.
   * @see #setMappedBy(Property)
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getProperty_MappedBy()
   * @model
   * @generated
   */
  Property getMappedBy();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.domainmodel.domainmodel.Property#getMappedBy <em>Mapped By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' reference.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(Property value);

} // Property
