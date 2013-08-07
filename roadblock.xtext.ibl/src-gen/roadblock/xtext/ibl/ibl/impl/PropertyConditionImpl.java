/**
 */
package roadblock.xtext.ibl.ibl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.PropertyCondition;
import roadblock.xtext.ibl.ibl.REAL;

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
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected REAL lowerBound;

  /**
   * The cached value of the '{@link #getUpperBounds() <em>Upper Bounds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBounds()
   * @generated
   * @ordered
   */
  protected REAL upperBounds;

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
   * The cached value of the '{@link #getProbability() <em>Probability</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbability()
   * @generated
   * @ordered
   */
  protected REAL probability;

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
  public REAL getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowerBound(REAL newLowerBound, NotificationChain msgs)
  {
    REAL oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__LOWER_BOUND, oldLowerBound, newLowerBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(REAL newLowerBound)
  {
    if (newLowerBound != lowerBound)
    {
      NotificationChain msgs = null;
      if (lowerBound != null)
        msgs = ((InternalEObject)lowerBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_CONDITION__LOWER_BOUND, null, msgs);
      if (newLowerBound != null)
        msgs = ((InternalEObject)newLowerBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_CONDITION__LOWER_BOUND, null, msgs);
      msgs = basicSetLowerBound(newLowerBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__LOWER_BOUND, newLowerBound, newLowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REAL getUpperBounds()
  {
    return upperBounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpperBounds(REAL newUpperBounds, NotificationChain msgs)
  {
    REAL oldUpperBounds = upperBounds;
    upperBounds = newUpperBounds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS, oldUpperBounds, newUpperBounds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBounds(REAL newUpperBounds)
  {
    if (newUpperBounds != upperBounds)
    {
      NotificationChain msgs = null;
      if (upperBounds != null)
        msgs = ((InternalEObject)upperBounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS, null, msgs);
      if (newUpperBounds != null)
        msgs = ((InternalEObject)newUpperBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS, null, msgs);
      msgs = basicSetUpperBounds(newUpperBounds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS, newUpperBounds, newUpperBounds));
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
  public REAL getProbability()
  {
    return probability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProbability(REAL newProbability, NotificationChain msgs)
  {
    REAL oldProbability = probability;
    probability = newProbability;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__PROBABILITY, oldProbability, newProbability);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProbability(REAL newProbability)
  {
    if (newProbability != probability)
    {
      NotificationChain msgs = null;
      if (probability != null)
        msgs = ((InternalEObject)probability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_CONDITION__PROBABILITY, null, msgs);
      if (newProbability != null)
        msgs = ((InternalEObject)newProbability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_CONDITION__PROBABILITY, null, msgs);
      msgs = basicSetProbability(newProbability, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_CONDITION__PROBABILITY, newProbability, newProbability));
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
      case IblPackage.PROPERTY_CONDITION__LOWER_BOUND:
        return basicSetLowerBound(null, msgs);
      case IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS:
        return basicSetUpperBounds(null, msgs);
      case IblPackage.PROPERTY_CONDITION__PROBABILITY:
        return basicSetProbability(null, msgs);
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
        setLowerBound((REAL)newValue);
        return;
      case IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS:
        setUpperBounds((REAL)newValue);
        return;
      case IblPackage.PROPERTY_CONDITION__OPERATOR:
        setOperator((String)newValue);
        return;
      case IblPackage.PROPERTY_CONDITION__PROBABILITY:
        setProbability((REAL)newValue);
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
        setLowerBound((REAL)null);
        return;
      case IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS:
        setUpperBounds((REAL)null);
        return;
      case IblPackage.PROPERTY_CONDITION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case IblPackage.PROPERTY_CONDITION__PROBABILITY:
        setProbability((REAL)null);
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
        return lowerBound != null;
      case IblPackage.PROPERTY_CONDITION__UPPER_BOUNDS:
        return upperBounds != null;
      case IblPackage.PROPERTY_CONDITION__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case IblPackage.PROPERTY_CONDITION__PROBABILITY:
        return probability != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //PropertyConditionImpl
