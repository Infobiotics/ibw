/**
 */
package bioparts.tests;

import bioparts.Biopart;
import bioparts.BiopartsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Biopart</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BiopartTest extends TestCase {

	/**
	 * The fixture for this Biopart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Biopart fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BiopartTest.class);
	}

	/**
	 * Constructs a new Biopart test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiopartTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Biopart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Biopart fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Biopart test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Biopart getFixture() {
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
		setFixture(BiopartsFactory.eINSTANCE.createBiopart());
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
	
	public void smallConstructor(String ID, String repository){
		this.setID(ID);
		this.setRepositoryName(repository);
	}
	public void testConstructor(){
		Biopart part = BiopartsFactory.eINSTANCE.createBiopart();
		part.smallConstructor("myID","mRepo");		
		
	}
	
} //BiopartTest
