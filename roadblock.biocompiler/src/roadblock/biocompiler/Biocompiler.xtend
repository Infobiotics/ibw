package roadblock.biocompiler

import roadblock.emf.ibl.Ibl.Model
import roadblock.emf.ibl.Ibl.ATGCDirective
import org.eclipse.emf.ecore.EObject
import java.util.Date
import roadblock.emf.bioparts.Bioparts.BiopartsFactory
import roadblock.emf.bioparts.Bioparts.BiocompilerModel
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.MolecularSpecies
import roadblock.emf.ibl.Ibl.Device
import roadblock.emf.ibl.Ibl.Cell
import roadblock.emf.ibl.Ibl.Region
import java.io.IOException
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.ecore.xmi.util.XMLProcessor
import org.jacop.core.Store
import org.jacop.core.IntVar
import org.jacop.core.BooleanVar
import org.jacop.constraints.Min
import org.jacop.constraints.Max
import java.util.ArrayList
import org.jacop.constraints.Alldifferent
import org.jacop.constraints.PrimitiveConstraint
import org.jacop.constraints.XltY
import org.jacop.constraints.And
import org.jacop.constraints.Or
import org.jacop.search.DepthFirstSearch
import org.jacop.search.Search
import org.jacop.search.SelectChoicePoint
import org.jacop.search.InputOrderSelect
import org.jacop.search.IndomainMin
import org.jacop.constraints.XeqC
import org.jacop.constraints.XgtY
import org.jacop.constraints.XplusCeqZ
import roadblock.emf.bioparts.Bioparts.Biopart
import roadblock.emf.ibl.Ibl.ATGCArrange

class Biocompiler {
	val Model model 
	
	var biopartsFactory = BiopartsFactory::eINSTANCE
	var public biocompilerModel = biopartsFactory.createBiocompilerModel
	var public store = new Store
		
	
	var modelFactory = IblFactory::eINSTANCE
	
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
				var biocompilerCell = biopartsFactory.createBiocompilerCell
				biocompilerCell.name = cell.displayName
				println("\t\tcell: " + cell.displayName)
				for(device: cell.deviceList){
//					println(device.ATGCCommandList.filter[ATGCArrange].size)
					
					var biocompilerDevice = biopartsFactory.createBiocompilerDevice
					biocompilerDevice.name = device.displayName
					println("\t\t\tDevice:" + device.displayName)
					for(partName: device.partList.map[displayName]){
						println("\t\t\t\tPart: " + partName)
						//look up the part's declaration
						val part = searchFirstDeclaration(device, partName);
						// create a biopart with relevant info 
						var biopart = biopartsFactory.createBiopart
						biopart => [
							name = part.displayName
							sequence = part.sequence
							biologicalFunction = part.biologicalType
							cellName = cell.displayName
							deviceName = device.displayName
							accessionURL = part.URI
						]
						
						// add to device
						biocompilerDevice.parts.add(biopart)
				}
				biocompilerCell.devices.add(biocompilerDevice)
							
			}
			biocompilerModel.cells.add(biocompilerCell)
		}
	}
	println(convertToXml(biocompilerModel))
	}

	def completeDevices(){
		for(cell: biocompilerModel.cells){
			for(device: cell.devices){
				// add 1 RBS per gene
				val numberOfGenes = device.parts.filter[biologicalFunction=='GENE'].size
				for(k: 1..numberOfGenes){
					var biopart = biopartsFactory.createBiopart
						biopart => [
							name = cell.name + "/" + device.name + "/rbs_" + k 
							sequence = ""
							biologicalFunction = "RBS"
							cellName = cell.name
							deviceName = device.name
							accessionURL = ""
						] 
					device.parts.add(biopart)	
				}
				
				// add 1 terminator
				var biopart = biopartsFactory.createBiopart
					biopart => [
						name = cell.name + "/" + device.name + "/terminator"
						sequence = ""
						biologicalFunction = "TERMINATOR"
						cellName = cell.name
						deviceName = device.name
						accessionURL = ""
					] 
				device.parts.add(biopart)	
			}
			
		}
	}
	
	def createIntVarForAllparts(){
		// get the number of parts
		var partsNumber = 0
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				partsNumber = partsNumber + device.parts.size

		var count = 0;
		for(cell: biocompilerModel.cells)
		for(device: cell.devices){
			val path = cell.name + "/" + device.name + "/" 
			for(part: device.parts){
				count = count + 1
				part.position = new IntVar(store, path + part.name + "_" + count, 1, partsNumber)
			}
			
			device.direction = new BooleanVar(store, path + "direction")
			device.minPosition = new IntVar(store, path + "minPosition" , 1, partsNumber)
			device.maxPosition = new IntVar(store, path + "maxPosition" , 1, partsNumber)
			store.impose(new Min(device.parts.map[position],device.minPosition))
			store.impose(new Max(device.parts.map[position],device.maxPosition))			
		}
		
		println(convertToXml(biocompilerModel))
	}
	
	def constraintAllDifferent(){
		val ArrayList<IntVar> allPartPositions = new ArrayList()
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				allPartPositions.addAll(device.parts.map[position])
		
		store.impose(new Alldifferent(allPartPositions))		
	}
	
	def constraintNonOverlapping(){
		for(cell: biocompilerModel.cells){
			val devicesNumber = cell.devices.size
			var ArrayList<PrimitiveConstraint> nonOverlappingConstraints = newArrayList()
			for(combination: allCombinations(devicesNumber)){
				var ArrayList<PrimitiveConstraint> configurationIndividualConstraints = newArrayList()
				for(k: 1..(devicesNumber-1)){
					val k1 = combination.get(k-1)
					val k2 = combination.get(k)
					configurationIndividualConstraints.add(new XltY(cell.devices.get(k1 - 1).maxPosition, cell.devices.get(k2 -1).minPosition))	
			}
			nonOverlappingConstraints.add(new And(configurationIndividualConstraints))
				
				
			}
			store.impose(new Or(nonOverlappingConstraints))	
		}
				
	}
	
	def constraintPositionByType(){
		for(cell: biocompilerModel.cells)
		for(device: cell.devices){
			// promoter < rbs
			for(promoter: device.parts.filter[biologicalFunction == "PROMOTER"].map[position])
				for(rbs: device.parts.filter[biologicalFunction == "RBS"].map[position])
					store.impose(new Or(
						new And(new XltY(promoter,rbs), new XeqC(device.direction,1)),
						new And(new XgtY(promoter,rbs), new XeqC(device.direction,0))
						)
					)

			// contiguous RBS and GENE
			val rbsList = device.parts.filter[biologicalFunction == "RBS"].map[position]
			val geneList = device.parts.filter[biologicalFunction == "GENE"].map[position]
					
			for(k: (1..rbsList.size)){					
				store.impose(new Or(
						new And(new XplusCeqZ(rbsList.get(k-1), 1, geneList.get(k-1)), new XeqC(device.direction,1)),
						new And(new XplusCeqZ(geneList.get(k-1), 1, rbsList.get(k-1)), new XeqC(device.direction,0))
						)
					)				
			}
					
			// gene < terminator
			for(gene: device.parts.filter[biologicalFunction == "GENE"].map[position])		
				for(terminator: device.parts.filter[biologicalFunction == "TERMINATOR"].map[position])
				store.impose(new Or(
						new And(new XltY(gene,terminator), new XeqC(device.direction,1)),
						new And(new XgtY(gene,terminator), new XeqC(device.direction,0))
						)
					)				

		}
		
	}

	def constraintDirection(){
//		store.impose(new XeqC(biocompilerModel.cells.get(0).devices.get(0).direction,0))
			
	}

	def allCombinations(Integer n){ // produces all combinations of n items
		var combinations = newArrayList(newArrayList(1))
		
		for(k:(2..n)){
			var temp = newArrayList()
			for(c : combinations) 
				for(position: 0..c.size){
					var temp2 = newArrayList()
					temp2.addAll(c)
					temp2.add(position,k)
					temp.add(temp2)
				}			
			combinations = temp
		}
		
		combinations		
	}
	
	def findArrangement(){
		val ArrayList<IntVar> allPartPositions = new ArrayList()
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				allPartPositions.addAll(device.parts.map[position])
						
	// search for a solution and print results 
        var Search<IntVar> search = new DepthFirstSearch<IntVar>(); 
        var SelectChoicePoint<IntVar> select = 
            new InputOrderSelect<IntVar>(store, allPartPositions, 
                                         new IndomainMin<IntVar>()); 
        var boolean result = search.labeling(store, select); 
        
		for(cell: biocompilerModel.cells){
			// gather all parts in that cell
			val ArrayList<Biopart> allParts = new ArrayList()
			for(device: cell.devices)
				allParts.addAll(device.parts)
			println(allParts.sortBy[position.value].map[name])
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
			roadblock.emf.ibl.Ibl.Model: { // shouldn't happen: variable would have been declared somewhere before that. Unless the validator let it through.
				var molecule = modelFactory.createMolecularSpecies
				molecule.displayName = 'UNKNOWN REFERENCE: ' + displayName
				molecule.biologicalType = 'UNKNOWN'
				return molecule
			}
		}

		// else search in next container
		return searchFirstDeclaration(container.eContainer, displayName)
	}
	
		// export an EMF model to XML
	// via http://techblog.goelite.org/sending-emf-models-via-soap/
	def public static String convertToXml(EObject eObject) throws IOException {
		var resource = new XMLResourceImpl
		var processor = new XMLProcessor
		resource.getDefaultSaveOptions().put(XMLResourceImpl.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		resource.setEncoding("UTF-8");
		resource.contents.add(eObject);
		return processor.saveToString(resource, null);
	}
}