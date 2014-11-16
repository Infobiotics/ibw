/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.VariableReference#getName <em>Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.VariableReference#isIsMaximumOfInterest <em>Is Maximum Of Interest</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.VariableReference#getContainerName <em>Container Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getVariableReference()
 * @model kind="class"
 * @generated
 */
public class VariableReference extends EObjectImpl implements IArithmeticOperand {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #isIsMaximumOfInterest() <em>Is Maximum Of Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMaximumOfInterest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MAXIMUM_OF_INTEREST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMaximumOfInterest() <em>Is Maximum Of Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMaximumOfInterest()
	 * @generated
	 * @ordered
	 */
	protected boolean isMaximumOfInterest = IS_MAXIMUM_OF_INTEREST_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerName() <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getContainerName() <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName()
	 * @generated
	 * @ordered
	 */
	protected String containerName = CONTAINER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableReference() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.VARIABLE_REFERENCE;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getVariableReference_Name()
	 * @model default=""
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.VariableReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_REFERENCE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Is Maximum Of Interest</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Maximum Of Interest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Maximum Of Interest</em>' attribute.
	 * @see #setIsMaximumOfInterest(boolean)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getVariableReference_IsMaximumOfInterest()
	 * @model default="false"
	 * @generated
	 */
	public boolean isIsMaximumOfInterest() {
		return isMaximumOfInterest;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.VariableReference#isIsMaximumOfInterest <em>Is Maximum Of Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Maximum Of Interest</em>' attribute.
	 * @see #isIsMaximumOfInterest()
	 * @generated
	 */
	public void setIsMaximumOfInterest(boolean newIsMaximumOfInterest) {
		boolean oldIsMaximumOfInterest = isMaximumOfInterest;
		isMaximumOfInterest = newIsMaximumOfInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_REFERENCE__IS_MAXIMUM_OF_INTEREST, oldIsMaximumOfInterest, isMaximumOfInterest));
	}

	/**
	 * Returns the value of the '<em><b>Container Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Name</em>' attribute.
	 * @see #setContainerName(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getVariableReference_ContainerName()
	 * @model default=""
	 * @generated
	 */
	public String getContainerName() {
		return containerName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.VariableReference#getContainerName <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Name</em>' attribute.
	 * @see #getContainerName()
	 * @generated
	 */
	public void setContainerName(String newContainerName) {
		String oldContainerName = containerName;
		containerName = newContainerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.VARIABLE_REFERENCE__CONTAINER_NAME, oldContainerName, containerName));
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
			case IblPackage.VARIABLE_REFERENCE__NAME:
				return getName();
			case IblPackage.VARIABLE_REFERENCE__IS_MAXIMUM_OF_INTEREST:
				return isIsMaximumOfInterest();
			case IblPackage.VARIABLE_REFERENCE__CONTAINER_NAME:
				return getContainerName();
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
			case IblPackage.VARIABLE_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case IblPackage.VARIABLE_REFERENCE__IS_MAXIMUM_OF_INTEREST:
				setIsMaximumOfInterest((Boolean)newValue);
				return;
			case IblPackage.VARIABLE_REFERENCE__CONTAINER_NAME:
				setContainerName((String)newValue);
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
			case IblPackage.VARIABLE_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IblPackage.VARIABLE_REFERENCE__IS_MAXIMUM_OF_INTEREST:
				setIsMaximumOfInterest(IS_MAXIMUM_OF_INTEREST_EDEFAULT);
				return;
			case IblPackage.VARIABLE_REFERENCE__CONTAINER_NAME:
				setContainerName(CONTAINER_NAME_EDEFAULT);
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
			case IblPackage.VARIABLE_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IblPackage.VARIABLE_REFERENCE__IS_MAXIMUM_OF_INTEREST:
				return isMaximumOfInterest != IS_MAXIMUM_OF_INTEREST_EDEFAULT;
			case IblPackage.VARIABLE_REFERENCE__CONTAINER_NAME:
				return CONTAINER_NAME_EDEFAULT == null ? containerName != null : !CONTAINER_NAME_EDEFAULT.equals(containerName);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isMaximumOfInterest: ");
		result.append(isMaximumOfInterest);
		result.append(", containerName: ");
		result.append(containerName);
		result.append(')');
		return result.toString();
	}

} // VariableReference
