package roadblock.biocompiler.tests

import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.Biocompiler

import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.ATGCCloningSites

class FindingRestrictionEnzymesTests {

	// helper: create a small device from a simple data model
	
	def simpleDevice(){
		// build a simple EMF model
		var iblFactory = IblFactory::eINSTANCE		
		var model = iblFactory.createModel
		model.displayName = "Testing model"
		
		var region = iblFactory.createRegion
		region.displayName = "myregion"
		model.regionList.add(region)
		
		var cell = iblFactory.createCell
		cell.displayName = "myCell"
		region.cellList.add(cell)
		
		// device 1 and its list of parts
		var device1 = iblFactory.createDevice
		device1.displayName = "device1"
		cell.deviceList.add(device1)

		for(partName :  #['p1aa','g1bb']){
			var part = iblFactory.createMolecularSpecies
			part.displayName = partName
			device1.partList.add(part)
		}
		
		var cloningSites = iblFactory.createATGCCloningSites
		cloningSites.setCloningSites(3)		
		device1.ATGCCommandList.add(cloningSites)		
		
		// the parts' declaration
		for(partProperty : #[	#['p1aa','AAA','PROMOTER'],
								#['g1bb','TTT','GENE']]){
			var part =iblFactory.createMolecularSpecies
			part => [
				displayName = partProperty.get(0)
				sequence = partProperty.get(1)
				biologicalType = partProperty.get(2)
			]
			cell.moleculeList.add(part)
		}
		
				
		// gather parts
		var biocompiler = new Biocompiler(model)
		biocompiler.gatherParts
		biocompiler.completeDevices
		biocompiler.createIntVarForAllparts
		biocompiler.constraintAllDifferent
		biocompiler.constraintNonOverlapping
		biocompiler.constraintPositionByType
		biocompiler.constraintATGCDIRECTION
				
		println("===========")
		biocompiler.findArrangement
		println("===========")
		biocompiler.print
		
		return biocompiler
	}
	

	@Test
	def noConflicts(){
		var biocompiler = simpleDevice
		
		// Set all sequences to 10 A's
		biocompiler.biocompilerModel.cells.get(0).devices.get(0).parts.filter[biologicalFunction != "CLONINGSITE"].forEach[sequence = "AAAAAAAAAA"]
		
		biocompiler.print
		assertTrue(false)
	}
		
}