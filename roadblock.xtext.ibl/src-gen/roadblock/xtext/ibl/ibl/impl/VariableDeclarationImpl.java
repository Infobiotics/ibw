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
import roadblock.xtext.ibl.ibl.VariableAssignment;
import roadblock.xtext.ibl.ibl.VariableDeclaration;
import roadblock.xtext.ibl.ibl.VariableQualifier;
import roadblock.xtext.ibl.ibl.VariableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDeclarationImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDeclarationImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDeclarationImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link roadblock.xtext.ibl.ibl.impl.VariableDeclarationImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationImpl extends FunctionDefinitionMemberImpl implements VariableDeclaration
{
  /**
   * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifier()
   * @generated
   * @ordered
   */
  protected VariableQualifier qualifier;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected VariableType type;

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
  protected EList<VariableAssignment> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
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
    return IblPackage.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableQualifier getQualifier()
  {
    return qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualifier(VariableQualifier newQualifier, NotificationChain msgs)
  {
    VariableQualifier oldQualifier = qualifier;
    qualifier = newQualifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DECLARATION__QUALIFIER, oldQualifier, newQualifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifier(VariableQualifier newQualifier)
  {
    if (newQualifier != qualifier)
    {
      NotificationChain msgs = null;
      if (qualifier != null)
        msgs = ((InternalEObject)qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.VARIABLE_DECLARATION__QUALIFIER, null, msgs);
      if (newQualifier != null)
        msgs = ((InternalEObject)newQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.VARIABLE_DECLARATION__QUALIFIER, null, msgs);
      msgs = basicSetQualifier(newQualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DECLARATION__QUALIFIER, newQualifier, newQualifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(VariableType newType, NotificationChain msgs)
  {
    VariableType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(VariableType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.VARIABLE_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.VARIABLE_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DECLARATION__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DECLARATION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DECLARATION__COLLECTION, oldCollection, collection));
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
      eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_DECLARATION__CONSTRUCTOR, oldConstructor, constructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableAssignment> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, IblPackage.VARIABLE_DECLARATION__PARAMETERS);
    }
    return parameters;
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
      case IblPackage.VARIABLE_DECLARATION__QUALIFIER:
        return basicSetQualifier(null, msgs);
      case IblPackage.VARIABLE_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case IblPackage.VARIABLE_DECLARATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case IblPackage.VARIABLE_DECLARATION__QUALIFIER:
        return getQualifier();
      case IblPackage.VARIABLE_DECLARATION__TYPE:
        return getType();
      case IblPackage.VARIABLE_DECLARATION__NAME:
        return getName();
      case IblPackage.VARIABLE_DECLARATION__COLLECTION:
        return getCollection();
      case IblPackage.VARIABLE_DECLARATION__CONSTRUCTOR:
        return getConstructor();
      case IblPackage.VARIABLE_DECLARATION__PARAMETERS:
        return getParameters();
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
      case IblPackage.VARIABLE_DECLARATION__QUALIFIER:
        setQualifier((VariableQualifier)newValue);
        return;
      case IblPackage.VARIABLE_DECLARATION__TYPE:
        setType((VariableType)newValue);
        return;
      case IblPackage.VARIABLE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case IblPackage.VARIABLE_DECLARATION__COLLECTION:
        setCollection((String)newValue);
        return;
      case IblPackage.VARIABLE_DECLARATION__CONSTRUCTOR:
        setConstructor((String)newValue);
        return;
      case IblPackage.VARIABLE_DECLARATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends VariableAssignment>)newValue);
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
      case IblPackage.VARIABLE_DECLARATION__QUALIFIER:
        setQualifier((VariableQualifier)null);
        return;
      case IblPackage.VARIABLE_DECLARATION__TYPE:
        setType((VariableType)null);
        return;
      case IblPackage.VARIABLE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IblPackage.VARIABLE_DECLARATION__COLLECTION:
        setCollection(COLLECTION_EDEFAULT);
        return;
      case IblPackage.VARIABLE_DECLARATION__CONSTRUCTOR:
        setConstructor(CONSTRUCTOR_EDEFAULT);
        return;
      case IblPackage.VARIABLE_DECLARATION__PARAMETERS:
        getParameters().clear();
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
      case IblPackage.VARIABLE_DECLARATION__QUALIFIER:
        return qualifier != null;
      case IblPackage.VARIABLE_DECLARATION__TYPE:
        return type != null;
      case IblPackage.VARIABLE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IblPackage.VARIABLE_DECLARATION__COLLECTION:
        return COLLECTION_EDEFAULT == null ? collection != null : !COLLECTION_EDEFAULT.equals(collection);
      case IblPackage.VARIABLE_DECLARATION__CONSTRUCTOR:
        return CONSTRUCTOR_EDEFAULT == null ? constructor != null : !CONSTRUCTOR_EDEFAULT.equals(constructor);
      case IblPackage.VARIABLE_DECLARATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
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
    result.append(", collection: ");
    result.append(collection);
    result.append(", constructor: ");
    result.append(constructor);
    result.append(')');
    return result.toString();
  }

} //VariableDeclarationImpl
