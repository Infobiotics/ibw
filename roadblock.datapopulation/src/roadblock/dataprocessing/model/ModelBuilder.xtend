package roadblock.dataprocessing.model

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import roadblock.emf.ibl.Ibl.ATGCArrange
import roadblock.emf.ibl.Ibl.ATGCDirective
import roadblock.emf.ibl.Ibl.Cell
import roadblock.emf.ibl.Ibl.ConcentrationUnit
import roadblock.emf.ibl.Ibl.Device
import roadblock.emf.ibl.Ibl.EMFVariableAssignment
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.MolecularSpecies
import roadblock.emf.ibl.Ibl.RateUnit
import roadblock.emf.ibl.Ibl.Region
import roadblock.emf.ibl.Ibl.Rule
import roadblock.xtext.ibl.ibl.ATGCCloningSites
import roadblock.xtext.ibl.ibl.ATGCDefinition
import roadblock.xtext.ibl.ibl.ATGCDirection
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
import roadblock.xtext.ibl.ibl.VariableKind2
import roadblock.xtext.ibl.ibl.VariableType
import roadblock.xtext.ibl.ibl.VariableName
import roadblock.xtext.ibl.ibl.util.IblSwitch

class ModelBuilder extends IblSwitch<Object> {

	var modelFactory = IblFactory::eINSTANCE;

	var propertyBuilder = new PropertyBuilder();

	var emfModel = modelFactory.createModel;

	// useful constant
	val BIOLOGICALPART = #{'PROMOTER', 'GENE', 'RBS', 'SPACER', 'TERMINATOR'}

	def isPart(String biologicalType) {
		return BIOLOGICALPART.contains(biologicalType)
	}

	def isComplex(String name) {
			name.contains('~')
	}

	def addComplexToContainer(List<MolecularSpecies> moleculeList, String complexName) {
		if (moleculeList.filter[displayName == complexName].size == 0) {
			val complex = modelFactory.createMolecularSpecies
			complex => [displayName = complexName 
				biologicalType = 'COMPLEX' 
				amount = 0.0
				unit = ConcentrationUnit.UM
				]
			moleculeList.add(complex)			
		}
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
	
	def buildVariableName(VariableKind2 variableKind) {
		switch variableKind {
			VariableName: buildVariableName(variableKind)
			VariableType: variableKind.name
			default:"UNKNOWNTYPEFROMbuildVariableNameVK2"
		}
	}

	// helper to find first declaration of variable given its displayName from local container upwards
	def MolecularSpecies searchFirstDeclaration(EObject container, String displayName) {

		// look among molecularSpecies at current level
		// return it if found
		switch (container) {
			Device: {
				val molecules = container.moleculeList.filter[it.displayName == displayName];
				if(!molecules.empty) return molecules.head
			}
			Cell: {
				val molecules = container.moleculeList.filter[it.displayName == displayName];
				if(!molecules.empty) return molecules.head
			}
			Region: {
				val molecules = container.moleculeList.filter[it.displayName == displayName];
				if(!molecules.empty) return molecules.head
			}
			roadblock.emf.ibl.Ibl.Model: {
				var molecule = modelFactory.createMolecularSpecies
				molecule.displayName = 'UNKNOWN REFERENCE: ' + displayName
				molecule.biologicalType = 'UNKNOWN'
				return molecule
			}
		}

		// else search in next container
		return searchFirstDeclaration(container.eContainer, displayName)
	}

	//
	def updateRule(Rule rule, EMFVariableAssignment variableAssignment) {

		// update its properties
		switch variableAssignment.variableAttribute {
			case 'forwardRate':
				rule => [
					forwardRate = variableAssignment.amount;
					forwardRateUnit = getRateUnit(variableAssignment.unit)
				]
			case 'reverseRate':
				rule => [
					reverseRate = variableAssignment.amount;
					reverseRateUnit = getRateUnit(variableAssignment.unit)
				]
			case 'rate':
				rule => [
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
				Region:
					variable = (container as Region).ruleList.filter[displayName == variableAssignment.variableName].
						head
				Cell:
					variable = (container as Cell).ruleList.filter[displayName == variableAssignment.variableName].head
				Device:
					variable = (container as Device).ruleList.filter[displayName == variableAssignment.variableName].
						head
			}

			switch variable {
				Rule: updateRule(variable, variableAssignment)
			}

			EcoreUtil.delete(variableAssignment)

		}

		// create molecular species instances for complexes
		// go through every rules		
		for (rule : emfModel.eAllContents.toList.filter(Rule)) {

			// build list of complexes
			var complexList = rule.leftHandSide.filter[displayName.complex].map[displayName].toList
			complexList.addAll(rule.rightHandSide.filter[displayName.complex].map[displayName])

			for (molecule : complexList) { // add each complex to the rule's container				
				switch rule.eContainer {
					Device: {
						val container = (rule.eContainer as Device)
						container.moleculeList.addComplexToContainer(molecule)
					}
					Region: {
						val container = (rule.eContainer as Region)
						container.moleculeList.addComplexToContainer(molecule)
					}
					Cell: {
						val container = (rule.eContainer as Cell)
						container.moleculeList.addComplexToContainer(molecule)
					}
				}
			}
		}

		// ATGC: look up variables in container hierarchy
		for (atgc : emfModel.eAllContents.toList.filter(ATGCArrange)) {
			for (part : atgc.partList) {
				val match = EcoreUtil.copy(searchFirstDeclaration(atgc.eContainer, part.displayName))
				EcoreUtil.replace(part, match)
			}
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
				ATGCDefinition: cell.ATGCCommandList.add(member.command.doSwitch as ATGCDirective)
			}
		}

		return cell
	}

	override caseATGCArrange(roadblock.xtext.ibl.ibl.ATGCArrange atgcArrange) {
		var emfAtgcArrange = modelFactory.createATGCArrange

		for (displayName : atgcArrange.arguments.map[it.buildVariableName]) {
			var emfPart = modelFactory.createMolecularSpecies
			emfPart.displayName = displayName
			emfPart.unit = getConcentrationUnit('molecule')
			emfPart.amount = 1.0
			emfAtgcArrange.partList.add(emfPart)
		}
		return emfAtgcArrange
	}

	override caseATGCDirection(ATGCDirection atgcDirection) {
		var emfAtgcDirection = modelFactory.createATGCDirection
		emfAtgcDirection.direction = atgcDirection.direction
		return emfAtgcDirection
	}

	override caseATGCCloningSites(ATGCCloningSites atgcCloningSites) {
		var emfAtgcCloningSites = modelFactory.createATGCCloningSites
		emfAtgcCloningSites.cloningSites = atgcCloningSites.cloningsites
		return emfAtgcCloningSites
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
		rule.setForwardRate(0.0)
		if(rule.isBidirectional) rule.setReverseRate(0.0) else rule.setReverseRate(0.0)
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
				ATGCDefinition: device.ATGCCommandList.add(member.command.doSwitch as ATGCDirective)
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
		val type = buildVariableName(variableDefinition.type)

		molecule => [
			biologicalType = type.toUpperCase
			displayName = variableDefinition.name.buildVariableName
			degradationRateUnit = getRateUnit("s^-1")
			bindingRateUnit = getRateUnit("s^-1") 
			unbindingRateUnit = getRateUnit("s^-1")
			degradationRate = 0.0;
			bindingRate = 0.0;
			unbindingRate = 0.0
		]

		// Defaults for parts and molecules
		if (isPart(type))
			molecule => [
				amount = 1.0;
				unit = getConcentrationUnit('molecule');
				]
		else
			molecule => [
				amount = 0.0;
				unit = getConcentrationUnit('uM');
	
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