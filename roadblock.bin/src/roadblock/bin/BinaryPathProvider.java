package roadblock.bin;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class BinaryPathProvider {

	private static BinaryPathProvider instance = new BinaryPathProvider();

	private static String mc2Path;
	private static String prismPath;
	private static String nuSmvPath;
	private static String ngssPath;
	private static String imagesPath;
	private static String codonUsageDbPath;
	private static String partRegistryDbPath;
	private static String restrictionEnzymesDbPath;
	private static String rbsCalculatorPath;

	static {
		try {
			Bundle currentBundle = Platform.getBundle("roadblock.bin");

			URL mc2Url = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/mc2.jar"), Collections.<String, String> emptyMap()));
			mc2Path = mc2Url.getPath();

			// instantiate the BinaryPathResolver in order to call its static
			// constructor
			// the instantiation is made by reflection as the class is available
			// only at runtime
			Class<?> binaryPathResolverClass = Class.forName("BinaryPathResolver");
			@SuppressWarnings("unused")
			Object binaryPathResolver = binaryPathResolverClass.newInstance();

		} catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public String getMc2Path() {
		return mc2Path;
	}

	public void setMc2Path(String mc2Path) {
		BinaryPathProvider.mc2Path = mc2Path;
	}

	public String getPrismPath() {
		return prismPath;
	}

	public void setPrismPath(String prismPath) {
		BinaryPathProvider.prismPath = prismPath;
	}

	public String getNuSmvPath() {
		return nuSmvPath;
	}

	public void setNuSmvPath(String nuSmvPath) {
		BinaryPathProvider.nuSmvPath = nuSmvPath;
	}

	public String getNgssPath() {
		return ngssPath;
	}

	public void setNgssPath(String ngssPath) {
		BinaryPathProvider.ngssPath = ngssPath;
	}

	public String getImagesPath() {
		return imagesPath;
	}

	public void setImagesPath(String imagesPath) {
		BinaryPathProvider.imagesPath = imagesPath;
	}

	public String getCodonUsageDbPath() {
		return codonUsageDbPath;
	}

	public void setCodonUsageDbPath(String codonUsageDbPath) {
		BinaryPathProvider.codonUsageDbPath = codonUsageDbPath;
	}

	public String getPartRegistryDbPath() {
		return partRegistryDbPath;
	}

	public void setPartRegistryDbPath(String partRegistryDbPath) {
		BinaryPathProvider.partRegistryDbPath = partRegistryDbPath;
	}

	public String getRestrictionEnzymesDbPath() {
		return restrictionEnzymesDbPath;
	}

	public void setRestrictionEnzymesDbPath(String restrictionEnzymesDbPath) {
		BinaryPathProvider.restrictionEnzymesDbPath = restrictionEnzymesDbPath;
	}
	
	public String getRbsCalculatorPath() {
		return rbsCalculatorPath;
	}

	public void setRbsCalculatorPath(String rbsCalculatorPath) {
		BinaryPathProvider.rbsCalculatorPath = rbsCalculatorPath;
	}

	public static BinaryPathProvider getInstance() {
		return instance;
	}

	private BinaryPathProvider() {
	}
}
