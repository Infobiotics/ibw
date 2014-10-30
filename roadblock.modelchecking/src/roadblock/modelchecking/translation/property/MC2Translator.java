package roadblock.modelchecking.translation.property;

import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.ArithmeticOperator;
import roadblock.emf.ibl.Ibl.BinaryArithmeticExpression;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.BooleanOperator;
import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Chromosome;
import roadblock.emf.ibl.Ibl.ConcentrationConstraint;
import roadblock.emf.ibl.Ibl.ConcentrationExpression;
import roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.EMFVariableAssignment;
import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IProbabilityConstraint;
import roadblock.emf.ibl.Ibl.ITimeConstraint;
import roadblock.emf.ibl.Ibl.Kinetics;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.MonotonicityExpression;
import roadblock.emf.ibl.Ibl.NotStateFormula;
import roadblock.emf.ibl.Ibl.NumericLiteral;
import roadblock.emf.ibl.Ibl.Plasmid;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
import roadblock.emf.ibl.Ibl.Region;
import roadblock.emf.ibl.Ibl.RelationalExpression;
import roadblock.emf.ibl.Ibl.RelationalOperator;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;
import roadblock.emf.ibl.Ibl.System;
import roadblock.emf.ibl.Ibl.TemporalPattern;
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeInterval;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;
import roadblock.emf.ibl.Ibl.VariableReference;
import roadblock.modelchecking.ModelcheckingTarget;

public class MC2Translator implements IPropertyTranslator {

	@Override
	public String visit(UnaryProbabilityProperty expression) {

		String translation = null;

		IProbabilityConstraint pc = expression.getProbabilityConstraint();
		ITimeConstraint tc = expression.getTimeConstraint();

		String probabilityConstraint = pc != null ? pc.accept(this) : ">0";
		String temporalPattern = Translate(expression.getOperator());
		String stateFormula = expression.getStateFormula().accept(this);

		if (tc != null) {
			String pattern = "P%s [ %s (%s ^ %s) ]";
			String timeConstraint = tc.accept(this);

			translation = String.format(pattern, probabilityConstraint, temporalPattern, stateFormula, timeConstraint);
		} else {
			String pattern = "P%s [ %s (%s) ]";
			translation = String.format(pattern, probabilityConstraint, temporalPattern, stateFormula);
		}

		return translation;

	}

	@Override
	public String visit(BinaryProbabilityProperty expression) {

		String translation = null;

		IProbabilityConstraint pc = expression.getProbabilityConstraint();
		ITimeConstraint tc = expression.getTimeConstraint();

		String probabilityConstraint = pc != null ? pc.accept(this) : ">0";
		String leftStateFormula = expression.getLeftOperand().accept(this);
		String rightStateFormula = expression.getRightOperand().accept(this);

		if (expression.getOperator() == TemporalPattern.FOLLOWED_BY) {
			if (tc != null) {
				String pattern = "P%s [ G ((%s) => F (%s ^ %s)) ]";
				String timeConstraint = tc.accept(this);

				translation = String.format(pattern, probabilityConstraint, leftStateFormula, rightStateFormula, timeConstraint);
			} else {
				String pattern = "P%s [ G ((%s) => F (%s)) ]";
				translation = String.format(pattern, probabilityConstraint, leftStateFormula, rightStateFormula);
			}
		} else if (expression.getOperator() == TemporalPattern.UNTIL) {
			if (tc != null) {
				String pattern = "P%s [ (%s) U (%s ^ %s) ]";
				String timeConstraint = tc.accept(this);

				translation = String.format(pattern, probabilityConstraint, leftStateFormula, rightStateFormula, timeConstraint);
			} else {
				String pattern = "P%s [ (%s) U (%s) ]";
				translation = String.format(pattern, probabilityConstraint, leftStateFormula, rightStateFormula);
			}
		}

		return translation;
	}

	@Override
	public String visit(SteadyStateProperty expression) {

		String pattern = "P%s [ F G (%s) ]";

		IProbabilityConstraint pc = expression.getProbabilityConstraint();

		String probabilityConstraint = pc != null ? pc.accept(this) : ">0";
		String stateFormula = expression.getStateFormula().accept(this);

		return String.format(pattern, probabilityConstraint, stateFormula);
	}

	@Override
	public String visit(ConcentrationExpression expression) {

		String pattern = "%s %s %s";
		String variableName = expression.getVariable().accept(this);
		String relationalOperator = Translate(expression.getOperator());

		return String.format(pattern, variableName, relationalOperator, expression.getQuantity());
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

		return String.format(pattern, leftFormula, relationalOperator, rightFormula);
	}

	@Override
	public String visit(MonotonicityExpression expression) {

		String translation = null;
		String variableName = expression.getVariable().accept(this);

		switch (expression.getType()) {
		case INCREASING:
			String pattern = "d%s > 0";
			translation = String.format(pattern, variableName);
			break;
		case DECREASING:
			pattern = "d%s < 0";
			translation = String.format(pattern, variableName);
			break;
		default:
			break;
		}

		return translation;
	}

	@Override
	public String visit(ConcreteProbabilityConstraint expression) {

		String pattern = "%s%.2f";
		String relationalOperator = Translate(expression.getOperator());

		return String.format(pattern, relationalOperator, expression.getBound());
	}

	@Override
	public String visit(UnknownProbabilityConstraint expression) {
		return "=?";
	}

	@Override
	public String visit(TimeInterval expression) {

		String pattern = "[time] >= %d ^ [time] <= %d";

		return String.format(pattern, expression.getLowerBound(), expression.getUpperBound());
	}

	@Override
	public String visit(TimeInstant expression) {
		String pattern = "[time] %s %d";
		String relationalOperator = Translate(expression.getOperator());

		return String.format(pattern, relationalOperator, expression.getValue());
	}

	@Override
	public String visit(BinaryArithmeticExpression expression) {
		String pattern = "(%s %s %s)";

		String leftOperand = expression.getLeftOperand().accept(this);
		String arithmeticOperator = Translate(expression.getOperator());
		String rightOperand = expression.getRightOperand().accept(this);

		return String.format(pattern, leftOperand, arithmeticOperator, rightOperand);
	}

	@Override
	public String visit(RelationalExpression expression) {
		String pattern = "%s %s %s";

		String leftOperand = expression.getLeftOperand().accept(this);
		String relationalOperator = Translate(expression.getOperator());
		String rightOperand = expression.getRightOperand().accept(this);

		return String.format(pattern, leftOperand, relationalOperator, rightOperand);
	}

	@Override
	public String visit(VariableReference variable) {

		String translation = null;
		String variableName = doTranslateName(variable.getName());

		if (variable.isIsMaximumOfInterest()) {
			String pattern = "max[%s]";
			translation = String.format(pattern, variableName);
		} else {
			String pattern = "[%s]";
			translation = String.format(pattern, variableName);
		}
		
		return translation;
	}

	@Override
	public String visit(NumericLiteral expression) {
		return Double.toString(expression.getValue());
	}

	private String Translate(TemporalPattern operator) {

		switch (operator) {
		case ALWAYS:
			return "G";
		case EVENTUALLY:
			return "F";
		case INFINITELY_OFTEN:
			return "G F";
		case NEVER:
			return "G !";
		case UNTIL:
			return "U";
		case STEADY_STATE:
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
			return "=>";
		default:
			return "";
		}
	}

	private String Translate(ArithmeticOperator operator) {

		switch (operator) {
		case ADDITION:
			return "+";
		case SUBTRACTION:
			return "-";
		case MULTIPLICATION:
			return "*";
		case DIVISION:
			return "/";
		default:
			return "";
		}
	}

	private String doTranslateName(String moleculeName) {
		return moleculeName.replace("~", "_");
	}

	@Override
	public ModelcheckingTarget getTarget() {
		return ModelcheckingTarget.PRISM;
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
	public String visit(RewardProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(ConcentrationConstraint expression) {
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
