/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getProperty <em>Property</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getCondition <em>Condition</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getTime <em>Time</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getOperator <em>Operator</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getConcentration <em>Concentration</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyDefinition()
 * @model
 * @generated
 */
public interface PropertyDefinition extends FunctionBodyMember, DeviceMembers
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link roadblock.xtext.ibl.ibl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyDefinition_Property()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperty();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(PropertyCondition)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyDefinition_Condition()
   * @model containment="true"
   * @generated
   */
  PropertyCondition getCondition();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(PropertyCondition value);

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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(REAL)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyDefinition_Time()
   * @model containment="true"
   * @generated
   */
  REAL getTime();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(REAL value);

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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyDefinition_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Concentration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concentration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concentration</em>' containment reference.
   * @see #setConcentration(Quantity)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyDefinition_Concentration()
   * @model containment="true"
   * @generated
   */
  Quantity getConcentration();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getConcentration <em>Concentration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concentration</em>' containment reference.
   * @see #getConcentration()
   * @generated
   */
  void setConcentration(Quantity value);

} // PropertyDefinition
