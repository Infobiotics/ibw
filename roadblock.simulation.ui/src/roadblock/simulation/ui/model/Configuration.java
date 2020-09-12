package roadblock.simulation.ui.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Configuration {

	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
	
	public String modelName;
	public String modelFile;
	public String dataFile;
	public String dataDirectory;
	public Double maxTime;
	public Double logInterval;
	public Integer sampleNumber;
	public String SSAlgorithm;

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
	
	public String getSSAlgorithm() {
		return SSAlgorithm;
	}

	public void setSSAlgorithm(String SSAlgorithm) {
		changeSupport.firePropertyChange("SSAlgorithm", this.SSAlgorithm, this.SSAlgorithm = SSAlgorithm);
	}

}
