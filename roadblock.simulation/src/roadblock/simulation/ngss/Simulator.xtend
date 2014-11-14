package roadblock.simulation.ngss

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStream
import java.io.PrintWriter
import roadblock.bin.BinaryPathProvider

class SimulationThread extends Thread {
	var String xml_model
	var String resultFilename
	public var Process process

	new(String xml_model, String resultFilename, String cmd) {
		this.xml_model = xml_model
		this.resultFilename = resultFilename
		this.process = Runtime.getRuntime().exec(cmd)
	}

	override run() {

		// write emf model to process in
		var input = process.getOutputStream()
		input.write(xml_model.getBytes())
		input.close()

		// write result to file
		var output = new BufferedReader(new InputStreamReader(process.getInputStream()))
		var fileStream = new BufferedWriter(new PrintWriter(resultFilename))
		var String part = null
		while((part = output.readLine()) != null) {
			fileStream.write(part)
			fileStream.newLine()
		}
		output.close()
		fileStream.close()
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

		var ngssPath = BinaryPathProvider.getInstance().getNgssPath();
		val cmd = '''«ngssPath» --emf parser=emf max_time=«this.max_time» max_runtime=«this.max_runtime» simulation_algorithm=«this.simulation_algorithm» data_file=model.csv log_interval=«this.
			log_interval» runs=«this.runs» seed=«this.seed» output=console compress=true parallel=true show_progress=false'''

		// run simulation
		var thread = new SimulationThread(this.model, resultFilename, cmd)
		thread.start()

		var result = thread.process.waitFor()
		if(result != 0) {

			// write error message to console
			var String line
			var error = new BufferedReader(new InputStreamReader(thread.process.getErrorStream()))
			while((line = error.readLine()) != null)
				errorStream.write(line.getBytes())
			error.close()
		}
		thread.join()
	}
}
