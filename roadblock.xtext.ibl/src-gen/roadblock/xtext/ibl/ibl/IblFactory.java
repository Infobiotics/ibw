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
   * Returns a new object of class '<em>Variable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition</em>'.
   * @generated
   */
  VariableDefinition createVariableDefinition();

  /**
   * Returns a new object of class '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Definition</em>'.
   * @generated
   */
  FunctionDefinition createFunctionDefinition();

  /**
   * Returns a new object of class '<em>Function Use Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Use Member</em>'.
   * @generated
   */
  FunctionUseMember createFunctionUseMember();

  /**
   * Returns a new object of class '<em>Function Parameter Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Parameter Member</em>'.
   * @generated
   */
  FunctionParameterMember createFunctionParameterMember();

  /**
   * Returns a new object of class '<em>Function Definition Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Definition Member</em>'.
   * @generated
   */
  FunctionDefinitionMember createFunctionDefinitionMember();

  /**
   * Returns a new object of class '<em>Device Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Device Definition</em>'.
   * @generated
   */
  DeviceDefinition createDeviceDefinition();

  /**
   * Returns a new object of class '<em>Variable Definition Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Definition Member</em>'.
   * @generated
   */
  VariableDefinitionMember createVariableDefinitionMember();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Variable Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Type</em>'.
   * @generated
   */
  VariableType createVariableType();

  /**
   * Returns a new object of class '<em>Variable Qualifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Qualifier</em>'.
   * @generated
   */
  VariableQualifier createVariableQualifier();

  /**
   * Returns a new object of class '<em>Variable Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Assignment</em>'.
   * @generated
   */
  VariableAssignment createVariableAssignment();

  /**
   * Returns a new object of class '<em>Variable Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Attribute</em>'.
   * @generated
   */
  VariableAttribute createVariableAttribute();

  /**
   * Returns a new object of class '<em>Variable Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Expression</em>'.
   * @generated
   */
  VariableExpression createVariableExpression();

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
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IblPackage getIblPackage();

} //IblFactory
