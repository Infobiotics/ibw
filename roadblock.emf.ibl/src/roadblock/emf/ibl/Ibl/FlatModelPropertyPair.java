/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flat Model Property Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getFlatModel <em>Flat Model</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getFlatModelPropertyPair()
 * @model kind="class"
 * @generated
 */
public class FlatModelPropertyPair extends EObjectImpl {
	/**
	 * The cached value of the '{@link #getFlatModel() <em>Flat Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatModel()
	 * @generated
	 * @ordered
	 */
	protected FlatModel flatModel;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected IProperty property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlatModelPropertyPair() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.FLAT_MODEL_PROPERTY_PAIR;
	}

	/**
	 * Returns the value of the '<em><b>Flat Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flat Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flat Model</em>' containment reference.
	 * @see #setFlatModel(FlatModel)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getFlatModelPropertyPair_FlatModel()
	 * @model containment="true"
	 * @generated
	 */
	public FlatModel getFlatModel() {
		return flatModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlatModel(FlatModel newFlatModel, NotificationChain msgs) {
		FlatModel oldFlatModel = flatModel;
		flatModel = newFlatModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL, oldFlatModel, newFlatModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getFlatModel <em>Flat Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flat Model</em>' containment reference.
	 * @see #getFlatModel()
	 * @generated
	 */
	public void setFlatModel(FlatModel newFlatModel) {
		if (newFlatModel != flatModel) {
			NotificationChain msgs = null;
			if (flatModel != null)
				msgs = ((InternalEObject)flatModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL, null, msgs);
			if (newFlatModel != null)
				msgs = ((InternalEObject)newFlatModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL, null, msgs);
			msgs = basicSetFlatModel(newFlatModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL, newFlatModel, newFlatModel));
	}

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(IProperty)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getFlatModelPropertyPair_Property()
	 * @model containment="true"
	 * @generated
	 */
	public IProperty getProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(IProperty newProperty, NotificationChain msgs) {
		IProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY, oldProperty, newProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	public void setProperty(IProperty newProperty) {
		if (newProperty != property) {
			NotificationChain msgs = null;
			if (property != null)
				msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY, null, msgs);
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY, null, msgs);
			msgs = basicSetProperty(newProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY, newProperty, newProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL:
				return basicSetFlatModel(null, msgs);
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY:
				return basicSetProperty(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL:
				return getFlatModel();
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY:
				return getProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL:
				setFlatModel((FlatModel)newValue);
				return;
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY:
				setProperty((IProperty)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL:
				setFlatModel((FlatModel)null);
				return;
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY:
				setProperty((IProperty)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL:
				return flatModel != null;
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY:
				return property != null;
		}
		return super.eIsSet(featureID);
	}

} // FlatModelPropertyPair
