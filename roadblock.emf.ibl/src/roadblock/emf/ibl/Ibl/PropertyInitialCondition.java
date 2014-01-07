/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Initial Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition#getValue <em>Value</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getPropertyInitialCondition()
 * @model kind="class"
 * @generated
 */
public class PropertyInitialCondition extends EObjectImpl implements IVisitable {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final ConcentrationUnit UNIT_EDEFAULT = ConcentrationUnit.M;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected ConcentrationUnit unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyInitialCondition() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.PROPERTY_INITIAL_CONDITION;
	}

	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getPropertyInitialCondition_VariableName()
	 * @model
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_INITIAL_CONDITION__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getPropertyInitialCondition_Value()
	 * @model
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_INITIAL_CONDITION__VALUE, oldValue, value));
	}

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link roadblock.emf.ibl.Ibl.ConcentrationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationUnit
	 * @see #setUnit(ConcentrationUnit)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getPropertyInitialCondition_Unit()
	 * @model
	 * @generated
	 */
	public ConcentrationUnit getUnit() {
		return unit;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationUnit
	 * @see #getUnit()
	 * @generated
	 */
	public void setUnit(ConcentrationUnit newUnit) {
		ConcentrationUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.PROPERTY_INITIAL_CONDITION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public <TResult> TResult accept(IVisitor<TResult> visitor) {
		return visitor.visit(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IblPackage.PROPERTY_INITIAL_CONDITION__VARIABLE_NAME:
				return getVariableName();
			case IblPackage.PROPERTY_INITIAL_CONDITION__VALUE:
				return getValue();
			case IblPackage.PROPERTY_INITIAL_CONDITION__UNIT:
				return getUnit();
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
			case IblPackage.PROPERTY_INITIAL_CONDITION__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case IblPackage.PROPERTY_INITIAL_CONDITION__VALUE:
				setValue((Double)newValue);
				return;
			case IblPackage.PROPERTY_INITIAL_CONDITION__UNIT:
				setUnit((ConcentrationUnit)newValue);
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
			case IblPackage.PROPERTY_INITIAL_CONDITION__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case IblPackage.PROPERTY_INITIAL_CONDITION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case IblPackage.PROPERTY_INITIAL_CONDITION__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case IblPackage.PROPERTY_INITIAL_CONDITION__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case IblPackage.PROPERTY_INITIAL_CONDITION__VALUE:
				return value != VALUE_EDEFAULT;
			case IblPackage.PROPERTY_INITIAL_CONDITION__UNIT:
				return unit != UNIT_EDEFAULT;
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
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(", value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} // PropertyInitialCondition
