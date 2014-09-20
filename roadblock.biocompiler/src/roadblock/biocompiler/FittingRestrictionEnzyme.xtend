package roadblock.biocompiler

import java.util.List
import org.jacop.core.IntVar

class FittingRestrictionEnzyme {
	var public Integer reID
	var public List<Integer> fittingCombinationID = newArrayList
	var public IntVar jRE	
	
	new (Integer reID){
 		this.reID = reID
   }
	
}