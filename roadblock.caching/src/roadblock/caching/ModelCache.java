package roadblock.caching;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.IResourceScopeCache;

import roadblock.dataprocessing.flatModel.FlatModelManager;
import roadblock.dataprocessing.model.ModelBuilder;
import roadblock.emf.ibl.Ibl.FlatModel;
import roadblock.emf.ibl.Ibl.Model;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ModelCache {

	private static ModelCache instance = new ModelCache();

	@Inject
	private IResourceScopeCache cache;

	public static ModelCache getInstance() {
		return instance;
	}

	public Model getModel(final XtextResource resource) {

		Model model = resource.getCache().get("Model", resource,
				new Provider<Model>() {

					public Model get() {

						XtextResource iblResource = (XtextResource) resource;
						roadblock.xtext.ibl.ibl.Model semanticModel = (roadblock.xtext.ibl.ibl.Model) iblResource
								.getContents().get(0);

						ModelBuilder modelBuilder = new ModelBuilder();
						Model model = modelBuilder.populate(semanticModel);

						return model;
					}
				});

		return model;
	}

	public FlatModel getFlatModel(final XtextResource resource) {

		FlatModel flatModel = resource.getCache().get("FlatModel", resource,
				new Provider<FlatModel>() {

					public FlatModel get() {

						Model model = getModel(resource);
						FlatModelManager flatModelManager = new FlatModelManager(
								model);
						FlatModel flatModel = flatModelManager.getFlatModel();

						return flatModel;
					}
				});

		return flatModel;
	}

	public String getSerialisedFlatModel(final XtextResource resource) {

		String serialisation = resource.getCache().get("SerialisedFlatModel",
				resource, new Provider<String>() {

					public String get() {

						FlatModel flatModel = getFlatModel(resource);
						String serialisation = null;

						try {
							serialisation = getSerialisation(flatModel);
						} catch (IOException e) {
							e.printStackTrace();
						}

						return serialisation;
					}
				});

		return serialisation;
	}

	private static String getSerialisation(EObject eObject) throws IOException {

		XMLResource resource = new XMLResourceImpl();
		XMLProcessor processor = new XMLProcessor();

		resource.getDefaultSaveOptions().put(
				XMLResourceImpl.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		resource.setEncoding("UTF-8");
		resource.getContents().add(eObject);

		return processor.saveToString(resource, null);
	}

	public ModelCache() {
	}
}
