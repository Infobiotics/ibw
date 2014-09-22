package roadblock.simulation.ui.model;

public class Configuration {

	public String modelName;
	public String modelFile;
	public String dataFile;
	public String dataDirectory;
	public String ssAlgorithm;
	public Integer sampleNumber;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getModelFile() {
		return modelFile;
	}

	public void setModelFile(String modelFile) {
		this.modelFile = modelFile;
	}

	public String getDataFile() {
		return dataFile;
	}

	public void setDataFile(String dataFile) {
		this.dataFile = dataFile;
	}

	public String getDataDirectory() {
		return dataDirectory;
	}

	public void setDataDirectory(String dataDirectory) {
		this.dataDirectory = dataDirectory;
	}

	public String getSSAlgorithm() {
		return ssAlgorithm;
	}

	public void setSSAlgorithm(String ssAlgorithm) {
		this.ssAlgorithm = ssAlgorithm;
	}

	public Integer getSampleNumber() {
		return sampleNumber;
	}

	public void setSampleNumber(Integer sampleNumber) {
		this.sampleNumber = sampleNumber;
	}

}
