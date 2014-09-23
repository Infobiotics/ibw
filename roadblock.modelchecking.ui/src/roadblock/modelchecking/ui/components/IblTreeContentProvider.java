package roadblock.modelchecking.ui.components;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Region;
import roadblock.modelchecking.ui.model.ModelData;
import roadblock.modelchecking.ui.model.PropertySemanticEntityPair;

public class IblTreeContentProvider implements ITreeContentProvider {

	private ModelData modelData;

	// Called just for the first-level objects.
	// Here we provide a list of objects
	@Override
	public Object[] getElements(Object inputModel) {

		modelData = (ModelData) inputModel;
		List<Object> rootElements = new LinkedList<>();

		for (Region region : modelData.model.getRegionList()) {
			if (hasChildren(region)) {
				rootElements.add(region);
			}
		}

		for (Cell cell : modelData.model.getCellList()) {
			if (hasChildren(cell)) {
				rootElements.add(cell);
			}
		}

		for (Device device : modelData.model.getDeviceList()) {
			if (hasChildren(device)) {
				rootElements.add(device);
			}
		}

		return rootElements.toArray();
	}

	// Queried to know if the current node has children
	@Override
	public boolean hasChildren(Object element) {

		boolean hasChildren = false;

		if (element instanceof Region) {
			Region region = (Region) element;

			for (Cell cell : region.getCellList()) {
				if (hasChildren(cell)) {
					hasChildren = true;
					break;
				}
			}
		} else if (element instanceof Cell) {
			Cell cell = (Cell) element;

			for (Device device : cell.getDeviceList()) {
				if (hasChildren(device)) {
					hasChildren = true;
					break;
				}
			}

			if (cell.getProperties().size() > 0) {
				hasChildren = true;
			}
		} else if (element instanceof Device) {
			Device device = (Device) element;

			if (device.getProperties().size() > 0) {
				hasChildren = true;
			}
		}

		return hasChildren;
	}

	// Queried to load the children of a given node
	@Override
	public Object[] getChildren(Object parentContainer) {

		List<Object> childElements = new LinkedList<>();

		if (parentContainer instanceof Region) {
			Region region = (Region) parentContainer;

			for (Cell cell : region.getCellList()) {
				if (hasChildren(cell)) {
					childElements.add(cell);
				}
			}
		} else if (parentContainer instanceof Cell) {
			Cell cell = (Cell) parentContainer;

			for (Device device : cell.getDeviceList()) {
				if (hasChildren(device)) {
					childElements.add(device);
				}
			}

			for (IProperty property : cell.getProperties()) {
				childElements.add(getPropertySemanticEntityPair(property));
			}
		} else if (parentContainer instanceof Device) {
			Device device = (Device) parentContainer;

			for (IProperty property : device.getProperties()) {
				childElements.add(getPropertySemanticEntityPair(property));
			}
		}

		return childElements.toArray();
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	private PropertySemanticEntityPair getPropertySemanticEntityPair(IProperty property) {

		PropertySemanticEntityPair pair = new PropertySemanticEntityPair();
		pair.property = property;
		pair.semanticEntity = modelData.semanticEntityByProperty.get(property);
		return pair;
	}
}