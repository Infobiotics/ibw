/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.RuleDefinition#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.RuleDefinition#getLhs <em>Lhs</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.RuleDefinition#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getRuleDefinition()
 * @model
 * @generated
 */
public interface RuleDefinition extends FunctionDefinitionMember
{
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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getRuleDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.RuleDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference list.
   * The list contents are of type {@link roadblock.xtext.ibl.ibl.RuleObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getRuleDefinition_Lhs()
   * @model containment="true"
   * @generated
   */
  EList<RuleObject> getLhs();

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference list.
   * The list contents are of type {@link roadblock.xtext.ibl.ibl.RuleObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getRuleDefinition_Rhs()
   * @model containment="true"
   * @generated
   */
  EList<RuleObject> getRhs();

} // RuleDefinition
