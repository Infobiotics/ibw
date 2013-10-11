/**
 */
package bioparts.impl;

import bioparts.Biopart;
import bioparts.BiopartsFactory;
import bioparts.BiopartsPackage;
import bioparts.Catalogue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BiopartsPackageImpl extends EPackageImpl implements BiopartsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biopartEClass = null;

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
	 * @see bioparts.BiopartsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BiopartsPackageImpl() {
		super(eNS_URI, BiopartsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BiopartsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BiopartsPackage init() {
		if (isInited) return (BiopartsPackage)EPackage.Registry.INSTANCE.getEPackage(BiopartsPackage.eNS_URI);

		// Obtain or create and register package
		BiopartsPackageImpl theBiopartsPackage = (BiopartsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BiopartsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BiopartsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBiopartsPackage.createPackageContents();

		// Initialize created meta-data
		theBiopartsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBiopartsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BiopartsPackage.eNS_URI, theBiopartsPackage);
		return theBiopartsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogue() {
		return catalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalogue_Name() {
		return (EAttribute)catalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogue_BiopartList() {
		return (EReference)catalogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiopart() {
		return biopartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiopart_ID() {
		return (EAttribute)biopartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiopart_CreationDate() {
		return (EAttribute)biopartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiopart_Sequence() {
		return (EAttribute)biopartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiopart_Name() {
		return (EAttribute)biopartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiopart_Notes() {
		return (EAttribute)biopartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiopart_RepositoryName() {
		return (EAttribute)biopartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiopart_AccessionURL() {
		return (EAttribute)biopartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBiopart_BiologicalFunction() {
		return (EAttribute)biopartEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiopartsFactory getBiopartsFactory() {
		return (BiopartsFactory)getEFactoryInstance();
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
		catalogueEClass = createEClass(CATALOGUE);
		createEAttribute(catalogueEClass, CATALOGUE__NAME);
		createEReference(catalogueEClass, CATALOGUE__BIOPART_LIST);

		biopartEClass = createEClass(BIOPART);
		createEAttribute(biopartEClass, BIOPART__ID);
		createEAttribute(biopartEClass, BIOPART__CREATION_DATE);
		createEAttribute(biopartEClass, BIOPART__SEQUENCE);
		createEAttribute(biopartEClass, BIOPART__NAME);
		createEAttribute(biopartEClass, BIOPART__NOTES);
		createEAttribute(biopartEClass, BIOPART__REPOSITORY_NAME);
		createEAttribute(biopartEClass, BIOPART__ACCESSION_URL);
		createEAttribute(biopartEClass, BIOPART__BIOLOGICAL_FUNCTION);
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

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(catalogueEClass, Catalogue.class, "Catalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogue_Name(), ecorePackage.getEString(), "name", null, 0, 1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogue_BiopartList(), this.getBiopart(), null, "biopartList", null, 0, -1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biopartEClass, Biopart.class, "Biopart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBiopart_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Biopart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiopart_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, Biopart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiopart_Sequence(), ecorePackage.getEString(), "sequence", null, 0, 1, Biopart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiopart_Name(), ecorePackage.getEString(), "name", null, 0, 1, Biopart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiopart_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, Biopart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiopart_RepositoryName(), ecorePackage.getEString(), "repositoryName", null, 0, 1, Biopart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiopart_AccessionURL(), ecorePackage.getEString(), "accessionURL", null, 0, 1, Biopart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBiopart_BiologicalFunction(), ecorePackage.getEString(), "biologicalFunction", null, 0, 1, Biopart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BiopartsPackageImpl
