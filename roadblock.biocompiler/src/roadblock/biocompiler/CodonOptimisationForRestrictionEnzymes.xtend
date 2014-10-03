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
import org.jacop.core.BooleanVar
import org.jacop.constraints.PrimitiveConstraint
import org.jacop.constraints.Reified
import org.jacop.constraints.Or
import org.jacop.constraints.XeqC
import org.jacop.constraints.And
import org.jacop.constraints.XgteqC
import org.jacop.search.Search
import org.jacop.search.DepthFirstSearch
import org.jacop.search.SelectChoicePoint
import org.jacop.search.InputOrderSelect
import org.jacop.search.IndomainMin

@Data 
class CodonUsageTableElement{
	List<String> forms
	List<Double> costs
}

class CodonOptimisationForRestrictionEnzymes {
	
	var public List<Codon> codonList
	var public Store store = new Store
	var LinkedHashMap<String, CodonUsageTableElement> codonUsageTable
	var public IntVar globalCost
	var public IntVar jNumberFreeRE 
	var public List<FittingRestrictionEnzyme> fittingRestrictionEnzymes
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

//		println("Content of codonList")
//		for(codon:codonList){
//			println("codon on CDS# " + codon.cdsID)
//			println("\t has the forms: " + codon.forms.join(' / '))
//			println("\t has the costs: " + codon.costs.join(' / '))
//		}

		println("Creating the jCodon and jCost")
		for(k: 0..(codonList.size-1))
			codonList.get(k).jCodon = new IntVar(store, "codon_" + k, 1, codonList.get(k).forms.size  )
		
		for(k: 0..(codonList.size -1)){
			codonList.get(k).jCost = new IntVar(store, "cost_" + k, 0, 1000000000)
			store.impose(new Element(codonList.get(k).jCodon, codonList.get(k).costs.map[Math.abs((10000.0 * it)).intValue ], codonList.get(k).jCost))
		}	
		store.consistency
		
//		println("jCodon:")
//		codonList.forEach[println("\t" + it.jCodon.domain)]
//		println("jCost:")
//		codonList.forEach[println("\t" + it.jCost.domain)]
		
		println("\nAdding the globalCost")		
		globalCost = new IntVar(store, "globalCost",-1000000000, 1000000000)	
		store.impose(new Sum(codonList.map[jCost],globalCost))	
		println("Number of combinations to process: " + codonList.map[forms.size as long].reduce[a,b | a*b])

		
//		println("Trying out all combinations of conflicting codons")
		
		fittingRestrictionEnzymes = tryAllCodonCombination(codonList, cdsList, reList)

		for(fre: fittingRestrictionEnzymes){
			println("reID:" + fre.reID + ", fitting combinations:" + fre.fittingCombinationID.size)
		}
		
		println("Create the jRE")
		// creates jRE
		for(fre: fittingRestrictionEnzymes.filter[!fittingCombinationID.empty])
			fre.jRE = new BooleanVar(store, "jRE_" + fre.reID)

		println("Create the rules")		
		// create rules		
		for(fre: fittingRestrictionEnzymes.filter[!fittingCombinationID.empty]){
			println("\tProcessing: " + fre.reID)
			var List<PrimitiveConstraint> andList = newArrayList
			// create an AND for each combination		
			for(combinationID: fre.fittingCombinationID){
				var codonValues = getNthCombination(combinationID, codonList.map[forms.size])
				var List<PrimitiveConstraint> setCodonValue = newArrayOfSize(codonList.size)
				for(i:0..(codonList.size -1)) 
					setCodonValue.set(i,new XeqC(codonList.get(i).jCodon,codonValues.get(i) + 1 )) // set jCodon i to its value in combination (at location i)				
				andList.add(new And(setCodonValue))
			}
			store.impose( new Reified( new Or(andList), fre.jRE))		
		}
		
		println("Create variable for number of free RE")
		jNumberFreeRE = new IntVar(store, "numberFreeRE",0,reList.size)
		store.impose(new Sum(fittingRestrictionEnzymes.filter[!fittingCombinationID.empty].map[jRE],jNumberFreeRE))
		
		println("Done.")
	}
	
	def findAtLeastNRestrictionEnzymes(Integer n){
		
		store.impose(new XgteqC(jNumberFreeRE,n))
		
		var allVar = newArrayList
		allVar.addAll(codonList.map[jCodon])
		allVar.addAll(codonList.map[jCost])
		allVar.addAll(fittingRestrictionEnzymes.filter[!it.fittingCombinationID.empty].map[jRE])
		allVar.addAll(jNumberFreeRE)
		allVar.addAll(globalCost)
		
		var Search<IntVar> search = new DepthFirstSearch<IntVar> 
        var SelectChoicePoint<IntVar> select = new InputOrderSelect<IntVar>(store, allVar, new IndomainMin<IntVar>) 
        var boolean result = search.labeling(store, select, globalCost); 
 
        if ( result ) {
            println("Solution:" +
            	"\n\tGlobal Cost: " + globalCost +        
				"\n\tNumber of fitting RE:" + jNumberFreeRE + 
				"\n\tRE:" + fittingRestrictionEnzymes.filter[!it.fittingCombinationID.empty].map[jRE].join(' / ') + 
				"\n\tCodons: " + codonList.map[jCodon].join(" / ") + 
				"\n\tCosts: " + codonList.map[jCost].join(" / ")
            )
            }
        else {
            println("*** No Solution found"); 
   		}
		
		
	}
	
	def static List<Integer> getNthCombination(Integer combinationID, List<Integer> sizes){
		var List<Integer> cumulativeProduct = cumulativeProduct(sizes)
		var List<Integer> combination = newArrayOfSize(sizes.size)
			for(i: 0..(sizes.size - 1))
				combination.set(i,(combinationID/cumulativeProduct.get(i)) % sizes.get(i))
		return combination
		}
		
	def static List<FittingRestrictionEnzyme> tryAllCodonCombination(List<Codon> codonList, List<String> cdsList, List<RestrictionEnzyme> reList){
		var formSizes = codonList.map[forms.size]
		var cumulativeProduct = cumulativeProduct(formSizes)
		var List<String> cdsListCopy = cdsList.clone
		
		var List<FittingRestrictionEnzyme> fittingRestrictionEnzymes = newArrayOfSize(reList.size)
		for(i: 0..(fittingRestrictionEnzymes.size - 1))
			fittingRestrictionEnzymes.set(i, new FittingRestrictionEnzyme(i))
//		println("Form sizes:" + formSizes.join(' x '))
//		println("So a total of " + cumulativeProduct.last)
		
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
//			println("\t" + wholeSequence)
			
			// check which RE don't cut
			for(i: 0..(reList.size - 1))
				if(!Biocompiler.restrictionEnzymeCuts(wholeSequence,reList.get(i).sequence))
					fittingRestrictionEnzymes.get(i).fittingCombinationID.add(k)						
		}
		
	return fittingRestrictionEnzymes		
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
			var List<String> codons = newArrayList
			var List<Double> usages = newArrayList
			
			while(sql.step){
				codons.add(sql.columnString(0))
				usages.add(sql.columnInt(1) * 1.0)
			}
			
			val sum = usages.reduce[a,b|a+b]
			usages = usages.map[-Math.log(it/sum)] 
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

		var j = v.forms.indexOf(codon)
		var costs = v.costs.clone
		costs.set(j, 0.0)
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