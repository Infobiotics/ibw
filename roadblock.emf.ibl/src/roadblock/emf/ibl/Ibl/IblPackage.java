/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see roadblock.emf.ibl.Ibl.IblFactory
 * @model kind="package"
 * @generated
 */
public interface IblPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Ibl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.roadblock.org/ibl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ibl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IblPackage eINSTANCE = roadblock.emf.ibl.Ibl.impl.IblPackageImpl.init();

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.impl.ModelImpl
	 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Process List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROCESS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Cell List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CELL_LIST = 2;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RULE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Device List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEVICE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MOLECULE_LIST = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.impl.ProcessImpl
	 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RULE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Input List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INPUT_LIST = 2;

	/**
	 * The feature id for the '<em><b>Output List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OUTPUT_LIST = 3;

	/**
	 * The feature id for the '<em><b>Option List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OPTION_LIST = 4;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.impl.RuleImpl
	 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_BIDIRECTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Forward Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FORWARD_RATE = 2;

	/**
	 * The feature id for the '<em><b>Reverse Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__REVERSE_RATE = 3;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LEFT_HAND_SIDE = 4;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RIGHT_HAND_SIDE = 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 6;


	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.impl.MoleculeImpl <em>Molecule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.impl.MoleculeImpl
	 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getMolecule()
	 * @generated
	 */
	int MOLECULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULE__URI = 1;

	/**
	 * The number of structural features of the '<em>Molecule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.impl.DeviceImpl
	 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Process List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PROCESS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__RULE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MOLECULE_LIST = 3;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.impl.CellImpl
	 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Device List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__DEVICE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Process List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__PROCESS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__RULE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__MOLECULE_LIST = 4;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getProcessList <em>Process List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getProcessList()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ProcessList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getCellList <em>Cell List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getCellList()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_CellList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getRuleList()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_RuleList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getDeviceList <em>Device List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getDeviceList()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DeviceList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getMoleculeList()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_MoleculeList();

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see roadblock.emf.ibl.Ibl.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Process#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Process#getRuleList()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_RuleList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Process#getInputList <em>Input List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Process#getInputList()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_InputList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Process#getOutputList <em>Output List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Process#getOutputList()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OutputList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Process#getOptionList <em>Option List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Process#getOptionList()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OptionList();

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#isIsBidirectional <em>Is Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bidirectional</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#isIsBidirectional()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_IsBidirectional();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getForwardRate <em>Forward Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forward Rate</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getForwardRate()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ForwardRate();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getReverseRate <em>Reverse Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Rate</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getReverseRate()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ReverseRate();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Rule#getLeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Hand Side</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getLeftHandSide()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_LeftHandSide();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Rule#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Hand Side</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getRightHandSide()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RightHandSide();

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Molecule <em>Molecule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molecule</em>'.
	 * @see roadblock.emf.ibl.Ibl.Molecule
	 * @generated
	 */
	EClass getMolecule();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Molecule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Molecule#getName()
	 * @see #getMolecule()
	 * @generated
	 */
	EAttribute getMolecule_Name();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Molecule#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see roadblock.emf.ibl.Ibl.Molecule#getURI()
	 * @see #getMolecule()
	 * @generated
	 */
	EAttribute getMolecule_URI();

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getProcessList <em>Process List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getProcessList()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_ProcessList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getRuleList()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_RuleList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getMoleculeList()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_MoleculeList();

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Cell#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getName()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getDeviceList <em>Device List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getDeviceList()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_DeviceList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getProcessList <em>Process List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getProcessList()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_ProcessList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getRuleList()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_RuleList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getMoleculeList()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_MoleculeList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IblFactory getIblFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.impl.ModelImpl
		 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Process List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PROCESS_LIST = eINSTANCE.getModel_ProcessList();

		/**
		 * The meta object literal for the '<em><b>Cell List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CELL_LIST = eINSTANCE.getModel_CellList();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RULE_LIST = eINSTANCE.getModel_RuleList();

		/**
		 * The meta object literal for the '<em><b>Device List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEVICE_LIST = eINSTANCE.getModel_DeviceList();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MOLECULE_LIST = eINSTANCE.getModel_MoleculeList();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.impl.ProcessImpl
		 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RULE_LIST = eINSTANCE.getProcess_RuleList();

		/**
		 * The meta object literal for the '<em><b>Input List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INPUT_LIST = eINSTANCE.getProcess_InputList();

		/**
		 * The meta object literal for the '<em><b>Output List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__OUTPUT_LIST = eINSTANCE.getProcess_OutputList();

		/**
		 * The meta object literal for the '<em><b>Option List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__OPTION_LIST = eINSTANCE.getProcess_OptionList();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.impl.RuleImpl
		 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Is Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__IS_BIDIRECTIONAL = eINSTANCE.getRule_IsBidirectional();

		/**
		 * The meta object literal for the '<em><b>Forward Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__FORWARD_RATE = eINSTANCE.getRule_ForwardRate();

		/**
		 * The meta object literal for the '<em><b>Reverse Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__REVERSE_RATE = eINSTANCE.getRule_ReverseRate();

		/**
		 * The meta object literal for the '<em><b>Left Hand Side</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__LEFT_HAND_SIDE = eINSTANCE.getRule_LeftHandSide();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RIGHT_HAND_SIDE = eINSTANCE.getRule_RightHandSide();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.impl.MoleculeImpl <em>Molecule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.impl.MoleculeImpl
		 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getMolecule()
		 * @generated
		 */
		EClass MOLECULE = eINSTANCE.getMolecule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULE__NAME = eINSTANCE.getMolecule_Name();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULE__URI = eINSTANCE.getMolecule_URI();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.impl.DeviceImpl
		 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Process List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__PROCESS_LIST = eINSTANCE.getDevice_ProcessList();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__RULE_LIST = eINSTANCE.getDevice_RuleList();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__MOLECULE_LIST = eINSTANCE.getDevice_MoleculeList();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.impl.CellImpl
		 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__NAME = eINSTANCE.getCell_Name();

		/**
		 * The meta object literal for the '<em><b>Device List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__DEVICE_LIST = eINSTANCE.getCell_DeviceList();

		/**
		 * The meta object literal for the '<em><b>Process List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__PROCESS_LIST = eINSTANCE.getCell_ProcessList();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__RULE_LIST = eINSTANCE.getCell_RuleList();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__MOLECULE_LIST = eINSTANCE.getCell_MoleculeList();

	}

} //IblPackage
