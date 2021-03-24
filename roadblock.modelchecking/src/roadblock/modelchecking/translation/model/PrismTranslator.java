package roadblock.modelchecking.translation.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.core.runtime.FileLocator;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.modelchecking.ModelcheckingTarget;

public class PrismTranslator implements IModelTranslator {

	private static STGroup prismTemplates;
	private static List<String> restrictedMoleculeNames = Arrays.asList(new String[] { "OUTSIDE" });

	private Map<String, String> moleculeNameTranslations = new HashMap<>();
	private Map<String, Integer> moleculeMaxConcentrations = new HashMap<>();

	static {
		try {
			prismTemplates = new STGroupFile(FileLocator.resolve(PrismTranslator.class.getResource("templates/PRISM.stg")).getFile());
		} catch (IOException e) {
			e.printStackTrace();
		};
	}
	
	@Override
	public String translate(FlatModel model) {

		String modelTranslation = getTranslatedModel(model, null);

		return modelTranslation;
	}

	@Override
	public String translate(FlatModel model, IProperty property) {

		String modelTranslation = getTranslatedModel(model, property);

		return modelTranslation;
	}

	private String getTranslatedModel(FlatModel model, IProperty property) {

		ST modelTemplate = prismTemplates.getInstanceOf("model");
		modelTemplate.add("name", "PRISMModel");
		modelTemplate.add("rules", getTranslatedRules(model));
		modelTemplate.add("molecules", getTranslatedMolecules(model));
		modelTemplate.add("rewards",
				property != null && property instanceof RewardProperty ? getTranslatedReward((RewardProperty) property)
						: "// n/a");

		return modelTemplate.render();
	}

	private List<String> getTranslatedMolecules(FlatModel model) {

		List<String> translatedMolecules = new ArrayList<>();

		for (MolecularSpecies molecule : model.getMoleculeList()) {

			if (!restrictedMoleculeNames.contains(molecule.getDisplayName())) {

				adjustMaxConcentration(molecule);

				String moleculeTranslatedName = getTranslatedName(molecule);
				int initialConcentration = (int) molecule.getAmount();

				ST moleculeTemplate = prismTemplates.getInstanceOf("molecule");
				moleculeTemplate.add("name", moleculeTranslatedName);
				moleculeTemplate.add("maxConcentration", moleculeMaxConcentrations.get(moleculeTranslatedName));
				moleculeTemplate.add("initConcentration", initialConcentration);

				translatedMolecules.add(moleculeTemplate.render());
			}
		}

		return translatedMolecules;
	}

	private List<String> getTranslatedRules(FlatModel model) {

		List<String> translatedRules = new ArrayList<>();

		for (Rule rule : model.getRuleList()) {

			Map<String, Integer> consumedMolecules = new HashMap<>();
			Map<String, Integer> producedMolecules = new HashMap<>();

			// compute the list of consumed molecules and their multiplicity
			for (MolecularSpecies molecule : rule.getLeftHandSide()) {
				if (!restrictedMoleculeNames.contains(molecule.getDisplayName())) {

					String translatedMoleculeName = getTranslatedName(molecule);
					int currentMultiplicity = 0;

					if (consumedMolecules.containsKey(translatedMoleculeName)) {
						currentMultiplicity = consumedMolecules.get(translatedMoleculeName);
					}

					consumedMolecules.put(translatedMoleculeName, currentMultiplicity + 1);
				}
			}

			// compute the list of produced molecules and their multiplicity
			for (MolecularSpecies molecule : rule.getRightHandSide()) {
				if (!restrictedMoleculeNames.contains(molecule.getDisplayName())) {

					String translatedMoleculeName = getTranslatedName(molecule);
					int currentMultiplicity = 0;

					if (producedMolecules.containsKey(translatedMoleculeName)) {
						currentMultiplicity = producedMolecules.get(translatedMoleculeName);
					}

					producedMolecules.put(translatedMoleculeName, currentMultiplicity + 1);
				}
			}

			// consider molecule multiplicity in computing the molecule max
			// concentration
			adjustMaxConcentration(consumedMolecules);
			adjustMaxConcentration(producedMolecules);

			// translating the forward version of the rule,
			// if the forward rate is specified and greater than zero
			if (rule.getForwardRate() != null && rule.getForwardRate() > 0) {

				ST ruleTemplate = prismTemplates.getInstanceOf("rule");
				ruleTemplate.add("guard", getTranslatedRuleGuard(consumedMolecules));
				ruleTemplate.add("rate", getTranslatedPropensity(new TreeMap<String, Integer>(consumedMolecules),
						rule.getForwardRate()));
				ruleTemplate.add("updates", getTranslatedRuleUpdates(consumedMolecules, producedMolecules));

				translatedRules.add(ruleTemplate.render());
			}

			// translating the reversed version, in case of bidirectional rules,
			// if the reverse rate is specified and greater than zero
			if (rule.isIsBidirectional() && rule.getReverseRate() != null && rule.getReverseRate() > 0) {

				ST ruleTemplate = prismTemplates.getInstanceOf("rule");
				ruleTemplate.add("guard", getTranslatedRuleGuard(producedMolecules));
				ruleTemplate.add("rate", getTranslatedPropensity(new TreeMap<String, Integer>(producedMolecules),
						rule.getForwardRate()));
				ruleTemplate.add("updates", getTranslatedRuleUpdates(producedMolecules, consumedMolecules));

				translatedRules.add(ruleTemplate.render());
			}
		}

		return translatedRules;
	}

	private String getTranslatedRuleGuard(Map<String, Integer> consumedMolecules) {

		String ruleGuardTranslation = "true";

		if (consumedMolecules.size() > 0) {

			ST ruleGuardTemplate = prismTemplates.getInstanceOf("ruleGuard");

			for (Entry<String, Integer> molecule : consumedMolecules.entrySet()) {
				ruleGuardTemplate.addAggr("molecules.{name, multiplicity}", molecule.getKey(), molecule.getValue() - 1);
			}

			ruleGuardTranslation = ruleGuardTemplate.render();
		}

		return ruleGuardTranslation;
	}

	private String getTranslatedRuleUpdates(Map<String, Integer> consumedMolecules,
			Map<String, Integer> producedMolecules) {

		String ruleUpdatesTranslation = "";

		Map<String, Integer> consumed = new ConcurrentHashMap<>(consumedMolecules);
		Map<String, Integer> produced = new ConcurrentHashMap<>(producedMolecules);

		// eliminate superfluous molecules
		for (String moleculeName : consumed.keySet()) {

			if (produced.containsKey(moleculeName)) {

				int consumedMultiplicity = consumed.get(moleculeName);
				int producedMultiplicity = produced.get(moleculeName);

				// eliminate superfluous left hand side molecules
				if (consumedMultiplicity - producedMultiplicity > 0) {
					consumed.put(moleculeName, consumedMultiplicity - producedMultiplicity);
				} else {
					consumed.remove(moleculeName);
				}

				// eliminate superfluous right hand side molecules
				if (producedMultiplicity - consumedMultiplicity > 0) {
					produced.put(moleculeName, producedMultiplicity - consumedMultiplicity);
				} else {
					produced.remove(moleculeName);
				}
			}
		}

		// translate molecule consumption
		if (consumed.size() > 0) {

			ST ruleMoleculeConsumptionTemplate = prismTemplates.getInstanceOf("ruleMoleculeConsumption");

			for (Entry<String, Integer> molecule : consumed.entrySet()) {
				ruleMoleculeConsumptionTemplate.addAggr("molecules.{name, multiplicity}", molecule.getKey(),
						molecule.getValue());
			}

			ruleUpdatesTranslation += ruleMoleculeConsumptionTemplate.render();
		}

		// translate molecule production
		if (produced.size() > 0) {

			ST ruleMoleculeProductionTemplate = prismTemplates.getInstanceOf("ruleMoleculeProduction");

			for (Entry<String, Integer> molecule : produced.entrySet()) {
				ruleMoleculeProductionTemplate.addAggr("molecules.{name, multiplicity}", molecule.getKey(),
						molecule.getValue());
			}

			if (!ruleUpdatesTranslation.equals("")) {
				ruleUpdatesTranslation += " & ";
			}

			ruleUpdatesTranslation += ruleMoleculeProductionTemplate.render();
		}

		return ruleUpdatesTranslation;
	}

	private String getTranslatedReward(RewardProperty property) {

		ST rewardTemplate = prismTemplates.getInstanceOf("reward");
		// the molecule name is already translated
		rewardTemplate.add("molecule", property.getVariable().getName());

		return rewardTemplate.render();
	}

	private String getTranslatedPropensity(TreeMap<String, Integer> consumedMolecules, double rate) {

		ST propensityTemplate = prismTemplates.getInstanceOf("propensity");

		// if first-order reaction
		if (consumedMolecules.size() == 1) {
			Map.Entry<String, Integer> moleculeX = consumedMolecules.entrySet().iterator().next();

			switch (moleculeX.getValue()) {
			case 1:
				propensityTemplate = prismTemplates.getInstanceOf("xPropensity");
				break;
			case 2:
				propensityTemplate = prismTemplates.getInstanceOf("xxPropensity");
				break;
			case 3:
				propensityTemplate = prismTemplates.getInstanceOf("xxxPropensity");
				break;
			}

			propensityTemplate.add("moleculeX", moleculeX.getKey());
		}
		// if second-order reaction
		else if (consumedMolecules.size() == 2) {
			Map.Entry<String, Integer> moleculeY = consumedMolecules.entrySet().iterator().next();
			Map.Entry<String, Integer> moleculeX = consumedMolecules.entrySet().iterator().next();

			if (moleculeX.getValue() == 1) {
				propensityTemplate = prismTemplates.getInstanceOf("xyPropensity");
			} else {
				propensityTemplate = prismTemplates.getInstanceOf("xxyPropensity");
			}

			propensityTemplate.add("moleculeX", moleculeX.getKey());
			propensityTemplate.add("moleculeY", moleculeY.getKey());

		}
		// if third-order reaction
		else if (consumedMolecules.size() == 3) {
			Map.Entry<String, Integer> moleculeX = consumedMolecules.entrySet().iterator().next();
			Map.Entry<String, Integer> moleculeY = consumedMolecules.entrySet().iterator().next();
			Map.Entry<String, Integer> moleculeZ = consumedMolecules.entrySet().iterator().next();

			propensityTemplate = prismTemplates.getInstanceOf("xxyPropensity");
			propensityTemplate.add("moleculeX", moleculeX.getKey());
			propensityTemplate.add("moleculeY", moleculeY.getKey());
			propensityTemplate.add("moleculeZ", moleculeZ.getKey());
		}

		propensityTemplate.add("rate", rate);

		return propensityTemplate.render();
	}

	private String getTranslatedName(MolecularSpecies molecule) {

		String translatedName = null;

		if (moleculeNameTranslations.containsKey(molecule.getDisplayName())) {
			translatedName = moleculeNameTranslations.get(molecule.getDisplayName());
		} else {
			translatedName = doTranslateName(molecule);
			moleculeNameTranslations.put(molecule.getDisplayName(), translatedName);
		}

		return translatedName;
	}

	private String doTranslateName(MolecularSpecies molecule) {
		return molecule.getDisplayName().replace("~", "_");
	}

	private void adjustMaxConcentration(Map<String, Integer> molecules) {

		for (Entry<String, Integer> molecule : molecules.entrySet()) {

			int maxConcentration = 1;

			if (moleculeMaxConcentrations.containsKey(molecule.getKey())) {
				maxConcentration = moleculeMaxConcentrations.get(molecule.getKey());
			}

			if (molecule.getValue() > maxConcentration) {
				maxConcentration = molecule.getValue();
			}

			moleculeMaxConcentrations.put(molecule.getKey(), maxConcentration);
		}

	}

	private void adjustMaxConcentration(MolecularSpecies molecule) {

		String moleculeName = getTranslatedName(molecule);
		int moleculeAmount = (int) molecule.getAmount();

		int maxConcentration = 1;

		if (moleculeMaxConcentrations.containsKey(moleculeName)) {
			maxConcentration = moleculeMaxConcentrations.get(moleculeName);
		}

		if (moleculeAmount > maxConcentration) {
			maxConcentration = moleculeAmount;
		}

		moleculeMaxConcentrations.put(moleculeName, maxConcentration);
	}

	@Override
	public ModelcheckingTarget getTarget() {
		return ModelcheckingTarget.PRISM;
	}
}
