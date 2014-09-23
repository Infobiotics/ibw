package roadblock.modelchecking.ui.components;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Point;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.Region;
import roadblock.modelchecking.ui.model.PropertySemanticEntityPair;

public class IblColumnLabelProvider extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {

		String label = "";

		if (element instanceof Region) {
			label = ((Region) element).getDisplayName() + " (Region)";
		} else if (element instanceof Cell) {
			label = ((Cell) element).getDisplayName() + " (Cell)";
		} else if (element instanceof Device) {
			label = ((Device) element).getDisplayName() + " (Device)";
		} else if (element instanceof PropertySemanticEntityPair) {
			PropertySemanticEntityPair pair = (PropertySemanticEntityPair) element;
			label = NodeModelUtils.getTokenText(NodeModelUtils.getNode(pair.semanticEntity));
		}

		return label;
	}
	
	@Override
	public String getToolTipText(Object element) {
		return getText(element);
	}
	
	@Override
	public Point getToolTipShift(Object object) {
		return new Point(10, 10);
	}
}