package roadblock.dataprocessing.flatModel;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
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
import roadblock.emf.ibl.Ibl.TimeUnit;
import roadblock.emf.ibl.Ibl.UnaryProbabilityProperty;
import roadblock.emf.ibl.Ibl.UnknownProbabilityConstraint;

public class FlatPropertyBuilder implements IVisitor<IProperty> {

	private Model model;
	private IProperty origialProperty;
	private IProperty flatProperty;

	private Map<Object, Map<String, MolecularSpecies>> moleculesByCompartment;
	private Object propertyCompartment;

	public IProperty build(IProperty property) {

		this.origialProperty = property;
		this.flatProperty = (IProperty) EcoreUtil.copy((EObject) property);

		flatProperty = model.accept(this);

		return flatProperty;
	}

	@Override
	public IProperty visit(Model model) {

		for (Region region : model.getRegionList()) {
			region.accept(this);
		}

		for (Cell cell : model.getCellList()) {
			cell.accept(this);
		}

		for (Device device : model.getDeviceList()) {
			device.accept(this);
		}

		return flatProperty;
	}

	@Override
	public IProperty visit(Region region) {

		for (Cell cell : region.getCellList()) {
			cell.accept(this);
		}

		return flatProperty;
	}

	@Override
	public IProperty visit(Cell cell) {

		for (IProperty property : cell.getProperties()) {
			handle(property, cell);
		}

		for (Device device : cell.getDeviceList()) {
			device.accept(this);
		}

		return flatProperty;
	}

	@Override
	public IProperty visit(Device device) {

		for (IProperty property : device.getProperties()) {
			handle(property, device);
		}

		return flatProperty;
	}

	@Override
	public IProperty visit(UnaryProbabilityProperty expression) {

		if (expression.getTimeConstraint() != null) {
			expression.getTimeConstraint().accept(this);
		}

		if (expression.getStateFormula() != null) {
			expression.getStateFormula().accept(this);
		}

		for (PropertyInitialCondition initialCondition : expression.getInitialConditions()) {
			initialCondition.accept(this);
		}

		return flatProperty;
	}

	@Override
	public IProperty visit(BinaryProbabilityProperty expression) {

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

		return flatProperty;
	}

	@Override
	public IProperty visit(RewardProperty expression) {

		if (expression.getConcentrationConstraint() != null) {
			expression.getConcentrationConstraint().accept(this);
		}

		if (expression.getTimeConstraint() != null) {
			expression.getTimeConstraint().accept(this);
		}

		for (PropertyInitialCondition initialCondition : expression.getInitialConditions()) {
			initialCondition.accept(this);
		}

		expression.setVariableName(moleculesByCompartment.get(propertyCompartment).get(expression.getVariableName()).getDisplayName());

		return flatProperty;
	}

	@Override
	public IProperty visit(SteadyStateProperty expression) {

		if (expression.getStateFormula() != null) {
			expression.getStateFormula().accept(this);
		}

		for (PropertyInitialCondition initialCondition : expression.getInitialConditions()) {
			initialCondition.accept(this);
		}

		return flatProperty;
	}

	@Override
	public IProperty visit(NotStateFormula expression) {

		if (expression.getNegatedOperand() != null) {
			expression.getNegatedOperand().accept(this);
		}

		return flatProperty;
	}

	@Override
	public IProperty visit(BinaryStateFormula expression) {

		if (expression.getLeftOperand() != null) {
			expression.getLeftOperand().accept(this);
		}

		if (expression.getRightOperand() != null) {
			expression.getRightOperand().accept(this);
		}

		return flatProperty;
	}

	@Override
	public IProperty visit(StateExpression expression) {

		expression.setQuantity(UnitConverter.getInstance().getBaseConcentration(expression.getQuantity(), expression.getUnit()));
		expression.setUnit(ConcentrationUnit.MOLECULE);

		expression.setVariableName(moleculesByCompartment.get(propertyCompartment).get(expression.getVariableName()).getDisplayName());

		return flatProperty;
	}

	@Override
	public IProperty visit(TimeInterval expression) {

		expression.setLowerBound(UnitConverter.getInstance().getBaseTime(expression.getLowerBound(), expression.getUnit()));
		expression.setUpperBound(UnitConverter.getInstance().getBaseTime(expression.getUpperBound(), expression.getUnit()));
		expression.setUnit(TimeUnit.SECOND);

		return flatProperty;
	}

	@Override
	public IProperty visit(TimeInstant expression) {

		expression.setValue(UnitConverter.getInstance().getBaseTime(expression.getValue(), expression.getUnit()));
		expression.setUnit(TimeUnit.SECOND);

		return flatProperty;
	}

	@Override
	public IProperty visit(PropertyInitialCondition expression) {

		expression.setAmount(UnitConverter.getInstance().getBaseConcentration(expression.getAmount(), expression.getUnit()));
		expression.setUnit(ConcentrationUnit.MOLECULE);

		return flatProperty;
	}

	@Override
	public IProperty visit(ConcentrationConstraint expression) {

		expression.setValue(UnitConverter.getInstance().getBaseConcentration(expression.getValue(), expression.getUnit()));
		expression.setUnit(ConcentrationUnit.MOLECULE);

		return flatProperty;
	}

	private void handle(IProperty property, Object compartment) {

		if (this.origialProperty != null && this.origialProperty == property) {

			propertyCompartment = compartment;

			flatProperty.accept(this);
		}
	}

	public FlatPropertyBuilder(Model model, Map<Object, Map<String, MolecularSpecies>> moleculesByCompartment) {
		this.model = model;
		this.moleculesByCompartment = moleculesByCompartment;
	}

	/* unimplemented methods */

	@Override
	public IProperty visit(Kinetics kinetics) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(ConcreteProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(UnknownProbabilityConstraint expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(FlatModel flatModel) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(ATGCDirective atgc) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(System system) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(Chromosome chromosome) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(Plasmid plasmid) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(EMFVariableAssignment expression) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(MolecularSpecies molecularSpecies) {
		throw new UnsupportedOperationException();
	}

	@Override
	public IProperty visit(Rule rule) {
		throw new UnsupportedOperationException();
	}
}
