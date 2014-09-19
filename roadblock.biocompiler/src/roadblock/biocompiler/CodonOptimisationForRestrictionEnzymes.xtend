package roadblock.biocompiler

import java.util.List
import org.jacop.core.IntVar
import org.jacop.core.Store
import com.almworks.sqlite4java.SQLiteConnection
import java.io.File
import java.util.LinkedHashMap
import roadblock.biocompiler.Codon
import org.jacop.constraints.Element
import org.jacop.constraints.Sum

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
	var public Store store = new Store
	var LinkedHashMap<String, CodonUsageTableElement> codonUsageTable
	var public IntVar globalCost
	
	// constructor
	new(List<String> cdsList, List<RestrictionEnzyme> reList, String species){
		
		println("Finding unique Codons")
		// going through the list of RE to build the list of unique conflicting codons		
		codonList = findUniqueCodons(cdsList, reList)

		// for each codon, compute the forms and costs
		println("Building codonUsageTable")		
		codonUsageTable = prepareFormsAndCostsTable(species)
		
		println("Computing forms and costs for each codon")		
		codonList = computeFormsAndCostsForCodonList(codonList, cdsList, codonUsageTable)

		println("Content of codonList")
		for(codon:codonList){
			println("codon on CDS# " + codon.cdsID)
			println("\t has the forms: " + codon.forms.join(' / '))
			println("\t has the costs: " + codon.costs.join(' / '))
		}

		println("Creating the jForm and jCost for all codons")
		for(k: 0..(codonList.size-1))
			codonList.get(k).jCodon = new IntVar(store, "codon_" + k, 0, codonList.get(k).forms.size -1 )

		for(k: 0..(codonList.size -1)){
			codonList.get(k).jCost = new IntVar(store, "cost_" + k, -1000000000, 1000000000)
			store.impose(new Element(codonList.get(k).jCodon, codonList.get(k).costs.map[(10000.0 * it).intValue], codonList.get(k).jCost))
		}	
		
		globalCost = new IntVar(store, "globalCost",-1000000000, 1000000000)	
		store.impose(new Sum(codonList.map[jCost],globalCost))	
		
		println("Number of combinations to process: " + codonList.map[forms.size].reduce[a,b | a*b])
		store.print
		
		println("Trying out all combinations of conflicting codons")
		tryAllCodonCombination(codonList, cdsList, reList)
	}
	
	def static tryAllCodonCombination(List<Codon> codonList, List<String> cdsList, List<RestrictionEnzyme> reList){
		var formSizes = codonList.map[forms.size]
		var cumulativeProduct = cumulativeProduct(formSizes)
		var List<String> cdsListCopy = cdsList.clone
		
		for(k: 0..(cumulativeProduct.last -1 )){
			var combination = newArrayOfSize(formSizes.size)
			for(i: 0..(formSizes.size - 1))
				combination.set(i,(k/cumulativeProduct.get(i)) % formSizes.get(i))
//			println("Combination # " + k + ", using forms:" + combination.join(' / '))
		
			for(i: 0..(codonList.size -1 )){
				var codon = codonList.get(i)
				var form = codon.forms.get(combination.get(i))
				var sequence = changeCodonInSequence(cdsListCopy.get(codon.cdsID), form, codon.position)
	
				cdsListCopy.set(codon.cdsID, sequence)
			}
			
			var wholeSequence = cdsListCopy.join('x')
			println("\t" + wholeSequence)
			
			var List<String> fittingRE = newArrayList
			
			// check which RE don't cut
			for(re: reList){
				if(!Biocompiler.restrictionEnzymeCuts(wholeSequence,re.sequence))
					fittingRE.add(re.name)						
			}
			println("\t\tFitting: " + fittingRE.join(', '))
			
		}
		
	}
	
	def static changeCodonInSequence(String sequence, String codon, Integer codonNumber){
		return sequence.substring(0,codonNumber * 3) + codon + sequence.substring((codonNumber + 1 )*3)
	}

	def static computeFormsAndCostsForCodonList(List<Codon> codonList, List<String> cdsList,  LinkedHashMap<String, CodonUsageTableElement> codonUsageTable){
		for(codon: codonList){
			val codonSequence = cdsList.get(codon.cdsID).substring(codon.position * 3, codon.position * 3 + 3)
			var formsAndCosts = computeFormsAndCosts(codonSequence, codonUsageTable)
			codon.forms = formsAndCosts.forms
			codon.costs = formsAndCosts.costs
		}	
		return codonList
	}
	
	def static cumulativeProduct(List<Integer> nList){ // starts with 1 
		return nList.fold({var List<Integer> a = newArrayList; a.add(1); a })[a,b | {a.add(a.last * b); a}]
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