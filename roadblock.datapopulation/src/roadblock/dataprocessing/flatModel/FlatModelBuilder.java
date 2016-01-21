package roadblock.dataprocessing.flatModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import roadblock.dataprocessing.util.UnitConverter;
import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.BinaryArithmeticExpression;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Chromosome;
import roadblock.emf.ibl.Ibl.ConcentrationConstraint;
import roadblock.emf.ibl.Ibl.ConcentrationQuantity;
import roadblock.emf.ibl.Ibl.ConcentrationUnit;
import roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.EMFVariableAssignment;
import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.IVisitor;
import roadblock.emf.ibl.Ibl.IblFactory;
import roadblock.emf.ibl.Ibl.Kinetics;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.MonotonicityExpression;
import roadblock.emf.ibl.Ibl.NotStateFormula;
import roadblock.emf.ibl.Ibl.NumericLiteral;
import roadblock.emf.ibl.Ibl.Plasmid;
import roadblock.emf.ibl.Ibl.ProbabilityProperty;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
import roadblock.emf.ibl.Ibl.Region;
import roadblock.emf.ibl.Ibl.RelationalExpression;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;
import roadblock.emf.ibl.Ibl.System;
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeInterval;
import roadblock.emf.ibl.Ibl.TimeUnit;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;
import roadblock.emf.ibl.Ibl.VariableReference;

public class FlatModelBuilder implements IVisitor<Void> {

	private Model model;
	private IProperty property;

	private FlatModel flatModel;
	private IProperty flatProperty;

	private Object propertyCompartment;
	private boolean belongsToPropertyCompartment;
	private Map<String, MolecularSpecies> moleculesByFlatName;
	private Map<Object, Map<String, MolecularSpecies>> moleculesByCompartment;
	private Map<String, MolecularSpecies> flatMoleculesByFlatName;
	private Map<Object, Object> parentsByCompartment;
	private Map<Object, String> prefixByCompartment;
	// child compartments are stored by their original name
	private Map<Object, Map<String, Object>> childCompartmentsByCompartment;

	public void build() {

		this.flatModel = IblFactory.eINSTANCE.createFlatModel();
		this.flatProperty = (IProperty) EcoreUtil.copy((EObject) property);

		this.moleculesByFlatName = new HashMap<>();
		this.moleculesByCompartment = new HashMap<>();
		this.flatMoleculesByFlatName = new HashMap<>();
		this.parentsByCompartment = new HashMap<>();
		this.prefixByCompartment = new HashMap<>();
		this.childCompartmentsByCompartment = new HashMap<>();

		try {
			model.accept(this);
		} catch (Exception ex) {
			this.childCompartmentsByCompartment = new HashMap<>();
		}
	}

	public FlatModel getFlatModel() {
		return flatModel;
	}

	public IProperty getFlatProperty() {
		return flatProperty;
	}

	public Map<String, MolecularSpecies> getMoleculesByFlatName() {
		return moleculesByFlatName;
	}

	@Override
	public Void visit(Model model) {

		for (Region region : model.getRegionList()) {
			region.accept(this);
		}

		for (Cell cell : model.getCellList()) {
			cell.accept(this);
		}

		for (Device device : model.getDeviceList()) {
			device.accept(this);
		}

		for (Kinetics kinetics : model.getProcessList()) {
			kinetics.accept(this);
		}

		return null;
	}

	@Override
	public Void visit(Region region) {

		boolean isThePropertyCompartment = false;

		if (belongsToCompartment(property, region)) {
			propertyCompartment = region;
			isThePropertyCompartment = belongsToPropertyCompartment = true;
		}

		registerMolecules(region);

		for (Cell cell : region.getCellList()) {
			registerChildCompartment(cell, cell.getDisplayName(), region);
			cell.accept(this);
		}

		for (Kinetics kinetics : region.getProcessList()) {
			registerChildCompartment(kinetics, kinetics.getDisplayName(), region);
			kinetics.accept(this);
		}

		if (belongsToPropertyCompartment) {
			register(region.getRuleList(), region);
		}

		// stop the flattening process for rules not belonging to the property
		// compartment or its child compartments
		if (isThePropertyCompartment) {
			belongsToPropertyCompartment = false;
		}

		return null;
	}

	@Override
	public Void visit(Cell cell) {

		boolean isThePropertyCompartment = false;

		if (belongsToCompartment(property, cell)) {
			propertyCompartment = cell;
			isThePropertyCompartment = belongsToPropertyCompartment = true;
		}

		registerMolecules(cell);

		for (Device device : cell.getDeviceList()) {
			registerChildCompartment(device, device.getDisplayName(), cell);
			device.accept(this);
		}

		for (Kinetics kinetics : cell.getProcessList()) {
			registerChildCompartment(kinetics, kinetics.getDisplayName(), cell);
			kinetics.accept(this);
		}

		if (belongsToPropertyCompartment) {

			register(cell.getRuleList(), cell);

			for (IProperty property : cell.getProperties()) {
				handle(property, cell);
			}
		}

		// stop the flattening process for rules not belonging to the property
		// compartment or its child compartments
		if (isThePropertyCompartment) {
			belongsToPropertyCompartment = false;
		}

		return null;
	}

	@Override
	public Void visit(Device device) {

		boolean isThePropertyCompartment = false;

		if (belongsToCompartment(property, device)) {
			propertyCompartment = device;
			isThePropertyCompartment = belongsToPropertyCompartment = true;
		}

		registerMolecules(device);

		for (Kinetics kinetics : device.getProcessList()) {
			registerChildCompartment(kinetics, kinetics.getDisplayName(), device);
			kinetics.accept(this);
		}

		if (belongsToPropertyCompartment) {

			register(device.getRuleList(), device);

			for (IProperty property : device.getProperties()) {
				handle(property, device);
			}
		}

		// stop the flattening process for rules not belonging to the property
		// compartment or its child compartments
		if (isThePropertyCompartment) {
			belongsToPropertyCompartment = false;
		}

		return null;
	}

	@Override
	public Void visit(Kinetics kinetics) {

		registerMolecules(kinetics);

		if (belongsToPropertyCompartment) {
			register(kinetics.getRuleList(), kinetics);
		}

		return null;
	}

	@Override
	public Void visit(UnaryProbabilityProperty expression) {

		if (expression.getTimeConstraint() != null) {
			expression.getTimeConstraint().accept(this);
		}

		if (expression.getStateFormula() != null) {
			expression.getStateFormula().accept(this);
		}

		for (PropertyInitialCondition initialCondition : expression.getInitialConditions()) {
			initialCondition.accept(this);
		}

		return null;
	}

	@Override
	public Void visit(BinaryProbabilityProperty expression) {

		if (expression.getTimeConstraint() != null) {
			expression.getTimeConstraint().accept(this);
		}

		if (expression.getLeftOperand() != null) {
			expression.getLeftOperand().accept(this);
		}

		if (expression.getRightOperand() != null) {
			expression.getRightOperand().accept(this);
		}

		for (PropertyInitialCondition initialCondition : expression.getInitialConditions()) {
			initialCondition.accept(this);
		}

		return null;
	}

	@Override
	public Void visit(RewardProperty expression) {

		if (expression.getConcentrationConstraint() != null) {
			expression.getConcentrationConstraint().accept(this);
		}

		if (expression.getTimeConstraint() != null) {
			expression.getTimeConstraint().accept(this);
		}

		for (PropertyInitialCondition initialCondition : expression.getInitialConditions()) {
			initialCondition.accept(this);
		}

		if (expression.getVariable() != null) {
			expression.getVariable().accept(this);
		}

		return null;
	}

	@Override
	public Void visit(SteadyStateProperty expression) {

		if (expression.getStateFormula() != null) {
			expression.getStateFormula().accept(this);
		}

		for (PropertyInitialCondition initialCondition : expression.getInitialConditions()) {
			initialCondition.accept(this);
		}

		return null;
	}

	@Override
	public Void visit(NotStateFormula expression) {

		if (expression.getNegatedOperand() != null) {
			expression.getNegatedOperand().accept(this);
		}

		return null;
	}

	@Override
	public Void visit(BinaryStateFormula expression) {

		if (expression.getLeftOperand() != null) {
			expression.getLeftOperand().accept(this);
		}

		if (expression.getRightOperand() != null) {
			expression.getRightOperand().accept(this);
		}

		return null;
	}

	@Override
	public Void visit(ConcentrationQuantity expression) {

		expression.setAmount(UnitConverter.getInstance().getBaseConcentration(expression.getAmount(), expression.getUnit()));
		expression.setUnit(ConcentrationUnit.MOLECULE);

		return null;
	}

	@Override
	public Void visit(TimeInterval expression) {

		expression.setLowerBound(UnitConverter.getInstance().getBaseTime(expression.getLowerBound(), expression.getUnit()));
		expression.setUpperBound(UnitConverter.getInstance().getBaseTime(expression.getUpperBound(), expression.getUnit()));
		expression.setUnit(TimeUnit.SECOND);

		return null;
	}

	@Override
	public Void visit(TimeInstant expression) {

		expression.setValue(UnitConverter.getInstance().getBaseTime(expression.getValue(), expression.getUnit()));
		expression.setUnit(TimeUnit.SECOND);

		return null;
	}

	@Override
	public Void visit(PropertyInitialCondition expression) {

		expression.getVariable().accept(this);

		expression.setAmount(UnitConverter.getInstance().getBaseConcentration(expression.getAmount(), expression.getUnit()));
		expression.setUnit(ConcentrationUnit.MOLECULE);

		return null;
	}

	@Override
	public Void visit(ConcentrationConstraint expression) {

		expression.setValue(UnitConverter.getInstance().getBaseConcentration(expression.getValue(), expression.getUnit()));
		expression.setUnit(ConcentrationUnit.MOLECULE);

		return null;
	}

	@Override
	public Void visit(BinaryArithmeticExpression expression) {

		expression.getLeftOperand().accept(this);
		expression.getRightOperand().accept(this);

		return null;
	}

	@Override
	public Void visit(MonotonicityExpression expression) {

		expression.getVariable().accept(this);

		return null;
	}

	@Override
	public Void visit(RelationalExpression expression) {

		expression.getLeftOperand().accept(this);
		expression.getRightOperand().accept(this);

		return null;
	}

	@Override
	public Void visit(VariableReference variable) {

		Object moleculeCompartment = propertyCompartment;

		if (variable.getContainerName() != null && !variable.getContainerName().isEmpty()) {
			moleculeCompartment = childCompartmentsByCompartment.get(propertyCompartment).get(variable.getContainerName());
		}

		String flatVariableName = moleculesByCompartment.get(moleculeCompartment).get(variable.getName()).getDisplayName();

		variable.setName(flatVariableName);

		return null;
	}

	@Override
	public Void visit(NumericLiteral expression) {
		return null;
	}

	private void registerMolecules(Region region) {

		Map<String, MolecularSpecies> molecules = new HashMap<>();
		moleculesByCompartment.put(region, molecules);
		prefixByCompartment.put(region, region.getDisplayName());

		for (MolecularSpecies molecularSpecies : region.getMoleculeList()) {
			register(molecularSpecies, region);
		}
	}

	private void registerMolecules(Cell cell) {

		Object parentCompartment = parentsByCompartment.get(cell);
		Map<String, MolecularSpecies> molecules = new HashMap<>();

		moleculesByCompartment.put(cell, molecules);
		prefixByCompartment.put(cell, prefixByCompartment.get(parentCompartment) + "_" + cell.getDisplayName());

		for (MolecularSpecies molecule : cell.getMoleculeList()) {
			register(molecule, cell);
		}
	}

	private void registerMolecules(Device device) {

		Object parentCompartment = parentsByCompartment.get(device);
		Map<String, MolecularSpecies> molecules = new HashMap<>(moleculesByCompartment.get(parentCompartment));

		moleculesByCompartment.put(device, molecules);
		prefixByCompartment.put(device, prefixByCompartment.get(parentCompartment) + "_" + device.getDisplayName());

		for (MolecularSpecies molecule : device.getMoleculeList()) {
			register(molecule, device);
		}
	}

	private void registerMolecules(Kinetics process) {

		Object parentCompartment = parentsByCompartment.get(process);
		Map<String, MolecularSpecies> molecules = new HashMap<>(moleculesByCompartment.get(parentCompartment));

		moleculesByCompartment.put(process, molecules);
		prefixByCompartment.put(process, prefixByCompartment.get(parentCompartment) + "_" + process.getDisplayName());

		for (MolecularSpecies molecule : process.getMoleculeList()) {
			register(molecule, process);
		}
	}

	private MolecularSpecies register(MolecularSpecies molecularSpecies, Object compartment) {

		MolecularSpecies molecule = EcoreUtil.copy(molecularSpecies);

		if (molecule.getDisplayName().contains("~")) {

			String[] componentMolecules = molecule.getDisplayName().split("~");
			String complexMoleculeName = "";

			for (String moleculeName : componentMolecules) {
				complexMoleculeName += moleculesByCompartment.get(compartment).get(moleculeName).getDisplayName() + "_";
			}

			molecule.setDisplayName(complexMoleculeName.substring(0, complexMoleculeName.length() - 1));
		} else {
			molecule.setDisplayName(prefixByCompartment.get(compartment) + "_" + molecularSpecies.getDisplayName());
		}

		molecule.setAmount(UnitConverter.getInstance().getBaseConcentration(molecularSpecies.getAmount(), molecularSpecies.getUnit()));
		molecule.setUnit(ConcentrationUnit.MOLECULE);

		moleculesByCompartment.get(compartment).put(molecularSpecies.getDisplayName(), molecule);
		flatMoleculesByFlatName.put(molecule.getDisplayName(), molecule);

		if (!moleculesByFlatName.containsKey(molecule.getDisplayName())) {

			flatModel.getMoleculeList().add(molecule);

			// store molecule by flat name also
			moleculesByFlatName.put(molecule.getDisplayName(), molecularSpecies);
		}

		return molecule;
	}

	private void register(List<Rule> rules, Object compartment) {

		for (Rule rule : rules) {

			List<MolecularSpecies> lhsMolecules = new ArrayList<>();
			List<MolecularSpecies> rhsMolecules = new ArrayList<>();
			boolean isLeftOutside = rule.getLeftHandSide().size() == 1 && rule.getLeftHandSide().get(0).getDisplayName().equals("OUTSIDE");
			boolean isRightOutside = rule.getRightHandSide().size() == 1 && rule.getRightHandSide().get(0).getDisplayName().equals("OUTSIDE");

			for (MolecularSpecies molecularSpecies : rule.getLeftHandSide()) {

				if (!molecularSpecies.getDisplayName().equals("OUTSIDE")) {

					MolecularSpecies molecule = moleculesByCompartment.get(compartment).get(molecularSpecies.getDisplayName());

					if (molecule != null) {
						lhsMolecules.add(EcoreUtil.copy(molecule));
					}

					if (isRightOutside) {

						molecule = moleculesByCompartment.get(parentsByCompartment.get(compartment)).get(molecularSpecies.getDisplayName());

						if (molecule != null) {
							rhsMolecules.add(EcoreUtil.copy(molecule));
						}
					}
				}
			}

			for (MolecularSpecies molecularSpecies : rule.getRightHandSide()) {

				if (!molecularSpecies.getDisplayName().equals("OUTSIDE")) {

					MolecularSpecies molecule = moleculesByCompartment.get(compartment).get(molecularSpecies.getDisplayName());

					if (molecule != null) {
						rhsMolecules.add(EcoreUtil.copy(molecule));
					}

					if (isLeftOutside) {

						molecule = moleculesByCompartment.get(parentsByCompartment.get(compartment)).get(molecularSpecies.getDisplayName());

						if (molecule != null) {
							lhsMolecules.add(EcoreUtil.copy(molecule));
						}
					}
				}
			}

			Rule clonedRule = EcoreUtil.copy(rule);
			clonedRule.getLeftHandSide().clear();
			clonedRule.getLeftHandSide().addAll(lhsMolecules);
			clonedRule.getRightHandSide().clear();
			clonedRule.getRightHandSide().addAll(rhsMolecules);

			if (clonedRule.getForwardRate() != null && clonedRule.getForwardRateUnit() != null) {
				clonedRule.setForwardRate(UnitConverter.getInstance().getBaseRate(clonedRule.getForwardRate(), clonedRule.getForwardRateUnit()));
				clonedRule.setForwardRateUnit(IblFactory.eINSTANCE.createRateUnit());
			}

			if (clonedRule.getReverseRate() != null && clonedRule.getReverseRateUnit() != null) {
				clonedRule.setReverseRate(UnitConverter.getInstance().getBaseRate(clonedRule.getReverseRate(), clonedRule.getReverseRateUnit()));
				clonedRule.setReverseRateUnit(IblFactory.eINSTANCE.createRateUnit());
			}

			// eliminate rules with no specified or zero rates
			if(clonedRule.isIsBidirectional()) {
				if ((clonedRule.getForwardRate() != null && clonedRule.getForwardRate() > 0) || (clonedRule.getReverseRate() != null && clonedRule.getReverseRate() > 0)) {
					flatModel.getRuleList().add(clonedRule);
				}
			}
			else if (clonedRule.getForwardRate() != null && clonedRule.getForwardRate() > 0) {
				flatModel.getRuleList().add(clonedRule);
			}
		}
	}

	private void registerChildCompartment(Object compartment, String compartmentName, Object parentCompartment) {

		Map<String, Object> childCompartmentsByName = childCompartmentsByCompartment.get(parentCompartment);

		if (childCompartmentsByName == null) {
			childCompartmentsByName = new HashMap<>();
			childCompartmentsByCompartment.put(compartment, childCompartmentsByName);
		}

		parentsByCompartment.put(compartment, parentCompartment);
		childCompartmentsByName.put(compartmentName, compartment);
	}

	private void handle(IProperty property, Object compartment) {

		if (this.property != null && this.property == property) {

			propertyCompartment = compartment;

			flatProperty.accept(this);

			applyInitialConcentrations(flatProperty, compartment);
		}
	}

	private void applyInitialConcentrations(IProperty property, Object propertyCompartment) {

		List<PropertyInitialCondition> initialConditions = null;

		if (property instanceof ProbabilityProperty) {
			initialConditions = ((ProbabilityProperty) property).getInitialConditions();
		} else if (property instanceof SteadyStateProperty) {
			initialConditions = ((SteadyStateProperty) property).getInitialConditions();
		} else if (property instanceof RewardProperty) {
			initialConditions = ((RewardProperty) property).getInitialConditions();
		}

		if (initialConditions != null) {
			for (PropertyInitialCondition initialCondition : initialConditions) {

				String moleculeFlatName = initialCondition.getVariable().getName();
				MolecularSpecies flatMolecule = flatMoleculesByFlatName.get(moleculeFlatName);

				if (flatMolecule != null) {

					flatMolecule.setUnit(initialCondition.getUnit());
					flatMolecule.setAmount(initialCondition.getAmount());
				}
			}
		}
	}

	private boolean belongsToCompartment(IProperty property, Object compartment) {

		boolean result = property == null;

		if (compartment instanceof Cell) {
			result = ((Cell) compartment).getProperties().indexOf(property) != -1;
		} else if (compartment instanceof Device) {
			result = ((Device) compartment).getProperties().indexOf(property) != -1;
		}

		return result;
	}

	public FlatModelBuilder(Model model, IProperty property) {
		this.model = model;
		this.property = property;
	}

	public FlatModelBuilder(Model model) {
		this.model = model;
	}

	/* unimplemented methods */

	@Override
	public Void visit(ConcreteProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(UnknownProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(FlatModel flatModel) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(ATGCDirective atgc) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(System system) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(Chromosome chromosome) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(Plasmid plasmid) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(EMFVariableAssignment expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(MolecularSpecies molecularSpecies) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(Rule rule) {
		throw new UnsupportedOperationException();
	}
}
