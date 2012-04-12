/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.services.services;

import org.eclipse.xtext.common.types.JvmFormalParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.services.services.ParameterSegment#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.services.services.ServicesPackage#getParameterSegment()
 * @model
 * @generated
 */
public interface ParameterSegment extends PathSegment
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(JvmFormalParameter)
   * @see org.eclipse.xtext.services.services.ServicesPackage#getParameterSegment_Param()
   * @model containment="true"
   * @generated
   */
  JvmFormalParameter getParam();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.services.services.ParameterSegment#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(JvmFormalParameter value);

} // ParameterSegment
