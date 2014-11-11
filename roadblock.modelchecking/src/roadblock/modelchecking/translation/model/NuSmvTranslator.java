package roadblock.modelchecking.translation.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.modelchecking.ModelcheckingTarget;

public class NuSmvTranslator implements IModelTranslator {

	private class UpdateRule {
		public int ruleIndex;
		public Map<String, Integer> guardComponents;
		public boolean isProduction;
		public int multiplicity;
	}

	private static STGroup nusmvTemplates = new STGroupFile(NuSmvTranslator.class.getResource("../templates/NuSMV.stg").getFile());
	private static List<String> restrictedMoleculeNames = Arrays.asList(new String[] { "OUTSIDE" });

	private HashMap<String, List<UpdateRule>> updateRulesByMolecule = new HashMap<>();

	private Map<String, String> moleculeNameTranslations = new HashMap<>();
	private Map<String, Integer> moleculeMaxConcentrations = new HashMap<>();

	private int ruleCount = 0;

	private boolean hasPureProductionRules = false;

	private String choiceVariableName = "_choice";

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

		initDataStructures(model);

		boolean hasRules = updateRulesByMolecule.size() != 0;

		ST modelTemplate = nusmvTemplates.getInstanceOf("model");
		modelTemplate.add("name", "NuSMVModel");
		modelTemplate.add("molecules", getTranslatedMolecules(model));
		modelTemplate.add("initialConcentrations", getTranslatedInitialConcentrations(model));

		if (hasRules) {
			modelTemplate.add("invariant", getTranslatedInvariant(model));
			modelTemplate.add("choiceConstraints", getTranslatedChoiceConstraints(model));
			modelTemplate.add("updateRules", getTranslatedUpdateRules(model));
		}

		return modelTemplate.render();
	}

	private List<String> getTranslatedMolecules(FlatModel model) {

		List<String> translatedMolecules = new ArrayList<>();

		ST moleculeTemplate = nusmvTemplates.getInstanceOf("molecule");
		moleculeTemplate.add("name", choiceVariableName);
		moleculeTemplate.add("maxConcentration", ruleCount);

		translatedMolecules.add(moleculeTemplate.render());

		for (MolecularSpecies molecule : model.getMoleculeList()) {

			if (!restrictedMoleculeNames.contains(molecule.getDisplayName())) {

				String moleculeTranslatedName = getTranslatedName(molecule);

				moleculeTemplate = nusmvTemplates.getInstanceOf("molecule");
				moleculeTemplate.add("name", moleculeTranslatedName);
				moleculeTemplate.add("maxConcentration", moleculeMaxConcentrations.get(moleculeTranslatedName));

				translatedMolecules.add(moleculeTemplate.render());
			}
		}

		return translatedMolecules;
	}

	private String getTranslatedInvariant(FlatModel model) {

		ST invariantTemplate = hasPureProductionRules ? nusmvTemplates.getInstanceOf("invariant") : nusmvTemplates.getInstanceOf("guardedInvariant");

		if (!hasPureProductionRules) {

			List<String> guardList = new LinkedList<>();

			for (String molecule : updateRulesByMolecule.keySet()) {
				for (UpdateRule updateRule : updateRulesByMolecule.get(molecule)) {
					if (updateRule.guardComponents.size() > 0) {

						ST guardTemplate = nusmvTemplates.getInstanceOf(updateRule.isProduction ? "productionGuard" : "consumptionGuard");

						if (updateRule.isProduction) {
							guardTemplate.addAggr("producedMolecule.{name, multiplicity, maxConcentration}", molecule, updateRule.multiplicity, moleculeMaxConcentrations.get(molecule));
						}
						for (Entry<String, Integer> consumedMolecule : updateRule.guardComponents.entrySet()) {
							guardTemplate.addAggr("consumedMolecules.{name, multiplicity}", consumedMolecule.getKey(), consumedMolecule.getValue() - 1);
						}

						guardList.add(guardTemplate.render());
					}
				}
			}

			invariantTemplate.add("constraints", guardList);
		}

		return invariantTemplate.render();
	}

	private String getTranslatedChoiceConstraints(FlatModel model) {

		ST choiceConstraintsTemplate = nusmvTemplates.getInstanceOf("choiceConstraints");

		for (String molecule : updateRulesByMolecule.keySet()) {
			for (UpdateRule updateRule : updateRulesByMolecule.get(molecule)) {
				if (updateRule.guardComponents.size() > 0) {

					ST guardTemplate = nusmvTemplates.getInstanceOf(updateRule.isProduction ? "productionGuard" : "consumptionGuard");

					if (updateRule.isProduction) {
						guardTemplate.addAggr("producedMolecule.{name, multiplicity, maxConcentration}", molecule, updateRule.multiplicity, moleculeMaxConcentrations.get(molecule));
					}
					for (Entry<String, Integer> consumedMolecule : updateRule.guardComponents.entrySet()) {
						guardTemplate.addAggr("consumedMolecules.{name, multiplicity}", consumedMolecule.getKey(), consumedMolecule.getValue() - 1);
					}

					choiceConstraintsTemplate.addAggr("constraints.{guard, ruleIndex}", guardTemplate.render(), updateRule.ruleIndex);
				}
			}
		}

		return choiceConstraintsTemplate.render();
	}

	private List<String> getTranslatedInitialConcentrations(FlatModel model) {

		List<String> translatedInitialConcentrations = new ArrayList<>();

		for (MolecularSpecies molecule : model.getMoleculeList()) {

			String moleculeTranslatedName = getTranslatedName(molecule);

			if (!restrictedMoleculeNames.contains(molecule.getDisplayName()) && moleculeMaxConcentrations.get(moleculeTranslatedName) > 0) {

				int initialConcentration = (int) molecule.getAmount();

				ST moleculeTemplate = nusmvTemplates.getInstanceOf("initialConcentration");
				moleculeTemplate.add("name", moleculeTranslatedName);
				moleculeTemplate.add("concentration", initialConcentration);

				translatedInitialConcentrations.add(moleculeTemplate.render());
			}
		}

		return translatedInitialConcentrations;
	}

	private List<String> getTranslatedUpdateRules(FlatModel model) {

		List<String> translatedRules = new ArrayList<>();

		for (String molecule : updateRulesByMolecule.keySet()) {

			ST variableUpdateTemplate = nusmvTemplates.getInstanceOf("variableUpdate");
			ST caseExpressionTemplate = nusmvTemplates.getInstanceOf("caseExpression");

			variableUpdateTemplate.add("name", molecule);

			List<String> branchList = new LinkedList<>();

			for (UpdateRule updateRule : updateRulesByMolecule.get(molecule)) {

				ST caseBranchTemplate = nusmvTemplates.getInstanceOf("caseBranch");
				ST guardTemplate = nusmvTemplates.getInstanceOf(updateRule.isProduction ? "choiceProductionGuard" : "choiceConsumptionGuard");

				guardTemplate.add("ruleIndex", updateRule.ruleIndex);
				if (updateRule.isProduction) {
					guardTemplate.addAggr("producedMolecule.{name, multiplicity, maxConcentration}", molecule, updateRule.multiplicity, moleculeMaxConcentrations.get(molecule));
				}
				for (Entry<String, Integer> consumedMolecule : updateRule.guardComponents.entrySet()) {
					guardTemplate.addAggr("consumedMolecules.{name, multiplicity}", consumedMolecule.getKey(), consumedMolecule.getValue() - 1);
				}

				caseBranchTemplate.add("guard", guardTemplate.render());
				caseBranchTemplate.add(
						"value",
						(updateRule.isProduction ? nusmvTemplates.getInstanceOf("moleculeProduction") : nusmvTemplates.getInstanceOf("moleculeConsumption")).addAggr("molecule.{name, multiplicity}",
								molecule, updateRule.multiplicity).render());

				branchList.add(caseBranchTemplate.render());
			}

			caseExpressionTemplate.add("variable", molecule);
			caseExpressionTemplate.add("branches", branchList);
			variableUpdateTemplate.add("value", caseExpressionTemplate.render());

			translatedRules.add(variableUpdateTemplate.render());
		}

		return translatedRules;
	}

	private String getTranslatedName(MolecularSpecies molecule) {

		String translatedName = null;

		if (moleculeNameTranslations.containsKey(molecule.getDisplayName())) {
			translatedName = moleculeNameTranslations.get(molecule.getDisplayName());
		} else {
			translatedName = doTranslateName(molecule.getDisplayName());
			moleculeNameTranslations.put(molecule.getDisplayName(), translatedName);
		}

		return translatedName;
	}

	private String doTranslateName(String moleculeName) {
		return moleculeName.replace("~", "_");
	}

	private void initDataStructures(FlatModel model) {

		for (Rule rule : model.getRuleList()) {

			Map<String, Integer> consumedMolecules = computeMultiplicities(rule.getLeftHandSide());
			Map<String, Integer> producedMolecules = computeMultiplicities(rule.getRightHandSide());

			adjustMaxConcentration(consumedMolecules);
			adjustMaxConcentration(producedMolecules);

			if (rule.getForwardRate() != null && rule.getForwardRate() > 0) {
				registerUpdateRules(++ruleCount, consumedMolecules, producedMolecules);
			}

			if (rule.isIsBidirectional() && rule.getReverseRate() != null && rule.getReverseRate() > 0) {
				registerUpdateRules(++ruleCount, producedMolecules, consumedMolecules);
			}
		}

		for (MolecularSpecies molecule : model.getMoleculeList()) {
			adjustMaxConcentration(molecule);
		}
	}

	private void registerUpdateRules(int ruleIndex, Map<String, Integer> consumedMolecules, Map<String, Integer> producedMolecules) {

		Map<String, Integer> consumed = new ConcurrentHashMap<>(consumedMolecules);

		if (consumedMolecules.size() == 0) {
			hasPureProductionRules = true;
		}

		// register update rules for the set of consumed molecules
		for (String molecule : consumedMolecules.keySet()) {

			Integer lhsMultiplicity = consumedMolecules.get(molecule);
			Integer rhsMultiplicity = producedMolecules.get(molecule);

			if (rhsMultiplicity == null || lhsMultiplicity > rhsMultiplicity) {

				int multiplicity = rhsMultiplicity != null ? lhsMultiplicity - rhsMultiplicity : lhsMultiplicity;
				consumed.put(molecule, multiplicity);

				List<UpdateRule> updateRules = updateRulesByMolecule.get(molecule);

				if (updateRules == null) {
					updateRulesByMolecule.put(molecule, updateRules = new LinkedList<>());
				}

				UpdateRule updateRule = new UpdateRule();
				updateRule.ruleIndex = ruleIndex;
				updateRule.guardComponents = consumedMolecules;
				updateRule.isProduction = false;
				updateRule.multiplicity = multiplicity;

				updateRules.add(updateRule);
			} else {
				consumed.remove(molecule);
			}
		}

		// register update rules for the set of produced molecules
		for (String molecule : producedMolecules.keySet()) {

			Integer lhsMultiplicity = consumedMolecules.get(molecule);
			Integer rhsMultiplicity = producedMolecules.get(molecule);

			if (lhsMultiplicity == null || rhsMultiplicity > lhsMultiplicity) {

				int multiplicity = lhsMultiplicity != null ? rhsMultiplicity - lhsMultiplicity : rhsMultiplicity;

				List<UpdateRule> updateRules = updateRulesByMolecule.get(molecule);

				if (updateRules == null) {
					updateRulesByMolecule.put(molecule, updateRules = new LinkedList<>());
				}

				UpdateRule updateRule = new UpdateRule();
				updateRule.ruleIndex = ruleIndex;
				updateRule.guardComponents = consumedMolecules;
				updateRule.isProduction = true;
				updateRule.multiplicity = multiplicity;

				updateRules.add(updateRule);
			}
		}
	}

	private Map<String, Integer> computeMultiplicities(List<MolecularSpecies> molecules) {

		Map<String, Integer> moleculeMultiplicities = new HashMap<>();

		for (MolecularSpecies molecule : molecules) {
			if (!restrictedMoleculeNames.contains(molecule.getDisplayName())) {

				String translatedMoleculeName = getTranslatedName(molecule);
				int currentMultiplicity = 0;

				if (moleculeMultiplicities.containsKey(translatedMoleculeName)) {
					currentMultiplicity = moleculeMultiplicities.get(translatedMoleculeName);
				}

				moleculeMultiplicities.put(translatedMoleculeName, currentMultiplicity + 1);
			}
		}

		return moleculeMultiplicities;
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

		int currentConcentration = 0;

		if (moleculeMaxConcentrations.containsKey(moleculeName)) {
			currentConcentration = moleculeMaxConcentrations.get(moleculeName);
		}

		moleculeMaxConcentrations.put(moleculeName, currentConcentration + moleculeAmount);
	}

	@Override
	public ModelcheckingTarget getTarget() {
		return ModelcheckingTarget.NUSMV;
	}
}
