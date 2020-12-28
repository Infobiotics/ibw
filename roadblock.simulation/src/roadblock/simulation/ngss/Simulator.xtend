package roadblock.simulation.ngss

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStream
import roadblock.bin.BinaryPathProvider
import java.io.File
import org.apache.commons.io.FileUtils;

class SimulationThread extends Thread {
	var String xml_model
	var String workspacePath
	public var Process process

	new(String xml_model, String workspacePath, String[] cmd) {
		this.xml_model = xml_model
		this.workspacePath = workspacePath
		//this.process = Runtime.getRuntime().exec(cmd)
		val pb = new ProcessBuilder(cmd);
		pb.directory(new File(this.workspacePath));
		this.process = pb.start();
	}

	override run() {
		// write emf model to process in
		var input = process.getOutputStream()
		input.write(xml_model.getBytes())
		input.close()
	}
}

class Simulator {

	/* variables to alter the behavior of the simulator */
	public var simulation_algorithm = 'nrm'
	public var max_time = 100.0
	public var max_runtime = 0.0
	public var log_interval = 1.0
	public var runs = 1
	public var seed = 0

	var String model

	new(String model) {
		this.model = model
	}

	def runSimulation(String workspacePath, String resultFilename, OutputStream errorStream) {

		val ngssPath = BinaryPathProvider.getInstance().getNgssPath()
		//Platform.getLocation().toOSString + "/.tmp/simulation";
		var resFilename = workspacePath + File.separator + ".output.csv"

		val String[] simulationCommand = #[ngssPath, workspacePath, this.max_time.toString, this.max_runtime.toString,
			this.simulation_algorithm, resFilename, this.log_interval.toString, this.runs.toString,
			this.seed.toString];
			
			FileUtils.forceMkdir(new File(workspacePath));
			FileUtils.cleanDirectory(new File(workspacePath));

			// run simulation
			var thread = new SimulationThread(this.model, workspacePath, simulationCommand)
			thread.start()

			var result = thread.process.waitFor()
			if (result != 0) {
				// write error message to console
				var String line
				var error = new BufferedReader(new InputStreamReader(thread.process.getErrorStream()))
				while ((line = error.readLine()) !== null)
					errorStream.write(line.getBytes())
				error.close()
			} else {
				errorStream.write("Simulation completed.\n".getBytes())
			}
			thread.join()
		}
	}
