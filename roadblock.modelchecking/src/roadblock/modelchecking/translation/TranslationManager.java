package roadblock.modelchecking.translation;

import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.modelchecking.translation.model.IModelTranslator;
import roadblock.modelchecking.translation.model.PrismModelTranslator;
import roadblock.modelchecking.translation.property.IPropertyTranslator;
import roadblock.modelchecking.translation.property.PrismPropertyTranslator;

public class TranslationManager {

	private static TranslationManager instance = null;

	public TranslationManager() {
	}

	public static TranslationManager getInstance() {

		if (instance == null) {
			instance = new TranslationManager();
		}

		return instance;
	}

	public String translate(IProperty property, TranslationTarget target) {

		IPropertyTranslator propertyTranslator = null;

		switch (target) {
		case PRISM:
			propertyTranslator = new PrismPropertyTranslator();
			break;
		default:
			break;
		}

		return property.accept(propertyTranslator);
	}
	
	public String translate(FlatModel model, TranslationTarget target) {

		IModelTranslator modelTranslator = null;

		switch (target) {
		case PRISM:
			modelTranslator = new PrismModelTranslator();
			break;
		default:
			break;
		}

		return modelTranslator.translate(model);
	}
	
	public String translate(FlatModel model, IProperty property, TranslationTarget target) {
		
		IModelTranslator modelTranslator = null;

		switch (target) {
		case PRISM:
			modelTranslator = new PrismModelTranslator();
			break;
		default:
			break;
		}

		return modelTranslator.translate(model, property);
	}

}
