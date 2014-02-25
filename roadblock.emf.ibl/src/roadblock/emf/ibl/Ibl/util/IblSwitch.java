/**
 */
package roadblock.emf.ibl.Ibl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Chromosome;
import roadblock.emf.ibl.Ibl.ConcentrationConstraint;
import roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.IProbabilityConstraint;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.IStateFormula;
import roadblock.emf.ibl.Ibl.ITimeConstraint;
import roadblock.emf.ibl.Ibl.IVisitable;
import roadblock.emf.ibl.Ibl.IVisitor;
import roadblock.emf.ibl.Ibl.IblPackage;
import roadblock.emf.ibl.Ibl.Kinetics;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.NotStateFormula;
import roadblock.emf.ibl.Ibl.Plasmid;
import roadblock.emf.ibl.Ibl.ProbabilityProperty;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.emf.ibl.Ibl.StateExpression;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeInterval;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;
import roadblock.emf.ibl.Ibl.*;
import roadblock.emf.ibl.Ibl.System;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see roadblock.emf.ibl.Ibl.IblPackage
 * @generated
 */
public class IblSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IblPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IblSwitch() {
		if (modelPackage == null) {
			modelPackage = IblPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IblPackage.IVISITABLE: {
				IVisitable iVisitable = (IVisitable)theEObject;
				T result = caseIVisitable(iVisitable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.IVISITOR: {
				IVisitor<?> iVisitor = (IVisitor<?>)theEObject;
				T result = caseIVisitor(iVisitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseIVisitable(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.KINETICS: {
				Kinetics kinetics = (Kinetics)theEObject;
				T result = caseKinetics(kinetics);
				if (result == null) result = caseIVisitable(kinetics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseIVisitable(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.MOLECULAR_SPECIES: {
				MolecularSpecies molecularSpecies = (MolecularSpecies)theEObject;
				T result = caseMolecularSpecies(molecularSpecies);
				if (result == null) result = caseIVisitable(molecularSpecies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseIVisitable(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = caseIVisitable(cell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.ATGC_DIRECTIVE: {
				ATGCDirective atgcDirective = (ATGCDirective)theEObject;
				T result = caseATGCDirective(atgcDirective);
				if (result == null) result = caseIVisitable(atgcDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.SYSTEM: {
				System system = (System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = caseIVisitable(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.CHROMOSOME: {
				Chromosome chromosome = (Chromosome)theEObject;
				T result = caseChromosome(chromosome);
				if (result == null) result = caseIVisitable(chromosome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.PLASMID: {
				Plasmid plasmid = (Plasmid)theEObject;
				T result = casePlasmid(plasmid);
				if (result == null) result = caseIVisitable(plasmid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.IPROPERTY: {
				IProperty iProperty = (IProperty)theEObject;
				T result = caseIProperty(iProperty);
				if (result == null) result = caseIVisitable(iProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.PROBABILITY_PROPERTY: {
				ProbabilityProperty probabilityProperty = (ProbabilityProperty)theEObject;
				T result = caseProbabilityProperty(probabilityProperty);
				if (result == null) result = caseIProperty(probabilityProperty);
				if (result == null) result = caseIVisitable(probabilityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.IPROBABILITY_CONSTRAINT: {
				IProbabilityConstraint iProbabilityConstraint = (IProbabilityConstraint)theEObject;
				T result = caseIProbabilityConstraint(iProbabilityConstraint);
				if (result == null) result = caseIVisitable(iProbabilityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.PROPERTY_INITIAL_CONDITION: {
				PropertyInitialCondition propertyInitialCondition = (PropertyInitialCondition)theEObject;
				T result = casePropertyInitialCondition(propertyInitialCondition);
				if (result == null) result = caseIVisitable(propertyInitialCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.CONCRETE_PROBABILITY_CONSTRAINT: {
				ConcreteProbabilityConstraint concreteProbabilityConstraint = (ConcreteProbabilityConstraint)theEObject;
				T result = caseConcreteProbabilityConstraint(concreteProbabilityConstraint);
				if (result == null) result = caseIProbabilityConstraint(concreteProbabilityConstraint);
				if (result == null) result = caseIVisitable(concreteProbabilityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.UNKNOWN_PROBABILITY_CONSTRAINT: {
				UnknownProbabilityConstraint unknownProbabilityConstraint = (UnknownProbabilityConstraint)theEObject;
				T result = caseUnknownProbabilityConstraint(unknownProbabilityConstraint);
				if (result == null) result = caseIProbabilityConstraint(unknownProbabilityConstraint);
				if (result == null) result = caseIVisitable(unknownProbabilityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.ITIME_CONSTRAINT: {
				ITimeConstraint iTimeConstraint = (ITimeConstraint)theEObject;
				T result = caseITimeConstraint(iTimeConstraint);
				if (result == null) result = caseIVisitable(iTimeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.TIME_INTERVAL: {
				TimeInterval timeInterval = (TimeInterval)theEObject;
				T result = caseTimeInterval(timeInterval);
				if (result == null) result = caseITimeConstraint(timeInterval);
				if (result == null) result = caseIVisitable(timeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.TIME_INSTANT: {
				TimeInstant timeInstant = (TimeInstant)theEObject;
				T result = caseTimeInstant(timeInstant);
				if (result == null) result = caseITimeConstraint(timeInstant);
				if (result == null) result = caseIVisitable(timeInstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.UNARY_PROBABILITY_PROPERTY: {
				UnaryProbabilityProperty unaryProbabilityProperty = (UnaryProbabilityProperty)theEObject;
				T result = caseUnaryProbabilityProperty(unaryProbabilityProperty);
				if (result == null) result = caseProbabilityProperty(unaryProbabilityProperty);
				if (result == null) result = caseIProperty(unaryProbabilityProperty);
				if (result == null) result = caseIVisitable(unaryProbabilityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.BINARY_PROBABILITY_PROPERTY: {
				BinaryProbabilityProperty binaryProbabilityProperty = (BinaryProbabilityProperty)theEObject;
				T result = caseBinaryProbabilityProperty(binaryProbabilityProperty);
				if (result == null) result = caseProbabilityProperty(binaryProbabilityProperty);
				if (result == null) result = caseIProperty(binaryProbabilityProperty);
				if (result == null) result = caseIVisitable(binaryProbabilityProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.REWARD_PROPERTY: {
				RewardProperty rewardProperty = (RewardProperty)theEObject;
				T result = caseRewardProperty(rewardProperty);
				if (result == null) result = caseIProperty(rewardProperty);
				if (result == null) result = caseIVisitable(rewardProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.STEADY_STATE_PROPERTY: {
				SteadyStateProperty steadyStateProperty = (SteadyStateProperty)theEObject;
				T result = caseSteadyStateProperty(steadyStateProperty);
				if (result == null) result = caseIProperty(steadyStateProperty);
				if (result == null) result = caseIVisitable(steadyStateProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.CONCENTRATION_CONSTRAINT: {
				ConcentrationConstraint concentrationConstraint = (ConcentrationConstraint)theEObject;
				T result = caseConcentrationConstraint(concentrationConstraint);
				if (result == null) result = caseIVisitable(concentrationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.ISTATE_FORMULA: {
				IStateFormula iStateFormula = (IStateFormula)theEObject;
				T result = caseIStateFormula(iStateFormula);
				if (result == null) result = caseIVisitable(iStateFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.BINARY_STATE_FORMULA: {
				BinaryStateFormula binaryStateFormula = (BinaryStateFormula)theEObject;
				T result = caseBinaryStateFormula(binaryStateFormula);
				if (result == null) result = caseIStateFormula(binaryStateFormula);
				if (result == null) result = caseIVisitable(binaryStateFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.NOT_STATE_FORMULA: {
				NotStateFormula notStateFormula = (NotStateFormula)theEObject;
				T result = caseNotStateFormula(notStateFormula);
				if (result == null) result = caseIStateFormula(notStateFormula);
				if (result == null) result = caseIVisitable(notStateFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.STATE_EXPRESSION: {
				StateExpression stateExpression = (StateExpression)theEObject;
				T result = caseStateExpression(stateExpression);
				if (result == null) result = caseIStateFormula(stateExpression);
				if (result == null) result = caseIVisitable(stateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseIVisitable(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kinetics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kinetics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinetics(Kinetics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Species</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Molecular Species</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMolecularSpecies(MolecularSpecies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATGC Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATGC Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATGCDirective(ATGCDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chromosome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chromosome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChromosome(Chromosome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plasmid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plasmid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlasmid(Plasmid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVisitable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVisitable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVisitable(IVisitable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVisitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVisitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TResult> T caseIVisitor(IVisitor<TResult> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProperty(IProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probability Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probability Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilityProperty(ProbabilityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProbability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProbability Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProbabilityConstraint(IProbabilityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Initial Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Initial Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyInitialCondition(PropertyInitialCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Probability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concrete Probability Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcreteProbabilityConstraint(ConcreteProbabilityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Probability Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Probability Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownProbabilityConstraint(UnknownProbabilityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITime Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITime Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITimeConstraint(ITimeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Instant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Instant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInstant(TimeInstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Probability Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Probability Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryProbabilityProperty(UnaryProbabilityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Probability Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Probability Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryProbabilityProperty(BinaryProbabilityProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reward Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reward Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRewardProperty(RewardProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steady State Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steady State Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteadyStateProperty(SteadyStateProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concentration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concentration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcentrationConstraint(ConcentrationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IState Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IState Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStateFormula(IStateFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary State Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary State Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryStateFormula(BinaryStateFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not State Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not State Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotStateFormula(NotStateFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateExpression(StateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IblSwitch
