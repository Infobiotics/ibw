package roadblock.modelchecking.runtime;

import java.io.IOException;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;

public interface IModelcheckingExecutor {

	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException;

	public Process verify(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException;
}
