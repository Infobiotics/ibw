/**
 */
package roadblock.xtext.ibl.ibl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.PropertyCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyConditionImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyConditionImpl#getUpperBounds <em>Upper Bounds</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyConditionImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyConditionImpl extends MinimalEObjectImpl.Container implements PropertyCondition
{
  /**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final String LOWER_BOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected String lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBounds() <em>Upper Bounds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBounds()
   * @generated
   * @ordered
   */
  protected static final String UPPER_BOUNDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpperBounds() <em>Upper Bounds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBounds()
   * @generated
   * @ordered
   */
  protected String upperBounds = UPPER_BOUNDS_EDEFAULT;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbability()
   * @generated
   * @ordered
   */
  protected static final String PROBABILITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbability()
   * @generated
   * @ordered
   */
  protected String probability = PROBABILITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyConditionImpl()
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
    return IblPackage.Literals.PROPERTY_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(String newLowerBound)
  {
    String oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUpperBounds()
  {
    return upperBounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBounds(String newUpperBounds)
  {
    String oldUpperBounds = upperBounds;
    upperBounds = newUpperBounds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS, oldUpperBounds, upperBounds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProbability()
  {
    return probability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProbability(String newProbability)
  {
    String oldProbability = probability;
    probability = newProbability;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__PROBABILITY, oldProbability, probability));
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
      case IblPackage.PROPERTY_CONDITION__LOWER_BOUND:
        return getLowerBound();
      case IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS:
        return getUpperBounds();
      case IblPackage.PROPERTY_CONDITION__OPERATOR:
        return getOperator();
      case IblPackage.PROPERTY_CONDITION__PROBABILITY:
        return getProbability();
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
      case IblPackage.PROPERTY_CONDITION__LOWER_BOUND:
        setLowerBound((String)newValue);
        return;
      case IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS:
        setUpperBounds((String)newValue);
        return;
      case IblPackage.PROPERTY_CONDITION__OPERATOR:
        setOperator((String)newValue);
        return;
      case IblPackage.PROPERTY_CONDITION__PROBABILITY:
        setProbability((String)newValue);
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
      case IblPackage.PROPERTY_CONDITION__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS:
        setUpperBounds(UPPER_BOUNDS_EDEFAULT);
        return;
      case IblPackage.PROPERTY_CONDITION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case IblPackage.PROPERTY_CONDITION__PROBABILITY:
        setProbability(PROBABILITY_EDEFAULT);
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
      case IblPackage.PROPERTY_CONDITION__LOWER_BOUND:
        return LOWER_BOUND_EDEFAULT == null ? lowerBound != null : !LOWER_BOUND_EDEFAULT.equals(lowerBound);
      case IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS:
        return UPPER_BOUNDS_EDEFAULT == null ? upperBounds != null : !UPPER_BOUNDS_EDEFAULT.equals(upperBounds);
      case IblPackage.PROPERTY_CONDITION__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case IblPackage.PROPERTY_CONDITION__PROBABILITY:
        return PROBABILITY_EDEFAULT == null ? probability != null : !PROBABILITY_EDEFAULT.equals(probability);
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
    result.append(" (lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBounds: ");
    result.append(upperBounds);
    result.append(", operator: ");
    result.append(operator);
    result.append(", probability: ");
    result.append(probability);
    result.append(')');
    return result.toString();
  }

} //PropertyConditionImpl
