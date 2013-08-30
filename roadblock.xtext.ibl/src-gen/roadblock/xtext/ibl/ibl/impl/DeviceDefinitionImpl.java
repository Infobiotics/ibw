/**
 */
package roadblock.xtext.ibl.ibl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import roadblock.xtext.ibl.ibl.DeviceDefinition;
import roadblock.xtext.ibl.ibl.DeviceMembers;
import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.List;
import roadblock.xtext.ibl.ibl.ParameterAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.DeviceDefinitionImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceDefinitionImpl extends FunctionBodyMemberImpl implements DeviceDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParts()
   * @generated
   * @ordered
   */
  protected List parts;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<ParameterAssignment> parameters;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<DeviceMembers> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceDefinitionImpl()
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
    return IblPackage.Literals.DEVICE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.DEVICE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getParts()
  {
    return parts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParts(List newParts, NotificationChain msgs)
  {
    List oldParts = parts;
    parts = newParts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.DEVICE_DEFINITION__PARTS, oldParts, newParts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParts(List newParts)
  {
    if (newParts != parts)
    {
      NotificationChain msgs = null;
      if (parts != null)
        msgs = ((InternalEObject)parts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.DEVICE_DEFINITION__PARTS, null, msgs);
      if (newParts != null)
        msgs = ((InternalEObject)newParts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.DEVICE_DEFINITION__PARTS, null, msgs);
      msgs = basicSetParts(newParts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.DEVICE_DEFINITION__PARTS, newParts, newParts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterAssignment> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<ParameterAssignment>(ParameterAssignment.class, this, IblPackage.DEVICE_DEFINITION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeviceMembers> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<DeviceMembers>(DeviceMembers.class, this, IblPackage.DEVICE_DEFINITION__MEMBERS);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IblPackage.DEVICE_DEFINITION__PARTS:
        return basicSetParts(null, msgs);
      case IblPackage.DEVICE_DEFINITION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case IblPackage.DEVICE_DEFINITION__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case IblPackage.DEVICE_DEFINITION__NAME:
        return getName();
      case IblPackage.DEVICE_DEFINITION__PARTS:
        return getParts();
      case IblPackage.DEVICE_DEFINITION__PARAMETERS:
        return getParameters();
      case IblPackage.DEVICE_DEFINITION__MEMBERS:
        return getMembers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IblPackage.DEVICE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case IblPackage.DEVICE_DEFINITION__PARTS:
        setParts((List)newValue);
        return;
      case IblPackage.DEVICE_DEFINITION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ParameterAssignment>)newValue);
        return;
      case IblPackage.DEVICE_DEFINITION__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends DeviceMembers>)newValue);
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
      case IblPackage.DEVICE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IblPackage.DEVICE_DEFINITION__PARTS:
        setParts((List)null);
        return;
      case IblPackage.DEVICE_DEFINITION__PARAMETERS:
        getParameters().clear();
        return;
      case IblPackage.DEVICE_DEFINITION__MEMBERS:
        getMembers().clear();
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
      case IblPackage.DEVICE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IblPackage.DEVICE_DEFINITION__PARTS:
        return parts != null;
      case IblPackage.DEVICE_DEFINITION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case IblPackage.DEVICE_DEFINITION__MEMBERS:
        return members != null && !members.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DeviceDefinitionImpl
