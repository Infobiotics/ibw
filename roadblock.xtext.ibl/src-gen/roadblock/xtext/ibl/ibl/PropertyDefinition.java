/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyDefinition()
 * @model
 * @generated
 */
public interface PropertyDefinition extends SystemBodyMember, PlasmidBodyMember, ChromosomeBodyMember, CellBodyMember, CustomFunctionBodyMember, DeviceMembers
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(EObject)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getPropertyDefinition_Property()
   * @model containment="true"
   * @generated
   */
  EObject getProperty();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.PropertyDefinition#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(EObject value);

} // PropertyDefinition
