package roadblock.biocompiler

import org.junit.Test;
import static org.junit.Assert.*;
import org.jacop.constraints.XneqY;
import org.jacop.core.IntVar;
import org.jacop.core.Store;
import org.jacop.search.DepthFirstSearch;
import org.jacop.search.IndomainMin;
import org.jacop.search.InputOrderSelect;
import org.jacop.search.Search;
import org.jacop.search.SelectChoicePoint;
import org.jacop.constraints.Alldifferent
import org.jacop.constraints.XltY
import java.util.List
import java.util.ArrayList
import org.jacop.constraints.XgteqC
import org.jacop.constraints.XlteqC
import org.jacop.constraints.And
import org.jacop.constraints.Constraint
import org.jacop.constraints.PrimitiveConstraint
import org.jacop.constraints.Or
import org.jacop.constraints.Min
import org.jacop.constraints.Max
import roadblock.emf.bioparts.Bioparts.BiopartsFactory

class Scratch {
	
	
	@Test 
	def modelIntVar(){
		var biopartsFactory = BiopartsFactory::eINSTANCE
		val bioPart = biopartsFactory.createBiopart
		
		bioPart.name = "hi"
		
		val store = new Store();  // define FD store
		bioPart.position = new IntVar(store, "v", 1, 10)
		println(bioPart)
		assertTrue(true)
		
	}
	
	@Test
	def nonOverlapping(){
		
		val n = #[4,5,3] // number of parts for each device
		val N = n.size	 // number of devices
		
		val partsNumber = n.reduce[x,y |  x + y]
		// map from device index to variable index
		var deviceToVariable = newHashMap()
		var position = 0
		for(k:1..N){
			deviceToVariable.put(k, newArrayList(position + 1, position + n.get(k-1)))	
			position = position + n.get(k-1)		
		}
		
		println(deviceToVariable)
		val store = new Store();  // define FD store

		// define finite domain variables 
        var IntVar[] v = (1..partsNumber).map[new IntVar(store, "v" + it, 1, partsNumber)]
        
        // All variables have different values
        store.impose(new Alldifferent(v))

        // build and store non-overlapping constraint
		var configuration = 0
		var ArrayList<PrimitiveConstraint> nonOverlappingConstraints = newArrayList()
		
		for(combination: allCombinations(N)){
			var ArrayList<PrimitiveConstraint> configurationIndividualConstraints = newArrayList()
			position = 0
			for(deviceNumber: combination){
				val p1 = 1 + position
				val p2 = n.get(deviceNumber -1 ) + position
				for(i: deviceToVariable.get(deviceNumber).get(0)..deviceToVariable.get(deviceNumber).get(1)){
					configurationIndividualConstraints.add(new XgteqC(v.get(i -1) ,p1))
					configurationIndividualConstraints.add(new XlteqC(v.get(i -1), p2))
				}								
				position = position + n.get(deviceNumber -1)
			}
		
		nonOverlappingConstraints.add(new And(configurationIndividualConstraints))							
		}

 		store.impose(new Or(nonOverlappingConstraints))
 		store.impose(new XltY(v.get(10), v.get(1)))
 
        // search for a solution and print results 
        var Search<IntVar> search = new DepthFirstSearch<IntVar>(); 
        var SelectChoicePoint<IntVar> select = 
            new InputOrderSelect<IntVar>(store, v, 
                                         new IndomainMin<IntVar>()); 
        var boolean result = search.labeling(store, select); 
        
		println(v.map[value])
		
		assertTrue(result);
		
	}
	
	@Test
	def nonOverlappingEasier(){
		val n = #[4,5,3] // number of parts for each device
		val N = n.size	 // number of devices
		
		val partsNumber = n.reduce[x,y |  x + y]
		
		// map from device index to variable index
		var deviceToVariable = newHashMap()
		var position = 0-1
		for(k:1..N){
			deviceToVariable.put(k, newArrayList(position + 1, position + n.get(k-1)))	
			position = position + n.get(k-1)		
		}
		
		println(deviceToVariable)
		val store = new Store();  // define FD store

		// define finite domain variables 
        var IntVar[] v = (1..partsNumber).map[new IntVar(store, "v" + it, 1, partsNumber)]
		
		// define min and max for each device
		var IntVar[] min = (1..N).map[new IntVar(store, "min" + it, 1, partsNumber)]
		var IntVar[] max = (1..N).map[new IntVar(store, "max" + it, 1, partsNumber)]
		for(k: 1..N){
			println("Device " + k)
			println("\t " + deviceToVariable.get(k).get(0) + " to " + deviceToVariable.get(k).get(1))
			store.impose(new Min(v.subList(deviceToVariable.get(k).get(0),1 + deviceToVariable.get(k).get(1)),min.get(k-1)))
			store.impose(new Max(v.subList(deviceToVariable.get(k).get(0),1 + deviceToVariable.get(k).get(1)),max.get(k-1)))
		}

		println(store)
        // All variables have different values
        store.impose(new Alldifferent(v))
		
		// Build non-overlapping constraint
		var ArrayList<PrimitiveConstraint> nonOverlappingConstraints = newArrayList()
		for(combination: allCombinations(N)){
		var ArrayList<PrimitiveConstraint> configurationIndividualConstraints = newArrayList()
			for(k: 1..(N-1)){
				val k1 = combination.get(k-1)
				val k2 = combination.get(k)
				configurationIndividualConstraints.add(new XltY(max.get(k1 - 1), min.get(k2 -1)))	
			}
			nonOverlappingConstraints.add(new And(configurationIndividualConstraints))
		}
		
		store.impose(new Or(nonOverlappingConstraints))
		
		// extra constraint for test
		store.impose(new XltY(v.get(10), v.get(1)))
		
        // search for a solution and print results 
        var Search<IntVar> search = new DepthFirstSearch<IntVar>(); 
        var SelectChoicePoint<IntVar> select = 
            new InputOrderSelect<IntVar>(store, v, 
                                         new IndomainMin<IntVar>()); 
        var boolean result = search.labeling(store, select); 
        
		println(v.map[value])
		
		
		assertTrue(true)
	}
	
	def allCombinations(Integer n){ // produces all combinations of n items
		var combinations = newArrayList(newArrayList(1))
		
		for(k:(2..n)){
			var temp = newArrayList()
			for(c : combinations) 
				for(position: 0..c.size){
					var temp2 = newArrayList()
					temp2.addAll(c)
					temp2.add(position,k)
					temp.add(temp2)
				}			
			combinations = temp
		}
		
		combinations		
	}
	
		
}