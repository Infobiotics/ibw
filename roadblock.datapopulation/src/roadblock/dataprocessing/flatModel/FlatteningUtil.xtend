package roadblock.dataprocessing.flatModel

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import roadblock.dataprocessing.util.UnitConverter
import roadblock.emf.ibl.Ibl.Cell
import roadblock.emf.ibl.Ibl.ConcentrationConstraint
import roadblock.emf.ibl.Ibl.ConcentrationQuantity
import roadblock.emf.ibl.Ibl.ConcentrationUnit
import roadblock.emf.ibl.Ibl.Device
import roadblock.emf.ibl.Ibl.IProperty
import roadblock.emf.ibl.Ibl.IblFactory
import roadblock.emf.ibl.Ibl.Kinetics
import roadblock.emf.ibl.Ibl.MolecularSpecies
import roadblock.emf.ibl.Ibl.PropertyInitialCondition
import roadblock.emf.ibl.Ibl.Region
import roadblock.emf.ibl.Ibl.Rule
import roadblock.emf.ibl.Ibl.TimeInstant
import roadblock.emf.ibl.Ibl.TimeInterval
import roadblock.emf.ibl.Ibl.TimeUnit
import roadblock.emf.ibl.Ibl.VariableReference

public class FlatteningUtil {

	private static var instance = new FlatteningUtil();

	def public static FlatteningUtil getInstance() {
		return instance;
	}

	def public List<MolecularSpecies> getFlatMolecules(EObject compartment, Map<EObject, Map<String, MolecularSpecies>> flatMoleculesByCompartment) {

		var flatMoleculesByFlatName = new HashMap<String, MolecularSpecies>();
		var parentCompartment = compartment.eContainer;

		// register own molecules
		for (molecule : compartment.eContents.filter(MolecularSpecies).toList) {
			var flatMolecule = flatMoleculesByCompartment.get(compartment).get(molecule.displayName);
			flatMoleculesByFlatName.put(flatMolecule.displayName, flatMolecule);
		}

		// register molecules form child regions
		for (region : compartment.eAllContents.filter(Region).toList) {
			for (molecule : region.moleculeList) {
				var flatMolecule = flatMoleculesByCompartment.get(region).get(molecule.displayName);
				flatMoleculesByFlatName.put(flatMolecule.displayName, flatMolecule);
			}
		}

		// register molecules form child cells
		for (cell : compartment.eAllContents.filter(Cell).toList) {
			for (molecule : cell.moleculeList) {
				var flatMolecule = flatMoleculesByCompartment.get(cell).get(molecule.displayName);
				flatMoleculesByFlatName.put(flatMolecule.displayName, flatMolecule);
			}
		}

		// register molecules form child devices
		for (device : compartment.eAllContents.filter(Device).toList) {
			for (molecule : device.moleculeList) {
				var flatMolecule = flatMoleculesByCompartment.get(device).get(molecule.displayName);
				flatMoleculesByFlatName.put(flatMolecule.displayName, flatMolecule);
			}
		}

		// register molecules form child processes
		for (kinetic : compartment.eAllContents.filter(Kinetics).toList) {
			for (molecule : kinetic.moleculeList) {
				var flatMolecule = flatMoleculesByCompartment.get(kinetic).get(molecule.displayName);
				flatMoleculesByFlatName.put(flatMolecule.displayName, flatMolecule);
			}
		}

		// inherit molecules used in left-OUTSIDE rules
		var leftOutsideRules = compartment.eContents.filter(Rule).filter [
			leftHandSide.exists[displayName.equals("OUTSIDE")]
		].toList;
		for (rule : leftOutsideRules) {
			for (molecule : rule.rightHandSide) {
				flatMoleculesByFlatName.put(molecule.displayName, flatMoleculesByCompartment.get(parentCompartment).get(molecule.displayName));
			}
		}

		// inherit molecules used in right-OUTSIDE rules
		var rightOutsideRules = compartment.eContents.filter(Rule).filter [
			rightHandSide.exists[displayName.equals("OUTSIDE")]
		].toList;
		for (rule : rightOutsideRules) {
			for (molecule : rule.leftHandSide) {
				flatMoleculesByFlatName.put(molecule.displayName, flatMoleculesByCompartment.get(parentCompartment).get(molecule.displayName));
			}
		}

		return flatMoleculesByFlatName.values.toList;
	}

	def public List<Rule> getFlatRules(EObject compartment, Map<EObject, Map<String, MolecularSpecies>> flatMoleculesByCompartment) {

		var flatRules = new ArrayList<Rule>;

		for (rule : compartment.eAllContents.filter(Rule).toList) {

			var ruleCompartment = rule.eContainer;
			var parentCompartment = ruleCompartment.eContainer;
			var lhsMolecules = new ArrayList<MolecularSpecies>;
			var rhsMolecules = new ArrayList<MolecularSpecies>;
			var isLeftOutside = rule.leftHandSide.size() == 1 && rule.leftHandSide.get(0).displayName.equals("OUTSIDE");
			var isRightOutside = rule.rightHandSide.size() == 1 && rule.rightHandSide.get(0).displayName.equals("OUTSIDE");

			for (lhsMolecule : rule.leftHandSide) {

				if(!lhsMolecule.displayName.equals("OUTSIDE")) {

					var molecule = flatMoleculesByCompartment.get(ruleCompartment).get(lhsMolecule.displayName);

					if(molecule != null) {
						lhsMolecules.add(EcoreUtil.copy(molecule));
					}

					if(isRightOutside) {

						molecule = flatMoleculesByCompartment.get(parentCompartment).get(lhsMolecule.displayName);

						if(molecule != null) {
							rhsMolecules.add(EcoreUtil.copy(molecule));
						}
					}
				}
			}

			for (rhsMolecule : rule.rightHandSide) {

				if(!rhsMolecule.displayName.equals("OUTSIDE")) {

					var molecule = flatMoleculesByCompartment.get(ruleCompartment).get(rhsMolecule.getDisplayName());

					if(molecule != null) {
						rhsMolecules.add(EcoreUtil.copy(molecule));
					}

					if(isLeftOutside) {

						molecule = flatMoleculesByCompartment.get(parentCompartment).get(rhsMolecule.getDisplayName());

						if(molecule != null) {
							lhsMolecules.add(EcoreUtil.copy(molecule));
						}
					}
				}
			}

			var clonedRule = EcoreUtil.copy(rule);
			clonedRule.leftHandSide.clear();
			clonedRule.leftHandSide.addAll(lhsMolecules);
			clonedRule.rightHandSide.clear();
			clonedRule.rightHandSide.addAll(rhsMolecules);

			if(clonedRule.forwardRateUnit != null) {
				clonedRule.forwardRate = UnitConverter::getInstance().getBaseRate(clonedRule.forwardRate, clonedRule.forwardRateUnit);
				clonedRule.forwardRateUnit = IblFactory::eINSTANCE.createRateUnit;
			}

			if(clonedRule.reverseRateUnit != null) {
				clonedRule.reverseRate = UnitConverter::getInstance().getBaseRate(clonedRule.reverseRate, clonedRule.reverseRateUnit);
				clonedRule.reverseRateUnit = IblFactory::eINSTANCE.createRateUnit;
			}

			// eliminate rules with no specified or zero rates		
			if(clonedRule.isIsBidirectional) {
				if ((clonedRule.forwardRate != null && clonedRule.forwardRate > 0) || (clonedRule.reverseRate != null && clonedRule.reverseRate > 0)) {
					flatRules.add(clonedRule);
				}
			}
			else if (clonedRule.forwardRate != null && clonedRule.forwardRate > 0) {
				flatRules.add(clonedRule);
			}
		}

		return flatRules;
	}

	def public IProperty getFlatProperty(IProperty property, EObject propertyCompartment, Map<String, EObject> compartmentsByName,
		Map<EObject, Map<String, MolecularSpecies>> flatMoleculesByCompartment) {

		var flatProperty = EcoreUtil.copy(property as EObject);

		// flatten variable references
		var moleculeReferences = flatProperty.eAllContents.filter(VariableReference).toList;
		for (moleculeReference : moleculeReferences) {

			var EObject moleculeCompartment = null;

			if(moleculeReference.containerName.nullOrEmpty) {
				moleculeCompartment = propertyCompartment;
			} else {
				moleculeCompartment = compartmentsByName.get(moleculeReference.containerName);
			}

			moleculeReference.name = flatMoleculesByCompartment.get(moleculeCompartment).get(moleculeReference.name).displayName;
		}

		// flatten concentration constraints
		var concentrationConstraints = flatProperty.eAllContents.filter(ConcentrationConstraint).toList;
		for (concentrationConstraint : concentrationConstraints) {
			concentrationConstraint.value = UnitConverter::getInstance.getBaseConcentration(concentrationConstraint.value, concentrationConstraint.unit);
			concentrationConstraint.unit = ConcentrationUnit.MOLECULE;
		}

		// flatten concentration quantities
		var concentrationQuantities = flatProperty.eAllContents.filter(ConcentrationQuantity).toList;
		for (concentrationQuantity : concentrationQuantities) {
			concentrationQuantity.amount = UnitConverter::getInstance.getBaseConcentration(concentrationQuantity.amount, concentrationQuantity.unit);
			concentrationQuantity.unit = ConcentrationUnit.MOLECULE;
		}

		// flatten time intervals
		var timeIntervals = flatProperty.eAllContents.filter(TimeInterval).toList;
		for (timeInterval : timeIntervals) {
			timeInterval.lowerBound = UnitConverter.getInstance().getBaseTime(timeInterval.lowerBound, timeInterval.unit);
			timeInterval.upperBound = UnitConverter.getInstance().getBaseTime(timeInterval.upperBound, timeInterval.unit);
			timeInterval.unit = TimeUnit.SECOND;
		}

		// flatten time instants
		var timeInstants = flatProperty.eAllContents.filter(TimeInstant).toList;
		for (timeInstant : timeInstants) {
			timeInstant.value = UnitConverter.getInstance().getBaseTime(timeInstant.value, timeInstant.unit);
			timeInstant.unit = TimeUnit.SECOND;
		}

		// flatten initial conditions' concentrations
		var initialConditions = (flatProperty).eAllContents.filter(PropertyInitialCondition).toList;
		for (initialCondition : initialConditions) {
			initialCondition.amount = UnitConverter::getInstance.getBaseConcentration(initialCondition.amount, initialCondition.unit);
			initialCondition.unit = ConcentrationUnit.MOLECULE;
		}

		return flatProperty as IProperty;
	}

	private new() {
	}
}
