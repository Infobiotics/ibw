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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__TYPE = MODEL_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__NAME = MODEL_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__PARAMETERS = MODEL_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__MEMBERS = MODEL_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__USES = MODEL_MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = MODEL_MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionParameterMemberImpl <em>Function Parameter Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.FunctionParameterMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionParameterMember()
   * @generated
   */
  int FUNCTION_PARAMETER_MEMBER = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_MEMBER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_MEMBER__NAME = 1;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_MEMBER__SCOPE = 2;

  /**
   * The number of structural features of the '<em>Function Parameter Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_MEMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionBodyMemberImpl <em>Function Body Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.FunctionBodyMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionBodyMember()
   * @generated
   */
  int FUNCTION_BODY_MEMBER = 5;

  /**
   * The number of structural features of the '<em>Function Body Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_BODY_MEMBER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionUseMemberImpl <em>Function Use Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.FunctionUseMemberImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionUseMember()
   * @generated
   */
  int FUNCTION_USE_MEMBER = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_USE_MEMBER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
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
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RuleObjectImpl <em>Rule Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RuleObjectImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRuleObject()
   * @generated
   */
  int RULE_OBJECT = 15;

  /**
   * The number of structural features of the '<em>Rule Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableNameImpl <em>Variable Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableNameImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableName()
   * @generated
   */
  int VARIABLE_NAME = 7;

  /**
   * The number of structural features of the '<em>Variable Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_NAME_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableComplexImpl <em>Variable Complex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableComplexImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableComplex()
   * @generated
   */
  int VARIABLE_COMPLEX = 8;

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
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableAttributeImpl <em>Variable Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableAttributeImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableAttribute()
   * @generated
   */
  int VARIABLE_ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE__ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Variable Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl <em>Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinition()
   * @generated
   */
  int VARIABLE_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__QUALIFIER = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__TYPE = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__NAME = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__COLLECTION = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__CONSTRUCTOR = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__PARAMETERS = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ParameterAssignmentImpl <em>Parameter Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ParameterAssignmentImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getParameterAssignment()
   * @generated
   */
  int PARAMETER_ASSIGNMENT = 11;

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
  int VARIABLE_ASSIGNMENT = 12;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__VARIABLE = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__EXPRESSION = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_FEATURE_COUNT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableExpressionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableExpression()
   * @generated
   */
  int VARIABLE_EXPRESSION = 13;

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
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl <em>Rule Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRuleDefinition()
   * @generated
   */
  int RULE_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION__NAME = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION__LHS = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Reversible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION__REVERSIBLE = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION__RHS = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Rule Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_DEFINITION_FEATURE_COUNT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl <em>Device Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getDeviceDefinition()
   * @generated
   */
  int DEVICE_DEFINITION = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__NAME = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parts</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__PARTS = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__PARAMETERS = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__MEMBERS = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Device Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION_FEATURE_COUNT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.DeviceMembersImpl <em>Device Members</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.DeviceMembersImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getDeviceMembers()
   * @generated
   */
  int DEVICE_MEMBERS = 17;

  /**
   * The number of structural features of the '<em>Device Members</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_MEMBERS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ATGCDefinitionImpl <em>ATGC Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ATGCDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getATGCDefinition()
   * @generated
   */
  int ATGC_DEFINITION = 18;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATGC_DEFINITION__COMMAND = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATGC_DEFINITION__ARGUMENTS = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ATGC Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATGC_DEFINITION_FEATURE_COUNT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPropertyDefinition()
   * @generated
   */
  int PROPERTY_DEFINITION = 19;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__PROPERTY = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__CONDITION = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__NAME = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__TIME = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__OPERATOR = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Concentration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__CONCENTRATION = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.PropertyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__LHS = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__RHS = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyConditionImpl <em>Property Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.PropertyConditionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPropertyCondition()
   * @generated
   */
  int PROPERTY_CONDITION = 21;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONDITION__LOWER_BOUND = 0;

  /**
   * The feature id for the '<em><b>Upper Bounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONDITION__UPPER_BOUNDS = 1;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONDITION__OPERATOR = 2;

  /**
   * The feature id for the '<em><b>Probability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONDITION__PROBABILITY = 3;

  /**
   * The number of structural features of the '<em>Property Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONDITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.REALImpl <em>REAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.REALImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getREAL()
   * @generated
   */
  int REAL = 22;

  /**
   * The number of structural features of the '<em>REAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.QuantityImpl <em>Quantity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.QuantityImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getQuantity()
   * @generated
   */
  int QUANTITY = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
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
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ImportImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 24;

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
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionDefinition#getType()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionDefinition#getName()
   * @see #getFunctionDefinition()
   * @generated
   */
  EReference getFunctionDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionDefinition#getParameters()
   * @see #getFunctionDefinition()
   * @generated
   */
  EReference getFunctionDefinition_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.FunctionDefinition#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionDefinition#getMembers()
   * @see #getFunctionDefinition()
   * @generated
   */
  EReference getFunctionDefinition_Members();

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
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.FunctionParameterMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionParameterMember#getName()
   * @see #getFunctionParameterMember()
   * @generated
   */
  EReference getFunctionParameterMember_Name();

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
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.FunctionBodyMember <em>Function Body Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Body Member</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionBodyMember
   * @generated
   */
  EClass getFunctionBodyMember();

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
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.FunctionUseMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.FunctionUseMember#getName()
   * @see #getFunctionUseMember()
   * @generated
   */
  EReference getFunctionUseMember_Name();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.VariableName <em>Variable Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Name</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableName
   * @generated
   */
  EClass getVariableName();

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
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinition#getType()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinition#getName()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinition#getCollection()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Collection();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getConstructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinition#getConstructor()
   * @see #getVariableDefinition()
   * @generated
   */
  EAttribute getVariableDefinition_Constructor();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.VariableDefinition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.VariableDefinition#getParameters()
   * @see #getVariableDefinition()
   * @generated
   */
  EReference getVariableDefinition_Parameters();

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
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.RuleDefinition <em>Rule Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Definition</em>'.
   * @see roadblock.xtext.ibl.ibl.RuleDefinition
   * @generated
   */
  EClass getRuleDefinition();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.RuleDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.RuleDefinition#getName()
   * @see #getRuleDefinition()
   * @generated
   */
  EReference getRuleDefinition_Name();

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
   * Returns the meta object for the attribute list '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parts</em>'.
   * @see roadblock.xtext.ibl.ibl.DeviceDefinition#getParts()
   * @see #getDeviceDefinition()
   * @generated
   */
  EAttribute getDeviceDefinition_Parts();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see roadblock.xtext.ibl.ibl.DeviceDefinition#getParameters()
   * @see #getDeviceDefinition()
   * @generated
   */
  EReference getDeviceDefinition_Parameters();

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
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyDefinition#getProperty()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Property();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyDefinition#getCondition()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Condition();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyDefinition#getName()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyDefinition#getTime()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Time();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyDefinition#getOperator()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Operator();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getConcentration <em>Concentration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Concentration</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyDefinition#getConcentration()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Concentration();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see roadblock.xtext.ibl.ibl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.Property#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lhs</em>'.
   * @see roadblock.xtext.ibl.ibl.Property#getLhs()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Lhs();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.Property#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see roadblock.xtext.ibl.ibl.Property#getOperator()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Operator();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.Property#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see roadblock.xtext.ibl.ibl.Property#getRhs()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Rhs();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.PropertyCondition <em>Property Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Condition</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyCondition
   * @generated
   */
  EClass getPropertyCondition();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.PropertyCondition#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower Bound</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyCondition#getLowerBound()
   * @see #getPropertyCondition()
   * @generated
   */
  EReference getPropertyCondition_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.PropertyCondition#getUpperBounds <em>Upper Bounds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Bounds</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyCondition#getUpperBounds()
   * @see #getPropertyCondition()
   * @generated
   */
  EReference getPropertyCondition_UpperBounds();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.PropertyCondition#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyCondition#getOperator()
   * @see #getPropertyCondition()
   * @generated
   */
  EAttribute getPropertyCondition_Operator();

  /**
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.PropertyCondition#getProbability <em>Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Probability</em>'.
   * @see roadblock.xtext.ibl.ibl.PropertyCondition#getProbability()
   * @see #getPropertyCondition()
   * @generated
   */
  EReference getPropertyCondition_Probability();

  /**
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.REAL <em>REAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REAL</em>'.
   * @see roadblock.xtext.ibl.ibl.REAL
   * @generated
   */
  EClass getREAL();

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
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.Quantity#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see roadblock.xtext.ibl.ibl.Quantity#getValue()
   * @see #getQuantity()
   * @generated
   */
  EReference getQuantity_Value();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__TYPE = eINSTANCE.getFunctionDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__NAME = eINSTANCE.getFunctionDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__PARAMETERS = eINSTANCE.getFunctionDefinition_Parameters();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__MEMBERS = eINSTANCE.getFunctionDefinition_Members();

    /**
     * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__USES = eINSTANCE.getFunctionDefinition_Uses();

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
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_PARAMETER_MEMBER__NAME = eINSTANCE.getFunctionParameterMember_Name();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_PARAMETER_MEMBER__SCOPE = eINSTANCE.getFunctionParameterMember_Scope();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.FunctionBodyMemberImpl <em>Function Body Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.FunctionBodyMemberImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getFunctionBodyMember()
     * @generated
     */
    EClass FUNCTION_BODY_MEMBER = eINSTANCE.getFunctionBodyMember();

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
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_USE_MEMBER__NAME = eINSTANCE.getFunctionUseMember_Name();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.VariableNameImpl <em>Variable Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.VariableNameImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableName()
     * @generated
     */
    EClass VARIABLE_NAME = eINSTANCE.getVariableName();

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
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__QUALIFIER = eINSTANCE.getVariableDefinition_Qualifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__TYPE = eINSTANCE.getVariableDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__NAME = eINSTANCE.getVariableDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__COLLECTION = eINSTANCE.getVariableDefinition_Collection();

    /**
     * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DEFINITION__CONSTRUCTOR = eINSTANCE.getVariableDefinition_Constructor();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DEFINITION__PARAMETERS = eINSTANCE.getVariableDefinition_Parameters();

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
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl <em>Rule Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRuleDefinition()
     * @generated
     */
    EClass RULE_DEFINITION = eINSTANCE.getRuleDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_DEFINITION__NAME = eINSTANCE.getRuleDefinition_Name();

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
     * The meta object literal for the '<em><b>Parts</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEVICE_DEFINITION__PARTS = eINSTANCE.getDeviceDefinition_Parts();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEVICE_DEFINITION__PARAMETERS = eINSTANCE.getDeviceDefinition_Parameters();

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
     * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__PROPERTY = eINSTANCE.getPropertyDefinition_Property();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__CONDITION = eINSTANCE.getPropertyDefinition_Condition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__NAME = eINSTANCE.getPropertyDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__TIME = eINSTANCE.getPropertyDefinition_Time();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__OPERATOR = eINSTANCE.getPropertyDefinition_Operator();

    /**
     * The meta object literal for the '<em><b>Concentration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__CONCENTRATION = eINSTANCE.getPropertyDefinition_Concentration();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.PropertyImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__LHS = eINSTANCE.getProperty_Lhs();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__OPERATOR = eINSTANCE.getProperty_Operator();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__RHS = eINSTANCE.getProperty_Rhs();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyConditionImpl <em>Property Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.PropertyConditionImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPropertyCondition()
     * @generated
     */
    EClass PROPERTY_CONDITION = eINSTANCE.getPropertyCondition();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONDITION__LOWER_BOUND = eINSTANCE.getPropertyCondition_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bounds</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONDITION__UPPER_BOUNDS = eINSTANCE.getPropertyCondition_UpperBounds();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_CONDITION__OPERATOR = eINSTANCE.getPropertyCondition_Operator();

    /**
     * The meta object literal for the '<em><b>Probability</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONDITION__PROBABILITY = eINSTANCE.getPropertyCondition_Probability();

    /**
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.REALImpl <em>REAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.REALImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getREAL()
     * @generated
     */
    EClass REAL = eINSTANCE.getREAL();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTITY__VALUE = eINSTANCE.getQuantity_Value();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTITY__UNITS = eINSTANCE.getQuantity_Units();

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
