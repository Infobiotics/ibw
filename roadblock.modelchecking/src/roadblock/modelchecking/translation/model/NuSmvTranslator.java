package roadblock.modelchecking.translation.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
		public List<MolecularSpecies> guardComponents;
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

		ST modelTemplate = nusmvTemplates.getInstanceOf("model");
		modelTemplate.add("name", "NuSMVModel");
		modelTemplate.add("molecules", getTranslatedMolecules(model));
		modelTemplate.add("invariant", getTranslatedInvariant(model));
		modelTemplate.add("initialConcentrations", getTranslatedInitialConcentrations(model));
		modelTemplate.add("choiceConstraints", getTranslatedChoiceConstraints(model));
		modelTemplate.add("updateRules", getTranslatedUpdateRules(model));

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

						ST guardTemplate = nusmvTemplates.getInstanceOf("guard");

						for (MolecularSpecies consumedMolecule : updateRule.guardComponents) {
							guardTemplate.addAggr("molecules.{name, multiplicity}", getTranslatedName(consumedMolecule),
									(int) consumedMolecule.getAmount());
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

					ST guardTemplate = nusmvTemplates.getInstanceOf("guard");

					for (MolecularSpecies consumedMolecule : updateRule.guardComponents) {
						guardTemplate.addAggr("molecules.{name, multiplicity}", getTranslatedName(consumedMolecule),
								(int) consumedMolecule.getAmount());
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

			if (!restrictedMoleculeNames.contains(molecule.getDisplayName())) {

				String moleculeTranslatedName = getTranslatedName(molecule);
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

			String translatedMolecule = getTranslatedName(molecule);

			ST variableUpdateTemplate = nusmvTemplates.getInstanceOf("variableUpdate");
			ST caseExpressionTemplate = nusmvTemplates.getInstanceOf("caseExpression");

			variableUpdateTemplate.add("name", translatedMolecule);

			List<String> branchList = new LinkedList<>();

			for (UpdateRule updateRule : updateRulesByMolecule.get(molecule)) {

				ST caseBranchTemplate = nusmvTemplates.getInstanceOf("caseBranch");
				ST guardTemplate = nusmvTemplates.getInstanceOf("choiceGuard");

				guardTemplate.add("ruleIndex", updateRule.ruleIndex);
				for (MolecularSpecies consumedMolecule : updateRule.guardComponents) {
					guardTemplate.addAggr("molecules.{name, multiplicity}", getTranslatedName(consumedMolecule), (int) consumedMolecule.getAmount());
				}

				caseBranchTemplate.add("guard", guardTemplate.render());
				caseBranchTemplate.add(
						"value",
						(updateRule.isProduction ? nusmvTemplates.getInstanceOf("moleculeProduction") : nusmvTemplates
								.getInstanceOf("moleculeConsumption")).addAggr("molecule.{name, multiplicity}", translatedMolecule,
								updateRule.multiplicity).render());

				branchList.add(caseBranchTemplate.render());
			}

			caseExpressionTemplate.add("variable", translatedMolecule);
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

	private String getTranslatedName(String moleculeName) {

		String translatedName = null;

		if (moleculeNameTranslations.containsKey(moleculeName)) {
			translatedName = moleculeNameTranslations.get(moleculeName);
		} else {
			translatedName = doTranslateName(moleculeName);
			moleculeNameTranslations.put(moleculeName, translatedName);
		}

		return translatedName;
	}

	private String doTranslateName(String moleculeName) {
		return moleculeName.replace("~", "_");
	}

	private void initDataStructures(FlatModel model) {

		for (MolecularSpecies molecule : model.getMoleculeList()) {
			adjustMaxConcentration(molecule);
		}

		for (Rule rule : model.getRuleList()) {

			Map<String, Integer> consumedMolecules = computeMultiplicities(rule.getLeftHandSide());
			Map<String, Integer> producedMolecules = computeMultiplicities(rule.getRightHandSide());

			adjustMaxConcentration(consumedMolecules);
			adjustMaxConcentration(producedMolecules);

			registerUpdateRules(++ruleCount, rule.getLeftHandSide(), rule.getRightHandSide(), consumedMolecules, producedMolecules);

			if (rule.isIsBidirectional()) {
				registerUpdateRules(++ruleCount, rule.getRightHandSide(), rule.getLeftHandSide(), producedMolecules, consumedMolecules);
			}
		}
	}

	private void registerUpdateRules(int ruleIndex, List<MolecularSpecies> lhsMolecules, List<MolecularSpecies> rhsMolecules,
			Map<String, Integer> consumedMolecules, Map<String, Integer> producedMolecules) {

		if (lhsMolecules.size() == 0) {
			hasPureProductionRules = true;
		}

		// register update rules for the set of consumed molecules
		for (MolecularSpecies molecule : lhsMolecules) {

			String translatedMoleculeName = getTranslatedName(molecule);
			Integer correspondingRhsMultiplicity = producedMolecules.get(translatedMoleculeName);

			if (correspondingRhsMultiplicity == null || molecule.getAmount() > correspondingRhsMultiplicity) {

				List<UpdateRule> updateRules = updateRulesByMolecule.get(molecule.getDisplayName());

				if (updateRules == null) {
					updateRulesByMolecule.put(molecule.getDisplayName(), updateRules = new LinkedList<>());
				}

				UpdateRule updateRule = new UpdateRule();
				updateRule.ruleIndex = ruleIndex;
				updateRule.guardComponents = lhsMolecules;
				updateRule.isProduction = false;
				updateRule.multiplicity = correspondingRhsMultiplicity != null ? consumedMolecules.get(translatedMoleculeName)
						- correspondingRhsMultiplicity : consumedMolecules.get(translatedMoleculeName);

				updateRules.add(updateRule);
			}
		}

		// register update rules for the set of produced molecules
		for (MolecularSpecies molecule : rhsMolecules) {

			String translatedMoleculeName = getTranslatedName(molecule);
			Integer correspondingLhsMultiplicity = consumedMolecules.get(translatedMoleculeName);

			if (correspondingLhsMultiplicity == null || molecule.getAmount() > correspondingLhsMultiplicity) {

				List<UpdateRule> updateRules = updateRulesByMolecule.get(molecule.getDisplayName());

				if (updateRules == null) {
					updateRulesByMolecule.put(molecule.getDisplayName(), updateRules = new LinkedList<>());
				}

				UpdateRule updateRule = new UpdateRule();
				updateRule.ruleIndex = ruleIndex;
				updateRule.guardComponents = lhsMolecules;
				updateRule.isProduction = true;
				updateRule.multiplicity = correspondingLhsMultiplicity != null ? producedMolecules.get(translatedMoleculeName)
						- correspondingLhsMultiplicity : producedMolecules.get(translatedMoleculeName);

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

				moleculeMultiplicities.put(translatedMoleculeName, currentMultiplicity + (int)molecule.getAmount());
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
		return ModelcheckingTarget.NUSMV;
	}
}
