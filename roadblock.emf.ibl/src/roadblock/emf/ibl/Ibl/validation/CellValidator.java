/**
 *
 * $Id$
 */
package roadblock.emf.ibl.Ibl.validation;

import java.util.List;

import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.EMFVariableAssignment;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Kinetics;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.Rule;

/**
 * A sample validator interface for {@link roadblock.emf.ibl.Ibl.Cell}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CellValidator {
	boolean validate();

	boolean validateDisplayName(String value);
	boolean validateDeviceList(List<Device> value);
	boolean validateKinetics(Kinetics value);
	boolean validateRuleList(List<Rule> value);
	boolean validateMoleculeList(List<MolecularSpecies> value);
	boolean validateATGCCommandList(List<ATGCDirective> value);
	boolean validateID(String value);
	boolean validateVariableAssignmentList(List<EMFVariableAssignment> value);
	boolean validateProperties(List<IProperty> value);
}