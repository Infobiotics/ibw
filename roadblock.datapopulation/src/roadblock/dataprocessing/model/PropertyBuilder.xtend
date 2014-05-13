package roadblock.dataprocessing.model

import org.eclipse.emf.ecore.EObject
import roadblock.dataprocessing.util.UnitConverter
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty
import roadblock.emf.ibl.Ibl.BooleanOperator
import roadblock.emf.ibl.Ibl.ConcentrationUnit
import roadblock.emf.ibl.Ibl.IProbabilityConstraint
import roadblock.emf.ibl.Ibl.IProperty
import roadblock.emf.ibl.Ibl.IStateFormula
import roadblock.emf.ibl.Ibl.ITimeConstraint
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.RelationalOperator
import roadblock.emf.ibl.Ibl.SteadyStateProperty
import roadblock.emf.ibl.Ibl.TemporalOperator
import roadblock.emf.ibl.Ibl.TimeUnit
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty
import roadblock.xtext.ibl.ibl.ConcentrationConstraint
import roadblock.xtext.ibl.ibl.ProbabilityConstraint
import roadblock.xtext.ibl.ibl.ProbabilityProperty
import roadblock.xtext.ibl.ibl.PropertyDefinition
import roadblock.xtext.ibl.ibl.PropertyInitialCondition
import roadblock.xtext.ibl.ibl.RewardProperty
import roadblock.xtext.ibl.ibl.RewardTimeInstant
import roadblock.xtext.ibl.ibl.StateExpression
import roadblock.xtext.ibl.ibl.StateFormula
import roadblock.xtext.ibl.ibl.TimeInstant
import roadblock.xtext.ibl.ibl.TimeInterval
import roadblock.xtext.ibl.ibl.VariableAttribute
import roadblock.xtext.ibl.ibl.VariableComplex
import roadblock.xtext.ibl.ibl.VariableKind
import roadblock.xtext.ibl.ibl.VariableName
import roadblock.xtext.ibl.ibl.util.IblSwitch

public class PropertyBuilder extends IblSwitch<Object> {

	var modelFactory = IblFactory::eINSTANCE;

	// helpers to build the name of a variableKind (either VariableName or VariableComplex)

	def buildVariableName(VariableName variableName){
		variableName.name
	}

	def buildVariableName(VariableComplex variableComplex){
		variableComplex.components.map[name].join('~')
	}
	
	def buildVariableName(VariableKind variableKind){
		switch variableKind {
			VariableName: buildVariableName(variableKind)
			VariableComplex: buildVariableName(variableKind)			
		}
	}

	// property checking population  
	
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
		var leftStateFormula = doSwitch(probabilityProperty.stateFormula1) as IStateFormula;

		if (probabilityProperty.isAlways) {
			var unaryProperty = modelFactory.createUnaryProbabilityProperty;
			unaryProperty.operator = TemporalOperator.ALWAYS;
			property = unaryProperty;
		} else if (probabilityProperty.isEventually) {
			var unaryProperty = modelFactory.createUnaryProbabilityProperty;
			unaryProperty.operator = TemporalOperator.EVENTUALLY;
			property = unaryProperty;
		} else if (probabilityProperty.isNever) {
			var unaryProperty = modelFactory.createUnaryProbabilityProperty;
			unaryProperty.operator = TemporalOperator.NOT_EVENTUALLY;
			property = unaryProperty;
		} else if (probabilityProperty.isInfinitelyOften) {
			var unaryProperty = modelFactory.createUnaryProbabilityProperty;
			unaryProperty.operator = TemporalOperator.ALWAYS_EVENTUALLY;
			property = unaryProperty;
		} else if (probabilityProperty.isUntilThen) {
			var binaryProperty = modelFactory.createBinaryProbabilityProperty;
			binaryProperty.operator = TemporalOperator.UNTIL;
			property = binaryProperty;
		} else if (probabilityProperty.isFollowedBy) {
			var binaryProperty = modelFactory.createBinaryProbabilityProperty;
			binaryProperty.operator = TemporalOperator.WEAK_UNTIL;
			property = binaryProperty;
		} else if (probabilityProperty.isSteadyState) {
			var steadyStateProperty = modelFactory.createSteadyStateProperty;
			property = steadyStateProperty;
		}

		if (property instanceof UnaryProbabilityProperty) {

			var unaryProperty = property as UnaryProbabilityProperty;
			unaryProperty.stateFormula = leftStateFormula;
			unaryProperty.timeConstraint = getTimeConstraint(probabilityProperty);

			if (probabilityProperty.probabilityConstraint != null) {
				unaryProperty.probabilityConstraint = doSwitch(probabilityProperty.probabilityConstraint) as IProbabilityConstraint;
			}

			unaryProperty.initialConditions.addAll(
				probabilityProperty.initialConditions.map[i|doSwitch(i) as roadblock.emf.ibl.Ibl.PropertyInitialCondition]);

		} else if (property instanceof BinaryProbabilityProperty) {

			var binaryProperty = property as BinaryProbabilityProperty;
			binaryProperty.leftOperand = leftStateFormula;
			binaryProperty.rightOperand = doSwitch(probabilityProperty.stateFormula2) as IStateFormula;
			binaryProperty.timeConstraint = getTimeConstraint(probabilityProperty);

			if (probabilityProperty.probabilityConstraint != null) {
				binaryProperty.probabilityConstraint = doSwitch(probabilityProperty.probabilityConstraint) as IProbabilityConstraint;
			}

			binaryProperty.initialConditions.addAll(
				probabilityProperty.initialConditions.map[i|doSwitch(i) as PropertyInitialCondition]);

		} else if (property instanceof SteadyStateProperty) {

			var steadyStateProperty = property as SteadyStateProperty;
			steadyStateProperty.stateFormula = leftStateFormula;

			if (probabilityProperty.probabilityConstraint != null) {
				steadyStateProperty.probabilityConstraint = doSwitch(probabilityProperty.probabilityConstraint) as IProbabilityConstraint;
			}

			steadyStateProperty.initialConditions.addAll(
				probabilityProperty.initialConditions.map[i|doSwitch(i) as PropertyInitialCondition]);

		}

		return property;
	}

	override caseRewardProperty(RewardProperty rewardProperty) {

		var property = modelFactory.createRewardProperty;

		property.variableName = rewardProperty.name.buildVariableName;
		property.timeConstraint = doSwitch(rewardProperty.timeInstant) as roadblock.emf.ibl.Ibl.TimeInstant;
		property.concentrationConstraint = doSwitch(rewardProperty.concentrationConstraint) as roadblock.emf.ibl.Ibl.ConcentrationConstraint;
		property.initialConditions.addAll(
			rewardProperty.initialConditions.map[i|doSwitch(i) as PropertyInitialCondition]);

		return property;
	}

	override caseTimeInstant(TimeInstant timeInstant) {

		var timeConstraint = modelFactory.createTimeInstant;

		if (timeInstant.isEqualTo) {
			timeConstraint.operator = RelationalOperator.EQ;
		} else if (timeInstant.isLessThanOrEqual) {
			timeConstraint.operator = RelationalOperator.LE;
		} else if (timeInstant.isGreaterThanOrEqual) {
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

		if (timeInstant.isEqualTo) {
			timeConstraint.operator = RelationalOperator.EQ;
		} else if (timeInstant.isLessThanOrEqual) {
			timeConstraint.operator = RelationalOperator.LE;
		}

		timeConstraint.value = UnitConverter.instance.getBaseTime(timeInstant.timeValue, getTimeUnit(timeInstant.timeUnit));
		timeConstraint.unit = TimeUnit.SECOND;

		return timeConstraint;
	}

	override caseStateFormula(StateFormula stateFormula) {

		var formula = null as IStateFormula;

		if (stateFormula.isNegation) {
			var notStateFormula = modelFactory.createNotStateFormula;
			notStateFormula.negatedOperand = doSwitch(stateFormula.negatedFormula) as IStateFormula;
			formula = notStateFormula;
		} else if (stateFormula.isConjunction) {

			var binaryStateFormula = modelFactory.createBinaryStateFormula;
			binaryStateFormula.operator = BooleanOperator.AND;
			binaryStateFormula.leftOperand = doSwitch(stateFormula.leftFormula) as IStateFormula;
			binaryStateFormula.rightOperand = doSwitch(stateFormula.rightFormula) as IStateFormula;
			formula = binaryStateFormula;
		} else if (stateFormula.isDisjunction) {

			var binaryStateFormula = modelFactory.createBinaryStateFormula;
			binaryStateFormula.operator = BooleanOperator.OR;
			binaryStateFormula.leftOperand = doSwitch(stateFormula.leftFormula) as IStateFormula;
			binaryStateFormula.rightOperand = doSwitch(stateFormula.rightFormula) as IStateFormula;
			formula = binaryStateFormula;
		} else if (stateFormula.isImplication) {

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

		var expression = modelFactory.createStateExpression;
		
		expression.variableName = stateExpression.name.buildVariableName;
		expression.operator = getRelationalOperator(stateExpression.operator);
		expression.quantity = Double.parseDouble(stateExpression.concentrationQuantity.value);
		expression.unit = getConcentrationUnit(stateExpression.concentrationQuantity.unit);

		return expression;
	}

	override caseProbabilityConstraint(ProbabilityConstraint probabilityConstraint) {

		var probability = null as IProbabilityConstraint;

		if (probabilityConstraint.hasUnknownProbability) {
			probability = modelFactory.createUnknownProbabilityConstraint;
		} else {
			var concreteProbability = modelFactory.createConcreteProbabilityConstraint;
			concreteProbability.operator = getRelationalOperator(probabilityConstraint.operator);
			concreteProbability.bound = Double.parseDouble(probabilityConstraint.probability);
			probability = concreteProbability;
		}

		return probability;
	}

	override casePropertyInitialCondition(PropertyInitialCondition propertyInitialCondition) {

		var initialCondition = modelFactory.createPropertyInitialCondition;
		//propertyInitialCondition.variable.

		val variable = propertyInitialCondition.variable;

		switch variable {
			VariableName:
				initialCondition => [
					variableName = variable.name
					variableAttribute = ''
				]
			VariableAttribute:
				initialCondition => [
					variableName = variable.name.buildVariableName
					variableAttribute = variable.attribute.name
				]
			default:
				initialCondition => [variableName = 'NOT IMPLEMENTED'; variableAttribute = 'NOT IMPLEMENTED']
		}
		
		initialCondition.amount = Double.parseDouble(propertyInitialCondition.value.value);
		initialCondition.unit = getConcentrationUnit(propertyInitialCondition.value.unit);

		return initialCondition;
	}

	override caseConcentrationConstraint(ConcentrationConstraint concentrationConstraint) {

		var concentration = null as roadblock.emf.ibl.Ibl.ConcentrationConstraint;

		if (!concentrationConstraint.isUnknown) {

			concentration = modelFactory.createConcentrationConstraint;
			concentration.operator = getRelationalOperator(concentrationConstraint.operator);
			concentration.value = Double.parseDouble(concentrationConstraint.value);
			concentration.unit = getConcentrationUnit(concentrationConstraint.unit);
		}

		return concentration;
	}

	private def getTimeConstraint(ProbabilityProperty probabilityProperty) {

		var timeConstraint = null as ITimeConstraint;

		if (probabilityProperty.timeInstant != null) {
			timeConstraint = doSwitch(probabilityProperty.timeInstant) as ITimeConstraint;
		} else if (probabilityProperty.timeInterval != null) {
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
}