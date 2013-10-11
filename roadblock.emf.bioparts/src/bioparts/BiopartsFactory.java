/**
 */
package bioparts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bioparts.BiopartsPackage
 * @generated
 */
public interface BiopartsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BiopartsFactory eINSTANCE = bioparts.impl.BiopartsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalogue</em>'.
	 * @generated
	 */
	Catalogue createCatalogue();

	/**
	 * Returns a new object of class '<em>Biopart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Biopart</em>'.
	 * @generated
	 */
	Biopart createBiopart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BiopartsPackage getBiopartsPackage();

} //BiopartsFactory
