package roadblock.biocompiler.tests
import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.Biocompiler

class UtilitiesTests {
	@Test
	def testExactlyOneMatch(){ //counting occurences of a DNA string within another string

		assertTrue(Biocompiler.exactlyOneMatch("AAATTTGGG","AAA"))
		assertTrue(Biocompiler.exactlyOneMatch("AAATTTGGG","TGG"))
		
		assertFalse(Biocompiler.exactlyOneMatch("AAATTTGGATTG","ATT")) 	// 2 matches		
		assertFalse(Biocompiler.exactlyOneMatch("AAATTTGG","AA"))		// 2 matches, overlapping

		assertTrue( Biocompiler.exactlyOneMatch("AAATTTGGG","TTTNG"))
		assertFalse(Biocompiler.exactlyOneMatch("AAATTTGGG","TTNG")) // 2 matches: TTTG and TTGG
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
					assertTrue(Biocompiler.exactlyOneMatch("XXX1" + w +"2YYY", "1" + v.get(0) + "2"))
			
			// no match
			for(w: doesNotMatch)
					assertFalse(Biocompiler.exactlyOneMatch("XXX1" + w +"2YYY", "1" + v.get(0) + "2"))
		}	
	
	}
	
@Test 
	def testNoncuttingRE(){
		val preSequence = "AAA"
		val postSequence = "TTT"
		val list = Biocompiler.findNNoncuttingRestrictionEnzymes(20,preSequence,postSequence)

		val finalSequence = preSequence + list.map[sequence].join + postSequence

		// none of the RE cut the final sequence
		assertTrue(list.map[Biocompiler.exactlyOneMatch(finalSequence,it.sequence)].reduce[a , b | a && b])		
	}

}