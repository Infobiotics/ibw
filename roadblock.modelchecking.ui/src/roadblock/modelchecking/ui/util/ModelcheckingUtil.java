package roadblock.modelchecking.ui.util;

import java.util.List;

import org.eclipse.xtext.resource.XtextResource;

import roadblock.dataprocessing.model.ModelBuilder;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.VerificationType;
import roadblock.modelchecking.ui.model.PropertyTreeData;

public class ModelcheckingUtil {

	private static final ModelcheckingUtil instance = new ModelcheckingUtil();

	public static ModelcheckingUtil getInstance() {
		return instance;
	}

	public PropertyTreeData getPropertyTreeData(XtextResource iblResource, VerificationType verificationType) {

		roadblock.xtext.ibl.ibl.Model semanticModel = (roadblock.xtext.ibl.ibl.Model) iblResource.getContents().get(0);
		ModelBuilder modelBuilder = new ModelBuilder();

		PropertyTreeData modelData = new PropertyTreeData();
		modelData.model = semanticModel != null ? modelBuilder.populate(semanticModel) : null;
		modelData.semanticEntityByProperty = modelBuilder.getPropertySemanticEntityMapper();
		modelData.verificationType = verificationType;

		return modelData;
	}

	public ModelcheckingTarget getPreferredTarget(List<ModelcheckingTarget> targets, VerificationType verificationType) {

		ModelcheckingTarget target = null;

		if (verificationType == VerificationType.QUALITATIVE) {
			if (targets.contains(ModelcheckingTarget.NUSMV)) {
				target = ModelcheckingTarget.NUSMV;
			}
		} else if (verificationType == VerificationType.QUANTITATIVE) {
			target = targets.contains(ModelcheckingTarget.PRISM) ? ModelcheckingTarget.PRISM : ModelcheckingTarget.MC2;
		}

		return target;
	}

	private ModelcheckingUtil() {
	}
}
