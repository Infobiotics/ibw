/**
 */
package roadblock.emf.ibl.Ibl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Temporal Pattern</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see roadblock.emf.ibl.Ibl.IblPackage#getTemporalPattern()
 * @model
 * @generated
 */
public enum TemporalPattern implements Enumerator {
	/**
	 * The '<em><b>UNTIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNTIL_VALUE
	 * @generated
	 * @ordered
	 */
	UNTIL(1, "UNTIL", "UNTIL"),

	/**
	 * The '<em><b>FOLLOWED BY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOWED_BY(2, "FOLLOWED_BY", "FOLLOWED_BY"),

	/**
	 * The '<em><b>EVENTUALLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENTUALLY_VALUE
	 * @generated
	 * @ordered
	 */
	EVENTUALLY(3, "EVENTUALLY", "EVENTUALLY"),

	/**
	 * The '<em><b>STEADY STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEADY_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	STEADY_STATE(6, "STEADY_STATE", "STEADY_STATE"),

	/**
	 * The '<em><b>NEVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(5, "NEVER", "NEVER"),

	/**
	 * The '<em><b>INFINITELY OFTEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFINITELY_OFTEN_VALUE
	 * @generated
	 * @ordered
	 */
	INFINITELY_OFTEN(4, "INFINITELY_OFTEN", "INFINITELY_OFTEN"),

	/**
	 * The '<em><b>ALWAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS(7, "ALWAYS", "ALWAYS"), /**
	 * The '<em><b>EVENTUALLY ALWAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENTUALLY_ALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	EVENTUALLY_ALWAYS(8, "EVENTUALLY_ALWAYS", "EVENTUALLY_ALWAYS");

	/**
	 * The '<em><b>UNTIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNTIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNTIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNTIL_VALUE = 1;

	/**
	 * The '<em><b>FOLLOWED BY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOLLOWED BY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOLLOWED_BY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOWED_BY_VALUE = 2;

	/**
	 * The '<em><b>EVENTUALLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVENTUALLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENTUALLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVENTUALLY_VALUE = 3;

	/**
	 * The '<em><b>STEADY STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STEADY STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEADY_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEADY_STATE_VALUE = 6;

	/**
	 * The '<em><b>NEVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 5;

	/**
	 * The '<em><b>INFINITELY OFTEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INFINITELY OFTEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFINITELY_OFTEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFINITELY_OFTEN_VALUE = 4;

	/**
	 * The '<em><b>ALWAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALWAYS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALWAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_VALUE = 7;

	/**
	 * The '<em><b>EVENTUALLY ALWAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVENTUALLY ALWAYS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENTUALLY_ALWAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVENTUALLY_ALWAYS_VALUE = 8;

	/**
	 * An array of all the '<em><b>Temporal Pattern</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TemporalPattern[] VALUES_ARRAY =
		new TemporalPattern[] {
			UNTIL,
			FOLLOWED_BY,
			EVENTUALLY,
			STEADY_STATE,
			NEVER,
			INFINITELY_OFTEN,
			ALWAYS,
			EVENTUALLY_ALWAYS,
		};

	/**
	 * A public read-only list of all the '<em><b>Temporal Pattern</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TemporalPattern> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Temporal Pattern</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemporalPattern get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemporalPattern result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Pattern</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemporalPattern getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemporalPattern result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Pattern</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemporalPattern get(int value) {
		switch (value) {
			case UNTIL_VALUE: return UNTIL;
			case FOLLOWED_BY_VALUE: return FOLLOWED_BY;
			case EVENTUALLY_VALUE: return EVENTUALLY;
			case STEADY_STATE_VALUE: return STEADY_STATE;
			case NEVER_VALUE: return NEVER;
			case INFINITELY_OFTEN_VALUE: return INFINITELY_OFTEN;
			case ALWAYS_VALUE: return ALWAYS;
			case EVENTUALLY_ALWAYS_VALUE: return EVENTUALLY_ALWAYS;
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
	private TemporalPattern(int value, String name, String literal) {
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
	
} //TemporalPattern
