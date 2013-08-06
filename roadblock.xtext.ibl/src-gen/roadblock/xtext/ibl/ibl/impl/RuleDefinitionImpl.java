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

import roadblock.xtext.ibl.ibl.EString;
import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.RuleDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl#isReversible <em>Reversible</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.RuleDefinitionImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleDefinitionImpl extends FunctionDefinitionMemberImpl implements RuleDefinition
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
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected EList<EString> lhs;

  /**
   * The default value of the '{@link #isReversible() <em>Reversible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReversible()
   * @generated
   * @ordered
   */
  protected static final boolean REVERSIBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReversible() <em>Reversible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReversible()
   * @generated
   * @ordered
   */
  protected boolean reversible = REVERSIBLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRhs()
   * @generated
   * @ordered
   */
  protected EList<EString> rhs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleDefinitionImpl()
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
    return IblPackage.Literals.RULE_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EString> getLhs()
  {
    if (lhs == null)
    {
      lhs = new EObjectContainmentEList<EString>(EString.class, this, IblPackage.RULE_DEFINITION__LHS);
    }
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReversible()
  {
    return reversible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReversible(boolean newReversible)
  {
    boolean oldReversible = reversible;
    reversible = newReversible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RULE_DEFINITION__REVERSIBLE, oldReversible, reversible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EString> getRhs()
  {
    if (rhs == null)
    {
      rhs = new EObjectContainmentEList<EString>(EString.class, this, IblPackage.RULE_DEFINITION__RHS);
    }
    return rhs;
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
      case IblPackage.RULE_DEFINITION__LHS:
        return ((InternalEList<?>)getLhs()).basicRemove(otherEnd, msgs);
      case IblPackage.RULE_DEFINITION__RHS:
        return ((InternalEList<?>)getRhs()).basicRemove(otherEnd, msgs);
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
      case IblPackage.RULE_DEFINITION__NAME:
        return getName();
      case IblPackage.RULE_DEFINITION__LHS:
        return getLhs();
      case IblPackage.RULE_DEFINITION__REVERSIBLE:
        return isReversible();
      case IblPackage.RULE_DEFINITION__RHS:
        return getRhs();
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
      case IblPackage.RULE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case IblPackage.RULE_DEFINITION__LHS:
        getLhs().clear();
        getLhs().addAll((Collection<? extends EString>)newValue);
        return;
      case IblPackage.RULE_DEFINITION__REVERSIBLE:
        setReversible((Boolean)newValue);
        return;
      case IblPackage.RULE_DEFINITION__RHS:
        getRhs().clear();
        getRhs().addAll((Collection<? extends EString>)newValue);
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
      case IblPackage.RULE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IblPackage.RULE_DEFINITION__LHS:
        getLhs().clear();
        return;
      case IblPackage.RULE_DEFINITION__REVERSIBLE:
        setReversible(REVERSIBLE_EDEFAULT);
        return;
      case IblPackage.RULE_DEFINITION__RHS:
        getRhs().clear();
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
      case IblPackage.RULE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IblPackage.RULE_DEFINITION__LHS:
        return lhs != null && !lhs.isEmpty();
      case IblPackage.RULE_DEFINITION__REVERSIBLE:
        return reversible != REVERSIBLE_EDEFAULT;
      case IblPackage.RULE_DEFINITION__RHS:
        return rhs != null && !rhs.isEmpty();
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
    result.append(", reversible: ");
    result.append(reversible);
    result.append(')');
    return result.toString();
  }

} //RuleDefinitionImpl
