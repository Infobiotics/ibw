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
import roadblock.xtext.ibl.ibl.ParameterAssignment;
import roadblock.xtext.ibl.ibl.VariableDefinition;
import roadblock.xtext.ibl.ibl.VariableExpressionObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDefinitionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDefinitionImpl extends FunctionBodyMemberImpl implements VariableDefinition
{
  /**
   * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected String qualifier = QUALIFIER_EDEFAULT;

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
   * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected static final String COLLECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected String collection = COLLECTION_EDEFAULT;

  /**
   * The default value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructor()
   * @generated
   * @ordered
   */
  protected static final String CONSTRUCTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructor()
   * @generated
   * @ordered
   */
  protected String constructor = CONSTRUCTOR_EDEFAULT;

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
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected VariableExpressionObject value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDefinitionImpl()
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
    return IblPackage.Literals.VARIABLE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(String newQualifier)
  {
    String oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DEFINITION__QUALIFIER, oldQualifier, qualifier));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DEFINITION__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollection(String newCollection)
  {
    String oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DEFINITION__COLLECTION, oldCollection, collection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstructor()
  {
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstructor(String newConstructor)
  {
    String oldConstructor = constructor;
    constructor = newConstructor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DEFINITION__CONSTRUCTOR, oldConstructor, constructor));
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
      parameters = new EObjectContainmentEList<ParameterAssignment>(ParameterAssignment.class, this, IblPackage.VARIABLE_DEFINITION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableExpressionObject getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(VariableExpressionObject newValue, NotificationChain msgs)
  {
    VariableExpressionObject oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DEFINITION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(VariableExpressionObject newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.VARIABLE_DEFINITION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.VARIABLE_DEFINITION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DEFINITION__VALUE, newValue, newValue));
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
      case IblPackage.VARIABLE_DEFINITION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case IblPackage.VARIABLE_DEFINITION__VALUE:
        return basicSetValue(null, msgs);
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
      case IblPackage.VARIABLE_DEFINITION__QUALIFIER:
        return getQualifier();
      case IblPackage.VARIABLE_DEFINITION__TYPE:
        return getType();
      case IblPackage.VARIABLE_DEFINITION__NAME:
        return getName();
      case IblPackage.VARIABLE_DEFINITION__COLLECTION:
        return getCollection();
      case IblPackage.VARIABLE_DEFINITION__CONSTRUCTOR:
        return getConstructor();
      case IblPackage.VARIABLE_DEFINITION__PARAMETERS:
        return getParameters();
      case IblPackage.VARIABLE_DEFINITION__VALUE:
        return getValue();
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
      case IblPackage.VARIABLE_DEFINITION__QUALIFIER:
        setQualifier((String)newValue);
        return;
      case IblPackage.VARIABLE_DEFINITION__TYPE:
        setType((String)newValue);
        return;
      case IblPackage.VARIABLE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case IblPackage.VARIABLE_DEFINITION__COLLECTION:
        setCollection((String)newValue);
        return;
      case IblPackage.VARIABLE_DEFINITION__CONSTRUCTOR:
        setConstructor((String)newValue);
        return;
      case IblPackage.VARIABLE_DEFINITION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends ParameterAssignment>)newValue);
        return;
      case IblPackage.VARIABLE_DEFINITION__VALUE:
        setValue((VariableExpressionObject)newValue);
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
      case IblPackage.VARIABLE_DEFINITION__QUALIFIER:
        setQualifier(QUALIFIER_EDEFAULT);
        return;
      case IblPackage.VARIABLE_DEFINITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case IblPackage.VARIABLE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IblPackage.VARIABLE_DEFINITION__COLLECTION:
        setCollection(COLLECTION_EDEFAULT);
        return;
      case IblPackage.VARIABLE_DEFINITION__CONSTRUCTOR:
        setConstructor(CONSTRUCTOR_EDEFAULT);
        return;
      case IblPackage.VARIABLE_DEFINITION__PARAMETERS:
        getParameters().clear();
        return;
      case IblPackage.VARIABLE_DEFINITION__VALUE:
        setValue((VariableExpressionObject)null);
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
      case IblPackage.VARIABLE_DEFINITION__QUALIFIER:
        return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
      case IblPackage.VARIABLE_DEFINITION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case IblPackage.VARIABLE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IblPackage.VARIABLE_DEFINITION__COLLECTION:
        return COLLECTION_EDEFAULT == null ? collection != null : !COLLECTION_EDEFAULT.equals(collection);
      case IblPackage.VARIABLE_DEFINITION__CONSTRUCTOR:
        return CONSTRUCTOR_EDEFAULT == null ? constructor != null : !CONSTRUCTOR_EDEFAULT.equals(constructor);
      case IblPackage.VARIABLE_DEFINITION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case IblPackage.VARIABLE_DEFINITION__VALUE:
        return value != null;
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
    result.append(" (qualifier: ");
    result.append(qualifier);
    result.append(", type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(", collection: ");
    result.append(collection);
    result.append(", constructor: ");
    result.append(constructor);
    result.append(')');
    return result.toString();
  }

} //VariableDefinitionImpl
