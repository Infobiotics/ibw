package roadblock.xtext.ibl.tests
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
//import org.eclipse.xtext.junit4.validation.ValidationTestHelper


import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith


import roadblock.xtext.ibl.IblInjectorProvider
import roadblock.xtext.ibl.ibl.Model
import roadblock.xtext.ibl.ibl.ATGCDefinition
import roadblock.xtext.ibl.ibl.ATGCCloningSites
import roadblock.xtext.ibl.ibl.ATGCArrange
import roadblock.xtext.ibl.ibl.ATGCDirection
import roadblock.xtext.ibl.ibl.FunctionDefinition
import roadblock.xtext.ibl.ibl.CellBody

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))

class IblParserTests {
	@Inject extension ParseHelper<Model>
	// @Inject extension ValidationTestHelper
	
	@Test
	def void testATGCParsing(){
		val model = '''
	define myCell typeof CELL(){
		ATGC ARRANGE aaa, bb, ccccc
		ATGC CLONING SITES : 11
		ATGC DIRECTION : BACKWARD
		}
'''.parse
		
	val myCell = (model.members.get(0) as FunctionDefinition).functionBody as CellBody 
	for(definition : myCell.functionContent.members.filter(ATGCDefinition))
		switch(definition.command){
			ATGCCloningSites:  Assert::assertEquals(11, (definition.command as ATGCCloningSites).cloningsites) 
			ATGCArrange: Assert::assertEquals('aaa bb ccccc', (definition.command as ATGCArrange).arguments.map[name].join(' '))
			ATGCDirection:  Assert::assertEquals('BACKWARD', (definition.command as ATGCDirection).direction)
		}	  
	}
	
}