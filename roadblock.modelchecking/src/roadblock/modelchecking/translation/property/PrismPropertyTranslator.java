package roadblock.modelchecking.translation.property;

import java.util.ArrayList;
import java.util.List;

import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.BooleanOperator;
import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Chromosome;
import roadblock.emf.ibl.Ibl.ConcentrationConstraint;
import roadblock.emf.ibl.Ibl.ConcentrationUnit;
import roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.Kinetics;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.NotStateFormula;
import roadblock.emf.ibl.Ibl.Plasmid;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
import roadblock.emf.ibl.Ibl.RelationalOperator;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.emf.ibl.Ibl.StateExpression;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;
import roadblock.emf.ibl.Ibl.System;
import roadblock.emf.ibl.Ibl.TemporalOperator;
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeInterval;
import roadblock.emf.ibl.Ibl.TimeUnit;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;

public class PrismPropertyTranslator implements IPropertyTranslator {

	@Override
	public String visit(UnaryProbabilityProperty expression) {

		String pattern = "P%s [ %s%s %s ]";
		String probabilityConstraint = expression.getProbabilityConstraint()
				.accept(this);
		String temporalOperator = Translate(expression.getOperator());
		String timeConstraint = expression.getTimeConstraint().accept(this);
		String stateFormula = expression.getStateFormula().accept(this);
		List<String> initialConditions = new ArrayList<String>();

		for (PropertyInitialCondition initialCondition : expression
				.getInitialConditions()) {
			initialConditions.add(initialCondition.accept(this));
		}

		// initial conditions?

		return String.format(pattern, probabilityConstraint, temporalOperator,
				timeConstraint, stateFormula);

	}

	@Override
	public String visit(BinaryProbabilityProperty expression) {
		String pattern = "P%s [ %s %s%s %s ]";
		String probabilityConstraint = expression.getProbabilityConstraint()
				.accept(this);
		String temporalOperator = Translate(expression.getOperator());
		String timeConstraint = expression.getTimeConstraint().accept(this);
		String leftStateFormula = expression.getLeftOperand().accept(this);
		String rightStateFormula = expression.getRightOperand().accept(this);
		List<String> initialConditions = new ArrayList<String>();

		for (PropertyInitialCondition initialCondition : expression
				.getInitialConditions()) {
			initialConditions.add(initialCondition.accept(this));
		}

		// initial conditions?

		return String.format(pattern, probabilityConstraint, leftStateFormula,
				temporalOperator, timeConstraint, rightStateFormula);
	}

	@Override
	public String visit(SteadyStateProperty expression) {

		String pattern = "S%s [ %s ]";
		String probabilityConstraint = expression.getProbabilityConstraint()
				.accept(this);
		String stateFormula = expression.getStateFormula().accept(this);
		List<String> initialConditions = new ArrayList<String>();

		for (PropertyInitialCondition initialCondition : expression
				.getInitialConditions()) {
			initialConditions.add(initialCondition.accept(this));
		}

		// initial conditions?

		return String.format(pattern, probabilityConstraint, stateFormula);
	}

	@Override
	public String visit(RewardProperty expression) {

		String pattern = expression.getTimeConstraint().getOperator() == RelationalOperator.EQ ? "R{\"%s\"}=? [ I%s ]"
				: "R{\"%s\"}=? [ I%s ]";

		String rewardExpression = null;
		String timeConstraint = expression.getTimeConstraint().accept(this);
		String concentrationConstraint = expression
				.getConcentrationConstraint().accept(this);

		List<String> initialConditions = new ArrayList<String>();

		for (PropertyInitialCondition initialCondition : expression
				.getInitialConditions()) {
			initialConditions.add(initialCondition.accept(this));
		}

		// initial conditions?
		// variable and concentration?

		return String.format(pattern, rewardExpression, timeConstraint);
	}

	@Override
	public String visit(StateExpression expression) {

		String pattern = "%s %s %s %s";
		String relationalOperator = Translate(expression.getOperator());
		String unit = Translate(expression.getUnit());

		// unit?

		return String.format(pattern, expression.getVariableName(),
				relationalOperator, expression.getQuantity(), unit);
	}

	@Override
	public String visit(NotStateFormula expression) {

		String pattern = "! (%s)";
		String stateFormula = expression.getNegatedOperand().accept(this);

		return String.format(pattern, stateFormula);
	}

	@Override
	public String visit(BinaryStateFormula expression) {

		String pattern = "(%s) %s (%s)";
		String leftFormula = expression.getLeftOperand().accept(this);
		String rightFormula = expression.getRightOperand().accept(this);
		String relationalOperator = Translate(expression.getOperator());

		return String.format(pattern, leftFormula, relationalOperator,
				rightFormula);
	}

	@Override
	public String visit(ConcreteProbabilityConstraint expression) {

		String pattern = "%s%.2f";
		String relationalOperator = Translate(expression.getOperator());

		return String
				.format(pattern, relationalOperator, expression.getBound());
	}

	@Override
	public String visit(UnknownProbabilityConstraint expression) {
		return "=?";
	}

	@Override
	public String visit(TimeInterval expression) {

		String pattern = "[ %d, %d ]";
		String timeUnit = Translate(expression.getUnit());

		// unit?

		return String.format(pattern, expression.getLowerBound(),
				expression.getUpperBound());
	}

	@Override
	public String visit(TimeInstant expression) {
		String pattern = "%s%d";
		String relationalOperator = Translate(expression.getOperator());
		String timeUnit = Translate(expression.getUnit());

		// unit?

		return String
				.format(pattern, relationalOperator, expression.getValue());
	}

	@Override
	public String visit(PropertyInitialCondition expression) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visit(ConcentrationConstraint expression) {
		String pattern = "%s%f";
		String relationalOperator = Translate(expression.getOperator());
		String timeUnit = Translate(expression.getUnit());

		// unit?

		return String
				.format(pattern, relationalOperator, expression.getValue());
	}

	private String Translate(TemporalOperator operator) {

		switch (operator) {
		case ALWAYS:
			return "G";
		case EVENTUALLY:
			return "F";
		case ALWAYS_EVENTUALLY:
			return "G F";
		case NOT_EVENTUALLY:
			return "G !";
		case UNTIL:
			return "U";
		case WEAK_UNTIL:
			return "W";
		case EVENTUALLY_ALWAYS:
			return "F G";
		default:
			return "";
		}
	}

	private String Translate(RelationalOperator operator) {

		switch (operator) {
		case GT:
			return ">";
		case GE:
			return ">=";
		case LT:
			return "<";
		case LE:
			return "<=";
		case EQ:
			return "==";
		case NE:
			return "!=";
		default:
			return "";
		}
	}

	private String Translate(BooleanOperator operator) {

		switch (operator) {
		case AND:
			return "&";
		case OR:
			return "|";
		case IMPLIES:
			return "=>";
		default:
			return "";
		}
	}

	private String Translate(TimeUnit unit) {

		switch (unit) {
		default:
			return "";
		}
	}

	private String Translate(ConcentrationUnit unit) {

		switch (unit) {
		default:
			return "";
		}
	}

	@Override
	public TranslationTarget getTarget() {
		return TranslationTarget.PRISM;
	}

	@Override
	public String visit(Model model) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Kinetics kinetics) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Rule rule) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(MolecularSpecies molecularSpecies) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Device device) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Cell cell) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(ATGCDirective atgc) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(System system) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Chromosome chromosome) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Plasmid plasmid) {
		throw new UnsupportedOperationException();
	}

}
