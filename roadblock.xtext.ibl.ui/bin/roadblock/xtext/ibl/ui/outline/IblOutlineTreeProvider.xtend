package roadblock.xtext.ibl.ui.outline

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider$IStyledLabelProvider
import roadblock.xtext.ibl.ibl.VariableComplex

class IblOutlineTreeProvider extends org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider {
	override Object _text(Object modelElement) {
		// custom outline labels
		switch modelElement {
			VariableComplex: return("complex")
		}
		// otherwise use default
		if (labelProvider instanceof IStyledLabelProvider)
			return (labelProvider as IStyledLabelProvider).getStyledText(modelElement)
		else
			return labelProvider.getText(modelElement)
	}	
}
