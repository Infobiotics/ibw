package roadblock.modelchecking.runtime.mc2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
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
	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename)
			throws IOException {

		FlatModelManager flatModelManager = new FlatModelManager(model);

		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);

		writeFile(filename + ".queries", propetyTranslation);
	}

	@Override
	public Process verify(Model model, IProperty property, ModelcheckingTarget target, Mc2Configuration config)
			throws IOException, InterruptedException {

		FlatModelManager flatModelManager = new FlatModelManager(model);
		FlatModelPropertyPair flatData = flatModelManager.getFlatData(property);
		FlatModel flatModel = flatData.getFlatModel();
		String xmlFlatModel = convertToXml(flatModel);
		String propetyTranslation = translationManager.translate(flatData.getProperty(), target);

		String ngssPath = BinaryPathProvider.getInstance().getNgssPath();
		String mc2Directory = String.format("%s%s%s%s%s%s%s", File.separator, ".tmp", File.separator, "verification",
				File.separator, "mc2", File.separator);
		String workspacePath = Platform.getLocation().toString() + mc2Directory;
		String mc2Path = BinaryPathProvider.getInstance().getMc2Path();

		String simulationFileName = workspacePath + config.modelFileName + ".csv";
		String propertiesFileName = workspacePath + config.modelFileName + ".queries";

		String[] simulationCommand = new String[] { ngssPath, workspacePath, Double.toString(config.maxTime), "0.0",
				config.simulationAlgorithm, simulationFileName, Double.toString(config.logInterval),
				Long.toString(config.runs), "0" };
		String[] verificationCommand = new String[] { "java", "-jar", mc2Path, "stoch", simulationFileName,
				propertiesFileName, "-time" };

		runSimulation(simulationCommand, xmlFlatModel, workspacePath, simulationFileName);

		writeFile(propertiesFileName, propetyTranslation);

		Process verificationProcess = Runtime.getRuntime().exec(verificationCommand);

		return verificationProcess;
	}

	private Process runSimulation(String[] command, String xmlFlatModel, String workspacePath,
			String simulationFileName) throws IOException, InterruptedException {

		Process simulationProcess = Runtime.getRuntime().exec(command);

		// pass the input model
		OutputStream input = simulationProcess.getOutputStream();
		input.write(xmlFlatModel.getBytes());
		input.close();

		// wait for simulation to end
		simulationProcess.waitFor();

		// combine the results of the different simulation runs
		File simulationDirectory = new File(workspacePath + "/-rundata");
		File[] simulationRunFiles = simulationDirectory.listFiles();

		if (simulationRunFiles.length > 0) {
			File run0File = simulationRunFiles[0];

			Writer writer = new PrintWriter(simulationFileName);
			CSVWriter csvWriter = new CSVWriter(writer, ' ', CSVWriter.NO_QUOTE_CHARACTER);

			CSVReader csvReader = new CSVReader(new FileReader(run0File), ',');

			String[] entries = null;
			while ((entries = csvReader.readNext()) != null) {
				ArrayList<String> list = new ArrayList<String>();
				list.add("0");
				list.addAll(Arrays.asList(entries));
				csvWriter.writeNext(list.toArray(new String[] {}));
			}
			csvReader.close();

			for (int i = 1; i < simulationRunFiles.length; i++) {
				File runFile = simulationRunFiles[i];
				csvReader = new CSVReader(new FileReader(runFile), ',', CSVWriter.NO_QUOTE_CHARACTER, 1);
				while ((entries = csvReader.readNext()) != null) {
					ArrayList<String> list = new ArrayList<String>();
					list.add("0");
					list.addAll(Arrays.asList(entries));
					csvWriter.writeNext(list.toArray(new String[] {}));
				}
				csvReader.close();
			}

			csvWriter.close();
			writer.close();
		}

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
