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
	String eNS_PREFIX = "roadblock.emf.ibl";

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
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DISPLAY_NAME = 0;

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
	 * The feature id for the '<em><b>ATG Ccommand List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ATG_CCOMMAND_LIST = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ID = 7;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.impl.KineticsImpl <em>Kinetics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.impl.KineticsImpl
	 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getKinetics()
	 * @generated
	 */
	int KINETICS = 1;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINETICS__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINETICS__RULE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINETICS__MOLECULE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Output List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINETICS__OUTPUT_LIST = 3;

	/**
	 * The feature id for the '<em><b>Option List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINETICS__OPTION_LIST = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINETICS__ID = 5;

	/**
	 * The number of structural features of the '<em>Kinetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINETICS_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DISPLAY_NAME = 0;

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
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = 6;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.impl.MolecularSpeciesImpl <em>Molecular Species</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.impl.MolecularSpeciesImpl
	 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getMolecularSpecies()
	 * @generated
	 */
	int MOLECULAR_SPECIES = 3;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULAR_SPECIES__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULAR_SPECIES__URI = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULAR_SPECIES__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULAR_SPECIES__UNIT = 3;

	/**
	 * The number of structural features of the '<em>Molecular Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOLECULAR_SPECIES_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DISPLAY_NAME = 0;

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
	 * The feature id for the '<em><b>Part List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PART_LIST = 3;

	/**
	 * The feature id for the '<em><b>ATGC Command List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ATGC_COMMAND_LIST = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = 5;

	/**
	 * The feature id for the '<em><b>Kinetics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__KINETICS = 6;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Device List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__DEVICE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Kinetics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__KINETICS = 2;

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
	 * The feature id for the '<em><b>ATGC Command List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ATGC_COMMAND_LIST = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ID = 6;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.impl.ATGCDirectiveImpl <em>ATGC Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.impl.ATGCDirectiveImpl
	 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getATGCDirective()
	 * @generated
	 */
	int ATGC_DIRECTIVE = 6;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATGC_DIRECTIVE__COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Part List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATGC_DIRECTIVE__PART_LIST = 1;

	/**
	 * The number of structural features of the '<em>ATGC Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATGC_DIRECTIVE_FEATURE_COUNT = 2;


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
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Model#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getDisplayName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_DisplayName();

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
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getATGCcommandList <em>ATG Ccommand List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATG Ccommand List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getATGCcommandList()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ATGCcommandList();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Model#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getID()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_ID();

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Kinetics <em>Kinetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kinetics</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics
	 * @generated
	 */
	EClass getKinetics();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Kinetics#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getDisplayName()
	 * @see #getKinetics()
	 * @generated
	 */
	EAttribute getKinetics_DisplayName();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Kinetics#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getRuleList()
	 * @see #getKinetics()
	 * @generated
	 */
	EReference getKinetics_RuleList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Kinetics#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getMoleculeList()
	 * @see #getKinetics()
	 * @generated
	 */
	EReference getKinetics_MoleculeList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Kinetics#getOutputList <em>Output List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getOutputList()
	 * @see #getKinetics()
	 * @generated
	 */
	EReference getKinetics_OutputList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Kinetics#getOptionList <em>Option List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getOptionList()
	 * @see #getKinetics()
	 * @generated
	 */
	EReference getKinetics_OptionList();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Kinetics#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getID()
	 * @see #getKinetics()
	 * @generated
	 */
	EAttribute getKinetics_ID();

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
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getDisplayName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_DisplayName();

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
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getID()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ID();

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.MolecularSpecies <em>Molecular Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molecular Species</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies
	 * @generated
	 */
	EClass getMolecularSpecies();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getDisplayName()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	EAttribute getMolecularSpecies_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getURI()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	EAttribute getMolecularSpecies_URI();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getAmount()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	EAttribute getMolecularSpecies_Amount();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getUnit()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	EAttribute getMolecularSpecies_Unit();

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
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Device#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getDisplayName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DisplayName();

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
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getPartList <em>Part List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getPartList()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_PartList();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getATGCCommandList <em>ATGC Command List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATGC Command List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getATGCCommandList()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_ATGCCommandList();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Device#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getID()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ID();

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.Device#getKinetics <em>Kinetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinetics</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getKinetics()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Kinetics();

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
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Cell#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getDisplayName()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_DisplayName();

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
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.Cell#getKinetics <em>Kinetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinetics</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getKinetics()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Kinetics();

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
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getATGCCommandList <em>ATGC Command List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATGC Command List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getATGCCommandList()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_ATGCCommandList();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Cell#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getID()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_ID();

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ATGCDirective <em>ATGC Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATGC Directive</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCDirective
	 * @generated
	 */
	EClass getATGCDirective();

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ATGCDirective#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCDirective#getCommand()
	 * @see #getATGCDirective()
	 * @generated
	 */
	EAttribute getATGCDirective_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.ATGCDirective#getPartList <em>Part List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part List</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCDirective#getPartList()
	 * @see #getATGCDirective()
	 * @generated
	 */
	EReference getATGCDirective_PartList();

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
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__DISPLAY_NAME = eINSTANCE.getModel_DisplayName();

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
		 * The meta object literal for the '<em><b>ATG Ccommand List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ATG_CCOMMAND_LIST = eINSTANCE.getModel_ATGCcommandList();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__ID = eINSTANCE.getModel_ID();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.impl.KineticsImpl <em>Kinetics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.impl.KineticsImpl
		 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getKinetics()
		 * @generated
		 */
		EClass KINETICS = eINSTANCE.getKinetics();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINETICS__DISPLAY_NAME = eINSTANCE.getKinetics_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINETICS__RULE_LIST = eINSTANCE.getKinetics_RuleList();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINETICS__MOLECULE_LIST = eINSTANCE.getKinetics_MoleculeList();

		/**
		 * The meta object literal for the '<em><b>Output List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINETICS__OUTPUT_LIST = eINSTANCE.getKinetics_OutputList();

		/**
		 * The meta object literal for the '<em><b>Option List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINETICS__OPTION_LIST = eINSTANCE.getKinetics_OptionList();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINETICS__ID = eINSTANCE.getKinetics_ID();

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
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__DISPLAY_NAME = eINSTANCE.getRule_DisplayName();

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
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ID = eINSTANCE.getRule_ID();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.impl.MolecularSpeciesImpl <em>Molecular Species</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.impl.MolecularSpeciesImpl
		 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getMolecularSpecies()
		 * @generated
		 */
		EClass MOLECULAR_SPECIES = eINSTANCE.getMolecularSpecies();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULAR_SPECIES__DISPLAY_NAME = eINSTANCE.getMolecularSpecies_DisplayName();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULAR_SPECIES__URI = eINSTANCE.getMolecularSpecies_URI();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULAR_SPECIES__AMOUNT = eINSTANCE.getMolecularSpecies_Amount();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOLECULAR_SPECIES__UNIT = eINSTANCE.getMolecularSpecies_Unit();

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
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DISPLAY_NAME = eINSTANCE.getDevice_DisplayName();

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
		 * The meta object literal for the '<em><b>Part List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__PART_LIST = eINSTANCE.getDevice_PartList();

		/**
		 * The meta object literal for the '<em><b>ATGC Command List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ATGC_COMMAND_LIST = eINSTANCE.getDevice_ATGCCommandList();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ID = eINSTANCE.getDevice_ID();

		/**
		 * The meta object literal for the '<em><b>Kinetics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__KINETICS = eINSTANCE.getDevice_Kinetics();

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
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__DISPLAY_NAME = eINSTANCE.getCell_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Device List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__DEVICE_LIST = eINSTANCE.getCell_DeviceList();

		/**
		 * The meta object literal for the '<em><b>Kinetics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__KINETICS = eINSTANCE.getCell_Kinetics();

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

		/**
		 * The meta object literal for the '<em><b>ATGC Command List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__ATGC_COMMAND_LIST = eINSTANCE.getCell_ATGCCommandList();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ID = eINSTANCE.getCell_ID();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.impl.ATGCDirectiveImpl <em>ATGC Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.impl.ATGCDirectiveImpl
		 * @see roadblock.emf.ibl.Ibl.impl.IblPackageImpl#getATGCDirective()
		 * @generated
		 */
		EClass ATGC_DIRECTIVE = eINSTANCE.getATGCDirective();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATGC_DIRECTIVE__COMMAND = eINSTANCE.getATGCDirective_Command();

		/**
		 * The meta object literal for the '<em><b>Part List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATGC_DIRECTIVE__PART_LIST = eINSTANCE.getATGCDirective_PartList();

	}

} //IblPackage
