/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

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
	 * The cached value of the '{@link #getFlatModel() <em>Flat Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatModel()
	 * @generated
	 * @ordered
	 */
	protected FlatModel flatModel;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
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
	 * Returns the value of the '<em><b>Flat Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flat Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flat Model</em>' reference.
	 * @see #setFlatModel(FlatModel)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getFlatModelPropertyPair_FlatModel()
	 * @model
	 * @generated
	 */
	public FlatModel getFlatModel() {
		if (flatModel != null && ((EObject)flatModel).eIsProxy()) {
			InternalEObject oldFlatModel = (InternalEObject)flatModel;
			flatModel = (FlatModel)eResolveProxy(oldFlatModel);
			if (flatModel != oldFlatModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL, oldFlatModel, flatModel));
			}
		}
		return flatModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlatModel basicGetFlatModel() {
		return flatModel;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getFlatModel <em>Flat Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flat Model</em>' reference.
	 * @see #getFlatModel()
	 * @generated
	 */
	public void setFlatModel(FlatModel newFlatModel) {
		FlatModel oldFlatModel = flatModel;
		flatModel = newFlatModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL, oldFlatModel, flatModel));
	}

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(IProperty)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getFlatModelPropertyPair_Property()
	 * @model
	 * @generated
	 */
	public IProperty getProperty() {
		if (property != null && ((EObject)property).eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (IProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProperty basicGetProperty() {
		return property;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	public void setProperty(IProperty newProperty) {
		IProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY, oldProperty, property));
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
				if (resolve) return getFlatModel();
				return basicGetFlatModel();
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
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
