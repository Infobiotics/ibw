package roadblock.simulation.ui.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.osgi.service.prefs.BackingStoreException;

import roadblock.simulation.ui.Activator;
import roadblock.simulation.ui.model.Configuration;

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
		config.dataFile = modelName + ".csv";
		config.modelFile = modelFilename;
		config.dataDirectory = workspacePath + resourcePath;

		setModelName(config.modelName);
		setModelFile(config.modelFile);
		setDataFile(config.dataFile);
		setDataDirectory(config.dataDirectory);
		setMaxTime(config.maxTime);
		setLogInterval(config.logInterval);
		setSampleNumber(config.sampleNumber);
		setSSAlgorithm(config.SSAlgorithm);

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
		config.logInterval = 0.1;
		config.maxTime = 100.;
		config.sampleNumber = 1;
		config.SSAlgorithm = "nrm";
		
		return config;
	}

	private void storeConfig() {
		setModelName(config.modelName);
		setModelFile(config.modelFile);
		setDataFile(config.dataFile);
		setDataDirectory(config.dataDirectory);
		setMaxTime(config.maxTime);
		setLogInterval(config.logInterval);
		setSampleNumber(config.sampleNumber);
		setSSAlgorithm(config.SSAlgorithm);
	}

	private void loadCurrentConfig() {
		config.modelName = getModelName();
		config.modelFile = getModelFile();
		config.dataFile = getDataFile();
		config.dataDirectory = getDataDirectory();
		config.maxTime = getMaxTime();
		config.logInterval = getLogInterval();
		config.sampleNumber = getSampleNumber();
		config.SSAlgorithm = getSSAlgorithm();
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

	private Double getMaxTime() {
		return readDoubleParameterFromConfiguration("maxTime");
	}
	
	private void setMaxTime(Double max_time) {
		writeParameterToConfiguration("maxTime", max_time);
	}
	
	private Double getLogInterval() {
		return readDoubleParameterFromConfiguration("logInterval");
	}
	
	private void setLogInterval(Double interval) {
		writeParameterToConfiguration("logInterval", interval);
	}
	
	private int getSampleNumber() {
		return readIntParameterFromConfiguration("sampleNumber");
	}

	private void setSampleNumber(Integer sampleNumber) {
		writeParameterToConfiguration("sampleNumber", sampleNumber);
	}

	private String getSSAlgorithm() {
		return readParameterFromConfiguration("ssAlgorithm");
	}

	private void setSSAlgorithm(String ssAlgorithm) {
		writeParameterToConfiguration("ssAlgorithm", ssAlgorithm);
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
