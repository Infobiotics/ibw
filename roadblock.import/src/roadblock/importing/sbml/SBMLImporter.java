package roadblock.importing.sbml;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.sbml.jsbml.KineticLaw;
import org.sbml.jsbml.Reaction;
import org.sbml.jsbml.SBMLDocument;
import org.sbml.jsbml.SBMLReader;
import org.sbml.jsbml.Species;

import roadblock.importing.IModelImporter;
import roadblock.importing.ImportType;
import roadblock.importing.ibl.IBLTranslator;

public class SBMLImporter implements IModelImporter {

	private IBLTranslator iblTranslator = IBLTranslator.getInstance();

	@Override
	public String translate(String sbmlFilename) throws Exception {
		File file = new File(sbmlFilename);

		SBMLReader sbmlReader = new SBMLReader();
		SBMLDocument sbmlDocument = sbmlReader.readSBML(file);

		String modelName = sbmlDocument.getModel().getId();
		List<Species> speciesList = sbmlDocument.getModel().getListOfSpecies();
		List<Reaction> reactionList = sbmlDocument.getModel().getListOfReactions();

		List<String> speciesTranslations = speciesList.stream()
				.map(s -> iblTranslator.translateMolecule(s.getId(), Double.toString(s.getInitialAmount())))
				.collect(Collectors.toList());

		List<String> reactionTranslations = reactionList.stream().map(r -> translate(r)).collect(Collectors.toList());

		String modelTranslation = iblTranslator.translateModel(modelName, speciesTranslations, reactionTranslations);

		return modelTranslation;
	}

	private String translate(Reaction reaction) {
		String reactionName = reaction.getId();

		List<String> reactantTranslations = reaction.getListOfReactants().stream()
				.flatMap(r -> Collections.nCopies((int) r.getCalculatedStoichiometry(), r.getSpecies()).stream())
				.collect(Collectors.toList());

		List<String> productTranslations = reaction.getListOfProducts().stream()
				.flatMap(p -> Collections.nCopies((int) p.getCalculatedStoichiometry(), p.getSpecies()).stream())
				.collect(Collectors.toList());

		String rate = translate(reaction.getKineticLaw());

		String reactionTranslation = null;

		if (reaction.isReversible()) {
			reactionTranslation = iblTranslator.translateReversibleRule(reactionName, reactantTranslations,
					productTranslations, rate, rate);
		} else {
			reactionTranslation = iblTranslator.translateRule(reactionName, reactantTranslations, productTranslations,
					rate);
		}

		return reactionTranslation;
	}

	private String translate(KineticLaw kineticLaw) {
		@SuppressWarnings("deprecation")
		//String formula = kineticLaw.getFormula();kineticLaw.getMath().
		String formula = getRate(kineticLaw);
		String rateTranslation = null;

		try {
			Double.parseDouble(formula);
			rateTranslation = iblTranslator.translateNumericRate(formula);
		} catch (Exception ex) {
			rateTranslation = iblTranslator.translateExpressionRate(formula);
		}

		return rateTranslation;
	}
	
	private String getRate(KineticLaw kineticLaw) {
		if(kineticLaw.getMath() != null) {
			return kineticLaw.getMath().compile(IBLExpressionCompiler.getInstance()).toString();
		}
		else {
			return kineticLaw.getFormula();
		}
	}

	@Override
	public ImportType getTarget() {
		return ImportType.SBML;
	}

}
