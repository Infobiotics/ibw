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

import roadblock.xtext.ibl.ibl.IblPackage;
import roadblock.xtext.ibl.ibl.Property;
import roadblock.xtext.ibl.ibl.PropertyCondition;
import roadblock.xtext.ibl.ibl.PropertyDefinition;
import roadblock.xtext.ibl.ibl.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.PropertyDefinitionImpl#getConcentration <em>Concentration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyDefinitionImpl extends FunctionBodyMemberImpl implements PropertyDefinition
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList<Property> property;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected PropertyCondition condition;

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
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected Quantity time;

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
   * The cached value of the '{@link #getConcentration() <em>Concentration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcentration()
   * @generated
   * @ordered
   */
  protected Quantity concentration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyDefinitionImpl()
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
    return IblPackage.Literals.PROPERTY_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty()
  {
    if (property == null)
    {
      property = new EObjectContainmentEList<Property>(Property.class, this, IblPackage.PROPERTY_DEFINITION__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyCondition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(PropertyCondition newCondition, NotificationChain msgs)
  {
    PropertyCondition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_DEFINITION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(PropertyCondition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_DEFINITION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_DEFINITION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_DEFINITION__CONDITION, newCondition, newCondition));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantity getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(Quantity newTime, NotificationChain msgs)
  {
    Quantity oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_DEFINITION__TIME, oldTime, newTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(Quantity newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_DEFINITION__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_DEFINITION__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_DEFINITION__TIME, newTime, newTime));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_DEFINITION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantity getConcentration()
  {
    return concentration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConcentration(Quantity newConcentration, NotificationChain msgs)
  {
    Quantity oldConcentration = concentration;
    concentration = newConcentration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_DEFINITION__CONCENTRATION, oldConcentration, newConcentration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcentration(Quantity newConcentration)
  {
    if (newConcentration != concentration)
    {
      NotificationChain msgs = null;
      if (concentration != null)
        msgs = ((InternalEObject)concentration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_DEFINITION__CONCENTRATION, null, msgs);
      if (newConcentration != null)
        msgs = ((InternalEObject)newConcentration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.PROPERTY_DEFINITION__CONCENTRATION, null, msgs);
      msgs = basicSetConcentration(newConcentration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_DEFINITION__CONCENTRATION, newConcentration, newConcentration));
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
      case IblPackage.PROPERTY_DEFINITION__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
      case IblPackage.PROPERTY_DEFINITION__CONDITION:
        return basicSetCondition(null, msgs);
      case IblPackage.PROPERTY_DEFINITION__TIME:
        return basicSetTime(null, msgs);
      case IblPackage.PROPERTY_DEFINITION__CONCENTRATION:
        return basicSetConcentration(null, msgs);
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
      case IblPackage.PROPERTY_DEFINITION__PROPERTY:
        return getProperty();
      case IblPackage.PROPERTY_DEFINITION__CONDITION:
        return getCondition();
      case IblPackage.PROPERTY_DEFINITION__NAME:
        return getName();
      case IblPackage.PROPERTY_DEFINITION__TIME:
        return getTime();
      case IblPackage.PROPERTY_DEFINITION__OPERATOR:
        return getOperator();
      case IblPackage.PROPERTY_DEFINITION__CONCENTRATION:
        return getConcentration();
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
      case IblPackage.PROPERTY_DEFINITION__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
        return;
      case IblPackage.PROPERTY_DEFINITION__CONDITION:
        setCondition((PropertyCondition)newValue);
        return;
      case IblPackage.PROPERTY_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case IblPackage.PROPERTY_DEFINITION__TIME:
        setTime((Quantity)newValue);
        return;
      case IblPackage.PROPERTY_DEFINITION__OPERATOR:
        setOperator((String)newValue);
        return;
      case IblPackage.PROPERTY_DEFINITION__CONCENTRATION:
        setConcentration((Quantity)newValue);
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
      case IblPackage.PROPERTY_DEFINITION__PROPERTY:
        getProperty().clear();
        return;
      case IblPackage.PROPERTY_DEFINITION__CONDITION:
        setCondition((PropertyCondition)null);
        return;
      case IblPackage.PROPERTY_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IblPackage.PROPERTY_DEFINITION__TIME:
        setTime((Quantity)null);
        return;
      case IblPackage.PROPERTY_DEFINITION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case IblPackage.PROPERTY_DEFINITION__CONCENTRATION:
        setConcentration((Quantity)null);
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
      case IblPackage.PROPERTY_DEFINITION__PROPERTY:
        return property != null && !property.isEmpty();
      case IblPackage.PROPERTY_DEFINITION__CONDITION:
        return condition != null;
      case IblPackage.PROPERTY_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IblPackage.PROPERTY_DEFINITION__TIME:
        return time != null;
      case IblPackage.PROPERTY_DEFINITION__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case IblPackage.PROPERTY_DEFINITION__CONCENTRATION:
        return concentration != null;
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
    result.append(", operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //PropertyDefinitionImpl
