package roadblock.dataprocessing.model

import org.eclipse.emf.ecore.EObject
import roadblock.dataprocessing.util.UnitConverter
import roadblock.emf.ibl.Ibl.ArithmeticOperator
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty
import roadblock.emf.ibl.Ibl.BooleanOperator
import roadblock.emf.ibl.Ibl.ConcentrationUnit
import roadblock.emf.ibl.Ibl.IArithmeticOperand
import roadblock.emf.ibl.Ibl.IProbabilityConstraint
import roadblock.emf.ibl.Ibl.IProperty
import roadblock.emf.ibl.Ibl.IStateFormula
import roadblock.emf.ibl.Ibl.ITimeConstraint
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.MonotonicityType
import roadblock.emf.ibl.Ibl.RelationalOperator
import roadblock.emf.ibl.Ibl.SteadyStateProperty
import roadblock.emf.ibl.Ibl.TemporalPattern
import roadblock.emf.ibl.Ibl.TimeUnit
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty
import roadblock.emf.ibl.Ibl.VariableReference
import roadblock.xtext.ibl.ibl.AdditionSubtractionExpression
import roadblock.xtext.ibl.ibl.ArithmeticOperand
import roadblock.xtext.ibl.ibl.ConcentrationConstraint
import roadblock.xtext.ibl.ibl.MultiplicationDivisionExpression
import roadblock.xtext.ibl.ibl.ProbabilityConstraint
import roadblock.xtext.ibl.ibl.ProbabilityProperty
import roadblock.xtext.ibl.ibl.PropertyDefinition
import roadblock.xtext.ibl.ibl.PropertyInitialCondition
import roadblock.xtext.ibl.ibl.PropertyVariableReference
import roadblock.xtext.ibl.ibl.RewardProperty
import roadblock.xtext.ibl.ibl.RewardTimeInstant
import roadblock.xtext.ibl.ibl.StateExpression
import roadblock.xtext.ibl.ibl.StateFormula
import roadblock.xtext.ibl.ibl.TimeInstant
import roadblock.xtext.ibl.ibl.TimeInterval
import roadblock.xtext.ibl.ibl.VariableComplex
import roadblock.xtext.ibl.ibl.VariableKind
import roadblock.xtext.ibl.ibl.VariableName
import roadblock.xtext.ibl.ibl.util.IblSwitch
import roadblock.xtext.ibl.ibl.ConcentrationQuantity

public class PropertyBuilder extends IblSwitch<Object> {

	var modelFactory = IblFactory::eINSTANCE;

	// helpers to build the name of a variableKind (either VariableName or VariableComplex)
	def buildVariableName(VariableName variableName) {
		variableName.name
	}

	def buildVariableName(VariableComplex variableComplex) {
		variableComplex.components.map[name].join('~')
	}

	def buildVariableName(VariableKind variableKind) {
		switch variableKind {
			VariableName: buildVariableName(variableKind)
			VariableComplex: buildVariableName(variableKind)
		}
	}

	// property population  
	def build(EObject property) {

		switch property {
			PropertyDefinition: (property as PropertyDefinition).doSwitch() as IProperty
			ProbabilityProperty: (property as ProbabilityProperty).doSwitch() as IProperty
			RewardProperty: (property as RewardProperty).doSwitch() as IProperty
		}
	}

	override casePropertyDefinition(PropertyDefinition property) {
		return property.property.doSwitch();
	}

	override caseProbabilityProperty(ProbabilityProperty probabilityProperty) {

		var property = null as IProperty;

		if(probabilityProperty.isAlways || probabilityProperty.isEventually || probabilityProperty.isNever || probabilityProperty.isInfinitelyOften) {
			property = createUnaryProbabilityProperty(probabilityProperty);
		} else if(probabilityProperty.isUntilThen || probabilityProperty.isFollowedBy) {
			property = createBinaryProbabilityProperty(probabilityProperty);
		} else if(probabilityProperty.isSteadyState) {
			property = createSteadyStateProperty(probabilityProperty);
		}

		return property;
	}

	override caseRewardProperty(RewardProperty rewardProperty) {

		var property = modelFactory.createRewardProperty;

		property.setVariable(doSwitch(rewardProperty.variable) as VariableReference);
		property.timeConstraint = doSwitch(rewardProperty.timeInstant) as roadblock.emf.ibl.Ibl.TimeInstant;
		property.concentrationConstraint = doSwitch(rewardProperty.concentrationConstraint) as roadblock.emf.ibl.Ibl.ConcentrationConstraint;
		property.initialConditions.addAll(rewardProperty.initialConditions.map[i|doSwitch(i) as PropertyInitialCondition]);

		return property;
	}

	override caseTimeInstant(TimeInstant timeInstant) {

		var timeConstraint = modelFactory.createTimeInstant;

		if(timeInstant.isEqualTo) {
			timeConstraint.operator = RelationalOperator.EQ;
		} else if(timeInstant.isLessThanOrEqual) {
			timeConstraint.operator = RelationalOperator.LE;
		} else if(timeInstant.isGreaterThanOrEqual) {
			timeConstraint.operator = RelationalOperator.GE;
		}

		timeConstraint.value = UnitConverter.instance.getBaseTime(timeInstant.timeInstant, getTimeUnit(timeInstant.timeUnit));
		timeConstraint.unit = TimeUnit.SECOND;

		return timeConstraint;
	}

	override caseTimeInterval(TimeInterval timeInterval) {

		var timeConstraint = modelFactory.createTimeInterval;
		var unit = getTimeUnit(timeInterval.timeUnit);

		timeConstraint.lowerBound = UnitConverter.instance.getBaseTime(timeInterval.lowerBound, unit);
		timeConstraint.upperBound = UnitConverter.instance.getBaseTime(timeInterval.upperBound, unit);
		timeConstraint.unit = TimeUnit.SECOND;

		return timeConstraint;
	}

	override caseRewardTimeInstant(RewardTimeInstant timeInstant) {

		var timeConstraint = modelFactory.createTimeInstant;

		if(timeInstant.isEqualTo) {
			timeConstraint.operator = RelationalOperator.EQ;
		} else if(timeInstant.isLessThanOrEqual) {
			timeConstraint.operator = RelationalOperator.LE;
		}

		timeConstraint.value = UnitConverter.instance.getBaseTime(timeInstant.timeValue, getTimeUnit(timeInstant.timeUnit));
		timeConstraint.unit = TimeUnit.SECOND;

		return timeConstraint;
	}

	override caseStateFormula(StateFormula stateFormula) {

		var formula = null as IStateFormula;

		if(stateFormula.isNegation) {
			var notStateFormula = modelFactory.createNotStateFormula;
			notStateFormula.negatedOperand = doSwitch(stateFormula.negatedFormula) as IStateFormula;
			formula = notStateFormula;
		} else if(stateFormula.isConjunction) {

			var binaryStateFormula = modelFactory.createBinaryStateFormula;
			binaryStateFormula.operator = BooleanOperator.AND;
			binaryStateFormula.leftOperand = doSwitch(stateFormula.leftFormula) as IStateFormula;
			binaryStateFormula.rightOperand = doSwitch(stateFormula.rightFormula) as IStateFormula;
			formula = binaryStateFormula;
		} else if(stateFormula.isDisjunction) {

			var binaryStateFormula = modelFactory.createBinaryStateFormula;
			binaryStateFormula.operator = BooleanOperator.OR;
			binaryStateFormula.leftOperand = doSwitch(stateFormula.leftFormula) as IStateFormula;
			binaryStateFormula.rightOperand = doSwitch(stateFormula.rightFormula) as IStateFormula;
			formula = binaryStateFormula;
		} else if(stateFormula.isImplication) {

			var binaryStateFormula = modelFactory.createBinaryStateFormula;
			binaryStateFormula.operator = BooleanOperator.IMPLIES;
			binaryStateFormula.leftOperand = doSwitch(stateFormula.leftFormula) as IStateFormula;
			binaryStateFormula.rightOperand = doSwitch(stateFormula.rightFormula) as IStateFormula;
			formula = binaryStateFormula;
		} else {
			formula = doSwitch(stateFormula.atomicFormula) as IStateFormula;
		}

		return formula;
	}

	override caseStateExpression(StateExpression stateExpression) {

		var expression = null as IStateFormula;

		var binaryStateFormula = modelFactory.createRelationalExpression

		binaryStateFormula.setLeftOperand(doSwitch(stateExpression.operand1) as IArithmeticOperand);
		binaryStateFormula.operator = getRelationalOperator(stateExpression.operator);
		binaryStateFormula.setRightOperand(doSwitch(stateExpression.operand2) as IArithmeticOperand);

		expression = binaryStateFormula;

		return expression;
	}

	override caseProbabilityConstraint(ProbabilityConstraint probabilityConstraint) {

		var probability = null as IProbabilityConstraint;

		if(probabilityConstraint.hasUnknownProbability) {
			probability = modelFactory.createUnknownProbabilityConstraint;
		} else {
			var concreteProbability = modelFactory.createConcreteProbabilityConstraint;
			concreteProbability.operator = getRelationalOperator(probabilityConstraint.operator);
			concreteProbability.bound = probabilityConstraint.probability;
			probability = concreteProbability;
		}

		return probability;
	}

	override casePropertyInitialCondition(PropertyInitialCondition propertyInitialCondition) {

		var initialCondition = modelFactory.createPropertyInitialCondition;

		initialCondition.variable = doSwitch(propertyInitialCondition.variable) as VariableReference
		initialCondition.amount = propertyInitialCondition.value.value;
		initialCondition.unit = getConcentrationUnit(propertyInitialCondition.value.unit);

		return initialCondition;
	}

	override caseConcentrationConstraint(ConcentrationConstraint concentrationConstraint) {

		var concentration = null as roadblock.emf.ibl.Ibl.ConcentrationConstraint;

		if(!concentrationConstraint.isUnknown) {

			concentration = modelFactory.createConcentrationConstraint;
			concentration.operator = getRelationalOperator(concentrationConstraint.operator);
			concentration.value = concentrationConstraint.value;
			concentration.unit = getConcentrationUnit(concentrationConstraint.unit);
		}

		return concentration;
	}

	override caseAdditionSubtractionExpression(AdditionSubtractionExpression additionSubtractionExpression) {

		var arithmeticOperand = null as IArithmeticOperand;

		if(additionSubtractionExpression.operand2 != null) {

			var arithmeticExpression = modelFactory.createBinaryArithmeticExpression

			arithmeticExpression.setLeftOperand(doSwitch(additionSubtractionExpression.operand1) as IArithmeticOperand);
			arithmeticExpression.operator = getArithmeticOperator(additionSubtractionExpression.operator);
			arithmeticExpression.setRightOperand(doSwitch(additionSubtractionExpression.operand2) as IArithmeticOperand);

			arithmeticOperand = arithmeticExpression;
		} else {
			arithmeticOperand = doSwitch(additionSubtractionExpression.operand1) as IArithmeticOperand;
		}

		return arithmeticOperand;
	}

	override caseMultiplicationDivisionExpression(MultiplicationDivisionExpression multiplicationDivisionExpression) {

		var arithmeticOperand = null as IArithmeticOperand;

		if(multiplicationDivisionExpression.operand2 != null) {

			var arithmeticExpression = modelFactory.createBinaryArithmeticExpression

			arithmeticExpression.setLeftOperand(doSwitch(multiplicationDivisionExpression.operand1) as IArithmeticOperand);
			arithmeticExpression.operator = getArithmeticOperator(multiplicationDivisionExpression.operator);
			arithmeticExpression.setRightOperand(doSwitch(multiplicationDivisionExpression.operand2) as IArithmeticOperand);

			arithmeticOperand = arithmeticExpression;
		} else {
			arithmeticOperand = doSwitch(multiplicationDivisionExpression.operand1) as IArithmeticOperand;
		}

		return arithmeticOperand;
	}

	override caseArithmeticOperand(ArithmeticOperand arithmeticOperand) {

		var operand = null as IArithmeticOperand;

		if(arithmeticOperand.variable != null) {
			var variable = doSwitch(arithmeticOperand.variable) as VariableReference
			variable.isMaximumOfInterest = arithmeticOperand.isMaximumOfInterest;
			operand = variable;
		} else if(arithmeticOperand.expression != null) {
			operand = doSwitch(arithmeticOperand.expression) as  IArithmeticOperand;
		} else if(arithmeticOperand.concentrationQuantity != null) {
			operand = doSwitch(arithmeticOperand.concentrationQuantity) as  IArithmeticOperand;
		} else {
			var numericLiteral = modelFactory.createNumericLiteral
			numericLiteral.value = arithmeticOperand.numericLiteral;
			operand = numericLiteral;
		}

		return operand;
	}
	
	override caseConcentrationQuantity(ConcentrationQuantity concentrationQuantity) {
		
		var concentration = modelFactory.createConcentrationQuantity;
		
		concentration.amount = concentrationQuantity.value;
		concentration.unit = getConcentrationUnit(concentrationQuantity.unit);
		
		return concentration;
	}

	override casePropertyVariableReference(PropertyVariableReference propertyVariableReference) {

		var variable = modelFactory.createVariableReference;

		variable.name = propertyVariableReference.name.buildVariableName;

		if(propertyVariableReference.container != null) {
			variable.containerName = propertyVariableReference.container.buildVariableName;
		}

		return variable;
	}

	private def UnaryProbabilityProperty createUnaryProbabilityProperty(ProbabilityProperty probabilityProperty) {

		var unaryProperty = modelFactory.createUnaryProbabilityProperty;
		unaryProperty.operator = getTemporalPattern(probabilityProperty);

		var stateFormula = null as IStateFormula;

		if(probabilityProperty.isIncreasing || probabilityProperty.isDecreasing) {

			var monotonicityExpression = modelFactory.createMonotonicityExpression
			monotonicityExpression.setType(getLeftMonotonicityType(probabilityProperty));
			monotonicityExpression.setVariable(doSwitch(probabilityProperty.variable1) as VariableReference);
			stateFormula = monotonicityExpression;
		} else {
			stateFormula = doSwitch(probabilityProperty.stateFormula1) as IStateFormula;
		}

		unaryProperty.stateFormula = stateFormula;
		unaryProperty.timeConstraint = getTimeConstraint(probabilityProperty);

		if(probabilityProperty.probabilityConstraint != null) {
			unaryProperty.probabilityConstraint = doSwitch(probabilityProperty.probabilityConstraint) as IProbabilityConstraint;
		}

		unaryProperty.initialConditions.addAll(probabilityProperty.initialConditions.map[i|doSwitch(i) as roadblock.emf.ibl.Ibl.PropertyInitialCondition]);

		return unaryProperty;
	}

	private def BinaryProbabilityProperty createBinaryProbabilityProperty(ProbabilityProperty probabilityProperty) {

		var binaryProperty = modelFactory.createBinaryProbabilityProperty;
		binaryProperty.operator = getTemporalPattern(probabilityProperty);

		var leftStateFormula = null as IStateFormula;
		var rightStateFormula = null as IStateFormula;

		if(probabilityProperty.isIncreasing1 || probabilityProperty.isDecreasing1) {

			var leftMonotonicityExpression = modelFactory.createMonotonicityExpression

			leftMonotonicityExpression.setType(getLeftMonotonicityType(probabilityProperty));
			leftMonotonicityExpression.setVariable(doSwitch(probabilityProperty.variable1) as VariableReference);
			leftStateFormula = leftMonotonicityExpression;
		} else {
			leftStateFormula = doSwitch(probabilityProperty.stateFormula1) as IStateFormula;
		}

		if(probabilityProperty.isIncreasing2 || probabilityProperty.isDecreasing2) {

			var rightMonotonicityExpression = modelFactory.createMonotonicityExpression

			rightMonotonicityExpression.setType(getRightMonotonicityType(probabilityProperty));
			rightMonotonicityExpression.setVariable(doSwitch(probabilityProperty.variable2) as VariableReference);
			rightStateFormula = rightMonotonicityExpression;
		} else {
			rightStateFormula = doSwitch(probabilityProperty.stateFormula2) as IStateFormula;
		}

		binaryProperty.leftOperand = leftStateFormula;
		binaryProperty.rightOperand = rightStateFormula;
		binaryProperty.timeConstraint = getTimeConstraint(probabilityProperty);

		if(probabilityProperty.probabilityConstraint != null) {
			binaryProperty.probabilityConstraint = doSwitch(probabilityProperty.probabilityConstraint) as IProbabilityConstraint;
		}

		binaryProperty.initialConditions.addAll(probabilityProperty.initialConditions.map[i|doSwitch(i) as PropertyInitialCondition]);

		return binaryProperty;
	}

	private def SteadyStateProperty createSteadyStateProperty(ProbabilityProperty probabilityProperty) {

		var steadyStateProperty = modelFactory.createSteadyStateProperty;

		steadyStateProperty.stateFormula = doSwitch(probabilityProperty.stateFormula1) as IStateFormula;

		if(probabilityProperty.probabilityConstraint != null) {
			steadyStateProperty.probabilityConstraint = doSwitch(probabilityProperty.probabilityConstraint) as IProbabilityConstraint;
		}

		steadyStateProperty.initialConditions.addAll(probabilityProperty.initialConditions.map[i|doSwitch(i) as PropertyInitialCondition]);

		return steadyStateProperty;
	}

	private def TemporalPattern getTemporalPattern(ProbabilityProperty probabilityProperty) {

		var temporalPattern = TemporalPattern.ALWAYS;

		if(probabilityProperty.isAlways) {
			temporalPattern = TemporalPattern.ALWAYS;
		} else if(probabilityProperty.isEventually) {
			temporalPattern = TemporalPattern.EVENTUALLY;
		} else if(probabilityProperty.isNever) {
			temporalPattern = TemporalPattern.NEVER;
		} else if(probabilityProperty.isInfinitelyOften) {
			temporalPattern = TemporalPattern.INFINITELY_OFTEN;
		} else if(probabilityProperty.isUntilThen) {
			temporalPattern = TemporalPattern.UNTIL;
		} else if(probabilityProperty.isFollowedBy) {
			temporalPattern = TemporalPattern.FOLLOWED_BY;
		}

		return temporalPattern;
	}

	private def MonotonicityType getLeftMonotonicityType(ProbabilityProperty probabilityProperty) {

		if(probabilityProperty.isIncreasing || probabilityProperty.isIncreasing1) {
			return MonotonicityType.INCREASING;
		} else
			return MonotonicityType.DECREASING;
	}

	private def MonotonicityType getRightMonotonicityType(ProbabilityProperty probabilityProperty) {

		if(probabilityProperty.isIncreasing2) {
			return MonotonicityType.INCREASING;
		} else
			return MonotonicityType.DECREASING;
	}

	private def getTimeConstraint(ProbabilityProperty probabilityProperty) {

		var timeConstraint = null as ITimeConstraint;

		if(probabilityProperty.timeInstant != null) {
			timeConstraint = doSwitch(probabilityProperty.timeInstant) as ITimeConstraint;
		} else if(probabilityProperty.timeInterval != null) {
			timeConstraint = doSwitch(probabilityProperty.timeInterval) as ITimeConstraint;
		}

		return timeConstraint;
	}

	private def getTimeUnit(String unit) {
		switch unit {
			case "s": TimeUnit.SECOND
			case "min": TimeUnit.MINUTE
		}
	}

	private def getRelationalOperator(String operator) {
		switch operator {
			case "==": RelationalOperator.EQ
			case "!=": RelationalOperator.NE
			case "<": RelationalOperator.LT
			case ">": RelationalOperator.GT
			case "<=": RelationalOperator.LE
			case ">=": RelationalOperator.GE
		}
	}

	private def getConcentrationUnit(String unit) {
		switch unit {
			case "M": ConcentrationUnit.M
			case "mM": ConcentrationUnit.MM
			case "uM": ConcentrationUnit.UM
			case "nM": ConcentrationUnit.NM
			case "pM": ConcentrationUnit.PM
			case "fM": ConcentrationUnit.FM
			case "molecule": ConcentrationUnit.MOLECULE
			case "molecules": ConcentrationUnit.MOLECULE
		}
	}

	private def getArithmeticOperator(String operator) {
		switch operator {
			case "+": ArithmeticOperator.ADDITION
			case "-": ArithmeticOperator.SUBTRACTION
			case "*": ArithmeticOperator.MULTIPLICATION
			case "/": ArithmeticOperator.DIVISION
		}
	}
}
