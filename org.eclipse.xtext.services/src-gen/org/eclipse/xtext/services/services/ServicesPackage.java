/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.services.services;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.services.services.ServicesFactory
 * @model kind="package"
 * @generated
 */
public interface ServicesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "services";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/services/Services";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "services";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServicesPackage eINSTANCE = org.eclipse.xtext.services.services.impl.ServicesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.services.services.impl.ServicesFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.services.services.impl.ServicesFileImpl
   * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getServicesFile()
   * @generated
   */
  int SERVICES_FILE = 0;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICES_FILE__COMPONENT = 0;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICES_FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.services.services.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.services.services.impl.ComponentImpl
   * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 2;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__IMPLEMENTS = 3;

  /**
   * The feature id for the '<em><b>Requires</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__REQUIRES = 4;

  /**
   * The feature id for the '<em><b>Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__SERVICES = 5;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.services.services.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.services.services.impl.ServiceImpl
   * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getService()
   * @generated
   */
  int SERVICE = 2;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__GET = 0;

  /**
   * The feature id for the '<em><b>Post</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__POST = 1;

  /**
   * The feature id for the '<em><b>Put</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__PUT = 2;

  /**
   * The feature id for the '<em><b>Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__DELETE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__TYPE = 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__BODY = 6;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.services.services.impl.RequireDeclarationImpl <em>Require Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.services.services.impl.RequireDeclarationImpl
   * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getRequireDeclaration()
   * @generated
   */
  int REQUIRE_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Require Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.services.services.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.services.services.impl.ImportImpl
   * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 4;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.services.services.impl.PathImpl <em>Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.services.services.impl.PathImpl
   * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getPath()
   * @generated
   */
  int PATH = 5;

  /**
   * The feature id for the '<em><b>Segments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__SEGMENTS = 0;

  /**
   * The number of structural features of the '<em>Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.services.services.impl.PathSegmentImpl <em>Path Segment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.services.services.impl.PathSegmentImpl
   * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getPathSegment()
   * @generated
   */
  int PATH_SEGMENT = 6;

  /**
   * The number of structural features of the '<em>Path Segment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_SEGMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.services.services.impl.ParameterSegmentImpl <em>Parameter Segment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.services.services.impl.ParameterSegmentImpl
   * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getParameterSegment()
   * @generated
   */
  int PARAMETER_SEGMENT = 7;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SEGMENT__PARAM = PATH_SEGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Segment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_SEGMENT_FEATURE_COUNT = PATH_SEGMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.services.services.impl.SimpleSegmentImpl <em>Simple Segment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.services.services.impl.SimpleSegmentImpl
   * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getSimpleSegment()
   * @generated
   */
  int SIMPLE_SEGMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SEGMENT__NAME = PATH_SEGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Segment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SEGMENT_FEATURE_COUNT = PATH_SEGMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.services.services.ServicesFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.eclipse.xtext.services.services.ServicesFile
   * @generated
   */
  EClass getServicesFile();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.services.services.ServicesFile#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see org.eclipse.xtext.services.services.ServicesFile#getComponent()
   * @see #getServicesFile()
   * @generated
   */
  EReference getServicesFile_Component();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.services.services.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.eclipse.xtext.services.services.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.services.services.Component#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see org.eclipse.xtext.services.services.Component#getPackageName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.services.services.Component#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.xtext.services.services.Component#getImports()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Imports();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.services.services.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.services.services.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.services.services.Component#getImplements <em>Implements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Implements</em>'.
   * @see org.eclipse.xtext.services.services.Component#getImplements()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Implements();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.services.services.Component#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requires</em>'.
   * @see org.eclipse.xtext.services.services.Component#getRequires()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Requires();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.services.services.Component#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Services</em>'.
   * @see org.eclipse.xtext.services.services.Component#getServices()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Services();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.services.services.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see org.eclipse.xtext.services.services.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.services.services.Service#isGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.eclipse.xtext.services.services.Service#isGet()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Get();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.services.services.Service#isPost <em>Post</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Post</em>'.
   * @see org.eclipse.xtext.services.services.Service#isPost()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Post();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.services.services.Service#isPut <em>Put</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Put</em>'.
   * @see org.eclipse.xtext.services.services.Service#isPut()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Put();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.services.services.Service#isDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delete</em>'.
   * @see org.eclipse.xtext.services.services.Service#isDelete()
   * @see #getService()
   * @generated
   */
  EAttribute getService_Delete();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.services.services.Service#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.eclipse.xtext.services.services.Service#getName()
   * @see #getService()
   * @generated
   */
  EReference getService_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.services.services.Service#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.xtext.services.services.Service#getType()
   * @see #getService()
   * @generated
   */
  EReference getService_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.services.services.Service#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipse.xtext.services.services.Service#getBody()
   * @see #getService()
   * @generated
   */
  EReference getService_Body();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.services.services.RequireDeclaration <em>Require Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Require Declaration</em>'.
   * @see org.eclipse.xtext.services.services.RequireDeclaration
   * @generated
   */
  EClass getRequireDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.services.services.RequireDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.xtext.services.services.RequireDeclaration#getType()
   * @see #getRequireDeclaration()
   * @generated
   */
  EReference getRequireDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.services.services.RequireDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.services.services.RequireDeclaration#getName()
   * @see #getRequireDeclaration()
   * @generated
   */
  EAttribute getRequireDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.services.services.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.xtext.services.services.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.services.services.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipse.xtext.services.services.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.services.services.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path</em>'.
   * @see org.eclipse.xtext.services.services.Path
   * @generated
   */
  EClass getPath();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.services.services.Path#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Segments</em>'.
   * @see org.eclipse.xtext.services.services.Path#getSegments()
   * @see #getPath()
   * @generated
   */
  EReference getPath_Segments();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.services.services.PathSegment <em>Path Segment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Segment</em>'.
   * @see org.eclipse.xtext.services.services.PathSegment
   * @generated
   */
  EClass getPathSegment();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.services.services.ParameterSegment <em>Parameter Segment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Segment</em>'.
   * @see org.eclipse.xtext.services.services.ParameterSegment
   * @generated
   */
  EClass getParameterSegment();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.services.services.ParameterSegment#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see org.eclipse.xtext.services.services.ParameterSegment#getParam()
   * @see #getParameterSegment()
   * @generated
   */
  EReference getParameterSegment_Param();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.services.services.SimpleSegment <em>Simple Segment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Segment</em>'.
   * @see org.eclipse.xtext.services.services.SimpleSegment
   * @generated
   */
  EClass getSimpleSegment();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.services.services.SimpleSegment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.services.services.SimpleSegment#getName()
   * @see #getSimpleSegment()
   * @generated
   */
  EAttribute getSimpleSegment_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ServicesFactory getServicesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.services.services.impl.ServicesFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.services.services.impl.ServicesFileImpl
     * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getServicesFile()
     * @generated
     */
    EClass SERVICES_FILE = eINSTANCE.getServicesFile();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICES_FILE__COMPONENT = eINSTANCE.getServicesFile_Component();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.services.services.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.services.services.impl.ComponentImpl
     * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__PACKAGE_NAME = eINSTANCE.getComponent_PackageName();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__IMPORTS = eINSTANCE.getComponent_Imports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__IMPLEMENTS = eINSTANCE.getComponent_Implements();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__REQUIRES = eINSTANCE.getComponent_Requires();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__SERVICES = eINSTANCE.getComponent_Services();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.services.services.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.services.services.impl.ServiceImpl
     * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__GET = eINSTANCE.getService_Get();

    /**
     * The meta object literal for the '<em><b>Post</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__POST = eINSTANCE.getService_Post();

    /**
     * The meta object literal for the '<em><b>Put</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__PUT = eINSTANCE.getService_Put();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE__DELETE = eINSTANCE.getService_Delete();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__NAME = eINSTANCE.getService_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__TYPE = eINSTANCE.getService_Type();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__BODY = eINSTANCE.getService_Body();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.services.services.impl.RequireDeclarationImpl <em>Require Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.services.services.impl.RequireDeclarationImpl
     * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getRequireDeclaration()
     * @generated
     */
    EClass REQUIRE_DECLARATION = eINSTANCE.getRequireDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIRE_DECLARATION__TYPE = eINSTANCE.getRequireDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRE_DECLARATION__NAME = eINSTANCE.getRequireDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.services.services.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.services.services.impl.ImportImpl
     * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.services.services.impl.PathImpl <em>Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.services.services.impl.PathImpl
     * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getPath()
     * @generated
     */
    EClass PATH = eINSTANCE.getPath();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH__SEGMENTS = eINSTANCE.getPath_Segments();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.services.services.impl.PathSegmentImpl <em>Path Segment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.services.services.impl.PathSegmentImpl
     * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getPathSegment()
     * @generated
     */
    EClass PATH_SEGMENT = eINSTANCE.getPathSegment();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.services.services.impl.ParameterSegmentImpl <em>Parameter Segment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.services.services.impl.ParameterSegmentImpl
     * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getParameterSegment()
     * @generated
     */
    EClass PARAMETER_SEGMENT = eINSTANCE.getParameterSegment();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_SEGMENT__PARAM = eINSTANCE.getParameterSegment_Param();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.services.services.impl.SimpleSegmentImpl <em>Simple Segment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.services.services.impl.SimpleSegmentImpl
     * @see org.eclipse.xtext.services.services.impl.ServicesPackageImpl#getSimpleSegment()
     * @generated
     */
    EClass SIMPLE_SEGMENT = eINSTANCE.getSimpleSegment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_SEGMENT__NAME = eINSTANCE.getSimpleSegment_Name();

  }

} //ServicesPackage
