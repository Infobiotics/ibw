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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Cell</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Attempt at generating javadoc from EMF.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.Cell#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Cell#getDeviceList <em>Device List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Cell#getProcessList <em>Process List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Cell#getRuleList <em>Rule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Cell#getMoleculeList <em>Molecule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Cell#getATGCCommandList <em>ATGC Command List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Cell#getID <em>ID</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Cell#getVariableAssignmentList <em>Variable Assignment List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Cell#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell()
 * @model kind="class"
 * @generated
 */
public class Cell extends EObjectImpl implements IVisitable, IMoleculeContainer, IRuleContainer {
	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeviceList() <em>Device List</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDeviceList()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> deviceList;

	/**
	 * The cached value of the '{@link #getProcessList() <em>Process List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessList()
	 * @generated
	 * @ordered
	 */
	protected EList<Kinetics> processList;

	/**
	 * The cached value of the '{@link #getRuleList() <em>Rule List</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRuleList()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> ruleList;

	/**
	 * The cached value of the '{@link #getMoleculeList() <em>Molecule List</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getMoleculeList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> moleculeList;

	/**
	 * The cached value of the '{@link #getATGCCommandList()
	 * <em>ATGC Command List</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getATGCCommandList()
	 * @generated
	 * @ordered
	 */
	protected EList<ATGCDirective> atgcCommandList;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariableAssignmentList()
	 * <em>Variable Assignment List</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVariableAssignmentList()
	 * @generated
	 * @ordered
	 */
	protected EList<EMFVariableAssignment> variableAssignmentList;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<IProperty> properties;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Cell() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.CELL;
	}

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell_DisplayName()
	 * @model
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Cell#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.CELL__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * Returns the value of the '<em><b>Device List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device List</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell_DeviceList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Device> getDeviceList() {
		if (deviceList == null) {
			deviceList = new EObjectContainmentEList<Device>(Device.class, this, IblPackage.CELL__DEVICE_LIST);
		}
		return deviceList;
	}

	/**
	 * Returns the value of the '<em><b>Process List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Kinetics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell_ProcessList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Kinetics> getProcessList() {
		if (processList == null) {
			processList = new EObjectContainmentEList<Kinetics>(Kinetics.class, this, IblPackage.CELL__PROCESS_LIST);
		}
		return processList;
	}

	/**
	 * Returns the value of the '<em><b>Rule List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule List</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell_RuleList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Rule> getRuleList() {
		if (ruleList == null) {
			ruleList = new EObjectContainmentEList<Rule>(Rule.class, this, IblPackage.CELL__RULE_LIST);
		}
		return ruleList;
	}

	/**
	 * Returns the value of the '<em><b>Molecule List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecule List</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecule List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell_MoleculeList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getMoleculeList() {
		if (moleculeList == null) {
			moleculeList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.CELL__MOLECULE_LIST);
		}
		return moleculeList;
	}

	/**
	 * Returns the value of the '<em><b>ATGC Command List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.ATGCDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATGC Command List</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATGC Command List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell_ATGCCommandList()
	 * @model containment="true"
	 * @generated
	 */
	public List<ATGCDirective> getATGCCommandList() {
		if (atgcCommandList == null) {
			atgcCommandList = new EObjectContainmentEList<ATGCDirective>(ATGCDirective.class, this, IblPackage.CELL__ATGC_COMMAND_LIST);
		}
		return atgcCommandList;
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell_ID()
	 * @model
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Cell#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.CELL__ID, oldID, id));
	}

	/**
	 * Returns the value of the '<em><b>Variable Assignment List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.EMFVariableAssignment}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Variable Assignment List</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Assignment List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell_VariableAssignmentList()
	 * @model containment="true"
	 * @generated
	 */
	public List<EMFVariableAssignment> getVariableAssignmentList() {
		if (variableAssignmentList == null) {
			variableAssignmentList = new EObjectContainmentEList<EMFVariableAssignment>(EMFVariableAssignment.class, this, IblPackage.CELL__VARIABLE_ASSIGNMENT_LIST);
		}
		return variableAssignmentList;
	}

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.IProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell_Properties()
	 * @model containment="true"
	 * @generated
	 */
	public List<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IblPackage.CELL__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated NOT
	 */
	public <TResult> TResult accept(IVisitor<TResult> visitor) {
		return visitor.visit(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IblPackage.CELL__DEVICE_LIST:
				return ((InternalEList<?>)getDeviceList()).basicRemove(otherEnd, msgs);
			case IblPackage.CELL__PROCESS_LIST:
				return ((InternalEList<?>)getProcessList()).basicRemove(otherEnd, msgs);
			case IblPackage.CELL__RULE_LIST:
				return ((InternalEList<?>)getRuleList()).basicRemove(otherEnd, msgs);
			case IblPackage.CELL__MOLECULE_LIST:
				return ((InternalEList<?>)getMoleculeList()).basicRemove(otherEnd, msgs);
			case IblPackage.CELL__ATGC_COMMAND_LIST:
				return ((InternalEList<?>)getATGCCommandList()).basicRemove(otherEnd, msgs);
			case IblPackage.CELL__VARIABLE_ASSIGNMENT_LIST:
				return ((InternalEList<?>)getVariableAssignmentList()).basicRemove(otherEnd, msgs);
			case IblPackage.CELL__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IblPackage.CELL__DISPLAY_NAME:
				return getDisplayName();
			case IblPackage.CELL__DEVICE_LIST:
				return getDeviceList();
			case IblPackage.CELL__PROCESS_LIST:
				return getProcessList();
			case IblPackage.CELL__RULE_LIST:
				return getRuleList();
			case IblPackage.CELL__MOLECULE_LIST:
				return getMoleculeList();
			case IblPackage.CELL__ATGC_COMMAND_LIST:
				return getATGCCommandList();
			case IblPackage.CELL__ID:
				return getID();
			case IblPackage.CELL__VARIABLE_ASSIGNMENT_LIST:
				return getVariableAssignmentList();
			case IblPackage.CELL__PROPERTIES:
				return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IblPackage.CELL__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case IblPackage.CELL__DEVICE_LIST:
				getDeviceList().clear();
				getDeviceList().addAll((Collection<? extends Device>)newValue);
				return;
			case IblPackage.CELL__PROCESS_LIST:
				getProcessList().clear();
				getProcessList().addAll((Collection<? extends Kinetics>)newValue);
				return;
			case IblPackage.CELL__RULE_LIST:
				getRuleList().clear();
				getRuleList().addAll((Collection<? extends Rule>)newValue);
				return;
			case IblPackage.CELL__MOLECULE_LIST:
				getMoleculeList().clear();
				getMoleculeList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.CELL__ATGC_COMMAND_LIST:
				getATGCCommandList().clear();
				getATGCCommandList().addAll((Collection<? extends ATGCDirective>)newValue);
				return;
			case IblPackage.CELL__ID:
				setID((String)newValue);
				return;
			case IblPackage.CELL__VARIABLE_ASSIGNMENT_LIST:
				getVariableAssignmentList().clear();
				getVariableAssignmentList().addAll((Collection<? extends EMFVariableAssignment>)newValue);
				return;
			case IblPackage.CELL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends IProperty>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IblPackage.CELL__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case IblPackage.CELL__DEVICE_LIST:
				getDeviceList().clear();
				return;
			case IblPackage.CELL__PROCESS_LIST:
				getProcessList().clear();
				return;
			case IblPackage.CELL__RULE_LIST:
				getRuleList().clear();
				return;
			case IblPackage.CELL__MOLECULE_LIST:
				getMoleculeList().clear();
				return;
			case IblPackage.CELL__ATGC_COMMAND_LIST:
				getATGCCommandList().clear();
				return;
			case IblPackage.CELL__ID:
				setID(ID_EDEFAULT);
				return;
			case IblPackage.CELL__VARIABLE_ASSIGNMENT_LIST:
				getVariableAssignmentList().clear();
				return;
			case IblPackage.CELL__PROPERTIES:
				getProperties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IblPackage.CELL__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case IblPackage.CELL__DEVICE_LIST:
				return deviceList != null && !deviceList.isEmpty();
			case IblPackage.CELL__PROCESS_LIST:
				return processList != null && !processList.isEmpty();
			case IblPackage.CELL__RULE_LIST:
				return ruleList != null && !ruleList.isEmpty();
			case IblPackage.CELL__MOLECULE_LIST:
				return moleculeList != null && !moleculeList.isEmpty();
			case IblPackage.CELL__ATGC_COMMAND_LIST:
				return atgcCommandList != null && !atgcCommandList.isEmpty();
			case IblPackage.CELL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IblPackage.CELL__VARIABLE_ASSIGNMENT_LIST:
				return variableAssignmentList != null && !variableAssignmentList.isEmpty();
			case IblPackage.CELL__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // Cell
