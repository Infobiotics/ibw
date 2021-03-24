package roadblock.importing.ibl;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class IBLTranslator {
	
	private static IBLTranslator instance = null;
	private static STGroup iblTemplate;
	
	static {
		try {
			iblTemplate = new STGroupFile(FileLocator.resolve(IBLTranslator.class.getResource("templates/IBL.stg")).getFile());
		} catch (IOException e) {
			e.printStackTrace();
		};
	}

	public static IBLTranslator getInstance() {

		if (instance == null) {
			instance = new IBLTranslator();
		}

		return instance;
	}
	
	public String translateModel(String name, List<String> species, List<String> rules) {
		ST modelTemplate = iblTemplate.getInstanceOf("model");
		modelTemplate.add("name", name);
		modelTemplate.add("molecules", species);
		modelTemplate.add("rules", rules);

		return modelTemplate.render();
	}
	
	public String translateMolecule(String name, String initConcentration) {
		ST moleculeTemplate = iblTemplate.getInstanceOf("molecule");
		moleculeTemplate.add("name", name);
		moleculeTemplate.add("initConcentration", initConcentration);

		return moleculeTemplate.render();
	}
	
	public String translateRule(String name, List<String> reactants, List<String> products, String rate) {
		ST ruleTemplate = iblTemplate.getInstanceOf("rule");
		ruleTemplate.add("name", name);
		ruleTemplate.add("reactants", reactants);
		ruleTemplate.add("products", products);
		ruleTemplate.add("rate", rate);

		return ruleTemplate.render();
	}
	
	public String translateReversibleRule(String name, List<String> reactants, List<String> products, String forwardRate, String backwardRate) {
		ST ruleTemplate = iblTemplate.getInstanceOf("reversibleRule");
		ruleTemplate.add("name", name);
		ruleTemplate.add("reactants", reactants);
		ruleTemplate.add("products", products);
		ruleTemplate.add("forwardRate", forwardRate);
		ruleTemplate.add("backwardRate", backwardRate);

		return ruleTemplate.render();
	}
	
	public String translateNumericRate(String rate) {
		ST rateTemplate = iblTemplate.getInstanceOf("numericRate");
		rateTemplate.add("rate", rate);

		return rateTemplate.render();
	}
	
	public String translateExpressionRate(String rate) {
		ST rateTemplate = iblTemplate.getInstanceOf("expressionRate");
		rateTemplate.add("rate", rate);

		return rateTemplate.render();
	}
	
	private IBLTranslator() { }
}
