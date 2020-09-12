package roadblock.modelchecking.ui.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.osgi.service.prefs.BackingStoreException;

import roadblock.modelchecking.ui.Activator;
import roadblock.modelchecking.ui.model.Configuration;

public class ConfigurationUtil {

	private static final Map<String, ConfigurationUtil> instances = new HashMap<String, ConfigurationUtil>();

	private String configQualifier;
	private Configuration config;

	public static ConfigurationUtil getInstance() {

		String configQualifier = getConfigQualifier();

		if (!instances.containsKey(configQualifier)) {
			ConfigurationUtil configUtil = new ConfigurationUtil(configQualifier);
			instances.put(configQualifier, configUtil);
		}

		return instances.get(configQualifier);
	}

	public static ConfigurationUtil getInstance(XtextResource iblResource) {

		String modelName = iblResource.getURI().trimFileExtension().lastSegment();
		String projectname = iblResource.getURI().toString().replaceAll("^.*resource/", "").replaceAll("/.*", "");
		String configQualifier = getConfigQualifier(projectname, modelName);

		if (!instances.containsKey(configQualifier)) {
			ConfigurationUtil configUtil = new ConfigurationUtil(configQualifier);
			instances.put(configQualifier, configUtil);
		}

		return instances.get(configQualifier);
	}

	public Configuration getConfig(XtextResource iblResource) {

		String modelName = iblResource.getURI().trimFileExtension().lastSegment();
		String modelFilename = iblResource.getURI().lastSegment();
		String workspacePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		String resourcePath = ResourceUtil.getFile(iblResource).getFullPath().removeLastSegments(1).toOSString();

		loadCurrentConfig();
		config.modelName = modelName;
		config.dataFile = modelName;
		config.modelFile = modelFilename;
		config.dataDirectory = workspacePath + resourcePath;

		setModelName(config.modelName);
		setModelFile(config.modelFile);
		setDataFile(config.dataFile);
		setDataDirectory(config.dataDirectory);
		setModelChecker(config.modelChecker);
		setConfidenceValue(config.confidenceValue);
		setPathLength(config.pathLength);
		setSampleNumber(config.sampleNumber);
		setMaxTime(config.maxTime);
		setLogInterval(config.logInterval);
		setRuns(config.runs);
		setSimulationAlgorithm(config.simulationAlgorithm);

		return config;
	}

	public Configuration getConfig() {
		return config;
	}
	
	private Configuration getDefaultConfig() {
		Configuration config = new Configuration();
		config.modelName = "";
		config.modelFile = "";
		config.dataFile = "";
		config.dataDirectory = "";
		config.modelChecker = "PRISM";
		config.confidenceValue = 0.99;
		config.pathLength = 10000;
		config.sampleNumber = 100;
		config.maxTime = 100.0;
		config.logInterval = 1.0;
		config.runs = 1;
		config.simulationAlgorithm = "";
		
		return config;
	}

	private void storeConfig() {
		setModelName(config.modelName);
		setModelFile(config.modelFile);
		setDataFile(config.dataFile);
		setDataDirectory(config.dataDirectory);
		setModelChecker(config.modelChecker);
		setConfidenceValue(config.confidenceValue);
		setPathLength(config.pathLength);
		setSampleNumber(config.sampleNumber);
		setMaxTime(config.maxTime);
		setLogInterval(config.logInterval);
		setRuns(config.runs);
		setSimulationAlgorithm(config.simulationAlgorithm);
	}

	private void loadCurrentConfig() {
		config.modelName = getModelName();
		config.modelFile = getModelFile();
		config.dataFile = getDataFile();
		config.dataDirectory = getDataDirectory();
		config.modelChecker = getModelChecker();
		config.confidenceValue = getConfidenceValue();
		config.pathLength = getPathLength();
		config.sampleNumber = getSampleNumber();
		config.maxTime = getMaxTime();
		config.logInterval = getLogInterval();
		config.runs = getRuns();
		config.simulationAlgorithm = getSimulationAlgorithm();
	}

	private static String getConfigQualifier(String projectName, String modelName) {
		return String.format("%s.parameters.%s.%s", Activator.PLUGIN_ID, projectName, modelName);
	}

	private static String getConfigQualifier() {
		return String.format("%s.parameters.default", Activator.PLUGIN_ID);
	}

	private String getModelName() {
		return readParameterFromConfiguration("modelName");
	}

	private void setModelName(String modelName) {
		writeParameterToConfiguration("modelName", modelName);
	}
	
	private String getModelFile() {
		return readParameterFromConfiguration("modelFile");
	}

	private void setModelFile(String modelFile) {
		writeParameterToConfiguration("modelFile", modelFile);
	}

	private String getDataFile() {
		return readParameterFromConfiguration("dataFile");
	}

	private void setDataFile(String dataFile) {
		writeParameterToConfiguration("dataFile", dataFile);
	}

	private String getDataDirectory() {
		return readParameterFromConfiguration("dataDirectory");
	}

	private void setDataDirectory(String dataDirectory) {
		writeParameterToConfiguration("dataDirectory", dataDirectory);
	}

	private String getModelChecker() {
		return readParameterFromConfiguration("modelChecker");
	}

	private void setModelChecker(String modelChecker) {
		writeParameterToConfiguration("modelChecker", modelChecker);
	}

	private double getConfidenceValue() {
		return readDoubleParameterFromConfiguration("confidenceValue");
	}

	private void setConfidenceValue(Double confidenceValue) {
		writeParameterToConfiguration("confidenceValue", confidenceValue);
	}

	private int getPathLength() {
		return readIntParameterFromConfiguration("pathLength");
	}

	private void setPathLength(Integer pathLength) {
		writeParameterToConfiguration("pathLength", pathLength);
	}

	private int getSampleNumber() {
		return readIntParameterFromConfiguration("sampleNumber");
	}

	private void setSampleNumber(Integer sampleNumber) {
		writeParameterToConfiguration("sampleNumber", sampleNumber);
	}
	
	private double getMaxTime() {
		return readDoubleParameterFromConfiguration("maxTime");
	}

	private void setMaxTime(Double maxTime) {
		writeParameterToConfiguration("maxTime", maxTime);
	}
	
	private double getLogInterval() {
		return readDoubleParameterFromConfiguration("logInterval");
	}

	private void setLogInterval(Double logInterval) {
		writeParameterToConfiguration("logInterval", logInterval);
	}
	
	private int getRuns() {
		return readIntParameterFromConfiguration("runs");
	}

	private void setRuns(Integer runs) {
		writeParameterToConfiguration("runs", runs);
	}
	
	private String getSimulationAlgorithm() {
		return readParameterFromConfiguration("simulationAlgorithm");
	}

	private void setSimulationAlgorithm(String simulationAlgorithm) {
		writeParameterToConfiguration("simulationAlgorithm", simulationAlgorithm);
	}

	private String readParameterFromConfiguration(String parameter) {
		IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode(configQualifier);
		return preferences.get(parameter, null);
	}

	private int readIntParameterFromConfiguration(String parameter) {
		IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode(configQualifier);
		return preferences.getInt(parameter, 0);
	}

	private double readDoubleParameterFromConfiguration(String parameter) {
		IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode(configQualifier);
		return preferences.getDouble(parameter, 0);
	}

	private void writeParameterToConfiguration(String parameter, String value) {
		IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode(configQualifier);
		preferences.put(parameter, value);
		try {
			preferences.flush();
		} catch (BackingStoreException exception) {
			exception.printStackTrace();
		}
	}

	private void writeParameterToConfiguration(String parameter, Integer value) {
		IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode(configQualifier);
		preferences.putInt(parameter, value);
		try {
			preferences.flush();
		} catch (BackingStoreException exception) {
			exception.printStackTrace();
		}
	}

	private void writeParameterToConfiguration(String parameter, Double value) {
		IEclipsePreferences preferences = ConfigurationScope.INSTANCE.getNode(configQualifier);
		preferences.putDouble(parameter, value);
		try {
			preferences.flush();
		} catch (BackingStoreException exception) {
			exception.printStackTrace();
		}
	}

	private ConfigurationUtil(String configQualifier) {
		this.configQualifier = configQualifier;
		this.config = getDefaultConfig();
		storeConfig();
	}
}
