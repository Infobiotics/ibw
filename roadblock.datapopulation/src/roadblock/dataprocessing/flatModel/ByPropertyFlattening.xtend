package roadblock.dataprocessing.flatModel

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import roadblock.dataprocessing.util.UnitConverter
import roadblock.emf.ibl.Ibl.Cell
import roadblock.emf.ibl.Ibl.ConcentrationUnit
import roadblock.emf.ibl.Ibl.Device
import roadblock.emf.ibl.Ibl.FlatModel
import roadblock.emf.ibl.Ibl.FlatModelPropertyPair
import roadblock.emf.ibl.Ibl.IProperty
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.Kinetics
import roadblock.emf.ibl.Ibl.Model
import roadblock.emf.ibl.Ibl.MolecularSpecies
import roadblock.emf.ibl.Ibl.PropertyInitialCondition
import roadblock.emf.ibl.Ibl.Region
import roadblock.emf.ibl.Ibl.Rule
import roadblock.emf.ibl.Ibl.VariableReference

public class ByPropertyFlattening {

	private Model model;
	private IProperty property;
	private EObject propertyEObject;
	private EObject propertyCompartment;
	private Map<EObject, Map<String, MolecularSpecies>> flatMoleculesByCompartment;
	private Map<String, MolecularSpecies> flatMoleculesByFlatName;
	private Map<String, MolecularSpecies> moleculesByFlatName;
	private Map<EObject, String> prefixByCompartment;
	private Map<String, EObject> compartmentsByName;

	def public FlatModelPropertyPair getFlatData() {

		registerFlatMoleculesByCompartment(model);

		var flatData = IblFactory::eINSTANCE.createFlatModelPropertyPair;
		flatData.flatModel = buildFlatModel();
		flatData.property = FlatteningUtil::getInstance.getFlatProperty(property, propertyCompartment, compartmentsByName, flatMoleculesByCompartment);

		return flatData;
	}

	def void registerFlatMoleculesByCompartment(EObject compartment) {

		compartment.inheritFlatMolecules();
		compartment.registerFlatMolecules();

		for (region : compartment.eContents.filter(Region).toList) {
			compartmentsByName.put(region.displayName, region);
			registerFlatMoleculesByCompartment(region);
		}

		for (cell : compartment.eContents.filter(Cell).toList) {
			compartmentsByName.put(cell.displayName, cell);
			registerFlatMoleculesByCompartment(cell);
		}

		for (device : compartment.eContents.filter(Device).toList) {
			compartmentsByName.put(device.displayName, device);
			registerFlatMoleculesByCompartment(device);
		}

		for (kinetic : compartment.eContents.filter(Kinetics).toList) {
			compartmentsByName.put(kinetic.displayName, kinetic);
			registerFlatMoleculesByCompartment(kinetic);
		}

		if(compartment == propertyCompartment) {

			var initialConditions = (property as EObject).eAllContents.filter(PropertyInitialCondition).toList;

			for (initialCondition : initialConditions) {

				var moleculeReference = initialCondition.variable;
				var EObject moleculeCompartment = null;

				if(moleculeReference.containerName.nullOrEmpty) {
					moleculeCompartment = propertyCompartment;
				} else {
					moleculeCompartment = compartmentsByName.get(moleculeReference.containerName);
				}

				var flatMolecule = flatMoleculesByCompartment.get(moleculeCompartment).get(moleculeReference.name);

				if(flatMolecule != null) {
					flatMolecule.unit = ConcentrationUnit.MOLECULE;
					flatMolecule.amount = UnitConverter::getInstance.getBaseConcentration(initialCondition.amount, initialCondition.unit);
				}
			}
		}
	}

	def inheritFlatMolecules(EObject compartment) {

		var parentCompartment = compartment.eContainer;
		var molecules = new HashMap<String, MolecularSpecies>();

		flatMoleculesByCompartment.put(compartment, molecules);

		switch compartment {
			Region: {
				prefixByCompartment.put(compartment, compartment.getDisplayName());
			}
			Cell: {
				prefixByCompartment.put(compartment, prefixByCompartment.get(parentCompartment) + "_" + compartment.getDisplayName());
			}
			Device: {
				molecules.putAll(flatMoleculesByCompartment.get(parentCompartment));
				prefixByCompartment.put(compartment, prefixByCompartment.get(parentCompartment) + "_" + compartment.getDisplayName());
			}
			Kinetics: {
				molecules.putAll(flatMoleculesByCompartment.get(parentCompartment));
				prefixByCompartment.put(compartment, prefixByCompartment.get(parentCompartment) + "_" + compartment.getDisplayName());
			}
		}

		// inherit molecules used in left-OUTSIDE rules
		var leftOutsideRules = compartment.eContents.filter(Rule).filter[leftHandSide.exists[displayName.equals("OUTSIDE")]].toList;
		for (rule : leftOutsideRules) {
			for (molecule : rule.rightHandSide) {
				molecules.put(molecule.displayName, flatMoleculesByCompartment.get(parentCompartment).get(molecule.displayName));
			}
		}
		
		// inherit molecules used in right-OUTSIDE rules
		var rightOutsideRules = compartment.eContents.filter(Rule).filter[rightHandSide.exists[displayName.equals("OUTSIDE")]].toList;
		for (rule : rightOutsideRules) {
			for (molecule : rule.leftHandSide) {
				molecules.put(molecule.displayName, flatMoleculesByCompartment.get(parentCompartment).get(molecule.displayName));
			}
		}
	}

	def registerFlatMolecules(EObject compartment) {

		for (molecule : compartment.eContents.filter(MolecularSpecies).toList) {

			var clonedMolecule = EcoreUtil.copy(molecule);

			if(clonedMolecule.getDisplayName().contains("~")) {

				var componentMolecules = clonedMolecule.getDisplayName().split("~");
				var complexMoleculeName = "";

				for (String moleculeName : componentMolecules) {
					complexMoleculeName = complexMoleculeName + flatMoleculesByCompartment.get(compartment).get(moleculeName).getDisplayName() + "_";
				}

				clonedMolecule.setDisplayName(complexMoleculeName.substring(0, complexMoleculeName.length() - 1));
			} else {
				clonedMolecule.setDisplayName(prefixByCompartment.get(compartment) + "_" + molecule.getDisplayName());
			}

			clonedMolecule.setAmount(UnitConverter::getInstance.getBaseConcentration(molecule.getAmount(), molecule.getUnit()));
			clonedMolecule.setUnit(ConcentrationUnit.MOLECULE);

			flatMoleculesByCompartment.get(compartment).put(molecule.getDisplayName(), clonedMolecule);
			flatMoleculesByFlatName.put(clonedMolecule.getDisplayName(), clonedMolecule);
			moleculesByFlatName.put(clonedMolecule.getDisplayName(), molecule);
		}
	}

	def FlatModel buildFlatModel() {

		val propertyCompartmentScopeFlatMolecules = flatMoleculesByCompartment.get(propertyCompartment);

		// compute the set of flat molecules used by rules in the property compartment
		val flatMoleculeSet = propertyCompartment.eContents.filter(Rule).map[eContents].flatten.filter(MolecularSpecies).filter[displayName != "OUTSIDE"].map[
			propertyCompartmentScopeFlatMolecules.get(displayName).displayName].toSet;

		// compute the set of molecule references as they appear in properties
		val propertyMolecules = (property as EObject).eAllContents.filter(VariableReference).toList;

		// add the molecules referenced in properties to the set of flat molecules
		for (moleculeReference : propertyMolecules) {

			var EObject moleculeCompartment = null;

			if(moleculeReference.containerName.nullOrEmpty) {
				moleculeCompartment = propertyCompartment;
			} else {
				moleculeCompartment = compartmentsByName.get(moleculeReference.containerName);
			}

			flatMoleculeSet.add(flatMoleculesByCompartment.get(moleculeCompartment).get(moleculeReference.name).displayName);
		}

		var compartment = propertyCompartment.eContainer;
		var flatteningCompartment = propertyCompartment;

		while(compartment != model) {

			val compartmentScopeFlatMolecules = flatMoleculesByCompartment.get(compartment);
			val rulesFlatMoleculeSet = compartment.eContents.filter(Rule).map[eContents].flatten.filter(MolecularSpecies).filter[displayName != "OUTSIDE"].map[
				compartmentScopeFlatMolecules.get(displayName).displayName].toSet;

			if(rulesFlatMoleculeSet.exists[flatMoleculeSet.contains(it)]) {
				flatMoleculeSet.addAll(rulesFlatMoleculeSet);
				flatteningCompartment = compartment;
			}

			compartment = compartment.eContainer;
		}

		var flatModel = IblFactory::eINSTANCE.createFlatModel;
		var flatMolecules = FlatteningUtil::getInstance.getFlatMolecules(flatteningCompartment, flatMoleculesByCompartment);
		var flatRules = FlatteningUtil::getInstance.getFlatRules(flatteningCompartment, flatMoleculesByCompartment);

		flatModel.moleculeList.addAll(flatMolecules);
		flatModel.ruleList.addAll(flatRules);

		return flatModel;
	}

	def public Map<String, MolecularSpecies> getMoleculesByFlatName() {
		return moleculesByFlatName;
	}

	new(Model model, IProperty property) {
		this.model = model
		this.property = property;
		this.propertyEObject = property as EObject;
		this.propertyCompartment = propertyEObject.eContainer;
		this.flatMoleculesByCompartment = new HashMap;
		this.flatMoleculesByFlatName = new HashMap;
		this.moleculesByFlatName = new HashMap;
		this.prefixByCompartment = new HashMap;
		this.compartmentsByName = new HashMap;
	}
}
