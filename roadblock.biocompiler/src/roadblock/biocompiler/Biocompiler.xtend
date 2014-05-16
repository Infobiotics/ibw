package roadblock.biocompiler

import roadblock.emf.ibl.Ibl.Model
import roadblock.emf.ibl.Ibl.ATGCDirective
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.Date
import roadblock.emf.bioparts.Bioparts.BiopartsFactory
    
class Biocompiler {
	val Model model 
	
	var biopartsFactory = BiopartsFactory::eINSTANCE
	var bag = biopartsFactory.createbagOfParts
	
	
	new(Model emfModel){
		println(new Date())
		println("ATGC: Compiling")
		model = emfModel
	}
	
	def gatherParts(){
		println("ATGC: gathering parts")
		for(region: model.regionList){
			println("\tregion:" + region.displayName)
			for(cell: region.cellList){
				println("\t\tcell: " + cell.displayName)
				for(device: cell.deviceList){
					println("\t\t\tDevice:" + device.displayName)
					for(part: device.partList){
						println("\t\t\t\tPart: " + part.displayName)
				}
							
			}
		}
	}
}
}