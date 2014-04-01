package roadblock.modelchecking.translation.property;

import roadblock.emf.ibl.Ibl.IProperty;

public class PropertyTranslationManager {

	private static PropertyTranslationManager instance = null;

	public PropertyTranslationManager() {
	}

	public static PropertyTranslationManager getInstance() {

		if (instance == null) {
			instance = new PropertyTranslationManager();
		}

		return instance;
	}

	public String Translate(IProperty property, TranslationTarget target) {

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
}
