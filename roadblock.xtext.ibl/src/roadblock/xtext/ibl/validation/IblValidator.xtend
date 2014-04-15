package roadblock.xtext.ibl.validation

import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.Check
import roadblock.xtext.ibl.ibl.ATGCDefinition
import roadblock.xtext.ibl.ibl.CellInstantiation
import roadblock.xtext.ibl.ibl.ChromosomeInstantiation
import roadblock.xtext.ibl.ibl.DeviceDefinition
import roadblock.xtext.ibl.ibl.FunctionBodyMember
import roadblock.xtext.ibl.ibl.IblPackage
import roadblock.xtext.ibl.ibl.Outside
import roadblock.xtext.ibl.ibl.PlasmidInstantiation
import roadblock.xtext.ibl.ibl.ProcessInstantiation
import roadblock.xtext.ibl.ibl.PropertyDefinition
import roadblock.xtext.ibl.ibl.RuleDefinition
import roadblock.xtext.ibl.ibl.SystemInstantiation
import roadblock.xtext.ibl.ibl.impl.CellBodyImpl
import roadblock.xtext.ibl.ibl.impl.ChromosomeBodyImpl
import roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyImpl
import roadblock.xtext.ibl.ibl.impl.PlasmidBodyImpl
import roadblock.xtext.ibl.ibl.impl.ProcessBodyImpl
import roadblock.xtext.ibl.ibl.impl.RegionBodyImpl
import roadblock.xtext.ibl.ibl.impl.SystemBodyImpl
import roadblock.xtext.ibl.ibl.VariableDefinition
import roadblock.xtext.ibl.ibl.VariableDefinitionBuiltIn
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.ILocationInFileProviderExtension.RegionDescription
import roadblock.xtext.ibl.ibl.FunctionContent
import roadblock.xtext.ibl.ibl.VariableDefinitionUserDefined
import roadblock.xtext.ibl.ibl.RegionBody
import roadblock.xtext.ibl.ibl.VariableAssignment
import roadblock.xtext.ibl.ibl.VariableName
import roadblock.xtext.ibl.ibl.VariableAttribute
import roadblock.xtext.ibl.ibl.VariableComplex
import roadblock.xtext.ibl.ibl.VariableKind
import roadblock.xtext.ibl.ibl.VariableReference
import roadblock.xtext.ibl.ibl.RuleObject
import roadblock.xtext.ibl.ibl.List
import java.nio.charset.Charset
import java.io.IOException
import java.nio.file.Paths
import java.nio.ByteBuffer
import java.nio.file.Files

// utility class, used for checking forbidden containers
@Data 
class ContainerData {
    Object type
    String displayName
    }

class IblValidator extends AbstractIblValidator {

	
	def isComplex(String name) {
		name.contains('~')
	}
// define a map of all containers
	val static containerList = #{
			'PROCESS' -> new ContainerData(typeof(ProcessBodyImpl),"PROCESSes"),
			'SYSTEM'  -> new ContainerData(typeof(SystemBodyImpl),"SYSTEMs"),
			'PLASMID' -> new ContainerData(typeof(PlasmidBodyImpl),"PLASMIDs"),
			'CHROMOSOME' -> new ContainerData(typeof(ChromosomeBodyImpl),"CHROMOSOMEs"),
			'CELL' -> new ContainerData(typeof(CellBodyImpl),"CELLs"),
			'REGION' -> new ContainerData(typeof(RegionBodyImpl),"REGIONs"),
			'CUSTOMFUNCTION' -> new ContainerData(typeof(CustomFunctionBodyImpl),"CUSTOMFUNCTIONs")
		} 
		
	def getDefinitionContainer(FunctionBodyMember definition){
		definition.eContainer.eContainer // have to go back twice now: first container is functionContent
	}

// Generate an error if the function body member is in the wrong container
	def void generateWrongContainerError(
		FunctionBodyMember definition, 
		String[] forbiddenContainers, 
		String errorMessage,
		EStructuralFeature feature
	){
		containerList.filter[k,v | forbiddenContainers.contains(k)].forEach[k,v |
		if(definition.getDefinitionContainer.class == v.type )
				error(errorMessage + v.displayName, feature)			
		]
	}	
	
	def getAllVariableDefinitions(EObject container){
		switch(container){
			FunctionContent: return (container as FunctionContent).members.filter(VariableDefinition)
			DeviceDefinition: return (container as DeviceDefinition).members.filter(VariableDefinition)
		}
		
	}

	def getAllRules(EObject container){
		switch(container){
			FunctionContent: return (container as FunctionContent).members.filter(RuleDefinition)
			DeviceDefinition: return (container as DeviceDefinition).members.filter(RuleDefinition)
		}
		
	}
	
	def getVariableNamesCreatedByRules(EObject container){
		// a variable can be created from a rule iff: 
		// * it's on the left hand-side and the rule is reversible
		// * it's on the right hand-side
		switch(container){
			FunctionContent: {
				var  names = (container as FunctionContent).members.filter(RuleDefinition).filter[it.reversible].map[lhs].toSet
				names.addAll((container as FunctionContent).members.filter(RuleDefinition).map[rhs].toSet)
				return names.flatten.filter(VariableKind).map[buildVariableName]
			}
			DeviceDefinition: {
				var names = (container as DeviceDefinition).members.filter(RuleDefinition).filter[it.reversible].map[lhs].toSet
					names.addAll((container as DeviceDefinition).members.filter(RuleDefinition).map[rhs].toSet)
				return names.flatten.filter(VariableKind).map[buildVariableName]
					}
			
		}	
		
	}

	
	def getVariableName(VariableDefinition variableDefinition){
		switch(variableDefinition.definition){
			VariableDefinitionBuiltIn: return (variableDefinition.definition as VariableDefinitionBuiltIn).name.name
			VariableDefinitionUserDefined: return (variableDefinition.definition as VariableDefinitionUserDefined).name.name
		}
		"Couldn't work out variable name"
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

	def buildVariableName(VariableAssignment variableAssignment) {
		switch(variableAssignment.variable){
				VariableName: (variableAssignment.variable as VariableName).buildVariableName
				VariableAttribute: (variableAssignment.variable as VariableAttribute).name.buildVariableName	
			}
	}

	def  extractVariableNames(List list){
		list.entries.map[
			switch(it){
				VariableReference: (it as VariableReference).variable
				VariableComplex : (it as VariableComplex).complex
			}
		]
		
	}
	def getPartsInDeviceSignature(DeviceDefinition device){
		device.parts.extractVariableNames
	}	

	def getInputsInDeviceSignature(DeviceDefinition device){
		device.input.extractVariableNames			
	}	
	
	def getOutputsInDeviceSignature(DeviceDefinition device){
		device.output.extractVariableNames			
	}	

	def getAllArgumentsInDeviceSignature(DeviceDefinition device){
		var set = getPartsInDeviceSignature(device).toSet
		set.addAll(getInputsInDeviceSignature(device).toSet)
		set.addAll(getOutputsInDeviceSignature(device).toSet)
		return set
	}	

	def isObservable(VariableDefinition variableDefinition){
		variableDefinition.qualifier == 'observable'
		
	}

	
// =================================================================================
// 					enforce declarations
// =================================================================================
	def Boolean hasBeenDeclared(String variableName, EObject container){
		//if complex: check if it is created by a rule
		if(isComplex(variableName) && getVariableNamesCreatedByRules(container).exists[it == variableName])
				return true
		
		// otherwise check if it's been created somewhere else
		
		// check if locally declared
		if(getAllVariableDefinitions(container).exists[it.variableName == variableName])
			return true
		
		// check if it's a rule's name
		if(getAllRules(container).exists[it.name.buildVariableName == variableName])
			return true
			
		// if in device: check signature and observables in device's container 
		switch(container){
			DeviceDefinition: {if(getAllArgumentsInDeviceSignature(container as DeviceDefinition).exists[it.buildVariableName==variableName])
									return true
							   if(getAllVariableDefinitions(container.eContainer).filter[observable].exists[it.variableName == variableName])
							   		return true	
									}
				}
		
		return false
	}
	
	def errorMessage(String variableName){
		if(variableName.complex) return "Complex '" + variableName + "' must be created by a rule or passed on as a parameter."
		"Variable '" + variableName + "' must be declared."
	}
	
	@Check
	def checkEnforceVariableDeclaration(VariableAssignment variableAssignment){
		val variableName = variableAssignment.buildVariableName		
		if(!hasBeenDeclared(variableName, variableAssignment.eContainer))
			error(variableName.errorMessage,IblPackage::eINSTANCE.variableAssignment_Variable)
	}

	@Check
	def checkEnforceVariableDeclaration(RuleDefinition rule){
		
		// left hand-side
		for(variableName: rule.lhs.filter(VariableKind).map[buildVariableName]){
			if(!hasBeenDeclared(variableName, rule.eContainer))
				error(variableName.errorMessage,IblPackage::eINSTANCE.ruleDefinition_Name)
		}
		
		// right hand-side
		for(variableName: rule.rhs.filter(VariableKind).map[buildVariableName]){
			if(!hasBeenDeclared(variableName, rule.eContainer))
				error(variableName.errorMessage,IblPackage::eINSTANCE.ruleDefinition_Name)
			}				
				
	}
	
	@Check
	def checkEnforceVariableDeclaration(DeviceDefinition device){
		for(variableName: device.partsInDeviceSignature.map[buildVariableName]){
			if(!hasBeenDeclared(variableName, device.eContainer))
				error(variableName.errorMessage,IblPackage::eINSTANCE.deviceDefinition_Parts)
		}
		
		for(variableName: device.inputsInDeviceSignature.map[buildVariableName]){
			if(!hasBeenDeclared(variableName, device.eContainer))
				error(variableName.errorMessage,IblPackage::eINSTANCE.deviceDefinition_Input)
		}
		
		for(variableName: device.outputsInDeviceSignature.map[buildVariableName]){
			if(!hasBeenDeclared(variableName, device.eContainer))
				error(variableName.errorMessage,IblPackage::eINSTANCE.deviceDefinition_Output)
		}		
	}
	


// =================================================================================
// 						forbid multiple declarations
// =================================================================================
	@Check
	def checkMultipleVariableDefinition(VariableDefinition variableDefinition){
		val variableName = variableDefinition.variableName
		val container = variableDefinition.eContainer
		if(container.getAllVariableDefinitions.filter[it.variableName == variableName].size > 1){
			error("Variable '" + variableName + "' is declared twice in the same container.", IblPackage::eINSTANCE.variableDefinition_Definition)
	}
	
	}


// =================================================================================
	
// Container checks for function body members
	@Check
	def checkContainerOfATGCDefinition(ATGCDefinition atgcDefinition){
		atgcDefinition.generateWrongContainerError(
			#["PROCESS", "REGION"],
			"ATGC directives are not allowed in ",
			IblPackage::eINSTANCE.ATGCDefinition_Command
		)
		}

	@Check
	def checkContainerOfCellInstantiation(CellInstantiation cellInstantiation){
		cellInstantiation.generateWrongContainerError(
			#["PROCESS", "SYSTEM", "PLASMID", "CHROMOSOME", "CELL", "CUSTOMFUNCTION"],
			"Cell instantiations are not allowed in ",
			IblPackage::eINSTANCE.cellInstantiation_Name
		)
		}


	
	
	@Check
	def checkContainerOfChromosomeInstantiation(ChromosomeInstantiation chromosomeInstantiation){
		chromosomeInstantiation.generateWrongContainerError(
			#["PROCESS", "SYSTEM", "PLASMID", "CHROMOSOME", "REGION"],
			"Chromosome instantiations are not allowed in ",
			IblPackage::eINSTANCE.chromosomeInstantiation_Name
		)
		}

	@Check
	def checkContainerOfDeviceDefinition(DeviceDefinition deviceDefinition){
		deviceDefinition.generateWrongContainerError(
			#["PROCESS", "REGION"],
			"Device definitions are not allowed in ",
			IblPackage::eINSTANCE.deviceDefinition_Name
		)
		}

	@Check
	def checkContainerOfPlasmidInstantiation(PlasmidInstantiation plasmidInstantiation){
		plasmidInstantiation.generateWrongContainerError(
			#["PROCESS", "SYSTEM", "PLASMID", "CHROMOSOME", "REGION"],
			"Plasmid instantiations are not allowed in ",
			IblPackage::eINSTANCE.plasmidInstantiation_Name
		)
		}

	@Check
	def checkContainerOfProcessInstantiation(ProcessInstantiation processInstantiation){
		processInstantiation.generateWrongContainerError(
			#["REGION"],
			"Process instantiations are not allowed in ",
			IblPackage::eINSTANCE.processInstantiation_Constructor
		)
		}

	@Check
	def checkContainerOfPropertyDefinition(PropertyDefinition propertyDefinition){
		propertyDefinition.generateWrongContainerError(
			#["PROCESS"],
			"Property Definitions are not allowed in ",
			IblPackage::eINSTANCE.propertyDefinition_Property
		)
		
		}

	@Check
	def checkContainerOfSystemInstantiation(SystemInstantiation systemInstantiation){
		systemInstantiation.generateWrongContainerError(
			#["PROCESS", "SYSTEM", "REGION"],
			"System instantiations are not allowed in ",
			IblPackage::eINSTANCE.systemInstantiation_Constructor
		)
		}

	// =================================================================================

	@Check  // OUTSIDE must be used on its own, if used at all
	def checkRuleOutside(RuleDefinition rule){
		//number of OUTSIDE on the left hand side
		val left = rule.lhs
		val n1 = left.filter(Outside).size
		
		//number of OUTSIDE on the right hand side
		val right = rule.rhs
		val n2 = right.filter(Outside).size
		
		// error if n1 + n2 > 1
		if(n1 + n2 >1)
			error("OUTSIDE must be used at most once", IblPackage::eINSTANCE.ruleDefinition_Name)
		
		// error if not used on its own
		if((n1 == 1) && (left.size > 1))
				error("OUTSIDE must be used on its own", IblPackage::eINSTANCE.ruleDefinition_Lhs)

		if((n2 == 1) && (right.size > 1))
				error("OUTSIDE must be used on its own", IblPackage::eINSTANCE.ruleDefinition_Rhs)
				
	}
	
}