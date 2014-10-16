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
import java.net.URL
import org.apache.commons.io.IOUtils
import org.sbolstandard.core.Collection
import java.io.InputStreamReader
import java.io.BufferedReader
import roadblock.emf.ibl.Ibl.ATGCCloningSites
import roadblock.emf.bioparts.Bioparts.BiocompilerDevice
import java.util.regex.Pattern
import roadblock.emf.bioparts.Bioparts.BiocompilerCell
import java.util.List
import roadblock.biocompiler.util.BiocompilerUtil

@Data class RestrictionEnzyme {
    String name
    String sequence
    }

@Data class Interval {
    Integer x1
    Integer x2
    }

class NoArrangementFound extends Exception{}
class RBSOptimisationIssue extends Exception{}

class Biocompiler {
	val static utils = new BiocompilerUtil

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
	
	def boolean compile(){ // the whole process
		try {
//			// get explicit parts
//			gatherParts
			
			// complete devices
			completeDevices 
			createIntVarForAllparts
			constraintAllDifferent
			constraintNonOverlapping
			constraintPositionByType
			constraintATGCARRANGE
			constraintATGCDIRECTION
	//		
			println("===========")
			println("Find arrangement")
			
			findArrangement // throws NoArrangementFound
			
			println("===========")
			println("Find sequences")
			lookUpSequence
			addStartCodonToCDS
			findRBSSequence
			findTerminatorSequence
			
			//findNoncuttingRestrictionEnzymes
//			for(cell: biocompilerModel.cells){
//				var ref = new RestrictionEnzymesFinder(cell,"b")
//				var log = ref.searchRE 
//			}
		}
		catch(NoArrangementFound e){
			// add this to the log
			println("No possible arrangement found")
			return false
		}
		catch(RBSOptimisationIssue e){
			// add this to the log
			println("Problem with the RBS calculator.")
			return false
		}
		catch(Exception e){
			// add this to the log
			println("Something when wrong. Please contact the author.")
			println("Error: " + e.message)
//			e.printStackTrace
			return false
		}
		
		return true
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
					// adding cloning sites if need be
					var commands = device.ATGCCommandList.filter[it.class == ATGCCloningSites]
					if(!commands.empty) {
						var n = commands.map[(it as ATGCCloningSites).cloningSites].reduce[a,b | a +b]
						if(n > 0)
							for(k: 1..n){
								var biopart = biopartsFactory.createBiopart
								biopart => [
									name = cell.displayName + "/" + device.displayName + "/RE_" + k 
									sequence = ''
									biologicalFunction = 'CLONINGSITE'
									cellName = cell.displayName
									deviceName = device.displayName
									accessionURL = null
								]
								// add to device
								biocompilerDevice.parts.add(biopart)							
							}
					}
				biocompilerCell.devices.add(biocompilerDevice)
							
			}
			biocompilerModel.cells.add(biocompilerCell)
		}
	}
	println(utils.convertToXml(biocompilerModel))

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
		
		println(utils.convertToXml(biocompilerModel))
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
			if(devicesNumber > 1){
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
					
			// GENE < CLONING SITES
			for(gene: device.parts.filter[biologicalFunction == "GENE"].map[position])		
				for(cloningSite: device.parts.filter[biologicalFunction == "CLONINGSITE"].map[position])
				store.impose(new Or(
						new And(new XltY(gene,cloningSite), new XeqC(device.direction,1)),
						new And(new XgtY(gene,cloningSite), new XeqC(device.direction,0))
						)
					)
			
			// CLONING SITES < TERMINATOR 				
			for(cloningSite: device.parts.filter[biologicalFunction == "CLONINGSITE"].map[position])		
				for(terminator: device.parts.filter[biologicalFunction == "TERMINATOR"].map[position])
				store.impose(new Or(
						new And(new XltY(cloningSite,terminator), new XeqC(device.direction,1)),
						new And(new XgtY(cloningSite,terminator), new XeqC(device.direction,0))
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
	
	def static direction(Biopart part){ // look up direction of containing device
		return (part.eContainer as BiocompilerDevice).direction.value
	}
	
	def constraintATGCARRANGE(){
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
	
	
		
	def constraintATGCDIRECTION(){
		for(region: model.regionList)
		for(cell: region.cellList){
			for(device: cell.deviceList){
			for(command: device.ATGCCommandList.filter[class == ATGCDirection].map[it as ATGCDirection]){
				val biocompilerDevice = findDevice(cell.displayName,device.displayName)
				println("ATGC DIRECTION: Found one in " + cell.displayName + "/" + device.displayName)
				println("\t Device in biocompilerDevice:" + biocompilerDevice)
				println("\t direction:" + command.direction)
				if(biocompilerDevice != null)
						store.impose(new XeqC(biocompilerDevice.direction, if(command.direction == 'BACKWARD') 0 else 1))
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
	
	def findArrangement() throws NoArrangementFound {
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
        
        if(!result) throw new NoArrangementFound
        
		for(cell: biocompilerModel.cells){
			// gather all parts in that cell
			val ArrayList<Biopart> allParts = new ArrayList()
			for(device: cell.devices)
				allParts.addAll(device.parts)
			println(allParts.sortBy[position.value].map[name])
		}
		
	}
	
	def lookUpSequence(){
		// look up sequences in built-in database or online database
		var ArrayList<Biopart> allParts = new ArrayList()
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				allParts.addAll(device.parts.filter[#['PROMOTER', 'GENE'].contains(biologicalFunction)])
		val builtinBiofab = 'atgc://biofab/part/'
		val builtinUser = 'atgc://user-submitted/part/'
		val partsregistry = 'http://parts.igem.org/part:'
		val ncl = 'http://sbol.ncl.ac.uk:8081/part/'
		for(part: allParts){
			if(part.sequence == null || part.sequence == ''){
				val url = part.accessionURL
				// look up sequence from URI
				switch (url){
					case url.toLowerCase.startsWith(builtinBiofab):{part.sequence = getSequenceFromDatabase(url.substring(builtinBiofab.length),'biofab')}
					case url.toLowerCase.startsWith(builtinUser):{part.sequence = getSequenceFromDatabase(url.substring(builtinUser.length),'user-submitted')}
					case url.toLowerCase.startsWith(partsregistry):{part.sequence = getSequenceFromPartsRegistry(url.substring(partsregistry.length))}
					case url.toLowerCase.startsWith(ncl):{part.sequence = getSequenceFromNCL(url.substring(ncl.length))}
					default : {part.sequence = 'Repository not found'}
				}			
			}
			else {
				part.accessionURL = 'ATGC://user-submitted/seq#' + part.sequence
			}
			
		}
	}
	
	def addStartCodonToCDS(){ // add a start codon to GENEs if not present
//	valid start codons: 'ATG' 'GTG'
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				for(part: device.parts.filter[biologicalFunction == 'GENE'])
					if(!#['ATG','GTG'].contains(part.sequence.substring(0,2).toUpperCase))
						part.sequence = 'ATG' + part.sequence
		
	}

	
	
	def buildWholeSequence(BiocompilerCell cell){
		cell.devices.map[parts].flatten.sortBy[position.value].map[utils.finalSequence(it)].join
	}

	def private  getSequenceFromDatabase(String partName, String collection){
		// pick some from the DB
		val databaseLocation = "resources/partRegistry.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		
		var sql = db.prepare("SELECT sequence FROM partRegistry WHERE LOWER(name) = '"+ partName.toLowerCase +"' AND Origin ='" + collection + "'")
		
		var sequence = if(sql.step) sql.columnString(0).toLowerCase else 'part not found'
		
		// tidying up
		sql.dispose
		db.dispose		
		
		return sequence
	}

	def private static getSequenceFromPartsRegistry(String partName){
		var url = new URL('http://parts.igem.org/fasta/parts/' + partName).openStream
		var result = IOUtils.toString(url)
		IOUtils.closeQuietly(url);
		
		return result.substring(result.indexOf("\n")).replace("\n","")
	}

	def private static getSequenceFromNCL(String partName){
		var url = new URL("http://sbol.ncl.ac.uk:8081/part/"+ partName + "/sbol").openStream
		var reader = SBOLFactory.createReader
		var sbol = reader.read(url)
				
		val sequence = ((sbol?.contents?.get(0) as Collection)?.components?.get(0) as DnaComponent)?.dnaSequence?.nucleotides 
		
		return if(sequence==null) "sequence not found" else sequence
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
		// RBS is optimised by Salis' RBS calculator
		for(cell: biocompilerModel.cells)
			for(device: cell.devices)
				for(part: device.parts.filter[biologicalFunction =='RBS']){
					val tmp = utils.optimiseRBS(part, 1000.0)
					part => [
						sequence = tmp.sequence
					 	accessionURL = tmp.accessionURL]
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
	
	def void print(){
		for(cell: biocompilerModel.cells){
			println("Cell: " + cell.name)
			for(device: cell.devices){
				println("\tDevice: " + device.name)
				for(part: device.parts.sortBy[position.value])
					println("\t\t " + part.name + " ( " + part.biologicalFunction + " ) : " + part.sequence)
				
			}
			
		}
		
	}
	def private static SequenceAnnotation makeAnnotation(Biopart part, int sequenceStart, int sequenceEnd){
		var annotation = SBOLFactory.createSequenceAnnotation
		annotation.URI = URI.create("http://sbols.org/anot#" + utils.randomHashLookingString)
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
	
	def String identifiedPartsHtml(){
		var content = <String>newArrayList
		content.add("<HTML>")
		content.add("<BODY BGCOLOR='#FCFCF0' STYLE='font-size:12px'>")
		content.add("<TT>Generated on: " + (new Date) + "</TT>")
		var template = '''
		«FOR cell:biocompilerModel.cells»
		<H2>CELL: «cell.name»</H2>
		«FOR device:cell.devices»
		<H3>Device: «device.name»</H3>
		<UL>
		«FOR part: device.parts»
		<LI>Part: «part.name» («part.biologicalFunction»)</LI>
		«ENDFOR»
		</UL>
		«ENDFOR»
		«ENDFOR»
		'''
		content.add(template)
		content.add("</BODY>")
		content.add("</HTML>")
		return content.join('\n')
	} 
	
	def  makeResultPage(){
		val List<String> colours = newArrayList		
		colours.add("#A6611A")
		colours.add("#DFC27D")
		colours.add("#F5F5F5")
		colours.add("#80CDC1")
		colours.add("#018571")

		val imageNames = <String,String>newHashMap // from type+direction to image filename
		imageNames.put("promoter0","promoterReversed.png")
		imageNames.put("promoter1","promoter.png")
		imageNames.put("rbs0","rbsReversed.png")
		imageNames.put("rbs1","rbs.png")
		imageNames.put("gene0","geneReversed.png")
		imageNames.put("gene1","gene.png")
		imageNames.put("cloningsite0","cloningSiteReversed.png")
		imageNames.put("cloningsite1","cloningSite.png")
		imageNames.put("terminator0","terminatorReversed.png")
		imageNames.put("terminator1","terminator.png") 
		
		var List<String> source = newArrayList
		source.add("<HTML>")
		source.add("<BODY BGCOLOR='#FCFCF0' STYLE='font-size:12px'>")
		
		val path = 'resources/images/'
		
		
		for(cell:biocompilerModel.cells){
			source.add("<H2>Cell: " + cell.name + "</H2>")
			var col = -1
			var deviceLength = 0
			var template='''
				<TABLE cellpadding=0px cellspacing=0px >
				<TR align=center>
				«FOR device: cell.devices.sortBy[parts.get(0).position.value]»
				«{col = (col+1) % colours.size; ''}»
				«{deviceLength = device.parts.size; ''}»
				<TD COLSPAN = «deviceLength» bgcolor='«colours.get(col)»'>
				«device.name»
				</TD>
				«ENDFOR»
				</TR>
				«{col = -1; ''}»

				<TR>
				«FOR device: cell.devices.sortBy[parts.get(0).position.value]»
				«{col = (col+1) % colours.size; ''}»
				«FOR part: device.parts.sortBy[position.value]»
				<TD BGCOLOR = '«colours.get(col)»'><IMG TITLE ='«part.name»: «utils.sequenceToolTip(part.sequence)» ' SRC='«path+imageNames.get(part.biologicalFunction.toLowerCase + device.direction.value)»' BORDER=0 width=76px></TD>
				«ENDFOR»
				«ENDFOR»
				</TR>

				«{col = -1; ''}»
				<TR align=center>
				«FOR device: cell.devices.sortBy[parts.get(0).position.value]»
				«{col = (col+1) % colours.size; ''}»
				«{deviceLength = device.parts.size; ''}»
				<TD COLSPAN = «deviceLength» bgcolor='«colours.get(col)»'>
				&nbsp;
				</TD>
				«ENDFOR»
				</TR>
				
				</TABLE>
				
				«FOR device: cell.devices.sortBy[parts.get(0).position.value]»
				<h3>«device.name»</h3>
				<UL>
				«FOR part: device.parts.sortBy[position.value]»
				<LI>
				<b>«part.name»</b> («part.biologicalFunction») = «part.sequence»
				</LI>
				«ENDFOR»
				</UL>
				«ENDFOR»
				''' 
	source.add(template)
	}

	
		
		source.add("</BODY>")	
		source.add('</HTML>')
		return source.join('\n')
		
	}
	
	
	// for tests only
	def fillUpWithRandomSequences(){
		biocompilerModel.cells.forEach[devices.forEach[parts.forEach[sequence = utils.randomDNA(15)]]]	
	}
}