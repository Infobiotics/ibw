package roadblock.dataprocessing.flatModel;

import java.util.ArrayList;
import java.util.List;

import roadblock.emf.ibl.Ibl.ATGCDirective;
import roadblock.emf.ibl.Ibl.BinaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.BinaryStateFormula;
import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Chromosome;
import roadblock.emf.ibl.Ibl.ConcentrationConstraint;
import roadblock.emf.ibl.Ibl.ConcreteProbabilityConstraint;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.EMFVariableAssignment;
import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.IVisitor;
import roadblock.emf.ibl.Ibl.Kinetics;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.emf.ibl.Ibl.MolecularSpecies;
import roadblock.emf.ibl.Ibl.NotStateFormula;
import roadblock.emf.ibl.Ibl.Plasmid;
import roadblock.emf.ibl.Ibl.PropertyInitialCondition;
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

public class PropertyCollector implements IVisitor<Void> {

	private static PropertyCollector instance;

	private List<IProperty> properties;

	public static PropertyCollector getInstance() {

		if (instance == null) {
			instance = new PropertyCollector();
		}

		return instance;
	}

	public List<IProperty> getAll(Model model) {

		this.properties = new ArrayList<>();

		model.accept(this);

		return this.properties;
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

		for (Cell cell : region.getCellList()) {
			cell.accept(this);
		}

		return null;
	}

	@Override
	public Void visit(Cell cell) {

		for (IProperty property : cell.getProperties()) {
			properties.add(property);
		}

		for (Device device : cell.getDeviceList()) {
			device.accept(this);
		}

		return null;
	}

	@Override
	public Void visit(Device device) {

		for (IProperty property : device.getProperties()) {
			properties.add(property);
		}

		for (Kinetics kinetics : device.getProcessList()) {
			kinetics.accept(this);
		}

		return null;
	}

	@Override
	public Void visit(Kinetics kinetics) {

		return null;
	}

	/* unimplemented methods */

	@Override
	public Void visit(UnaryProbabilityProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(BinaryProbabilityProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(RewardProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(SteadyStateProperty expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(NotStateFormula expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(BinaryStateFormula expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(StateExpression expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(TimeInterval expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(TimeInstant expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(PropertyInitialCondition expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(ConcentrationConstraint expression) {
		throw new UnsupportedOperationException();
	}
	
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
	public Void visit(MolecularSpecies molecularSpecies) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(Rule rule) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Void visit(EMFVariableAssignment expression) {
		throw new UnsupportedOperationException();
	}
}
