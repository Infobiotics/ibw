/**
 */
package roadblock.emf.ibl.Ibl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Concentration Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see roadblock.emf.ibl.Ibl.IblPackage#getConcentrationUnit()
 * @model
 * @generated
 */
public enum ConcentrationUnit implements Enumerator {
	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M_VALUE
	 * @generated
	 * @ordered
	 */
	M(1, "M", "M"),

	/**
	 * The '<em><b>MM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MM_VALUE
	 * @generated
	 * @ordered
	 */
	MM(2, "mM", "mM"),

	/**
	 * The '<em><b>UM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UM_VALUE
	 * @generated
	 * @ordered
	 */
	UM(3, "uM", "uM"),

	/**
	 * The '<em><b>NM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NM_VALUE
	 * @generated
	 * @ordered
	 */
	NM(4, "nM", "nM"),

	/**
	 * The '<em><b>PM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PM_VALUE
	 * @generated
	 * @ordered
	 */
	PM(5, "pM", "pM"),

	/**
	 * The '<em><b>FM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FM_VALUE
	 * @generated
	 * @ordered
	 */
	FM(6, "fM", "fM"),

	/**
	 * The '<em><b>MOLECULE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOLECULE_VALUE
	 * @generated
	 * @ordered
	 */
	MOLECULE(7, "MOLECULE", "MOLECULE");

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int M_VALUE = 1;

	/**
	 * The '<em><b>MM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MM
	 * @model name="mM"
	 * @generated
	 * @ordered
	 */
	public static final int MM_VALUE = 2;

	/**
	 * The '<em><b>UM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UM
	 * @model name="uM"
	 * @generated
	 * @ordered
	 */
	public static final int UM_VALUE = 3;

	/**
	 * The '<em><b>NM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NM
	 * @model name="nM"
	 * @generated
	 * @ordered
	 */
	public static final int NM_VALUE = 4;

	/**
	 * The '<em><b>PM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PM
	 * @model name="pM"
	 * @generated
	 * @ordered
	 */
	public static final int PM_VALUE = 5;

	/**
	 * The '<em><b>FM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FM
	 * @model name="fM"
	 * @generated
	 * @ordered
	 */
	public static final int FM_VALUE = 6;

	/**
	 * The '<em><b>MOLECULE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOLECULE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOLECULE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Concentration Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConcentrationUnit[] VALUES_ARRAY =
		new ConcentrationUnit[] {
			M,
			MM,
			UM,
			NM,
			PM,
			FM,
			MOLECULE,
		};

	/**
	 * A public read-only list of all the '<em><b>Concentration Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConcentrationUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concentration Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcentrationUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConcentrationUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concentration Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcentrationUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConcentrationUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concentration Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConcentrationUnit get(int value) {
		switch (value) {
			case M_VALUE: return M;
			case MM_VALUE: return MM;
			case UM_VALUE: return UM;
			case NM_VALUE: return NM;
			case PM_VALUE: return PM;
			case FM_VALUE: return FM;
			case MOLECULE_VALUE: return MOLECULE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConcentrationUnit(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConcentrationUnit
