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
 * <em><b>Device</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getProcessList <em>Process List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getRuleList <em>Rule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getPartList <em>Part List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getATGCCommandList <em>ATGC Command List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getID <em>ID</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getMoleculeList <em>Molecule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getOutputList <em>Output List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getInputList <em>Input List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getVariableAssignmentList <em>Variable Assignment List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Device#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice()
 * @model kind="class"
 * @generated
 */
public class Device extends EObjectImpl implements IVisitable, IMoleculeContainer, IRuleContainer {
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
	 * The cached value of the '{@link #getProcessList() <em>Process List</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getPartList() <em>Part List</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPartList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> partList;

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
	 * The cached value of the '{@link #getMoleculeList() <em>Molecule List</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getMoleculeList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> moleculeList;

	/**
	 * The cached value of the '{@link #getOutputList() <em>Output List</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOutputList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> outputList;

	/**
	 * The cached value of the '{@link #getInputList() <em>Input List</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInputList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> inputList;

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
	protected Device() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.DEVICE;
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_DisplayName()
	 * @model
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Device#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.DEVICE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * Returns the value of the '<em><b>Process List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Kinetics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process List</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_ProcessList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Kinetics> getProcessList() {
		if (processList == null) {
			processList = new EObjectContainmentEList<Kinetics>(Kinetics.class, this, IblPackage.DEVICE__PROCESS_LIST);
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_RuleList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Rule> getRuleList() {
		if (ruleList == null) {
			ruleList = new EObjectContainmentEList<Rule>(Rule.class, this, IblPackage.DEVICE__RULE_LIST);
		}
		return ruleList;
	}

	/**
	 * Returns the value of the '<em><b>Part List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part List</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_PartList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getPartList() {
		if (partList == null) {
			partList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.DEVICE__PART_LIST);
		}
		return partList;
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_ATGCCommandList()
	 * @model containment="true"
	 * @generated
	 */
	public List<ATGCDirective> getATGCCommandList() {
		if (atgcCommandList == null) {
			atgcCommandList = new EObjectContainmentEList<ATGCDirective>(ATGCDirective.class, this, IblPackage.DEVICE__ATGC_COMMAND_LIST);
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_ID()
	 * @model
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Device#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.DEVICE__ID, oldID, id));
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_MoleculeList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getMoleculeList() {
		if (moleculeList == null) {
			moleculeList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.DEVICE__MOLECULE_LIST);
		}
		return moleculeList;
	}

	/**
	 * Returns the value of the '<em><b>Output List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output List</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_OutputList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getOutputList() {
		if (outputList == null) {
			outputList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.DEVICE__OUTPUT_LIST);
		}
		return outputList;
	}

	/**
	 * Returns the value of the '<em><b>Input List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input List</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_InputList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getInputList() {
		if (inputList == null) {
			inputList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.DEVICE__INPUT_LIST);
		}
		return inputList;
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_VariableAssignmentList()
	 * @model containment="true"
	 * @generated
	 */
	public List<EMFVariableAssignment> getVariableAssignmentList() {
		if (variableAssignmentList == null) {
			variableAssignmentList = new EObjectContainmentEList<EMFVariableAssignment>(EMFVariableAssignment.class, this, IblPackage.DEVICE__VARIABLE_ASSIGNMENT_LIST);
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice_Properties()
	 * @model containment="true"
	 * @generated
	 */
	public List<IProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<IProperty>(IProperty.class, this, IblPackage.DEVICE__PROPERTIES);
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
			case IblPackage.DEVICE__PROCESS_LIST:
				return ((InternalEList<?>)getProcessList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__RULE_LIST:
				return ((InternalEList<?>)getRuleList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__PART_LIST:
				return ((InternalEList<?>)getPartList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				return ((InternalEList<?>)getATGCCommandList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__MOLECULE_LIST:
				return ((InternalEList<?>)getMoleculeList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__OUTPUT_LIST:
				return ((InternalEList<?>)getOutputList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__INPUT_LIST:
				return ((InternalEList<?>)getInputList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__VARIABLE_ASSIGNMENT_LIST:
				return ((InternalEList<?>)getVariableAssignmentList()).basicRemove(otherEnd, msgs);
			case IblPackage.DEVICE__PROPERTIES:
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
			case IblPackage.DEVICE__DISPLAY_NAME:
				return getDisplayName();
			case IblPackage.DEVICE__PROCESS_LIST:
				return getProcessList();
			case IblPackage.DEVICE__RULE_LIST:
				return getRuleList();
			case IblPackage.DEVICE__PART_LIST:
				return getPartList();
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				return getATGCCommandList();
			case IblPackage.DEVICE__ID:
				return getID();
			case IblPackage.DEVICE__MOLECULE_LIST:
				return getMoleculeList();
			case IblPackage.DEVICE__OUTPUT_LIST:
				return getOutputList();
			case IblPackage.DEVICE__INPUT_LIST:
				return getInputList();
			case IblPackage.DEVICE__VARIABLE_ASSIGNMENT_LIST:
				return getVariableAssignmentList();
			case IblPackage.DEVICE__PROPERTIES:
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
			case IblPackage.DEVICE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case IblPackage.DEVICE__PROCESS_LIST:
				getProcessList().clear();
				getProcessList().addAll((Collection<? extends Kinetics>)newValue);
				return;
			case IblPackage.DEVICE__RULE_LIST:
				getRuleList().clear();
				getRuleList().addAll((Collection<? extends Rule>)newValue);
				return;
			case IblPackage.DEVICE__PART_LIST:
				getPartList().clear();
				getPartList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				getATGCCommandList().clear();
				getATGCCommandList().addAll((Collection<? extends ATGCDirective>)newValue);
				return;
			case IblPackage.DEVICE__ID:
				setID((String)newValue);
				return;
			case IblPackage.DEVICE__MOLECULE_LIST:
				getMoleculeList().clear();
				getMoleculeList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.DEVICE__OUTPUT_LIST:
				getOutputList().clear();
				getOutputList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.DEVICE__INPUT_LIST:
				getInputList().clear();
				getInputList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.DEVICE__VARIABLE_ASSIGNMENT_LIST:
				getVariableAssignmentList().clear();
				getVariableAssignmentList().addAll((Collection<? extends EMFVariableAssignment>)newValue);
				return;
			case IblPackage.DEVICE__PROPERTIES:
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
			case IblPackage.DEVICE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case IblPackage.DEVICE__PROCESS_LIST:
				getProcessList().clear();
				return;
			case IblPackage.DEVICE__RULE_LIST:
				getRuleList().clear();
				return;
			case IblPackage.DEVICE__PART_LIST:
				getPartList().clear();
				return;
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				getATGCCommandList().clear();
				return;
			case IblPackage.DEVICE__ID:
				setID(ID_EDEFAULT);
				return;
			case IblPackage.DEVICE__MOLECULE_LIST:
				getMoleculeList().clear();
				return;
			case IblPackage.DEVICE__OUTPUT_LIST:
				getOutputList().clear();
				return;
			case IblPackage.DEVICE__INPUT_LIST:
				getInputList().clear();
				return;
			case IblPackage.DEVICE__VARIABLE_ASSIGNMENT_LIST:
				getVariableAssignmentList().clear();
				return;
			case IblPackage.DEVICE__PROPERTIES:
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
			case IblPackage.DEVICE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case IblPackage.DEVICE__PROCESS_LIST:
				return processList != null && !processList.isEmpty();
			case IblPackage.DEVICE__RULE_LIST:
				return ruleList != null && !ruleList.isEmpty();
			case IblPackage.DEVICE__PART_LIST:
				return partList != null && !partList.isEmpty();
			case IblPackage.DEVICE__ATGC_COMMAND_LIST:
				return atgcCommandList != null && !atgcCommandList.isEmpty();
			case IblPackage.DEVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IblPackage.DEVICE__MOLECULE_LIST:
				return moleculeList != null && !moleculeList.isEmpty();
			case IblPackage.DEVICE__OUTPUT_LIST:
				return outputList != null && !outputList.isEmpty();
			case IblPackage.DEVICE__INPUT_LIST:
				return inputList != null && !inputList.isEmpty();
			case IblPackage.DEVICE__VARIABLE_ASSIGNMENT_LIST:
				return variableAssignmentList != null && !variableAssignmentList.isEmpty();
			case IblPackage.DEVICE__PROPERTIES:
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

} // Device
