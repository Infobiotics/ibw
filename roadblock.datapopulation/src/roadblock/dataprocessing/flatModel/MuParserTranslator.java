package roadblock.dataprocessing.flatModel;

import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.ArithmeticOperator;
import roadblock.emf.ibl.Ibl.BinaryArithmeticExpression;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.BooleanOperator;
import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Chromosome;
import roadblock.emf.ibl.Ibl.ConcentrationConstraint;
import roadblock.emf.ibl.Ibl.ConcentrationQuantity;
import roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.EMFVariableAssignment;
import roadblock.emf.ibl.Ibl.Event;
import roadblock.emf.ibl.Ibl.EventAssignment;
import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IArithmeticOperand;
import roadblock.emf.ibl.Ibl.IStateFormula;
import roadblock.emf.ibl.Ibl.IVisitor;
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
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeInterval;
import roadblock.emf.ibl.Ibl.TimeQuantity;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;
import roadblock.emf.ibl.Ibl.VariableReference;

public class MuParserTranslator implements IVisitor<String> {

	private static MuParserTranslator instance;

	public static MuParserTranslator getInstance() {

		if (instance == null) {
			instance = new MuParserTranslator();
		}

		return instance;
	}

	public String translate(IArithmeticOperand expression) {
		
		return expression.accept(this);
	}
	
	public String translate(IStateFormula expression) {

		return expression.accept(this);
	}
	
	@Override
	public String visit(NotStateFormula expression) {
		String negatedExpression = expression.accept(this);
		
		return String.format("! (%s)", negatedExpression); 
	}

	@Override
	public String visit(BinaryStateFormula expression) {
		String operator = translate(expression.getOperator());
		String leftOperand = expression.getLeftOperand().accept(this);
		String rightOperand = expression.getRightOperand().accept(this);
		
		return String.format("(%s) %s (%s)", leftOperand, operator, rightOperand);
	}
	
	@Override
	public String visit(BinaryArithmeticExpression expression) {
		String operator = translate(expression.getOperator());
		String leftOperand = expression.getLeftOperand().accept(this);
		String rightOperand = expression.getRightOperand().accept(this);
		
		return String.format("(%s %s %s)", leftOperand, operator, rightOperand);
	}
	
	@Override
	public String visit(RelationalExpression expression) {
		String operator = translate(expression.getOperator());
		String leftOperand = expression.getLeftOperand().accept(this);
		String rightOperand = expression.getRightOperand().accept(this);
		
		return String.format("%s %s %s", leftOperand, operator, rightOperand);
	}
	
	@Override
	public String visit(VariableReference expression) {
		return expression.getName();
	}
	
	@Override
	public String visit(ConcentrationQuantity expression) {
		return Double.toString(expression.getAmount());
	}
	
	@Override
	public String visit(TimeQuantity expression) {
		return Double.toString(expression.getAmount());
	}
	
	@Override
	public String visit(NumericLiteral expression) {
		return Double.toString(expression.getValue());
	}
	
	private String translate(RelationalOperator operator) {

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

	private String translate(BooleanOperator operator) {

		switch (operator) {
		case AND:
			return "&&";
		case OR:
			return "||";
		default:
			return "";
		}
	}

	private String translate(ArithmeticOperator operator) {

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

	/* unimplemented methods */
	
	@Override
	public String visit(Model model) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Region region) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Cell cell) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Device device) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Kinetics kinetics) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(UnaryProbabilityProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(BinaryProbabilityProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(RewardProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(SteadyStateProperty expression) {
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
	public String visit(PropertyInitialCondition expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(ConcentrationConstraint expression) {
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
	public String visit(MonotonicityExpression expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(FlatModel flatModel) {
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
	public String visit(MolecularSpecies molecularSpecies) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(Rule rule) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String visit(EMFVariableAssignment expression) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String visit(Event event) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String visit(EventAssignment eventAssignment) {
		throw new UnsupportedOperationException();
	}
}
