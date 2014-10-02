package roadblock.modelchecking.runtime.prism;

import roadblock.modelchecking.runtime.IModelcheckingConfiguration;

public class PrismConfiguration implements IModelcheckingConfiguration {

	public String modelFileName;
	
	public double confidence;
	
	public long pathLength;
	
	public long samples;
	
}
