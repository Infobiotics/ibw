package roadblock.modelchecking.translation.property;

import roadblock.emf.ibl.Ibl.IVisitor;
import roadblock.modelchecking.translation.TranslationTarget;

public interface IPropertyTranslator extends IVisitor<String> {

	public TranslationTarget getTarget();
	
}
