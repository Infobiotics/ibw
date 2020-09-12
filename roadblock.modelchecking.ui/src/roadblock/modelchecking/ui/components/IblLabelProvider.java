package roadblock.modelchecking.ui.components;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import roadblock.emf.ibl.Ibl.Cell;
import roadblock.emf.ibl.Ibl.Device;
import roadblock.emf.ibl.Ibl.Region;
import roadblock.modelchecking.ui.model.PropertySemanticEntityPair;

public class IblLabelProvider extends LabelProvider {

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
}