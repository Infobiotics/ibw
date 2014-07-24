package roadblock.modelchecking.translation;

import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.translation.model.IModelTranslator;
import roadblock.modelchecking.translation.model.PrismModelTranslator;
import roadblock.modelchecking.translation.property.IPropertyTranslator;
import roadblock.modelchecking.translation.property.PrismPropertyTranslator;

public class TranslationManager {

	private static TranslationManager instance = null;

	public static TranslationManager getInstance() {

		if (instance == null) {
			instance = new TranslationManager();
		}

		return instance;
	}

	public String translate(IProperty property, ModelcheckingTarget target) {

		IPropertyTranslator propertyTranslator = getPropertyTranslator(target);
		return property.accept(propertyTranslator);
	}

	public String translate(FlatModel model, ModelcheckingTarget target) {

		IModelTranslator modelTranslator = getModelTranslator(target);
		return modelTranslator.translate(model);
	}

	public String translate(FlatModel model, IProperty property, ModelcheckingTarget target) {

		IModelTranslator modelTranslator = getModelTranslator(target);
		return modelTranslator.translate(model, property);
	}

	private IPropertyTranslator getPropertyTranslator(ModelcheckingTarget target) {

		IPropertyTranslator propertyTranslator = null;

		switch (target) {
		case PRISM:
			propertyTranslator = new PrismPropertyTranslator();
			break;
		default:
			break;
		}

		return propertyTranslator;
	}

	private IModelTranslator getModelTranslator(ModelcheckingTarget target) {

		IModelTranslator modelTranslator = null;

		switch (target) {
		case PRISM:
			modelTranslator = new PrismModelTranslator();
			break;
		default:
			break;
		}

		return modelTranslator;
	}

	private TranslationManager() {
	}
}
