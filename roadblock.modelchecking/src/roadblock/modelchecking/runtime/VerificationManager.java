package roadblock.modelchecking.runtime;

import java.io.IOException;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;

public class VerificationManager {

	private static VerificationManager instance = null;

	public static VerificationManager getInstance() {

		if (instance == null) {
			instance = new VerificationManager();
		}

		return instance;
	}

	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {
		
		IModelcheckingExecutor executor = getExecutor(target);
		executor.export(model, property, target, filename);
	}
	
	public Process verify(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {
		
		IModelcheckingExecutor executor = getExecutor(target);
		return executor.verify(model, property, target, filename);
	}
	
	private IModelcheckingExecutor getExecutor(ModelcheckingTarget target) {
		
		IModelcheckingExecutor executor = null;

		switch (target) {
		case PRISM:
			executor = new PrismExecutor();
			break;
		default:
			break;
		}

		return executor;
	}

	private VerificationManager() {
	}
}
