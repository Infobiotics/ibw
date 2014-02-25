/**
 */
package roadblock.emf.ibl.Ibl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see roadblock.emf.ibl.Ibl.IblPackage
 * @generated
 */
public class IblAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IblPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IblAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IblPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IblSwitch<Adapter> modelSwitch =
		new IblSwitch<Adapter>() {
			@Override
			public Adapter caseIVisitable(IVisitable object) {
				return createIVisitableAdapter();
			}
			@Override
			public <TResult> Adapter caseIVisitor(IVisitor<TResult> object) {
				return createIVisitorAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseKinetics(Kinetics object) {
				return createKineticsAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseMolecularSpecies(MolecularSpecies object) {
				return createMolecularSpeciesAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseCell(Cell object) {
				return createCellAdapter();
			}
			@Override
			public Adapter caseATGCDirective(ATGCDirective object) {
				return createATGCDirectiveAdapter();
			}
			@Override
			public Adapter caseSystem(System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseChromosome(Chromosome object) {
				return createChromosomeAdapter();
			}
			@Override
			public Adapter casePlasmid(Plasmid object) {
				return createPlasmidAdapter();
			}
			@Override
			public Adapter caseIProperty(IProperty object) {
				return createIPropertyAdapter();
			}
			@Override
			public Adapter caseProbabilityProperty(ProbabilityProperty object) {
				return createProbabilityPropertyAdapter();
			}
			@Override
			public Adapter caseIProbabilityConstraint(IProbabilityConstraint object) {
				return createIProbabilityConstraintAdapter();
			}
			@Override
			public Adapter casePropertyInitialCondition(PropertyInitialCondition object) {
				return createPropertyInitialConditionAdapter();
			}
			@Override
			public Adapter caseConcreteProbabilityConstraint(ConcreteProbabilityConstraint object) {
				return createConcreteProbabilityConstraintAdapter();
			}
			@Override
			public Adapter caseUnknownProbabilityConstraint(UnknownProbabilityConstraint object) {
				return createUnknownProbabilityConstraintAdapter();
			}
			@Override
			public Adapter caseITimeConstraint(ITimeConstraint object) {
				return createITimeConstraintAdapter();
			}
			@Override
			public Adapter caseTimeInterval(TimeInterval object) {
				return createTimeIntervalAdapter();
			}
			@Override
			public Adapter caseTimeInstant(TimeInstant object) {
				return createTimeInstantAdapter();
			}
			@Override
			public Adapter caseUnaryProbabilityProperty(UnaryProbabilityProperty object) {
				return createUnaryProbabilityPropertyAdapter();
			}
			@Override
			public Adapter caseBinaryProbabilityProperty(BinaryProbabilityProperty object) {
				return createBinaryProbabilityPropertyAdapter();
			}
			@Override
			public Adapter caseRewardProperty(RewardProperty object) {
				return createRewardPropertyAdapter();
			}
			@Override
			public Adapter caseSteadyStateProperty(SteadyStateProperty object) {
				return createSteadyStatePropertyAdapter();
			}
			@Override
			public Adapter caseConcentrationConstraint(ConcentrationConstraint object) {
				return createConcentrationConstraintAdapter();
			}
			@Override
			public Adapter caseIStateFormula(IStateFormula object) {
				return createIStateFormulaAdapter();
			}
			@Override
			public Adapter caseBinaryStateFormula(BinaryStateFormula object) {
				return createBinaryStateFormulaAdapter();
			}
			@Override
			public Adapter caseNotStateFormula(NotStateFormula object) {
				return createNotStateFormulaAdapter();
			}
			@Override
			public Adapter caseStateExpression(StateExpression object) {
				return createStateExpressionAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.Kinetics <em>Kinetics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.Kinetics
	 * @generated
	 */
	public Adapter createKineticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.MolecularSpecies <em>Molecular Species</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.MolecularSpecies
	 * @generated
	 */
	public Adapter createMolecularSpeciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.ATGCDirective <em>ATGC Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.ATGCDirective
	 * @generated
	 */
	public Adapter createATGCDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.Chromosome <em>Chromosome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.Chromosome
	 * @generated
	 */
	public Adapter createChromosomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.Plasmid <em>Plasmid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.Plasmid
	 * @generated
	 */
	public Adapter createPlasmidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.IVisitable <em>IVisitable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.IVisitable
	 * @generated
	 */
	public Adapter createIVisitableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.IVisitor <em>IVisitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.IVisitor
	 * @generated
	 */
	public Adapter createIVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.IProperty <em>IProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.IProperty
	 * @generated
	 */
	public Adapter createIPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.ProbabilityProperty <em>Probability Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.ProbabilityProperty
	 * @generated
	 */
	public Adapter createProbabilityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.IProbabilityConstraint <em>IProbability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.IProbabilityConstraint
	 * @generated
	 */
	public Adapter createIProbabilityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.PropertyInitialCondition <em>Property Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.PropertyInitialCondition
	 * @generated
	 */
	public Adapter createPropertyInitialConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint <em>Concrete Probability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint
	 * @generated
	 */
	public Adapter createConcreteProbabilityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint <em>Unknown Probability Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint
	 * @generated
	 */
	public Adapter createUnknownProbabilityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.ITimeConstraint <em>ITime Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.ITimeConstraint
	 * @generated
	 */
	public Adapter createITimeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.TimeInstant <em>Time Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.TimeInstant
	 * @generated
	 */
	public Adapter createTimeInstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.UnaryProbabilityProperty <em>Unary Probability Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.UnaryProbabilityProperty
	 * @generated
	 */
	public Adapter createUnaryProbabilityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.BinaryProbabilityProperty <em>Binary Probability Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.BinaryProbabilityProperty
	 * @generated
	 */
	public Adapter createBinaryProbabilityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.RewardProperty <em>Reward Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.RewardProperty
	 * @generated
	 */
	public Adapter createRewardPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.SteadyStateProperty <em>Steady State Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.SteadyStateProperty
	 * @generated
	 */
	public Adapter createSteadyStatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.ConcentrationConstraint <em>Concentration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.ConcentrationConstraint
	 * @generated
	 */
	public Adapter createConcentrationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.IStateFormula <em>IState Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.IStateFormula
	 * @generated
	 */
	public Adapter createIStateFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.BinaryStateFormula <em>Binary State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.BinaryStateFormula
	 * @generated
	 */
	public Adapter createBinaryStateFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.NotStateFormula <em>Not State Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.NotStateFormula
	 * @generated
	 */
	public Adapter createNotStateFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.StateExpression <em>State Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.StateExpression
	 * @generated
	 */
	public Adapter createStateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roadblock.emf.ibl.Ibl.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roadblock.emf.ibl.Ibl.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IblAdapterFactory
