/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.services.services;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.services.services.Service#isService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.Service#isGet <em>Get</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.Service#isPost <em>Post</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.Service#isPut <em>Put</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.Service#isDelete <em>Delete</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.Service#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.Service#getParams <em>Params</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.Service#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.services.services.Service#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.services.services.ServicesPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject
{
  /**
   * Returns the value of the '<em><b>Service</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' attribute.
   * @see #setService(boolean)
   * @see org.eclipse.xtext.services.services.ServicesPackage#getService_Service()
   * @model
   * @generated
   */
  boolean isService();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.services.services.Service#isService <em>Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' attribute.
   * @see #isService()
   * @generated
   */
  void setService(boolean value);

  /**
   * Returns the value of the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get</em>' attribute.
   * @see #setGet(boolean)
   * @see org.eclipse.xtext.services.services.ServicesPackage#getService_Get()
   * @model
   * @generated
   */
  boolean isGet();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.services.services.Service#isGet <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get</em>' attribute.
   * @see #isGet()
   * @generated
   */
  void setGet(boolean value);

  /**
   * Returns the value of the '<em><b>Post</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post</em>' attribute.
   * @see #setPost(boolean)
   * @see org.eclipse.xtext.services.services.ServicesPackage#getService_Post()
   * @model
   * @generated
   */
  boolean isPost();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.services.services.Service#isPost <em>Post</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post</em>' attribute.
   * @see #isPost()
   * @generated
   */
  void setPost(boolean value);

  /**
   * Returns the value of the '<em><b>Put</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Put</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Put</em>' attribute.
   * @see #setPut(boolean)
   * @see org.eclipse.xtext.services.services.ServicesPackage#getService_Put()
   * @model
   * @generated
   */
  boolean isPut();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.services.services.Service#isPut <em>Put</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Put</em>' attribute.
   * @see #isPut()
   * @generated
   */
  void setPut(boolean value);

  /**
   * Returns the value of the '<em><b>Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete</em>' attribute.
   * @see #setDelete(boolean)
   * @see org.eclipse.xtext.services.services.ServicesPackage#getService_Delete()
   * @model
   * @generated
   */
  boolean isDelete();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.services.services.Service#isDelete <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' attribute.
   * @see #isDelete()
   * @generated
   */
  void setDelete(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.services.services.ServicesPackage#getService_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.services.services.Service#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmFormalParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.eclipse.xtext.services.services.ServicesPackage#getService_Params()
   * @model containment="true"
   * @generated
   */
  EList<JvmFormalParameter> getParams();

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
   * @see org.eclipse.xtext.services.services.ServicesPackage#getService_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.services.services.Service#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XExpression)
   * @see org.eclipse.xtext.services.services.ServicesPackage#getService_Body()
   * @model containment="true"
   * @generated
   */
  XExpression getBody();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.services.services.Service#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XExpression value);

} // Service
