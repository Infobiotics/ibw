package roadblock.dataprocessing.flatModel;

import java.util.HashMap;
import java.util.Map;

import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.IblFactory;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.MolecularSpecies;

public class FlatModelManager {

	private Model model;

	private FlatModelBuilder flatModelBuilder;
	private Map<IProperty, FlatModelBuilder> flatModelBuilderByProperty;
	private FlatModel flatModel;
	private Map<IProperty, FlatModelPropertyPair> flatDataByProperty;

	public FlatModelPropertyPair getFlatData(IProperty property) {

		return buildFlatData(property);
	}

	public FlatModel getFlatModel() {

		if (flatModel == null) {

			flatModelBuilder = new FlatModelBuilder(this.model);
			flatModelBuilder.build();

			flatModel = flatModelBuilder.getFlatModel();
		}

		return flatModel;
	}

	public Map<String, MolecularSpecies> getMoleculesByFlatName() {
		return flatModelBuilder != null ? flatModelBuilder.getMoleculesByFlatName() : null;
	}

	public Map<String, MolecularSpecies> getMoleculesByFlatName(IProperty property) {
		return flatModelBuilderByProperty.containsKey(property) ? flatModelBuilderByProperty.get(property).getMoleculesByFlatName() : null;
	}

	private FlatModelPropertyPair buildFlatData(IProperty property) {

		FlatModelPropertyPair flatData = null;

		if (flatDataByProperty.containsKey(property)) {
			flatData = flatDataByProperty.get(property);
		} else {

			flatData = IblFactory.eINSTANCE.createFlatModelPropertyPair();

			FlatModelBuilder flatModelBuilder = new FlatModelBuilder(model, property);
			flatModelBuilder.build();

			flatData.setFlatModel(flatModelBuilder.getFlatModel());
			flatData.setProperty(flatModelBuilder.getFlatProperty());

			flatDataByProperty.put(property, flatData);
		}

		return flatData;
	}

	public FlatModelManager(Model model) {

		this.model = model;
		this.flatModelBuilderByProperty = new HashMap<>();
		this.flatDataByProperty = new HashMap<>();
	}
}
