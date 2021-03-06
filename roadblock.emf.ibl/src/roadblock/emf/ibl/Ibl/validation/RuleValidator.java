/**
 *
 * $Id$
 */
package roadblock.emf.ibl.Ibl.validation;

import java.util.List;

import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.RateUnit;

/**
 * A sample validator interface for {@link roadblock.emf.ibl.Ibl.Rule}. This
 * doesn't really do anything, and it's not a real EMF artifact. It was
 * generated by the org.eclipse.emf.examples.generator.validator plug-in to
 * illustrate how EMF's code generator can be extended. This can be disabled
 * with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RuleValidator {
	boolean validate();

	boolean validateDisplayName(String value);

	boolean validateIsBidirectional(boolean value);

	boolean validateForwardRate(Double value);

	boolean validateReverseRate(Double value);

	boolean validateForwardRate(double value);

	boolean validateReverseRate(double value);

	boolean validateLeftHandSide(List<MolecularSpecies> value);

	boolean validateRightHandSide(List<MolecularSpecies> value);

	boolean validateID(String value);

	boolean validateForwardRateUnit(RateUnit value);

	boolean validateReverseRateUnit(RateUnit value);
}
