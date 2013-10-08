/*
 * generated by Xtext
 */
package roadblock.xtext.ibl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess

import roadblock.emf.ibl.Ibl.impl.IblPackageImpl
import roadblock.emf.ibl.Ibl.IblFactory

import roadblock.xtext.ibl.ibl.Model
import roadblock.xtext.ibl.ibl.FunctionDefinition
import roadblock.xtext.ibl.ibl.RuleDefinition
import java.io.File
import java.io.FileOutputStream

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class IblGenerator implements IGenerator {
	private IblFactory factory
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))

	println("in generator")

	// Create an empty emf model
	IblPackageImpl::init
	factory = IblFactory::eINSTANCE
	val roadblock.emf.ibl.Ibl.Model emfModel = factory.createModel
	
	// set emfmodel attribute
	emfModel.setName("Main model")
	
	
	// go through each functionDefinition
	for(functionDefinition: resource.allContents.toIterable.filter(typeof(FunctionDefinition))){
		switch(functionDefinition.type){
			case 'CELL': {println('Cell definition:') 
						println(functionDefinition.name)}
						
			case 'DEVICE': {println('Device definition:')
						println(functionDefinition.name)}
						
			case 'PROCESS': addProcessDefinition(emfModel,functionDefinition)
			default: println('unknown type')
			
		}
	}
	println("-------")
	for(thing: resource.allContents.toIterable){
		println(thing.toString)
	}
	
	println("---------")

	
}

def addProcessDefinition(roadblock.emf.ibl.Ibl.Model emfModel, FunctionDefinition process){
	print("Adding a process definition: ")
	println(process.name)
	// create new emf process
	val emfProcess = factory.createProcess
	
	// set emf process attributes from xtext model
	emfProcess.setName(process.name)
	
	// add it to emfModel
	emfModel.processList.add(emfProcess)
	}


	
	// populate emf model from xtext mode
	//populateProcesses(resource, emfModel)
	
	// save emf model to a file
//	val file = new File("generatedEMFModel.txt")
//	val fop = new FileOutputStream(file)		
//	if (!file.exists()) file.createNewFile()
//	val content = "Hello"
//	fop.write(content.bytes)
//	fop.flush()
//	fop.close()


	
	
	def populateProcesses(Resource resource, roadblock.emf.ibl.Ibl.Model emfModel)
	{
		for(functionDefinition: resource.allContents.toIterable.filter(typeof(FunctionDefinition)))
		{
			if(functionDefinition.type == "PROCESS") {
				// create new emf process
				val emfProcess = factory.createProcess
				// set emf process attributes from xtext model
				emfProcess.setName(functionDefinition.name)
					print("new process: ")
					println(emfProcess.name)
				
				// set rules
				for(rule: functionDefinition.members.filter(typeof(RuleDefinition))){
					// create new rule
					val emfRule = factory.createRule
					// set emf rule attribute
					emfRule.setName(rule.name)
					
					// add rule to process
					emfProcess.ruleList.add(emfRule)
					print("new rule: ")
					println(emfRule.name)
				}
				// add process to the list
				emfModel.processList.add(emfProcess)	
			}
		}	
		
	}
}
