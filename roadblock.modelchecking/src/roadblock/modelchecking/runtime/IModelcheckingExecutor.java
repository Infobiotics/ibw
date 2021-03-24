package roadblock.modelchecking.runtime;

import java.io.IOException;
import java.util.List;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;

public interface IModelcheckingExecutor<TConfiguration extends IModelcheckingConfiguration> {

	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException;

	public Process verify(Model model, IProperty property, ModelcheckingTarget target, TConfiguration config, String workspacePath) throws IOException, InterruptedException;
	
	public Process verify(Model model, List<IProperty> properties, ModelcheckingTarget target, TConfiguration config, String workspacePath) throws IOException, InterruptedException;
}
