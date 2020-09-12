package roadblock.xtext.ibl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import roadblock.dataprocessing.flatModel.FlatModelManager
import roadblock.dataprocessing.flatModel.PropertyCollector
import roadblock.dataprocessing.model.ModelBuilder
import roadblock.modelchecking.ModelcheckingTarget
import roadblock.modelchecking.translation.TranslationManager
import roadblock.xtext.ibl.IblInjectorProvider
import roadblock.xtext.ibl.ibl.Model

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))
class PrismPropertyTranslatorTests {
	@Inject extension ParseHelper<Model>
	
	@Test
	def void testEventuallyPropertyTranslation() {
		val semanticModel = '''
			define TestCell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 0 uM] EVENTUALLY HOLDS WITHIN [100,200] s WITH PROBABILITY >= 0.9
			}
			define region typeof REGION () {
				CELL cell = new TestCell()
			}
		'''.parse

		val targetTranslation = "P>=0.90 [ F[ 100, 200 ] (region_cell_a > 0.0) ]"
		
		testPropertyTranslation(semanticModel, targetTranslation);
	}
	
	@Test
	def void testNeverPropertyTranslation() {
		val semanticModel = '''
			define TestCell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 0 pM] NEVER HOLDS
			}
			define region typeof REGION () {
				CELL cell = new TestCell()
			}
		'''.parse

		val targetTranslation = "P>0 [ G ! (region_cell_a > 0.0) ]"
		
		testPropertyTranslation(semanticModel, targetTranslation);
	}
	
	@Test
	def void testAlwaysPropertyTranslation() {
		val semanticModel = '''
			define TestCell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 0 fM] ALWAYS HOLDS
			}
			define region typeof REGION () {
				CELL cell = new TestCell()
			}
		'''.parse

		val targetTranslation = "P>0 [ G (region_cell_a > 0.0) ]"
		
		testPropertyTranslation(semanticModel, targetTranslation);
	}
	
	@Test
	def void testSteadyStatePropertyTranslation() {
		val semanticModel = '''
			define TestCell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 0 molecules] HOLDS IN STEADY-STATE
			}
			define region typeof REGION () {
				CELL cell = new TestCell()
			}
		'''.parse

		val targetTranslation = "S>0 [ (region_cell_a > 0.0) ]"
		
		testPropertyTranslation(semanticModel, targetTranslation);
	}
	
	@Test
	def void testInfinitelyOftenPropertyTranslation() {
		val semanticModel = '''
			define TestCell typeof CELL(){
				a = MOLECULE()
				
				VERIFY [a > 24 M] HOLDS INFINITELY OFTEN
			}
			define region typeof REGION () {
				CELL cell = new TestCell()
			}
		'''.parse

		val targetTranslation = "P>0 [ G F (region_cell_a > 1.4400000000000002E10) ]"
		
		testPropertyTranslation(semanticModel, targetTranslation);
	}
	
	@Test
	def void testUntilPropertyTranslation() {
		val semanticModel = '''
			define TestCell typeof CELL(){
				a = MOLECULE()
				b = MOLECULE()
				
				VERIFY [a > 2 fM] WILL HOLD UNTIL THEN [b > 4 uM]
			}
			define region typeof REGION () {
				CELL cell = new TestCell()
			}
		'''.parse

		val targetTranslation = "P>0 [ (region_cell_a > 1.2000000000000002E-6) U (region_cell_b > 2400.0000000000005) ]"
		
		testPropertyTranslation(semanticModel, targetTranslation);
	}
	
	@Test
	def void testExpectedAtPropertyTranslation() {
		val semanticModel = '''
			define TestCell typeof CELL(){
				a = MOLECULE()
				
				VERIFY EXPECTED [a] AT 200 s IS ?
			}
			define region typeof REGION () {
				CELL cell = new TestCell()
			}
		'''.parse

		val targetTranslation = "R{\"region_cell_a_rew\"}=? [ I=200 ]"
		
		testPropertyTranslation(semanticModel, targetTranslation);
	}
	
	@Test
	def void testExpectedWithinPropertyTranslation() {
		val semanticModel = '''
			define TestCell typeof CELL(){
				a = MOLECULE()
				
				VERIFY EXPECTED [a] WITHIN 100 mins IS ?
			}
			define region typeof REGION () {
				CELL cell = new TestCell()
			}
		'''.parse

		val targetTranslation = "R{\"region_cell_a_rew\"}=? [ C<=100 ]"
		
		testPropertyTranslation(semanticModel, targetTranslation);
	}
	
	private def testPropertyTranslation(Model semanticModel, String targetTranslation) {
		
		val ModelBuilder modelBuilder = new ModelBuilder()
		val model = modelBuilder.populate(semanticModel)
		
		val property = PropertyCollector::instance.getAll(model).head;
		
		val flatModelManager = new FlatModelManager(model)
		val flatModelData = flatModelManager.getFlatData(property)
		
		val candidate = TranslationManager::instance.translate(flatModelData.property, ModelcheckingTarget.PRISM)
		
		Assert::assertEquals(targetTranslation, candidate)
	}
}
