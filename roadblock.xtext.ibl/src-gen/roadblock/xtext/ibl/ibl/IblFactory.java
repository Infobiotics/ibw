/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see roadblock.xtext.ibl.ibl.IblPackage
 * @generated
 */
public interface IblFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IblFactory eINSTANCE = roadblock.xtext.ibl.ibl.impl.IblFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Model Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Member</em>'.
   * @generated
   */
  ModelMember createModelMember();

  /**
   * Returns a new object of class '<em>Import Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Statement</em>'.
   * @generated
   */
  ImportStatement createImportStatement();

  /**
   * Returns a new object of class '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Definition</em>'.
   * @generated
   */
  FunctionDefinition createFunctionDefinition();

  /**
   * Returns a new object of class '<em>Function Parameter Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Parameter Member</em>'.
   * @generated
   */
  FunctionParameterMember createFunctionParameterMember();

  /**
   * Returns a new object of class '<em>Function Body Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Body Member</em>'.
   * @generated
   */
  FunctionBodyMember createFunctionBodyMember();

  /**
   * Returns a new object of class '<em>Function Use Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Use Member</em>'.
   * @generated
   */
  FunctionUseMember createFunctionUseMember();

  /**
   * Returns a new object of class '<em>Variable Complex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Complex</em>'.
   * @generated
   */
  VariableComplex createVariableComplex();

  /**
   * Returns a new object of class '<em>Variable Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Attribute</em>'.
   * @generated
   */
  VariableAttribute createVariableAttribute();

  /**
   * Returns a new object of class '<em>User Defined Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Defined Type</em>'.
   * @generated
   */
  UserDefinedType createUserDefinedType();

  /**
   * Returns a new object of class '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition</em>'.
   * @generated
   */
  VariableDefinition createVariableDefinition();

  /**
   * Returns a new object of class '<em>Variable Definition Built In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition Built In</em>'.
   * @generated
   */
  VariableDefinitionBuiltIn createVariableDefinitionBuiltIn();

  /**
   * Returns a new object of class '<em>Variable Definition User Defined</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition User Defined</em>'.
   * @generated
   */
  VariableDefinitionUserDefined createVariableDefinitionUserDefined();

  /**
   * Returns a new object of class '<em>Variable Definition Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition Collection</em>'.
   * @generated
   */
  VariableDefinitionCollection createVariableDefinitionCollection();

  /**
   * Returns a new object of class '<em>Variable Definition Basic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition Basic</em>'.
   * @generated
   */
  VariableDefinitionBasic createVariableDefinitionBasic();

  /**
   * Returns a new object of class '<em>Parameter Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Assignment</em>'.
   * @generated
   */
  ParameterAssignment createParameterAssignment();

  /**
   * Returns a new object of class '<em>Variable Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Assignment</em>'.
   * @generated
   */
  VariableAssignment createVariableAssignment();

  /**
   * Returns a new object of class '<em>Variable Assignment Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Assignment Object</em>'.
   * @generated
   */
  VariableAssignmentObject createVariableAssignmentObject();

  /**
   * Returns a new object of class '<em>Variable Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Expression</em>'.
   * @generated
   */
  VariableExpression createVariableExpression();

  /**
   * Returns a new object of class '<em>Variable Expression Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Expression Object</em>'.
   * @generated
   */
  VariableExpressionObject createVariableExpressionObject();

  /**
   * Returns a new object of class '<em>Atomic Variable Expression Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Variable Expression Object</em>'.
   * @generated
   */
  AtomicVariableExpressionObject createAtomicVariableExpressionObject();

  /**
   * Returns a new object of class '<em>Compound Variable Expression Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compound Variable Expression Object</em>'.
   * @generated
   */
  CompoundVariableExpressionObject createCompoundVariableExpressionObject();

  /**
   * Returns a new object of class '<em>Rule Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Definition</em>'.
   * @generated
   */
  RuleDefinition createRuleDefinition();

  /**
   * Returns a new object of class '<em>Rule Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Object</em>'.
   * @generated
   */
  RuleObject createRuleObject();

  /**
   * Returns a new object of class '<em>Device Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Definition</em>'.
   * @generated
   */
  DeviceDefinition createDeviceDefinition();

  /**
   * Returns a new object of class '<em>Device Members</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Members</em>'.
   * @generated
   */
  DeviceMembers createDeviceMembers();

  /**
   * Returns a new object of class '<em>ATGC Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ATGC Definition</em>'.
   * @generated
   */
  ATGCDefinition createATGCDefinition();

  /**
   * Returns a new object of class '<em>Property Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Definition</em>'.
   * @generated
   */
  PropertyDefinition createPropertyDefinition();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Property Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Condition</em>'.
   * @generated
   */
  PropertyCondition createPropertyCondition();

  /**
   * Returns a new object of class '<em>Property Initial Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Initial Condition</em>'.
   * @generated
   */
  PropertyInitialCondition createPropertyInitialCondition();

  /**
   * Returns a new object of class '<em>Quantity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantity</em>'.
   * @generated
   */
  Quantity createQuantity();

  /**
   * Returns a new object of class '<em>List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List</em>'.
   * @generated
   */
  List createList();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IblPackage getIblPackage();

} //IblFactory
