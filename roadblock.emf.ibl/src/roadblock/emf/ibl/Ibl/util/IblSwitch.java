/**
 */
package roadblock.emf.ibl.Ibl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import roadblock.emf.ibl.Ibl.ATGCArrange;
import roadblock.emf.ibl.Ibl.ATGCCloningSites;
import roadblock.emf.ibl.Ibl.ATGCDirection;
import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.ATGCTranslationRate;
import roadblock.emf.ibl.Ibl.BinaryArithmeticExpression;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Chromosome;
import roadblock.emf.ibl.Ibl.ConcentrationConstraint;
import roadblock.emf.ibl.Ibl.ConcentrationQuantity;
import roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.EMFVariableAssignment;
import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair;
import roadblock.emf.ibl.Ibl.IArithmeticExpression;
import roadblock.emf.ibl.Ibl.IArithmeticOperand;
import roadblock.emf.ibl.Ibl.IMoleculeContainer;
import roadblock.emf.ibl.Ibl.IProbabilityConstraint;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.IRuleContainer;
import roadblock.emf.ibl.Ibl.IStateFormula;
import roadblock.emf.ibl.Ibl.ITimeConstraint;
import roadblock.emf.ibl.Ibl.IVisitable;
import roadblock.emf.ibl.Ibl.IVisitor;
import roadblock.emf.ibl.Ibl.IblPackage;
import roadblock.emf.ibl.Ibl.Kinetics;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.MonotonicityExpression;
import roadblock.emf.ibl.Ibl.NotStateFormula;
import roadblock.emf.ibl.Ibl.NumericLiteral;
import roadblock.emf.ibl.Ibl.Plasmid;
import roadblock.emf.ibl.Ibl.ProbabilityProperty;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
import roadblock.emf.ibl.Ibl.RateUnit;
import roadblock.emf.ibl.Ibl.Region;
import roadblock.emf.ibl.Ibl.RelationalExpression;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.emf.ibl.Ibl.StateExpression;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeInterval;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;
import roadblock.emf.ibl.Ibl.VariableReference;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see roadblock.emf.ibl.Ibl.IblPackage
 * @generated
 */
public class IblSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static IblPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public IblSwitch() {
		if (modelPackage == null) {
			modelPackage = IblPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param ePackage
	 *            the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
				if (result == null) result = caseIMoleculeContainer(model);
				if (result == null) result = caseIRuleContainer(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.KINETICS: {
				Kinetics kinetics = (Kinetics)theEObject;
				T result = caseKinetics(kinetics);
				if (result == null) result = caseIVisitable(kinetics);
				if (result == null) result = caseIMoleculeContainer(kinetics);
				if (result == null) result = caseIRuleContainer(kinetics);
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
				if (result == null) result = caseIMoleculeContainer(device);
				if (result == null) result = caseIRuleContainer(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null) result = caseIVisitable(cell);
				if (result == null) result = caseIMoleculeContainer(cell);
				if (result == null) result = caseIRuleContainer(cell);
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
				roadblock.emf.ibl.Ibl.System system = (roadblock.emf.ibl.Ibl.System)theEObject;
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
				if (result == null) result = caseIRuleContainer(region);
				if (result == null) result = caseIMoleculeContainer(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.EMF_VARIABLE_ASSIGNMENT: {
				EMFVariableAssignment emfVariableAssignment = (EMFVariableAssignment)theEObject;
				T result = caseEMFVariableAssignment(emfVariableAssignment);
				if (result == null) result = caseIVisitable(emfVariableAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.FLAT_MODEL: {
				FlatModel flatModel = (FlatModel)theEObject;
				T result = caseFlatModel(flatModel);
				if (result == null) result = caseIVisitable(flatModel);
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
			case IblPackage.RATE_UNIT: {
				RateUnit rateUnit = (RateUnit)theEObject;
				T result = caseRateUnit(rateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.ATGC_DIRECTION: {
				ATGCDirection atgcDirection = (ATGCDirection)theEObject;
				T result = caseATGCDirection(atgcDirection);
				if (result == null) result = caseATGCDirective(atgcDirection);
				if (result == null) result = caseIVisitable(atgcDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.ATGC_ARRANGE: {
				ATGCArrange atgcArrange = (ATGCArrange)theEObject;
				T result = caseATGCArrange(atgcArrange);
				if (result == null) result = caseATGCDirective(atgcArrange);
				if (result == null) result = caseIVisitable(atgcArrange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.ATGC_CLONING_SITES: {
				ATGCCloningSites atgcCloningSites = (ATGCCloningSites)theEObject;
				T result = caseATGCCloningSites(atgcCloningSites);
				if (result == null) result = caseATGCDirective(atgcCloningSites);
				if (result == null) result = caseIVisitable(atgcCloningSites);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.FLAT_MODEL_PROPERTY_PAIR: {
				FlatModelPropertyPair flatModelPropertyPair = (FlatModelPropertyPair)theEObject;
				T result = caseFlatModelPropertyPair(flatModelPropertyPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.IARITHMETIC_EXPRESSION: {
				IArithmeticExpression iArithmeticExpression = (IArithmeticExpression)theEObject;
				T result = caseIArithmeticExpression(iArithmeticExpression);
				if (result == null) result = caseIArithmeticOperand(iArithmeticExpression);
				if (result == null) result = caseIVisitable(iArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.IARITHMETIC_OPERAND: {
				IArithmeticOperand iArithmeticOperand = (IArithmeticOperand)theEObject;
				T result = caseIArithmeticOperand(iArithmeticOperand);
				if (result == null) result = caseIVisitable(iArithmeticOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.BINARY_ARITHMETIC_EXPRESSION: {
				BinaryArithmeticExpression binaryArithmeticExpression = (BinaryArithmeticExpression)theEObject;
				T result = caseBinaryArithmeticExpression(binaryArithmeticExpression);
				if (result == null) result = caseIArithmeticExpression(binaryArithmeticExpression);
				if (result == null) result = caseIArithmeticOperand(binaryArithmeticExpression);
				if (result == null) result = caseIVisitable(binaryArithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.NUMERIC_LITERAL: {
				NumericLiteral numericLiteral = (NumericLiteral)theEObject;
				T result = caseNumericLiteral(numericLiteral);
				if (result == null) result = caseIArithmeticOperand(numericLiteral);
				if (result == null) result = caseIVisitable(numericLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.VARIABLE_REFERENCE: {
				VariableReference variableReference = (VariableReference)theEObject;
				T result = caseVariableReference(variableReference);
				if (result == null) result = caseIArithmeticOperand(variableReference);
				if (result == null) result = caseIVisitable(variableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.MONOTONICITY_EXPRESSION: {
				MonotonicityExpression monotonicityExpression = (MonotonicityExpression)theEObject;
				T result = caseMonotonicityExpression(monotonicityExpression);
				if (result == null) result = caseIStateFormula(monotonicityExpression);
				if (result == null) result = caseIVisitable(monotonicityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.RELATIONAL_EXPRESSION: {
				RelationalExpression relationalExpression = (RelationalExpression)theEObject;
				T result = caseRelationalExpression(relationalExpression);
				if (result == null) result = caseIStateFormula(relationalExpression);
				if (result == null) result = caseIVisitable(relationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.CONCENTRATION_QUANTITY: {
				ConcentrationQuantity concentrationQuantity = (ConcentrationQuantity)theEObject;
				T result = caseConcentrationQuantity(concentrationQuantity);
				if (result == null) result = caseIArithmeticOperand(concentrationQuantity);
				if (result == null) result = caseIVisitable(concentrationQuantity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.ATGC_TRANSLATION_RATE: {
				ATGCTranslationRate atgcTranslationRate = (ATGCTranslationRate)theEObject;
				T result = caseATGCTranslationRate(atgcTranslationRate);
				if (result == null) result = caseATGCDirective(atgcTranslationRate);
				if (result == null) result = caseIVisitable(atgcTranslationRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.IMOLECULE_CONTAINER: {
				IMoleculeContainer iMoleculeContainer = (IMoleculeContainer)theEObject;
				T result = caseIMoleculeContainer(iMoleculeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IblPackage.IRULE_CONTAINER: {
				IRuleContainer iRuleContainer = (IRuleContainer)theEObject;
				T result = caseIRuleContainer(iRuleContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVisitable</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVisitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TResult> T caseIVisitor(IVisitor<TResult> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kinetics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinetics(Kinetics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Rule</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Molecular Species</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Cell</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATGC Directive</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(roadblock.emf.ibl.Ibl.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chromosome</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plasmid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlasmid(Plasmid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProperty</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProbability Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProbabilityConstraint(IProbabilityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concrete Probability Constraint</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMF Variable Assignment</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMF Variable Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMFVariableAssignment(EMFVariableAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat Model</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatModel(FlatModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Initial Condition</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Initial Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyInitialCondition(PropertyInitialCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Unit</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateUnit(RateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATGC Direction</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATGC Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATGCDirection(ATGCDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATGC Arrange</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATGC Arrange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATGCArrange(ATGCArrange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATGC Cloning Sites</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATGC Cloning Sites</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATGCCloningSites(ATGCCloningSites object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flat Model Property Pair</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flat Model Property Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlatModelPropertyPair(FlatModelPropertyPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IArithmetic Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IArithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIArithmeticExpression(IArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IArithmetic Operand</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IArithmetic Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIArithmeticOperand(IArithmeticOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Arithmetic Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryArithmeticExpression(BinaryArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericLiteral(NumericLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableReference(VariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monotonicity Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monotonicity Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonotonicityExpression(MonotonicityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalExpression(RelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concentration Quantity</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concentration Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcentrationQuantity(ConcentrationQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATGC Translation Rate</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATGC Translation Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATGCTranslationRate(ATGCTranslationRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMolecule Container</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMolecule Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMoleculeContainer(IMoleculeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRule Container</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRule Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRuleContainer(IRuleContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // IblSwitch
