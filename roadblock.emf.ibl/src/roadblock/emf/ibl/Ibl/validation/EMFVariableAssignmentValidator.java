/**
 *
 * $Id$
 */
package roadblock.emf.ibl.Ibl.validation;


/**
 * A sample validator interface for {@link roadblock.emf.ibl.Ibl.EMFVariableAssignment}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EMFVariableAssignmentValidator {
	boolean validate();

	boolean validateVariableName(String value);
	boolean validateVariableAttribute(String value);
	boolean validateUnit(String value);
	boolean validateAmount(double value);
}
