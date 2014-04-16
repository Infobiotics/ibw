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
import roadblock.xtext.ibl.ibl.VariableDefinition
import java.nio.charset.Charset
import java.io.IOException
import java.nio.file.Paths
import java.nio.file.Files
import java.nio.ByteBuffer

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))
class IblValidatorTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	// read file into a string
	// from http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file
	// yep, 3 lines and 5 imports just to read a text file. Java.
	def static String readFile(String path, Charset encoding)  throws IOException 
	{
		var byte[] encoded = Files.readAllBytes(Paths.get(path)) 
	 	return encoding.decode(ByteBuffer.wrap(encoded)).toString
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//						Enforcing variable declaration
//////////////////////////////////////////////////////////////////////////////////////////////////////

// variable assignment
	@Test
	def void testEnforcingDeclarationVariableAssignment(){
		val model = readFile("../roadblock.xtext.ibl.tests/testModels/testEnforcingDeclarationVariableAssignment.ibl",Charset.defaultCharset()).parse		
		
		model.assertError(IblPackage::eINSTANCE.variableAssignment,null,"Complex 'b~c' must be created by a rule or passed on as a parameter.")
		model.assertError(IblPackage::eINSTANCE.deviceDefinition,null,"Variable 'f' must be declared.")
		model.assertError(IblPackage::eINSTANCE.variableAssignment,null,"Variable 'de' must be declared.")		
		model.assertError(IblPackage::eINSTANCE.variableAssignment,null,"Variable 'c' must be declared.")
		model.assertError(IblPackage::eINSTANCE.variableAssignment,null,"Complex 'da~db' must be created by a rule or passed on as a parameter.")
		model.assertError(IblPackage::eINSTANCE.variableAssignment,null,"Variable 'f' must be declared.")		
		model.assertError(IblPackage::eINSTANCE.variableAssignment,null,"Complex 'b~c' must be created by a rule or passed on as a parameter.")

	}


// device signature
	@Test
	def void testEnforcingDeclarationDeviceSignature(){
		val model = readFile("../roadblock.xtext.ibl.tests/testModels/testEnforcingDeclarationDeviceSignature.ibl",Charset.defaultCharset()).parse		
		model.assertError(IblPackage::eINSTANCE.deviceDefinition,null,"Variable 'f' must be declared.")
		model.assertError(IblPackage::eINSTANCE.deviceDefinition,null,"Variable 'g' must be declared.")
		model.assertError(IblPackage::eINSTANCE.deviceDefinition,null,"Variable 'p' must be declared.")
	}
	
// in rules
	@Test
	def void testEnforcingDeclarationRule(){
		val model = readFile("../roadblock.xtext.ibl.tests/testModels/testEnforcingDeclarationRule.ibl",Charset.defaultCharset()).parse		

		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Complex 'fa~fb~fb' must be created by a rule or passed on as a parameter.")		
		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Complex 'da~db~db' must be created by a rule or passed on as a parameter.")
		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Variable 'fa1' must be declared.")
		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Variable 'fb1' must be declared.")
		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Complex 'da~db~db' must be created by a rule or passed on as a parameter.")
		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Variable 'db1' must be declared.")
		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Variable 'da1' must be declared.")
		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Complex 'a~b~b' must be created by a rule or passed on as a parameter.")
		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Variable 'b1' must be declared.")
		model.assertError(IblPackage::eINSTANCE.ruleDefinition,null,"Variable 'a1' must be declared.")
		model.assertError(IblPackage::eINSTANCE.variableAssignment,null,"Complex 'b~c' must be created by a rule or passed on as a parameter.")
	}
	
// in property definitions
	@Test
	def void testEnforcingDeclarationPropertyDefinition(){
		val model = '''
		define myRegion typeof REGION(){
		VERIFY [a1 > 0 uM] EVENTUALLY HOLDS	
		VERIFY [[b1 > 0 uM] OR [b2~b4 > 0 uM]] WILL HOLD UNTIL THEN [b3 > 0 uM]
		VERIFY EXPECTED [a] WITHIN 1000 s IS ?
		VERIFY EXPECTED [a~b] WITHIN 1000 s IS ?
		}
		'''.parse
		
		model.assertError(IblPackage::eINSTANCE.propertyDefinition,null,"Variable 'a1' must be declared.")
		model.assertError(IblPackage::eINSTANCE.propertyDefinition,null,"Variable 'b1' must be declared.")
		model.assertError(IblPackage::eINSTANCE.propertyDefinition,null,"Variable 'b3' must be declared.")
		model.assertError(IblPackage::eINSTANCE.propertyDefinition,null,"Complex 'b2~b4' must be created by a rule or passed on as a parameter.")		
		model.assertError(IblPackage::eINSTANCE.propertyDefinition,null,"Complex 'a~b' must be created by a rule or passed on as a parameter.")
	}


//////////////////////////////////////////////////////////////////////////////////////////////////////
//						Multiple variable declarations
//////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test
	def void testForbidMultipleVariableDeclarationsInRegions(){
		val model = '''
		define myRegion typeof REGION(){
			MOLECULE a = new MOLECULE()
			MOLECULE b = new MOLECULE()
			MOLECULE a = new MOLECULE()
			MOLECULE d = new MOLECULE()
			
			RULE R1: a -> b
			RULE R1: b -> c
			RULE R2: c -> d
	}'''.parse
	
	model.assertError(IblPackage::eINSTANCE.variableDefinition,null,"Variable 'a' is declared twice in the same container.")
	model.assertError(IblPackage::eINSTANCE.variableDefinition,null, "Variable 'a' is declared twice in the same container.")
	model.assertError(IblPackage::eINSTANCE.ruleDefinition,null, "Rule 'R1' is declared twice in the same container.")	
	model.assertError(IblPackage::eINSTANCE.ruleDefinition,null, "Rule 'R1' is declared twice in the same container.")	
	}

	@Test
	def void testForbidMultipleVariableDeclarationsInCells(){
		val model = '''
		define myCell typeof CELL(){
			MOLECULE a = new MOLECULE()
			MOLECULE b = new MOLECULE()
			MOLECULE a = new MOLECULE()
			MOLECULE d = new MOLECULE()
			
			RULE R1: a -> b
			RULE R1: b -> c
			RULE R2: c -> d
	}'''.parse
	
	model.assertError(IblPackage::eINSTANCE.variableDefinition,null,"Variable 'a' is declared twice in the same container.")
	model.assertError(IblPackage::eINSTANCE.variableDefinition,null, "Variable 'a' is declared twice in the same container.")	
	model.assertError(IblPackage::eINSTANCE.ruleDefinition,null, "Rule 'R1' is declared twice in the same container.")	
	model.assertError(IblPackage::eINSTANCE.ruleDefinition,null, "Rule 'R1' is declared twice in the same container.")	
	}

	@Test
	def void testForbidMultipleVariableDeclarationsInDevices(){
		val model = '''
		define myCell typeof CELL(){
			MOLECULE a1 = new MOLECULE()
			MOLECULE b1 = new MOLECULE()
			MOLECULE c1 = new MOLECULE()
			MOLECULE d1 = new MOLECULE()
			
			DEVICE D1 = new DEVICE(parts=[])(input=[],output=[]){
			MOLECULE a = new MOLECULE()
			MOLECULE b = new MOLECULE()
			MOLECULE a = new MOLECULE()
			MOLECULE d = new MOLECULE()
						
			RULE R1: a -> b
			RULE R1: b -> c
			RULE R2: c -> d
			}
			
	}'''.parse
	
	model.assertError(IblPackage::eINSTANCE.variableDefinition,null,"Variable 'a' is declared twice in the same container.")
	model.assertError(IblPackage::eINSTANCE.variableDefinition,null, "Variable 'a' is declared twice in the same container.")	
	model.assertError(IblPackage::eINSTANCE.ruleDefinition,null, "Rule 'R1' is declared twice in the same container.")	
	model.assertError(IblPackage::eINSTANCE.ruleDefinition,null, "Rule 'R1' is declared twice in the same container.")	
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//						OUTSIDE must be used on its own, if used at all
//////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test 
	def void testRuleOutside(){ 
		
		'''
		define dummyProcess typeof PROCESS(){
			MOLECULE aaa = new MOLECULE()
			RULE myRule: aaa + OUTSIDE -> OUTSIDE			
		}
		'''.parse.assertError(IblPackage::eINSTANCE.ruleDefinition, null, "OUTSIDE must be used at most once")

		'''
		define dummyProcess typeof PROCESS(){
			MOLECULE aaa = new MOLECULE()
			MOLECULE ccc = new MOLECULE()
			RULE myRule: aaa + OUTSIDE -> OUTSIDE + ccc			
		}
		'''.parse.assertError(IblPackage::eINSTANCE.ruleDefinition, null, "OUTSIDE must be used at most once")
		
		'''
		define dummyProcess typeof PROCESS(){
			MOLECULE ccc = new MOLECULE()
			RULE myRule:  OUTSIDE -> OUTSIDE + ccc			
		}
		'''.parse.assertError(IblPackage::eINSTANCE.ruleDefinition, null, "OUTSIDE must be used at most once")

		'''
		define dummyProcess typeof PROCESS(){
			MOLECULE aaa = new MOLECULE()
			MOLECULE bbb = new MOLECULE()			
			RULE myRule: aaa + bbb -> OUTSIDE 
		}
		'''.parse.assertNoErrors

		'''
		define dummyProcess typeof PROCESS(){
			MOLECULE aaa = new MOLECULE()
			MOLECULE bbb = new MOLECULE()			
			RULE myRule: OUTSIDE -> aaa + bbb 
		}
		'''.parse.assertNoErrors
		
	'''
		define dummyProcess typeof PROCESS(){
			MOLECULE xxx = new MOLECULE()
			MOLECULE aaa = new MOLECULE()
			MOLECULE bbb = new MOLECULE()
			RULE myRule: OUTSIDE + xxx -> aaa + bbb 
		}
		'''.parse.assertError(IblPackage::eINSTANCE.ruleDefinition, null, "OUTSIDE must be used on its own")

	'''
		define dummyProcess typeof PROCESS(){
			MOLECULE aaa = new MOLECULE()
			MOLECULE bbb = new MOLECULE()
			MOLECULE zzz = new MOLECULE()

			RULE myRule: aaa + bbb -> OUTSIDE + zzz 
		}
		'''.parse.assertError(IblPackage::eINSTANCE.ruleDefinition, null, "OUTSIDE must be used on its own")
			
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
//			allowed body members in different containers
//////////////////////////////////////////////////////////////////////////////////////////////////////
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
//		model.assertError(IblPackage::eINSTANCE.propertyDefinition, null, "Property definitions are not allowed in REGIONs")
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