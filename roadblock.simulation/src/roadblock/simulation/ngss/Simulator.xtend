package roadblock.simulation.ngss

class Simulator {
	var model_file = 'EMFModel.xml'
	var parser = 'ngss'
	var simulation_algorithm = 'nrm'
	var max_time = 1200.0
	var max_runtime = 0.0
	var log_interval = 1.0
	var runs = 100
	var seed = 0
	var output = 'csv'
	var data_file = 'model.h5'
	var parallel = 'false'
	var compress = 'true'
	var show_progress = 'false'
	
	new() {
		super()
		/* XXX create param file */
		this.createParamsFile('XXX.params')
	}

	def createParamsFile(String filename)
	{
		val params = '''
			<?xml version="1.0" encoding="utf-8" ?>

			<parameters xmlns="http://www.cpib.ac.uk/~jpt"
				xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
				xsi:schemaLocation="http://www.cpib.ac.uk/~jpt parameter.xsd">

			<!-- parameter definitions -->
			<parameterSet name="SimulationParameters">
				<parameter name="parser" value="«this.parser»"/>
				<parameter name="model_file" value="«this.model_file»"/>
				<parameter name="max_time" value="«this.max_time»"/>
				<parameter name="max_runtime" value="«this.max_runtime»"/>
				<parameter name="simulation_algorithm" value="«this.simulation_algorithm»"/>
				<parameter name="data_file" value="«this.data_file»"/>	
				<parameter name="log_interval" value="«this.log_interval»"/>
				<parameter name="runs" value="«this.runs»"/>
				<parameter name="seed" value="«this.seed»"/>
				<parameter name="output" value="«this.output»"/>
				<parameter name="compress" value="«this.compress»"/>
				<parameter name="parallel" value="«this.parallel»"/>
				<parameter name="show_progress" value="«this.show_progress»"/>
			</parameterSet>
	
			</parameters>
		'''

		println(params) // XXX save to FS
	}
	def runSimulation() {
		/* XXX call ngss with params file */
	}
}