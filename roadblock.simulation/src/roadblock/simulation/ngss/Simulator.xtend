package roadblock.simulation.ngss

import java.lang.Runtime
import java.io.BufferedReader
import java.io.InputStreamReader

class Simulator {
	
	/* variables to alter the behavior of the simulator */
	public var simulation_algorithm = 'nrm' // XXX enum instead of string?
	public var max_time = 100.0
	public var max_runtime = 0.0
	public var log_interval = 1.0
	public var runs = 1
	public var seed = 0

	var String model
	val ngss_exe = "/home/dvs/code/ngss/ngss"

	new (String model)
	{
		this.model = model
	}

	def runSimulation() {
		val cmd = '''«this.ngss_exe» --emf parser=emf max_time=«this.max_time» max_runtime=«this.max_runtime» simulation_algorithm=«this.simulation_algorithm» data_file=model.csv log_interval=«this.log_interval» runs=«this.runs» seed=«this.seed» output=console compress=true parallel=true show_progress=false'''
		println(cmd)
		var process = Runtime.getRuntime().exec(cmd)
		var thread = new Thread() {
			// write emf model to process in
			var input = process.getOutputStream()
			input.write(this.model.getBytes())
			input.close()
			
			// write process output to console
			var String line
			var output = new BufferedReader(new InputStreamReader(process.getInputStream()))
			while ((line=output.readLine()) != null) println(line)
			output.close()
		}
		thread.start()
		var result = process.waitFor()
		if (result!=0)
		{
			// write error message to console
			var String line
			var error = new BufferedReader(new InputStreamReader(process.getErrorStream()))
			while ((line=error.readLine()) != null) println(line)
			error.close()
		}
		thread.join()
		println("done")
	}
}