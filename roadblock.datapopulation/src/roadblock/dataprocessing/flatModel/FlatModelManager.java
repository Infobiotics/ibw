package roadblock.dataprocessing.flatModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.ProbabilityProperty;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;

public class FlatModelManager {

	private Model model;
	private List<IProperty> properties;
	private FlatModelBuilder flatModelBuilder;

	private Map<IProperty, FlatModel> flatModelByProperty;
	private Map<Integer, FlatModel> flatModelByHash;

	private FlatModel buildFlatModel(IProperty property) {

		FlatModel flatModel = null;

		if (flatModelByProperty.containsKey(property)) {
			flatModel = flatModelByProperty.get(property);
		} else {

			Integer hash = new Integer(getHash(model, property));

			if (flatModelByHash.containsKey(hash)) {
				flatModel = flatModelByHash.get(hash);
			} else {
				flatModel = flatModelBuilder.build(model, property);
				flatModelByHash.put(hash, flatModel);
			}

			flatModelByProperty.put(property, flatModel);
		}

		return flatModel;
	}

	private int getHash(Model model, IProperty property) {

		int hash = 0;
		List<PropertyInitialCondition> initialConditions = null;
		List<String> hashComponents = new ArrayList<>();

		if (property instanceof ProbabilityProperty) {
			initialConditions = ((ProbabilityProperty) property)
					.getInitialConditions();
		} else if (property instanceof SteadyStateProperty) {
			initialConditions = ((SteadyStateProperty) property)
					.getInitialConditions();
		} else if (property instanceof RewardProperty) {
			initialConditions = ((RewardProperty) property)
					.getInitialConditions();
		}

		for (PropertyInitialCondition initialCondition : initialConditions) {
			hashComponents.add(initialCondition.getVariableName() + "."
					+ initialCondition.getVariableAttribute() + "="
					+ initialCondition.getAmount());
		}

		if (hashComponents.size() > 0) {

			Collections.sort(hashComponents);
			String stringHash = "";
			for (String hashComponent : hashComponents) {
				stringHash += hashComponent + ",";
			}

			hash = stringHash.hashCode();
		}

		return hash;
	}

	public List<IProperty> getProperties() {

		return properties;
	}

	public FlatModel getFlatModel(IProperty property) {

		return buildFlatModel(property);
	}

	public FlatModel getFlatModel() {

		return flatModelBuilder.build(model);
	}

	public FlatModelManager(Model model) {

		this.model = model;
		this.properties = PropertyCollector.getInstance().getAll(model);
		this.flatModelByProperty = new HashMap<>();
		this.flatModelByHash = new HashMap<>();
		this.flatModelBuilder = FlatModelBuilder.getInstance();
	}
}
