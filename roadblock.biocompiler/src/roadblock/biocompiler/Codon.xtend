package roadblock.biocompiler

import java.util.List
import org.jacop.core.IntVar

class Codon {
	
    public Integer cdsID
    public Integer position
    public List<String> forms = newArrayList
    public List<Double> costs = newArrayList
    public IntVar jCodon
    public IntVar jCost
   
   new (Integer cdsID, Integer position){
   		this.cdsID = cdsID
   		this.position = position
   }

	
		
}