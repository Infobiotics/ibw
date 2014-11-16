package roadblock.modelchecking.runtime.mc2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import roadblock.bin.BinaryPathProvider;
import roadblock.dataprocessing.flatModel.FlatModelManager;
import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.runtime.IModelcheckingExecutor;
import roadblock.modelchecking.translation.TranslationManager;

public class Mc2Executor implements IModelcheckingExecutor<Mc2Configuration> {

	private TranslationManager translationManager = TranslationManager.getInstance();

	@Override
	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);

		writeFile(filename + ".queries", propetyTranslation);
	}

	@Override
	public Process verify(Model model, IProperty property, ModelcheckingTarget target, Mc2Configuration config) throws IOException, InterruptedException {

		FlatModelManager flatModelManager = new FlatModelManager(model);
		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		FlatModel flatModel = flatData.getFlatModel();
		String xmlFlatModel = convertToXml(flatModel);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);

		String simulationFileName = config.modelFileName + ".csv";
		String propertiesFileName = config.modelFileName + ".queries";

		String ngssPath = BinaryPathProvider.getInstance().getNgssPath();
		String mc2Path = BinaryPathProvider.getInstance().getMc2Path();

		String[] simulationCommand = new String[] { ngssPath, "--emf", "parser=emf", "max_time=" + config.maxTime, "max_runtime=" + 0.0, "simulation_algorithm=" + config.simulationAlgorithm,
				"data_file=" + simulationFileName, "log_interval=" + config.logInterval, "runs=" + config.runs, "seed=0", "output=console", "compress=true", "parallel=true", "show_progress=false" };
		String[] verificationCommand = new String[] { "java", "-jar", mc2Path, "stoch", simulationFileName, propertiesFileName, "-time" };

		Process simulationProcess = runSimulation(simulationCommand, xmlFlatModel, simulationFileName);
		simulationProcess.waitFor();

		writeFile(propertiesFileName, propetyTranslation);

		Process verificationProcess = Runtime.getRuntime().exec(verificationCommand);

		return verificationProcess;
	}

	private Process runSimulation(String[] command, String xmlFlatModel, String simulationFileName) throws IOException {

		Process simulationProcess = Runtime.getRuntime().exec(command);

		// pass the input model
		OutputStream input = simulationProcess.getOutputStream();
		input.write(xmlFlatModel.getBytes());
		input.close();

		// write simulation traces
		BufferedReader output = new BufferedReader(new InputStreamReader(simulationProcess.getInputStream()));
		StringBuilder simulationTrace = new StringBuilder();

		String part = null;
		while ((part = output.readLine()) != null) {
			simulationTrace.append(part);
			simulationTrace.append(System.getProperty("line.separator"));
		}
		output.close();

		BufferedWriter fileStream = new BufferedWriter(new PrintWriter(simulationFileName));
		fileStream.write(simulationTrace.toString().replace(",", " "));
		fileStream.close();

		return simulationProcess;
	}

	private String convertToXml(FlatModel model) throws IOException {

		XMLResourceImpl resource = new XMLResourceImpl();
		XMLProcessor processor = new XMLProcessor();

		resource.getDefaultSaveOptions().put(XMLResourceImpl.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		resource.setEncoding("UTF-8");
		resource.getContents().add(model);

		return processor.saveToString(resource, null);
	}

	private void writeFile(String fileName, String property) throws IOException {

		PrintWriter writer = new PrintWriter(fileName);

		writer.write(property);
		writer.close();
	}
}
