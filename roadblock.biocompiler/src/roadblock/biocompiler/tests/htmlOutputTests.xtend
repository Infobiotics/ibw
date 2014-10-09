package roadblock.biocompiler.tests
import org.junit.Test
import static org.junit.Assert.*
import roadblock.emf.ibl.Ibl.IblPackage
import roadblock.biocompiler.Biocompiler
import roadblock.emf.ibl.Ibl.Model
import roadblock.biocompiler.util.BiocompilerUtil
import java.nio.charset.Charset
import java.nio.file.StandardOpenOption
import java.nio.file.Paths
import java.io.File

class htmlOutputTests {
	
	val utils = new BiocompilerUtil
	@Test
	def testATGC00(){	
		val mp = IblPackage.eINSTANCE // necessary for registering the URI
		val XMLsource = utils.readFile("../roadblock.xtext.ibl.tests/testModels/testATGC00.xml",Charset.defaultCharset())
		val model = utils.convertToEObject(XMLsource) as Model
		println(model)
		var biocompiler = new Biocompiler(model)
		
		biocompiler.gatherParts
		biocompiler.completeDevices 
		biocompiler.createIntVarForAllparts
		biocompiler.constraintAllDifferent
		biocompiler.constraintNonOverlapping
		biocompiler.constraintPositionByType
		biocompiler.constraintATGCARRANGE
		biocompiler.constraintATGCDIRECTION
		biocompiler.findArrangement
		
		biocompiler.fillUpWithRandomSequences
		
		biocompiler.print
		var result = biocompiler.makeResultPage
		utils.toFile("resultsATGC.html",result)		
		assertEquals('finished?','nope')
	}
}