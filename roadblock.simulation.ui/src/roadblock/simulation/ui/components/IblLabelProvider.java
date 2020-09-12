package roadblock.simulation.ui.components;

import org.eclipse.jface.viewers.LabelProvider;

import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Region;

public class IblLabelProvider extends LabelProvider {

	private int propertyIndex = 0;

	public void resetIndex() {
		propertyIndex = 0;
	}

	@Override
	public String getText(Object element) {

		String label = "";

		if (element instanceof Region) {
			label = ((Region) element).getDisplayName() + " (Region)";
		} else if (element instanceof Cell) {
			label = ((Cell) element).getDisplayName() + " (Cell)";
		} else if (element instanceof Device) {
			label = ((Device) element).getDisplayName() + " (Device)";
		} else if (element instanceof IProperty) {
			label = "property #" + (++propertyIndex) + " (Property)";
		}

		return label;
	}
}
