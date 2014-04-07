package roadblock.dataprocessing.model

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import roadblock.emf.ibl.Ibl.Cell
import roadblock.emf.ibl.Ibl.ConcentrationUnit
import roadblock.emf.ibl.Ibl.Device
import roadblock.emf.ibl.Ibl.EMFVariableAssignment
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.MolecularSpecies
import roadblock.emf.ibl.Ibl.RateUnit
import roadblock.emf.ibl.Ibl.Region
import roadblock.emf.ibl.Ibl.Rule
import roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject
import roadblock.xtext.ibl.ibl.CellBody
import roadblock.xtext.ibl.ibl.CellInstantiation
import roadblock.xtext.ibl.ibl.DeviceDefinition
import roadblock.xtext.ibl.ibl.FunctionDefinition
import roadblock.xtext.ibl.ibl.Model
import roadblock.xtext.ibl.ibl.Outside
import roadblock.xtext.ibl.ibl.PropertyDefinition
import roadblock.xtext.ibl.ibl.Quantity
import roadblock.xtext.ibl.ibl.RealConstant
import roadblock.xtext.ibl.ibl.RegionBody
import roadblock.xtext.ibl.ibl.RuleDefinition
import roadblock.xtext.ibl.ibl.RuleObject
import roadblock.xtext.ibl.ibl.StringConstant
import roadblock.xtext.ibl.ibl.VariableAssignment
import roadblock.xtext.ibl.ibl.VariableAttribute
import roadblock.xtext.ibl.ibl.VariableComplex
import roadblock.xtext.ibl.ibl.VariableDefinition
import roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn
import roadblock.xtext.ibl.ibl.VariableExpressionObject
import roadblock.xtext.ibl.ibl.VariableKind
import roadblock.xtext.ibl.ibl.VariableName
import roadblock.xtext.ibl.ibl.util.IblSwitch

class ModelBuilder extends IblSwitch<Object> {
	
	var modelFactory = IblFactory::eINSTANCE;
	
	var propertyBuilder = new PropertyBuilder();

	var emfModel = modelFactory.createModel;

	// useful constant
	val BIOLOGICALPART = #{'PROMOTER', 'GENE', 'RBS', 'SPACER', 'TERMINATOR'}

	def isPart(String molecule) {
		return BIOLOGICALPART.contains(molecule)
	}

	//
	// helpers to build the name of a variableKind (either VariableName or VariableComplex)
	//
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

	//
	def updateRule(Rule rule, EMFVariableAssignment variableAssignment) {

		// update its properties
		switch variableAssignment.variableAttribute {
			case 'forwardRate': rule =>
				[
					forwardRate = variableAssignment.amount;
					forwardRateUnit = getRateUnit(variableAssignment.unit)
				]
			case 'reverseRate': rule =>
				[
					reverseRate = variableAssignment.amount;
					reverseRateUnit = getRateUnit(variableAssignment.unit)
				]
			case 'rate': rule =>
				[
					forwardRate = variableAssignment.amount;
					forwardRateUnit = getRateUnit(variableAssignment.unit)
				]
		}
	}

	//
	//
	// 
	def populate(Model xtextModel) {
		return doSwitch(xtextModel) as roadblock.emf.ibl.Ibl.Model;
	}

	override caseModel(Model xtextModel) {
		println("in caseModel")

		emfModel.ID = "TheEMFmodel"
		emfModel.displayName = "The EMF Model"

		for (functionDefinition : xtextModel.members.filter(FunctionDefinition).toList) {
			val name = functionDefinition.name.buildVariableName
			switch functionDefinition.functionBody {
				RegionBody: {
					var region = functionDefinition.functionBody.doSwitch as Region
					region.displayName = name
					emfModel.regionList.add(region)
				}
				CellBody: {
					var cell = functionDefinition.functionBody.doSwitch as Cell
					cell.displayName = name
					emfModel.cellList.add(cell)
				}
			}
		}

		// remove the abstract classes
		emfModel.cellList.clear

		// variable assignment resolution
		// limited to rules and identical container for the time being
		for (variableAssignment : emfModel.eAllContents.toList.filter(EMFVariableAssignment)) {
			println(variableAssignment.variableName)
			val container = variableAssignment.eContainer
			var EObject variable
			switch container {
				Region: variable = (container as Region).ruleList.filter[displayName == variableAssignment.variableName].
					head
				Cell: variable = (container as Cell).ruleList.filter[displayName == variableAssignment.variableName].
					head
				Device: variable = (container as Device).ruleList.filter[displayName == variableAssignment.variableName].
					head
			}

			switch variable {
				Rule: updateRule(variable, variableAssignment)
			}

			EcoreUtil.delete(variableAssignment)

		}

		return emfModel;
	}

	override caseCellBody(CellBody cellBody) {
		println("in caseCellBody")
		var cell = modelFactory.createCell
		for (member : cellBody.functionContent.members) {
			switch member {
				RuleDefinition: cell.ruleList.add(member.doSwitch as Rule)
				DeviceDefinition: cell.deviceList.add(member.doSwitch as Device)
				VariableDefinition: cell.moleculeList.add(member.definition.doSwitch as MolecularSpecies)
				VariableAssignment: cell.variableAssignmentList.add(member.doSwitch as EMFVariableAssignment)
				PropertyDefinition: cell.properties.add(propertyBuilder.build(member.property))
			}
		}

		return cell
	}

	override caseRegionBody(RegionBody regionBody) {
		println("in caseRegionBody")
		var region = modelFactory.createRegion
		for (member : regionBody.functionContent.members) {
			switch member {
				CellInstantiation: region.cellList.add(member.doSwitch as Cell)
				RuleDefinition: region.ruleList.add(member.doSwitch as Rule)
				VariableDefinition: region.moleculeList.add(member.definition.doSwitch as MolecularSpecies)
				VariableAssignment: region.variableAssignmentList.add(member.doSwitch as EMFVariableAssignment)
			}

		}
		return region
	}

	override caseCellInstantiation(CellInstantiation cellInstantiation) {

		// look for its definition
		val className = cellInstantiation.constructor.name

		// create an instantiated copy
		var cell = EcoreUtil.copy(emfModel.cellList.filter[displayName == className].head)
		cell.displayName = cellInstantiation.name.buildVariableName

		return cell
	}

	override caseRuleDefinition(RuleDefinition ruleDefinition) {
		val rule = modelFactory.createRule
		rule.displayName = ruleDefinition.name.buildVariableName
		for (part : ruleDefinition.lhs)
			rule.leftHandSide.add(part.doSwitch as MolecularSpecies)

		for (part : ruleDefinition.rhs)
			rule.rightHandSide.add(part.doSwitch as MolecularSpecies)

		rule.isBidirectional = ruleDefinition.reversible
		rule.setForwardRate(1.0)
		if(rule.isBidirectional) rule.setReverseRate(1.0) else rule.setReverseRate(0.0)
		return rule
	}

	override caseDeviceDefinition(DeviceDefinition deviceDefinition) {
		var device = modelFactory.createDevice
		device.displayName = deviceDefinition.name.buildVariableName

		for (rule : deviceDefinition.members.filter(RuleDefinition)) {
			device.ruleList.add(rule.doSwitch as Rule)
		}

		for (member : deviceDefinition.members) {
			switch member {
				RuleDefinition: device.ruleList.add(member.doSwitch as Rule)
				VariableDefinition: device.moleculeList.add(member.definition.doSwitch as MolecularSpecies)
				VariableAssignment: device.variableAssignmentList.add(member.doSwitch as EMFVariableAssignment)
				PropertyDefinition: device.properties.add(propertyBuilder.build(member.property))
			}
		}
		
		return device
	}

	override caseRuleObject(RuleObject ruleObject) {
		var molecule = modelFactory.createMolecularSpecies

		switch ruleObject {
			VariableKind: molecule.displayName = ruleObject.buildVariableName
			Outside: molecule => [displayName = "OUTSIDE"; biologicalType = 'OUTSIDE']
		}

		return molecule

	}

	override caseVariableDefinitionBuiltIn(VariableDefinitionBuiltIn variableDefinition) {
		val molecule = modelFactory.createMolecularSpecies

		molecule => [
			biologicalType = variableDefinition.type
			displayName = variableDefinition.name.buildVariableName
			degradationRateUnit = 's^-1'
			bindingRateUnit = 's^-1'
			unbindingRateUnit = 's^-1'
		]

		// Defaults for parts and molecules
		if (isPart(molecule.biologicalType))
			molecule => [
				amount = 1.0;
				unit = getConcentrationUnit('molecule');
				degradationRate = 0.0;
				bindingRate = 1.0;
				unbindingRate = 1.0
			]
		else
			molecule => [
				amount = 0.0;
				unit = getConcentrationUnit('uM');
				degradationRate = 1.0
				bindingRate = 1.0;
				unbindingRate = 1.0
			]

		// defaults are overriden if specified in the constructor
		for (parameter : variableDefinition.parameters) {
			switch parameter.name.buildVariableName {
				case 'displayID':
					molecule.displayName = parameter.value.doSwitch as String
				case 'concentration': {
					val q = parameter.value.doSwitch as Quantity;
					molecule => [amount = Double.parseDouble(q.value); unit = getConcentrationUnit(q.units)]
				}
				case 'URI':
					molecule.URI = parameter.value.doSwitch as String
				case 'degradationRate': {
					val q = parameter.value.doSwitch as Quantity;
					molecule => [degradationRate = Double.parseDouble(q.value); unit = getConcentrationUnit(q.units)]
				}
				case 'bindingRate': {
					val q = parameter.value.doSwitch as Quantity;
					molecule => [bindingRate = Double.parseDouble(q.value); unit = getConcentrationUnit(q.units)]
				}
				case 'unbindingRate': {
					val q = parameter.value.doSwitch as Quantity;
					molecule => [unbindingRate = Double.parseDouble(q.value); unit = getConcentrationUnit(q.units)]
				}
			}

		}

		molecule.ID = molecule.getURI?.toString ?: molecule.displayName
		return molecule
	}

	override caseVariableExpressionObject(VariableExpressionObject variableExpressionObject) {
		switch variableExpressionObject {
			AtomicVariableExpressionObject: return variableExpressionObject.doSwitch as String
		}

	}

	override caseAtomicVariableExpressionObject(AtomicVariableExpressionObject atomicVariableExpressionObject) {
		switch atomicVariableExpressionObject {
			RealConstant: return atomicVariableExpressionObject.value
			StringConstant: return atomicVariableExpressionObject.string
			Quantity: return atomicVariableExpressionObject.quantity
		}
	}

	override caseVariableAssignment(VariableAssignment variableAssignment) {
		val emfVariableAssignment = modelFactory.createEMFVariableAssignment

		val variable = variableAssignment.variable
		switch variable {
			VariableName:
				emfVariableAssignment => [
					variableName = variable.name
					variableAttribute = ''
				]
			VariableAttribute:
				emfVariableAssignment => [
					variableName = variable.name.buildVariableName
					variableAttribute = variable.attribute.name
				]
			default:
				emfVariableAssignment => [variableName = 'NOT IMPLEMENTED'; variableAttribute = 'NOT IMPLEMENTED']
		}

		val expression = variableAssignment.expression.members.head.doSwitch
		switch expression {
			Quantity:
				emfVariableAssignment => [
					amount = Double.parseDouble(expression.value)
					unit = expression.units
				]
			default:
				emfVariableAssignment => [amount = -111; unit = 'NOT IMPLEMENTED']
		}

		return emfVariableAssignment
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
	
	private def getRateUnit(String unit) {
		switch unit {
			case "s^-1": RateUnit.PER_SECOND
			case "min^-1": RateUnit.PER_MINUTE
		}
	}
}
