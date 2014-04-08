/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATGC Cloning Sites</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.ATGCCloningSites#getCloningSites <em>Cloning Sites</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCCloningSites()
 * @model kind="class"
 * @generated
 */
public class ATGCCloningSites extends ATGCDirective {
	/**
	 * The default value of the '{@link #getCloningSites() <em>Cloning Sites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloningSites()
	 * @generated
	 * @ordered
	 */
	protected static final int CLONING_SITES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCloningSites() <em>Cloning Sites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloningSites()
	 * @generated
	 * @ordered
	 */
	protected int cloningSites = CLONING_SITES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATGCCloningSites() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.ATGC_CLONING_SITES;
	}

	/**
	 * Returns the value of the '<em><b>Cloning Sites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloning Sites</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloning Sites</em>' attribute.
	 * @see #setCloningSites(int)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCCloningSites_CloningSites()
	 * @model
	 * @generated
	 */
	public int getCloningSites() {
		return cloningSites;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.ATGCCloningSites#getCloningSites <em>Cloning Sites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloning Sites</em>' attribute.
	 * @see #getCloningSites()
	 * @generated
	 */
	public void setCloningSites(int newCloningSites) {
		int oldCloningSites = cloningSites;
		cloningSites = newCloningSites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.ATGC_CLONING_SITES__CLONING_SITES, oldCloningSites, cloningSites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IblPackage.ATGC_CLONING_SITES__CLONING_SITES:
				return getCloningSites();
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
			case IblPackage.ATGC_CLONING_SITES__CLONING_SITES:
				setCloningSites((Integer)newValue);
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
			case IblPackage.ATGC_CLONING_SITES__CLONING_SITES:
				setCloningSites(CLONING_SITES_EDEFAULT);
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
			case IblPackage.ATGC_CLONING_SITES__CLONING_SITES:
				return cloningSites != CLONING_SITES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cloningSites: ");
		result.append(cloningSites);
		result.append(')');
		return result.toString();
	}

} // ATGCCloningSites
