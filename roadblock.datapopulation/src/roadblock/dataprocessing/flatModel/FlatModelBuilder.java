package roadblock.dataprocessing.flatModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import roadblock.dataprocessing.util.UnitConverter;
import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Chromosome;
import roadblock.emf.ibl.Ibl.ConcentrationConstraint;
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
import roadblock.emf.ibl.Ibl.NotStateFormula;
import roadblock.emf.ibl.Ibl.Plasmid;
import roadblock.emf.ibl.Ibl.ProbabilityProperty;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
import roadblock.emf.ibl.Ibl.RateUnit;
import roadblock.emf.ibl.Ibl.Region;
import roadblock.emf.ibl.Ibl.RewardProperty;
import roadblock.emf.ibl.Ibl.Rule;
import roadblock.emf.ibl.Ibl.StateExpression;
import roadblock.emf.ibl.Ibl.SteadyStateProperty;
import roadblock.emf.ibl.Ibl.System;
import roadblock.emf.ibl.Ibl.TimeInstant;
import roadblock.emf.ibl.Ibl.TimeInterval;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;

public class FlatModelBuilder implements IVisitor<FlatModel> {

	private static FlatModelBuilder instance;

	private FlatModel flatModel;
	private Map<String, MolecularSpecies> molecules;

	public static FlatModelBuilder getInstance() {

		if (instance == null) {
			instance = new FlatModelBuilder();
		}

		return instance;
	}

	public FlatModel build(Model model, IProperty property) {

		this.flatModel = IblFactory.eINSTANCE.createFlatModel();
		this.molecules = new HashMap<>();

		flatModel = model.accept(this);
		
		applyInitialConcentrations(property);

		return flatModel;
	}
	
	public FlatModel build(Model model) {

		this.flatModel = IblFactory.eINSTANCE.createFlatModel();
		this.molecules = new HashMap<>();

		flatModel = model.accept(this);

		return flatModel;
	}

	@Override
	public FlatModel visit(Model model) {

		for (Rule rule : model.getRuleList()) {
			rule.accept(this);
		}
		
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

		return flatModel;
	}

	@Override
	public FlatModel visit(Region region) {

		for (MolecularSpecies molecule : region.getMoleculeList()) {
			molecule.accept(this);
		}

		for (Rule rule : region.getRuleList()) {
			rule.accept(this);
		}
		
		for (Cell cell : region.getCellList()) {
			cell.accept(this);
		}

		return flatModel;
	}

	@Override
	public FlatModel visit(Cell cell) {

		for (MolecularSpecies molecule : cell.getMoleculeList()) {
			molecule.accept(this);
		}

		for (Rule rule : cell.getRuleList()) {
			rule.accept(this);
		}
		
		for (Device device : cell.getDeviceList()) {
			device.accept(this);
		}

		return flatModel;
	}

	@Override
	public FlatModel visit(Device device) {
		
		for (MolecularSpecies molecule : device.getMoleculeList()) {
			molecule.accept(this);
		}

		for (Rule rule : device.getRuleList()) {
			rule.accept(this);
		}
		
		for (Kinetics kinetics : device.getProcessList()) {
			kinetics.accept(this);
		}

		return flatModel;
	}

	@Override
	public FlatModel visit(Kinetics kinetics) {
		
		for (MolecularSpecies molecule : kinetics.getMoleculeList()) {
			molecule.accept(this);
		}

		for (Rule rule : kinetics.getRuleList()) {
			rule.accept(this);
		}

		return flatModel;
	}

	@Override
	public FlatModel visit(MolecularSpecies molecularSpecies) {

		MolecularSpecies molecule = handleMolecule(molecularSpecies);
		
		molecule.setAmount(UnitConverter.getInstance().getBaseConcentration(molecularSpecies.getAmount(), molecularSpecies.getUnit()));
		molecule.setUnit(ConcentrationUnit.MOLECULE);
		
		return flatModel;
	}

	@Override
	public FlatModel visit(Rule rule) {

		for (MolecularSpecies molecule : rule.getLeftHandSide()) {
			handleMolecule(molecule);
		}
		
		for (MolecularSpecies molecule : rule.getRightHandSide()) {
			handleMolecule(molecule);
		}
		
		Rule clonedRule = EcoreUtil.copy(rule);
		flatModel.getRuleList().add(clonedRule);
		
		clonedRule.setForwardRate(UnitConverter.getInstance().getBaseRate(clonedRule.getForwardRate(), clonedRule.getForwardRateUnit()));
		clonedRule.setForwardRateUnit(RateUnit.PER_SECOND);
		clonedRule.setReverseRate(UnitConverter.getInstance().getBaseRate(clonedRule.getReverseRate(), clonedRule.getReverseRateUnit()));
		clonedRule.setReverseRateUnit(RateUnit.PER_SECOND);

		return flatModel;
	}
	
	private MolecularSpecies handleMolecule(MolecularSpecies molecularSpecies) {
		
		MolecularSpecies molecule = null;
		
		if(molecules.containsKey(molecularSpecies.getDisplayName())) {
			molecule = molecules.get(molecularSpecies.getDisplayName());
		}
		else {
			molecule = EcoreUtil.copy(molecularSpecies);
			
			molecules.put(molecule.getDisplayName(), molecule);
			flatModel.getMoleculeList().add(molecule);
		}
		
		return molecule;
	}

	private void applyInitialConcentrations(IProperty property) {
		
		List<PropertyInitialCondition> initialConditions = null;
		
		if(property instanceof ProbabilityProperty) {
			initialConditions = ((ProbabilityProperty)property).getInitialConditions();
		}
		else if(property instanceof SteadyStateProperty) {
			initialConditions = ((SteadyStateProperty)property).getInitialConditions();
		}
		else if(property instanceof RewardProperty) {
			initialConditions = ((RewardProperty)property).getInitialConditions();
		}
		
		if(initialConditions != null) {
			for(PropertyInitialCondition initialCondition : initialConditions) {
				
				String moleculeName = initialCondition.getVariableName();
				if(molecules.containsKey(moleculeName)) {
					
					MolecularSpecies molecule = molecules.get(moleculeName);
					molecule.setUnit(initialCondition.getUnit());
					molecule.setAmount(initialCondition.getAmount());
				}
			}
		}
	}

	/* unimplemented methods */

	@Override
	public FlatModel visit(UnaryProbabilityProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(BinaryProbabilityProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(RewardProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(StateExpression expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(NotStateFormula expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(BinaryStateFormula expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(ConcreteProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(UnknownProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(TimeInterval expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(TimeInstant expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(PropertyInitialCondition expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(ConcentrationConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(SteadyStateProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(FlatModel flatModel) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(ATGCDirective atgc) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(System system) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(Chromosome chromosome) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(Plasmid plasmid) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FlatModel visit(EMFVariableAssignment expression) {
		throw new UnsupportedOperationException();
	}
}
