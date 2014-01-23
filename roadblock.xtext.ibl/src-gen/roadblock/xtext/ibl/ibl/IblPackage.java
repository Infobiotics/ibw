/**
 */
package roadblock.xtext.ibl.ibl;

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
 * @see roadblock.xtext.ibl.ibl.IblFactory
 * @model kind="package"
 * @generated
 */
public interface IblPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ibl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.roadblock/ibl/Ibl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ibl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IblPackage eINSTANCE = roadblock.xtext.ibl.ibl.impl.IblPackageImpl.init();

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ModelImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MEMBERS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ModelMemberImpl <em>Model Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ModelMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getModelMember()
   * @generated
   */
  int MODEL_MEMBER = 1;

  /**
   * The number of structural features of the '<em>Model Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ImportStatementImpl <em>Import Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ImportStatementImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getImportStatement()
   * @generated
   */
  int IMPORT_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>Import Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionDefinition()
   * @generated
   */
  int FUNCTION_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__NAME = MODEL_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__FUNCTION_BODY = MODEL_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__USES = MODEL_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ProcessBodyImpl <em>Process Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ProcessBodyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProcessBody()
   * @generated
   */
  int PROCESS_BODY = 4;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_BODY__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_BODY__MEMBERS = 1;

  /**
   * The number of structural features of the '<em>Process Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.SystemBodyImpl <em>System Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.SystemBodyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getSystemBody()
   * @generated
   */
  int SYSTEM_BODY = 5;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_BODY__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_BODY__MEMBERS = 1;

  /**
   * The number of structural features of the '<em>System Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.PlasmidBodyImpl <em>Plasmid Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.PlasmidBodyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPlasmidBody()
   * @generated
   */
  int PLASMID_BODY = 6;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLASMID_BODY__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLASMID_BODY__MEMBERS = 1;

  /**
   * The number of structural features of the '<em>Plasmid Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLASMID_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ChromosomeBodyImpl <em>Chromosome Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ChromosomeBodyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getChromosomeBody()
   * @generated
   */
  int CHROMOSOME_BODY = 7;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHROMOSOME_BODY__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHROMOSOME_BODY__MEMBERS = 1;

  /**
   * The number of structural features of the '<em>Chromosome Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHROMOSOME_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.CellBodyImpl <em>Cell Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.CellBodyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCellBody()
   * @generated
   */
  int CELL_BODY = 8;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_BODY__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_BODY__MEMBERS = 1;

  /**
   * The number of structural features of the '<em>Cell Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RegionBodyImpl <em>Region Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RegionBodyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRegionBody()
   * @generated
   */
  int REGION_BODY = 9;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_BODY__PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_BODY__MEMBERS = 1;

  /**
   * The number of structural features of the '<em>Region Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyImpl <em>Custom Function Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCustomFunctionBody()
   * @generated
   */
  int CUSTOM_FUNCTION_BODY = 10;

  /**
   * The feature id for the '<em><b>Function Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FUNCTION_BODY__FUNCTION_TYPE = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FUNCTION_BODY__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FUNCTION_BODY__MEMBERS = 2;

  /**
   * The number of structural features of the '<em>Custom Function Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FUNCTION_BODY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ProcessBodyMemberImpl <em>Process Body Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ProcessBodyMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProcessBodyMember()
   * @generated
   */
  int PROCESS_BODY_MEMBER = 11;

  /**
   * The number of structural features of the '<em>Process Body Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_BODY_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.SystemBodyMemberImpl <em>System Body Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.SystemBodyMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getSystemBodyMember()
   * @generated
   */
  int SYSTEM_BODY_MEMBER = 12;

  /**
   * The number of structural features of the '<em>System Body Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_BODY_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.PlasmidBodyMemberImpl <em>Plasmid Body Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.PlasmidBodyMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPlasmidBodyMember()
   * @generated
   */
  int PLASMID_BODY_MEMBER = 13;

  /**
   * The number of structural features of the '<em>Plasmid Body Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLASMID_BODY_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ChromosomeBodyMemberImpl <em>Chromosome Body Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ChromosomeBodyMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getChromosomeBodyMember()
   * @generated
   */
  int CHROMOSOME_BODY_MEMBER = 14;

  /**
   * The number of structural features of the '<em>Chromosome Body Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHROMOSOME_BODY_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.CellBodyMemberImpl <em>Cell Body Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.CellBodyMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCellBodyMember()
   * @generated
   */
  int CELL_BODY_MEMBER = 15;

  /**
   * The number of structural features of the '<em>Cell Body Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_BODY_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RegionBodyMemberImpl <em>Region Body Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RegionBodyMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRegionBodyMember()
   * @generated
   */
  int REGION_BODY_MEMBER = 16;

  /**
   * The number of structural features of the '<em>Region Body Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_BODY_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyMemberImpl <em>Custom Function Body Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCustomFunctionBodyMember()
   * @generated
   */
  int CUSTOM_FUNCTION_BODY_MEMBER = 17;

  /**
   * The number of structural features of the '<em>Custom Function Body Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FUNCTION_BODY_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionParameterMemberImpl <em>Function Parameter Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.FunctionParameterMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionParameterMember()
   * @generated
   */
  int FUNCTION_PARAMETER_MEMBER = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_MEMBER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_MEMBER__COLLECTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_MEMBER__NAME = 2;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_MEMBER__SCOPE = 3;

  /**
   * The number of structural features of the '<em>Function Parameter Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_MEMBER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionUseMemberImpl <em>Function Use Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.FunctionUseMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionUseMember()
   * @generated
   */
  int FUNCTION_USE_MEMBER = 19;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_USE_MEMBER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_USE_MEMBER__NAME = 1;

  /**
   * The number of structural features of the '<em>Function Use Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_USE_MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl <em>Device Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getDeviceDefinition()
   * @generated
   */
  int DEVICE_DEFINITION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__NAME = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__PARTS = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__INPUT = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Outputput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__OUTPUTPUT = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__MEMBERS = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Device Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION_FEATURE_COUNT = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.DeviceMembersImpl <em>Device Members</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.DeviceMembersImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getDeviceMembers()
   * @generated
   */
  int DEVICE_MEMBERS = 21;

  /**
   * The number of structural features of the '<em>Device Members</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_MEMBERS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ProcessInstantiationImpl <em>Process Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ProcessInstantiationImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProcessInstantiation()
   * @generated
   */
  int PROCESS_INSTANTIATION = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_INSTANTIATION__NAME = PROCESS_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_INSTANTIATION__CONSTRUCTOR = PROCESS_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_INSTANTIATION__PARAMETERS = PROCESS_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Process Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_INSTANTIATION_FEATURE_COUNT = PROCESS_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.SystemInstantiationImpl <em>System Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.SystemInstantiationImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getSystemInstantiation()
   * @generated
   */
  int SYSTEM_INSTANTIATION = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_INSTANTIATION__NAME = PLASMID_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_INSTANTIATION__CONSTRUCTOR = PLASMID_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_INSTANTIATION__PARAMETERS = PLASMID_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>System Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_INSTANTIATION_FEATURE_COUNT = PLASMID_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.PlasmidInstantiationImpl <em>Plasmid Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.PlasmidInstantiationImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPlasmidInstantiation()
   * @generated
   */
  int PLASMID_INSTANTIATION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLASMID_INSTANTIATION__NAME = CELL_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLASMID_INSTANTIATION__CONSTRUCTOR = CELL_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLASMID_INSTANTIATION__PARAMETERS = CELL_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Plasmid Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLASMID_INSTANTIATION_FEATURE_COUNT = CELL_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ChromosomeInstantiationImpl <em>Chromosome Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ChromosomeInstantiationImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getChromosomeInstantiation()
   * @generated
   */
  int CHROMOSOME_INSTANTIATION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHROMOSOME_INSTANTIATION__NAME = CELL_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHROMOSOME_INSTANTIATION__CONSTRUCTOR = CELL_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHROMOSOME_INSTANTIATION__PARAMETERS = CELL_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Chromosome Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHROMOSOME_INSTANTIATION_FEATURE_COUNT = CELL_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.CellInstantiationImpl <em>Cell Instantiation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.CellInstantiationImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCellInstantiation()
   * @generated
   */
  int CELL_INSTANTIATION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_INSTANTIATION__NAME = REGION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_INSTANTIATION__CONSTRUCTOR = REGION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_INSTANTIATION__PARAMETERS = REGION_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cell Instantiation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CELL_INSTANTIATION_FEATURE_COUNT = REGION_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RuleObjectImpl <em>Rule Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RuleObjectImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRuleObject()
   * @generated
   */
  int RULE_OBJECT = 42;

  /**
   * The number of structural features of the '<em>Rule Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableComplexImpl <em>Variable Complex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableComplexImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableComplex()
   * @generated
   */
  int VARIABLE_COMPLEX = 27;

  /**
   * The feature id for the '<em><b>Components</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_COMPLEX__COMPONENTS = RULE_OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Complex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_COMPLEX_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableAssignmentObjectImpl <em>Variable Assignment Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableAssignmentObjectImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableAssignmentObject()
   * @generated
   */
  int VARIABLE_ASSIGNMENT_OBJECT = 36;

  /**
   * The number of structural features of the '<em>Variable Assignment Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableAttributeImpl <em>Variable Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableAttributeImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableAttribute()
   * @generated
   */
  int VARIABLE_ATTRIBUTE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE__NAME = VARIABLE_ASSIGNMENT_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE__COMPLEX = VARIABLE_ASSIGNMENT_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE__ATTRIBUTE = VARIABLE_ASSIGNMENT_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE_FEATURE_COUNT = VARIABLE_ASSIGNMENT_OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinition()
   * @generated
   */
  int VARIABLE_DEFINITION = 29;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__DEFINITION = PROCESS_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__QUALIFIER = PROCESS_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = PROCESS_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionBuiltInImpl <em>Variable Definition Built In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionBuiltInImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinitionBuiltIn()
   * @generated
   */
  int VARIABLE_DEFINITION_BUILT_IN = 30;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BUILT_IN__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BUILT_IN__NAME = 1;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BUILT_IN__COMPLEX = 2;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BUILT_IN__CONSTRUCTOR = 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BUILT_IN__PARAMETERS = 4;

  /**
   * The number of structural features of the '<em>Variable Definition Built In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BUILT_IN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionUserDefinedImpl <em>Variable Definition User Defined</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionUserDefinedImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinitionUserDefined()
   * @generated
   */
  int VARIABLE_DEFINITION_USER_DEFINED = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_USER_DEFINED__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_USER_DEFINED__NAME = 1;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_USER_DEFINED__CONSTRUCTOR = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_USER_DEFINED__PARAMETERS = 3;

  /**
   * The number of structural features of the '<em>Variable Definition User Defined</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_USER_DEFINED_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionCollectionImpl <em>Variable Definition Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionCollectionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinitionCollection()
   * @generated
   */
  int VARIABLE_DEFINITION_COLLECTION = 32;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_COLLECTION__COLLECTION = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_COLLECTION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_COLLECTION__NAME = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_COLLECTION__VALUE = 3;

  /**
   * The number of structural features of the '<em>Variable Definition Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_COLLECTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionBasicImpl <em>Variable Definition Basic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionBasicImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinitionBasic()
   * @generated
   */
  int VARIABLE_DEFINITION_BASIC = 33;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BASIC__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BASIC__NAME = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BASIC__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Variable Definition Basic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_BASIC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ParameterAssignmentImpl <em>Parameter Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ParameterAssignmentImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getParameterAssignment()
   * @generated
   */
  int PARAMETER_ASSIGNMENT = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSIGNMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Parameter Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableAssignmentImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableAssignment()
   * @generated
   */
  int VARIABLE_ASSIGNMENT = 35;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__VARIABLE = PROCESS_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__EXPRESSION = PROCESS_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_FEATURE_COUNT = PROCESS_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableExpressionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableExpression()
   * @generated
   */
  int VARIABLE_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION__MEMBERS = 0;

  /**
   * The number of structural features of the '<em>Variable Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableExpressionObjectImpl <em>Variable Expression Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableExpressionObjectImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableExpressionObject()
   * @generated
   */
  int VARIABLE_EXPRESSION_OBJECT = 38;

  /**
   * The number of structural features of the '<em>Variable Expression Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.AtomicVariableExpressionObjectImpl <em>Atomic Variable Expression Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.AtomicVariableExpressionObjectImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getAtomicVariableExpressionObject()
   * @generated
   */
  int ATOMIC_VARIABLE_EXPRESSION_OBJECT = 39;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_VARIABLE_EXPRESSION_OBJECT__VARIABLE = VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_VARIABLE_EXPRESSION_OBJECT__ATTRIBUTE = VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_VARIABLE_EXPRESSION_OBJECT__COMPLEX = VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_VARIABLE_EXPRESSION_OBJECT__VALUE = VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_VARIABLE_EXPRESSION_OBJECT__QUANTITY = VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_VARIABLE_EXPRESSION_OBJECT__STRING = VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Atomic Variable Expression Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT = VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.CompoundVariableExpressionObjectImpl <em>Compound Variable Expression Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.CompoundVariableExpressionObjectImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCompoundVariableExpressionObject()
   * @generated
   */
  int COMPOUND_VARIABLE_EXPRESSION_OBJECT = 40;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_VARIABLE_EXPRESSION_OBJECT__LIST = VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compound Variable Expression Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT = VARIABLE_EXPRESSION_OBJECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl <em>Rule Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRuleDefinition()
   * @generated
   */
  int RULE_DEFINITION = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION__NAME = PROCESS_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION__LHS = PROCESS_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Reversible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION__REVERSIBLE = PROCESS_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION__RHS = PROCESS_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Rule Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION_FEATURE_COUNT = PROCESS_BODY_MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ATGCDefinitionImpl <em>ATGC Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ATGCDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getATGCDefinition()
   * @generated
   */
  int ATGC_DEFINITION = 43;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATGC_DEFINITION__COMMAND = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATGC_DEFINITION__ARGUMENTS = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ATGC Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATGC_DEFINITION_FEATURE_COUNT = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPropertyDefinition()
   * @generated
   */
  int PROPERTY_DEFINITION = 44;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__PROPERTY = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = SYSTEM_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ProbabilityPropertyImpl <em>Probability Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ProbabilityPropertyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProbabilityProperty()
   * @generated
   */
  int PROBABILITY_PROPERTY = 45;

  /**
   * The feature id for the '<em><b>State Formula1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__STATE_FORMULA1 = 0;

  /**
   * The feature id for the '<em><b>Is Eventually</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__IS_EVENTUALLY = 1;

  /**
   * The feature id for the '<em><b>Is Never</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__IS_NEVER = 2;

  /**
   * The feature id for the '<em><b>Is Always</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__IS_ALWAYS = 3;

  /**
   * The feature id for the '<em><b>Is Until Then</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__IS_UNTIL_THEN = 4;

  /**
   * The feature id for the '<em><b>Is Followed By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__IS_FOLLOWED_BY = 5;

  /**
   * The feature id for the '<em><b>State Formula2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__STATE_FORMULA2 = 6;

  /**
   * The feature id for the '<em><b>Time Instant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__TIME_INSTANT = 7;

  /**
   * The feature id for the '<em><b>Time Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__TIME_INTERVAL = 8;

  /**
   * The feature id for the '<em><b>Is Steady State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__IS_STEADY_STATE = 9;

  /**
   * The feature id for the '<em><b>Is Infinitely Often</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__IS_INFINITELY_OFTEN = 10;

  /**
   * The feature id for the '<em><b>Probability Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT = 11;

  /**
   * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__INITIAL_CONDITIONS = 12;

  /**
   * The number of structural features of the '<em>Probability Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RewardPropertyImpl <em>Reward Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RewardPropertyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRewardProperty()
   * @generated
   */
  int REWARD_PROPERTY = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Time Instant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__TIME_INSTANT = 1;

  /**
   * The feature id for the '<em><b>Concentration Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__CONCENTRATION_CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__INITIAL_CONDITIONS = 3;

  /**
   * The number of structural features of the '<em>Reward Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.StateExpressionImpl <em>State Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.StateExpressionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getStateExpression()
   * @generated
   */
  int STATE_EXPRESSION = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Concentration Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXPRESSION__CONCENTRATION_QUANTITY = 2;

  /**
   * The number of structural features of the '<em>State Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.StateFormulaImpl <em>State Formula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.StateFormulaImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getStateFormula()
   * @generated
   */
  int STATE_FORMULA = 48;

  /**
   * The feature id for the '<em><b>Formula</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__FORMULA = 0;

  /**
   * The feature id for the '<em><b>Atomic Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__ATOMIC_FORMULA = 1;

  /**
   * The feature id for the '<em><b>Is Negation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__IS_NEGATION = 2;

  /**
   * The feature id for the '<em><b>Negated Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__NEGATED_FORMULA = 3;

  /**
   * The feature id for the '<em><b>Left Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__LEFT_FORMULA = 4;

  /**
   * The feature id for the '<em><b>Is Conjunction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__IS_CONJUNCTION = 5;

  /**
   * The feature id for the '<em><b>Is Disjunction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__IS_DISJUNCTION = 6;

  /**
   * The feature id for the '<em><b>Is Implication</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__IS_IMPLICATION = 7;

  /**
   * The feature id for the '<em><b>Right Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__RIGHT_FORMULA = 8;

  /**
   * The number of structural features of the '<em>State Formula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.TimeInstantImpl <em>Time Instant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.TimeInstantImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getTimeInstant()
   * @generated
   */
  int TIME_INSTANT = 49;

  /**
   * The feature id for the '<em><b>Is Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INSTANT__IS_EQUAL_TO = 0;

  /**
   * The feature id for the '<em><b>Time Instant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INSTANT__TIME_INSTANT = 1;

  /**
   * The feature id for the '<em><b>Is Less Than Or Equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INSTANT__IS_LESS_THAN_OR_EQUAL = 2;

  /**
   * The feature id for the '<em><b>Is Greater Than Or Equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INSTANT__IS_GREATER_THAN_OR_EQUAL = 3;

  /**
   * The feature id for the '<em><b>Time Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INSTANT__TIME_UNIT = 4;

  /**
   * The number of structural features of the '<em>Time Instant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INSTANT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.TimeIntervalImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getTimeInterval()
   * @generated
   */
  int TIME_INTERVAL = 50;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INTERVAL__LOWER_BOUND = 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INTERVAL__UPPER_BOUND = 1;

  /**
   * The feature id for the '<em><b>Time Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INTERVAL__TIME_UNIT = 2;

  /**
   * The number of structural features of the '<em>Time Interval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_INTERVAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RewardTimeInstantImpl <em>Reward Time Instant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RewardTimeInstantImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRewardTimeInstant()
   * @generated
   */
  int REWARD_TIME_INSTANT = 51;

  /**
   * The feature id for the '<em><b>Is Equal To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_TIME_INSTANT__IS_EQUAL_TO = 0;

  /**
   * The feature id for the '<em><b>Is Less Than Or Equal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_TIME_INSTANT__IS_LESS_THAN_OR_EQUAL = 1;

  /**
   * The feature id for the '<em><b>Time Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_TIME_INSTANT__TIME_VALUE = 2;

  /**
   * The feature id for the '<em><b>Time Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_TIME_INSTANT__TIME_UNIT = 3;

  /**
   * The number of structural features of the '<em>Reward Time Instant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_TIME_INSTANT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ProbabilityConstraintImpl <em>Probability Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ProbabilityConstraintImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProbabilityConstraint()
   * @generated
   */
  int PROBABILITY_CONSTRAINT = 52;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_CONSTRAINT__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_CONSTRAINT__PROBABILITY = 1;

  /**
   * The feature id for the '<em><b>Has Unknown Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_CONSTRAINT__HAS_UNKNOWN_PROBABILITY = 2;

  /**
   * The number of structural features of the '<em>Probability Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_CONSTRAINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ConcentrationConstraintImpl <em>Concentration Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ConcentrationConstraintImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getConcentrationConstraint()
   * @generated
   */
  int CONCENTRATION_CONSTRAINT = 53;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_CONSTRAINT__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_CONSTRAINT__VALUE = 1;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_CONSTRAINT__UNIT = 2;

  /**
   * The feature id for the '<em><b>Is Unknown</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_CONSTRAINT__IS_UNKNOWN = 3;

  /**
   * The number of structural features of the '<em>Concentration Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_CONSTRAINT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyInitialConditionImpl <em>Property Initial Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.PropertyInitialConditionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPropertyInitialCondition()
   * @generated
   */
  int PROPERTY_INITIAL_CONDITION = 54;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_INITIAL_CONDITION__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_INITIAL_CONDITION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property Initial Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_INITIAL_CONDITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.QuantityImpl <em>Quantity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.QuantityImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getQuantity()
   * @generated
   */
  int QUANTITY = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY__UNITS = 1;

  /**
   * The number of structural features of the '<em>Quantity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ConcentrationQuantityImpl <em>Concentration Quantity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ConcentrationQuantityImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getConcentrationQuantity()
   * @generated
   */
  int CONCENTRATION_QUANTITY = 56;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_QUANTITY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_QUANTITY__UNIT = 1;

  /**
   * The number of structural features of the '<em>Concentration Quantity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_QUANTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ListImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getList()
   * @generated
   */
  int LIST = 57;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ImportImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 58;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = IMPORT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = IMPORT_STATEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see roadblock.xtext.ibl.ibl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.Model#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.Model#getMembers()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ModelMember <em>Model Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Member</em>'.
   * @see roadblock.xtext.ibl.ibl.ModelMember
   * @generated
   */
  EClass getModelMember();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Statement</em>'.
   * @see roadblock.xtext.ibl.ibl.ImportStatement
   * @generated
   */
  EClass getImportStatement();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Definition</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionDefinition
   * @generated
   */
  EClass getFunctionDefinition();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionDefinition#getName()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getFunctionBody <em>Function Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function Body</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionDefinition#getFunctionBody()
   * @see #getFunctionDefinition()
   * @generated
   */
  EReference getFunctionDefinition_FunctionBody();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getUses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uses</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionDefinition#getUses()
   * @see #getFunctionDefinition()
   * @generated
   */
  EReference getFunctionDefinition_Uses();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ProcessBody <em>Process Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Body</em>'.
   * @see roadblock.xtext.ibl.ibl.ProcessBody
   * @generated
   */
  EClass getProcessBody();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.ProcessBody#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.ProcessBody#getParameters()
   * @see #getProcessBody()
   * @generated
   */
  EReference getProcessBody_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.ProcessBody#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.ProcessBody#getMembers()
   * @see #getProcessBody()
   * @generated
   */
  EReference getProcessBody_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.SystemBody <em>System Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Body</em>'.
   * @see roadblock.xtext.ibl.ibl.SystemBody
   * @generated
   */
  EClass getSystemBody();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.SystemBody#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.SystemBody#getParameters()
   * @see #getSystemBody()
   * @generated
   */
  EReference getSystemBody_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.SystemBody#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.SystemBody#getMembers()
   * @see #getSystemBody()
   * @generated
   */
  EReference getSystemBody_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.PlasmidBody <em>Plasmid Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plasmid Body</em>'.
   * @see roadblock.xtext.ibl.ibl.PlasmidBody
   * @generated
   */
  EClass getPlasmidBody();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.PlasmidBody#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.PlasmidBody#getParameters()
   * @see #getPlasmidBody()
   * @generated
   */
  EReference getPlasmidBody_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.PlasmidBody#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.PlasmidBody#getMembers()
   * @see #getPlasmidBody()
   * @generated
   */
  EReference getPlasmidBody_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ChromosomeBody <em>Chromosome Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chromosome Body</em>'.
   * @see roadblock.xtext.ibl.ibl.ChromosomeBody
   * @generated
   */
  EClass getChromosomeBody();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.ChromosomeBody#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.ChromosomeBody#getParameters()
   * @see #getChromosomeBody()
   * @generated
   */
  EReference getChromosomeBody_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.ChromosomeBody#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.ChromosomeBody#getMembers()
   * @see #getChromosomeBody()
   * @generated
   */
  EReference getChromosomeBody_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.CellBody <em>Cell Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Body</em>'.
   * @see roadblock.xtext.ibl.ibl.CellBody
   * @generated
   */
  EClass getCellBody();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.CellBody#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.CellBody#getParameters()
   * @see #getCellBody()
   * @generated
   */
  EReference getCellBody_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.CellBody#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.CellBody#getMembers()
   * @see #getCellBody()
   * @generated
   */
  EReference getCellBody_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.RegionBody <em>Region Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region Body</em>'.
   * @see roadblock.xtext.ibl.ibl.RegionBody
   * @generated
   */
  EClass getRegionBody();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.RegionBody#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.RegionBody#getParameters()
   * @see #getRegionBody()
   * @generated
   */
  EReference getRegionBody_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.RegionBody#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.RegionBody#getMembers()
   * @see #getRegionBody()
   * @generated
   */
  EReference getRegionBody_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.CustomFunctionBody <em>Custom Function Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Function Body</em>'.
   * @see roadblock.xtext.ibl.ibl.CustomFunctionBody
   * @generated
   */
  EClass getCustomFunctionBody();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.CustomFunctionBody#getFunctionType <em>Function Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Type</em>'.
   * @see roadblock.xtext.ibl.ibl.CustomFunctionBody#getFunctionType()
   * @see #getCustomFunctionBody()
   * @generated
   */
  EAttribute getCustomFunctionBody_FunctionType();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.CustomFunctionBody#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.CustomFunctionBody#getParameters()
   * @see #getCustomFunctionBody()
   * @generated
   */
  EReference getCustomFunctionBody_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.CustomFunctionBody#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.CustomFunctionBody#getMembers()
   * @see #getCustomFunctionBody()
   * @generated
   */
  EReference getCustomFunctionBody_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ProcessBodyMember <em>Process Body Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Body Member</em>'.
   * @see roadblock.xtext.ibl.ibl.ProcessBodyMember
   * @generated
   */
  EClass getProcessBodyMember();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.SystemBodyMember <em>System Body Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Body Member</em>'.
   * @see roadblock.xtext.ibl.ibl.SystemBodyMember
   * @generated
   */
  EClass getSystemBodyMember();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.PlasmidBodyMember <em>Plasmid Body Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plasmid Body Member</em>'.
   * @see roadblock.xtext.ibl.ibl.PlasmidBodyMember
   * @generated
   */
  EClass getPlasmidBodyMember();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ChromosomeBodyMember <em>Chromosome Body Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chromosome Body Member</em>'.
   * @see roadblock.xtext.ibl.ibl.ChromosomeBodyMember
   * @generated
   */
  EClass getChromosomeBodyMember();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.CellBodyMember <em>Cell Body Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Body Member</em>'.
   * @see roadblock.xtext.ibl.ibl.CellBodyMember
   * @generated
   */
  EClass getCellBodyMember();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.RegionBodyMember <em>Region Body Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region Body Member</em>'.
   * @see roadblock.xtext.ibl.ibl.RegionBodyMember
   * @generated
   */
  EClass getRegionBodyMember();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.CustomFunctionBodyMember <em>Custom Function Body Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Function Body Member</em>'.
   * @see roadblock.xtext.ibl.ibl.CustomFunctionBodyMember
   * @generated
   */
  EClass getCustomFunctionBodyMember();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.FunctionParameterMember <em>Function Parameter Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Parameter Member</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionParameterMember
   * @generated
   */
  EClass getFunctionParameterMember();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.FunctionParameterMember#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionParameterMember#getType()
   * @see #getFunctionParameterMember()
   * @generated
   */
  EAttribute getFunctionParameterMember_Type();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.FunctionParameterMember#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionParameterMember#getCollection()
   * @see #getFunctionParameterMember()
   * @generated
   */
  EAttribute getFunctionParameterMember_Collection();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.FunctionParameterMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionParameterMember#getName()
   * @see #getFunctionParameterMember()
   * @generated
   */
  EAttribute getFunctionParameterMember_Name();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.FunctionParameterMember#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionParameterMember#getScope()
   * @see #getFunctionParameterMember()
   * @generated
   */
  EAttribute getFunctionParameterMember_Scope();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.FunctionUseMember <em>Function Use Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Use Member</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionUseMember
   * @generated
   */
  EClass getFunctionUseMember();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.FunctionUseMember#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionUseMember#getType()
   * @see #getFunctionUseMember()
   * @generated
   */
  EAttribute getFunctionUseMember_Type();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.FunctionUseMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionUseMember#getName()
   * @see #getFunctionUseMember()
   * @generated
   */
  EAttribute getFunctionUseMember_Name();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.DeviceDefinition <em>Device Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Definition</em>'.
   * @see roadblock.xtext.ibl.ibl.DeviceDefinition
   * @generated
   */
  EClass getDeviceDefinition();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.DeviceDefinition#getName()
   * @see #getDeviceDefinition()
   * @generated
   */
  EAttribute getDeviceDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parts</em>'.
   * @see roadblock.xtext.ibl.ibl.DeviceDefinition#getParts()
   * @see #getDeviceDefinition()
   * @generated
   */
  EReference getDeviceDefinition_Parts();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see roadblock.xtext.ibl.ibl.DeviceDefinition#getInput()
   * @see #getDeviceDefinition()
   * @generated
   */
  EReference getDeviceDefinition_Input();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getOutputput <em>Outputput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Outputput</em>'.
   * @see roadblock.xtext.ibl.ibl.DeviceDefinition#getOutputput()
   * @see #getDeviceDefinition()
   * @generated
   */
  EReference getDeviceDefinition_Outputput();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.DeviceDefinition#getMembers()
   * @see #getDeviceDefinition()
   * @generated
   */
  EReference getDeviceDefinition_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.DeviceMembers <em>Device Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Device Members</em>'.
   * @see roadblock.xtext.ibl.ibl.DeviceMembers
   * @generated
   */
  EClass getDeviceMembers();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ProcessInstantiation <em>Process Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Instantiation</em>'.
   * @see roadblock.xtext.ibl.ibl.ProcessInstantiation
   * @generated
   */
  EClass getProcessInstantiation();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProcessInstantiation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.ProcessInstantiation#getName()
   * @see #getProcessInstantiation()
   * @generated
   */
  EAttribute getProcessInstantiation_Name();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProcessInstantiation#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see roadblock.xtext.ibl.ibl.ProcessInstantiation#getConstructor()
   * @see #getProcessInstantiation()
   * @generated
   */
  EAttribute getProcessInstantiation_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.ProcessInstantiation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.ProcessInstantiation#getParameters()
   * @see #getProcessInstantiation()
   * @generated
   */
  EReference getProcessInstantiation_Parameters();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.SystemInstantiation <em>System Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Instantiation</em>'.
   * @see roadblock.xtext.ibl.ibl.SystemInstantiation
   * @generated
   */
  EClass getSystemInstantiation();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.SystemInstantiation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.SystemInstantiation#getName()
   * @see #getSystemInstantiation()
   * @generated
   */
  EAttribute getSystemInstantiation_Name();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.SystemInstantiation#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see roadblock.xtext.ibl.ibl.SystemInstantiation#getConstructor()
   * @see #getSystemInstantiation()
   * @generated
   */
  EAttribute getSystemInstantiation_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.SystemInstantiation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.SystemInstantiation#getParameters()
   * @see #getSystemInstantiation()
   * @generated
   */
  EReference getSystemInstantiation_Parameters();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.PlasmidInstantiation <em>Plasmid Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plasmid Instantiation</em>'.
   * @see roadblock.xtext.ibl.ibl.PlasmidInstantiation
   * @generated
   */
  EClass getPlasmidInstantiation();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.PlasmidInstantiation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.PlasmidInstantiation#getName()
   * @see #getPlasmidInstantiation()
   * @generated
   */
  EAttribute getPlasmidInstantiation_Name();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.PlasmidInstantiation#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see roadblock.xtext.ibl.ibl.PlasmidInstantiation#getConstructor()
   * @see #getPlasmidInstantiation()
   * @generated
   */
  EAttribute getPlasmidInstantiation_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.PlasmidInstantiation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.PlasmidInstantiation#getParameters()
   * @see #getPlasmidInstantiation()
   * @generated
   */
  EReference getPlasmidInstantiation_Parameters();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ChromosomeInstantiation <em>Chromosome Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chromosome Instantiation</em>'.
   * @see roadblock.xtext.ibl.ibl.ChromosomeInstantiation
   * @generated
   */
  EClass getChromosomeInstantiation();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ChromosomeInstantiation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.ChromosomeInstantiation#getName()
   * @see #getChromosomeInstantiation()
   * @generated
   */
  EAttribute getChromosomeInstantiation_Name();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ChromosomeInstantiation#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see roadblock.xtext.ibl.ibl.ChromosomeInstantiation#getConstructor()
   * @see #getChromosomeInstantiation()
   * @generated
   */
  EAttribute getChromosomeInstantiation_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.ChromosomeInstantiation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.ChromosomeInstantiation#getParameters()
   * @see #getChromosomeInstantiation()
   * @generated
   */
  EReference getChromosomeInstantiation_Parameters();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.CellInstantiation <em>Cell Instantiation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cell Instantiation</em>'.
   * @see roadblock.xtext.ibl.ibl.CellInstantiation
   * @generated
   */
  EClass getCellInstantiation();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.CellInstantiation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.CellInstantiation#getName()
   * @see #getCellInstantiation()
   * @generated
   */
  EAttribute getCellInstantiation_Name();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.CellInstantiation#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see roadblock.xtext.ibl.ibl.CellInstantiation#getConstructor()
   * @see #getCellInstantiation()
   * @generated
   */
  EAttribute getCellInstantiation_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.CellInstantiation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.CellInstantiation#getParameters()
   * @see #getCellInstantiation()
   * @generated
   */
  EReference getCellInstantiation_Parameters();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableComplex <em>Variable Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Complex</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableComplex
   * @generated
   */
  EClass getVariableComplex();

  /**
   * Returns the meta object for the attribute list '{@link roadblock.xtext.ibl.ibl.VariableComplex#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Components</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableComplex#getComponents()
   * @see #getVariableComplex()
   * @generated
   */
  EAttribute getVariableComplex_Components();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableAttribute <em>Variable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Attribute</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableAttribute
   * @generated
   */
  EClass getVariableAttribute();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableAttribute#getName()
   * @see #getVariableAttribute()
   * @generated
   */
  EAttribute getVariableAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.VariableAttribute#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Complex</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableAttribute#getComplex()
   * @see #getVariableAttribute()
   * @generated
   */
  EReference getVariableAttribute_Complex();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableAttribute#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableAttribute#getAttribute()
   * @see #getVariableAttribute()
   * @generated
   */
  EAttribute getVariableAttribute_Attribute();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableDefinition <em>Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinition
   * @generated
   */
  EClass getVariableDefinition();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinition#getDefinition()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_Definition();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinition#getQualifier()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Qualifier();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn <em>Variable Definition Built In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition Built In</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn
   * @generated
   */
  EClass getVariableDefinitionBuiltIn();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getType()
   * @see #getVariableDefinitionBuiltIn()
   * @generated
   */
  EAttribute getVariableDefinitionBuiltIn_Type();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getName()
   * @see #getVariableDefinitionBuiltIn()
   * @generated
   */
  EAttribute getVariableDefinitionBuiltIn_Name();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Complex</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getComplex()
   * @see #getVariableDefinitionBuiltIn()
   * @generated
   */
  EReference getVariableDefinitionBuiltIn_Complex();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getConstructor()
   * @see #getVariableDefinitionBuiltIn()
   * @generated
   */
  EAttribute getVariableDefinitionBuiltIn_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn#getParameters()
   * @see #getVariableDefinitionBuiltIn()
   * @generated
   */
  EReference getVariableDefinitionBuiltIn_Parameters();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined <em>Variable Definition User Defined</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition User Defined</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined
   * @generated
   */
  EClass getVariableDefinitionUserDefined();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined#getType()
   * @see #getVariableDefinitionUserDefined()
   * @generated
   */
  EAttribute getVariableDefinitionUserDefined_Type();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined#getName()
   * @see #getVariableDefinitionUserDefined()
   * @generated
   */
  EAttribute getVariableDefinitionUserDefined_Name();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined#getConstructor()
   * @see #getVariableDefinitionUserDefined()
   * @generated
   */
  EAttribute getVariableDefinitionUserDefined_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined#getParameters()
   * @see #getVariableDefinitionUserDefined()
   * @generated
   */
  EReference getVariableDefinitionUserDefined_Parameters();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableDefinitionCollection <em>Variable Definition Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition Collection</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionCollection
   * @generated
   */
  EClass getVariableDefinitionCollection();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionCollection#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionCollection#getCollection()
   * @see #getVariableDefinitionCollection()
   * @generated
   */
  EAttribute getVariableDefinitionCollection_Collection();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionCollection#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionCollection#getType()
   * @see #getVariableDefinitionCollection()
   * @generated
   */
  EAttribute getVariableDefinitionCollection_Type();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionCollection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionCollection#getName()
   * @see #getVariableDefinitionCollection()
   * @generated
   */
  EAttribute getVariableDefinitionCollection_Name();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.VariableDefinitionCollection#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionCollection#getValue()
   * @see #getVariableDefinitionCollection()
   * @generated
   */
  EReference getVariableDefinitionCollection_Value();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBasic <em>Variable Definition Basic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Definition Basic</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBasic
   * @generated
   */
  EClass getVariableDefinitionBasic();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBasic#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBasic#getType()
   * @see #getVariableDefinitionBasic()
   * @generated
   */
  EAttribute getVariableDefinitionBasic_Type();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBasic#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBasic#getName()
   * @see #getVariableDefinitionBasic()
   * @generated
   */
  EAttribute getVariableDefinitionBasic_Name();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.VariableDefinitionBasic#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinitionBasic#getExpression()
   * @see #getVariableDefinitionBasic()
   * @generated
   */
  EReference getVariableDefinitionBasic_Expression();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ParameterAssignment <em>Parameter Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Assignment</em>'.
   * @see roadblock.xtext.ibl.ibl.ParameterAssignment
   * @generated
   */
  EClass getParameterAssignment();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ParameterAssignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.ParameterAssignment#getName()
   * @see #getParameterAssignment()
   * @generated
   */
  EAttribute getParameterAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.ParameterAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see roadblock.xtext.ibl.ibl.ParameterAssignment#getValue()
   * @see #getParameterAssignment()
   * @generated
   */
  EReference getParameterAssignment_Value();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableAssignment <em>Variable Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assignment</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableAssignment
   * @generated
   */
  EClass getVariableAssignment();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.VariableAssignment#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableAssignment#getVariable()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Variable();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.VariableAssignment#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableAssignment#getExpression()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Expression();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableAssignmentObject <em>Variable Assignment Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assignment Object</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableAssignmentObject
   * @generated
   */
  EClass getVariableAssignmentObject();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableExpression <em>Variable Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Expression</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableExpression
   * @generated
   */
  EClass getVariableExpression();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.VariableExpression#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableExpression#getMembers()
   * @see #getVariableExpression()
   * @generated
   */
  EReference getVariableExpression_Members();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableExpressionObject <em>Variable Expression Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Expression Object</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableExpressionObject
   * @generated
   */
  EClass getVariableExpressionObject();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject <em>Atomic Variable Expression Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Variable Expression Object</em>'.
   * @see roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject
   * @generated
   */
  EClass getAtomicVariableExpressionObject();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getVariable()
   * @see #getAtomicVariableExpressionObject()
   * @generated
   */
  EAttribute getAtomicVariableExpressionObject_Variable();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getAttribute()
   * @see #getAtomicVariableExpressionObject()
   * @generated
   */
  EReference getAtomicVariableExpressionObject_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Complex</em>'.
   * @see roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getComplex()
   * @see #getAtomicVariableExpressionObject()
   * @generated
   */
  EReference getAtomicVariableExpressionObject_Complex();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getValue()
   * @see #getAtomicVariableExpressionObject()
   * @generated
   */
  EAttribute getAtomicVariableExpressionObject_Value();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getQuantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantity</em>'.
   * @see roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getQuantity()
   * @see #getAtomicVariableExpressionObject()
   * @generated
   */
  EReference getAtomicVariableExpressionObject_Quantity();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject#getString()
   * @see #getAtomicVariableExpressionObject()
   * @generated
   */
  EAttribute getAtomicVariableExpressionObject_String();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.CompoundVariableExpressionObject <em>Compound Variable Expression Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Variable Expression Object</em>'.
   * @see roadblock.xtext.ibl.ibl.CompoundVariableExpressionObject
   * @generated
   */
  EClass getCompoundVariableExpressionObject();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.CompoundVariableExpressionObject#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see roadblock.xtext.ibl.ibl.CompoundVariableExpressionObject#getList()
   * @see #getCompoundVariableExpressionObject()
   * @generated
   */
  EReference getCompoundVariableExpressionObject_List();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.RuleDefinition <em>Rule Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Definition</em>'.
   * @see roadblock.xtext.ibl.ibl.RuleDefinition
   * @generated
   */
  EClass getRuleDefinition();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RuleDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.RuleDefinition#getName()
   * @see #getRuleDefinition()
   * @generated
   */
  EAttribute getRuleDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.RuleDefinition#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lhs</em>'.
   * @see roadblock.xtext.ibl.ibl.RuleDefinition#getLhs()
   * @see #getRuleDefinition()
   * @generated
   */
  EReference getRuleDefinition_Lhs();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RuleDefinition#isReversible <em>Reversible</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reversible</em>'.
   * @see roadblock.xtext.ibl.ibl.RuleDefinition#isReversible()
   * @see #getRuleDefinition()
   * @generated
   */
  EAttribute getRuleDefinition_Reversible();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.RuleDefinition#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rhs</em>'.
   * @see roadblock.xtext.ibl.ibl.RuleDefinition#getRhs()
   * @see #getRuleDefinition()
   * @generated
   */
  EReference getRuleDefinition_Rhs();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.RuleObject <em>Rule Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Object</em>'.
   * @see roadblock.xtext.ibl.ibl.RuleObject
   * @generated
   */
  EClass getRuleObject();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ATGCDefinition <em>ATGC Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ATGC Definition</em>'.
   * @see roadblock.xtext.ibl.ibl.ATGCDefinition
   * @generated
   */
  EClass getATGCDefinition();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ATGCDefinition#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see roadblock.xtext.ibl.ibl.ATGCDefinition#getCommand()
   * @see #getATGCDefinition()
   * @generated
   */
  EAttribute getATGCDefinition_Command();

  /**
   * Returns the meta object for the attribute list '{@link roadblock.xtext.ibl.ibl.ATGCDefinition#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Arguments</em>'.
   * @see roadblock.xtext.ibl.ibl.ATGCDefinition#getArguments()
   * @see #getATGCDefinition()
   * @generated
   */
  EAttribute getATGCDefinition_Arguments();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Definition</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyDefinition
   * @generated
   */
  EClass getPropertyDefinition();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyDefinition#getProperty()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Property();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty <em>Probability Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Probability Property</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty
   * @generated
   */
  EClass getProbabilityProperty();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getStateFormula1 <em>State Formula1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Formula1</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getStateFormula1()
   * @see #getProbabilityProperty()
   * @generated
   */
  EReference getProbabilityProperty_StateFormula1();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsEventually <em>Is Eventually</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Eventually</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsEventually()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_IsEventually();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsNever <em>Is Never</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Never</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsNever()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_IsNever();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsAlways <em>Is Always</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Always</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsAlways()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_IsAlways();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsUntilThen <em>Is Until Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Until Then</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsUntilThen()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_IsUntilThen();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsFollowedBy <em>Is Followed By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Followed By</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsFollowedBy()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_IsFollowedBy();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getStateFormula2 <em>State Formula2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Formula2</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getStateFormula2()
   * @see #getProbabilityProperty()
   * @generated
   */
  EReference getProbabilityProperty_StateFormula2();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getTimeInstant <em>Time Instant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time Instant</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getTimeInstant()
   * @see #getProbabilityProperty()
   * @generated
   */
  EReference getProbabilityProperty_TimeInstant();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getTimeInterval <em>Time Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time Interval</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getTimeInterval()
   * @see #getProbabilityProperty()
   * @generated
   */
  EReference getProbabilityProperty_TimeInterval();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsSteadyState <em>Is Steady State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Steady State</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsSteadyState()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_IsSteadyState();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsInfinitelyOften <em>Is Infinitely Often</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Infinitely Often</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#isIsInfinitelyOften()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_IsInfinitelyOften();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getProbabilityConstraint <em>Probability Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Probability Constraint</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getProbabilityConstraint()
   * @see #getProbabilityProperty()
   * @generated
   */
  EReference getProbabilityProperty_ProbabilityConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getInitialConditions <em>Initial Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initial Conditions</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getInitialConditions()
   * @see #getProbabilityProperty()
   * @generated
   */
  EReference getProbabilityProperty_InitialConditions();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.RewardProperty <em>Reward Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reward Property</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty
   * @generated
   */
  EClass getRewardProperty();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty#getName()
   * @see #getRewardProperty()
   * @generated
   */
  EAttribute getRewardProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.RewardProperty#getTimeInstant <em>Time Instant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time Instant</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty#getTimeInstant()
   * @see #getRewardProperty()
   * @generated
   */
  EReference getRewardProperty_TimeInstant();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.RewardProperty#getConcentrationConstraint <em>Concentration Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concentration Constraint</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty#getConcentrationConstraint()
   * @see #getRewardProperty()
   * @generated
   */
  EReference getRewardProperty_ConcentrationConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.RewardProperty#getInitialConditions <em>Initial Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Initial Conditions</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty#getInitialConditions()
   * @see #getRewardProperty()
   * @generated
   */
  EReference getRewardProperty_InitialConditions();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.StateExpression <em>State Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Expression</em>'.
   * @see roadblock.xtext.ibl.ibl.StateExpression
   * @generated
   */
  EClass getStateExpression();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.StateExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.StateExpression#getName()
   * @see #getStateExpression()
   * @generated
   */
  EAttribute getStateExpression_Name();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.StateExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see roadblock.xtext.ibl.ibl.StateExpression#getOperator()
   * @see #getStateExpression()
   * @generated
   */
  EAttribute getStateExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.StateExpression#getConcentrationQuantity <em>Concentration Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concentration Quantity</em>'.
   * @see roadblock.xtext.ibl.ibl.StateExpression#getConcentrationQuantity()
   * @see #getStateExpression()
   * @generated
   */
  EReference getStateExpression_ConcentrationQuantity();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.StateFormula <em>State Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Formula</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula
   * @generated
   */
  EClass getStateFormula();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.StateFormula#getFormula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Formula</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#getFormula()
   * @see #getStateFormula()
   * @generated
   */
  EAttribute getStateFormula_Formula();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.StateFormula#getAtomicFormula <em>Atomic Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atomic Formula</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#getAtomicFormula()
   * @see #getStateFormula()
   * @generated
   */
  EReference getStateFormula_AtomicFormula();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.StateFormula#isIsNegation <em>Is Negation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Negation</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#isIsNegation()
   * @see #getStateFormula()
   * @generated
   */
  EAttribute getStateFormula_IsNegation();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.StateFormula#getNegatedFormula <em>Negated Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Negated Formula</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#getNegatedFormula()
   * @see #getStateFormula()
   * @generated
   */
  EReference getStateFormula_NegatedFormula();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.StateFormula#getLeftFormula <em>Left Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Formula</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#getLeftFormula()
   * @see #getStateFormula()
   * @generated
   */
  EReference getStateFormula_LeftFormula();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.StateFormula#isIsConjunction <em>Is Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Conjunction</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#isIsConjunction()
   * @see #getStateFormula()
   * @generated
   */
  EAttribute getStateFormula_IsConjunction();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.StateFormula#isIsDisjunction <em>Is Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Disjunction</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#isIsDisjunction()
   * @see #getStateFormula()
   * @generated
   */
  EAttribute getStateFormula_IsDisjunction();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.StateFormula#isIsImplication <em>Is Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Implication</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#isIsImplication()
   * @see #getStateFormula()
   * @generated
   */
  EAttribute getStateFormula_IsImplication();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.StateFormula#getRightFormula <em>Right Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Formula</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#getRightFormula()
   * @see #getStateFormula()
   * @generated
   */
  EReference getStateFormula_RightFormula();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.TimeInstant <em>Time Instant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Instant</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInstant
   * @generated
   */
  EClass getTimeInstant();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.TimeInstant#isIsEqualTo <em>Is Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Equal To</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInstant#isIsEqualTo()
   * @see #getTimeInstant()
   * @generated
   */
  EAttribute getTimeInstant_IsEqualTo();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.TimeInstant#getTimeInstant <em>Time Instant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Instant</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInstant#getTimeInstant()
   * @see #getTimeInstant()
   * @generated
   */
  EAttribute getTimeInstant_TimeInstant();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.TimeInstant#isIsLessThanOrEqual <em>Is Less Than Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Less Than Or Equal</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInstant#isIsLessThanOrEqual()
   * @see #getTimeInstant()
   * @generated
   */
  EAttribute getTimeInstant_IsLessThanOrEqual();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.TimeInstant#isIsGreaterThanOrEqual <em>Is Greater Than Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Greater Than Or Equal</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInstant#isIsGreaterThanOrEqual()
   * @see #getTimeInstant()
   * @generated
   */
  EAttribute getTimeInstant_IsGreaterThanOrEqual();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.TimeInstant#getTimeUnit <em>Time Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Unit</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInstant#getTimeUnit()
   * @see #getTimeInstant()
   * @generated
   */
  EAttribute getTimeInstant_TimeUnit();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.TimeInterval <em>Time Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Interval</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInterval
   * @generated
   */
  EClass getTimeInterval();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.TimeInterval#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInterval#getLowerBound()
   * @see #getTimeInterval()
   * @generated
   */
  EAttribute getTimeInterval_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.TimeInterval#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInterval#getUpperBound()
   * @see #getTimeInterval()
   * @generated
   */
  EAttribute getTimeInterval_UpperBound();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.TimeInterval#getTimeUnit <em>Time Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Unit</em>'.
   * @see roadblock.xtext.ibl.ibl.TimeInterval#getTimeUnit()
   * @see #getTimeInterval()
   * @generated
   */
  EAttribute getTimeInterval_TimeUnit();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.RewardTimeInstant <em>Reward Time Instant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reward Time Instant</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardTimeInstant
   * @generated
   */
  EClass getRewardTimeInstant();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardTimeInstant#isIsEqualTo <em>Is Equal To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Equal To</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardTimeInstant#isIsEqualTo()
   * @see #getRewardTimeInstant()
   * @generated
   */
  EAttribute getRewardTimeInstant_IsEqualTo();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardTimeInstant#isIsLessThanOrEqual <em>Is Less Than Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Less Than Or Equal</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardTimeInstant#isIsLessThanOrEqual()
   * @see #getRewardTimeInstant()
   * @generated
   */
  EAttribute getRewardTimeInstant_IsLessThanOrEqual();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardTimeInstant#getTimeValue <em>Time Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Value</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardTimeInstant#getTimeValue()
   * @see #getRewardTimeInstant()
   * @generated
   */
  EAttribute getRewardTimeInstant_TimeValue();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardTimeInstant#getTimeUnit <em>Time Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Unit</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardTimeInstant#getTimeUnit()
   * @see #getRewardTimeInstant()
   * @generated
   */
  EAttribute getRewardTimeInstant_TimeUnit();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ProbabilityConstraint <em>Probability Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Probability Constraint</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityConstraint
   * @generated
   */
  EClass getProbabilityConstraint();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityConstraint#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityConstraint#getOperator()
   * @see #getProbabilityConstraint()
   * @generated
   */
  EAttribute getProbabilityConstraint_Operator();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityConstraint#getProbability <em>Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Probability</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityConstraint#getProbability()
   * @see #getProbabilityConstraint()
   * @generated
   */
  EAttribute getProbabilityConstraint_Probability();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityConstraint#isHasUnknownProbability <em>Has Unknown Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Unknown Probability</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityConstraint#isHasUnknownProbability()
   * @see #getProbabilityConstraint()
   * @generated
   */
  EAttribute getProbabilityConstraint_HasUnknownProbability();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ConcentrationConstraint <em>Concentration Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concentration Constraint</em>'.
   * @see roadblock.xtext.ibl.ibl.ConcentrationConstraint
   * @generated
   */
  EClass getConcentrationConstraint();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ConcentrationConstraint#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see roadblock.xtext.ibl.ibl.ConcentrationConstraint#getOperator()
   * @see #getConcentrationConstraint()
   * @generated
   */
  EAttribute getConcentrationConstraint_Operator();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ConcentrationConstraint#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see roadblock.xtext.ibl.ibl.ConcentrationConstraint#getValue()
   * @see #getConcentrationConstraint()
   * @generated
   */
  EAttribute getConcentrationConstraint_Value();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ConcentrationConstraint#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see roadblock.xtext.ibl.ibl.ConcentrationConstraint#getUnit()
   * @see #getConcentrationConstraint()
   * @generated
   */
  EAttribute getConcentrationConstraint_Unit();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ConcentrationConstraint#isIsUnknown <em>Is Unknown</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Unknown</em>'.
   * @see roadblock.xtext.ibl.ibl.ConcentrationConstraint#isIsUnknown()
   * @see #getConcentrationConstraint()
   * @generated
   */
  EAttribute getConcentrationConstraint_IsUnknown();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.PropertyInitialCondition <em>Property Initial Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Initial Condition</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyInitialCondition
   * @generated
   */
  EClass getPropertyInitialCondition();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.PropertyInitialCondition#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyInitialCondition#getVariable()
   * @see #getPropertyInitialCondition()
   * @generated
   */
  EReference getPropertyInitialCondition_Variable();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.PropertyInitialCondition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyInitialCondition#getValue()
   * @see #getPropertyInitialCondition()
   * @generated
   */
  EReference getPropertyInitialCondition_Value();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.Quantity <em>Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantity</em>'.
   * @see roadblock.xtext.ibl.ibl.Quantity
   * @generated
   */
  EClass getQuantity();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.Quantity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see roadblock.xtext.ibl.ibl.Quantity#getValue()
   * @see #getQuantity()
   * @generated
   */
  EAttribute getQuantity_Value();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.Quantity#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Units</em>'.
   * @see roadblock.xtext.ibl.ibl.Quantity#getUnits()
   * @see #getQuantity()
   * @generated
   */
  EAttribute getQuantity_Units();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.ConcentrationQuantity <em>Concentration Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concentration Quantity</em>'.
   * @see roadblock.xtext.ibl.ibl.ConcentrationQuantity
   * @generated
   */
  EClass getConcentrationQuantity();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ConcentrationQuantity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see roadblock.xtext.ibl.ibl.ConcentrationQuantity#getValue()
   * @see #getConcentrationQuantity()
   * @generated
   */
  EAttribute getConcentrationQuantity_Value();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ConcentrationQuantity#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see roadblock.xtext.ibl.ibl.ConcentrationQuantity#getUnit()
   * @see #getConcentrationQuantity()
   * @generated
   */
  EAttribute getConcentrationQuantity_Unit();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see roadblock.xtext.ibl.ibl.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.List#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see roadblock.xtext.ibl.ibl.List#getEntries()
   * @see #getList()
   * @generated
   */
  EReference getList_Entries();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see roadblock.xtext.ibl.ibl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see roadblock.xtext.ibl.ibl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IblFactory getIblFactory();

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
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ModelImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MEMBERS = eINSTANCE.getModel_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ModelMemberImpl <em>Model Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ModelMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getModelMember()
     * @generated
     */
    EClass MODEL_MEMBER = eINSTANCE.getModelMember();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ImportStatementImpl <em>Import Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ImportStatementImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getImportStatement()
     * @generated
     */
    EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionDefinition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__NAME = eINSTANCE.getFunctionDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Function Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__FUNCTION_BODY = eINSTANCE.getFunctionDefinition_FunctionBody();

    /**
     * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__USES = eINSTANCE.getFunctionDefinition_Uses();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ProcessBodyImpl <em>Process Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ProcessBodyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProcessBody()
     * @generated
     */
    EClass PROCESS_BODY = eINSTANCE.getProcessBody();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_BODY__PARAMETERS = eINSTANCE.getProcessBody_Parameters();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_BODY__MEMBERS = eINSTANCE.getProcessBody_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.SystemBodyImpl <em>System Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.SystemBodyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getSystemBody()
     * @generated
     */
    EClass SYSTEM_BODY = eINSTANCE.getSystemBody();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_BODY__PARAMETERS = eINSTANCE.getSystemBody_Parameters();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_BODY__MEMBERS = eINSTANCE.getSystemBody_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.PlasmidBodyImpl <em>Plasmid Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.PlasmidBodyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPlasmidBody()
     * @generated
     */
    EClass PLASMID_BODY = eINSTANCE.getPlasmidBody();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLASMID_BODY__PARAMETERS = eINSTANCE.getPlasmidBody_Parameters();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLASMID_BODY__MEMBERS = eINSTANCE.getPlasmidBody_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ChromosomeBodyImpl <em>Chromosome Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ChromosomeBodyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getChromosomeBody()
     * @generated
     */
    EClass CHROMOSOME_BODY = eINSTANCE.getChromosomeBody();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHROMOSOME_BODY__PARAMETERS = eINSTANCE.getChromosomeBody_Parameters();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHROMOSOME_BODY__MEMBERS = eINSTANCE.getChromosomeBody_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.CellBodyImpl <em>Cell Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.CellBodyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCellBody()
     * @generated
     */
    EClass CELL_BODY = eINSTANCE.getCellBody();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_BODY__PARAMETERS = eINSTANCE.getCellBody_Parameters();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_BODY__MEMBERS = eINSTANCE.getCellBody_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.RegionBodyImpl <em>Region Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.RegionBodyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRegionBody()
     * @generated
     */
    EClass REGION_BODY = eINSTANCE.getRegionBody();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION_BODY__PARAMETERS = eINSTANCE.getRegionBody_Parameters();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION_BODY__MEMBERS = eINSTANCE.getRegionBody_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyImpl <em>Custom Function Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCustomFunctionBody()
     * @generated
     */
    EClass CUSTOM_FUNCTION_BODY = eINSTANCE.getCustomFunctionBody();

    /**
     * The meta object literal for the '<em><b>Function Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_FUNCTION_BODY__FUNCTION_TYPE = eINSTANCE.getCustomFunctionBody_FunctionType();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FUNCTION_BODY__PARAMETERS = eINSTANCE.getCustomFunctionBody_Parameters();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CUSTOM_FUNCTION_BODY__MEMBERS = eINSTANCE.getCustomFunctionBody_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ProcessBodyMemberImpl <em>Process Body Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ProcessBodyMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProcessBodyMember()
     * @generated
     */
    EClass PROCESS_BODY_MEMBER = eINSTANCE.getProcessBodyMember();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.SystemBodyMemberImpl <em>System Body Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.SystemBodyMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getSystemBodyMember()
     * @generated
     */
    EClass SYSTEM_BODY_MEMBER = eINSTANCE.getSystemBodyMember();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.PlasmidBodyMemberImpl <em>Plasmid Body Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.PlasmidBodyMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPlasmidBodyMember()
     * @generated
     */
    EClass PLASMID_BODY_MEMBER = eINSTANCE.getPlasmidBodyMember();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ChromosomeBodyMemberImpl <em>Chromosome Body Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ChromosomeBodyMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getChromosomeBodyMember()
     * @generated
     */
    EClass CHROMOSOME_BODY_MEMBER = eINSTANCE.getChromosomeBodyMember();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.CellBodyMemberImpl <em>Cell Body Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.CellBodyMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCellBodyMember()
     * @generated
     */
    EClass CELL_BODY_MEMBER = eINSTANCE.getCellBodyMember();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.RegionBodyMemberImpl <em>Region Body Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.RegionBodyMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRegionBodyMember()
     * @generated
     */
    EClass REGION_BODY_MEMBER = eINSTANCE.getRegionBodyMember();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyMemberImpl <em>Custom Function Body Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCustomFunctionBodyMember()
     * @generated
     */
    EClass CUSTOM_FUNCTION_BODY_MEMBER = eINSTANCE.getCustomFunctionBodyMember();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionParameterMemberImpl <em>Function Parameter Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.FunctionParameterMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionParameterMember()
     * @generated
     */
    EClass FUNCTION_PARAMETER_MEMBER = eINSTANCE.getFunctionParameterMember();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_PARAMETER_MEMBER__TYPE = eINSTANCE.getFunctionParameterMember_Type();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_PARAMETER_MEMBER__COLLECTION = eINSTANCE.getFunctionParameterMember_Collection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_PARAMETER_MEMBER__NAME = eINSTANCE.getFunctionParameterMember_Name();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_PARAMETER_MEMBER__SCOPE = eINSTANCE.getFunctionParameterMember_Scope();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionUseMemberImpl <em>Function Use Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.FunctionUseMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionUseMember()
     * @generated
     */
    EClass FUNCTION_USE_MEMBER = eINSTANCE.getFunctionUseMember();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_USE_MEMBER__TYPE = eINSTANCE.getFunctionUseMember_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_USE_MEMBER__NAME = eINSTANCE.getFunctionUseMember_Name();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl <em>Device Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getDeviceDefinition()
     * @generated
     */
    EClass DEVICE_DEFINITION = eINSTANCE.getDeviceDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_DEFINITION__NAME = eINSTANCE.getDeviceDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_DEFINITION__PARTS = eINSTANCE.getDeviceDefinition_Parts();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_DEFINITION__INPUT = eINSTANCE.getDeviceDefinition_Input();

    /**
     * The meta object literal for the '<em><b>Outputput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_DEFINITION__OUTPUTPUT = eINSTANCE.getDeviceDefinition_Outputput();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_DEFINITION__MEMBERS = eINSTANCE.getDeviceDefinition_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.DeviceMembersImpl <em>Device Members</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.DeviceMembersImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getDeviceMembers()
     * @generated
     */
    EClass DEVICE_MEMBERS = eINSTANCE.getDeviceMembers();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ProcessInstantiationImpl <em>Process Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ProcessInstantiationImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProcessInstantiation()
     * @generated
     */
    EClass PROCESS_INSTANTIATION = eINSTANCE.getProcessInstantiation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS_INSTANTIATION__NAME = eINSTANCE.getProcessInstantiation_Name();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS_INSTANTIATION__CONSTRUCTOR = eINSTANCE.getProcessInstantiation_Constructor();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS_INSTANTIATION__PARAMETERS = eINSTANCE.getProcessInstantiation_Parameters();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.SystemInstantiationImpl <em>System Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.SystemInstantiationImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getSystemInstantiation()
     * @generated
     */
    EClass SYSTEM_INSTANTIATION = eINSTANCE.getSystemInstantiation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_INSTANTIATION__NAME = eINSTANCE.getSystemInstantiation_Name();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_INSTANTIATION__CONSTRUCTOR = eINSTANCE.getSystemInstantiation_Constructor();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_INSTANTIATION__PARAMETERS = eINSTANCE.getSystemInstantiation_Parameters();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.PlasmidInstantiationImpl <em>Plasmid Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.PlasmidInstantiationImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPlasmidInstantiation()
     * @generated
     */
    EClass PLASMID_INSTANTIATION = eINSTANCE.getPlasmidInstantiation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLASMID_INSTANTIATION__NAME = eINSTANCE.getPlasmidInstantiation_Name();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLASMID_INSTANTIATION__CONSTRUCTOR = eINSTANCE.getPlasmidInstantiation_Constructor();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLASMID_INSTANTIATION__PARAMETERS = eINSTANCE.getPlasmidInstantiation_Parameters();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ChromosomeInstantiationImpl <em>Chromosome Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ChromosomeInstantiationImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getChromosomeInstantiation()
     * @generated
     */
    EClass CHROMOSOME_INSTANTIATION = eINSTANCE.getChromosomeInstantiation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHROMOSOME_INSTANTIATION__NAME = eINSTANCE.getChromosomeInstantiation_Name();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHROMOSOME_INSTANTIATION__CONSTRUCTOR = eINSTANCE.getChromosomeInstantiation_Constructor();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHROMOSOME_INSTANTIATION__PARAMETERS = eINSTANCE.getChromosomeInstantiation_Parameters();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.CellInstantiationImpl <em>Cell Instantiation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.CellInstantiationImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCellInstantiation()
     * @generated
     */
    EClass CELL_INSTANTIATION = eINSTANCE.getCellInstantiation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_INSTANTIATION__NAME = eINSTANCE.getCellInstantiation_Name();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CELL_INSTANTIATION__CONSTRUCTOR = eINSTANCE.getCellInstantiation_Constructor();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CELL_INSTANTIATION__PARAMETERS = eINSTANCE.getCellInstantiation_Parameters();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableComplexImpl <em>Variable Complex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableComplexImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableComplex()
     * @generated
     */
    EClass VARIABLE_COMPLEX = eINSTANCE.getVariableComplex();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_COMPLEX__COMPONENTS = eINSTANCE.getVariableComplex_Components();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableAttributeImpl <em>Variable Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableAttributeImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableAttribute()
     * @generated
     */
    EClass VARIABLE_ATTRIBUTE = eINSTANCE.getVariableAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ATTRIBUTE__NAME = eINSTANCE.getVariableAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ATTRIBUTE__COMPLEX = eINSTANCE.getVariableAttribute_Complex();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getVariableAttribute_Attribute();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinition()
     * @generated
     */
    EClass VARIABLE_DEFINITION = eINSTANCE.getVariableDefinition();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION__DEFINITION = eINSTANCE.getVariableDefinition_Definition();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__QUALIFIER = eINSTANCE.getVariableDefinition_Qualifier();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionBuiltInImpl <em>Variable Definition Built In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionBuiltInImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinitionBuiltIn()
     * @generated
     */
    EClass VARIABLE_DEFINITION_BUILT_IN = eINSTANCE.getVariableDefinitionBuiltIn();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_BUILT_IN__TYPE = eINSTANCE.getVariableDefinitionBuiltIn_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_BUILT_IN__NAME = eINSTANCE.getVariableDefinitionBuiltIn_Name();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION_BUILT_IN__COMPLEX = eINSTANCE.getVariableDefinitionBuiltIn_Complex();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_BUILT_IN__CONSTRUCTOR = eINSTANCE.getVariableDefinitionBuiltIn_Constructor();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION_BUILT_IN__PARAMETERS = eINSTANCE.getVariableDefinitionBuiltIn_Parameters();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionUserDefinedImpl <em>Variable Definition User Defined</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionUserDefinedImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinitionUserDefined()
     * @generated
     */
    EClass VARIABLE_DEFINITION_USER_DEFINED = eINSTANCE.getVariableDefinitionUserDefined();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_USER_DEFINED__TYPE = eINSTANCE.getVariableDefinitionUserDefined_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_USER_DEFINED__NAME = eINSTANCE.getVariableDefinitionUserDefined_Name();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_USER_DEFINED__CONSTRUCTOR = eINSTANCE.getVariableDefinitionUserDefined_Constructor();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION_USER_DEFINED__PARAMETERS = eINSTANCE.getVariableDefinitionUserDefined_Parameters();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionCollectionImpl <em>Variable Definition Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionCollectionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinitionCollection()
     * @generated
     */
    EClass VARIABLE_DEFINITION_COLLECTION = eINSTANCE.getVariableDefinitionCollection();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_COLLECTION__COLLECTION = eINSTANCE.getVariableDefinitionCollection_Collection();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_COLLECTION__TYPE = eINSTANCE.getVariableDefinitionCollection_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_COLLECTION__NAME = eINSTANCE.getVariableDefinitionCollection_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION_COLLECTION__VALUE = eINSTANCE.getVariableDefinitionCollection_Value();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionBasicImpl <em>Variable Definition Basic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionBasicImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinitionBasic()
     * @generated
     */
    EClass VARIABLE_DEFINITION_BASIC = eINSTANCE.getVariableDefinitionBasic();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_BASIC__TYPE = eINSTANCE.getVariableDefinitionBasic_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION_BASIC__NAME = eINSTANCE.getVariableDefinitionBasic_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION_BASIC__EXPRESSION = eINSTANCE.getVariableDefinitionBasic_Expression();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ParameterAssignmentImpl <em>Parameter Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ParameterAssignmentImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getParameterAssignment()
     * @generated
     */
    EClass PARAMETER_ASSIGNMENT = eINSTANCE.getParameterAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_ASSIGNMENT__NAME = eINSTANCE.getParameterAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_ASSIGNMENT__VALUE = eINSTANCE.getParameterAssignment_Value();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableAssignmentImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableAssignment()
     * @generated
     */
    EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__VARIABLE = eINSTANCE.getVariableAssignment_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__EXPRESSION = eINSTANCE.getVariableAssignment_Expression();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableAssignmentObjectImpl <em>Variable Assignment Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableAssignmentObjectImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableAssignmentObject()
     * @generated
     */
    EClass VARIABLE_ASSIGNMENT_OBJECT = eINSTANCE.getVariableAssignmentObject();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableExpressionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableExpression()
     * @generated
     */
    EClass VARIABLE_EXPRESSION = eINSTANCE.getVariableExpression();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_EXPRESSION__MEMBERS = eINSTANCE.getVariableExpression_Members();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableExpressionObjectImpl <em>Variable Expression Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableExpressionObjectImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableExpressionObject()
     * @generated
     */
    EClass VARIABLE_EXPRESSION_OBJECT = eINSTANCE.getVariableExpressionObject();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.AtomicVariableExpressionObjectImpl <em>Atomic Variable Expression Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.AtomicVariableExpressionObjectImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getAtomicVariableExpressionObject()
     * @generated
     */
    EClass ATOMIC_VARIABLE_EXPRESSION_OBJECT = eINSTANCE.getAtomicVariableExpressionObject();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_VARIABLE_EXPRESSION_OBJECT__VARIABLE = eINSTANCE.getAtomicVariableExpressionObject_Variable();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_VARIABLE_EXPRESSION_OBJECT__ATTRIBUTE = eINSTANCE.getAtomicVariableExpressionObject_Attribute();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_VARIABLE_EXPRESSION_OBJECT__COMPLEX = eINSTANCE.getAtomicVariableExpressionObject_Complex();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_VARIABLE_EXPRESSION_OBJECT__VALUE = eINSTANCE.getAtomicVariableExpressionObject_Value();

    /**
     * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_VARIABLE_EXPRESSION_OBJECT__QUANTITY = eINSTANCE.getAtomicVariableExpressionObject_Quantity();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_VARIABLE_EXPRESSION_OBJECT__STRING = eINSTANCE.getAtomicVariableExpressionObject_String();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.CompoundVariableExpressionObjectImpl <em>Compound Variable Expression Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.CompoundVariableExpressionObjectImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getCompoundVariableExpressionObject()
     * @generated
     */
    EClass COMPOUND_VARIABLE_EXPRESSION_OBJECT = eINSTANCE.getCompoundVariableExpressionObject();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_VARIABLE_EXPRESSION_OBJECT__LIST = eINSTANCE.getCompoundVariableExpressionObject_List();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl <em>Rule Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRuleDefinition()
     * @generated
     */
    EClass RULE_DEFINITION = eINSTANCE.getRuleDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DEFINITION__NAME = eINSTANCE.getRuleDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DEFINITION__LHS = eINSTANCE.getRuleDefinition_Lhs();

    /**
     * The meta object literal for the '<em><b>Reversible</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_DEFINITION__REVERSIBLE = eINSTANCE.getRuleDefinition_Reversible();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DEFINITION__RHS = eINSTANCE.getRuleDefinition_Rhs();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.RuleObjectImpl <em>Rule Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.RuleObjectImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRuleObject()
     * @generated
     */
    EClass RULE_OBJECT = eINSTANCE.getRuleObject();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ATGCDefinitionImpl <em>ATGC Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ATGCDefinitionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getATGCDefinition()
     * @generated
     */
    EClass ATGC_DEFINITION = eINSTANCE.getATGCDefinition();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATGC_DEFINITION__COMMAND = eINSTANCE.getATGCDefinition_Command();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATGC_DEFINITION__ARGUMENTS = eINSTANCE.getATGCDefinition_Arguments();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPropertyDefinition()
     * @generated
     */
    EClass PROPERTY_DEFINITION = eINSTANCE.getPropertyDefinition();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__PROPERTY = eINSTANCE.getPropertyDefinition_Property();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ProbabilityPropertyImpl <em>Probability Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ProbabilityPropertyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProbabilityProperty()
     * @generated
     */
    EClass PROBABILITY_PROPERTY = eINSTANCE.getProbabilityProperty();

    /**
     * The meta object literal for the '<em><b>State Formula1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY_PROPERTY__STATE_FORMULA1 = eINSTANCE.getProbabilityProperty_StateFormula1();

    /**
     * The meta object literal for the '<em><b>Is Eventually</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__IS_EVENTUALLY = eINSTANCE.getProbabilityProperty_IsEventually();

    /**
     * The meta object literal for the '<em><b>Is Never</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__IS_NEVER = eINSTANCE.getProbabilityProperty_IsNever();

    /**
     * The meta object literal for the '<em><b>Is Always</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__IS_ALWAYS = eINSTANCE.getProbabilityProperty_IsAlways();

    /**
     * The meta object literal for the '<em><b>Is Until Then</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__IS_UNTIL_THEN = eINSTANCE.getProbabilityProperty_IsUntilThen();

    /**
     * The meta object literal for the '<em><b>Is Followed By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__IS_FOLLOWED_BY = eINSTANCE.getProbabilityProperty_IsFollowedBy();

    /**
     * The meta object literal for the '<em><b>State Formula2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY_PROPERTY__STATE_FORMULA2 = eINSTANCE.getProbabilityProperty_StateFormula2();

    /**
     * The meta object literal for the '<em><b>Time Instant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY_PROPERTY__TIME_INSTANT = eINSTANCE.getProbabilityProperty_TimeInstant();

    /**
     * The meta object literal for the '<em><b>Time Interval</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY_PROPERTY__TIME_INTERVAL = eINSTANCE.getProbabilityProperty_TimeInterval();

    /**
     * The meta object literal for the '<em><b>Is Steady State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__IS_STEADY_STATE = eINSTANCE.getProbabilityProperty_IsSteadyState();

    /**
     * The meta object literal for the '<em><b>Is Infinitely Often</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__IS_INFINITELY_OFTEN = eINSTANCE.getProbabilityProperty_IsInfinitelyOften();

    /**
     * The meta object literal for the '<em><b>Probability Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT = eINSTANCE.getProbabilityProperty_ProbabilityConstraint();

    /**
     * The meta object literal for the '<em><b>Initial Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY_PROPERTY__INITIAL_CONDITIONS = eINSTANCE.getProbabilityProperty_InitialConditions();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.RewardPropertyImpl <em>Reward Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.RewardPropertyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRewardProperty()
     * @generated
     */
    EClass REWARD_PROPERTY = eINSTANCE.getRewardProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_PROPERTY__NAME = eINSTANCE.getRewardProperty_Name();

    /**
     * The meta object literal for the '<em><b>Time Instant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REWARD_PROPERTY__TIME_INSTANT = eINSTANCE.getRewardProperty_TimeInstant();

    /**
     * The meta object literal for the '<em><b>Concentration Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REWARD_PROPERTY__CONCENTRATION_CONSTRAINT = eINSTANCE.getRewardProperty_ConcentrationConstraint();

    /**
     * The meta object literal for the '<em><b>Initial Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REWARD_PROPERTY__INITIAL_CONDITIONS = eINSTANCE.getRewardProperty_InitialConditions();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.StateExpressionImpl <em>State Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.StateExpressionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getStateExpression()
     * @generated
     */
    EClass STATE_EXPRESSION = eINSTANCE.getStateExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_EXPRESSION__NAME = eINSTANCE.getStateExpression_Name();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_EXPRESSION__OPERATOR = eINSTANCE.getStateExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Concentration Quantity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EXPRESSION__CONCENTRATION_QUANTITY = eINSTANCE.getStateExpression_ConcentrationQuantity();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.StateFormulaImpl <em>State Formula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.StateFormulaImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getStateFormula()
     * @generated
     */
    EClass STATE_FORMULA = eINSTANCE.getStateFormula();

    /**
     * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_FORMULA__FORMULA = eINSTANCE.getStateFormula_Formula();

    /**
     * The meta object literal for the '<em><b>Atomic Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FORMULA__ATOMIC_FORMULA = eINSTANCE.getStateFormula_AtomicFormula();

    /**
     * The meta object literal for the '<em><b>Is Negation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_FORMULA__IS_NEGATION = eINSTANCE.getStateFormula_IsNegation();

    /**
     * The meta object literal for the '<em><b>Negated Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FORMULA__NEGATED_FORMULA = eINSTANCE.getStateFormula_NegatedFormula();

    /**
     * The meta object literal for the '<em><b>Left Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FORMULA__LEFT_FORMULA = eINSTANCE.getStateFormula_LeftFormula();

    /**
     * The meta object literal for the '<em><b>Is Conjunction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_FORMULA__IS_CONJUNCTION = eINSTANCE.getStateFormula_IsConjunction();

    /**
     * The meta object literal for the '<em><b>Is Disjunction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_FORMULA__IS_DISJUNCTION = eINSTANCE.getStateFormula_IsDisjunction();

    /**
     * The meta object literal for the '<em><b>Is Implication</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_FORMULA__IS_IMPLICATION = eINSTANCE.getStateFormula_IsImplication();

    /**
     * The meta object literal for the '<em><b>Right Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FORMULA__RIGHT_FORMULA = eINSTANCE.getStateFormula_RightFormula();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.TimeInstantImpl <em>Time Instant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.TimeInstantImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getTimeInstant()
     * @generated
     */
    EClass TIME_INSTANT = eINSTANCE.getTimeInstant();

    /**
     * The meta object literal for the '<em><b>Is Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_INSTANT__IS_EQUAL_TO = eINSTANCE.getTimeInstant_IsEqualTo();

    /**
     * The meta object literal for the '<em><b>Time Instant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_INSTANT__TIME_INSTANT = eINSTANCE.getTimeInstant_TimeInstant();

    /**
     * The meta object literal for the '<em><b>Is Less Than Or Equal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_INSTANT__IS_LESS_THAN_OR_EQUAL = eINSTANCE.getTimeInstant_IsLessThanOrEqual();

    /**
     * The meta object literal for the '<em><b>Is Greater Than Or Equal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_INSTANT__IS_GREATER_THAN_OR_EQUAL = eINSTANCE.getTimeInstant_IsGreaterThanOrEqual();

    /**
     * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_INSTANT__TIME_UNIT = eINSTANCE.getTimeInstant_TimeUnit();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.TimeIntervalImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getTimeInterval()
     * @generated
     */
    EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_INTERVAL__LOWER_BOUND = eINSTANCE.getTimeInterval_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_INTERVAL__UPPER_BOUND = eINSTANCE.getTimeInterval_UpperBound();

    /**
     * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_INTERVAL__TIME_UNIT = eINSTANCE.getTimeInterval_TimeUnit();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.RewardTimeInstantImpl <em>Reward Time Instant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.RewardTimeInstantImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRewardTimeInstant()
     * @generated
     */
    EClass REWARD_TIME_INSTANT = eINSTANCE.getRewardTimeInstant();

    /**
     * The meta object literal for the '<em><b>Is Equal To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_TIME_INSTANT__IS_EQUAL_TO = eINSTANCE.getRewardTimeInstant_IsEqualTo();

    /**
     * The meta object literal for the '<em><b>Is Less Than Or Equal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_TIME_INSTANT__IS_LESS_THAN_OR_EQUAL = eINSTANCE.getRewardTimeInstant_IsLessThanOrEqual();

    /**
     * The meta object literal for the '<em><b>Time Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_TIME_INSTANT__TIME_VALUE = eINSTANCE.getRewardTimeInstant_TimeValue();

    /**
     * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_TIME_INSTANT__TIME_UNIT = eINSTANCE.getRewardTimeInstant_TimeUnit();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ProbabilityConstraintImpl <em>Probability Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ProbabilityConstraintImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProbabilityConstraint()
     * @generated
     */
    EClass PROBABILITY_CONSTRAINT = eINSTANCE.getProbabilityConstraint();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_CONSTRAINT__OPERATOR = eINSTANCE.getProbabilityConstraint_Operator();

    /**
     * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_CONSTRAINT__PROBABILITY = eINSTANCE.getProbabilityConstraint_Probability();

    /**
     * The meta object literal for the '<em><b>Has Unknown Probability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_CONSTRAINT__HAS_UNKNOWN_PROBABILITY = eINSTANCE.getProbabilityConstraint_HasUnknownProbability();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ConcentrationConstraintImpl <em>Concentration Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ConcentrationConstraintImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getConcentrationConstraint()
     * @generated
     */
    EClass CONCENTRATION_CONSTRAINT = eINSTANCE.getConcentrationConstraint();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCENTRATION_CONSTRAINT__OPERATOR = eINSTANCE.getConcentrationConstraint_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCENTRATION_CONSTRAINT__VALUE = eINSTANCE.getConcentrationConstraint_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCENTRATION_CONSTRAINT__UNIT = eINSTANCE.getConcentrationConstraint_Unit();

    /**
     * The meta object literal for the '<em><b>Is Unknown</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCENTRATION_CONSTRAINT__IS_UNKNOWN = eINSTANCE.getConcentrationConstraint_IsUnknown();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyInitialConditionImpl <em>Property Initial Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.PropertyInitialConditionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPropertyInitialCondition()
     * @generated
     */
    EClass PROPERTY_INITIAL_CONDITION = eINSTANCE.getPropertyInitialCondition();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_INITIAL_CONDITION__VARIABLE = eINSTANCE.getPropertyInitialCondition_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_INITIAL_CONDITION__VALUE = eINSTANCE.getPropertyInitialCondition_Value();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.QuantityImpl <em>Quantity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.QuantityImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getQuantity()
     * @generated
     */
    EClass QUANTITY = eINSTANCE.getQuantity();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTITY__UNITS = eINSTANCE.getQuantity_Units();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ConcentrationQuantityImpl <em>Concentration Quantity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ConcentrationQuantityImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getConcentrationQuantity()
     * @generated
     */
    EClass CONCENTRATION_QUANTITY = eINSTANCE.getConcentrationQuantity();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCENTRATION_QUANTITY__VALUE = eINSTANCE.getConcentrationQuantity_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCENTRATION_QUANTITY__UNIT = eINSTANCE.getConcentrationQuantity_Unit();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ListImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__ENTRIES = eINSTANCE.getList_Entries();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.ImportImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getImport()
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

  }

} //IblPackage
