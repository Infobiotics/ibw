package roadblock.biocompiler

import java.util.List
import org.jacop.core.IntVar
import org.jacop.core.Store
import com.almworks.sqlite4java.SQLiteConnection
import java.io.File

@Data
class Codon {
    Integer cdsID
    Integer position
    List<Integer> form
    List<Integer> cost
//    IntVar jCodon
//    IntVar jCost
   }

@Data
class AcceptableForms {
	Integer codonID
    List<Integer> form			
    }
    
@Data
class ConflictingRestrictionEnzyme{
	List<AcceptableForms> acceptableForm
	IntVar jRE	
}

class CodonOptimisationForRestrictionEnzymes {
	
	var public List<Codon> codonList
	
	
	// constructor
	new(List<String> cdsList, List<RestrictionEnzyme> reList, String species){
		
		// going through the list of RE to build the list of unique conflicting codons		
		codonList = findUniqueCodons(cdsList, reList)
		
		// for each codon, compute the forms and costs
		
	}
	
	def static computeFormsAndCosts(String codon, String species){
		val aminoAcid = codonToAminoAcid(codon)
		
		val databaseLocation = "resources/codonUsage.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		
		val sql = db.prepare("SELECT CodonUsage.codon, usage FROM CodonUsage JOIN CodonTable ON CodonTable.codon=CodonUsage.codon WHERE CodonTable.aminoAcid='"+ aminoAcid + "' AND CodonUsage.species LIKE '%"+species+"%' ORDER BY CodonUsage.codon")
		
		var List<String> forms = newArrayList
		var List<Double> costs = newArrayList
		
		while(sql.step){
			forms.add(sql.columnString(0))
			costs.add(sql.columnInt(1) * 1.0)
		}
		
		val sum = costs.reduce[a,b|a+b]
		costs = costs.map[Math.log(it/sum)]
		
		var i = -1
		for(k: 0..(forms.size -1)) if(forms.get(k) == codon) i = k
		val baseline = costs.get(i)
		costs = costs.map[baseline - it ]
		
		// tidying up
		sql.dispose
		db.dispose
		
		return #[forms, costs]
	}
	
	def static findUniqueCodons(List<String> cdsList, List<RestrictionEnzyme> reList){
		var codonList = newArrayList
		for(re: reList){
			println("re: " + re.name)
			for(cdsId: 0..(cdsList.size -1)){
				var indices = Biocompiler.matchIndices(cdsList.get(cdsId),re.sequence)
				if(indices.size >0){
					for(i: indices){
						for(codonPosition: (i..(i + re.sequence.length -1)).map[it/3].toList.uniqueInteger){
							codonList.add(new Codon(cdsId, codonPosition, newArrayList, newArrayList))
							
							}
					}
				}
			}
			
		}
		
		return codonList.uniqueCodons 		
	}
	
	def static uniqueCodons(List<Codon> cl){ // returns the unique elements
		cl.fold(newArrayList)[a,b | if(a.contains(b)) a else {a.add(b);a}]		
	}
	
	def static uniqueInteger(List<Integer> i){
		i.fold(newArrayList)[a,b | if(a.contains(b)) a else {a.add(b);a}]
	}
	
	
	
	def static String codonToAminoAcid(String codon){
		switch(codon){
			case #['AAA', 'AAG'].contains(codon): return 'Lysine'
			case #['GCT', 'GCC', 'GCA', 'GCG'].contains(codon): return 'Alanine'
			case #['GGT', 'GGC', 'GGA', 'GGG'].contains(codon): return 'Glycine'
			case #['CAA', 'CAG'].contains(codon): return 'Glutamine'
			case #['TAA', 'TGA', 'TAG'].contains(codon): return 'STOP'
			case #['CGT', 'CGC', 'CGA', 'CGG', 'AGA', 'AGG'].contains(codon): return 'Arginine'
			case #['GAA', 'GAG'].contains(codon): return 'Glutamic acid'
			case #['TTT', 'TTC'].contains(codon): return 'Phenylalanine'
			case #['AAT', 'AAC'].contains(codon): return 'Asparagine'
			case #['TGG'].contains(codon): return 'Tryptophan'
			case #['TTA', 'TTG', 'CTT', 'CTC', 'CTA', 'CTG'].contains(codon): return 'Leucine'
			case #['GAT', 'GAC'].contains(codon): return 'Aspartic acid'
			case #['ATG'].contains(codon): return 'Methionine'
			case #['CAT', 'CAC'].contains(codon): return 'Histidine'
			case #['GTT', 'GTC', 'GTA', 'GTG'].contains(codon): return 'Valine'
			case #['TGT', 'TGC'].contains(codon): return 'Cysteine'
			case #['ATT', 'ATC', 'ATA'].contains(codon): return 'Isoleucine'
			case #['ACT', 'ACC', 'ACA', 'ACG'].contains(codon): return 'Threonine'
			case #['CCT', 'CCC', 'CCA', 'CCG'].contains(codon): return 'Proline'
			case #['TCT', 'TCC', 'TCA', 'TCG', 'AGT', 'AGC'].contains(codon): return 'Serine'
			case #['TAT', 'TAC'].contains(codon): return 'Tyrosine'
		}
		return "UNKNOWN AMINOACID FOR CODON " + codon 		
	}
	
	
//	new(Model emfModel){
//		println(new Date())
//		println("ATGC: Compiling")
//		model = emfModel
//	}
}