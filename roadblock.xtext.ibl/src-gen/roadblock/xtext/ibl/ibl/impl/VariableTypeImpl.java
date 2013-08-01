/**
 */
package roadblock.xtext.ibl.ibl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.VariableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableTypeImpl#getPrimitive <em>Primitive</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableTypeImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableTypeImpl extends MinimalEObjectImpl.Container implements VariableType
{
  /**
   * The default value of the '{@link #getPrimitive() <em>Primitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitive()
   * @generated
   * @ordered
   */
  protected static final String PRIMITIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimitive() <em>Primitive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitive()
   * @generated
   * @ordered
   */
  protected String primitive = PRIMITIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected String reference = REFERENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IblPackage.Literals.VARIABLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimitive()
  {
    return primitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitive(String newPrimitive)
  {
    String oldPrimitive = primitive;
    primitive = newPrimitive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_TYPE__PRIMITIVE, oldPrimitive, primitive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(String newReference)
  {
    String oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_TYPE__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IblPackage.VARIABLE_TYPE__PRIMITIVE:
        return getPrimitive();
      case IblPackage.VARIABLE_TYPE__REFERENCE:
        return getReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IblPackage.VARIABLE_TYPE__PRIMITIVE:
        setPrimitive((String)newValue);
        return;
      case IblPackage.VARIABLE_TYPE__REFERENCE:
        setReference((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IblPackage.VARIABLE_TYPE__PRIMITIVE:
        setPrimitive(PRIMITIVE_EDEFAULT);
        return;
      case IblPackage.VARIABLE_TYPE__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IblPackage.VARIABLE_TYPE__PRIMITIVE:
        return PRIMITIVE_EDEFAULT == null ? primitive != null : !PRIMITIVE_EDEFAULT.equals(primitive);
      case IblPackage.VARIABLE_TYPE__REFERENCE:
        return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (primitive: ");
    result.append(primitive);
    result.append(", reference: ");
    result.append(reference);
    result.append(')');
    return result.toString();
  }

} //VariableTypeImpl
