/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getParts <em>Parts</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getInput <em>Input</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getOutputput <em>Outputput</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getDeviceDefinition()
 * @model
 * @generated
 */
public interface DeviceDefinition extends SystemBodyMember, PlasmidBodyMember, ChromosomeBodyMember, CellBodyMember, CustomFunctionBodyMember
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
   * @see roadblock.xtext.ibl.ibl.IblPackage#getDeviceDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parts</em>' containment reference.
   * @see #setParts(List)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getDeviceDefinition_Parts()
   * @model containment="true"
   * @generated
   */
  List getParts();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getParts <em>Parts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parts</em>' containment reference.
   * @see #getParts()
   * @generated
   */
  void setParts(List value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(List)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getDeviceDefinition_Input()
   * @model containment="true"
   * @generated
   */
  List getInput();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(List value);

  /**
   * Returns the value of the '<em><b>Outputput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputput</em>' containment reference.
   * @see #setOutputput(List)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getDeviceDefinition_Outputput()
   * @model containment="true"
   * @generated
   */
  List getOutputput();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.DeviceDefinition#getOutputput <em>Outputput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outputput</em>' containment reference.
   * @see #getOutputput()
   * @generated
   */
  void setOutputput(List value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link roadblock.xtext.ibl.ibl.DeviceMembers}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see roadblock.xtext.ibl.ibl.IblPackage#getDeviceDefinition_Members()
   * @model containment="true"
   * @generated
   */
  EList<DeviceMembers> getMembers();

} // DeviceDefinition
