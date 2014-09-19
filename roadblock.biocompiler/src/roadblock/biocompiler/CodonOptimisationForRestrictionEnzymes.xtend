package roadblock.biocompiler

import java.util.List
import org.jacop.core.IntVar
import org.jacop.core.Store
import com.almworks.sqlite4java.SQLiteConnection
import java.io.File
import java.util.LinkedHashMap
import roadblock.biocompiler.Codon

//@Data
//class Codon {
//    Integer cdsID
//    Integer position
//    List<String> forms
//    List<Double> costs
////    IntVar jCodon
////    IntVar jCost
//   }

@Data 
class CodonUsageTableElement{
	List<String> forms
	List<Double> costs
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
	var LinkedHashMap<String, CodonUsageTableElement> codonUsageTable
	
	// constructor
	new(List<String> cdsList, List<RestrictionEnzyme> reList, String species){
		
		println("Finding unique Codons")
		// going through the list of RE to build the list of unique conflicting codons		
		codonList = findUniqueCodons(cdsList, reList)

		// for each codon, compute the forms and costs
		println("Building codonUsageTable")		
		codonUsageTable = prepareFormsAndCostsTable(species)
		
		println("Computing forms and costs for each codon")		
		for(codon: codonList){
			val codonSequence = cdsList.get(codon.cdsID).substring(codon.position * 3, codon.position * 3 + 3)
			var formsAndCosts = computeFormsAndCosts(codonSequence, codonUsageTable)
			codon.forms = formsAndCosts.forms
			codon.costs = formsAndCosts.costs
		}
		println("Content of codonList")
		for(codon:codonList){
			println("codon on CDS #" + codon.cdsID)
			println("\t has the forms: " + codon.forms.join(' / '))
			println("\t has the costs: " + codon.costs.join(' / '))
		}
	}
	

		
	def static LinkedHashMap<String, CodonUsageTableElement> prepareFormsAndCostsTable(String species){
		
		var LinkedHashMap<String, CodonUsageTableElement> table = newLinkedHashMap
		
		val databaseLocation = "resources/codonUsage.db"
		var db = new SQLiteConnection(new File(databaseLocation))
		if (!db.isOpen) db.open()
		
		
		val allAminoAcids = #['Lysine','Alanine','Glycine','Glutamine','STOP','Arginine','Glutamic acid','Phenylalanine','Asparagine','Tryptophan','Leucine','Aspartic acid','Methionine','Histidine','Valine','Cysteine','Isoleucine','Threonine','Proline','Serine','Tyrosine']
				
		for(aminoAcid: allAminoAcids){
			var sql = db.prepare("SELECT CodonUsage.codon, usage FROM CodonUsage JOIN CodonTable ON CodonTable.codon=CodonUsage.codon WHERE CodonUsage.species LIKE '%"+species+"%' AND aminoAcid ='" + aminoAcid + "' ORDER BY CodonUsage.codon")
			var codons = newArrayList
			var List<Double> usages = newArrayList
			
			while(sql.step){
				codons.add(sql.columnString(0))
				usages.add(sql.columnInt(1) * 1.0)
			}
			
			val sum = usages.reduce[a,b|a+b]
			usages = usages.map[Math.log(it/sum)] 
			table.put(aminoAcid,new CodonUsageTableElement(codons, usages))
			sql.dispose
		}

		// tidying up
		db.dispose
		
		return table	
	}
	
	def static CodonUsageTableElement computeFormsAndCosts(String codon, LinkedHashMap<String, CodonUsageTableElement> codonUsageTable){
		val aminoAcid = codonToAminoAcid(codon)
		
		val v = codonUsageTable.get(aminoAcid)	
		
		var i = -1
		for(k: 0..(v.forms.size -1)) if(v.forms.get(k) == codon) i = k
		val baseline = v.costs.get(i)
		var costs = v.costs.map[baseline - it ]
		
		return new CodonUsageTableElement(v.forms, costs)
	}
	
	def static findUniqueCodons(List<String> cdsList, List<RestrictionEnzyme> reList){
		var List<Codon> codonList = newArrayList
		for(re: reList){
			println("re: " + re.name)
			for(cdsId: 0..(cdsList.size -1)){
				var indices = Biocompiler.matchIndices(cdsList.get(cdsId),re.sequence)
				if(indices.size >0){
					for(i: indices){
						for(codonPosition: (i..(i + re.sequence.length -1)).map[it/3].toList.uniqueInteger){
							codonList.add(new Codon(cdsId, codonPosition))
							
							} 
					}
				}
			}
			
		}

		return codonList.uniqueCodons 		
	}
	
	def static uniqueCodons(List<Codon> cl){ // returns the unique elements
		cl.fold(newArrayList)[a,b | if(a.exists[(it as Codon).cdsID == b.cdsID && (it as Codon).position == b.position]) a else {a.add(b);a}] 		
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