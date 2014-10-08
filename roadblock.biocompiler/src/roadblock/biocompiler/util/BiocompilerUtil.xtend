package roadblock.biocompiler.util

import java.util.Random
import java.util.UUID
import java.util.regex.Pattern
import java.util.ArrayList
import roadblock.emf.bioparts.Bioparts.Biopart
import roadblock.emf.bioparts.Bioparts.BiocompilerDevice

class BiocompilerUtil {
	val static wildCard = #[ 
		#['N', 'ATGC'], 
		#['M', 'AC'], 
		#['R', 'AG'],
		#['W', 'AT'],
		#['Y', 'CT'],
		#['S', 'CG'],
		#['K', 'GT'],
		#['H', 'ACT'],
		#['B', 'CGT'],
		#['V', 'ACG'],
		#['D', 'AGT']]
	
	def randomHashLookingString(){		
		return UUID.randomUUID.toString
		
	}
	
	def String randomDNA(int stringLength){
		val rng = new Random
		return (1..stringLength).map["atgc".charAt(rng.nextInt(4)).toString].reduce[a,b | a + b]
	}
	
	def char complement(char x){
		var char t = x
		switch(x.toString) {
			case 'A' : t = 'T'
			case 'T' : t = 'A'
			case 'G' : t = 'C'
			case 'C' : t = 'G'
			}
		return t	
	}
	
	def reverseComplement(String dna){
		return dna.toUpperCase.toCharArray.reverse.map[complement].join
		}
	// 
	// part manipulation
	//
	
	def String finalSequence(Biopart part){ // gets the sequence of a part. Reverse complement if necessary.
		if(part.sequence == null) return ''
		
		val containingDevice = part.eContainer as BiocompilerDevice
		if(containingDevice.direction.value == 1)
			return part.sequence
		else return reverseComplement(part.sequence)
		
	}
	
		
	//	
	// utilities for Restriction enzymes
	//
	
	def boolean restrictionEnzymeCuts(String sequence, String reSequence){
			
		var pattern = reSequence.toUpperCase			

		for(v: wildCard) {
			pattern = pattern.replace(v.get(0), "[" + v.get(1) + "]")
		}
		
		return ((sequence.toUpperCase).split("(" + pattern + ")").size > 1)
	}
	
	def exactlyOneMatch(String s, String match){
			
		var pattern = match.toUpperCase			

		for(v: wildCard) {
			pattern = pattern.replace(v.get(0), "[" + v.get(1) + "]")
		}
		pattern = "(?=(" + pattern + "))"					// ?= is the look-ahead operator, for overlapping matches
		return ('x' + s.toUpperCase).split(pattern,-1).size == 2 
	}	

	def matchIndices(String s, String match){
	// returns the indices of the occurrences of match in s
			
		var pattern = match.toUpperCase			

		for(v: wildCard) {
			pattern = pattern.replace(v.get(0), "[" + v.get(1) + "]")
		}
		pattern = "(?=(" + pattern + "))"					// ?= is the look-ahead operator, for overlapping matches

		var index = Pattern.compile(pattern).matcher(s.toUpperCase) 
		
		var ArrayList<Integer> indices = new ArrayList
		while(index.find) indices.add(index.start)
		
		return indices	
	}
	
}