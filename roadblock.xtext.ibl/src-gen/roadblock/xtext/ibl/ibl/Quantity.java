/**
 */
package roadblock.xtext.ibl.ibl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.Quantity#getValue <em>Value</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.Quantity#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.xtext.ibl.ibl.IblPackage#getQuantity()
 * @model
 * @generated
 */
public interface Quantity extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getQuantity_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.Quantity#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Units</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Units</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Units</em>' attribute.
   * @see #setUnits(String)
   * @see roadblock.xtext.ibl.ibl.IblPackage#getQuantity_Units()
   * @model
   * @generated
   */
  String getUnits();

  /**
   * Sets the value of the '{@link roadblock.xtext.ibl.ibl.Quantity#getUnits <em>Units</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Units</em>' attribute.
   * @see #getUnits()
   * @generated
   */
  void setUnits(String value);

} // Quantity
