/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.services.services;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.services.services.Path#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.services.services.ServicesPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject
{
  /**
   * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.services.services.PathSegment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segments</em>' containment reference list.
   * @see org.eclipse.xtext.services.services.ServicesPackage#getPath_Segments()
   * @model containment="true"
   * @generated
   */
  EList<PathSegment> getSegments();

} // Path
