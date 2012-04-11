/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.services.services.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.services.services.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicesFactoryImpl extends EFactoryImpl implements ServicesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ServicesFactory init()
  {
    try
    {
      ServicesFactory theServicesFactory = (ServicesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/xtext/services/Services"); 
      if (theServicesFactory != null)
      {
        return theServicesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ServicesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServicesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ServicesPackage.SERVICES_FILE: return createServicesFile();
      case ServicesPackage.COMPONENT: return createComponent();
      case ServicesPackage.SERVICE: return createService();
      case ServicesPackage.REQUIRE_DECLARATION: return createRequireDeclaration();
      case ServicesPackage.IMPORT: return createImport();
      case ServicesPackage.PATH: return createPath();
      case ServicesPackage.PATH_SEGMENT: return createPathSegment();
      case ServicesPackage.PARAMETER_SEGMENT: return createParameterSegment();
      case ServicesPackage.SIMPLE_SEGMENT: return createSimpleSegment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServicesFile createServicesFile()
  {
    ServicesFileImpl servicesFile = new ServicesFileImpl();
    return servicesFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequireDeclaration createRequireDeclaration()
  {
    RequireDeclarationImpl requireDeclaration = new RequireDeclarationImpl();
    return requireDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Path createPath()
  {
    PathImpl path = new PathImpl();
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathSegment createPathSegment()
  {
    PathSegmentImpl pathSegment = new PathSegmentImpl();
    return pathSegment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterSegment createParameterSegment()
  {
    ParameterSegmentImpl parameterSegment = new ParameterSegmentImpl();
    return parameterSegment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSegment createSimpleSegment()
  {
    SimpleSegmentImpl simpleSegment = new SimpleSegmentImpl();
    return simpleSegment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServicesPackage getServicesPackage()
  {
    return (ServicesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ServicesPackage getPackage()
  {
    return ServicesPackage.eINSTANCE;
  }

} //ServicesFactoryImpl
