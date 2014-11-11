/**
 */
package roadblock.emf.ibl.Ibl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
public class IblPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "Ibl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.roadblock.org/ibl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "roadblock.emf.ibl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IblPackage eINSTANCE = roadblock.emf.ibl.Ibl.IblPackage.init();

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.Model <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.Model
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel()
	 * @generated
	 */
	public static final int MODEL = 2;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.Kinetics <em>Kinetics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.Kinetics
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics()
	 * @generated
	 */
	public static final int KINETICS = 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.Rule <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.Rule
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule()
	 * @generated
	 */
	public static final int RULE = 4;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies <em>Molecular Species</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies()
	 * @generated
	 */
	public static final int MOLECULAR_SPECIES = 5;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.Device <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.Device
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice()
	 * @generated
	 */
	public static final int DEVICE = 6;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.Cell <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.Cell
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell()
	 * @generated
	 */
	public static final int CELL = 7;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ATGCDirective <em>ATGC Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ATGCDirective
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCDirective()
	 * @generated
	 */
	public static final int ATGC_DIRECTIVE = 8;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.System <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.System
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getSystem()
	 * @generated
	 */
	public static final int SYSTEM = 9;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.Chromosome <em>Chromosome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.Chromosome
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getChromosome()
	 * @generated
	 */
	public static final int CHROMOSOME = 10;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.Plasmid <em>Plasmid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.Plasmid
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getPlasmid()
	 * @generated
	 */
	public static final int PLASMID = 11;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.IVisitable <em>IVisitable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.IVisitable
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getIVisitable()
	 * @generated
	 */
	public static final int IVISITABLE = 0;

	/**
	 * The number of structural features of the '<em>IVisitable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IVISITABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.IVisitor <em>IVisitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.IVisitor
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getIVisitor()
	 * @generated
	 */
	public static final int IVISITOR = 1;

	/**
	 * The number of structural features of the '<em>IVisitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IVISITOR_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__DISPLAY_NAME = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__PROCESS_LIST = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__CELL_LIST = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__RULE_LIST = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Device List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__DEVICE_LIST = IVISITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__MOLECULE_LIST = IVISITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>ATG Ccommand List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__ATG_CCOMMAND_LIST = IVISITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__ID = IVISITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Region List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL__REGION_LIST = IVISITABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KINETICS__DISPLAY_NAME = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KINETICS__RULE_LIST = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KINETICS__MOLECULE_LIST = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KINETICS__OUTPUT_LIST = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Option List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KINETICS__OPTION_LIST = IVISITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KINETICS__ID = IVISITABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Kinetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int KINETICS_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE__DISPLAY_NAME = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE__IS_BIDIRECTIONAL = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forward Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE__FORWARD_RATE = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reverse Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE__REVERSE_RATE = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE__LEFT_HAND_SIDE = IVISITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE__RIGHT_HAND_SIDE = IVISITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE__ID = IVISITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Forward Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE__FORWARD_RATE_UNIT = IVISITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Reverse Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE__REVERSE_RATE_UNIT = IVISITABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RULE_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__DISPLAY_NAME = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__URI = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__AMOUNT = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__UNIT = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Degradation Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__DEGRADATION_RATE = IVISITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Binding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__BINDING_RATE = IVISITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unbinding Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__UNBINDING_RATE = IVISITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Biological Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__BIOLOGICAL_TYPE = IVISITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__SEQUENCE = IVISITABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Degradation Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__DEGRADATION_RATE_UNIT = IVISITABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Binding Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__BINDING_RATE_UNIT = IVISITABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Unbinding Rate Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__UNBINDING_RATE_UNIT = IVISITABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES__ID = IVISITABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Molecular Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SPECIES_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__DISPLAY_NAME = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__PROCESS_LIST = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__RULE_LIST = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Part List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__PART_LIST = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ATGC Command List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__ATGC_COMMAND_LIST = IVISITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__ID = IVISITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kinetics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__KINETICS = IVISITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__MOLECULE_LIST = IVISITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__OUTPUT_LIST = IVISITABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__INPUT_LIST = IVISITABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Variable Assignment List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__VARIABLE_ASSIGNMENT_LIST = IVISITABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE__PROPERTIES = IVISITABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL__DISPLAY_NAME = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL__DEVICE_LIST = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kinetics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL__KINETICS = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL__RULE_LIST = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL__MOLECULE_LIST = IVISITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ATGC Command List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL__ATGC_COMMAND_LIST = IVISITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL__ID = IVISITABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Variable Assignment List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL__VARIABLE_ASSIGNMENT_LIST = IVISITABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL__PROPERTIES = IVISITABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CELL_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>ATGC Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATGC_DIRECTIVE_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chromosome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CHROMOSOME_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plasmid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PLASMID_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.IProperty <em>IProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.IProperty
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getIProperty()
	 * @generated
	 */
	public static final int IPROPERTY = 12;

	/**
	 * The number of structural features of the '<em>IProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IPROPERTY_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ProbabilityProperty <em>Probability Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ProbabilityProperty
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getProbabilityProperty()
	 * @generated
	 */
	public static final int PROBABILITY_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Time Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROBABILITY_PROPERTY__TIME_CONSTRAINT = IPROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Probability Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT = IPROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROBABILITY_PROPERTY__INITIAL_CONDITIONS = IPROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Probability Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROBABILITY_PROPERTY_FEATURE_COUNT = IPROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.IProbabilityConstraint <em>IProbability Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.IProbabilityConstraint
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getIProbabilityConstraint()
	 * @generated
	 */
	public static final int IPROBABILITY_CONSTRAINT = 14;

	/**
	 * The number of structural features of the '<em>IProbability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IPROBABILITY_CONSTRAINT_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint <em>Concrete Probability Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcreteProbabilityConstraint()
	 * @generated
	 */
	public static final int CONCRETE_PROBABILITY_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCRETE_PROBABILITY_CONSTRAINT__OPERATOR = IPROBABILITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCRETE_PROBABILITY_CONSTRAINT__BOUND = IPROBABILITY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concrete Probability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCRETE_PROBABILITY_CONSTRAINT_FEATURE_COUNT = IPROBABILITY_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint <em>Unknown Probability Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getUnknownProbabilityConstraint()
	 * @generated
	 */
	public static final int UNKNOWN_PROBABILITY_CONSTRAINT = 16;

	/**
	 * The number of structural features of the '<em>Unknown Probability Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_PROBABILITY_CONSTRAINT_FEATURE_COUNT = IPROBABILITY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ITimeConstraint <em>ITime Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ITimeConstraint
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getITimeConstraint()
	 * @generated
	 */
	public static final int ITIME_CONSTRAINT = 17;

	/**
	 * The number of structural features of the '<em>ITime Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ITIME_CONSTRAINT_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.TimeInterval <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.TimeInterval
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getTimeInterval()
	 * @generated
	 */
	public static final int TIME_INTERVAL = 18;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INTERVAL__LOWER_BOUND = ITIME_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INTERVAL__UPPER_BOUND = ITIME_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INTERVAL__UNIT = ITIME_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INTERVAL_FEATURE_COUNT = ITIME_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.TimeInstant <em>Time Instant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.TimeInstant
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getTimeInstant()
	 * @generated
	 */
	public static final int TIME_INSTANT = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INSTANT__VALUE = ITIME_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INSTANT__UNIT = ITIME_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INSTANT__OPERATOR = ITIME_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_INSTANT_FEATURE_COUNT = ITIME_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty <em>Unary Probability Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.UnaryProbabilityProperty
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getUnaryProbabilityProperty()
	 * @generated
	 */
	public static final int UNARY_PROBABILITY_PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Time Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_PROBABILITY_PROPERTY__TIME_CONSTRAINT = PROBABILITY_PROPERTY__TIME_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Probability Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT = PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_PROBABILITY_PROPERTY__INITIAL_CONDITIONS = PROBABILITY_PROPERTY__INITIAL_CONDITIONS;

	/**
	 * The feature id for the '<em><b>State Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_PROBABILITY_PROPERTY__STATE_FORMULA = PROBABILITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_PROBABILITY_PROPERTY__OPERATOR = PROBABILITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Probability Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNARY_PROBABILITY_PROPERTY_FEATURE_COUNT = PROBABILITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.BinaryProbabilityProperty <em>Binary Probability Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.BinaryProbabilityProperty
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryProbabilityProperty()
	 * @generated
	 */
	public static final int BINARY_PROBABILITY_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Time Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_PROBABILITY_PROPERTY__TIME_CONSTRAINT = PROBABILITY_PROPERTY__TIME_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Probability Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT = PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_PROBABILITY_PROPERTY__INITIAL_CONDITIONS = PROBABILITY_PROPERTY__INITIAL_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_PROBABILITY_PROPERTY__LEFT_OPERAND = PROBABILITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_PROBABILITY_PROPERTY__RIGHT_OPERAND = PROBABILITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_PROBABILITY_PROPERTY__OPERATOR = PROBABILITY_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Probability Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_PROBABILITY_PROPERTY_FEATURE_COUNT = PROBABILITY_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.RewardProperty <em>Reward Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.RewardProperty
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRewardProperty()
	 * @generated
	 */
	public static final int REWARD_PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REWARD_PROPERTY__VARIABLE = IPROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REWARD_PROPERTY__TIME_CONSTRAINT = IPROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concentration Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REWARD_PROPERTY__CONCENTRATION_CONSTRAINT = IPROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REWARD_PROPERTY__INITIAL_CONDITIONS = IPROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reward Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REWARD_PROPERTY_FEATURE_COUNT = IPROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.SteadyStateProperty <em>Steady State Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.SteadyStateProperty
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getSteadyStateProperty()
	 * @generated
	 */
	public static final int STEADY_STATE_PROPERTY = 23;

	/**
	 * The feature id for the '<em><b>State Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEADY_STATE_PROPERTY__STATE_FORMULA = IPROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Probability Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEADY_STATE_PROPERTY__PROBABILITY_CONSTRAINT = IPROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEADY_STATE_PROPERTY__INITIAL_CONDITIONS = IPROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Steady State Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STEADY_STATE_PROPERTY_FEATURE_COUNT = IPROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ConcentrationConstraint <em>Concentration Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ConcentrationConstraint
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcentrationConstraint()
	 * @generated
	 */
	public static final int CONCENTRATION_CONSTRAINT = 24;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRATION_CONSTRAINT__OPERATOR = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRATION_CONSTRAINT__VALUE = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRATION_CONSTRAINT__UNIT = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concentration Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRATION_CONSTRAINT_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.IStateFormula <em>IState Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.IStateFormula
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getIStateFormula()
	 * @generated
	 */
	public static final int ISTATE_FORMULA = 25;

	/**
	 * The number of structural features of the '<em>IState Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ISTATE_FORMULA_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula <em>Binary State Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.BinaryStateFormula
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryStateFormula()
	 * @generated
	 */
	public static final int BINARY_STATE_FORMULA = 26;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_STATE_FORMULA__LEFT_OPERAND = ISTATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_STATE_FORMULA__RIGHT_OPERAND = ISTATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_STATE_FORMULA__OPERATOR = ISTATE_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary State Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_STATE_FORMULA_FEATURE_COUNT = ISTATE_FORMULA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.NotStateFormula <em>Not State Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.NotStateFormula
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getNotStateFormula()
	 * @generated
	 */
	public static final int NOT_STATE_FORMULA = 27;

	/**
	 * The feature id for the '<em><b>Negated Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NOT_STATE_FORMULA__NEGATED_OPERAND = ISTATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not State Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NOT_STATE_FORMULA_FEATURE_COUNT = ISTATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.Region <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.Region
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion()
	 * @generated
	 */
	public static final int REGION = 28;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGION__DISPLAY_NAME = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kinetics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGION__KINETICS = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGION__RULE_LIST = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGION__MOLECULE_LIST = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGION__ID = IVISITABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cell List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGION__CELL_LIST = IVISITABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Variable Assignment List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGION__VARIABLE_ASSIGNMENT_LIST = IVISITABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REGION_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment <em>EMF Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.EMFVariableAssignment
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getEMFVariableAssignment()
	 * @generated
	 */
	public static final int EMF_VARIABLE_ASSIGNMENT = 29;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_VARIABLE_ASSIGNMENT__VARIABLE_NAME = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_VARIABLE_ASSIGNMENT__VARIABLE_ATTRIBUTE = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_VARIABLE_ASSIGNMENT__UNIT = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_VARIABLE_ASSIGNMENT__AMOUNT = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EMF Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_VARIABLE_ASSIGNMENT_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.FlatModel <em>Flat Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.FlatModel
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getFlatModel()
	 * @generated
	 */
	public static final int FLAT_MODEL = 30;

	/**
	 * The feature id for the '<em><b>Molecule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_MODEL__MOLECULE_LIST = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_MODEL__RULE_LIST = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flat Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_MODEL_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition <em>Property Initial Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.PropertyInitialCondition
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getPropertyInitialCondition()
	 * @generated
	 */
	public static final int PROPERTY_INITIAL_CONDITION = 31;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_INITIAL_CONDITION__VARIABLE = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_INITIAL_CONDITION__UNIT = IVISITABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_INITIAL_CONDITION__AMOUNT = IVISITABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Initial Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_INITIAL_CONDITION_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ATGCDirection <em>ATGC Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ATGCDirection
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCDirection()
	 * @generated
	 */
	public static final int ATGC_DIRECTION = 32;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATGC_DIRECTION__DIRECTION = ATGC_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ATGC Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATGC_DIRECTION_FEATURE_COUNT = ATGC_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ATGCArrange <em>ATGC Arrange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ATGCArrange
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCArrange()
	 * @generated
	 */
	public static final int ATGC_ARRANGE = 33;

	/**
	 * The feature id for the '<em><b>Part List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATGC_ARRANGE__PART_LIST = ATGC_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ATGC Arrange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATGC_ARRANGE_FEATURE_COUNT = ATGC_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ATGCCloningSites <em>ATGC Cloning Sites</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ATGCCloningSites
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCCloningSites()
	 * @generated
	 */
	public static final int ATGC_CLONING_SITES = 34;

	/**
	 * The feature id for the '<em><b>Cloning Sites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATGC_CLONING_SITES__CLONING_SITES = ATGC_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ATGC Cloning Sites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATGC_CLONING_SITES_FEATURE_COUNT = ATGC_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair <em>Flat Model Property Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.FlatModelPropertyPair
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getFlatModelPropertyPair()
	 * @generated
	 */
	public static final int FLAT_MODEL_PROPERTY_PAIR = 35;

	/**
	 * The feature id for the '<em><b>Flat Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_MODEL_PROPERTY_PAIR__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Flat Model Property Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_MODEL_PROPERTY_PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.IArithmeticExpression <em>IArithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.IArithmeticExpression
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getIArithmeticExpression()
	 * @generated
	 */
	public static final int IARITHMETIC_EXPRESSION = 36;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.IArithmeticOperand <em>IArithmetic Operand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.IArithmeticOperand
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getIArithmeticOperand()
	 * @generated
	 */
	public static final int IARITHMETIC_OPERAND = 37;

	/**
	 * The number of structural features of the '<em>IArithmetic Operand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IARITHMETIC_OPERAND_FEATURE_COUNT = IVISITABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IArithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IARITHMETIC_EXPRESSION_FEATURE_COUNT = IARITHMETIC_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression <em>Binary Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.BinaryArithmeticExpression
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryArithmeticExpression()
	 * @generated
	 */
	public static final int BINARY_ARITHMETIC_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND = IARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND = IARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_ARITHMETIC_EXPRESSION__OPERATOR = IARITHMETIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_ARITHMETIC_EXPRESSION_FEATURE_COUNT = IARITHMETIC_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.NumericLiteral <em>Numeric Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.NumericLiteral
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getNumericLiteral()
	 * @generated
	 */
	public static final int NUMERIC_LITERAL = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_LITERAL__VALUE = IARITHMETIC_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC_LITERAL_FEATURE_COUNT = IARITHMETIC_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.VariableReference <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.VariableReference
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getVariableReference()
	 * @generated
	 */
	public static final int VARIABLE_REFERENCE = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_REFERENCE__NAME = IARITHMETIC_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Maximum Of Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_REFERENCE__IS_MAXIMUM_OF_INTEREST = IARITHMETIC_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_REFERENCE__CONTAINER_NAME = IARITHMETIC_OPERAND_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_REFERENCE_FEATURE_COUNT = IARITHMETIC_OPERAND_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.MonotonicityExpression <em>Monotonicity Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.MonotonicityExpression
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMonotonicityExpression()
	 * @generated
	 */
	public static final int MONOTONICITY_EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MONOTONICITY_EXPRESSION__VARIABLE = ISTATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MONOTONICITY_EXPRESSION__TYPE = ISTATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monotonicity Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MONOTONICITY_EXPRESSION_FEATURE_COUNT = ISTATE_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.RelationalExpression <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.RelationalExpression
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRelationalExpression()
	 * @generated
	 */
	public static final int RELATIONAL_EXPRESSION = 42;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_EXPRESSION__LEFT_OPERAND = ISTATE_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_EXPRESSION__RIGHT_OPERAND = ISTATE_FORMULA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_EXPRESSION__OPERATOR = ISTATE_FORMULA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_EXPRESSION_FEATURE_COUNT = ISTATE_FORMULA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ConcentrationQuantity <em>Concentration Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ConcentrationQuantity
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcentrationQuantity()
	 * @generated
	 */
	public static final int CONCENTRATION_QUANTITY = 43;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRATION_QUANTITY__AMOUNT = IARITHMETIC_OPERAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRATION_QUANTITY__UNIT = IARITHMETIC_OPERAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concentration Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONCENTRATION_QUANTITY_FEATURE_COUNT = IARITHMETIC_OPERAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.TimeUnit
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getTimeUnit()
	 * @generated
	 */
	public static final int TIME_UNIT = 44;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.TemporalPattern <em>Temporal Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.TemporalPattern
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getTemporalPattern()
	 * @generated
	 */
	public static final int TEMPORAL_PATTERN = 45;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.RelationalOperator
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRelationalOperator()
	 * @generated
	 */
	public static final int RELATIONAL_OPERATOR = 46;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.BooleanOperator
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getBooleanOperator()
	 * @generated
	 */
	public static final int BOOLEAN_OPERATOR = 47;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ConcentrationUnit <em>Concentration Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ConcentrationUnit
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcentrationUnit()
	 * @generated
	 */
	public static final int CONCENTRATION_UNIT = 48;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.RateUnit <em>Rate Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.RateUnit
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getRateUnit()
	 * @generated
	 */
	public static final int RATE_UNIT = 49;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.ArithmeticOperator
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getArithmeticOperator()
	 * @generated
	 */
	public static final int ARITHMETIC_OPERATOR = 50;

	/**
	 * The meta object id for the '{@link roadblock.emf.ibl.Ibl.MonotonicityType <em>Monotonicity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see roadblock.emf.ibl.Ibl.MonotonicityType
	 * @see roadblock.emf.ibl.Ibl.IblPackage#getMonotonicityType()
	 * @generated
	 */
	public static final int MONOTONICITY_TYPE = 51;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kineticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass molecularSpeciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atgcDirectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chromosomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plasmidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iVisitableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProbabilityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteProbabilityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownProbabilityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTimeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeInstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryProbabilityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryProbabilityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rewardPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass steadyStatePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concentrationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStateFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryStateFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notStateFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfVariableAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyInitialConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atgcDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atgcArrangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atgcCloningSitesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatModelPropertyPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iArithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iArithmeticOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryArithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monotonicityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concentrationQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum temporalPatternEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum concentrationUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rateUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arithmeticOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monotonicityTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see roadblock.emf.ibl.Ibl.IblPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IblPackage() {
		super(eNS_URI, IblFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IblPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IblPackage init() {
		if (isInited) return (IblPackage)EPackage.Registry.INSTANCE.getEPackage(IblPackage.eNS_URI);

		// Obtain or create and register package
		IblPackage theIblPackage = (IblPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IblPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IblPackage());

		isInited = true;

		// Create package meta-data objects
		theIblPackage.createPackageContents();

		// Initialize created meta-data
		theIblPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIblPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IblPackage.eNS_URI, theIblPackage);
		return theIblPackage;
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Model#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getDisplayName()
	 * @see #getModel()
	 * @generated
	 */
	public EAttribute getModel_DisplayName() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getProcessList <em>Process List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getProcessList()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_ProcessList() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getCellList <em>Cell List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getCellList()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_CellList() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getRuleList()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_RuleList() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getDeviceList <em>Device List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getDeviceList()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_DeviceList() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getMoleculeList()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_MoleculeList() {
		return (EReference)modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getATGCcommandList <em>ATG Ccommand List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATG Ccommand List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getATGCcommandList()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_ATGCcommandList() {
		return (EReference)modelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Model#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getID()
	 * @see #getModel()
	 * @generated
	 */
	public EAttribute getModel_ID() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Model#getRegionList <em>Region List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Model#getRegionList()
	 * @see #getModel()
	 * @generated
	 */
	public EReference getModel_RegionList() {
		return (EReference)modelEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Kinetics <em>Kinetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kinetics</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics
	 * @generated
	 */
	public EClass getKinetics() {
		return kineticsEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Kinetics#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getDisplayName()
	 * @see #getKinetics()
	 * @generated
	 */
	public EAttribute getKinetics_DisplayName() {
		return (EAttribute)kineticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Kinetics#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getRuleList()
	 * @see #getKinetics()
	 * @generated
	 */
	public EReference getKinetics_RuleList() {
		return (EReference)kineticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Kinetics#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getMoleculeList()
	 * @see #getKinetics()
	 * @generated
	 */
	public EReference getKinetics_MoleculeList() {
		return (EReference)kineticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Kinetics#getOutputList <em>Output List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getOutputList()
	 * @see #getKinetics()
	 * @generated
	 */
	public EReference getKinetics_OutputList() {
		return (EReference)kineticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Kinetics#getOptionList <em>Option List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getOptionList()
	 * @see #getKinetics()
	 * @generated
	 */
	public EReference getKinetics_OptionList() {
		return (EReference)kineticsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Kinetics#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Kinetics#getID()
	 * @see #getKinetics()
	 * @generated
	 */
	public EAttribute getKinetics_ID() {
		return (EAttribute)kineticsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getDisplayName()
	 * @see #getRule()
	 * @generated
	 */
	public EAttribute getRule_DisplayName() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#isIsBidirectional <em>Is Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bidirectional</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#isIsBidirectional()
	 * @see #getRule()
	 * @generated
	 */
	public EAttribute getRule_IsBidirectional() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getForwardRate <em>Forward Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forward Rate</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getForwardRate()
	 * @see #getRule()
	 * @generated
	 */
	public EAttribute getRule_ForwardRate() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getReverseRate <em>Reverse Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Rate</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getReverseRate()
	 * @see #getRule()
	 * @generated
	 */
	public EAttribute getRule_ReverseRate() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Rule#getLeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Hand Side</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getLeftHandSide()
	 * @see #getRule()
	 * @generated
	 */
	public EReference getRule_LeftHandSide() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Rule#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Hand Side</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getRightHandSide()
	 * @see #getRule()
	 * @generated
	 */
	public EReference getRule_RightHandSide() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getID()
	 * @see #getRule()
	 * @generated
	 */
	public EAttribute getRule_ID() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getForwardRateUnit <em>Forward Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forward Rate Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getForwardRateUnit()
	 * @see #getRule()
	 * @generated
	 */
	public EAttribute getRule_ForwardRateUnit() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Rule#getReverseRateUnit <em>Reverse Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Rate Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.Rule#getReverseRateUnit()
	 * @see #getRule()
	 * @generated
	 */
	public EAttribute getRule_ReverseRateUnit() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.MolecularSpecies <em>Molecular Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Molecular Species</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies
	 * @generated
	 */
	public EClass getMolecularSpecies() {
		return molecularSpeciesEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getDisplayName()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_DisplayName() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getURI()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_URI() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getAmount()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_Amount() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getUnit()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_Unit() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDegradationRate <em>Degradation Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degradation Rate</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getDegradationRate()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_DegradationRate() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getBindingRate <em>Binding Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Rate</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getBindingRate()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_BindingRate() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnbindingRate <em>Unbinding Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbinding Rate</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getUnbindingRate()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_UnbindingRate() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getBiologicalType <em>Biological Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biological Type</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getBiologicalType()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_BiologicalType() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getSequence()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_Sequence() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getDegradationRateUnit <em>Degradation Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degradation Rate Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getDegradationRateUnit()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_DegradationRateUnit() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getBindingRateUnit <em>Binding Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Rate Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getBindingRateUnit()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_BindingRateUnit() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getUnbindingRateUnit <em>Unbinding Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbinding Rate Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getUnbindingRateUnit()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_UnbindingRateUnit() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(11);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MolecularSpecies#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies#getID()
	 * @see #getMolecularSpecies()
	 * @generated
	 */
	public EAttribute getMolecularSpecies_ID() {
		return (EAttribute)molecularSpeciesEClass.getEStructuralFeatures().get(12);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Device#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getDisplayName()
	 * @see #getDevice()
	 * @generated
	 */
	public EAttribute getDevice_DisplayName() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getProcessList <em>Process List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getProcessList()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_ProcessList() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getRuleList()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_RuleList() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getPartList <em>Part List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getPartList()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_PartList() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getATGCCommandList <em>ATGC Command List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATGC Command List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getATGCCommandList()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_ATGCCommandList() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Device#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getID()
	 * @see #getDevice()
	 * @generated
	 */
	public EAttribute getDevice_ID() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.Device#getKinetics <em>Kinetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinetics</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getKinetics()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_Kinetics() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getMoleculeList()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_MoleculeList() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getOutputList <em>Output List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getOutputList()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_OutputList() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getInputList <em>Input List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getInputList()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_InputList() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getVariableAssignmentList <em>Variable Assignment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Assignment List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getVariableAssignmentList()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_VariableAssignmentList() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Device#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see roadblock.emf.ibl.Ibl.Device#getProperties()
	 * @see #getDevice()
	 * @generated
	 */
	public EReference getDevice_Properties() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(11);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell
	 * @generated
	 */
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Cell#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getDisplayName()
	 * @see #getCell()
	 * @generated
	 */
	public EAttribute getCell_DisplayName() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getDeviceList <em>Device List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getDeviceList()
	 * @see #getCell()
	 * @generated
	 */
	public EReference getCell_DeviceList() {
		return (EReference)cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.Cell#getKinetics <em>Kinetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinetics</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getKinetics()
	 * @see #getCell()
	 * @generated
	 */
	public EReference getCell_Kinetics() {
		return (EReference)cellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getRuleList()
	 * @see #getCell()
	 * @generated
	 */
	public EReference getCell_RuleList() {
		return (EReference)cellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getMoleculeList()
	 * @see #getCell()
	 * @generated
	 */
	public EReference getCell_MoleculeList() {
		return (EReference)cellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getATGCCommandList <em>ATGC Command List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATGC Command List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getATGCCommandList()
	 * @see #getCell()
	 * @generated
	 */
	public EReference getCell_ATGCCommandList() {
		return (EReference)cellEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Cell#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getID()
	 * @see #getCell()
	 * @generated
	 */
	public EAttribute getCell_ID() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getVariableAssignmentList <em>Variable Assignment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Assignment List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getVariableAssignmentList()
	 * @see #getCell()
	 * @generated
	 */
	public EReference getCell_VariableAssignmentList() {
		return (EReference)cellEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Cell#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see roadblock.emf.ibl.Ibl.Cell#getProperties()
	 * @see #getCell()
	 * @generated
	 */
	public EReference getCell_Properties() {
		return (EReference)cellEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ATGCDirective <em>ATGC Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATGC Directive</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCDirective
	 * @generated
	 */
	public EClass getATGCDirective() {
		return atgcDirectiveEClass;
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see roadblock.emf.ibl.Ibl.System
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Chromosome <em>Chromosome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chromosome</em>'.
	 * @see roadblock.emf.ibl.Ibl.Chromosome
	 * @generated
	 */
	public EClass getChromosome() {
		return chromosomeEClass;
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Plasmid <em>Plasmid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plasmid</em>'.
	 * @see roadblock.emf.ibl.Ibl.Plasmid
	 * @generated
	 */
	public EClass getPlasmid() {
		return plasmidEClass;
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.IVisitable <em>IVisitable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVisitable</em>'.
	 * @see roadblock.emf.ibl.Ibl.IVisitable
	 * @generated
	 */
	public EClass getIVisitable() {
		return iVisitableEClass;
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.IVisitor <em>IVisitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IVisitor</em>'.
	 * @see roadblock.emf.ibl.Ibl.IVisitor
	 * @generated
	 */
	public EClass getIVisitor() {
		return iVisitorEClass;
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.IProperty <em>IProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProperty</em>'.
	 * @see roadblock.emf.ibl.Ibl.IProperty
	 * @generated
	 */
	public EClass getIProperty() {
		return iPropertyEClass;
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ProbabilityProperty <em>Probability Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probability Property</em>'.
	 * @see roadblock.emf.ibl.Ibl.ProbabilityProperty
	 * @generated
	 */
	public EClass getProbabilityProperty() {
		return probabilityPropertyEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.ProbabilityProperty#getTimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.ProbabilityProperty#getTimeConstraint()
	 * @see #getProbabilityProperty()
	 * @generated
	 */
	public EReference getProbabilityProperty_TimeConstraint() {
		return (EReference)probabilityPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.ProbabilityProperty#getProbabilityConstraint <em>Probability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Probability Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.ProbabilityProperty#getProbabilityConstraint()
	 * @see #getProbabilityProperty()
	 * @generated
	 */
	public EReference getProbabilityProperty_ProbabilityConstraint() {
		return (EReference)probabilityPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.ProbabilityProperty#getInitialConditions <em>Initial Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Conditions</em>'.
	 * @see roadblock.emf.ibl.Ibl.ProbabilityProperty#getInitialConditions()
	 * @see #getProbabilityProperty()
	 * @generated
	 */
	public EReference getProbabilityProperty_InitialConditions() {
		return (EReference)probabilityPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.IProbabilityConstraint <em>IProbability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProbability Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.IProbabilityConstraint
	 * @generated
	 */
	public EClass getIProbabilityConstraint() {
		return iProbabilityConstraintEClass;
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint <em>Concrete Probability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Probability Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint
	 * @generated
	 */
	public EClass getConcreteProbabilityConstraint() {
		return concreteProbabilityConstraintEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint#getOperator()
	 * @see #getConcreteProbabilityConstraint()
	 * @generated
	 */
	public EAttribute getConcreteProbabilityConstraint_Operator() {
		return (EAttribute)concreteProbabilityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint#getBound()
	 * @see #getConcreteProbabilityConstraint()
	 * @generated
	 */
	public EAttribute getConcreteProbabilityConstraint_Bound() {
		return (EAttribute)concreteProbabilityConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint <em>Unknown Probability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Probability Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint
	 * @generated
	 */
	public EClass getUnknownProbabilityConstraint() {
		return unknownProbabilityConstraintEClass;
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ITimeConstraint <em>ITime Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITime Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.ITimeConstraint
	 * @generated
	 */
	public EClass getITimeConstraint() {
		return iTimeConstraintEClass;
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see roadblock.emf.ibl.Ibl.TimeInterval
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.TimeInterval#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see roadblock.emf.ibl.Ibl.TimeInterval#getLowerBound()
	 * @see #getTimeInterval()
	 * @generated
	 */
	public EAttribute getTimeInterval_LowerBound() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.TimeInterval#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see roadblock.emf.ibl.Ibl.TimeInterval#getUpperBound()
	 * @see #getTimeInterval()
	 * @generated
	 */
	public EAttribute getTimeInterval_UpperBound() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.TimeInterval#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.TimeInterval#getUnit()
	 * @see #getTimeInterval()
	 * @generated
	 */
	public EAttribute getTimeInterval_Unit() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.TimeInstant <em>Time Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Instant</em>'.
	 * @see roadblock.emf.ibl.Ibl.TimeInstant
	 * @generated
	 */
	public EClass getTimeInstant() {
		return timeInstantEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.TimeInstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see roadblock.emf.ibl.Ibl.TimeInstant#getValue()
	 * @see #getTimeInstant()
	 * @generated
	 */
	public EAttribute getTimeInstant_Value() {
		return (EAttribute)timeInstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.TimeInstant#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.TimeInstant#getUnit()
	 * @see #getTimeInstant()
	 * @generated
	 */
	public EAttribute getTimeInstant_Unit() {
		return (EAttribute)timeInstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.TimeInstant#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.TimeInstant#getOperator()
	 * @see #getTimeInstant()
	 * @generated
	 */
	public EAttribute getTimeInstant_Operator() {
		return (EAttribute)timeInstantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty <em>Unary Probability Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Probability Property</em>'.
	 * @see roadblock.emf.ibl.Ibl.UnaryProbabilityProperty
	 * @generated
	 */
	public EClass getUnaryProbabilityProperty() {
		return unaryProbabilityPropertyEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty#getStateFormula <em>State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Formula</em>'.
	 * @see roadblock.emf.ibl.Ibl.UnaryProbabilityProperty#getStateFormula()
	 * @see #getUnaryProbabilityProperty()
	 * @generated
	 */
	public EReference getUnaryProbabilityProperty_StateFormula() {
		return (EReference)unaryProbabilityPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.UnaryProbabilityProperty#getOperator()
	 * @see #getUnaryProbabilityProperty()
	 * @generated
	 */
	public EAttribute getUnaryProbabilityProperty_Operator() {
		return (EAttribute)unaryProbabilityPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.BinaryProbabilityProperty <em>Binary Probability Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Probability Property</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryProbabilityProperty
	 * @generated
	 */
	public EClass getBinaryProbabilityProperty() {
		return binaryProbabilityPropertyEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.BinaryProbabilityProperty#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryProbabilityProperty#getLeftOperand()
	 * @see #getBinaryProbabilityProperty()
	 * @generated
	 */
	public EReference getBinaryProbabilityProperty_LeftOperand() {
		return (EReference)binaryProbabilityPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.BinaryProbabilityProperty#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryProbabilityProperty#getRightOperand()
	 * @see #getBinaryProbabilityProperty()
	 * @generated
	 */
	public EReference getBinaryProbabilityProperty_RightOperand() {
		return (EReference)binaryProbabilityPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.BinaryProbabilityProperty#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryProbabilityProperty#getOperator()
	 * @see #getBinaryProbabilityProperty()
	 * @generated
	 */
	public EAttribute getBinaryProbabilityProperty_Operator() {
		return (EAttribute)binaryProbabilityPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.RewardProperty <em>Reward Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reward Property</em>'.
	 * @see roadblock.emf.ibl.Ibl.RewardProperty
	 * @generated
	 */
	public EClass getRewardProperty() {
		return rewardPropertyEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.RewardProperty#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see roadblock.emf.ibl.Ibl.RewardProperty#getVariable()
	 * @see #getRewardProperty()
	 * @generated
	 */
	public EReference getRewardProperty_Variable() {
		return (EReference)rewardPropertyEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.RewardProperty#getTimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.RewardProperty#getTimeConstraint()
	 * @see #getRewardProperty()
	 * @generated
	 */
	public EReference getRewardProperty_TimeConstraint() {
		return (EReference)rewardPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.RewardProperty#getConcentrationConstraint <em>Concentration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concentration Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.RewardProperty#getConcentrationConstraint()
	 * @see #getRewardProperty()
	 * @generated
	 */
	public EReference getRewardProperty_ConcentrationConstraint() {
		return (EReference)rewardPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.RewardProperty#getInitialConditions <em>Initial Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Conditions</em>'.
	 * @see roadblock.emf.ibl.Ibl.RewardProperty#getInitialConditions()
	 * @see #getRewardProperty()
	 * @generated
	 */
	public EReference getRewardProperty_InitialConditions() {
		return (EReference)rewardPropertyEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.SteadyStateProperty <em>Steady State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Steady State Property</em>'.
	 * @see roadblock.emf.ibl.Ibl.SteadyStateProperty
	 * @generated
	 */
	public EClass getSteadyStateProperty() {
		return steadyStatePropertyEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.SteadyStateProperty#getStateFormula <em>State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Formula</em>'.
	 * @see roadblock.emf.ibl.Ibl.SteadyStateProperty#getStateFormula()
	 * @see #getSteadyStateProperty()
	 * @generated
	 */
	public EReference getSteadyStateProperty_StateFormula() {
		return (EReference)steadyStatePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.SteadyStateProperty#getProbabilityConstraint <em>Probability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Probability Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.SteadyStateProperty#getProbabilityConstraint()
	 * @see #getSteadyStateProperty()
	 * @generated
	 */
	public EReference getSteadyStateProperty_ProbabilityConstraint() {
		return (EReference)steadyStatePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.SteadyStateProperty#getInitialConditions <em>Initial Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Conditions</em>'.
	 * @see roadblock.emf.ibl.Ibl.SteadyStateProperty#getInitialConditions()
	 * @see #getSteadyStateProperty()
	 * @generated
	 */
	public EReference getSteadyStateProperty_InitialConditions() {
		return (EReference)steadyStatePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ConcentrationConstraint <em>Concentration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concentration Constraint</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationConstraint
	 * @generated
	 */
	public EClass getConcentrationConstraint() {
		return concentrationConstraintEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ConcentrationConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationConstraint#getOperator()
	 * @see #getConcentrationConstraint()
	 * @generated
	 */
	public EAttribute getConcentrationConstraint_Operator() {
		return (EAttribute)concentrationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ConcentrationConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationConstraint#getValue()
	 * @see #getConcentrationConstraint()
	 * @generated
	 */
	public EAttribute getConcentrationConstraint_Value() {
		return (EAttribute)concentrationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ConcentrationConstraint#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationConstraint#getUnit()
	 * @see #getConcentrationConstraint()
	 * @generated
	 */
	public EAttribute getConcentrationConstraint_Unit() {
		return (EAttribute)concentrationConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.IStateFormula <em>IState Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IState Formula</em>'.
	 * @see roadblock.emf.ibl.Ibl.IStateFormula
	 * @generated
	 */
	public EClass getIStateFormula() {
		return iStateFormulaEClass;
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula <em>Binary State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary State Formula</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryStateFormula
	 * @generated
	 */
	public EClass getBinaryStateFormula() {
		return binaryStateFormulaEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryStateFormula#getLeftOperand()
	 * @see #getBinaryStateFormula()
	 * @generated
	 */
	public EReference getBinaryStateFormula_LeftOperand() {
		return (EReference)binaryStateFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryStateFormula#getRightOperand()
	 * @see #getBinaryStateFormula()
	 * @generated
	 */
	public EReference getBinaryStateFormula_RightOperand() {
		return (EReference)binaryStateFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryStateFormula#getOperator()
	 * @see #getBinaryStateFormula()
	 * @generated
	 */
	public EAttribute getBinaryStateFormula_Operator() {
		return (EAttribute)binaryStateFormulaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.NotStateFormula <em>Not State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not State Formula</em>'.
	 * @see roadblock.emf.ibl.Ibl.NotStateFormula
	 * @generated
	 */
	public EClass getNotStateFormula() {
		return notStateFormulaEClass;
	}

	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.NotStateFormula#getNegatedOperand <em>Negated Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negated Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.NotStateFormula#getNegatedOperand()
	 * @see #getNotStateFormula()
	 * @generated
	 */
	public EReference getNotStateFormula_NegatedOperand() {
		return (EReference)notStateFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see roadblock.emf.ibl.Ibl.Region
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Region#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.Region#getDisplayName()
	 * @see #getRegion()
	 * @generated
	 */
	public EAttribute getRegion_DisplayName() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.Region#getKinetics <em>Kinetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinetics</em>'.
	 * @see roadblock.emf.ibl.Ibl.Region#getKinetics()
	 * @see #getRegion()
	 * @generated
	 */
	public EReference getRegion_Kinetics() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Region#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Region#getRuleList()
	 * @see #getRegion()
	 * @generated
	 */
	public EReference getRegion_RuleList() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Region#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Region#getMoleculeList()
	 * @see #getRegion()
	 * @generated
	 */
	public EReference getRegion_MoleculeList() {
		return (EReference)regionEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.Region#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see roadblock.emf.ibl.Ibl.Region#getID()
	 * @see #getRegion()
	 * @generated
	 */
	public EAttribute getRegion_ID() {
		return (EAttribute)regionEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Region#getCellList <em>Cell List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Region#getCellList()
	 * @see #getRegion()
	 * @generated
	 */
	public EReference getRegion_CellList() {
		return (EReference)regionEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.Region#getVariableAssignmentList <em>Variable Assignment List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Assignment List</em>'.
	 * @see roadblock.emf.ibl.Ibl.Region#getVariableAssignmentList()
	 * @see #getRegion()
	 * @generated
	 */
	public EReference getRegion_VariableAssignmentList() {
		return (EReference)regionEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment <em>EMF Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Variable Assignment</em>'.
	 * @see roadblock.emf.ibl.Ibl.EMFVariableAssignment
	 * @generated
	 */
	public EClass getEMFVariableAssignment() {
		return emfVariableAssignmentEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.EMFVariableAssignment#getVariableName()
	 * @see #getEMFVariableAssignment()
	 * @generated
	 */
	public EAttribute getEMFVariableAssignment_VariableName() {
		return (EAttribute)emfVariableAssignmentEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getVariableAttribute <em>Variable Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Attribute</em>'.
	 * @see roadblock.emf.ibl.Ibl.EMFVariableAssignment#getVariableAttribute()
	 * @see #getEMFVariableAssignment()
	 * @generated
	 */
	public EAttribute getEMFVariableAssignment_VariableAttribute() {
		return (EAttribute)emfVariableAssignmentEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.EMFVariableAssignment#getUnit()
	 * @see #getEMFVariableAssignment()
	 * @generated
	 */
	public EAttribute getEMFVariableAssignment_Unit() {
		return (EAttribute)emfVariableAssignmentEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see roadblock.emf.ibl.Ibl.EMFVariableAssignment#getAmount()
	 * @see #getEMFVariableAssignment()
	 * @generated
	 */
	public EAttribute getEMFVariableAssignment_Amount() {
		return (EAttribute)emfVariableAssignmentEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.FlatModel <em>Flat Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Model</em>'.
	 * @see roadblock.emf.ibl.Ibl.FlatModel
	 * @generated
	 */
	public EClass getFlatModel() {
		return flatModelEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.FlatModel#getMoleculeList <em>Molecule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Molecule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.FlatModel#getMoleculeList()
	 * @see #getFlatModel()
	 * @generated
	 */
	public EReference getFlatModel_MoleculeList() {
		return (EReference)flatModelEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.FlatModel#getRuleList <em>Rule List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule List</em>'.
	 * @see roadblock.emf.ibl.Ibl.FlatModel#getRuleList()
	 * @see #getFlatModel()
	 * @generated
	 */
	public EReference getFlatModel_RuleList() {
		return (EReference)flatModelEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition <em>Property Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Initial Condition</em>'.
	 * @see roadblock.emf.ibl.Ibl.PropertyInitialCondition
	 * @generated
	 */
	public EClass getPropertyInitialCondition() {
		return propertyInitialConditionEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see roadblock.emf.ibl.Ibl.PropertyInitialCondition#getVariable()
	 * @see #getPropertyInitialCondition()
	 * @generated
	 */
	public EReference getPropertyInitialCondition_Variable() {
		return (EReference)propertyInitialConditionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.PropertyInitialCondition#getUnit()
	 * @see #getPropertyInitialCondition()
	 * @generated
	 */
	public EAttribute getPropertyInitialCondition_Unit() {
		return (EAttribute)propertyInitialConditionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see roadblock.emf.ibl.Ibl.PropertyInitialCondition#getAmount()
	 * @see #getPropertyInitialCondition()
	 * @generated
	 */
	public EAttribute getPropertyInitialCondition_Amount() {
		return (EAttribute)propertyInitialConditionEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ATGCDirection <em>ATGC Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATGC Direction</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCDirection
	 * @generated
	 */
	public EClass getATGCDirection() {
		return atgcDirectionEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ATGCDirection#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCDirection#getDirection()
	 * @see #getATGCDirection()
	 * @generated
	 */
	public EAttribute getATGCDirection_Direction() {
		return (EAttribute)atgcDirectionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ATGCArrange <em>ATGC Arrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATGC Arrange</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCArrange
	 * @generated
	 */
	public EClass getATGCArrange() {
		return atgcArrangeEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link roadblock.emf.ibl.Ibl.ATGCArrange#getPartList <em>Part List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part List</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCArrange#getPartList()
	 * @see #getATGCArrange()
	 * @generated
	 */
	public EReference getATGCArrange_PartList() {
		return (EReference)atgcArrangeEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ATGCCloningSites <em>ATGC Cloning Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATGC Cloning Sites</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCCloningSites
	 * @generated
	 */
	public EClass getATGCCloningSites() {
		return atgcCloningSitesEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ATGCCloningSites#getCloningSites <em>Cloning Sites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloning Sites</em>'.
	 * @see roadblock.emf.ibl.Ibl.ATGCCloningSites#getCloningSites()
	 * @see #getATGCCloningSites()
	 * @generated
	 */
	public EAttribute getATGCCloningSites_CloningSites() {
		return (EAttribute)atgcCloningSitesEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair <em>Flat Model Property Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Model Property Pair</em>'.
	 * @see roadblock.emf.ibl.Ibl.FlatModelPropertyPair
	 * @generated
	 */
	public EClass getFlatModelPropertyPair() {
		return flatModelPropertyPairEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getFlatModel <em>Flat Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flat Model</em>'.
	 * @see roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getFlatModel()
	 * @see #getFlatModelPropertyPair()
	 * @generated
	 */
	public EReference getFlatModelPropertyPair_FlatModel() {
		return (EReference)flatModelPropertyPairEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see roadblock.emf.ibl.Ibl.FlatModelPropertyPair#getProperty()
	 * @see #getFlatModelPropertyPair()
	 * @generated
	 */
	public EReference getFlatModelPropertyPair_Property() {
		return (EReference)flatModelPropertyPairEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.IArithmeticExpression <em>IArithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IArithmetic Expression</em>'.
	 * @see roadblock.emf.ibl.Ibl.IArithmeticExpression
	 * @generated
	 */
	public EClass getIArithmeticExpression() {
		return iArithmeticExpressionEClass;
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.IArithmeticOperand <em>IArithmetic Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IArithmetic Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.IArithmeticOperand
	 * @generated
	 */
	public EClass getIArithmeticOperand() {
		return iArithmeticOperandEClass;
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression <em>Binary Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Arithmetic Expression</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryArithmeticExpression
	 * @generated
	 */
	public EClass getBinaryArithmeticExpression() {
		return binaryArithmeticExpressionEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getLeftOperand()
	 * @see #getBinaryArithmeticExpression()
	 * @generated
	 */
	public EReference getBinaryArithmeticExpression_LeftOperand() {
		return (EReference)binaryArithmeticExpressionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getRightOperand()
	 * @see #getBinaryArithmeticExpression()
	 * @generated
	 */
	public EReference getBinaryArithmeticExpression_RightOperand() {
		return (EReference)binaryArithmeticExpressionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.BinaryArithmeticExpression#getOperator()
	 * @see #getBinaryArithmeticExpression()
	 * @generated
	 */
	public EAttribute getBinaryArithmeticExpression_Operator() {
		return (EAttribute)binaryArithmeticExpressionEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.NumericLiteral <em>Numeric Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Literal</em>'.
	 * @see roadblock.emf.ibl.Ibl.NumericLiteral
	 * @generated
	 */
	public EClass getNumericLiteral() {
		return numericLiteralEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.NumericLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see roadblock.emf.ibl.Ibl.NumericLiteral#getValue()
	 * @see #getNumericLiteral()
	 * @generated
	 */
	public EAttribute getNumericLiteral_Value() {
		return (EAttribute)numericLiteralEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see roadblock.emf.ibl.Ibl.VariableReference
	 * @generated
	 */
	public EClass getVariableReference() {
		return variableReferenceEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.VariableReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.VariableReference#getName()
	 * @see #getVariableReference()
	 * @generated
	 */
	public EAttribute getVariableReference_Name() {
		return (EAttribute)variableReferenceEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.VariableReference#isIsMaximumOfInterest <em>Is Maximum Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Maximum Of Interest</em>'.
	 * @see roadblock.emf.ibl.Ibl.VariableReference#isIsMaximumOfInterest()
	 * @see #getVariableReference()
	 * @generated
	 */
	public EAttribute getVariableReference_IsMaximumOfInterest() {
		return (EAttribute)variableReferenceEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.VariableReference#getContainerName <em>Container Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Name</em>'.
	 * @see roadblock.emf.ibl.Ibl.VariableReference#getContainerName()
	 * @see #getVariableReference()
	 * @generated
	 */
	public EAttribute getVariableReference_ContainerName() {
		return (EAttribute)variableReferenceEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.MonotonicityExpression <em>Monotonicity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monotonicity Expression</em>'.
	 * @see roadblock.emf.ibl.Ibl.MonotonicityExpression
	 * @generated
	 */
	public EClass getMonotonicityExpression() {
		return monotonicityExpressionEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.MonotonicityExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see roadblock.emf.ibl.Ibl.MonotonicityExpression#getVariable()
	 * @see #getMonotonicityExpression()
	 * @generated
	 */
	public EReference getMonotonicityExpression_Variable() {
		return (EReference)monotonicityExpressionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.MonotonicityExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see roadblock.emf.ibl.Ibl.MonotonicityExpression#getType()
	 * @see #getMonotonicityExpression()
	 * @generated
	 */
	public EAttribute getMonotonicityExpression_Type() {
		return (EAttribute)monotonicityExpressionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see roadblock.emf.ibl.Ibl.RelationalExpression
	 * @generated
	 */
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.RelationalExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.RelationalExpression#getLeftOperand()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	public EReference getRelationalExpression_LeftOperand() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link roadblock.emf.ibl.Ibl.RelationalExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see roadblock.emf.ibl.Ibl.RelationalExpression#getRightOperand()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	public EReference getRelationalExpression_RightOperand() {
		return (EReference)relationalExpressionEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.RelationalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.RelationalExpression#getOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	public EAttribute getRelationalExpression_Operator() {
		return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link roadblock.emf.ibl.Ibl.ConcentrationQuantity <em>Concentration Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concentration Quantity</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationQuantity
	 * @generated
	 */
	public EClass getConcentrationQuantity() {
		return concentrationQuantityEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ConcentrationQuantity#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationQuantity#getAmount()
	 * @see #getConcentrationQuantity()
	 * @generated
	 */
	public EAttribute getConcentrationQuantity_Amount() {
		return (EAttribute)concentrationQuantityEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link roadblock.emf.ibl.Ibl.ConcentrationQuantity#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationQuantity#getUnit()
	 * @see #getConcentrationQuantity()
	 * @generated
	 */
	public EAttribute getConcentrationQuantity_Unit() {
		return (EAttribute)concentrationQuantityEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for enum '{@link roadblock.emf.ibl.Ibl.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.TimeUnit
	 * @generated
	 */
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link roadblock.emf.ibl.Ibl.TemporalPattern <em>Temporal Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Pattern</em>'.
	 * @see roadblock.emf.ibl.Ibl.TemporalPattern
	 * @generated
	 */
	public EEnum getTemporalPattern() {
		return temporalPatternEEnum;
	}


	/**
	 * Returns the meta object for enum '{@link roadblock.emf.ibl.Ibl.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.RelationalOperator
	 * @generated
	 */
	public EEnum getRelationalOperator() {
		return relationalOperatorEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link roadblock.emf.ibl.Ibl.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.BooleanOperator
	 * @generated
	 */
	public EEnum getBooleanOperator() {
		return booleanOperatorEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link roadblock.emf.ibl.Ibl.ConcentrationUnit <em>Concentration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Concentration Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationUnit
	 * @generated
	 */
	public EEnum getConcentrationUnit() {
		return concentrationUnitEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link roadblock.emf.ibl.Ibl.RateUnit <em>Rate Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rate Unit</em>'.
	 * @see roadblock.emf.ibl.Ibl.RateUnit
	 * @generated
	 */
	public EEnum getRateUnit() {
		return rateUnitEEnum;
	}


	/**
	 * Returns the meta object for enum '{@link roadblock.emf.ibl.Ibl.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see roadblock.emf.ibl.Ibl.ArithmeticOperator
	 * @generated
	 */
	public EEnum getArithmeticOperator() {
		return arithmeticOperatorEEnum;
	}


	/**
	 * Returns the meta object for enum '{@link roadblock.emf.ibl.Ibl.MonotonicityType <em>Monotonicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monotonicity Type</em>'.
	 * @see roadblock.emf.ibl.Ibl.MonotonicityType
	 * @generated
	 */
	public EEnum getMonotonicityType() {
		return monotonicityTypeEEnum;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public IblFactory getIblFactory() {
		return (IblFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iVisitableEClass = createEClass(IVISITABLE);

		iVisitorEClass = createEClass(IVISITOR);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__DISPLAY_NAME);
		createEReference(modelEClass, MODEL__PROCESS_LIST);
		createEReference(modelEClass, MODEL__CELL_LIST);
		createEReference(modelEClass, MODEL__RULE_LIST);
		createEReference(modelEClass, MODEL__DEVICE_LIST);
		createEReference(modelEClass, MODEL__MOLECULE_LIST);
		createEReference(modelEClass, MODEL__ATG_CCOMMAND_LIST);
		createEAttribute(modelEClass, MODEL__ID);
		createEReference(modelEClass, MODEL__REGION_LIST);

		kineticsEClass = createEClass(KINETICS);
		createEAttribute(kineticsEClass, KINETICS__DISPLAY_NAME);
		createEReference(kineticsEClass, KINETICS__RULE_LIST);
		createEReference(kineticsEClass, KINETICS__MOLECULE_LIST);
		createEReference(kineticsEClass, KINETICS__OUTPUT_LIST);
		createEReference(kineticsEClass, KINETICS__OPTION_LIST);
		createEAttribute(kineticsEClass, KINETICS__ID);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__DISPLAY_NAME);
		createEAttribute(ruleEClass, RULE__IS_BIDIRECTIONAL);
		createEAttribute(ruleEClass, RULE__FORWARD_RATE);
		createEAttribute(ruleEClass, RULE__REVERSE_RATE);
		createEReference(ruleEClass, RULE__LEFT_HAND_SIDE);
		createEReference(ruleEClass, RULE__RIGHT_HAND_SIDE);
		createEAttribute(ruleEClass, RULE__ID);
		createEAttribute(ruleEClass, RULE__FORWARD_RATE_UNIT);
		createEAttribute(ruleEClass, RULE__REVERSE_RATE_UNIT);

		molecularSpeciesEClass = createEClass(MOLECULAR_SPECIES);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__DISPLAY_NAME);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__URI);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__AMOUNT);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__UNIT);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__DEGRADATION_RATE);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__BINDING_RATE);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__UNBINDING_RATE);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__BIOLOGICAL_TYPE);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__SEQUENCE);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__DEGRADATION_RATE_UNIT);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__BINDING_RATE_UNIT);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__UNBINDING_RATE_UNIT);
		createEAttribute(molecularSpeciesEClass, MOLECULAR_SPECIES__ID);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DISPLAY_NAME);
		createEReference(deviceEClass, DEVICE__PROCESS_LIST);
		createEReference(deviceEClass, DEVICE__RULE_LIST);
		createEReference(deviceEClass, DEVICE__PART_LIST);
		createEReference(deviceEClass, DEVICE__ATGC_COMMAND_LIST);
		createEAttribute(deviceEClass, DEVICE__ID);
		createEReference(deviceEClass, DEVICE__KINETICS);
		createEReference(deviceEClass, DEVICE__MOLECULE_LIST);
		createEReference(deviceEClass, DEVICE__OUTPUT_LIST);
		createEReference(deviceEClass, DEVICE__INPUT_LIST);
		createEReference(deviceEClass, DEVICE__VARIABLE_ASSIGNMENT_LIST);
		createEReference(deviceEClass, DEVICE__PROPERTIES);

		cellEClass = createEClass(CELL);
		createEAttribute(cellEClass, CELL__DISPLAY_NAME);
		createEReference(cellEClass, CELL__DEVICE_LIST);
		createEReference(cellEClass, CELL__KINETICS);
		createEReference(cellEClass, CELL__RULE_LIST);
		createEReference(cellEClass, CELL__MOLECULE_LIST);
		createEReference(cellEClass, CELL__ATGC_COMMAND_LIST);
		createEAttribute(cellEClass, CELL__ID);
		createEReference(cellEClass, CELL__VARIABLE_ASSIGNMENT_LIST);
		createEReference(cellEClass, CELL__PROPERTIES);

		atgcDirectiveEClass = createEClass(ATGC_DIRECTIVE);

		systemEClass = createEClass(SYSTEM);

		chromosomeEClass = createEClass(CHROMOSOME);

		plasmidEClass = createEClass(PLASMID);

		iPropertyEClass = createEClass(IPROPERTY);

		probabilityPropertyEClass = createEClass(PROBABILITY_PROPERTY);
		createEReference(probabilityPropertyEClass, PROBABILITY_PROPERTY__TIME_CONSTRAINT);
		createEReference(probabilityPropertyEClass, PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT);
		createEReference(probabilityPropertyEClass, PROBABILITY_PROPERTY__INITIAL_CONDITIONS);

		iProbabilityConstraintEClass = createEClass(IPROBABILITY_CONSTRAINT);

		concreteProbabilityConstraintEClass = createEClass(CONCRETE_PROBABILITY_CONSTRAINT);
		createEAttribute(concreteProbabilityConstraintEClass, CONCRETE_PROBABILITY_CONSTRAINT__OPERATOR);
		createEAttribute(concreteProbabilityConstraintEClass, CONCRETE_PROBABILITY_CONSTRAINT__BOUND);

		unknownProbabilityConstraintEClass = createEClass(UNKNOWN_PROBABILITY_CONSTRAINT);

		iTimeConstraintEClass = createEClass(ITIME_CONSTRAINT);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__LOWER_BOUND);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__UPPER_BOUND);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__UNIT);

		timeInstantEClass = createEClass(TIME_INSTANT);
		createEAttribute(timeInstantEClass, TIME_INSTANT__VALUE);
		createEAttribute(timeInstantEClass, TIME_INSTANT__UNIT);
		createEAttribute(timeInstantEClass, TIME_INSTANT__OPERATOR);

		unaryProbabilityPropertyEClass = createEClass(UNARY_PROBABILITY_PROPERTY);
		createEReference(unaryProbabilityPropertyEClass, UNARY_PROBABILITY_PROPERTY__STATE_FORMULA);
		createEAttribute(unaryProbabilityPropertyEClass, UNARY_PROBABILITY_PROPERTY__OPERATOR);

		binaryProbabilityPropertyEClass = createEClass(BINARY_PROBABILITY_PROPERTY);
		createEReference(binaryProbabilityPropertyEClass, BINARY_PROBABILITY_PROPERTY__LEFT_OPERAND);
		createEReference(binaryProbabilityPropertyEClass, BINARY_PROBABILITY_PROPERTY__RIGHT_OPERAND);
		createEAttribute(binaryProbabilityPropertyEClass, BINARY_PROBABILITY_PROPERTY__OPERATOR);

		rewardPropertyEClass = createEClass(REWARD_PROPERTY);
		createEReference(rewardPropertyEClass, REWARD_PROPERTY__VARIABLE);
		createEReference(rewardPropertyEClass, REWARD_PROPERTY__TIME_CONSTRAINT);
		createEReference(rewardPropertyEClass, REWARD_PROPERTY__CONCENTRATION_CONSTRAINT);
		createEReference(rewardPropertyEClass, REWARD_PROPERTY__INITIAL_CONDITIONS);

		steadyStatePropertyEClass = createEClass(STEADY_STATE_PROPERTY);
		createEReference(steadyStatePropertyEClass, STEADY_STATE_PROPERTY__STATE_FORMULA);
		createEReference(steadyStatePropertyEClass, STEADY_STATE_PROPERTY__PROBABILITY_CONSTRAINT);
		createEReference(steadyStatePropertyEClass, STEADY_STATE_PROPERTY__INITIAL_CONDITIONS);

		concentrationConstraintEClass = createEClass(CONCENTRATION_CONSTRAINT);
		createEAttribute(concentrationConstraintEClass, CONCENTRATION_CONSTRAINT__OPERATOR);
		createEAttribute(concentrationConstraintEClass, CONCENTRATION_CONSTRAINT__VALUE);
		createEAttribute(concentrationConstraintEClass, CONCENTRATION_CONSTRAINT__UNIT);

		iStateFormulaEClass = createEClass(ISTATE_FORMULA);

		binaryStateFormulaEClass = createEClass(BINARY_STATE_FORMULA);
		createEReference(binaryStateFormulaEClass, BINARY_STATE_FORMULA__LEFT_OPERAND);
		createEReference(binaryStateFormulaEClass, BINARY_STATE_FORMULA__RIGHT_OPERAND);
		createEAttribute(binaryStateFormulaEClass, BINARY_STATE_FORMULA__OPERATOR);

		notStateFormulaEClass = createEClass(NOT_STATE_FORMULA);
		createEReference(notStateFormulaEClass, NOT_STATE_FORMULA__NEGATED_OPERAND);

		regionEClass = createEClass(REGION);
		createEAttribute(regionEClass, REGION__DISPLAY_NAME);
		createEReference(regionEClass, REGION__KINETICS);
		createEReference(regionEClass, REGION__RULE_LIST);
		createEReference(regionEClass, REGION__MOLECULE_LIST);
		createEAttribute(regionEClass, REGION__ID);
		createEReference(regionEClass, REGION__CELL_LIST);
		createEReference(regionEClass, REGION__VARIABLE_ASSIGNMENT_LIST);

		emfVariableAssignmentEClass = createEClass(EMF_VARIABLE_ASSIGNMENT);
		createEAttribute(emfVariableAssignmentEClass, EMF_VARIABLE_ASSIGNMENT__VARIABLE_NAME);
		createEAttribute(emfVariableAssignmentEClass, EMF_VARIABLE_ASSIGNMENT__VARIABLE_ATTRIBUTE);
		createEAttribute(emfVariableAssignmentEClass, EMF_VARIABLE_ASSIGNMENT__UNIT);
		createEAttribute(emfVariableAssignmentEClass, EMF_VARIABLE_ASSIGNMENT__AMOUNT);

		flatModelEClass = createEClass(FLAT_MODEL);
		createEReference(flatModelEClass, FLAT_MODEL__MOLECULE_LIST);
		createEReference(flatModelEClass, FLAT_MODEL__RULE_LIST);

		propertyInitialConditionEClass = createEClass(PROPERTY_INITIAL_CONDITION);
		createEReference(propertyInitialConditionEClass, PROPERTY_INITIAL_CONDITION__VARIABLE);
		createEAttribute(propertyInitialConditionEClass, PROPERTY_INITIAL_CONDITION__UNIT);
		createEAttribute(propertyInitialConditionEClass, PROPERTY_INITIAL_CONDITION__AMOUNT);

		atgcDirectionEClass = createEClass(ATGC_DIRECTION);
		createEAttribute(atgcDirectionEClass, ATGC_DIRECTION__DIRECTION);

		atgcArrangeEClass = createEClass(ATGC_ARRANGE);
		createEReference(atgcArrangeEClass, ATGC_ARRANGE__PART_LIST);

		atgcCloningSitesEClass = createEClass(ATGC_CLONING_SITES);
		createEAttribute(atgcCloningSitesEClass, ATGC_CLONING_SITES__CLONING_SITES);

		flatModelPropertyPairEClass = createEClass(FLAT_MODEL_PROPERTY_PAIR);
		createEReference(flatModelPropertyPairEClass, FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL);
		createEReference(flatModelPropertyPairEClass, FLAT_MODEL_PROPERTY_PAIR__PROPERTY);

		iArithmeticExpressionEClass = createEClass(IARITHMETIC_EXPRESSION);

		iArithmeticOperandEClass = createEClass(IARITHMETIC_OPERAND);

		binaryArithmeticExpressionEClass = createEClass(BINARY_ARITHMETIC_EXPRESSION);
		createEReference(binaryArithmeticExpressionEClass, BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND);
		createEReference(binaryArithmeticExpressionEClass, BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND);
		createEAttribute(binaryArithmeticExpressionEClass, BINARY_ARITHMETIC_EXPRESSION__OPERATOR);

		numericLiteralEClass = createEClass(NUMERIC_LITERAL);
		createEAttribute(numericLiteralEClass, NUMERIC_LITERAL__VALUE);

		variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
		createEAttribute(variableReferenceEClass, VARIABLE_REFERENCE__NAME);
		createEAttribute(variableReferenceEClass, VARIABLE_REFERENCE__IS_MAXIMUM_OF_INTEREST);
		createEAttribute(variableReferenceEClass, VARIABLE_REFERENCE__CONTAINER_NAME);

		monotonicityExpressionEClass = createEClass(MONOTONICITY_EXPRESSION);
		createEReference(monotonicityExpressionEClass, MONOTONICITY_EXPRESSION__VARIABLE);
		createEAttribute(monotonicityExpressionEClass, MONOTONICITY_EXPRESSION__TYPE);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__LEFT_OPERAND);
		createEReference(relationalExpressionEClass, RELATIONAL_EXPRESSION__RIGHT_OPERAND);
		createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__OPERATOR);

		concentrationQuantityEClass = createEClass(CONCENTRATION_QUANTITY);
		createEAttribute(concentrationQuantityEClass, CONCENTRATION_QUANTITY__AMOUNT);
		createEAttribute(concentrationQuantityEClass, CONCENTRATION_QUANTITY__UNIT);

		// Create enums
		timeUnitEEnum = createEEnum(TIME_UNIT);
		temporalPatternEEnum = createEEnum(TEMPORAL_PATTERN);
		relationalOperatorEEnum = createEEnum(RELATIONAL_OPERATOR);
		booleanOperatorEEnum = createEEnum(BOOLEAN_OPERATOR);
		concentrationUnitEEnum = createEEnum(CONCENTRATION_UNIT);
		rateUnitEEnum = createEEnum(RATE_UNIT);
		arithmeticOperatorEEnum = createEEnum(ARITHMETIC_OPERATOR);
		monotonicityTypeEEnum = createEEnum(MONOTONICITY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter iVisitorEClass_TResult = addETypeParameter(iVisitorEClass, "TResult");

		// Set bounds for type parameters

		// Add supertypes to classes
		modelEClass.getESuperTypes().add(this.getIVisitable());
		kineticsEClass.getESuperTypes().add(this.getIVisitable());
		ruleEClass.getESuperTypes().add(this.getIVisitable());
		molecularSpeciesEClass.getESuperTypes().add(this.getIVisitable());
		deviceEClass.getESuperTypes().add(this.getIVisitable());
		cellEClass.getESuperTypes().add(this.getIVisitable());
		atgcDirectiveEClass.getESuperTypes().add(this.getIVisitable());
		systemEClass.getESuperTypes().add(this.getIVisitable());
		chromosomeEClass.getESuperTypes().add(this.getIVisitable());
		plasmidEClass.getESuperTypes().add(this.getIVisitable());
		iPropertyEClass.getESuperTypes().add(this.getIVisitable());
		probabilityPropertyEClass.getESuperTypes().add(this.getIProperty());
		iProbabilityConstraintEClass.getESuperTypes().add(this.getIVisitable());
		concreteProbabilityConstraintEClass.getESuperTypes().add(this.getIProbabilityConstraint());
		unknownProbabilityConstraintEClass.getESuperTypes().add(this.getIProbabilityConstraint());
		iTimeConstraintEClass.getESuperTypes().add(this.getIVisitable());
		timeIntervalEClass.getESuperTypes().add(this.getITimeConstraint());
		timeInstantEClass.getESuperTypes().add(this.getITimeConstraint());
		unaryProbabilityPropertyEClass.getESuperTypes().add(this.getProbabilityProperty());
		binaryProbabilityPropertyEClass.getESuperTypes().add(this.getProbabilityProperty());
		rewardPropertyEClass.getESuperTypes().add(this.getIProperty());
		steadyStatePropertyEClass.getESuperTypes().add(this.getIProperty());
		concentrationConstraintEClass.getESuperTypes().add(this.getIVisitable());
		iStateFormulaEClass.getESuperTypes().add(this.getIVisitable());
		binaryStateFormulaEClass.getESuperTypes().add(this.getIStateFormula());
		notStateFormulaEClass.getESuperTypes().add(this.getIStateFormula());
		regionEClass.getESuperTypes().add(this.getIVisitable());
		emfVariableAssignmentEClass.getESuperTypes().add(this.getIVisitable());
		flatModelEClass.getESuperTypes().add(this.getIVisitable());
		propertyInitialConditionEClass.getESuperTypes().add(this.getIVisitable());
		atgcDirectionEClass.getESuperTypes().add(this.getATGCDirective());
		atgcArrangeEClass.getESuperTypes().add(this.getATGCDirective());
		atgcCloningSitesEClass.getESuperTypes().add(this.getATGCDirective());
		iArithmeticExpressionEClass.getESuperTypes().add(this.getIArithmeticOperand());
		iArithmeticOperandEClass.getESuperTypes().add(this.getIVisitable());
		binaryArithmeticExpressionEClass.getESuperTypes().add(this.getIArithmeticExpression());
		numericLiteralEClass.getESuperTypes().add(this.getIArithmeticOperand());
		variableReferenceEClass.getESuperTypes().add(this.getIArithmeticOperand());
		monotonicityExpressionEClass.getESuperTypes().add(this.getIStateFormula());
		relationalExpressionEClass.getESuperTypes().add(this.getIStateFormula());
		concentrationQuantityEClass.getESuperTypes().add(this.getIArithmeticOperand());

		// Initialize classes and features; add operations and parameters
		initEClass(iVisitableEClass, IVisitable.class, "IVisitable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(iVisitableEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "TResult");
		EGenericType g1 = createEGenericType(this.getIVisitor());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(iVisitorEClass, IVisitor.class, "IVisitor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnaryProbabilityProperty(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinaryProbabilityProperty(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRewardProperty(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConcentrationQuantity(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotStateFormula(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinaryStateFormula(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConcreteProbabilityConstraint(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUnknownProbabilityConstraint(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeInterval(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeInstant(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEMFVariableAssignment(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConcentrationConstraint(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSteadyStateProperty(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getKinetics(), "kinetics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRule(), "rule", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMolecularSpecies(), "molecularSpecies", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDevice(), "device", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCell(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getATGCDirective(), "atgc", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSystem(), "system", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChromosome(), "chromosome", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPlasmid(), "plasmid", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFlatModel(), "flatModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRegion(), "region", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyInitialCondition(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBinaryArithmeticExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNumericLiteral(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableReference(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMonotonicityExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		op = addEOperation(iVisitorEClass, null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelationalExpression(), "expression", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(iVisitorEClass_TResult);
		initEOperation(op, g1);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ProcessList(), this.getKinetics(), null, "processList", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_CellList(), this.getCell(), null, "cellList", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_RuleList(), this.getRule(), null, "ruleList", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_DeviceList(), this.getDevice(), null, "deviceList", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_MoleculeList(), this.getMolecularSpecies(), null, "moleculeList", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ATGCcommandList(), this.getATGCDirective(), null, "ATGCcommandList", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_RegionList(), this.getRegion(), null, "regionList", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kineticsEClass, Kinetics.class, "Kinetics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKinetics_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Kinetics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinetics_RuleList(), this.getRule(), null, "ruleList", null, 0, -1, Kinetics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinetics_MoleculeList(), this.getMolecularSpecies(), null, "MoleculeList", null, 0, -1, Kinetics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinetics_OutputList(), this.getMolecularSpecies(), null, "outputList", null, 0, -1, Kinetics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKinetics_OptionList(), this.getMolecularSpecies(), null, "optionList", null, 0, -1, Kinetics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKinetics_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Kinetics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_IsBidirectional(), ecorePackage.getEBoolean(), "isBidirectional", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_ForwardRate(), ecorePackage.getEDoubleObject(), "forwardRate", "0", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_ReverseRate(), ecorePackage.getEDoubleObject(), "reverseRate", "0", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_LeftHandSide(), this.getMolecularSpecies(), null, "leftHandSide", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RightHandSide(), this.getMolecularSpecies(), null, "rightHandSide", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_ID(), ecorePackage.getEString(), "ID", "", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_ForwardRateUnit(), this.getRateUnit(), "forwardRateUnit", "PER_SECOND", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_ReverseRateUnit(), this.getRateUnit(), "reverseRateUnit", "PER_SECOND", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(molecularSpeciesEClass, MolecularSpecies.class, "MolecularSpecies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMolecularSpecies_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_URI(), ecorePackage.getEString(), "URI", null, 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_Amount(), ecorePackage.getEDouble(), "amount", "0", 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_Unit(), this.getConcentrationUnit(), "unit", null, 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_DegradationRate(), ecorePackage.getEDoubleObject(), "degradationRate", "0.0", 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_BindingRate(), ecorePackage.getEDoubleObject(), "bindingRate", "0.0", 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_UnbindingRate(), ecorePackage.getEDoubleObject(), "unbindingRate", "0.0", 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_BiologicalType(), ecorePackage.getEString(), "biologicalType", null, 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_Sequence(), ecorePackage.getEString(), "sequence", null, 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_DegradationRateUnit(), this.getRateUnit(), "degradationRateUnit", "PER_SECOND", 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_BindingRateUnit(), this.getRateUnit(), "bindingRateUnit", "PER_SECOND", 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_UnbindingRateUnit(), this.getRateUnit(), "unbindingRateUnit", "PER_SECOND", 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMolecularSpecies_ID(), ecorePackage.getEString(), "ID", null, 0, 1, MolecularSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_ProcessList(), this.getKinetics(), null, "processList", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_RuleList(), this.getRule(), null, "ruleList", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_PartList(), this.getMolecularSpecies(), null, "partList", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_ATGCCommandList(), this.getATGCDirective(), null, "ATGCCommandList", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Kinetics(), this.getKinetics(), null, "kinetics", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_MoleculeList(), this.getMolecularSpecies(), null, "moleculeList", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_OutputList(), this.getMolecularSpecies(), null, "outputList", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_InputList(), this.getMolecularSpecies(), null, "inputList", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_VariableAssignmentList(), this.getEMFVariableAssignment(), null, "variableAssignmentList", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Properties(), this.getIProperty(), null, "properties", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCell_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCell_DeviceList(), this.getDevice(), null, "deviceList", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCell_Kinetics(), this.getKinetics(), null, "Kinetics", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCell_RuleList(), this.getRule(), null, "ruleList", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCell_MoleculeList(), this.getMolecularSpecies(), null, "moleculeList", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCell_ATGCCommandList(), this.getATGCDirective(), null, "ATGCCommandList", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCell_VariableAssignmentList(), this.getEMFVariableAssignment(), null, "variableAssignmentList", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCell_Properties(), this.getIProperty(), null, "properties", null, 0, -1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atgcDirectiveEClass, ATGCDirective.class, "ATGCDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, roadblock.emf.ibl.Ibl.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chromosomeEClass, Chromosome.class, "Chromosome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plasmidEClass, Plasmid.class, "Plasmid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iPropertyEClass, IProperty.class, "IProperty", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(probabilityPropertyEClass, ProbabilityProperty.class, "ProbabilityProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbabilityProperty_TimeConstraint(), this.getITimeConstraint(), null, "timeConstraint", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbabilityProperty_ProbabilityConstraint(), this.getIProbabilityConstraint(), null, "probabilityConstraint", null, 0, 1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProbabilityProperty_InitialConditions(), this.getPropertyInitialCondition(), null, "initialConditions", null, 0, -1, ProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(probabilityPropertyEClass, null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "TResult");
		g1 = createEGenericType(this.getIVisitor());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEClass(iProbabilityConstraintEClass, IProbabilityConstraint.class, "IProbabilityConstraint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concreteProbabilityConstraintEClass, ConcreteProbabilityConstraint.class, "ConcreteProbabilityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteProbabilityConstraint_Operator(), this.getRelationalOperator(), "operator", null, 0, 1, ConcreteProbabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteProbabilityConstraint_Bound(), ecorePackage.getEDouble(), "bound", null, 0, 1, ConcreteProbabilityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownProbabilityConstraintEClass, UnknownProbabilityConstraint.class, "UnknownProbabilityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iTimeConstraintEClass, ITimeConstraint.class, "ITimeConstraint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeInterval_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInterval_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInterval_Unit(), this.getTimeUnit(), "unit", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeInstantEClass, TimeInstant.class, "TimeInstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeInstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, TimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInstant_Unit(), this.getTimeUnit(), "unit", null, 0, 1, TimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInstant_Operator(), this.getRelationalOperator(), "operator", null, 0, 1, TimeInstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryProbabilityPropertyEClass, UnaryProbabilityProperty.class, "UnaryProbabilityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryProbabilityProperty_StateFormula(), this.getIStateFormula(), null, "stateFormula", null, 0, 1, UnaryProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryProbabilityProperty_Operator(), this.getTemporalPattern(), "operator", null, 0, 1, UnaryProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryProbabilityPropertyEClass, BinaryProbabilityProperty.class, "BinaryProbabilityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryProbabilityProperty_LeftOperand(), this.getIStateFormula(), null, "leftOperand", null, 0, 1, BinaryProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryProbabilityProperty_RightOperand(), this.getIStateFormula(), null, "rightOperand", null, 0, 1, BinaryProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryProbabilityProperty_Operator(), this.getTemporalPattern(), "operator", null, 0, 1, BinaryProbabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rewardPropertyEClass, RewardProperty.class, "RewardProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRewardProperty_Variable(), this.getVariableReference(), null, "variable", null, 0, 1, RewardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRewardProperty_TimeConstraint(), this.getTimeInstant(), null, "timeConstraint", null, 0, 1, RewardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRewardProperty_ConcentrationConstraint(), this.getConcentrationConstraint(), null, "concentrationConstraint", null, 0, 1, RewardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRewardProperty_InitialConditions(), this.getPropertyInitialCondition(), null, "initialConditions", null, 0, -1, RewardProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(steadyStatePropertyEClass, SteadyStateProperty.class, "SteadyStateProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSteadyStateProperty_StateFormula(), this.getIStateFormula(), null, "StateFormula", null, 0, 1, SteadyStateProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteadyStateProperty_ProbabilityConstraint(), this.getIProbabilityConstraint(), null, "probabilityConstraint", null, 0, 1, SteadyStateProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSteadyStateProperty_InitialConditions(), this.getPropertyInitialCondition(), null, "initialConditions", null, 0, -1, SteadyStateProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concentrationConstraintEClass, ConcentrationConstraint.class, "ConcentrationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcentrationConstraint_Operator(), this.getRelationalOperator(), "operator", null, 0, 1, ConcentrationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcentrationConstraint_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, ConcentrationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcentrationConstraint_Unit(), this.getConcentrationUnit(), "unit", null, 0, 1, ConcentrationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iStateFormulaEClass, IStateFormula.class, "IStateFormula", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryStateFormulaEClass, BinaryStateFormula.class, "BinaryStateFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryStateFormula_LeftOperand(), this.getIStateFormula(), null, "leftOperand", null, 0, 1, BinaryStateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryStateFormula_RightOperand(), this.getIStateFormula(), null, "rightOperand", null, 0, 1, BinaryStateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryStateFormula_Operator(), this.getBooleanOperator(), "operator", null, 0, 1, BinaryStateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notStateFormulaEClass, NotStateFormula.class, "NotStateFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotStateFormula_NegatedOperand(), this.getIStateFormula(), null, "negatedOperand", null, 0, 1, NotStateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegion_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_Kinetics(), this.getKinetics(), null, "Kinetics", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_RuleList(), this.getRule(), null, "ruleList", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_MoleculeList(), this.getMolecularSpecies(), null, "moleculeList", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegion_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_CellList(), this.getCell(), null, "cellList", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_VariableAssignmentList(), this.getEMFVariableAssignment(), null, "variableAssignmentList", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfVariableAssignmentEClass, EMFVariableAssignment.class, "EMFVariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMFVariableAssignment_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, EMFVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFVariableAssignment_VariableAttribute(), ecorePackage.getEString(), "variableAttribute", null, 0, 1, EMFVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFVariableAssignment_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, EMFVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMFVariableAssignment_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, EMFVariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flatModelEClass, FlatModel.class, "FlatModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlatModel_MoleculeList(), this.getMolecularSpecies(), null, "moleculeList", null, 0, -1, FlatModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlatModel_RuleList(), this.getRule(), null, "ruleList", null, 0, -1, FlatModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyInitialConditionEClass, PropertyInitialCondition.class, "PropertyInitialCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyInitialCondition_Variable(), this.getVariableReference(), null, "variable", null, 0, 1, PropertyInitialCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyInitialCondition_Unit(), this.getConcentrationUnit(), "unit", null, 0, 1, PropertyInitialCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyInitialCondition_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, PropertyInitialCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atgcDirectionEClass, ATGCDirection.class, "ATGCDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATGCDirection_Direction(), ecorePackage.getEString(), "direction", null, 0, 1, ATGCDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atgcArrangeEClass, ATGCArrange.class, "ATGCArrange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATGCArrange_PartList(), this.getMolecularSpecies(), null, "partList", null, 0, -1, ATGCArrange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atgcCloningSitesEClass, ATGCCloningSites.class, "ATGCCloningSites", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATGCCloningSites_CloningSites(), ecorePackage.getEInt(), "cloningSites", null, 0, 1, ATGCCloningSites.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flatModelPropertyPairEClass, FlatModelPropertyPair.class, "FlatModelPropertyPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlatModelPropertyPair_FlatModel(), this.getFlatModel(), null, "flatModel", null, 0, 1, FlatModelPropertyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlatModelPropertyPair_Property(), this.getIProperty(), null, "property", null, 0, 1, FlatModelPropertyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iArithmeticExpressionEClass, IArithmeticExpression.class, "IArithmeticExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iArithmeticOperandEClass, IArithmeticOperand.class, "IArithmeticOperand", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryArithmeticExpressionEClass, BinaryArithmeticExpression.class, "BinaryArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryArithmeticExpression_LeftOperand(), this.getIArithmeticOperand(), null, "leftOperand", null, 0, 1, BinaryArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryArithmeticExpression_RightOperand(), this.getIArithmeticOperand(), null, "rightOperand", null, 0, 1, BinaryArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryArithmeticExpression_Operator(), this.getArithmeticOperator(), "operator", null, 0, 1, BinaryArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericLiteral_Value(), ecorePackage.getEDouble(), "value", "0", 0, 1, NumericLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableReference_Name(), ecorePackage.getEString(), "name", "", 0, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableReference_IsMaximumOfInterest(), ecorePackage.getEBoolean(), "isMaximumOfInterest", "false", 0, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableReference_ContainerName(), ecorePackage.getEString(), "containerName", "", 0, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monotonicityExpressionEClass, MonotonicityExpression.class, "MonotonicityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonotonicityExpression_Variable(), this.getVariableReference(), null, "variable", null, 0, 1, MonotonicityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonotonicityExpression_Type(), this.getMonotonicityType(), "type", null, 0, 1, MonotonicityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalExpression_LeftOperand(), this.getIArithmeticOperand(), null, "leftOperand", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalExpression_RightOperand(), this.getIArithmeticOperand(), null, "rightOperand", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalExpression_Operator(), this.getRelationalOperator(), "operator", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concentrationQuantityEClass, ConcentrationQuantity.class, "ConcentrationQuantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcentrationQuantity_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, ConcentrationQuantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcentrationQuantity_Unit(), this.getConcentrationUnit(), "unit", null, 0, 1, ConcentrationQuantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.SECOND);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MINUTE);

		initEEnum(temporalPatternEEnum, TemporalPattern.class, "TemporalPattern");
		addEEnumLiteral(temporalPatternEEnum, TemporalPattern.UNTIL);
		addEEnumLiteral(temporalPatternEEnum, TemporalPattern.FOLLOWED_BY);
		addEEnumLiteral(temporalPatternEEnum, TemporalPattern.EVENTUALLY);
		addEEnumLiteral(temporalPatternEEnum, TemporalPattern.STEADY_STATE);
		addEEnumLiteral(temporalPatternEEnum, TemporalPattern.NEVER);
		addEEnumLiteral(temporalPatternEEnum, TemporalPattern.INFINITELY_OFTEN);
		addEEnumLiteral(temporalPatternEEnum, TemporalPattern.ALWAYS);

		initEEnum(relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GT);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GE);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LT);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LE);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.EQ);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.NE);

		initEEnum(booleanOperatorEEnum, BooleanOperator.class, "BooleanOperator");
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.AND);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.OR);
		addEEnumLiteral(booleanOperatorEEnum, BooleanOperator.IMPLIES);

		initEEnum(concentrationUnitEEnum, ConcentrationUnit.class, "ConcentrationUnit");
		addEEnumLiteral(concentrationUnitEEnum, ConcentrationUnit.M);
		addEEnumLiteral(concentrationUnitEEnum, ConcentrationUnit.MM);
		addEEnumLiteral(concentrationUnitEEnum, ConcentrationUnit.UM);
		addEEnumLiteral(concentrationUnitEEnum, ConcentrationUnit.NM);
		addEEnumLiteral(concentrationUnitEEnum, ConcentrationUnit.PM);
		addEEnumLiteral(concentrationUnitEEnum, ConcentrationUnit.FM);
		addEEnumLiteral(concentrationUnitEEnum, ConcentrationUnit.MOLECULE);

		initEEnum(rateUnitEEnum, RateUnit.class, "RateUnit");
		addEEnumLiteral(rateUnitEEnum, RateUnit.PER_SECOND);
		addEEnumLiteral(rateUnitEEnum, RateUnit.PER_MINUTE);

		initEEnum(arithmeticOperatorEEnum, ArithmeticOperator.class, "ArithmeticOperator");
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.ADDITION);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.SUBTRACTION);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.MULTIPLICATION);
		addEEnumLiteral(arithmeticOperatorEEnum, ArithmeticOperator.DIVISION);

		initEEnum(monotonicityTypeEEnum, MonotonicityType.class, "MonotonicityType");
		addEEnumLiteral(monotonicityTypeEEnum, MonotonicityType.INCREASING);
		addEEnumLiteral(monotonicityTypeEEnum, MonotonicityType.DECREASING);

		// Create resource
		createResource(eNS_URI);
	}

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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.Model <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.Model
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getModel()
		 * @generated
		 */
		public static final EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MODEL__DISPLAY_NAME = eINSTANCE.getModel_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Process List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MODEL__PROCESS_LIST = eINSTANCE.getModel_ProcessList();

		/**
		 * The meta object literal for the '<em><b>Cell List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MODEL__CELL_LIST = eINSTANCE.getModel_CellList();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MODEL__RULE_LIST = eINSTANCE.getModel_RuleList();

		/**
		 * The meta object literal for the '<em><b>Device List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MODEL__DEVICE_LIST = eINSTANCE.getModel_DeviceList();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MODEL__MOLECULE_LIST = eINSTANCE.getModel_MoleculeList();

		/**
		 * The meta object literal for the '<em><b>ATG Ccommand List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MODEL__ATG_CCOMMAND_LIST = eINSTANCE.getModel_ATGCcommandList();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MODEL__ID = eINSTANCE.getModel_ID();

		/**
		 * The meta object literal for the '<em><b>Region List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MODEL__REGION_LIST = eINSTANCE.getModel_RegionList();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.Kinetics <em>Kinetics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.Kinetics
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getKinetics()
		 * @generated
		 */
		public static final EClass KINETICS = eINSTANCE.getKinetics();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute KINETICS__DISPLAY_NAME = eINSTANCE.getKinetics_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference KINETICS__RULE_LIST = eINSTANCE.getKinetics_RuleList();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference KINETICS__MOLECULE_LIST = eINSTANCE.getKinetics_MoleculeList();

		/**
		 * The meta object literal for the '<em><b>Output List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference KINETICS__OUTPUT_LIST = eINSTANCE.getKinetics_OutputList();

		/**
		 * The meta object literal for the '<em><b>Option List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference KINETICS__OPTION_LIST = eINSTANCE.getKinetics_OptionList();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute KINETICS__ID = eINSTANCE.getKinetics_ID();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.Rule <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.Rule
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getRule()
		 * @generated
		 */
		public static final EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RULE__DISPLAY_NAME = eINSTANCE.getRule_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Is Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RULE__IS_BIDIRECTIONAL = eINSTANCE.getRule_IsBidirectional();

		/**
		 * The meta object literal for the '<em><b>Forward Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RULE__FORWARD_RATE = eINSTANCE.getRule_ForwardRate();

		/**
		 * The meta object literal for the '<em><b>Reverse Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RULE__REVERSE_RATE = eINSTANCE.getRule_ReverseRate();

		/**
		 * The meta object literal for the '<em><b>Left Hand Side</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RULE__LEFT_HAND_SIDE = eINSTANCE.getRule_LeftHandSide();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RULE__RIGHT_HAND_SIDE = eINSTANCE.getRule_RightHandSide();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RULE__ID = eINSTANCE.getRule_ID();

		/**
		 * The meta object literal for the '<em><b>Forward Rate Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RULE__FORWARD_RATE_UNIT = eINSTANCE.getRule_ForwardRateUnit();

		/**
		 * The meta object literal for the '<em><b>Reverse Rate Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RULE__REVERSE_RATE_UNIT = eINSTANCE.getRule_ReverseRateUnit();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.MolecularSpecies <em>Molecular Species</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.MolecularSpecies
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getMolecularSpecies()
		 * @generated
		 */
		public static final EClass MOLECULAR_SPECIES = eINSTANCE.getMolecularSpecies();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__DISPLAY_NAME = eINSTANCE.getMolecularSpecies_DisplayName();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__URI = eINSTANCE.getMolecularSpecies_URI();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__AMOUNT = eINSTANCE.getMolecularSpecies_Amount();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__UNIT = eINSTANCE.getMolecularSpecies_Unit();

		/**
		 * The meta object literal for the '<em><b>Degradation Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__DEGRADATION_RATE = eINSTANCE.getMolecularSpecies_DegradationRate();

		/**
		 * The meta object literal for the '<em><b>Binding Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__BINDING_RATE = eINSTANCE.getMolecularSpecies_BindingRate();

		/**
		 * The meta object literal for the '<em><b>Unbinding Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__UNBINDING_RATE = eINSTANCE.getMolecularSpecies_UnbindingRate();

		/**
		 * The meta object literal for the '<em><b>Biological Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__BIOLOGICAL_TYPE = eINSTANCE.getMolecularSpecies_BiologicalType();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__SEQUENCE = eINSTANCE.getMolecularSpecies_Sequence();

		/**
		 * The meta object literal for the '<em><b>Degradation Rate Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__DEGRADATION_RATE_UNIT = eINSTANCE.getMolecularSpecies_DegradationRateUnit();

		/**
		 * The meta object literal for the '<em><b>Binding Rate Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__BINDING_RATE_UNIT = eINSTANCE.getMolecularSpecies_BindingRateUnit();

		/**
		 * The meta object literal for the '<em><b>Unbinding Rate Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__UNBINDING_RATE_UNIT = eINSTANCE.getMolecularSpecies_UnbindingRateUnit();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MOLECULAR_SPECIES__ID = eINSTANCE.getMolecularSpecies_ID();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.Device <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.Device
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getDevice()
		 * @generated
		 */
		public static final EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DEVICE__DISPLAY_NAME = eINSTANCE.getDevice_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Process List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__PROCESS_LIST = eINSTANCE.getDevice_ProcessList();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__RULE_LIST = eINSTANCE.getDevice_RuleList();

		/**
		 * The meta object literal for the '<em><b>Part List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__PART_LIST = eINSTANCE.getDevice_PartList();

		/**
		 * The meta object literal for the '<em><b>ATGC Command List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__ATGC_COMMAND_LIST = eINSTANCE.getDevice_ATGCCommandList();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DEVICE__ID = eINSTANCE.getDevice_ID();

		/**
		 * The meta object literal for the '<em><b>Kinetics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__KINETICS = eINSTANCE.getDevice_Kinetics();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__MOLECULE_LIST = eINSTANCE.getDevice_MoleculeList();

		/**
		 * The meta object literal for the '<em><b>Output List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__OUTPUT_LIST = eINSTANCE.getDevice_OutputList();

		/**
		 * The meta object literal for the '<em><b>Input List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__INPUT_LIST = eINSTANCE.getDevice_InputList();

		/**
		 * The meta object literal for the '<em><b>Variable Assignment List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__VARIABLE_ASSIGNMENT_LIST = eINSTANCE.getDevice_VariableAssignmentList();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DEVICE__PROPERTIES = eINSTANCE.getDevice_Properties();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.Cell <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.Cell
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getCell()
		 * @generated
		 */
		public static final EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CELL__DISPLAY_NAME = eINSTANCE.getCell_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Device List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CELL__DEVICE_LIST = eINSTANCE.getCell_DeviceList();

		/**
		 * The meta object literal for the '<em><b>Kinetics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CELL__KINETICS = eINSTANCE.getCell_Kinetics();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CELL__RULE_LIST = eINSTANCE.getCell_RuleList();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CELL__MOLECULE_LIST = eINSTANCE.getCell_MoleculeList();

		/**
		 * The meta object literal for the '<em><b>ATGC Command List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CELL__ATGC_COMMAND_LIST = eINSTANCE.getCell_ATGCCommandList();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CELL__ID = eINSTANCE.getCell_ID();

		/**
		 * The meta object literal for the '<em><b>Variable Assignment List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CELL__VARIABLE_ASSIGNMENT_LIST = eINSTANCE.getCell_VariableAssignmentList();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CELL__PROPERTIES = eINSTANCE.getCell_Properties();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ATGCDirective <em>ATGC Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ATGCDirective
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCDirective()
		 * @generated
		 */
		public static final EClass ATGC_DIRECTIVE = eINSTANCE.getATGCDirective();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.System <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.System
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getSystem()
		 * @generated
		 */
		public static final EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.Chromosome <em>Chromosome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.Chromosome
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getChromosome()
		 * @generated
		 */
		public static final EClass CHROMOSOME = eINSTANCE.getChromosome();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.Plasmid <em>Plasmid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.Plasmid
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getPlasmid()
		 * @generated
		 */
		public static final EClass PLASMID = eINSTANCE.getPlasmid();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.IVisitable <em>IVisitable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.IVisitable
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getIVisitable()
		 * @generated
		 */
		public static final EClass IVISITABLE = eINSTANCE.getIVisitable();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.IVisitor <em>IVisitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.IVisitor
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getIVisitor()
		 * @generated
		 */
		public static final EClass IVISITOR = eINSTANCE.getIVisitor();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.IProperty <em>IProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.IProperty
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getIProperty()
		 * @generated
		 */
		public static final EClass IPROPERTY = eINSTANCE.getIProperty();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ProbabilityProperty <em>Probability Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ProbabilityProperty
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getProbabilityProperty()
		 * @generated
		 */
		public static final EClass PROBABILITY_PROPERTY = eINSTANCE.getProbabilityProperty();

		/**
		 * The meta object literal for the '<em><b>Time Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROBABILITY_PROPERTY__TIME_CONSTRAINT = eINSTANCE.getProbabilityProperty_TimeConstraint();

		/**
		 * The meta object literal for the '<em><b>Probability Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROBABILITY_PROPERTY__PROBABILITY_CONSTRAINT = eINSTANCE.getProbabilityProperty_ProbabilityConstraint();

		/**
		 * The meta object literal for the '<em><b>Initial Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROBABILITY_PROPERTY__INITIAL_CONDITIONS = eINSTANCE.getProbabilityProperty_InitialConditions();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.IProbabilityConstraint <em>IProbability Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.IProbabilityConstraint
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getIProbabilityConstraint()
		 * @generated
		 */
		public static final EClass IPROBABILITY_CONSTRAINT = eINSTANCE.getIProbabilityConstraint();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint <em>Concrete Probability Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcreteProbabilityConstraint()
		 * @generated
		 */
		public static final EClass CONCRETE_PROBABILITY_CONSTRAINT = eINSTANCE.getConcreteProbabilityConstraint();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONCRETE_PROBABILITY_CONSTRAINT__OPERATOR = eINSTANCE.getConcreteProbabilityConstraint_Operator();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONCRETE_PROBABILITY_CONSTRAINT__BOUND = eINSTANCE.getConcreteProbabilityConstraint_Bound();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint <em>Unknown Probability Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getUnknownProbabilityConstraint()
		 * @generated
		 */
		public static final EClass UNKNOWN_PROBABILITY_CONSTRAINT = eINSTANCE.getUnknownProbabilityConstraint();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ITimeConstraint <em>ITime Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ITimeConstraint
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getITimeConstraint()
		 * @generated
		 */
		public static final EClass ITIME_CONSTRAINT = eINSTANCE.getITimeConstraint();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.TimeInterval <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.TimeInterval
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getTimeInterval()
		 * @generated
		 */
		public static final EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_INTERVAL__LOWER_BOUND = eINSTANCE.getTimeInterval_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_INTERVAL__UPPER_BOUND = eINSTANCE.getTimeInterval_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_INTERVAL__UNIT = eINSTANCE.getTimeInterval_Unit();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.TimeInstant <em>Time Instant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.TimeInstant
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getTimeInstant()
		 * @generated
		 */
		public static final EClass TIME_INSTANT = eINSTANCE.getTimeInstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_INSTANT__VALUE = eINSTANCE.getTimeInstant_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_INSTANT__UNIT = eINSTANCE.getTimeInstant_Unit();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_INSTANT__OPERATOR = eINSTANCE.getTimeInstant_Operator();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty <em>Unary Probability Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.UnaryProbabilityProperty
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getUnaryProbabilityProperty()
		 * @generated
		 */
		public static final EClass UNARY_PROBABILITY_PROPERTY = eINSTANCE.getUnaryProbabilityProperty();

		/**
		 * The meta object literal for the '<em><b>State Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference UNARY_PROBABILITY_PROPERTY__STATE_FORMULA = eINSTANCE.getUnaryProbabilityProperty_StateFormula();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute UNARY_PROBABILITY_PROPERTY__OPERATOR = eINSTANCE.getUnaryProbabilityProperty_Operator();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.BinaryProbabilityProperty <em>Binary Probability Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.BinaryProbabilityProperty
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryProbabilityProperty()
		 * @generated
		 */
		public static final EClass BINARY_PROBABILITY_PROPERTY = eINSTANCE.getBinaryProbabilityProperty();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINARY_PROBABILITY_PROPERTY__LEFT_OPERAND = eINSTANCE.getBinaryProbabilityProperty_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINARY_PROBABILITY_PROPERTY__RIGHT_OPERAND = eINSTANCE.getBinaryProbabilityProperty_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BINARY_PROBABILITY_PROPERTY__OPERATOR = eINSTANCE.getBinaryProbabilityProperty_Operator();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.RewardProperty <em>Reward Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.RewardProperty
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getRewardProperty()
		 * @generated
		 */
		public static final EClass REWARD_PROPERTY = eINSTANCE.getRewardProperty();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REWARD_PROPERTY__VARIABLE = eINSTANCE.getRewardProperty_Variable();

		/**
		 * The meta object literal for the '<em><b>Time Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REWARD_PROPERTY__TIME_CONSTRAINT = eINSTANCE.getRewardProperty_TimeConstraint();

		/**
		 * The meta object literal for the '<em><b>Concentration Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REWARD_PROPERTY__CONCENTRATION_CONSTRAINT = eINSTANCE.getRewardProperty_ConcentrationConstraint();

		/**
		 * The meta object literal for the '<em><b>Initial Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REWARD_PROPERTY__INITIAL_CONDITIONS = eINSTANCE.getRewardProperty_InitialConditions();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.SteadyStateProperty <em>Steady State Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.SteadyStateProperty
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getSteadyStateProperty()
		 * @generated
		 */
		public static final EClass STEADY_STATE_PROPERTY = eINSTANCE.getSteadyStateProperty();

		/**
		 * The meta object literal for the '<em><b>State Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STEADY_STATE_PROPERTY__STATE_FORMULA = eINSTANCE.getSteadyStateProperty_StateFormula();

		/**
		 * The meta object literal for the '<em><b>Probability Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STEADY_STATE_PROPERTY__PROBABILITY_CONSTRAINT = eINSTANCE.getSteadyStateProperty_ProbabilityConstraint();

		/**
		 * The meta object literal for the '<em><b>Initial Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STEADY_STATE_PROPERTY__INITIAL_CONDITIONS = eINSTANCE.getSteadyStateProperty_InitialConditions();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ConcentrationConstraint <em>Concentration Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ConcentrationConstraint
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcentrationConstraint()
		 * @generated
		 */
		public static final EClass CONCENTRATION_CONSTRAINT = eINSTANCE.getConcentrationConstraint();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONCENTRATION_CONSTRAINT__OPERATOR = eINSTANCE.getConcentrationConstraint_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONCENTRATION_CONSTRAINT__VALUE = eINSTANCE.getConcentrationConstraint_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONCENTRATION_CONSTRAINT__UNIT = eINSTANCE.getConcentrationConstraint_Unit();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.IStateFormula <em>IState Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.IStateFormula
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getIStateFormula()
		 * @generated
		 */
		public static final EClass ISTATE_FORMULA = eINSTANCE.getIStateFormula();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula <em>Binary State Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.BinaryStateFormula
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryStateFormula()
		 * @generated
		 */
		public static final EClass BINARY_STATE_FORMULA = eINSTANCE.getBinaryStateFormula();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINARY_STATE_FORMULA__LEFT_OPERAND = eINSTANCE.getBinaryStateFormula_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINARY_STATE_FORMULA__RIGHT_OPERAND = eINSTANCE.getBinaryStateFormula_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BINARY_STATE_FORMULA__OPERATOR = eINSTANCE.getBinaryStateFormula_Operator();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.NotStateFormula <em>Not State Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.NotStateFormula
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getNotStateFormula()
		 * @generated
		 */
		public static final EClass NOT_STATE_FORMULA = eINSTANCE.getNotStateFormula();

		/**
		 * The meta object literal for the '<em><b>Negated Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference NOT_STATE_FORMULA__NEGATED_OPERAND = eINSTANCE.getNotStateFormula_NegatedOperand();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.Region <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.Region
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getRegion()
		 * @generated
		 */
		public static final EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGION__DISPLAY_NAME = eINSTANCE.getRegion_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Kinetics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGION__KINETICS = eINSTANCE.getRegion_Kinetics();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGION__RULE_LIST = eINSTANCE.getRegion_RuleList();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGION__MOLECULE_LIST = eINSTANCE.getRegion_MoleculeList();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REGION__ID = eINSTANCE.getRegion_ID();

		/**
		 * The meta object literal for the '<em><b>Cell List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGION__CELL_LIST = eINSTANCE.getRegion_CellList();

		/**
		 * The meta object literal for the '<em><b>Variable Assignment List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REGION__VARIABLE_ASSIGNMENT_LIST = eINSTANCE.getRegion_VariableAssignmentList();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.EMFVariableAssignment <em>EMF Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.EMFVariableAssignment
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getEMFVariableAssignment()
		 * @generated
		 */
		public static final EClass EMF_VARIABLE_ASSIGNMENT = eINSTANCE.getEMFVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMF_VARIABLE_ASSIGNMENT__VARIABLE_NAME = eINSTANCE.getEMFVariableAssignment_VariableName();

		/**
		 * The meta object literal for the '<em><b>Variable Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMF_VARIABLE_ASSIGNMENT__VARIABLE_ATTRIBUTE = eINSTANCE.getEMFVariableAssignment_VariableAttribute();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMF_VARIABLE_ASSIGNMENT__UNIT = eINSTANCE.getEMFVariableAssignment_Unit();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute EMF_VARIABLE_ASSIGNMENT__AMOUNT = eINSTANCE.getEMFVariableAssignment_Amount();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.FlatModel <em>Flat Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.FlatModel
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getFlatModel()
		 * @generated
		 */
		public static final EClass FLAT_MODEL = eINSTANCE.getFlatModel();

		/**
		 * The meta object literal for the '<em><b>Molecule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FLAT_MODEL__MOLECULE_LIST = eINSTANCE.getFlatModel_MoleculeList();

		/**
		 * The meta object literal for the '<em><b>Rule List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FLAT_MODEL__RULE_LIST = eINSTANCE.getFlatModel_RuleList();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition <em>Property Initial Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.PropertyInitialCondition
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getPropertyInitialCondition()
		 * @generated
		 */
		public static final EClass PROPERTY_INITIAL_CONDITION = eINSTANCE.getPropertyInitialCondition();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROPERTY_INITIAL_CONDITION__VARIABLE = eINSTANCE.getPropertyInitialCondition_Variable();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY_INITIAL_CONDITION__UNIT = eINSTANCE.getPropertyInitialCondition_Unit();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROPERTY_INITIAL_CONDITION__AMOUNT = eINSTANCE.getPropertyInitialCondition_Amount();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ATGCDirection <em>ATGC Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ATGCDirection
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCDirection()
		 * @generated
		 */
		public static final EClass ATGC_DIRECTION = eINSTANCE.getATGCDirection();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATGC_DIRECTION__DIRECTION = eINSTANCE.getATGCDirection_Direction();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ATGCArrange <em>ATGC Arrange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ATGCArrange
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCArrange()
		 * @generated
		 */
		public static final EClass ATGC_ARRANGE = eINSTANCE.getATGCArrange();

		/**
		 * The meta object literal for the '<em><b>Part List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ATGC_ARRANGE__PART_LIST = eINSTANCE.getATGCArrange_PartList();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ATGCCloningSites <em>ATGC Cloning Sites</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ATGCCloningSites
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getATGCCloningSites()
		 * @generated
		 */
		public static final EClass ATGC_CLONING_SITES = eINSTANCE.getATGCCloningSites();

		/**
		 * The meta object literal for the '<em><b>Cloning Sites</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ATGC_CLONING_SITES__CLONING_SITES = eINSTANCE.getATGCCloningSites_CloningSites();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.FlatModelPropertyPair <em>Flat Model Property Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.FlatModelPropertyPair
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getFlatModelPropertyPair()
		 * @generated
		 */
		public static final EClass FLAT_MODEL_PROPERTY_PAIR = eINSTANCE.getFlatModelPropertyPair();

		/**
		 * The meta object literal for the '<em><b>Flat Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FLAT_MODEL_PROPERTY_PAIR__FLAT_MODEL = eINSTANCE.getFlatModelPropertyPair_FlatModel();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FLAT_MODEL_PROPERTY_PAIR__PROPERTY = eINSTANCE.getFlatModelPropertyPair_Property();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.IArithmeticExpression <em>IArithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.IArithmeticExpression
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getIArithmeticExpression()
		 * @generated
		 */
		public static final EClass IARITHMETIC_EXPRESSION = eINSTANCE.getIArithmeticExpression();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.IArithmeticOperand <em>IArithmetic Operand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.IArithmeticOperand
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getIArithmeticOperand()
		 * @generated
		 */
		public static final EClass IARITHMETIC_OPERAND = eINSTANCE.getIArithmeticOperand();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.BinaryArithmeticExpression <em>Binary Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.BinaryArithmeticExpression
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getBinaryArithmeticExpression()
		 * @generated
		 */
		public static final EClass BINARY_ARITHMETIC_EXPRESSION = eINSTANCE.getBinaryArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINARY_ARITHMETIC_EXPRESSION__LEFT_OPERAND = eINSTANCE.getBinaryArithmeticExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BINARY_ARITHMETIC_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getBinaryArithmeticExpression_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BINARY_ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getBinaryArithmeticExpression_Operator();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.NumericLiteral <em>Numeric Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.NumericLiteral
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getNumericLiteral()
		 * @generated
		 */
		public static final EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute NUMERIC_LITERAL__VALUE = eINSTANCE.getNumericLiteral_Value();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.VariableReference <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.VariableReference
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getVariableReference()
		 * @generated
		 */
		public static final EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VARIABLE_REFERENCE__NAME = eINSTANCE.getVariableReference_Name();

		/**
		 * The meta object literal for the '<em><b>Is Maximum Of Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VARIABLE_REFERENCE__IS_MAXIMUM_OF_INTEREST = eINSTANCE.getVariableReference_IsMaximumOfInterest();

		/**
		 * The meta object literal for the '<em><b>Container Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VARIABLE_REFERENCE__CONTAINER_NAME = eINSTANCE.getVariableReference_ContainerName();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.MonotonicityExpression <em>Monotonicity Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.MonotonicityExpression
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getMonotonicityExpression()
		 * @generated
		 */
		public static final EClass MONOTONICITY_EXPRESSION = eINSTANCE.getMonotonicityExpression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference MONOTONICITY_EXPRESSION__VARIABLE = eINSTANCE.getMonotonicityExpression_Variable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MONOTONICITY_EXPRESSION__TYPE = eINSTANCE.getMonotonicityExpression_Type();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.RelationalExpression <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.RelationalExpression
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getRelationalExpression()
		 * @generated
		 */
		public static final EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_EXPRESSION__LEFT_OPERAND = eINSTANCE.getRelationalExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELATIONAL_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getRelationalExpression_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELATIONAL_EXPRESSION__OPERATOR = eINSTANCE.getRelationalExpression_Operator();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ConcentrationQuantity <em>Concentration Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ConcentrationQuantity
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcentrationQuantity()
		 * @generated
		 */
		public static final EClass CONCENTRATION_QUANTITY = eINSTANCE.getConcentrationQuantity();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONCENTRATION_QUANTITY__AMOUNT = eINSTANCE.getConcentrationQuantity_Amount();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONCENTRATION_QUANTITY__UNIT = eINSTANCE.getConcentrationQuantity_Unit();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.TimeUnit
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getTimeUnit()
		 * @generated
		 */
		public static final EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.TemporalPattern <em>Temporal Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.TemporalPattern
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getTemporalPattern()
		 * @generated
		 */
		public static final EEnum TEMPORAL_PATTERN = eINSTANCE.getTemporalPattern();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.RelationalOperator
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getRelationalOperator()
		 * @generated
		 */
		public static final EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.BooleanOperator
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getBooleanOperator()
		 * @generated
		 */
		public static final EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ConcentrationUnit <em>Concentration Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ConcentrationUnit
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcentrationUnit()
		 * @generated
		 */
		public static final EEnum CONCENTRATION_UNIT = eINSTANCE.getConcentrationUnit();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.RateUnit <em>Rate Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.RateUnit
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getRateUnit()
		 * @generated
		 */
		public static final EEnum RATE_UNIT = eINSTANCE.getRateUnit();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.ArithmeticOperator
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getArithmeticOperator()
		 * @generated
		 */
		public static final EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link roadblock.emf.ibl.Ibl.MonotonicityType <em>Monotonicity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see roadblock.emf.ibl.Ibl.MonotonicityType
		 * @see roadblock.emf.ibl.Ibl.IblPackage#getMonotonicityType()
		 * @generated
		 */
		public static final EEnum MONOTONICITY_TYPE = eINSTANCE.getMonotonicityType();

	}

} //IblPackage
