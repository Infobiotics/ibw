package roadblock.dataprocessing.model

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import roadblock.emf.ibl.Ibl.ATGCArrange
import roadblock.emf.ibl.Ibl.ATGCDirective
import roadblock.emf.ibl.Ibl.Cell
import roadblock.emf.ibl.Ibl.ConcentrationUnit
import roadblock.emf.ibl.Ibl.Device
import roadblock.emf.ibl.Ibl.EMFVariableAssignment
import roadblock.emf.ibl.Ibl.IProperty
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.Kinetics
import roadblock.emf.ibl.Ibl.MolecularSpecies
import roadblock.emf.ibl.Ibl.RateConcentrationUnit
import roadblock.emf.ibl.Ibl.RateTimeUnit
import roadblock.emf.ibl.Ibl.Region
import roadblock.emf.ibl.Ibl.Rule
import roadblock.xtext.ibl.ibl.ATGCCloningSites
import roadblock.xtext.ibl.ibl.ATGCDefinition
import roadblock.xtext.ibl.ibl.ATGCDirection
import roadblock.xtext.ibl.ibl.ATGCTranslationRate
import roadblock.xtext.ibl.ibl.AtomicVariableExpressionObject
import roadblock.xtext.ibl.ibl.CellBody
import roadblock.xtext.ibl.ibl.CellInstantiation
import roadblock.xtext.ibl.ibl.DeviceDefinition
import roadblock.xtext.ibl.ibl.FunctionContent
import roadblock.xtext.ibl.ibl.FunctionDefinition
import roadblock.xtext.ibl.ibl.Model
import roadblock.xtext.ibl.ibl.Outside
import roadblock.xtext.ibl.ibl.ProcessBody
import roadblock.xtext.ibl.ibl.ProcessInstantiation
import roadblock.xtext.ibl.ibl.PropertyDefinition
import roadblock.xtext.ibl.ibl.Quantity
import roadblock.xtext.ibl.ibl.RateSetDefinition
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
import roadblock.xtext.ibl.ibl.VariableName
import roadblock.xtext.ibl.ibl.VariableReference
import roadblock.xtext.ibl.ibl.VariableType
import roadblock.xtext.ibl.ibl.util.IblSwitch

class ModelBuilder extends IblSwitch<Object> {

	var modelFactory = IblFactory::eINSTANCE;

	var emfModel = modelFactory.createModel;

	var propertyBuilder = new PropertyBuilder();

	var semanticEntityByProperty = new HashMap<IProperty, EObject>();

	var Map<String, Kinetics> processDefinitions = new HashMap<String, Kinetics>();
	var Map<String, FunctionContent> semanticProcessDefinitions = new HashMap<String, FunctionContent>();
	var List<Cell> cellDefinitions = new ArrayList<Cell>();

	// useful constant
	val BIOLOGICALPART = #{'PROMOTER', 'GENE', 'RBS', 'SPACER', 'TERMINATOR'}

	def getPropertySemanticEntityMapper() {

		val mapper = new HashMap<IProperty, EObject>();

		for (concreteProperty : emfModel.eAllContents.toList.filter(IProperty)) {
			for (entry : semanticEntityByProperty.entrySet) {
				if(EcoreUtil.equals(concreteProperty as EObject, entry.key as EObject)) {
					mapper.put(concreteProperty, entry.value);
				}
			}
		}

		return mapper;
	}

	def isPart(String biologicalType) {
		return BIOLOGICALPART.contains(biologicalType)
	}

	def isComplex(String name) {
		name.contains('~')
	}

	def addComplexToContainer(List<MolecularSpecies> moleculeList, String complexName) {
		if(moleculeList.filter[displayName == complexName].size == 0) {
			val complex = modelFactory.createMolecularSpecies
			complex => [
				displayName = complexName
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
			default: "UNKNOWNTYPEFROMbuildVariableNameVK2"
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
				if (variableAssignment.expression === null)
					rule => [
						forwardRate = variableAssignment.amount;
						forwardRateUnit = getRateUnit(variableAssignment.units)
					] 
				else
					rule => [
						forwardRateExpression = variableAssignment.expression;
					]
			case 'backwardRate':
				if (variableAssignment.expression === null)
					rule => [
						reverseRate = variableAssignment.amount;
						reverseRateUnit = getRateUnit(variableAssignment.units)
					]
				else
					rule => [
						reverseRateExpression = variableAssignment.expression;
					]
			case 'rate':
				if (variableAssignment.expression === null)
					rule => [
						forwardRate = variableAssignment.amount;
						forwardRateUnit = getRateUnit(variableAssignment.units)
					]
				else
					rule => [
						forwardRateExpression = variableAssignment.expression;
					]
		}
	}

	//
	def populate(Model xtextModel) {
		return doSwitch(xtextModel) as roadblock.emf.ibl.Ibl.Model;
	}

	override caseModel(Model xtextModel) {

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
					cellDefinitions.add(cell)
				}
				ProcessBody: {
					var process = functionDefinition.functionBody.doSwitch as Kinetics
					process.displayName = name
					processDefinitions.put(name, process)
					semanticProcessDefinitions.put(name, (functionDefinition.functionBody as ProcessBody).functionContent)
				}
			}
		}

		// variable assignment resolution
		// limited to rules and identical container for the time being
		for (variableAssignment : emfModel.eAllContents.toList.filter(EMFVariableAssignment)) {
			val container = variableAssignment.eContainer
			var EObject variable
			switch container {
				Region:
					variable = (container as Region).ruleList.filter[displayName == variableAssignment.variableName].head
				Cell:
					variable = (container as Cell).ruleList.filter[displayName == variableAssignment.variableName].head
				Device:
					variable = (container as Device).ruleList.filter[displayName == variableAssignment.variableName].head
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
					Kinetics: {
						val container = (rule.eContainer as Kinetics)
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
		var cell = modelFactory.createCell

		for (member : cellBody.functionContent.members) {
			switch member {
				RuleDefinition:
					cell.ruleList.add(member.doSwitch as Rule)
				DeviceDefinition:
					cell.deviceList.add(member.doSwitch as Device)
				ProcessInstantiation:
					cell.processList.add(member.doSwitch as Kinetics)
				VariableDefinition:
					cell.moleculeList.add(member.definition.doSwitch as MolecularSpecies)
				VariableAssignment:
					cell.variableAssignmentList.add(member.doSwitch as EMFVariableAssignment)
				PropertyDefinition: {
					var property = propertyBuilder.build(member.property);
					cell.properties.add(property);
					semanticEntityByProperty.put(property, member);
				}
				ATGCDefinition:
					cell.ATGCCommandList.add(member.command.doSwitch as ATGCDirective)
			}
		}

		return cell
	}

	override caseProcessBody(ProcessBody processBody) {
		var process = modelFactory.createKinetics

		for (member : processBody.functionContent.members) {
			switch member {
				RuleDefinition:
					process.ruleList.add(member.doSwitch as Rule)
				ProcessInstantiation: {
					var k = member.doSwitch as Kinetics
					process.processList.add(k)
				}
			}
		}

		return process
	}

	override caseATGCTranslationRate(ATGCTranslationRate atgcTranslationRate) {
		var emfAtgcTranslationRate = modelFactory.createATGCTranslationRate
		emfAtgcTranslationRate.translationRate = atgcTranslationRate.translationRate

		return emfAtgcTranslationRate
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
		var region = modelFactory.createRegion

		for (member : regionBody.functionContent.members) {
			switch member {
				CellInstantiation: region.cellList.add(member.doSwitch as Cell)
				ProcessInstantiation: region.processList.add(member.doSwitch as Kinetics)
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
		var cell = EcoreUtil.copy(cellDefinitions.filter[displayName == className].head)
		cell.displayName = cellInstantiation.name.buildVariableName

		return cell
	}

	override caseProcessInstantiation(ProcessInstantiation processInstantiation) {

		// look for its definition
		val className = processInstantiation.constructor.name

		// create an instantiated copy
		var processDefinition = processDefinitions.get(className)
		var semanticProcessDefinition = semanticProcessDefinitions.get(className)

		var kinetics = EcoreUtil.copy(processDefinition)
		kinetics.displayName = processInstantiation.name.buildVariableName

		// change process' formal parameters with the actual ones
		val formalParams = semanticProcessDefinition.parameters.map[it.name.buildVariableName].toList
		val actualParams = processInstantiation.parameters.map[it.buildVariableName].toList
		
		// consider the rules of the process itself and its its child processes for parameter substitution
		var rules = kinetics.ruleList
		rules.addAll(kinetics.processList.map[it.ruleList].flatten.toList)
		
		for (rule : rules) {
			rule.eAllContents.filter(MolecularSpecies).forEach [
				{
					if(it.displayName.isComplex) {
						val individualMolecules = it.displayName.split("~")
						it.displayName = individualMolecules.map[actualParams.get(formalParams.indexOf(it))].join('~')
					} else {
						val paramIndex = formalParams.indexOf(it.displayName)
						it.displayName = actualParams.get(paramIndex)
					}
				}
			]
		}

		// assign rates to rules
		var rates = processInstantiation.using.map [ rateDefinition |
			{
				val predicate = [EObject o|o instanceof RateSetDefinition && (o as RateSetDefinition).name.buildVariableName == rateDefinition.name.buildVariableName]
				var ruleSet = (findFirstUpstream(processInstantiation.eContainer, predicate) as RateSetDefinition)

				if(ruleSet != null) {
					ruleSet.rateAssignments.map[it.doSwitch as EMFVariableAssignment]
				}
			}
		].flatten

		for (rate : rates) {
			var rule = kinetics.ruleList.filter[it.displayName == rate.variableName].head
			updateRule(rule, rate)
		}

		return kinetics
	}

	override caseRuleDefinition(RuleDefinition ruleDefinition) {
		val rule = modelFactory.createRule
		rule.displayName = ruleDefinition.name.buildVariableName
		for (part : ruleDefinition.lhs)
			rule.leftHandSide.add(part.doSwitch as MolecularSpecies)

		for (part : ruleDefinition.rhs)
			rule.rightHandSide.add(part.doSwitch as MolecularSpecies)

		rule.isBidirectional = ruleDefinition.reversible

		return rule
	}

	override caseDeviceDefinition(DeviceDefinition deviceDefinition) {
		var device = modelFactory.createDevice
		device.displayName = deviceDefinition.name.buildVariableName

		for (member : deviceDefinition.members) {
			switch member {
				ProcessInstantiation:
					device.processList.add(member.doSwitch as Kinetics)
				RuleDefinition:
					device.ruleList.add(member.doSwitch as Rule)
				VariableDefinition:
					device.moleculeList.add(member.definition.doSwitch as MolecularSpecies)
				VariableAssignment:
					device.variableAssignmentList.add(member.doSwitch as EMFVariableAssignment)
				PropertyDefinition: {
					var property = propertyBuilder.build(member.property);
					device.properties.add(property)
					semanticEntityByProperty.put(property, member);
				}
				ATGCDefinition:
					device.ATGCCommandList.add(member.command.doSwitch as ATGCDirective)
			}
		}

		for (part : deviceDefinition.parts.entries.map [
			switch (it) {
				VariableReference: (it as VariableReference).variable.buildVariableName
				VariableComplex: (it as VariableComplex).complex.buildVariableName
			}
		]) {

			// create an empty part, just for reference. Validation should have ensured that the part has already been declared.
			var biopart = modelFactory.createMolecularSpecies
			biopart.displayName = part
			device.partList.add(biopart)

		}
		
		for (molecule : deviceDefinition.input.entries.map [
			switch (it) {
				VariableReference: (it as VariableReference).variable.buildVariableName
				VariableComplex: (it as VariableComplex).complex.buildVariableName
			}
		]) {
			// create an empty molecule, just for reference. Validation should have ensured that the molecule has already been declared.
			var inputMolecule = modelFactory.createMolecularSpecies
			inputMolecule.displayName = molecule
			device.inputList.add(inputMolecule)
			
		}

		for (molecule : deviceDefinition.output.entries.map [
			switch (it) {
				VariableReference: (it as VariableReference).variable.buildVariableName
				VariableComplex: (it as VariableComplex).complex.buildVariableName
			}
		]) {
			// create an empty molecule, just for reference. Validation should have ensured that the molecule has already been declared.
			var outputMolecule = modelFactory.createMolecularSpecies
			outputMolecule.displayName = molecule
			device.outputList.add(outputMolecule)
			
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
			degradationRateUnit = null
			bindingRateUnit = null
			unbindingRateUnit = null
			degradationRate = 0.0;
			bindingRate = 0.0;
			unbindingRate = 0.0
		]

		// Defaults for parts and molecules
		if(isPart(type))
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
				case 'amount',
				case 'concentration': {
					if(parameter.value instanceof Quantity) {
						val q = parameter.value.doSwitch as Quantity;
						molecule => [amount = q.value; unit = getConcentrationUnit(q.units.get(0))]
					}
					else if(parameter.value instanceof RealConstant) {
						val q = parameter.value as RealConstant;
						molecule => [amount = q.value ]
					}
				}
				case 'URI':
					molecule.URI = parameter.value.doSwitch as String
				case 'degradationRate': {
					val q = parameter.value.doSwitch as Quantity;
					molecule => [degradationRate = q.value; unit = getConcentrationUnit(q.units.head)]
				}
				case 'bindingRate': {
					val q = parameter.value.doSwitch as Quantity;
					molecule => [bindingRate = q.value; unit = getConcentrationUnit(q.units.head)]
				}
				case 'unbindingRate': {
					val q = parameter.value.doSwitch as Quantity;
					molecule => [unbindingRate = q.value; unit = getConcentrationUnit(q.units.head)]
				}
				case 'sequence': {
					val q = parameter.value.doSwitch as String
					molecule.sequence = q
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
					variableAttribute = variable.att.name
				]
			default:
				emfVariableAssignment => [variableName = 'NOT IMPLEMENTED'; variableAttribute = 'NOT IMPLEMENTED']
		}

		val varExpression = variableAssignment.expression.members.head.doSwitch
		switch varExpression {
			Quantity:
				emfVariableAssignment => [
					amount = varExpression.value
					units.addAll(varExpression.units)
				]
			String:
			emfVariableAssignment => [
					expression = varExpression
				]
			default:
				emfVariableAssignment => [amount = -111; units.addAll(#['NOT IMPLEMENTED'])]
		}

		return emfVariableAssignment
	}

	private def EObject findFirstUpstream(EObject container, (EObject)=>Boolean predicate) {
		var result = container.eContents.filter[predicate.apply(it)]

		if(result.size > 0) {
			return result.head
		} else if(container.eContainer == null) {
			return null
		} else {
			return findFirstUpstream(container.eContainer, predicate)
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

	private def getRateUnit(List<String> units) {
		val rateUnit = modelFactory.createRateUnit => [
			rateTimeUnit = RateTimeUnit.PER_SECOND
			rateConcentrationUnit = RateConcentrationUnit.PER_MOLECULE
		]

		for (unit : units) {
			switch unit {
				case unit.toLowerCase.startsWith("s"): rateUnit.rateTimeUnit = RateTimeUnit.PER_SECOND
				case unit.toLowerCase.startsWith("min"): rateUnit.rateTimeUnit = RateTimeUnit.PER_MINUTE
				case unit.toLowerCase.startsWith("molecule"): rateUnit.rateConcentrationUnit = RateConcentrationUnit.PER_MOLECULE
				case unit.toLowerCase.startsWith("mm"): rateUnit.rateConcentrationUnit = RateConcentrationUnit.PER_MM
				case unit.toLowerCase.startsWith("m"): rateUnit.rateConcentrationUnit = RateConcentrationUnit.PER_M
				case unit.toLowerCase.startsWith("um"): rateUnit.rateConcentrationUnit = RateConcentrationUnit.PER_UM
				case unit.toLowerCase.startsWith("nm"): rateUnit.rateConcentrationUnit = RateConcentrationUnit.PER_NM
				case unit.toLowerCase.startsWith("pm"): rateUnit.rateConcentrationUnit = RateConcentrationUnit.PER_PM
				case unit.toLowerCase.startsWith("fm"): rateUnit.rateConcentrationUnit = RateConcentrationUnit.PER_FM
			}
		}

		return rateUnit
	}
}
