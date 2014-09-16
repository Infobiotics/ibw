package roadblock.biocompiler
import org.jacop.constraints.XltY
import org.jacop.constraints.XneqY
import org.jacop.core.Domain
import org.jacop.core.IntVar
import org.jacop.core.Store
import org.jacop.search.DepthFirstSearch
import org.jacop.search.IndomainMin
import org.jacop.search.InputOrderSelect
import org.jacop.search.Search
import org.jacop.search.SelectChoicePoint
import org.jacop.search.SimpleSelect
import org.jacop.search.SmallestDomain

import org.junit.Test
import static org.junit.Assert.*
import java.util.ArrayList
import org.jacop.core.BooleanVar
import org.jacop.constraints.Reified
import org.jacop.constraints.XeqC
import java.util.List
import org.jacop.constraints.Or
import org.jacop.constraints.PrimitiveConstraint
import org.jacop.constraints.Sum
import org.jacop.constraints.XgtC

@Data
class CodonAlternatives {
    List<Integer> form			
    }

@Data
class AcceptableForms {
	Integer codonID
    List<Integer> form			
    }


class ScratchCodonOptimisation {
	
	@Test
	def settingUp(){
		
		
		// codons and their alternatives
		var codons = #[								// codon id
			new CodonAlternatives(#[1,2,3]), 		// 0
			new CodonAlternatives(#[1,2]) ,			// 1
			new CodonAlternatives(#[1,2,3,4]),		// 2
			new CodonAlternatives(#[1,2])			// 3
		] 
		
		// How RE can be freed up
		var re = #[							// RE id
			new AcceptableForms(0,#[3]),	// 0
			new AcceptableForms(0,#[1,2]),	// 1
			new AcceptableForms(1,#[2]),	// 2
			new AcceptableForms(2,#[2,4]),	// 3
			new AcceptableForms(2,#[1,4]),	// 4
			new AcceptableForms(3,#[1])		// 5
			]
			
		// mapping to Jacop	
		var store = new Store
		
		// declare the codons
		var IntVar[] jcodons = newArrayOfSize(codons.size)
		for(k: 0..(codons.size - 1))
			jcodons.set(k, new IntVar(store, "codon_" + k, 1,codons.get(k).form.last))

		// declare the RE
		var IntVar[] jre = newArrayOfSize(re.size)
		for(k: 0..(re.size - 1))
			jre.set(k, new BooleanVar(store, "re_" + k))
		
		// defines the RE
		for(k1: 0..(re.size - 1)){
			
			var ArrayList<PrimitiveConstraint> allAcceptableValues = newArrayList // all acceptable forms of codon re.get(k1).codonID for re k1
			for(i: re.get(0).form)
				allAcceptableValues.add(new XeqC(jcodons.get(re.get(k1).codonID),i))
			store.impose( new Reified( new Or(allAcceptableValues), jre.get(k1)))				
		}
		
		// define objective
		var minimumFreeRE = 3
		
		var numberFreeRE = new IntVar(store, "numberFreeRE",0,re.size)
		store.impose(new Sum(jre,numberFreeRE))
		
		store.impose(new XgtC(numberFreeRE,minimumFreeRE))
		
		store.print
 		if(store.consistency) println("The model is consistent. ")	else println("The model is not consistent.")	
 		
		println("Solving")
		var allVar = newArrayList
		allVar.addAll(jcodons)
		allVar.addAll(jre)
		allVar.addAll(numberFreeRE)
		
		var Search<IntVar> search = new DepthFirstSearch<IntVar> 
        var SelectChoicePoint<IntVar> select = new InputOrderSelect<IntVar>(store, allVar, new IndomainMin<IntVar>) 
        var boolean result = search.labeling(store, select); 
 
        if ( result ) 
            println("Solution: \n\tNumber of fitting RE:" + numberFreeRE + "\n\tRE:" + jre.join(' / ') + "\n\tCodons: " + jcodons.join(" / "))
        else 
            println("*** No Solution found"); 
   
		
		assertTrue(false)
	}
}