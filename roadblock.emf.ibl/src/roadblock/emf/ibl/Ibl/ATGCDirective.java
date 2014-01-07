/**
 */
package roadblock.emf.ibl.Ibl;

import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATGC Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.ATGCDirective#getCommand <em>Command</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.ATGCDirective#getPartList <em>Part List</em>}</li>
 * </ul>
 * </p>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCDirective()
 * @model kind="class"
 * @generated
 */
public class ATGCDirective extends EObjectImpl implements IVisitable {
	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartList() <em>Part List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> partList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATGCDirective() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.ATGC_DIRECTIVE;
	}

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCDirective_Command()
	 * @model
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.ATGCDirective#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.ATGC_DIRECTIVE__COMMAND, oldCommand, command));
	}

	/**
	 * Returns the value of the '<em><b>Part List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCDirective_PartList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getPartList() {
		if (partList == null) {
			partList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.ATGC_DIRECTIVE__PART_LIST);
		}
		return partList;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.ATGC_DIRECTIVE__PART_LIST:
				return ((InternalEList<?>)getPartList()).basicRemove(otherEnd, msgs);
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
			case IblPackage.ATGC_DIRECTIVE__COMMAND:
				return getCommand();
			case IblPackage.ATGC_DIRECTIVE__PART_LIST:
				return getPartList();
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
			case IblPackage.ATGC_DIRECTIVE__COMMAND:
				setCommand((String)newValue);
				return;
			case IblPackage.ATGC_DIRECTIVE__PART_LIST:
				getPartList().clear();
				getPartList().addAll((Collection<? extends MolecularSpecies>)newValue);
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
			case IblPackage.ATGC_DIRECTIVE__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case IblPackage.ATGC_DIRECTIVE__PART_LIST:
				getPartList().clear();
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
			case IblPackage.ATGC_DIRECTIVE__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case IblPackage.ATGC_DIRECTIVE__PART_LIST:
				return partList != null && !partList.isEmpty();
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
		result.append(" (command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} // ATGCDirective
