/**
 */
package roadblock.emf.ibl.Ibl;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getVariableAttribute <em>Variable Attribute</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getUnits <em>Units</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getEMFVariableAssignment()
 * @model kind="class"
 * @generated
 */
public class EMFVariableAssignment extends EObjectImpl implements IVisitable {
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
	 * The default value of the '{@link #getVariableAttribute() <em>Variable Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableAttribute() <em>Variable Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableAttribute()
	 * @generated
	 * @ordered
	 */
	protected String variableAttribute = VARIABLE_ATTRIBUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<String> units;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected double amount = AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFVariableAssignment() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.EMF_VARIABLE_ASSIGNMENT;
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getEMFVariableAssignment_VariableName()
	 * @model
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getVariableName <em>Variable Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * Returns the value of the '<em><b>Variable Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Attribute</em>' attribute.
	 * @see #setVariableAttribute(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getEMFVariableAssignment_VariableAttribute()
	 * @model
	 * @generated
	 */
	public String getVariableAttribute() {
		return variableAttribute;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getVariableAttribute <em>Variable Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Attribute</em>' attribute.
	 * @see #getVariableAttribute()
	 * @generated
	 */
	public void setVariableAttribute(String newVariableAttribute) {
		String oldVariableAttribute = variableAttribute;
		variableAttribute = newVariableAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_ATTRIBUTE, oldVariableAttribute, variableAttribute));
	}

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getEMFVariableAssignment_Units()
	 * @model default=""
	 * @generated
	 */
	public List<String> getUnits() {
		if (units == null) {
			units = new EDataTypeUniqueEList<String>(String.class, this, IblPackage.EMF_VARIABLE_ASSIGNMENT__UNITS);
		}
		return units;
	}

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getEMFVariableAssignment_Amount()
	 * @model
	 * @generated
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	public void setAmount(double newAmount) {
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.EMF_VARIABLE_ASSIGNMENT__AMOUNT, oldAmount, amount));
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
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_NAME:
				return getVariableName();
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_ATTRIBUTE:
				return getVariableAttribute();
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__UNITS:
				return getUnits();
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__AMOUNT:
				return getAmount();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_ATTRIBUTE:
				setVariableAttribute((String)newValue);
				return;
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends String>)newValue);
				return;
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__AMOUNT:
				setAmount((Double)newValue);
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
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_ATTRIBUTE:
				setVariableAttribute(VARIABLE_ATTRIBUTE_EDEFAULT);
				return;
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__UNITS:
				getUnits().clear();
				return;
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
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
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__VARIABLE_ATTRIBUTE:
				return VARIABLE_ATTRIBUTE_EDEFAULT == null ? variableAttribute != null : !VARIABLE_ATTRIBUTE_EDEFAULT.equals(variableAttribute);
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__UNITS:
				return units != null && !units.isEmpty();
			case IblPackage.EMF_VARIABLE_ASSIGNMENT__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
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
		result.append(", variableAttribute: ");
		result.append(variableAttribute);
		result.append(", units: ");
		result.append(units);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} // EMFVariableAssignment
