package roadblock.xtext.ibl.validation
import org.eclipse.xtext.validation.Check
import roadblock.xtext.ibl.ibl.ProcessBody
import roadblock.xtext.ibl.ibl.VariableDefinition
import roadblock.xtext.ibl.ibl.IblPackage
import roadblock.xtext.ibl.ibl.PropertyDefinition
import roadblock.xtext.ibl.ibl.impl.ProcessBodyImpl
import roadblock.xtext.ibl.ibl.impl.RegionBodyImpl
import roadblock.xtext.ibl.ibl.impl.PlasmidBodyImpl
import java.util.Map
import org.eclipse.emf.ecore.EStructuralFeature
import roadblock.xtext.ibl.ibl.FunctionBodyMember
import roadblock.xtext.ibl.ibl.impl.ChromosomeBodyImpl
import roadblock.xtext.ibl.ibl.impl.CellBodyImpl
import roadblock.xtext.ibl.ibl.impl.CustomFunctionBodyImpl
import roadblock.xtext.ibl.ibl.ATGCDefinition
import roadblock.xtext.ibl.ibl.CellInstantiation
import roadblock.xtext.ibl.ibl.ChromosomeInstantiation
import roadblock.xtext.ibl.ibl.DeviceDefinition
import roadblock.xtext.ibl.ibl.PlasmidInstantiation
import roadblock.xtext.ibl.ibl.ProcessInstantiation
import roadblock.xtext.ibl.ibl.SystemInstantiation
import roadblock.xtext.ibl.ibl.impl.SystemBodyImpl
import roadblock.xtext.ibl.ibl.RuleDefinition
import roadblock.xtext.ibl.ibl.Outside

// utility class, used for checking forbidden containers
@Data 
class ContainerData {
    Object type
    String displayName
    }

class IblValidator extends AbstractIblValidator {

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
	
	@Check 
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
