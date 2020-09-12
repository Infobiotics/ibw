package roadblock.biocompiler

import java.util.ArrayList
import java.util.List
import org.jacop.constraints.Element
import org.jacop.constraints.Or
import org.jacop.constraints.PrimitiveConstraint
import org.jacop.constraints.Reified
import org.jacop.constraints.Sum
import org.jacop.constraints.XeqC
import org.jacop.constraints.XgteqC
import org.jacop.core.BooleanVar
import org.jacop.core.IntVar
import org.jacop.core.Store
import org.jacop.search.DepthFirstSearch
import org.jacop.search.IndomainMin
import org.jacop.search.InputOrderSelect
import org.jacop.search.Search
import org.jacop.search.SelectChoicePoint
import org.junit.Test

import static org.junit.Assert.*

@Data
class CodonAlternatives2 {
    List<Integer> form
    List<Integer> cost			
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
		var codons = #[											// codon id
			new CodonAlternatives2(#[1,2,3]  , #[10,0,2]), 		// 0
			new CodonAlternatives2(#[1,2]    , #[1, 0]) ,		// 1
			new CodonAlternatives2(#[1,2,3,4], #[1,5,5, 0]),		// 2
			new CodonAlternatives2(#[1,2]    , #[5, 0]),			// 3
			new CodonAlternatives2(#[1]    , #[0])
		] 
		
		// How RE can be freed up
		var re = #[							// RE id
			new AcceptableForms(0,#[3]),	// 0
			new AcceptableForms(0,#[1,2]),	// 1
			new AcceptableForms(2,#[3]),	// 2
			new AcceptableForms(1,#[1,3]),	// 3
			new AcceptableForms(2,#[3]),	// 4
			new AcceptableForms(3,#[2])		// 5
			]
			
		// mapping to Jacop	
		var store = new Store
		
		// declare the codons
		var IntVar[] jcodons = newArrayOfSize(codons.size)
		for(k: 0..(codons.size - 1))
			jcodons.set(k, new IntVar(store, "codon_" + k, 1,codons.get(k).form.size))
			
		// declare costs
		var List<IntVar> jcosts = newArrayOfSize(codons.size)
		for(k: 0..(codons.size -1)){
			jcosts.set(k, new IntVar(store, "cost_" + k, -100000, 100000))
			store.impose(new Element(jcodons.get(k),codons.get(k).cost,jcosts.get(k)))
						
		}
		
		var tmp1 = new IntVar(store, "tmp1",1,4)
		var tmp2 = new IntVar(store, "tmp2",0,1000)
		var v = #[0,10,20,30]
		store.impose(new Element(tmp1,v,tmp2))
		
		store.consistency
		store.consistency
		println("tmp1:" + tmp1.domain)
		println("tmp2:" + tmp2.domain)
		
		println("jCodon:")
		jcodons.forEach[println("\t" + it.domain)]
		println("jCost:")
		jcosts.forEach[println("\t" + it.domain)]			
		
		var globalCost = new IntVar(store, "globalCost",0, 100000)
		store.impose(new Sum(jcosts,globalCost))		
if(store.consistency) println("The model is consistent. ")	else println("The model is not consistent.")
		// declare the RE
		var IntVar[] jre = newArrayOfSize(re.size)
		for(k: 0..(re.size - 1))
			jre.set(k, new BooleanVar(store, "re_" + k))
		
		// defines the RE
		for(k1: 0..(re.size - 1)){
			println("\tConstraint for RE " + k1)
			
			var ArrayList<PrimitiveConstraint> allAcceptableValues = newArrayList // all acceptable forms of codon re.get(k1).codonID for re k1
			for(i: re.get(k1).form)
				allAcceptableValues.add(new XeqC(jcodons.get(re.get(k1).codonID),i))
			store.impose( new Reified( new Or(allAcceptableValues), jre.get(k1)))				
		}
		
		// define objective
		var minimumFreeRE = 3
		
		var numberFreeRE = new IntVar(store, "numberFreeRE",0,re.size)
		store.impose(new Sum(jre,numberFreeRE))
		
		store.impose(new XgteqC(numberFreeRE,minimumFreeRE))
		
 		if(store.consistency) println("The model is consistent. ")	else println("The model is not consistent.")	
 		
		var allVar = newArrayList
		allVar.addAll(jcodons)
		allVar.addAll(jcosts)
		allVar.addAll(jre)
		allVar.addAll(numberFreeRE)
		allVar.addAll(globalCost)
		
		var Search<IntVar> search = new DepthFirstSearch<IntVar> 
        var SelectChoicePoint<IntVar> select = new InputOrderSelect<IntVar>(store, allVar, new IndomainMin<IntVar>) 
        var boolean result = search.labeling(store, select, globalCost); 
 
        if ( result ) {
            println("Solution:" +
            	"\n\tGlobal Cost: " + globalCost +        
				"\n\tNumber of fitting RE:" + numberFreeRE + 
				"\n\tRE:" + jre.join(' / ') + 
				"\n\tCodons: " + jcodons.join(" / ") + 
				"\n\tCosts: " + jcosts.join(" / ")
            )
            var n = 0
            for(k:0..(re.size-1)){
				var doesFit = (jre.get(k).value == 1)
				assertEquals(re.get(k).form.contains(jcodons.get(re.get(k).codonID).value), doesFit)
				if(doesFit) n = n + 1
				}
			assertEquals(n, numberFreeRE.value)
			assertTrue(numberFreeRE.value >= minimumFreeRE)
            }
        else {
            println("*** No Solution found"); 
			assertTrue(true)
   		}
		
	}
}