package roadblock.modelchecking.ui.model;

public class Configuration {

	public String modelName;
	public String modelFile;
	public String dataFile;
	public String dataDirectory;
	public String modelChecker;
	public Double confidenceValue;
	public Integer pathLength;
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

	public String getModelChecker() {
		return modelChecker;
	}

	public void setModelChecker(String modelChecker) {
		this.modelChecker = modelChecker;
	}

	public Double getConfidenceValue() {
		return confidenceValue;
	}

	public void setConfidenceValue(Double confidenceValue) {
		this.confidenceValue = confidenceValue;
	}

	public Integer getPathLength() {
		return pathLength;
	}

	public void setPathLength(Integer pathLength) {
		this.pathLength = pathLength;
	}

	public Integer getSampleNumber() {
		return sampleNumber;
	}

	public void setSampleNumber(Integer sampleNumber) {
		this.sampleNumber = sampleNumber;
	}

}
