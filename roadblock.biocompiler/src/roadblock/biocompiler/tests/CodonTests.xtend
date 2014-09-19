package roadblock.biocompiler.tests

import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.Codon

class CodonTests {

@Test
	def simpleManipulation(){
		var codon = new Codon(1,3)
		
		// constructor
		assertEquals(1, codon.cdsID)
		assertEquals(3, codon.position)
		assertTrue(codon.forms.empty)
		assertTrue(codon.costs.empty)
		
		// updating values
		codon.cdsID = 10
		codon.position = 30
		assertEquals(10, codon.cdsID)
		assertEquals(30, codon.position)
		
		codon.forms.add('AAA')
		codon.forms.add('BBB')
		codon.costs.add(1.0)
		codon.costs.add(42.0)
		
		assertEquals("AAA / BBB",codon.forms.join(" / "))
		assertEquals(43.0, codon.costs.reduce[a,b | a + b], 0.00001)
		
		codon.forms.addAll(#['CCC', 'DDD'])
		codon.costs.addAll(#[-1.0 -42.0])
		
		assertEquals("AAA / BBB / CCC / DDD",codon.forms.join(" / "))
		assertEquals(0.0, codon.costs.reduce[a,b | a + b], 0.00001)
			
		var x = new Codon(1,3)	
		var y = new Codon(1,3)
		
	}
	
}