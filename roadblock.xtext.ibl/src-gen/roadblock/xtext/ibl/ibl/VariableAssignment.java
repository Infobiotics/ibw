/**
 */
package roadblock.xtext.ibl.ibl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableAssignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.VariableAssignment#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableAssignment()
 * @model
 * @generated
 */
public interface VariableAssignment extends FunctionDefinitionMember
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableAttribute)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableAssignment_Variable()
   * @model containment="true"
   * @generated
   */
  VariableAttribute getVariable();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableAssignment#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableAttribute value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(VariableExpression)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getVariableAssignment_Expression()
   * @model containment="true"
   * @generated
   */
  VariableExpression getExpression();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.VariableAssignment#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(VariableExpression value);

} // VariableAssignment
