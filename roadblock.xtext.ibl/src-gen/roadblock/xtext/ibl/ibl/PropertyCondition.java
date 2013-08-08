/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyCondition#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyCondition#getUpperBounds <em>Upper Bounds</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyCondition#getOperator <em>Operator</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyCondition#getProbability <em>Probability</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyCondition#getInitialConditions <em>Initial Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyCondition()
 * @model
 * @generated
 */
public interface PropertyCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' containment reference.
   * @see #setLowerBound(Quantity)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyCondition_LowerBound()
   * @model containment="true"
   * @generated
   */
  Quantity getLowerBound();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyCondition#getLowerBound <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' containment reference.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(Quantity value);

  /**
   * Returns the value of the '<em><b>Upper Bounds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bounds</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bounds</em>' containment reference.
   * @see #setUpperBounds(Quantity)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyCondition_UpperBounds()
   * @model containment="true"
   * @generated
   */
  Quantity getUpperBounds();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyCondition#getUpperBounds <em>Upper Bounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bounds</em>' containment reference.
   * @see #getUpperBounds()
   * @generated
   */
  void setUpperBounds(Quantity value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyCondition_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyCondition#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Probability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probability</em>' attribute.
   * @see #setProbability(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyCondition_Probability()
   * @model
   * @generated
   */
  String getProbability();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyCondition#getProbability <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probability</em>' attribute.
   * @see #getProbability()
   * @generated
   */
  void setProbability(String value);

  /**
   * Returns the value of the '<em><b>Initial Conditions</b></em>' containment reference list.
   * The list contents are of type {@link roadblock.xtext.ibl.ibl.PropertyInitialCondition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Conditions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Conditions</em>' containment reference list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyCondition_InitialConditions()
   * @model containment="true"
   * @generated
   */
  EList<PropertyInitialCondition> getInitialConditions();

} // PropertyCondition
