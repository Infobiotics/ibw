package roadblock.modelchecking.translation.property;

import roadblock.emf.ibl.Ibl.IVisitor;
import roadblock.modelchecking.ModelcheckingTarget;

public interface IPropertyTranslator extends IVisitor<String> {

	public ModelcheckingTarget getTarget();
	
}
