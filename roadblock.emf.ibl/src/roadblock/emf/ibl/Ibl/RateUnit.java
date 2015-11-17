/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.RateUnit#getRateTimeUnit <em>Rate Time Unit</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.RateUnit#getRateConcentrationUnit <em>Rate Concentration Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getRateUnit()
 * @model kind="class"
 * @generated
 */
public class RateUnit extends EObjectImpl {
	/**
	 * The default value of the '{@link #getRateTimeUnit() <em>Rate Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final RateTimeUnit RATE_TIME_UNIT_EDEFAULT = RateTimeUnit.PER_SECOND;

	/**
	 * The cached value of the '{@link #getRateTimeUnit() <em>Rate Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected RateTimeUnit rateTimeUnit = RATE_TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateConcentrationUnit() <em>Rate Concentration Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateConcentrationUnit()
	 * @generated
	 * @ordered
	 */
	protected static final RateConcentrationUnit RATE_CONCENTRATION_UNIT_EDEFAULT = RateConcentrationUnit.PER_M;

	/**
	 * The cached value of the '{@link #getRateConcentrationUnit() <em>Rate Concentration Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateConcentrationUnit()
	 * @generated
	 * @ordered
	 */
	protected RateConcentrationUnit rateConcentrationUnit = RATE_CONCENTRATION_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateUnit() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.RATE_UNIT;
	}

	/**
	 * Returns the value of the '<em><b>Rate Time Unit</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.RateTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Time Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RateTimeUnit
	 * @see #setRateTimeUnit(RateTimeUnit)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRateUnit_RateTimeUnit()
	 * @model default=""
	 * @generated
	 */
	public RateTimeUnit getRateTimeUnit() {
		return rateTimeUnit;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.RateUnit#getRateTimeUnit <em>Rate Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Time Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RateTimeUnit
	 * @see #getRateTimeUnit()
	 * @generated
	 */
	public void setRateTimeUnit(RateTimeUnit newRateTimeUnit) {
		RateTimeUnit oldRateTimeUnit = rateTimeUnit;
		rateTimeUnit = newRateTimeUnit == null ? RATE_TIME_UNIT_EDEFAULT : newRateTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RATE_UNIT__RATE_TIME_UNIT, oldRateTimeUnit, rateTimeUnit));
	}

	/**
	 * Returns the value of the '<em><b>Rate Concentration Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.RateConcentrationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Concentration Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Concentration Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RateConcentrationUnit
	 * @see #setRateConcentrationUnit(RateConcentrationUnit)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRateUnit_RateConcentrationUnit()
	 * @model
	 * @generated
	 */
	public RateConcentrationUnit getRateConcentrationUnit() {
		return rateConcentrationUnit;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.RateUnit#getRateConcentrationUnit <em>Rate Concentration Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Concentration Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.RateConcentrationUnit
	 * @see #getRateConcentrationUnit()
	 * @generated
	 */
	public void setRateConcentrationUnit(RateConcentrationUnit newRateConcentrationUnit) {
		RateConcentrationUnit oldRateConcentrationUnit = rateConcentrationUnit;
		rateConcentrationUnit = newRateConcentrationUnit == null ? RATE_CONCENTRATION_UNIT_EDEFAULT : newRateConcentrationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.RATE_UNIT__RATE_CONCENTRATION_UNIT, oldRateConcentrationUnit, rateConcentrationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IblPackage.RATE_UNIT__RATE_TIME_UNIT:
				return getRateTimeUnit();
			case IblPackage.RATE_UNIT__RATE_CONCENTRATION_UNIT:
				return getRateConcentrationUnit();
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
			case IblPackage.RATE_UNIT__RATE_TIME_UNIT:
				setRateTimeUnit((RateTimeUnit)newValue);
				return;
			case IblPackage.RATE_UNIT__RATE_CONCENTRATION_UNIT:
				setRateConcentrationUnit((RateConcentrationUnit)newValue);
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
			case IblPackage.RATE_UNIT__RATE_TIME_UNIT:
				setRateTimeUnit(RATE_TIME_UNIT_EDEFAULT);
				return;
			case IblPackage.RATE_UNIT__RATE_CONCENTRATION_UNIT:
				setRateConcentrationUnit(RATE_CONCENTRATION_UNIT_EDEFAULT);
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
			case IblPackage.RATE_UNIT__RATE_TIME_UNIT:
				return rateTimeUnit != RATE_TIME_UNIT_EDEFAULT;
			case IblPackage.RATE_UNIT__RATE_CONCENTRATION_UNIT:
				return rateConcentrationUnit != RATE_CONCENTRATION_UNIT_EDEFAULT;
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
		result.append(" (rateTimeUnit: ");
		result.append(rateTimeUnit);
		result.append(", rateConcentrationUnit: ");
		result.append(rateConcentrationUnit);
		result.append(')');
		return result.toString();
	}

} // RateUnit
