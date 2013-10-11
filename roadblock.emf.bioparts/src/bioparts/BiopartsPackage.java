/**
 */
package bioparts;

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
 * @see bioparts.BiopartsFactory
 * @model kind="package"
 * @generated
 */
public interface BiopartsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bioparts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://roadblock.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roadblock.emf.bioparts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BiopartsPackage eINSTANCE = bioparts.impl.BiopartsPackageImpl.init();

	/**
	 * The meta object id for the '{@link bioparts.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bioparts.impl.CatalogueImpl
	 * @see bioparts.impl.BiopartsPackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Biopart List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__BIOPART_LIST = 1;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bioparts.impl.BiopartImpl <em>Biopart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bioparts.impl.BiopartImpl
	 * @see bioparts.impl.BiopartsPackageImpl#getBiopart()
	 * @generated
	 */
	int BIOPART = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOPART__ID = 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOPART__CREATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOPART__SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOPART__NAME = 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOPART__NOTES = 4;

	/**
	 * The feature id for the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOPART__REPOSITORY_NAME = 5;

	/**
	 * The feature id for the '<em><b>Accession URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOPART__ACCESSION_URL = 6;

	/**
	 * The feature id for the '<em><b>Biological Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOPART__BIOLOGICAL_FUNCTION = 7;

	/**
	 * The number of structural features of the '<em>Biopart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOPART_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link bioparts.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see bioparts.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the attribute '{@link bioparts.Catalogue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bioparts.Catalogue#getName()
	 * @see #getCatalogue()
	 * @generated
	 */
	EAttribute getCatalogue_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bioparts.Catalogue#getBiopartList <em>Biopart List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Biopart List</em>'.
	 * @see bioparts.Catalogue#getBiopartList()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_BiopartList();

	/**
	 * Returns the meta object for class '{@link bioparts.Biopart <em>Biopart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biopart</em>'.
	 * @see bioparts.Biopart
	 * @generated
	 */
	EClass getBiopart();

	/**
	 * Returns the meta object for the attribute '{@link bioparts.Biopart#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see bioparts.Biopart#getID()
	 * @see #getBiopart()
	 * @generated
	 */
	EAttribute getBiopart_ID();

	/**
	 * Returns the meta object for the attribute '{@link bioparts.Biopart#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see bioparts.Biopart#getCreationDate()
	 * @see #getBiopart()
	 * @generated
	 */
	EAttribute getBiopart_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link bioparts.Biopart#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see bioparts.Biopart#getSequence()
	 * @see #getBiopart()
	 * @generated
	 */
	EAttribute getBiopart_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link bioparts.Biopart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bioparts.Biopart#getName()
	 * @see #getBiopart()
	 * @generated
	 */
	EAttribute getBiopart_Name();

	/**
	 * Returns the meta object for the attribute '{@link bioparts.Biopart#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see bioparts.Biopart#getNotes()
	 * @see #getBiopart()
	 * @generated
	 */
	EAttribute getBiopart_Notes();

	/**
	 * Returns the meta object for the attribute '{@link bioparts.Biopart#getRepositoryName <em>Repository Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Name</em>'.
	 * @see bioparts.Biopart#getRepositoryName()
	 * @see #getBiopart()
	 * @generated
	 */
	EAttribute getBiopart_RepositoryName();

	/**
	 * Returns the meta object for the attribute '{@link bioparts.Biopart#getAccessionURL <em>Accession URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accession URL</em>'.
	 * @see bioparts.Biopart#getAccessionURL()
	 * @see #getBiopart()
	 * @generated
	 */
	EAttribute getBiopart_AccessionURL();

	/**
	 * Returns the meta object for the attribute '{@link bioparts.Biopart#getBiologicalFunction <em>Biological Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Biological Function</em>'.
	 * @see bioparts.Biopart#getBiologicalFunction()
	 * @see #getBiopart()
	 * @generated
	 */
	EAttribute getBiopart_BiologicalFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BiopartsFactory getBiopartsFactory();

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
		 * The meta object literal for the '{@link bioparts.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bioparts.impl.CatalogueImpl
		 * @see bioparts.impl.BiopartsPackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE__NAME = eINSTANCE.getCatalogue_Name();

		/**
		 * The meta object literal for the '<em><b>Biopart List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__BIOPART_LIST = eINSTANCE.getCatalogue_BiopartList();

		/**
		 * The meta object literal for the '{@link bioparts.impl.BiopartImpl <em>Biopart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bioparts.impl.BiopartImpl
		 * @see bioparts.impl.BiopartsPackageImpl#getBiopart()
		 * @generated
		 */
		EClass BIOPART = eINSTANCE.getBiopart();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOPART__ID = eINSTANCE.getBiopart_ID();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOPART__CREATION_DATE = eINSTANCE.getBiopart_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOPART__SEQUENCE = eINSTANCE.getBiopart_Sequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOPART__NAME = eINSTANCE.getBiopart_Name();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOPART__NOTES = eINSTANCE.getBiopart_Notes();

		/**
		 * The meta object literal for the '<em><b>Repository Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOPART__REPOSITORY_NAME = eINSTANCE.getBiopart_RepositoryName();

		/**
		 * The meta object literal for the '<em><b>Accession URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOPART__ACCESSION_URL = eINSTANCE.getBiopart_AccessionURL();

		/**
		 * The meta object literal for the '<em><b>Biological Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIOPART__BIOLOGICAL_FUNCTION = eINSTANCE.getBiopart_BiologicalFunction();

	}

} //BiopartsPackage
