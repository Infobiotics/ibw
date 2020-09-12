package roadblock.simulation.ngss

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStream
import roadblock.bin.BinaryPathProvider
import org.eclipse.core.runtime.Platform

class SimulationThread extends Thread {
	var String xml_model
	public var Process process

	new(String xml_model, String[] cmd) {
		this.xml_model = xml_model
		this.process = Runtime.getRuntime().exec(cmd)
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

	def runSimulation(String resultFilename, OutputStream errorStream) {

		val ngssPath = BinaryPathProvider.getInstance().getNgssPath()
		val workspacePath = Platform.getLocation().toOSString + "/.tmp/simulation";

		val String[] simulationCommand = #[ngssPath, workspacePath, this.max_time.toString, this.max_runtime.toString,
			this.simulation_algorithm, resultFilename, this.log_interval.toString, this.runs.toString,
			this.seed.toString];

			// run simulation
			var thread = new SimulationThread(this.model, simulationCommand)
			thread.start()

			var result = thread.process.waitFor()
			if (result != 0) {
				// write error message to console
				var String line
				var error = new BufferedReader(new InputStreamReader(thread.process.getErrorStream()))
				while ((line = error.readLine()) != null)
					errorStream.write(line.getBytes())
				error.close()
			} else {
				errorStream.write("Simulation completed.\n".getBytes())
			}
			thread.join()
		}
	}
