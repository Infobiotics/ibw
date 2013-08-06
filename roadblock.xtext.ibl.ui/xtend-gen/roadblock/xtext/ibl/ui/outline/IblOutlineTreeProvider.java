package roadblock.xtext.ibl.ui.outline;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import roadblock.xtext.ibl.ibl.VariableComplex;

@SuppressWarnings("all")
public class IblOutlineTreeProvider extends DefaultOutlineTreeProvider {
  public Object _text(final Object modelElement) {
    boolean _matched = false;
    if (!_matched) {
      if (modelElement instanceof VariableComplex) {
        final VariableComplex _variableComplex = (VariableComplex)modelElement;
        _matched=true;
        return "complex";
      }
    }
    if ((this.labelProvider instanceof IStyledLabelProvider)) {
      return ((IStyledLabelProvider) this.labelProvider).getStyledText(modelElement);
    } else {
      return this.labelProvider.getText(modelElement);
    }
  }
}
