/**
 */
package bioparts.tests;

import org.eclipse.emf.ecore.util.EcoreUtil;

import bioparts.Biopart;
import bioparts.BiopartsFactory;
import bioparts.Catalogue;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogueTest extends TestCase {

	/**
	 * The fixture for this Catalogue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Catalogue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CatalogueTest.class);
	}

	/**
	 * Constructs a new Catalogue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Catalogue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Catalogue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Catalogue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Catalogue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BiopartsFactory.eINSTANCE.createCatalogue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	public void testBioparts(){
		Catalogue catalogue = BiopartsFactory.eINSTANCE.createCatalogue();

		Biopart part1 = BiopartsFactory.eINSTANCE.createBiopart();
		part1.setID("this is part1");

		Biopart part2 = BiopartsFactory.eINSTANCE.createBiopart();
		part2.setID("this is part2");

		// Adding twice the same part
		catalogue.getBiopartList().add(part1);
		catalogue.getBiopartList().add(part1);

		// only 1 element
		assertEquals(1,catalogue.getBiopartList().size());

		// adding second part
		catalogue.getBiopartList().add(part2);
		
		// Now 2 elements
		assertEquals(2,catalogue.getBiopartList().size());
		
		// copy a biopart and add it to the catalogue
		Biopart part2Copy = EcoreUtil.copy(part2);
		catalogue.getBiopartList().add(part2Copy);
		
		// now 3 elements
		assertEquals(3,catalogue.getBiopartList().size());
		
	}
} //CatalogueTest
