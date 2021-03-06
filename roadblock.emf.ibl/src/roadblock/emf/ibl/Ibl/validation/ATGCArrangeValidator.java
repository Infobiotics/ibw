/**
 *
 * $Id$
 */
package roadblock.emf.ibl.Ibl.validation;

import java.util.List;

import roadblock.emf.ibl.Ibl.MolecularSpecies;

/**
 * A sample validator interface for {@link roadblock.emf.ibl.Ibl.ATGCArrange}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ATGCArrangeValidator {
	boolean validate();

	boolean validatePartList(List<MolecularSpecies> value);
}
