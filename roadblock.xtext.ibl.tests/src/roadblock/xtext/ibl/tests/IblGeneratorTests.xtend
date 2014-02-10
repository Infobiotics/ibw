package roadblock.xtext.ibl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import roadblock.xtext.ibl.IblInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(IblInjectorProvider))

class IblGeneratorTests {
	
	@Inject extension CompilationTestHelper
	
	@Test
	def void testGeneratedCode() {
		'''
define dummyProcess typeof PROCESS(){}
		'''.assertCompilesTo(
		'''some content 2''')
	}
	
}