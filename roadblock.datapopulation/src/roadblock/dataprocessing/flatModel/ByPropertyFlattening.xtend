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
import roadblock.emf.ibl.Ibl.IProperty
import roadblock.emf.ibl.Ibl.Kinetics
import roadblock.emf.ibl.Ibl.Model
import roadblock.emf.ibl.Ibl.MolecularSpecies
import roadblock.emf.ibl.Ibl.Region

public class ByPropertyFlattening {

	private Model model;
	private IProperty property;
	private EObject propertyEObject;
	private EObject propertyCompartment;
	private Map<EObject, Map<String, MolecularSpecies>> flatMoleculesByCompartment;
	private Map<String, MolecularSpecies> flatMoleculesByFlatName;
	private Map<String, MolecularSpecies> moleculesByFlatName;
	private Map<String, MolecularSpecies> moleculesByName;
	private Map<EObject, String> prefixByCompartment;

	def FlatModel getFlatModel() {

		registerFlatMoleculesByCompartment(model);
		
		var flatteningCompartment = getFlatteningCompartment();
		var flatModel = getFlatModelOf(flatteningCompartment);
		
		return flatModel;
	}

	def void registerFlatMoleculesByCompartment(EObject compartment) {

		inheritFlatMoleculesFor(compartment);
		registerFlatMoleculesFor(compartment);

		for (region : compartment.eContents.filter(Region).toList) {
			registerFlatMoleculesByCompartment(region);
		}
		for (cell : compartment.eContents.filter(Cell).toList) {
			registerFlatMoleculesByCompartment(cell);
		}
		for (device : compartment.eContents.filter(Device).toList) {
			registerFlatMoleculesByCompartment(device);
		}
		for (kinetic : compartment.eContents.filter(Kinetics).toList) {
			registerFlatMoleculesByCompartment(kinetic);
		}
	}

	def inheritFlatMoleculesFor(EObject compartment) {

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
	}

	def registerFlatMoleculesFor(EObject compartment) {

		for (molecule : compartment.eContents.filter(MolecularSpecies).toList) {

			var clonedMolecule = EcoreUtil.copy(molecule);

			if(clonedMolecule.getDisplayName().contains("~")) {

				var componentMolecules = clonedMolecule.getDisplayName().split("~");
				var complexMoleculeName = "";

				for (String moleculeName : componentMolecules) {
					complexMoleculeName += flatMoleculesByCompartment.get(compartment).get(moleculeName).getDisplayName() + "_";
				}

				clonedMolecule.setDisplayName(complexMoleculeName.substring(0, complexMoleculeName.length() - 1));
			} else {
				clonedMolecule.setDisplayName(prefixByCompartment.get(compartment) + "_" + molecule.getDisplayName());
			}

			clonedMolecule.setAmount(UnitConverter.getInstance().getBaseConcentration(molecule.getAmount(), molecule.getUnit()));
			clonedMolecule.setUnit(ConcentrationUnit.MOLECULE);

			flatMoleculesByCompartment.get(compartment).put(molecule.getDisplayName(), clonedMolecule);
			flatMoleculesByFlatName.put(clonedMolecule.getDisplayName(), clonedMolecule);
			moleculesByFlatName.put(clonedMolecule.getDisplayName(), molecule);
		}
	}
	
	def EObject getFlatteningCompartment() {
		
		var propertyCompartmentMolecules = propertyCompartment.eAllContents.filter(MolecularSpecies).toList;
		
		return null;
	}
	
	def FlatModel getFlatModelOf(EObject compartment) {
		return null;
	}

	new(Model model, IProperty property) {
		this.model = model
		this.property = property;
		this.propertyEObject = property as EObject;
		this.propertyCompartment = propertyEObject.eContainer;
		this.flatMoleculesByCompartment = new HashMap;
		this.flatMoleculesByFlatName = new HashMap;
		this.moleculesByFlatName = new HashMap;
		this.moleculesByName = new HashMap;
		this.prefixByCompartment = new HashMap;
	}
}
