package roadblock.modelchecking.filtering.property;

import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Chromosome;
import roadblock.emf.ibl.Ibl.ConcentrationConstraint;
import roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.EMFVariableAssignment;
import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.Kinetics;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.NotStateFormula;
import roadblock.emf.ibl.Ibl.Plasmid;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
import roadblock.emf.ibl.Ibl.Region;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.emf.ibl.Ibl.StateExpression;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;
import roadblock.emf.ibl.Ibl.System;
import roadblock.emf.ibl.Ibl.TemporalOperator;
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeInterval;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;
import roadblock.modelchecking.ModelcheckingTarget;

public class PrismPropertyFilter implements IPropertyFilter {

	@Override
	public Boolean visit(UnaryProbabilityProperty expression) {
		return expression.getOperator() != TemporalOperator.ALWAYS_EVENTUALLY ? true : false;
	}

	@Override
	public Boolean visit(BinaryProbabilityProperty expression) {
		return true;
	}

	@Override
	public Boolean visit(SteadyStateProperty expression) {
		return false;
	}

	@Override
	public Boolean visit(RewardProperty expression) {
		return true;
	}

	@Override
	public Boolean visit(StateExpression expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(NotStateFormula expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(BinaryStateFormula expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(ConcreteProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(UnknownProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(TimeInterval expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(TimeInstant expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(ConcentrationConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(Model model) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(Kinetics kinetics) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(Rule rule) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(MolecularSpecies molecularSpecies) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(Device device) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(Cell cell) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(ATGCDirective atgc) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(System system) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(Chromosome chromosome) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(Plasmid plasmid) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(FlatModel flatModel) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(Region region) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(PropertyInitialCondition expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Boolean visit(EMFVariableAssignment expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ModelcheckingTarget getTarget() {
		return ModelcheckingTarget.PRISM;
	}
}