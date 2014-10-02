package roadblock.modelchecking.translation.property;

import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.BooleanOperator;
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
import roadblock.emf.ibl.Ibl.RelationalOperator;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.emf.ibl.Ibl.StateExpression;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;
import roadblock.emf.ibl.Ibl.System;
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeInterval;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;
import roadblock.modelchecking.ModelcheckingTarget;

public class NuSmvTranslator implements IPropertyTranslator {

	@Override
	public String visit(UnaryProbabilityProperty expression) {

		String pattern = null;

		switch (expression.getOperator()) {
		case ALWAYS:
			pattern = "AG (%s)";
			break;
		case EVENTUALLY:
			pattern = "EF (%s)";
			break;
		case ALWAYS_EVENTUALLY:
			pattern = "AG (EF (%s))";
			break;
		case NOT_EVENTUALLY:
			pattern = "!(EF (%s))";
			break;
		case EVENTUALLY_ALWAYS:
			pattern = "AF (AG (%s))";
			break;
		default:
			break;
		}

		String stateFormula = expression.getStateFormula().accept(this);

		return String.format(pattern, stateFormula);
	}

	@Override
	public String visit(BinaryProbabilityProperty expression) {

		String pattern = null;

		switch (expression.getOperator()) {
		case UNTIL:
			pattern = "A [(%s) U (%s)]";
			break;
		case FOLLOWED_BY:
			pattern = "AG ((%s) -> EF (%s))";
			break;
		default:
			break;
		}

		String leftStateFormula = expression.getLeftOperand().accept(this);
		String rightStateFormula = expression.getRightOperand().accept(this);

		return String.format(pattern, leftStateFormula, rightStateFormula);
	}

	@Override
	public String visit(SteadyStateProperty expression) {

		String pattern = "AF (AG (%s))";

		String stateFormula = expression.getStateFormula().accept(this);

		return String.format(pattern, stateFormula);
	}

	@Override
	public String visit(StateExpression expression) {

		String pattern = "%s %s %s";
		String variableName = doTranslateName(expression.getVariableName());
		String relationalOperator = Translate(expression.getOperator());

		return String.format(pattern, variableName, relationalOperator, (int)expression.getQuantity());
	}

	@Override
	public String visit(NotStateFormula expression) {

		String pattern = "!(%s)";
		String stateFormula = expression.getNegatedOperand().accept(this);

		return String.format(pattern, stateFormula);
	}

	@Override
	public String visit(BinaryStateFormula expression) {

		String pattern = "(%s) %s (%s)";
		String leftFormula = expression.getLeftOperand().accept(this);
		String rightFormula = expression.getRightOperand().accept(this);
		String relationalOperator = Translate(expression.getOperator());

		return String.format(pattern, leftFormula, relationalOperator, rightFormula);
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
			return "=";
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
			return "->";
		default:
			return "";
		}
	}

	private String doTranslateName(String moleculeName) {
		return moleculeName.replace("~", "_");
	}

	@Override
	public ModelcheckingTarget getTarget() {
		return ModelcheckingTarget.NUSMV;
	}

	@Override
	public String visit(RewardProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(ConcreteProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(UnknownProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(TimeInterval expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(TimeInstant expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(ConcentrationConstraint expression) {
		throw new UnsupportedOperationException();
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

	@Override
	public String visit(FlatModel flatModel) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Region region) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(PropertyInitialCondition expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(EMFVariableAssignment expression) {
		throw new UnsupportedOperationException();
	}
}
