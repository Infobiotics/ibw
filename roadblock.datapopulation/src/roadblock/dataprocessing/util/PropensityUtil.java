package roadblock.dataprocessing.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import roadblock.emf.ibl.Ibl.MolecularSpecies;

public class PropensityUtil {

	private static PropensityUtil instance;

	public static PropensityUtil getInstance() {

		if (instance == null) {
			instance = new PropensityUtil();
		}

		return instance;
	}
	
	public double computePropensity(List<MolecularSpecies> reactants, double stoichiometricRate) {
		double reactionFactor = computeReactionFactor(reactants, stoichiometricRate);
		
		return reactionFactor * stoichiometricRate;
	}
	
	public double computeReactionFactor(List<MolecularSpecies> reactants, double stoichiometricRateConstant) {
		Map<String, Double> totalAmountByReactant = getTotalAmountByReactant(reactants);
		Map<String, Integer> stoichiometryByReactant = getStoichiometryByReactant(reactants);
		double reactionFactor = 1;
		
		for(String reactant : totalAmountByReactant.keySet()) {
			int n = totalAmountByReactant.get(reactant).intValue();
			int v = stoichiometryByReactant.get(reactant);
			
			reactionFactor *= computeFactorial(n) / (computeFactorial(v) * computeFactorial(n - v));
		}
		
		return reactionFactor;
	}
	
	public double computeStoichiometricRateConstant(List<MolecularSpecies> reactants, double kineticRate) {
		Map<String, Integer> stoichiometryByReactant = getStoichiometryByReactant(reactants);
		int volumeDependency = computeVolumeDependency(stoichiometryByReactant);
		
		double volume = 1e-15;
		double avogadroConstant = 6.02214179e23;
		double v = Math.pow(avogadroConstant * volume, volumeDependency - 1);
		
		double stoichiometricRate = 1;
		for(int stoichiometry : stoichiometryByReactant.values())
			stoichiometricRate *= computeFactorial(stoichiometry);
		
		stoichiometricRate *= kineticRate / v;
		
		return stoichiometricRate;
	}
	
	private Map<String, Double> getTotalAmountByReactant(List<MolecularSpecies> reactants) {
		Map<String, Double> totalAmountByReactant = new HashMap<String, Double>();
		
		for (MolecularSpecies reactant : reactants) {
			double totalAmount = totalAmountByReactant.getOrDefault(reactant.getDisplayName(), .0) + reactant.getAmount();
			totalAmountByReactant.put(reactant.getDisplayName(), totalAmount);
		}
		
		return totalAmountByReactant;
	}
	
	private Map<String, Integer> getStoichiometryByReactant(List<MolecularSpecies> reactants) {
		Map<String, Integer> stoichiometryByReactant = new HashMap<String, Integer>();
		
		for (MolecularSpecies reactant : reactants) {
			int count = stoichiometryByReactant.getOrDefault(reactant.getDisplayName(), 0) + 1;
			stoichiometryByReactant.put(reactant.getDisplayName(), count);
		}
		
		return stoichiometryByReactant;
	}
	
	private int computeVolumeDependency(Map<String, Integer> stoichiometryByReactant) {
		int sum = 0;
		for(int stoichiometry : stoichiometryByReactant.values())
			sum += stoichiometry;
		
		return sum;
	}
	
	private long computeFactorial(int n) {
		long fact = 1;
		for(int i = 2; i <= n; i++)
			fact *= i;
		
		return fact;
	}
	
	private PropensityUtil() {
	}
}
