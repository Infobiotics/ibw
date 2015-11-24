package roadblock.modelchecking.filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.VerificationType;
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

	public boolean canVerify(IProperty property, VerificationType verificationType) {

		boolean canVerify = false;

		if (verificationType == VerificationType.QUALITATIVE) {
			canVerify |= canVerify(property, Arrays.asList(ModelcheckingTarget.NUSMV));
		} else if (verificationType == VerificationType.QUANTITATIVE) {
			canVerify |= canVerify(property, Arrays.asList(ModelcheckingTarget.PRISM, ModelcheckingTarget.MC2));
		}

		return canVerify;
	}

	public boolean canVerify(IProperty property, List<ModelcheckingTarget> targets) {

		boolean canVerify = false;

		if (targets != null) {
			for (ModelcheckingTarget target : targets) {
				IPropertyFilter propertyFilter = getPropertyFilter(target);
				canVerify |= property.accept(propertyFilter);
			}
		}

		return canVerify;
	}

	public List<ModelcheckingTarget> getModelcheckingTargets(IProperty property) {

		List<ModelcheckingTarget> targets = new ArrayList<>(Arrays.asList(ModelcheckingTarget.MC2));

		IPropertyFilter nuSmvPropertyFilter = getPropertyFilter(ModelcheckingTarget.NUSMV);
		if (property.accept(nuSmvPropertyFilter)) {
			targets.add(ModelcheckingTarget.NUSMV);
		}

		IPropertyFilter prismPropertyFilter = getPropertyFilter(ModelcheckingTarget.PRISM);
		if (property.accept(prismPropertyFilter)) {
			targets.add(ModelcheckingTarget.PRISM);
		}

		return targets;
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
