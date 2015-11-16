package roadblock.modelchecking.filtering;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.filtering.property.IPropertyFilter;
import roadblock.modelchecking.filtering.property.MC2PropertyFilter;
import roadblock.modelchecking.filtering.property.NuSmvPropertyFilter;
import roadblock.modelchecking.filtering.property.PrismPropertyFilter;

public class FilteringManager {

	private static FilteringManager instance = null;

	public static FilteringManager getInstance() {

		if (instance == null) {
			instance = new FilteringManager();
		}

		return instance;
	}

	public boolean canVerify(IProperty property, ModelcheckingTarget target) {

		IPropertyFilter propertyFilter = getPropertyFilter(target);
		return property.accept(propertyFilter);
	}

	public ModelcheckingTarget getModelcheckingTarget(IProperty property) {

		ModelcheckingTarget target = ModelcheckingTarget.MC2;

		IPropertyFilter nuSmvPropertyFilter = getPropertyFilter(ModelcheckingTarget.NUSMV);
		if (property.accept(nuSmvPropertyFilter)) {
			target = ModelcheckingTarget.NUSMV;
		} else {
			IPropertyFilter prismPropertyFilter = getPropertyFilter(ModelcheckingTarget.PRISM);
			if (property.accept(prismPropertyFilter)) {
				target = ModelcheckingTarget.PRISM;
			}
		}

		return target;

	}

	private IPropertyFilter getPropertyFilter(ModelcheckingTarget target) {

		IPropertyFilter propertyFilter = null;

		switch (target) {
		case PRISM:
			propertyFilter = new PrismPropertyFilter();
			break;
		case NUSMV:
			propertyFilter = new NuSmvPropertyFilter();
			break;
		case MC2:
			propertyFilter = new MC2PropertyFilter();
			break;
		default:
			break;
		}

		return propertyFilter;
	}

	private FilteringManager() {
	}
}
