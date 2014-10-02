package roadblock.modelchecking.ui.util;

import org.eclipse.xtext.resource.XtextResource;

import roadblock.dataprocessing.model.ModelBuilder;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.ui.model.PropertyTreeData;

public class ModelcheckingUtil {

	private static final ModelcheckingUtil instance = new ModelcheckingUtil();

	public static ModelcheckingUtil getInstance() {
		return instance;
	}

	public PropertyTreeData getPropertyTreeData(XtextResource iblResource, ModelcheckingTarget target) {

		roadblock.xtext.ibl.ibl.Model semanticModel = (roadblock.xtext.ibl.ibl.Model) iblResource.getContents().get(0);
		ModelBuilder modelBuilder = new ModelBuilder();

		PropertyTreeData modelData = new PropertyTreeData();
		modelData.model = semanticModel != null ? modelBuilder.populate(semanticModel) : null;
		modelData.semanticEntityByProperty = modelBuilder.getPropertySemanticEntityMapper();
		modelData.modelcheckingTarget = target;

		return modelData;
	}

	private ModelcheckingUtil() {
	}
}
