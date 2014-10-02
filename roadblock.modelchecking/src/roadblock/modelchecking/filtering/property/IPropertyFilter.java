package roadblock.modelchecking.filtering.property;

import roadblock.emf.ibl.Ibl.IVisitor;
import roadblock.modelchecking.ModelcheckingTarget;

public interface IPropertyFilter extends IVisitor<Boolean> {

	public ModelcheckingTarget getTarget();
	
}
