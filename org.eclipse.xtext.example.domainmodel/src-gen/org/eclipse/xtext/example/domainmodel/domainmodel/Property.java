/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.example.domainmodel.domainmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.Property#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.eclipse.xtext.example.domainmodel.domainmodel.Property#getReflectsOn <em>Reflects On</em>}</li>
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

  /**
   * Returns the value of the '<em><b>Reflects On</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reflects On</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reflects On</em>' reference.
   * @see #setReflectsOn(Property)
   * @see org.eclipse.xtext.example.domainmodel.domainmodel.DomainmodelPackage#getProperty_ReflectsOn()
   * @model
   * @generated
   */
  Property getReflectsOn();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.example.domainmodel.domainmodel.Property#getReflectsOn <em>Reflects On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reflects On</em>' reference.
   * @see #getReflectsOn()
   * @generated
   */
  void setReflectsOn(Property value);

} // Property
