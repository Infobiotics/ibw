package roadblock.modelchecking.translation.model;

import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.modelchecking.ModelcheckingTarget;


public interface IModelTranslator {

	public String translate(FlatModel model);
	
	public String translate(FlatModel model, IProperty property);
	
	public ModelcheckingTarget getTarget();
}
