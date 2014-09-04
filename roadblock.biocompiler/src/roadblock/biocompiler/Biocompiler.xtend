package roadblock.biocompiler

import java.util.UUID
import java.util.Random
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
import org.sbolstandard.core.DnaComponent
import org.sbolstandard.core.DnaSequence
import org.sbolstandard.core.SBOLDocument
import org.sbolstandard.core.SBOLFactory
import org.sbolstandard.core.SequenceAnnotation
import org.sbolstandard.core.StrandType
import org.sbolstandard.core.util.SBOLPrettyWriter
import org.sbolstandard.core.util.SequenceOntology
import org.sbolstandard.core.SBOLValidationException
import org.sbolstandard.core.impl.DnaComponentImpl.DnaSequenceWrapper
import java.net.URI
import java.io.FileOutputStream
import com.almworks.sqlite4java.SQLiteConnection
import java.io.File
import roadblock.emf.ibl.Ibl.ATGCDirection

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

	def findPart(String cellName, String deviceName, String partName){
		return biocompilerModel.cells.findFirst[name==cellName]?.devices.findFirst[name==deviceName]?.parts.findFirst[name==partName]
	}

	def findPart(String cellName, String partName){
		val cell = biocompilerModel.cells.findFirst[name==cellName]
		for(device: cell.devices){
			var part = device.parts.findFirst[name==partName]
			if(part != null) return part
		}
		return null
	}
	
	def findDevice(String cellName, String deviceName){
		return biocompilerModel.cells.findFirst[name==cellName]?.devices.findFirst[name==deviceName]	
	}
	
	
	def constraintARRANGE(){
		for(region: model.regionList)
		for(cell: region.cellList){
			// at cell level
			for(arrange: cell.ATGCCommandList.filter[class == ATGCArrange].map[it as ATGCArrange]){
				val partList = arrange.partList.map[displayName]
				for(k: 1..(partList.length-1)){
					val part1 = findPart(cell.displayName, partList.get(k - 1))
					val part2 = findPart(cell.displayName, partList.get(k))
					store.impose(new XltY(part1.position,part2.position))
				}
			}
			for(device: cell.deviceList){
				// at device level
			for(arrange: device.ATGCCommandList.filter[class == ATGCArrange].map[it as ATGCArrange]){
				val partList = arrange.partList.map[displayName]
				for(k: 1..(partList.length-1)){
					val part1 = findPart(cell.displayName, device.displayName, partList.get(k - 1))
					val part2 = findPart(cell.displayName, device.displayName, partList.get(k))
					store.impose(new XltY(part1.position,part2.position))
				}
			}			
			}
		}
	}
	
	
		
	def constraintDirection(){
		for(region: model.regionList)
		for(cell: region.cellList){
			for(device: cell.deviceList){
			for(command: device.ATGCCommandList.filter[class == ATGCDirection].map[it as ATGCDirection]){
				val biocompilerDevice = findDevice(cell.displayName,device.displayName)
				if(biocompilerDevice != null)
						store.impose(new XeqC(biocompilerDevice.direction, if(command.direction == ' BACKWARD') 1 else 0))
			}
			}
		}
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
	
	def findTerminatorSequence(){
		// how many needed
		var numberTerminator = 0
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				numberTerminator = numberTerminator + device.parts.filter[biologicalFunction =='TERMINATOR'].length
		
		// pick some from the DB
		val databaseLocation = "resources/partRegistry.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		
		var sql = db.prepare("SELECT * FROM partRegistry WHERE BiologicalFunction=='terminator' ORDER BY RANDOM() LIMIT " + numberTerminator)
		
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				for(part: device.parts.filter[biologicalFunction =='TERMINATOR']){
					sql.step
					part.sequence = sql.columnString(3)
					part.accessionURL = 'http://roadblock.com/atgc/terminator/computerGenerated/seq#' + part.sequence
					part.name = sql.columnString(1)
				}
		
		// tidying up
		sql.dispose
		db.dispose		
		
	}
	
	def findRBSSequence(){
		// RBS is ShineDelgarno + arbitrary sequence 8bp
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				for(part: device.parts.filter[biologicalFunction =='RBS']){
					part => [
						sequence = 'AGGAGGT' + randomDNA(8)
						accessionURL = 'http://roadblock.com/atgc/rbs/computerGenerated/seq#' + sequence
				]
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
	
	// export biocompiler model to an SBOL document
	def SBOLDocument makeSBOLDocument(){
		var document = SBOLFactory.createDocument
		for(cell: biocompilerModel.cells){
			var dnaComponent = SBOLFactory.createDnaComponent
			dnaComponent.URI = URI.create('ATGC://' + cell.name)	
			dnaComponent => [
				description = 'Cell: '+ cell.name
				name = cell.name
				displayId = cell.name
				]
			dnaComponent.addType = URI.create('http://www.w3.org/1999/02/22-rdf-syntax-ns#')		
			// gather all parts in that cell
			val ArrayList<Biopart> allParts = new ArrayList()
			for(device: cell.devices)
				allParts.addAll(device.parts)
				
			var wholeSequence = SBOLFactory.createDnaSequence
			wholeSequence.nucleotides = allParts.sortBy[position.value].map[sequence].reduce[ a, b | a + b].toLowerCase
			wholeSequence.URI = URI.create('http://sbols.org/seq#d23749adb3a7e0e2f09168cb7267a6113b238973')
			dnaComponent.dnaSequence = wholeSequence
			
			var sequenceStart = 1
			for(part :allParts.sortBy[position.value]){
				dnaComponent.addAnnotation(makeAnnotation(part, sequenceStart, sequenceStart + part.sequence.length -1 ))
				sequenceStart = sequenceStart + part.sequence.length -1						
			}

		document.addContent(dnaComponent )		

		}
		
		return document // only export construct for the last cell for the time being
	}
	
	def private static SequenceAnnotation makeAnnotation(Biopart part, int sequenceStart, int sequenceEnd){
		var annotation = SBOLFactory.createSequenceAnnotation
		annotation.URI = URI.create("http://sbols.org/anot#" + randomHashLookingString)
		annotation =>[
			bioStart = 1 //sequenceStart
			bioEnd = 4 // sequenceEnd
			strand = StrandType.POSITIVE
		]
		var dnaComponent = SBOLFactory.createDnaComponent()
		println('\t' + part.accessionURL)
		if(part.accessionURL==null || part.accessionURL == '' )
			dnaComponent.URI = URI.create("http://sbols.org/" + part.name + "/dnaComponent")
		else
			dnaComponent.URI = URI.create(part.accessionURL)
		dnaComponent =>[
			displayId = part.ID
			name = part.name ]
		
		// use the predefined SequenceOntology constant
		switch(part.biologicalFunction){
			case 'PROMOTER': dnaComponent.addType(SequenceOntology.PROMOTER)	
			case 'GENE': dnaComponent.addType(SequenceOntology.CDS)
			case 'RBS': dnaComponent.addType(SequenceOntology.type("SO_0000139"))	
			case 'TERMINATOR': dnaComponent.addType(SequenceOntology.TERMINATOR)
			default: dnaComponent.addType(URI.create("http://purl.obolibrary.org/obo/SO_0000110"))
			
		}

		annotation.setSubComponent(dnaComponent);
		return annotation;
		
	}
	
	def private static randomHashLookingString(){		
		return UUID.randomUUID.toString
		
	}
	
	def private static String randomDNA(int stringLength){
		val rng = new Random
		return (1..stringLength).map["atgc".charAt(rng.nextInt(4)).toString].reduce[a,b | a + b]
	}
	
}