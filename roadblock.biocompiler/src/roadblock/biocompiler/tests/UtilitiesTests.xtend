package roadblock.biocompiler.tests
import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.util.BiocompilerUtil
import static roadblock.biocompiler.tests.UtilitiesTests.*

class UtilitiesTests {
	
	val static utils = new BiocompilerUtil
	
	@Test
	def testRestrictionEnzymeCuts(){
		assertTrue( utils.restrictionEnzymeCuts("AAAGGGG","AAA"))
		assertFalse(utils.restrictionEnzymeCuts("TTTGGGG","AAA"))
	}
	
	@Test
	def testExactlyOneMatch(){ //counting occurences of a DNA string within another string

		assertTrue(utils.exactlyOneMatch("AAATTTGGG","AAA"))
		assertTrue(utils.exactlyOneMatch("AAATTTGGG","TGG"))
		
		assertFalse(utils.exactlyOneMatch("AAATTTGGATTG","ATT")) 	// 2 matches		
		assertFalse(utils.exactlyOneMatch("AAATTTGG","AA"))		// 2 matches, overlapping

		assertTrue( utils.exactlyOneMatch("AAATTTGGG","TTTNG"))
		assertFalse(utils.exactlyOneMatch("AAATTTGGG","TTNG")) // 2 matches: TTTG and TTGG
		// With wild cards
		val wildCard = #[ 
			#['M', 'AC'], 
			#['R', 'AG'],
			#['W', 'AT'],
			#['Y', 'CT'],
			#['S', 'CG'],
			#['K', 'GT'],
			#['H', 'ACT'],
			#['B', 'CGT'],
			#['V', 'ACG'],
			#['D', 'AGT']]
			
		for(v: wildCard){
			val doesMatch = v.get(1).toCharArray
			val doesNotMatch = 	"ATGC".toCharArray.filter[!doesMatch.contains(it)]
			
			// one match only: 1w2
			for(w: doesMatch)
					assertTrue(utils.exactlyOneMatch("XXX1" + w +"2YYY", "1" + v.get(0) + "2"))
			
			// no match
			for(w: doesNotMatch)
					assertFalse(utils.exactlyOneMatch("XXX1" + w +"2YYY", "1" + v.get(0) + "2"))
		}	
	
	}
	
	@Test
	def testChangeCodonInSequence(){
		var String sequence = 'XXXYYYZZZ'
		 
		var result = utils.changeCodonInSequence(sequence, "BBB",1)
		assertEquals("XXXBBBZZZ", result)
		
		result = utils.changeCodonInSequence(sequence, "AAA", 0)
		assertEquals("AAAYYYZZZ", result)	

		result = utils.changeCodonInSequence(sequence, "CCC", 2)
		assertEquals("XXXYYYCCC", result)	
			
	}
	

}