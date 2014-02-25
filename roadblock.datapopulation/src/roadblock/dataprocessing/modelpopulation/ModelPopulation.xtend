package roadblock.dataprocessing.modelpopulation

import org.eclipse.emf.ecore.util.EcoreUtil
import roadblock.xtext.ibl.ibl.util.IblSwitch
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.xtext.ibl.ibl.Model
import roadblock.xtext.ibl.ibl.ModelMember
import roadblock.xtext.ibl.ibl.ImportStatement
import roadblock.xtext.ibl.ibl.FunctionDefinition
import roadblock.xtext.ibl.ibl.RegionBody
import roadblock.xtext.ibl.ibl.CellBody
import roadblock.xtext.ibl.ibl.VariableName
import roadblock.xtext.ibl.ibl.VariableComplex
import roadblock.xtext.ibl.ibl.VariableKind
import roadblock.xtext.ibl.ibl.FunctionContent
import roadblock.xtext.ibl.ibl.RuleDefinition
import roadblock.emf.ibl.Ibl.Cell
import roadblock.emf.ibl.Ibl.Region
import roadblock.xtext.ibl.ibl.CellInstantiation
import roadblock.emf.ibl.Ibl.Rule
import roadblock.xtext.ibl.ibl.DeviceDefinition
import roadblock.emf.ibl.Ibl.Device
import roadblock.xtext.ibl.ibl.RuleObject
import roadblock.emf.ibl.Ibl.MolecularSpecies

class ModelPopulation extends IblSwitch<Object> {
	var modelFactory = IblFactory::eINSTANCE;
	
	var emfModel = modelFactory.createModel;
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
	// 
	def populate(Model xtextModel) {
		return doSwitch(xtextModel) as roadblock.emf.ibl.Ibl.Model;	
	}
	
	override caseModel(Model xtextModel) {
		println("in caseModel")
		
		emfModel.ID = "TheEMFmodel"
		emfModel.displayName = "The EMF Model"
	
		for(functionDefinition: xtextModel.members.filter(FunctionDefinition).toList){
			val name = functionDefinition.name.buildVariableName
			switch functionDefinition.functionBody {
				RegionBody: { 	var region = functionDefinition.functionBody.doSwitch as Region
								region.displayName = name
								emfModel.regionList.add(region)
							}
				CellBody: {	var cell = functionDefinition.functionBody.doSwitch as Cell
							cell.displayName = name
							emfModel.cellList.add(cell)
							}
					
			}

			 }
		// remove the abstract classes
		emfModel.cellList.clear
		
		return emfModel;
	}
		
	override caseCellBody(CellBody cellBody){
		println("in caseCellBody")
		var cell= modelFactory.createCell
		for(member: cellBody.functionContent.members){
			switch member {
				RuleDefinition: cell.ruleList.add(member.doSwitch as Rule)
				DeviceDefinition : cell.deviceList.add(member.doSwitch as Device)
			}
		}	
		return cell
	}

	override caseRegionBody(RegionBody regionBody){
		println("in caseRegionBody")
		var region = modelFactory.createRegion
		for(member: regionBody.functionContent.members){
			switch member {
				CellInstantiation: region.cellList.add(member.doSwitch as Cell)
				RuleDefinition: region.ruleList.add(member.doSwitch as Rule)
			}
			
		}
		return region
	}
	
	override caseCellInstantiation(CellInstantiation cellInstantiation){
		// look for its definition
		val className = cellInstantiation.constructor.name
		// create an instantiated copy
		var cell = EcoreUtil.copy(emfModel.cellList.filter[displayName==className].head)
		cell.displayName = cellInstantiation.name.buildVariableName
		  
		return cell
	}

	override caseRuleDefinition(RuleDefinition ruleDefinition){
		val rule = modelFactory.createRule
		rule.displayName = ruleDefinition.name.buildVariableName
		for(part : ruleDefinition.lhs)
				rule.leftHandSide.add(part.doSwitch as MolecularSpecies)

		for(part : ruleDefinition.rhs)
				rule.rightHandSide.add(part.doSwitch as MolecularSpecies)
		
		rule.isBidirectional = ruleDefinition.reversible
		rule.setForwardRate(1.0)
		if(rule.isBidirectional) rule.setReverseRate(1.0) else rule.setReverseRate(0.0)		
		return rule
	}
	
	override caseDeviceDefinition(DeviceDefinition deviceDefinition){
		var device = modelFactory.createDevice
		device.displayName = deviceDefinition.name.buildVariableName
		
		for(rule: deviceDefinition.members.filter(RuleDefinition)){
			device.ruleList.add(rule.doSwitch as Rule)
		}
		
		return device
		
	}

	override caseRuleObject(RuleObject ruleObject){
		var molecule = modelFactory.createMolecularSpecies
		molecule.displayName = ruleObject.object.buildVariableName
		return molecule
		
	}
	

}