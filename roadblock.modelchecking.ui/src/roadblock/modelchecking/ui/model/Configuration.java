package roadblock.modelchecking.ui.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Configuration {

	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

	public String modelName;
	public String modelFile;
	public String dataFile;
	public String dataDirectory;
	public String modelChecker;
	public Double confidenceValue;
	public Integer pathLength;
	public Integer sampleNumber;
	public Double maxTime;
	public Double logInterval;
	public Integer runs;
	public String simulationAlgorithm;
	public String verificationType;

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(propertyName, listener);
	}

	protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
		changeSupport.firePropertyChange(propertyName, oldValue, newValue);
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		changeSupport.firePropertyChange("modelName", this.modelName, this.modelName = modelName);
	}

	public String getModelFile() {
		return modelFile;
	}

	public void setModelFile(String modelFile) {
		changeSupport.firePropertyChange("modelFile", this.modelFile, this.modelFile = modelFile);
	}

	public String getDataFile() {
		return dataFile;
	}

	public void setDataFile(String dataFile) {
		changeSupport.firePropertyChange("dataFile", this.dataFile, this.dataFile = dataFile);
	}

	public String getDataDirectory() {
		return dataDirectory;
	}

	public void setDataDirectory(String dataDirectory) {
		changeSupport.firePropertyChange("dataDirectory", this.dataDirectory, this.dataDirectory = dataDirectory);
	}

	public String getModelChecker() {
		return modelChecker;
	}

	public void setModelChecker(String modelChecker) {
		changeSupport.firePropertyChange("modelChecker", this.modelChecker, this.modelChecker = modelChecker);
	}

	public Double getConfidenceValue() {
		return confidenceValue;
	}

	public void setConfidenceValue(Double confidenceValue) {
		changeSupport.firePropertyChange("confidenceValue", this.confidenceValue, this.confidenceValue = confidenceValue);
	}

	public Integer getPathLength() {
		return pathLength;
	}

	public void setPathLength(Integer pathLength) {
		changeSupport.firePropertyChange("pathLength", this.pathLength, this.pathLength = pathLength);
	}

	public Integer getSampleNumber() {
		return sampleNumber;
	}

	public void setSampleNumber(Integer sampleNumber) {
		changeSupport.firePropertyChange("sampleNumber", this.sampleNumber, this.sampleNumber = sampleNumber);
	}

	public Double getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(Double maxTime) {
		changeSupport.firePropertyChange("maxTime", this.maxTime, this.maxTime = maxTime);
	}

	public Double getLogInterval() {
		return logInterval;
	}

	public void setLogInterval(Double logInterval) {
		changeSupport.firePropertyChange("logInterval", this.logInterval, this.logInterval = logInterval);
	}

	public Integer getRuns() {
		return runs;
	}

	public void setRuns(Integer runs) {
		changeSupport.firePropertyChange("runs", this.runs, this.runs = runs);
	}

	public String getSimulationAlgorithm() {
		return simulationAlgorithm;
	}

	public void setSimulationAlgorithm(String simulationAlgorithm) {
		changeSupport.firePropertyChange("simulationAlgorithm", this.simulationAlgorithm, this.simulationAlgorithm = simulationAlgorithm);
	}

	public String getVerificationType() {
		return verificationType;
	}

	public void setVerificationType(String verificationType) {
		changeSupport.firePropertyChange("verificationType", this.verificationType, this.verificationType = verificationType);
	}
}
