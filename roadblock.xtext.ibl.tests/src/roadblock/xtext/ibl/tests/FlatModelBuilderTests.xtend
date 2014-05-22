package roadblock.xtext.ibl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import roadblock.dataprocessing.flatModel.FlatModelManager
import roadblock.dataprocessing.model.ModelBuilder
import roadblock.xtext.ibl.IblInjectorProvider
import roadblock.xtext.ibl.ibl.Model

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))
class PropertyBuilderTests {
	@Inject extension ParseHelper<Model>

	@Test
	def void testFlatModelMoleculeAndRuleCount() {
		val semanticModel = '''
			define TestCell typeof CELL() {
				a = MOLECULE()
				b = RIBOSOME() : observable
				c = RNA(displayName = "XYZ") : observable
				d = PROMOTER(URI = "biobricks://...")
				f = PROTEIN(URI = "db://...")
				
				DEVICE device = new DEVICE(parts = [d, f])(input = [], output = [b, c]) {
					c = RNA()
					
					RULE rule1 : d ->
					rule1.forwardRate = 1 s^-1
				
					RULE rule2 : c + b <-> c~b
					rule2.forwardRate = 1 min^-1
					rule2.reverseRate = 3 s^-1
				}
				
				RULE rule3 : a + f <-> a~f
				rule3.forwardRate = 1 s^-1
				rule3.reverseRate = 2 min^-1
			}
			
			define region typeof REGION () {
				a = MOLECULE(displayID = "a", degradationRate = 1 min^-1, concentration = 20 fM)
				CELL cell = new TestCell()
			}
		'''.parse
		
		val ModelBuilder modelBuilder = new ModelBuilder();
		val model = modelBuilder.populate(semanticModel);
		
		val flatModelManager = new FlatModelManager(model);
		val flatModel = flatModelManager.flatModel
		
		Assert::assertEquals(flatModel.moleculeList.size, 9);
		Assert::assertEquals(flatModel.ruleList.size, 5);
	}
}
