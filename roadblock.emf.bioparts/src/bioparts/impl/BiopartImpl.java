/**
 */
package bioparts.impl;

import bioparts.Biopart;
import bioparts.BiopartsPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biopart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bioparts.impl.BiopartImpl#getID <em>ID</em>}</li>
 *   <li>{@link bioparts.impl.BiopartImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link bioparts.impl.BiopartImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link bioparts.impl.BiopartImpl#getName <em>Name</em>}</li>
 *   <li>{@link bioparts.impl.BiopartImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link bioparts.impl.BiopartImpl#getRepositoryName <em>Repository Name</em>}</li>
 *   <li>{@link bioparts.impl.BiopartImpl#getAccessionURL <em>Accession URL</em>}</li>
 *   <li>{@link bioparts.impl.BiopartImpl#getBiologicalFunction <em>Biological Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BiopartImpl extends EObjectImpl implements Biopart {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final String SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected String sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepositoryName() <em>Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryName() <em>Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected String repositoryName = REPOSITORY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessionURL() <em>Accession URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessionURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessionURL() <em>Accession URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessionURL()
	 * @generated
	 * @ordered
	 */
	protected String accessionURL = ACCESSION_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBiologicalFunction() <em>Biological Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiologicalFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String BIOLOGICAL_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBiologicalFunction() <em>Biological Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiologicalFunction()
	 * @generated
	 * @ordered
	 */
	protected String biologicalFunction = BIOLOGICAL_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiopartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BiopartsPackage.Literals.BIOPART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiopartsPackage.BIOPART__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiopartsPackage.BIOPART__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(String newSequence) {
		String oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiopartsPackage.BIOPART__SEQUENCE, oldSequence, sequence));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiopartsPackage.BIOPART__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiopartsPackage.BIOPART__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryName() {
		return repositoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryName(String newRepositoryName) {
		String oldRepositoryName = repositoryName;
		repositoryName = newRepositoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiopartsPackage.BIOPART__REPOSITORY_NAME, oldRepositoryName, repositoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessionURL() {
		return accessionURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessionURL(String newAccessionURL) {
		String oldAccessionURL = accessionURL;
		accessionURL = newAccessionURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiopartsPackage.BIOPART__ACCESSION_URL, oldAccessionURL, accessionURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBiologicalFunction() {
		return biologicalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBiologicalFunction(String newBiologicalFunction) {
		String oldBiologicalFunction = biologicalFunction;
		biologicalFunction = newBiologicalFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiopartsPackage.BIOPART__BIOLOGICAL_FUNCTION, oldBiologicalFunction, biologicalFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BiopartsPackage.BIOPART__ID:
				return getID();
			case BiopartsPackage.BIOPART__CREATION_DATE:
				return getCreationDate();
			case BiopartsPackage.BIOPART__SEQUENCE:
				return getSequence();
			case BiopartsPackage.BIOPART__NAME:
				return getName();
			case BiopartsPackage.BIOPART__NOTES:
				return getNotes();
			case BiopartsPackage.BIOPART__REPOSITORY_NAME:
				return getRepositoryName();
			case BiopartsPackage.BIOPART__ACCESSION_URL:
				return getAccessionURL();
			case BiopartsPackage.BIOPART__BIOLOGICAL_FUNCTION:
				return getBiologicalFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BiopartsPackage.BIOPART__ID:
				setID((String)newValue);
				return;
			case BiopartsPackage.BIOPART__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case BiopartsPackage.BIOPART__SEQUENCE:
				setSequence((String)newValue);
				return;
			case BiopartsPackage.BIOPART__NAME:
				setName((String)newValue);
				return;
			case BiopartsPackage.BIOPART__NOTES:
				setNotes((String)newValue);
				return;
			case BiopartsPackage.BIOPART__REPOSITORY_NAME:
				setRepositoryName((String)newValue);
				return;
			case BiopartsPackage.BIOPART__ACCESSION_URL:
				setAccessionURL((String)newValue);
				return;
			case BiopartsPackage.BIOPART__BIOLOGICAL_FUNCTION:
				setBiologicalFunction((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BiopartsPackage.BIOPART__ID:
				setID(ID_EDEFAULT);
				return;
			case BiopartsPackage.BIOPART__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case BiopartsPackage.BIOPART__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case BiopartsPackage.BIOPART__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BiopartsPackage.BIOPART__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case BiopartsPackage.BIOPART__REPOSITORY_NAME:
				setRepositoryName(REPOSITORY_NAME_EDEFAULT);
				return;
			case BiopartsPackage.BIOPART__ACCESSION_URL:
				setAccessionURL(ACCESSION_URL_EDEFAULT);
				return;
			case BiopartsPackage.BIOPART__BIOLOGICAL_FUNCTION:
				setBiologicalFunction(BIOLOGICAL_FUNCTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BiopartsPackage.BIOPART__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BiopartsPackage.BIOPART__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case BiopartsPackage.BIOPART__SEQUENCE:
				return SEQUENCE_EDEFAULT == null ? sequence != null : !SEQUENCE_EDEFAULT.equals(sequence);
			case BiopartsPackage.BIOPART__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BiopartsPackage.BIOPART__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case BiopartsPackage.BIOPART__REPOSITORY_NAME:
				return REPOSITORY_NAME_EDEFAULT == null ? repositoryName != null : !REPOSITORY_NAME_EDEFAULT.equals(repositoryName);
			case BiopartsPackage.BIOPART__ACCESSION_URL:
				return ACCESSION_URL_EDEFAULT == null ? accessionURL != null : !ACCESSION_URL_EDEFAULT.equals(accessionURL);
			case BiopartsPackage.BIOPART__BIOLOGICAL_FUNCTION:
				return BIOLOGICAL_FUNCTION_EDEFAULT == null ? biologicalFunction != null : !BIOLOGICAL_FUNCTION_EDEFAULT.equals(biologicalFunction);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", sequence: ");
		result.append(sequence);
		result.append(", name: ");
		result.append(name);
		result.append(", notes: ");
		result.append(notes);
		result.append(", repositoryName: ");
		result.append(repositoryName);
		result.append(", accessionURL: ");
		result.append(accessionURL);
		result.append(", biologicalFunction: ");
		result.append(biologicalFunction);
		result.append(')');
		return result.toString();
	}
	

	
} //BiopartImpl
