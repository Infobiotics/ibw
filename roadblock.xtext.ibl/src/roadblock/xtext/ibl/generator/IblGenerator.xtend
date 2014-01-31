/*
 * generated by Xtext
 */
package roadblock.xtext.ibl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import roadblock.dataprocessing.modelbuilder.PropertyBuilder
import roadblock.modelchecking.translation.property.PropertyTranslationManager
import roadblock.modelchecking.translation.property.TranslationTarget
import roadblock.xtext.ibl.ibl.PropertyDefinition

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class IblGenerator implements IGenerator {

	private PropertyBuilder propertyBuilder = new PropertyBuilder();
	private PropertyTranslationManager translationManager = PropertyTranslationManager::instance;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val properties = resource.allContents.filter(typeof(PropertyDefinition)).toList;
		println("Property count: " + properties.size);

		for (PropertyDefinition  p : properties) {
			println(translationManager.Translate(propertyBuilder.build(p), TranslationTarget.PRISM));
		}

	//for(PropertyDefinition p : properties) {
	//		propertyBuilder.doSwitch(p).class.toString;
	//}
	/* 
	
	println("in generator")

//	 save the AST in a file
	emfModelToFile(
		resource.getContents().get(0) as roadblock.xtext.ibl.ibl.Model, 
		"findme/" + resource.URI.lastSegment + "XtextModel"
	)
	


	// Create an empty emf model
	IblPackage::init
	factory = IblFactory::eINSTANCE
	val Model emfModel = factory.createModel
	
	// set emfmodel attribute
	emfModel.setDisplayName("Main model")
	
	// go through each functionD0efinition
	for(functionDefinition: resource.allContents.toIterable.filter(typeof(FunctionDefinition))){
		switch(functionDefinition.type){
			case 'CELL': {println('Cell definition:') 
						println(functionDefinition.name)}
						
			case 'DEVICE': {println('Device definition:')
						println(functionDefinition.name)}
						
//			case 'PROCESS': addProcessDefinition(emfModel,functionDefinition)
			default: println('unknown type')
			
		}

		println("After model populating:")

		//println(showModel(emfModel))
		// parsing properties
		for (propertyDefinition : resource.allContents.toIterable.filter(typeof(PropertyDefinition))) {
			println("New property Definition")

			//for(property: propertyDefinition.property){
			//	println("property:" + property.lhs + " # " + property.operator + " # " + property.rhs.value + " # " + property.rhs.units)
			}

		}
		
	}
	


//def addProcessDefinition(Model emfModel, FunctionDefinition process){
//	println("Adding a process definition: " + process.name)
//	// create new emf process
//	val emfProcess = factory.createProcess
//	
//	// set emf process attributes from xtext model
//	emfProcess.setName(process.name)
//	
//	// add it to emfModel
//	emfModel.processList.add(emfProcess)
//	
//	// rules
//	for(rule: process.members.filter(typeof(RuleDefinition)))
//		emfProcess.ruleList.add(populateRule(rule))
//		
//	// parameters
//	for(parameter: process.parameters){
//		
//		//if(parameter.scope == 'input') emfProcess.inputList.add
//		
//	}
//}
//
//def populateRule(RuleDefinition rule){
//	val emfRule = factory.createRule
//	emfRule.setName(rule.name)
//	
//	// variables on right hand side
//
////	for(complex: rule.rhs.filter(typeof(VariableComplex))){
////		val emfMolecule = factory.createMolecule
////		emfMolecule.setName(complex.components.join('~'))
////		emfRule.rightHandSide.add(emfMolecule)
////		}
//		
//for(ruleObject: rule.rhs.filter(typeof(RuleObject))){
//	val emfMolecule = factory.createMolecularSpecies
//	if(ruleObject.class.toString == "roadblock.xtext.ibl.ibl.VariableComplex"){
//		emfMolecule.setDisplayName((ruleObject as VariableComplex).components.join('~'))
//		
//			
//	emfRule.setIsBidirectional(rule.reversible)
//	emfRule.setForwardRate(1.0)
//	emfRule.setReverseRate(1.0)
//	return emfRule
//  }
// }
//}
//
//// ********************************************************************
//// helpers for printing an emf model.
//// ********************************************************************
//
//def showModelAttributes(int level, Model model){
//	val tab = "\n" + (1..level).map["  "].join('')
//	var s = tab + "Model definition:" + model.displayName	
//	return s		
//}
//
//def showModel(int level, Model model){
//	var s = showModelAttributes(level,model)
//	for(p: model.processList)
//		s = s + showProcessDefinition(level + 1, p)
//	return s	
//}
//
//def showModel(Model model){
//	return showModel(1, model)	
//}
//
//def showProcessDefinitionAttributes(int level, Process process){
//	val tab = "\n" + (1..level).map["  "].join('')
//	var s = tab + "Process definition:" + process.name	
//	return s		
//}
//
//def showProcessDefinition(int level, Process process){
//	var s = showProcessDefinitionAttributes(level,process)
//	for(r: process.ruleList)
//		s = s + showRule(level + 1, r)
//	return s			
//}
//
//
//def showRuleAttributes(int level, Rule rule){
//	val tab = "\n" + (1..level).map["  "].join('')
//	var s = tab + "Rule definition: "  + rule.name
//	s = s + tab + " Right hand side: " + rule.rightHandSide.map[e | e.name].join(', ')
//	s = s + tab + " Left hand side: " + rule.leftHandSide.map[e | e.name].join(', ')
//	
//	return s		
//}
//
//def showRule(int level, Rule rule){
//	return showRuleAttributes(level,rule)
//}	
//
//
//	
//	
def static emfModelToFile(roadblock.xtext.ibl.ibl.Model  model, String filename){

	val reg = Registry::INSTANCE
	val m  = reg.getExtensionToFactoryMap as Map<String, Object>
	m.put("iblXtextModel", new XMIResourceFactoryImpl)
	
	val resSet = new ResourceSetImpl

    // create a resource
	var resource = resSet.createResource(URI::createURI(filename))
	resource.getContents().add(model);
	
		try {
	      resource.save(Collections::EMPTY_MAP);
	    } catch (IOException e) {
		println("emfModelToFile: something wrong when writing to file")
	      e.printStackTrace();
	    }		
}

def static fileToEmfModel(String filename){ // Don't forget to cast the result as the expected EMF object. 
// adapted to extend from http://www.vogella.com/articles/EclipseEMFPersistence/article.html	
    val resSet = new ResourceSetImpl

    // Get the resource
    val resource2 = resSet.getResource(URI::createURI(filename), true)
    // Get the first model element and cast it to the right type, in my
    // example everything is hierarchical included in this first node
    return  resource2.getContents().get(0) //as roadblock.emf.ibl.Ibl.Model
}
*/
	}
}
