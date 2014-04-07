/**
 */
package roadblock.emf.ibl.Ibl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rate Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see roadblock.emf.ibl.Ibl.IblPackage#getRateUnit()
 * @model
 * @generated
 */
public enum RateUnit implements Enumerator {
	/**
	 * The '<em><b>PER SECOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	PER_SECOND(1, "PER_SECOND", "PER_SECOND"),

	/**
	 * The '<em><b>PER MINUTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PER_MINUTE_VALUE
	 * @generated
	 * @ordered
	 */
	PER_MINUTE(2, "PER_MINUTE", "PER_MINUTE");

	/**
	 * The '<em><b>PER SECOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PER SECOND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_SECOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PER_SECOND_VALUE = 1;

	/**
	 * The '<em><b>PER MINUTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PER MINUTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PER_MINUTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PER_MINUTE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Rate Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RateUnit[] VALUES_ARRAY =
		new RateUnit[] {
			PER_SECOND,
			PER_MINUTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Rate Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RateUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rate Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RateUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RateUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rate Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RateUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RateUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rate Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RateUnit get(int value) {
		switch (value) {
			case PER_SECOND_VALUE: return PER_SECOND;
			case PER_MINUTE_VALUE: return PER_MINUTE;
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
	private RateUnit(int value, String name, String literal) {
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
	
} //RateUnit
