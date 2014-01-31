package roadblock.xtext.ibl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import roadblock.xtext.ibl.IblInjectorProvider
import roadblock.xtext.ibl.ibl.Model
import org.junit.Test
import org.junit.runner.RunWith
import roadblock.xtext.ibl.ibl.IblPackage

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))
class IblValidatorTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper


	@Test // testing all possible function body members in PROCESS
	def void testWrongMembersOfProcess() {
		val model = '''
define dummyProcess typeof PROCESS(
	PROMOTER somePromoter:input,
	GENE someGene:input,
	PROTEIN someProtein:output
){
	RNA mrna
	
	RULE rule01: somePromoter + mrna <-> somePromoter~mrna
	RULE rule02: someGene + somePromoter~mrna -> someProtein
}


define anotherProcess typeof PROCESS(
	MOLECULE signal: output
){ 
	MOLECULE a
	MOLECULE b
	MOLECULE c

	ATGC ARRANGE : a, b 
	CELL myCell = new CELL() 
	CHROMOSOME myChromosome = new someChromosome()
	DEVICE myDevice = new DEVICE(parts = [a])(input = [b]){}
	PLASMID myPlasmid = new somePlasmid()
	PROCESS myDummyProcess = new dummyProcess(somePromoter = a, someGene = b, someProtein = c)
	VERIFY [signal > 0 uM] EVENTUALLY HOLDS
	RULE ruleccc: a~a -> b~b + g~g
	SYSTEM mySystem = new someSystem()
	MOLECULE a = new MOLECULE()
	a = b	
}		
		'''.parse
		
		model.assertError(IblPackage::eINSTANCE.ATGCDefinition, null, "ATGC directives are not allowed in PROCESSes")
		model.assertError(IblPackage::eINSTANCE.cellInstantiation, null, "Cell instantiations are not allowed in PROCESSes")
		model.assertError(IblPackage::eINSTANCE.chromosomeInstantiation, null, "Chromosome instantiations are not allowed in PROCESSes")
		model.assertError(IblPackage::eINSTANCE.deviceDefinition, null, "Device definitions are not allowed in PROCESSes")
		model.assertError(IblPackage::eINSTANCE.plasmidInstantiation, null, "Plasmid instantiations are not allowed in PROCESSes")
		model.assertError(IblPackage::eINSTANCE.propertyDefinition, null, "Property definitions are not allowed in PROCESSes")
		model.assertError(IblPackage::eINSTANCE.systemInstantiation, null, "System instantiations are not allowed in PROCESSes")
		
	}
	
	@Test // testing all possible function body members in SYSTEM
	def void testWrongMembersOfSystem() {
		val model = '''
		define someSystem typeof SYSTEM(){
	ATGC ARRANGE : a, b 
	CELL myCell = new someCELL() 
	CHROMOSOME myChromosome = new someChromosome()
	DEVICE myDevice = new DEVICE(parts = [a])(input = [b]){}
	PLASMID myPlasmid = new somePlasmid()
	PROCESS myDummyProcess = new dummyProcess(somePromoter = a, someGene = b, someProtein = c)
	VERIFY [signal > 0 uM] EVENTUALLY HOLDS
	RULE ruleccc: a~a -> b~b + g~g
	SYSTEM mySystem = new someSystem()
	MOLECULE a = new MOLECULE()
	a = b	
}
		'''.parse

		model.assertError(IblPackage::eINSTANCE.cellInstantiation, null, "Cell instantiations are not allowed in SYSTEMs")
		model.assertError(IblPackage::eINSTANCE.chromosomeInstantiation, null, "Chromosome instantiations are not allowed in SYSTEMs")
		model.assertError(IblPackage::eINSTANCE.plasmidInstantiation, null, "Plasmid instantiations are not allowed in SYSTEMs")
		model.assertError(IblPackage::eINSTANCE.systemInstantiation, null, "System instantiations are not allowed in SYSTEMs")
	}	
	
	@Test // testing all possible function body members in PLASMID
	def void testWrongMembersOfPlasmid() {
		val model = '''
		define somePlasmid typeof PLASMID(){
	ATGC ARRANGE : a, b 
	CELL myCell = new someCELL() 
	CHROMOSOME myChromosome = new someChromosome()
	DEVICE myDevice = new DEVICE(parts = [a])(input = [b]){}
	PLASMID myPlasmid = new somePlasmid()
	PROCESS myDummyProcess = new dummyProcess(somePromoter = a, someGene = b, someProtein = c)
	VERIFY [signal > 0 uM] EVENTUALLY HOLDS
	RULE ruleccc: a~a -> b~b + g~g
	SYSTEM mySystem = new someSystem()
	MOLECULE a = new MOLECULE()
	a = b	
}
		'''.parse

		model.assertError(IblPackage::eINSTANCE.cellInstantiation, null, "Cell instantiations are not allowed in PLASMIDs")
		model.assertError(IblPackage::eINSTANCE.chromosomeInstantiation, null, "Chromosome instantiations are not allowed in PLASMIDs")
		model.assertError(IblPackage::eINSTANCE.plasmidInstantiation, null, "Plasmid instantiations are not allowed in PLASMIDs")
	}	

	@Test // testing all possible function body members in CHROMOSOME
	def void testWrongMembersOfChromosome() {
		val model = '''
		define someChromosome typeof CHROMOSOME(){
	ATGC ARRANGE : a, b 
	CELL myCell = new someCELL() 
	CHROMOSOME myChromosome = new someChromosome()
	DEVICE myDevice = new DEVICE(parts = [a])(input = [b]){}
	PLASMID myPlasmid = new somePlasmid()
	PROCESS myDummyProcess = new dummyProcess(somePromoter = a, someGene = b, someProtein = c)
	VERIFY [signal > 0 uM] EVENTUALLY HOLDS
	RULE ruleccc: a~a -> b~b + g~g
	SYSTEM mySystem = new someSystem()
	MOLECULE a = new MOLECULE()
	a = b	
}
		'''.parse

		model.assertError(IblPackage::eINSTANCE.cellInstantiation, null, "Cell instantiations are not allowed in CHROMOSOMEs")
		model.assertError(IblPackage::eINSTANCE.chromosomeInstantiation, null, "Chromosome instantiations are not allowed in CHROMOSOMEs")
		model.assertError(IblPackage::eINSTANCE.plasmidInstantiation, null, "Plasmid instantiations are not allowed in CHROMOSOMEs")
	}	

	@Test // testing all possible function body members in CELL
	def void testWrongMembersOfCell() {
		val model = '''
		define someCell typeof CELL(){
	ATGC ARRANGE : a, b 
	CELL myCell = new someCELL() 
	CHROMOSOME myChromosome = new someChromosome()
	DEVICE myDevice = new DEVICE(parts = [a])(input = [b]){}
	PLASMID myPlasmid = new somePlasmid()
	PROCESS myDummyProcess = new dummyProcess(somePromoter = a, someGene = b, someProtein = c)
	VERIFY [signal > 0 uM] EVENTUALLY HOLDS
	RULE ruleccc: a~a -> b~b + g~g
	SYSTEM mySystem = new someSystem()
	MOLECULE a = new MOLECULE()
	a = b	
}
		'''.parse

		model.assertError(IblPackage::eINSTANCE.cellInstantiation, null, "Cell instantiations are not allowed in CELLs")
	}	

	@Test // testing all possible function body members in REGION
	def void testWrongMembersOfREGION() {
		val model = '''
		define someRegion typeof REGION(){
	ATGC ARRANGE : a, b 
	CELL myCell = new someCELL() 
	CHROMOSOME myChromosome = new someChromosome()
	DEVICE myDevice = new DEVICE(parts = [a])(input = [b]){}
	PLASMID myPlasmid = new somePlasmid()
	PROCESS myDummyProcess = new dummyProcess(somePromoter = a, someGene = b, someProtein = c)
	VERIFY [signal > 0 uM] EVENTUALLY HOLDS
	RULE ruleccc: a~a -> b~b + g~g
	SYSTEM mySystem = new someSystem()
	MOLECULE a = new MOLECULE()
	a = b	
}
		'''.parse

		model.assertError(IblPackage::eINSTANCE.ATGCDefinition, null, "ATGC directives are not allowed in REGIONs")
		model.assertError(IblPackage::eINSTANCE.chromosomeInstantiation, null, "Chromosome instantiations are not allowed in REGIONs")
		model.assertError(IblPackage::eINSTANCE.deviceDefinition, null, "Device definitions are not allowed in REGIONs")
		model.assertError(IblPackage::eINSTANCE.plasmidInstantiation, null, "Plasmid instantiations are not allowed in REGIONs")
		model.assertError(IblPackage::eINSTANCE.processInstantiation, null, "Process instantiations are not allowed in REGIONs")
		model.assertError(IblPackage::eINSTANCE.propertyDefinition, null, "Property definitions are not allowed in REGIONs")
		model.assertError(IblPackage::eINSTANCE.systemInstantiation, null, "System instantiations are not allowed in REGIONs")
	}	

	@Test // testing all possible function body members in CUSTOMFUNCTION
	def void testWrongMembersOfCustomFunction() {
		val model = '''
		define myCustomFunction typeof someCustomFunction(){
	ATGC ARRANGE : a, b 
	CELL myCell = new someCELL() 
	CHROMOSOME myChromosome = new someChromosome()
	DEVICE myDevice = new DEVICE(parts = [a])(input = [b]){}
	PLASMID myPlasmid = new somePlasmid()
	PROCESS myDummyProcess = new dummyProcess(somePromoter = a, someGene = b, someProtein = c)
	VERIFY [signal > 0 uM] EVENTUALLY HOLDS
	RULE ruleccc: a~a -> b~b + g~g
	SYSTEM mySystem = new someSystem()
	MOLECULE a = new MOLECULE()
	a = b	
}
		'''.parse
		
		model.assertError(IblPackage::eINSTANCE.cellInstantiation, null, "Cell instantiations are not allowed in CUSTOMFUNCTION")

	}	

}