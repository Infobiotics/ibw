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
 * A representation of the model object '<em><b>Kinetics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roadblock.emf.ibl.Ibl.Kinetics#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Kinetics#getProcessList <em>Process List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Kinetics#getRuleList <em>Rule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Kinetics#getMoleculeList <em>Molecule List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Kinetics#getOutputList <em>Output List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Kinetics#getOptionList <em>Option List</em>}</li>
 *   <li>{@link roadblock.emf.ibl.Ibl.Kinetics#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics()
 * @model kind="class"
 * @generated
 */
public class Kinetics extends EObjectImpl implements IVisitable, IMoleculeContainer, IRuleContainer {
	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleList()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> ruleList;

	/**
	 * The cached value of the '{@link #getMoleculeList() <em>Molecule List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoleculeList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> moleculeList;

	/**
	 * The cached value of the '{@link #getOutputList() <em>Output List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> outputList;

	/**
	 * The cached value of the '{@link #getOptionList() <em>Option List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionList()
	 * @generated
	 * @ordered
	 */
	protected EList<MolecularSpecies> optionList;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kinetics() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IblPackage.Literals.KINETICS;
	}

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics_DisplayName()
	 * @model
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Kinetics#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.KINETICS__DISPLAY_NAME, oldDisplayName, displayName));
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
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics_ProcessList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Kinetics> getProcessList() {
		if (processList == null) {
			processList = new EObjectContainmentEList<Kinetics>(Kinetics.class, this, IblPackage.KINETICS__PROCESS_LIST);
		}
		return processList;
	}

	/**
	 * Returns the value of the '<em><b>Rule List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics_RuleList()
	 * @model containment="true"
	 * @generated
	 */
	public List<Rule> getRuleList() {
		if (ruleList == null) {
			ruleList = new EObjectContainmentEList<Rule>(Rule.class, this, IblPackage.KINETICS__RULE_LIST);
		}
		return ruleList;
	}

	/**
	 * Returns the value of the '<em><b>Molecule List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecule List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecule List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics_MoleculeList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getMoleculeList() {
		if (moleculeList == null) {
			moleculeList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.KINETICS__MOLECULE_LIST);
		}
		return moleculeList;
	}

	/**
	 * Returns the value of the '<em><b>Output List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics_OutputList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getOutputList() {
		if (outputList == null) {
			outputList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.KINETICS__OUTPUT_LIST);
		}
		return outputList;
	}

	/**
	 * Returns the value of the '<em><b>Option List</b></em>' containment reference list.
	 * The list contents are of type {@link roadblock.emf.ibl.Ibl.MolecularSpecies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option List</em>' containment reference list.
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics_OptionList()
	 * @model containment="true"
	 * @generated
	 */
	public List<MolecularSpecies> getOptionList() {
		if (optionList == null) {
			optionList = new EObjectContainmentEList<MolecularSpecies>(MolecularSpecies.class, this, IblPackage.KINETICS__OPTION_LIST);
		}
		return optionList;
	}

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics_ID()
	 * @model
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * Sets the value of the '{@link roadblock.emf.ibl.Ibl.Kinetics#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IblPackage.KINETICS__ID, oldID, id));
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
			case IblPackage.KINETICS__PROCESS_LIST:
				return ((InternalEList<?>)getProcessList()).basicRemove(otherEnd, msgs);
			case IblPackage.KINETICS__RULE_LIST:
				return ((InternalEList<?>)getRuleList()).basicRemove(otherEnd, msgs);
			case IblPackage.KINETICS__MOLECULE_LIST:
				return ((InternalEList<?>)getMoleculeList()).basicRemove(otherEnd, msgs);
			case IblPackage.KINETICS__OUTPUT_LIST:
				return ((InternalEList<?>)getOutputList()).basicRemove(otherEnd, msgs);
			case IblPackage.KINETICS__OPTION_LIST:
				return ((InternalEList<?>)getOptionList()).basicRemove(otherEnd, msgs);
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
			case IblPackage.KINETICS__DISPLAY_NAME:
				return getDisplayName();
			case IblPackage.KINETICS__PROCESS_LIST:
				return getProcessList();
			case IblPackage.KINETICS__RULE_LIST:
				return getRuleList();
			case IblPackage.KINETICS__MOLECULE_LIST:
				return getMoleculeList();
			case IblPackage.KINETICS__OUTPUT_LIST:
				return getOutputList();
			case IblPackage.KINETICS__OPTION_LIST:
				return getOptionList();
			case IblPackage.KINETICS__ID:
				return getID();
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
			case IblPackage.KINETICS__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case IblPackage.KINETICS__PROCESS_LIST:
				getProcessList().clear();
				getProcessList().addAll((Collection<? extends Kinetics>)newValue);
				return;
			case IblPackage.KINETICS__RULE_LIST:
				getRuleList().clear();
				getRuleList().addAll((Collection<? extends Rule>)newValue);
				return;
			case IblPackage.KINETICS__MOLECULE_LIST:
				getMoleculeList().clear();
				getMoleculeList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.KINETICS__OUTPUT_LIST:
				getOutputList().clear();
				getOutputList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.KINETICS__OPTION_LIST:
				getOptionList().clear();
				getOptionList().addAll((Collection<? extends MolecularSpecies>)newValue);
				return;
			case IblPackage.KINETICS__ID:
				setID((String)newValue);
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
			case IblPackage.KINETICS__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case IblPackage.KINETICS__PROCESS_LIST:
				getProcessList().clear();
				return;
			case IblPackage.KINETICS__RULE_LIST:
				getRuleList().clear();
				return;
			case IblPackage.KINETICS__MOLECULE_LIST:
				getMoleculeList().clear();
				return;
			case IblPackage.KINETICS__OUTPUT_LIST:
				getOutputList().clear();
				return;
			case IblPackage.KINETICS__OPTION_LIST:
				getOptionList().clear();
				return;
			case IblPackage.KINETICS__ID:
				setID(ID_EDEFAULT);
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
			case IblPackage.KINETICS__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case IblPackage.KINETICS__PROCESS_LIST:
				return processList != null && !processList.isEmpty();
			case IblPackage.KINETICS__RULE_LIST:
				return ruleList != null && !ruleList.isEmpty();
			case IblPackage.KINETICS__MOLECULE_LIST:
				return moleculeList != null && !moleculeList.isEmpty();
			case IblPackage.KINETICS__OUTPUT_LIST:
				return outputList != null && !outputList.isEmpty();
			case IblPackage.KINETICS__OPTION_LIST:
				return optionList != null && !optionList.isEmpty();
			case IblPackage.KINETICS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // Kinetics
