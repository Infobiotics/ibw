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

import roadblock.xtext.ibl.ibl.FunctionBodyMember;
import roadblock.xtext.ibl.ibl.FunctionDefinition;
import roadblock.xtext.ibl.ibl.FunctionParameterMember;
import roadblock.xtext.ibl.ibl.FunctionUseMember;
import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.VariableName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends ModelMemberImpl implements FunctionDefinition
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected VariableName name;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<FunctionParameterMember> parameters;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<FunctionBodyMember> members;

  /**
   * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUses()
   * @generated
   * @ordered
   */
  protected EList<FunctionUseMember> uses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDefinitionImpl()
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
    return IblPackage.Literals.FUNCTION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.FUNCTION_DEFINITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(VariableName newName, NotificationChain msgs)
  {
    VariableName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.FUNCTION_DEFINITION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(VariableName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.FUNCTION_DEFINITION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.FUNCTION_DEFINITION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.FUNCTION_DEFINITION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionParameterMember> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<FunctionParameterMember>(FunctionParameterMember.class, this, IblPackage.FUNCTION_DEFINITION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionBodyMember> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<FunctionBodyMember>(FunctionBodyMember.class, this, IblPackage.FUNCTION_DEFINITION__MEMBERS);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionUseMember> getUses()
  {
    if (uses == null)
    {
      uses = new EObjectContainmentEList<FunctionUseMember>(FunctionUseMember.class, this, IblPackage.FUNCTION_DEFINITION__USES);
    }
    return uses;
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
      case IblPackage.FUNCTION_DEFINITION__NAME:
        return basicSetName(null, msgs);
      case IblPackage.FUNCTION_DEFINITION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case IblPackage.FUNCTION_DEFINITION__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case IblPackage.FUNCTION_DEFINITION__USES:
        return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
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
      case IblPackage.FUNCTION_DEFINITION__TYPE:
        return getType();
      case IblPackage.FUNCTION_DEFINITION__NAME:
        return getName();
      case IblPackage.FUNCTION_DEFINITION__PARAMETERS:
        return getParameters();
      case IblPackage.FUNCTION_DEFINITION__MEMBERS:
        return getMembers();
      case IblPackage.FUNCTION_DEFINITION__USES:
        return getUses();
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
      case IblPackage.FUNCTION_DEFINITION__TYPE:
        setType((String)newValue);
        return;
      case IblPackage.FUNCTION_DEFINITION__NAME:
        setName((VariableName)newValue);
        return;
      case IblPackage.FUNCTION_DEFINITION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends FunctionParameterMember>)newValue);
        return;
      case IblPackage.FUNCTION_DEFINITION__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends FunctionBodyMember>)newValue);
        return;
      case IblPackage.FUNCTION_DEFINITION__USES:
        getUses().clear();
        getUses().addAll((Collection<? extends FunctionUseMember>)newValue);
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
      case IblPackage.FUNCTION_DEFINITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case IblPackage.FUNCTION_DEFINITION__NAME:
        setName((VariableName)null);
        return;
      case IblPackage.FUNCTION_DEFINITION__PARAMETERS:
        getParameters().clear();
        return;
      case IblPackage.FUNCTION_DEFINITION__MEMBERS:
        getMembers().clear();
        return;
      case IblPackage.FUNCTION_DEFINITION__USES:
        getUses().clear();
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
      case IblPackage.FUNCTION_DEFINITION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case IblPackage.FUNCTION_DEFINITION__NAME:
        return name != null;
      case IblPackage.FUNCTION_DEFINITION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case IblPackage.FUNCTION_DEFINITION__MEMBERS:
        return members != null && !members.isEmpty();
      case IblPackage.FUNCTION_DEFINITION__USES:
        return uses != null && !uses.isEmpty();
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //FunctionDefinitionImpl
