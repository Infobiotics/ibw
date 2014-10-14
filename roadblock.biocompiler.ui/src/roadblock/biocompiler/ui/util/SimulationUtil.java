package roadblock.biocompiler.ui.util;

import org.eclipse.xtext.resource.XtextResource;

import roadblock.dataprocessing.model.ModelBuilder;
import roadblock.emf.ibl.Ibl.Model;

public class SimulationUtil {

	private static final SimulationUtil instance = new SimulationUtil();
	
	public static SimulationUtil getInstance() {
		return instance;
	}
	
	public Model getModel(XtextResource iblResource) {
		
		roadblock.xtext.ibl.ibl.Model semanticModel = (roadblock.xtext.ibl.ibl.Model) iblResource.getContents().get(0);
		ModelBuilder modelBuilder = new ModelBuilder();
		Model model = semanticModel != null ? modelBuilder.populate(semanticModel) : null;
		
		return model;
	}
}
