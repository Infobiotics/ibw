package roadblock.modelchecking.translation.property;

import roadblock.emf.ibl.Ibl.IVisitor;

public interface IPropertyTranslator extends IVisitor<String> {

	public TranslationTarget getTarget();
	
}
