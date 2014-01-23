/**
 */
package roadblock.xtext.ibl.ibl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import roadblock.xtext.ibl.ibl.FunctionDefinition;
import roadblock.xtext.ibl.ibl.FunctionUseMember;
import roadblock.xtext.ibl.ibl.IblPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl#getFunctionBody <em>Function Body</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.FunctionDefinitionImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends ModelMemberImpl implements FunctionDefinition
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
   * The cached value of the '{@link #getFunctionBody() <em>Function Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionBody()
   * @generated
   * @ordered
   */
  protected EObject functionBody;

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
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.FUNCTION_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getFunctionBody()
  {
    return functionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionBody(EObject newFunctionBody, NotificationChain msgs)
  {
    EObject oldFunctionBody = functionBody;
    functionBody = newFunctionBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.FUNCTION_DEFINITION__FUNCTION_BODY, oldFunctionBody, newFunctionBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionBody(EObject newFunctionBody)
  {
    if (newFunctionBody != functionBody)
    {
      NotificationChain msgs = null;
      if (functionBody != null)
        msgs = ((InternalEObject)functionBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.FUNCTION_DEFINITION__FUNCTION_BODY, null, msgs);
      if (newFunctionBody != null)
        msgs = ((InternalEObject)newFunctionBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.FUNCTION_DEFINITION__FUNCTION_BODY, null, msgs);
      msgs = basicSetFunctionBody(newFunctionBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.FUNCTION_DEFINITION__FUNCTION_BODY, newFunctionBody, newFunctionBody));
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
      case IblPackage.FUNCTION_DEFINITION__FUNCTION_BODY:
        return basicSetFunctionBody(null, msgs);
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
      case IblPackage.FUNCTION_DEFINITION__NAME:
        return getName();
      case IblPackage.FUNCTION_DEFINITION__FUNCTION_BODY:
        return getFunctionBody();
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
      case IblPackage.FUNCTION_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case IblPackage.FUNCTION_DEFINITION__FUNCTION_BODY:
        setFunctionBody((EObject)newValue);
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
      case IblPackage.FUNCTION_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IblPackage.FUNCTION_DEFINITION__FUNCTION_BODY:
        setFunctionBody((EObject)null);
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
      case IblPackage.FUNCTION_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IblPackage.FUNCTION_DEFINITION__FUNCTION_BODY:
        return functionBody != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionDefinitionImpl
