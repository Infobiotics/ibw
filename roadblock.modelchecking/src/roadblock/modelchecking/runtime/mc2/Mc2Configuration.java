package roadblock.modelchecking.runtime.mc2;

import roadblock.modelchecking.runtime.IModelcheckingConfiguration;

public class Mc2Configuration implements IModelcheckingConfiguration {

	public String modelFileName;
	
	public double maxTime;
	
	public double logInterval;
	
	public long runs;
	
	public String simulationAlgorithm;
}
