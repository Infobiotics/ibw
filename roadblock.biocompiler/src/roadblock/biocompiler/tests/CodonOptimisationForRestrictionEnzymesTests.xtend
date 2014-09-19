package roadblock.biocompiler.tests


import org.junit.Test
import static org.junit.Assert.*
import roadblock.biocompiler.CodonOptimisationForRestrictionEnzymes
import roadblock.biocompiler.RestrictionEnzyme
import roadblock.biocompiler.Codon

class CodonOptimisationForRestrictionEnzymesTests {
//	// codons and their alternatives, costs
//		var codons = #[						// codon id
//			#[#[1,2,3]  , #[10,0,2]], 		// 0
//			#[#[1,2]    , #[1, 0]] ,		// 1
//			#[#[1,2,3,4], #[1,5,5, 0]],		// 2
//			#[#[1,2]    , #[5, 0]]			// 3
//		] 
//		
//		// How RE can be freed up
//		var re = #[							// RE id
//			new AcceptableForms(0,#[3]),	// 0
//			new AcceptableForms(0,#[1,2]),	// 1
//			new AcceptableForms(2,#[3]),	// 2
//			new AcceptableForms(1,#[1,3]),	// 3
//			new AcceptableForms(2,#[3]),	// 4
//			new AcceptableForms(3,#[2])		// 5
//			]
	
	@Test 
	def wholeShebang(){
		// some CDS
		val cdsList = #['CCC ATG CCC CAA TGT', 'CCC CAA ATT TGG GCC CTT'].map[it.replace(' ','')]
		// some RE
		val reList = #[new RestrictionEnzyme('RE0','ANN'), new RestrictionEnzyme('RE1','ATG'), new RestrictionEnzyme('RE2','TNGG')]

		val species = "w3110"
		var cofre = new CodonOptimisationForRestrictionEnzymes(cdsList,reList, species)
		
		assertTrue(false)
	}
	
	@Test 
	def uniqueCodonList(){
		var codonList = #[
			new Codon(0,1),
			new Codon(1,1),
			new Codon(10,1),
			new Codon(0,1),
			new Codon(10,1),
			new Codon(0,3),
			new Codon(11,1)			
		]
		var unique = CodonOptimisationForRestrictionEnzymes.uniqueCodons(codonList)
		
		var expected = #[
			new Codon(0,1),
			new Codon(1,1),
			new Codon(10,1),
			new Codon(0,3),
			new Codon(11,1)			
		]
		
		assertEquals(expected.size, unique.size)
		for(i: 0..(expected.size - 1))
			assertEquals(expected.get(i).cdsID,unique.get(i).cdsID)		
}
	
	@Test 
	def prepareFormsAndCostsTableTests(){
		val species = 'w3110'
		
		val result = CodonOptimisationForRestrictionEnzymes.prepareFormsAndCostsTable(species) 
		
		// all amino acids are present
		val allAminoAcids = #['Lysine','Alanine','Glycine','Glutamine','STOP','Arginine','Glutamic acid','Phenylalanine','Asparagine','Tryptophan','Leucine','Aspartic acid','Methionine','Histidine','Valine','Cysteine','Isoleucine','Threonine','Proline','Serine','Tyrosine']
		
		assertEquals(allAminoAcids.sort,result.keySet.sort)
		
		// check IsoLeucine
		val element = result.get('Isoleucine') //as CodonUsageTableElement
		assertEquals(#['ATA','ATC', 'ATT'], element.forms)
		
		assertEquals(-2.6598093	, element.costs.get(0) as Double, 0.01)	
		assertEquals(-0.8631199	, element.costs.get(1) as Double, 0.01)	
		assertEquals(-0.6768910	, element.costs.get(2) as Double, 0.01)			
	}
	
	@Test
	def computeFormsAndCostsTests(){
		val codon = 'ATT' // isoleucine
		val species = 'w3110'
		
		val codonUsageTable = CodonOptimisationForRestrictionEnzymes.prepareFormsAndCostsTable(species) 
		val result = CodonOptimisationForRestrictionEnzymes.computeFormsAndCosts(codon,codonUsageTable)
		var forms = result.forms
		var costs = result.costs

		// we should have 3 forms: ATA, ATC and ATT, with counts 5733, 34568 and 41644
		// which gives a cost of change of resp.: 1.9829183 0.1862289  0.0
		assertEquals(#['ATA','ATC', 'ATT'], forms )
		assertTrue(forms.size==costs.size)
		val precision = 0.000001  
		assertEquals(1.9829183, costs.get(0) as Double, precision)	
		assertEquals(0.1862289, costs.get(1) as Double, precision)	
		assertEquals(0.0      , costs.get(2) as Double, precision)			
		
	}
			
	@Test 
	def uniqueCodonsTests(){
		// some CDS
		val cdsList = #['XXX ATG XXX XAA TGT', 'XXX YAA ATT TGG GCC CTT'].map[it.replace(' ','')]
		println(cdsList.join("\n"))
		// some RE
		val reList = #[new RestrictionEnzyme('RE0','ANN'), new RestrictionEnzyme('RE1','ATG'), new RestrictionEnzyme('RE2','TNGG')]
		
		val uniqueCodons = CodonOptimisationForRestrictionEnzymes.findUniqueCodons(cdsList,reList)	
		
		println("Found unique codons: ")
		for(c: uniqueCodons){
			println("cdsID: " + c.cdsID + ", position:" + c.position)
		}
		
		val expected = CodonOptimisationForRestrictionEnzymes.uniqueCodons(#[
			new Codon(0,1), // RE0
			new Codon(0,3),
			new Codon(0,4),
			new Codon(1,1),
			new Codon(1,2),
			
			
			new Codon(0,1), // RE1
			new Codon(0,3),
			new Codon(0,4),
			
			new Codon(1,2), // RE2
			new Codon(1,3),
			new Codon(1,4)
		])
		
		assertEquals(expected.size, uniqueCodons.size)
		for(i: 0..(expected.size - 1))
			assertEquals(expected.get(i).cdsID,uniqueCodons.get(i).cdsID)	
	}
	
	@Test
	def codonToAminoAcidTest(){
		assertEquals('Lysine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('AAA'))
		assertEquals('Lysine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('AAG'))
		assertEquals('Alanine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GCT'))
		assertEquals('Alanine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GCC'))
		assertEquals('Alanine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GCA'))
		assertEquals('Alanine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GCG'))
		assertEquals('Glycine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GGT'))
		assertEquals('Glycine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GGC'))
		assertEquals('Glycine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GGA'))
		assertEquals('Glycine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GGG'))
		assertEquals('Glutamine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CAA'))
		assertEquals('Glutamine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CAG'))
		assertEquals('STOP', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TAA'))
		assertEquals('STOP', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TGA'))
		assertEquals('STOP', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TAG'))
		assertEquals('Arginine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CGT'))
		assertEquals('Arginine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CGC'))
		assertEquals('Arginine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CGA'))
		assertEquals('Arginine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CGG'))
		assertEquals('Arginine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('AGA'))
		assertEquals('Arginine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('AGG'))
		assertEquals('Glutamic acid', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GAA'))
		assertEquals('Glutamic acid', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GAG'))
		assertEquals('Phenylalanine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TTT'))
		assertEquals('Phenylalanine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TTC'))
		assertEquals('Asparagine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('AAT'))
		assertEquals('Asparagine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('AAC'))
		assertEquals('Tryptophan', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TGG'))
		assertEquals('Leucine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TTA'))
		assertEquals('Leucine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TTG'))
		assertEquals('Leucine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CTT'))
		assertEquals('Leucine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CTC'))
		assertEquals('Leucine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CTA'))
		assertEquals('Leucine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CTG'))
		assertEquals('Aspartic acid', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GAT'))
		assertEquals('Aspartic acid', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GAC'))
		assertEquals('Methionine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('ATG'))
		assertEquals('Histidine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CAT'))
		assertEquals('Histidine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CAC'))
		assertEquals('Valine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GTT'))
		assertEquals('Valine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GTC'))
		assertEquals('Valine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GTA'))
		assertEquals('Valine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('GTG'))
		assertEquals('Cysteine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TGT'))
		assertEquals('Cysteine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TGC'))
		assertEquals('Isoleucine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('ATT'))
		assertEquals('Isoleucine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('ATC'))
		assertEquals('Isoleucine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('ATA'))
		assertEquals('Threonine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('ACT'))
		assertEquals('Threonine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('ACC'))
		assertEquals('Threonine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('ACA'))
		assertEquals('Threonine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('ACG'))
		assertEquals('Proline', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CCT'))
		assertEquals('Proline', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CCC'))
		assertEquals('Proline', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CCA'))
		assertEquals('Proline', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('CCG'))
		assertEquals('Serine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TCT'))
		assertEquals('Serine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TCC'))
		assertEquals('Serine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TCA'))
		assertEquals('Serine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TCG'))
		assertEquals('Serine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('AGT'))
		assertEquals('Serine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('AGC'))
		assertEquals('Tyrosine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TAT'))
		assertEquals('Tyrosine', CodonOptimisationForRestrictionEnzymes.codonToAminoAcid('TAC'))	
	}		
}