package roadblock.biocompiler.ui.model;

public class Configuration {

	public String modelName;
	public String modelFile;
	public String dataFile;
	public String dataDirectory;
	public Double maxTime;
	public Double logInterval;
	public Integer sampleNumber;
	public String SSAlgorithm;

	
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

	public Integer getSampleNumber() {
		return sampleNumber;
	}

	public void setSampleNumber(Integer sampleNumber) {
		this.sampleNumber = sampleNumber;
	}

	public Double getMaxTime() {
		return maxTime;
	}
	
	public void setMaxTime(Double maxTime) {
		this.maxTime = maxTime;
	}
	
	public Double getLogInterval() {
		return logInterval;
	}
	
	public void setLogInterval(Double logInterval) {
		this.logInterval = logInterval;
	}
	
	public String getSSAlgorithm() {
		return SSAlgorithm;
	}

	public void setSSAlgorithm(String ssAlgorithm) {
		this.SSAlgorithm = ssAlgorithm;
	}

}
