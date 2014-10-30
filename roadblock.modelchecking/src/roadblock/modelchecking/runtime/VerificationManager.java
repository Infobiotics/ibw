package roadblock.modelchecking.runtime;

import java.io.IOException;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;
import roadblock.modelchecking.ModelcheckingTarget;
import roadblock.modelchecking.runtime.mc2.Mc2Configuration;
import roadblock.modelchecking.runtime.mc2.Mc2Executor;
import roadblock.modelchecking.runtime.nusmv.NuSmvConfiguration;
import roadblock.modelchecking.runtime.nusmv.NuSmvExecutor;
import roadblock.modelchecking.runtime.prism.PrismConfiguration;
import roadblock.modelchecking.runtime.prism.PrismExecutor;

public class VerificationManager {

	private static VerificationManager instance = null;

	public static VerificationManager getInstance() {

		if (instance == null) {
			instance = new VerificationManager();
		}

		return instance;
	}

	public void export(Model model, IProperty property, ModelcheckingTarget target, String filename) throws IOException {

		IModelcheckingExecutor<? extends IModelcheckingConfiguration> executor = getExecutor(target);
		executor.export(model, property, target, filename);
	}

	public Process verify(Model model, IProperty property, ModelcheckingTarget target, IModelcheckingConfiguration config) throws IOException {

		IModelcheckingExecutor<? extends IModelcheckingConfiguration> executor = getExecutor(target);
		Process verificationProcess = null;

		switch (target) {
		case PRISM:
			PrismExecutor prismExecutor = (PrismExecutor) executor;
			verificationProcess = prismExecutor.verify(model, property, target, (PrismConfiguration) config);
			break;
		case NUSMV:
			NuSmvExecutor nuSmvExecutor = (NuSmvExecutor) executor;
			verificationProcess = nuSmvExecutor.verify(model, property, target, (NuSmvConfiguration) config);
			break;
		case MC2:
			Mc2Executor mc2Executor = (Mc2Executor) executor;
			verificationProcess = mc2Executor.verify(model, property, target, (Mc2Configuration) config);
			break;
		default:
			break;
		}

		return verificationProcess;
	}

	private IModelcheckingExecutor<? extends IModelcheckingConfiguration> getExecutor(ModelcheckingTarget target) {

		IModelcheckingExecutor<? extends IModelcheckingConfiguration> executor = null;

		switch (target) {
		case PRISM:
			executor = new PrismExecutor();
			break;
		case NUSMV:
			executor = new NuSmvExecutor();
			break;
		case MC2:
			executor = new Mc2Executor();
			break;
		default:
			break;
		}

		return executor;
	}

	private VerificationManager() {
	}
}
