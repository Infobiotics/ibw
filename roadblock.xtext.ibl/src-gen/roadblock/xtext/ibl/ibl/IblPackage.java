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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__TYPE = MODEL_MEMBER_FEATURE_COUNT + 1;

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
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RuleObjectImpl <em>Rule Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RuleObjectImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRuleObject()
   * @generated
   */
  int RULE_OBJECT = 23;

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
  int VARIABLE_COMPLEX = 7;

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
  int VARIABLE_ASSIGNMENT_OBJECT = 17;

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
  int VARIABLE_ATTRIBUTE = 8;

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
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.UserDefinedTypeImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getUserDefinedType()
   * @generated
   */
  int USER_DEFINED_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>User Defined Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DEFINED_TYPE_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__DEFINITION = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION__QUALIFIER = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DEFINITION_FEATURE_COUNT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionBuiltInImpl <em>Variable Definition Built In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.VariableDefinitionBuiltInImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getVariableDefinitionBuiltIn()
   * @generated
   */
  int VARIABLE_DEFINITION_BUILT_IN = 11;

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
  int VARIABLE_DEFINITION_USER_DEFINED = 12;

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
  int VARIABLE_DEFINITION_COLLECTION = 13;

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
  int VARIABLE_DEFINITION_BASIC = 14;

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
  int PARAMETER_ASSIGNMENT = 15;

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
  int VARIABLE_ASSIGNMENT = 16;

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
  int VARIABLE_EXPRESSION = 18;

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
  int VARIABLE_EXPRESSION_OBJECT = 19;

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
  int ATOMIC_VARIABLE_EXPRESSION_OBJECT = 20;

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
  int COMPOUND_VARIABLE_EXPRESSION_OBJECT = 21;

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
  int RULE_DEFINITION = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
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
  int DEVICE_DEFINITION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__NAME = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__PARTS = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__INPUT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Outputput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__OUTPUTPUT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION__MEMBERS = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Device Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVICE_DEFINITION_FEATURE_COUNT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.DeviceMembersImpl <em>Device Members</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.DeviceMembersImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getDeviceMembers()
   * @generated
   */
  int DEVICE_MEMBERS = 25;

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
  int ATGC_DEFINITION = 26;

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
  int PROPERTY_DEFINITION = 27;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__PROPERTY = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = FUNCTION_BODY_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.ProbabilityPropertyImpl <em>Probability Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.ProbabilityPropertyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getProbabilityProperty()
   * @generated
   */
  int PROBABILITY_PROPERTY = 28;

  /**
   * The feature id for the '<em><b>State Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__STATE_FORMULA = 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__PATTERN = 1;

  /**
   * The feature id for the '<em><b>State Formula2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__STATE_FORMULA2 = 2;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__LOWER_BOUND = 3;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__UPPER_BOUND = 4;

  /**
   * The feature id for the '<em><b>Time Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__TIME_UNIT = 5;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__OPERATOR = 6;

  /**
   * The feature id for the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__PROBABILITY = 7;

  /**
   * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY__INITIAL_CONDITIONS = 8;

  /**
   * The number of structural features of the '<em>Probability Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_PROPERTY_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.RewardPropertyImpl <em>Reward Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.RewardPropertyImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getRewardProperty()
   * @generated
   */
  int REWARD_PROPERTY = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Time Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__TIME_VALUE = 1;

  /**
   * The feature id for the '<em><b>Tim Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__TIM_UNIT = 2;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__OPERATOR = 3;

  /**
   * The feature id for the '<em><b>Concen Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__CONCEN_VALUE = 4;

  /**
   * The feature id for the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__UNITS = 5;

  /**
   * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY__INITIAL_CONDITIONS = 6;

  /**
   * The number of structural features of the '<em>Reward Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_PROPERTY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.StateExpressionImpl <em>State Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.StateExpressionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getStateExpression()
   * @generated
   */
  int STATE_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXPRESSION__LHS = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXPRESSION__RHS = 2;

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
  int STATE_FORMULA = 31;

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
   * The feature id for the '<em><b>Not Formula</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__NOT_FORMULA = 2;

  /**
   * The feature id for the '<em><b>Boolean Formula1</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__BOOLEAN_FORMULA1 = 3;

  /**
   * The feature id for the '<em><b>Boolean Formula2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__BOOLEAN_FORMULA2 = 4;

  /**
   * The number of structural features of the '<em>State Formula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link roadblock.xtext.ibl.ibl.impl.PropertyInitialConditionImpl <em>Property Initial Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see roadblock.xtext.ibl.ibl.impl.PropertyInitialConditionImpl
   * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getPropertyInitialCondition()
   * @generated
   */
  int PROPERTY_INITIAL_CONDITION = 32;

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
  int QUANTITY = 33;

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
  int CONCENTRATION_QUANTITY = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_QUANTITY__VALUE = 0;

  /**
   * The feature id for the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCENTRATION_QUANTITY__UNITS = 1;

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
  int LIST = 35;

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
  int IMPORT = 36;

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
   * Returns the meta object for class '{@link roadblock.xtext.ibl.ibl.UserDefinedType <em>User Defined Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Defined Type</em>'.
   * @see roadblock.xtext.ibl.ibl.UserDefinedType
   * @generated
   */
  EClass getUserDefinedType();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.UserDefinedType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see roadblock.xtext.ibl.ibl.UserDefinedType#getName()
   * @see #getUserDefinedType()
   * @generated
   */
  EAttribute getUserDefinedType_Name();

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
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getStateFormula <em>State Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Formula</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getStateFormula()
   * @see #getProbabilityProperty()
   * @generated
   */
  EReference getProbabilityProperty_StateFormula();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getPattern()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_Pattern();

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
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getLowerBound()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getUpperBound()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_UpperBound();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getTimeUnit <em>Time Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Unit</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getTimeUnit()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_TimeUnit();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getOperator()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_Operator();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ProbabilityProperty#getProbability <em>Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Probability</em>'.
   * @see roadblock.xtext.ibl.ibl.ProbabilityProperty#getProbability()
   * @see #getProbabilityProperty()
   * @generated
   */
  EAttribute getProbabilityProperty_Probability();

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
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardProperty#getTimeValue <em>Time Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Value</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty#getTimeValue()
   * @see #getRewardProperty()
   * @generated
   */
  EAttribute getRewardProperty_TimeValue();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardProperty#getTimUnit <em>Tim Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tim Unit</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty#getTimUnit()
   * @see #getRewardProperty()
   * @generated
   */
  EAttribute getRewardProperty_TimUnit();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardProperty#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty#getOperator()
   * @see #getRewardProperty()
   * @generated
   */
  EAttribute getRewardProperty_Operator();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardProperty#getConcenValue <em>Concen Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Concen Value</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty#getConcenValue()
   * @see #getRewardProperty()
   * @generated
   */
  EAttribute getRewardProperty_ConcenValue();

  /**
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.RewardProperty#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Units</em>'.
   * @see roadblock.xtext.ibl.ibl.RewardProperty#getUnits()
   * @see #getRewardProperty()
   * @generated
   */
  EAttribute getRewardProperty_Units();

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
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.StateExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lhs</em>'.
   * @see roadblock.xtext.ibl.ibl.StateExpression#getLhs()
   * @see #getStateExpression()
   * @generated
   */
  EAttribute getStateExpression_Lhs();

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
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.StateExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see roadblock.xtext.ibl.ibl.StateExpression#getRhs()
   * @see #getStateExpression()
   * @generated
   */
  EReference getStateExpression_Rhs();

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
   * Returns the meta object for the containment reference '{@link roadblock.xtext.ibl.ibl.StateFormula#getNotFormula <em>Not Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Not Formula</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#getNotFormula()
   * @see #getStateFormula()
   * @generated
   */
  EReference getStateFormula_NotFormula();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.StateFormula#getBooleanFormula1 <em>Boolean Formula1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Formula1</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#getBooleanFormula1()
   * @see #getStateFormula()
   * @generated
   */
  EReference getStateFormula_BooleanFormula1();

  /**
   * Returns the meta object for the containment reference list '{@link roadblock.xtext.ibl.ibl.StateFormula#getBooleanFormula2 <em>Boolean Formula2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Boolean Formula2</em>'.
   * @see roadblock.xtext.ibl.ibl.StateFormula#getBooleanFormula2()
   * @see #getStateFormula()
   * @generated
   */
  EReference getStateFormula_BooleanFormula2();

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
   * Returns the meta object for the attribute '{@link roadblock.xtext.ibl.ibl.ConcentrationQuantity#getUnits <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Units</em>'.
   * @see roadblock.xtext.ibl.ibl.ConcentrationQuantity#getUnits()
   * @see #getConcentrationQuantity()
   * @generated
   */
  EAttribute getConcentrationQuantity_Units();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__TYPE = eINSTANCE.getFunctionDefinition_Type();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_USE_MEMBER__NAME = eINSTANCE.getFunctionUseMember_Name();

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
     * The meta object literal for the '{@link roadblock.xtext.ibl.ibl.impl.UserDefinedTypeImpl <em>User Defined Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see roadblock.xtext.ibl.ibl.impl.UserDefinedTypeImpl
     * @see roadblock.xtext.ibl.ibl.impl.IblPackageImpl#getUserDefinedType()
     * @generated
     */
    EClass USER_DEFINED_TYPE = eINSTANCE.getUserDefinedType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER_DEFINED_TYPE__NAME = eINSTANCE.getUserDefinedType_Name();

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
     * The meta object literal for the '<em><b>State Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY_PROPERTY__STATE_FORMULA = eINSTANCE.getProbabilityProperty_StateFormula();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__PATTERN = eINSTANCE.getProbabilityProperty_Pattern();

    /**
     * The meta object literal for the '<em><b>State Formula2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY_PROPERTY__STATE_FORMULA2 = eINSTANCE.getProbabilityProperty_StateFormula2();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__LOWER_BOUND = eINSTANCE.getProbabilityProperty_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__UPPER_BOUND = eINSTANCE.getProbabilityProperty_UpperBound();

    /**
     * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__TIME_UNIT = eINSTANCE.getProbabilityProperty_TimeUnit();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__OPERATOR = eINSTANCE.getProbabilityProperty_Operator();

    /**
     * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROBABILITY_PROPERTY__PROBABILITY = eINSTANCE.getProbabilityProperty_Probability();

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
     * The meta object literal for the '<em><b>Time Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_PROPERTY__TIME_VALUE = eINSTANCE.getRewardProperty_TimeValue();

    /**
     * The meta object literal for the '<em><b>Tim Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_PROPERTY__TIM_UNIT = eINSTANCE.getRewardProperty_TimUnit();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_PROPERTY__OPERATOR = eINSTANCE.getRewardProperty_Operator();

    /**
     * The meta object literal for the '<em><b>Concen Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_PROPERTY__CONCEN_VALUE = eINSTANCE.getRewardProperty_ConcenValue();

    /**
     * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD_PROPERTY__UNITS = eINSTANCE.getRewardProperty_Units();

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
     * The meta object literal for the '<em><b>Lhs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_EXPRESSION__LHS = eINSTANCE.getStateExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_EXPRESSION__OPERATOR = eINSTANCE.getStateExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_EXPRESSION__RHS = eINSTANCE.getStateExpression_Rhs();

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
     * The meta object literal for the '<em><b>Not Formula</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FORMULA__NOT_FORMULA = eINSTANCE.getStateFormula_NotFormula();

    /**
     * The meta object literal for the '<em><b>Boolean Formula1</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FORMULA__BOOLEAN_FORMULA1 = eINSTANCE.getStateFormula_BooleanFormula1();

    /**
     * The meta object literal for the '<em><b>Boolean Formula2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FORMULA__BOOLEAN_FORMULA2 = eINSTANCE.getStateFormula_BooleanFormula2();

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
     * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCENTRATION_QUANTITY__UNITS = eINSTANCE.getConcentrationQuantity_Units();

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
