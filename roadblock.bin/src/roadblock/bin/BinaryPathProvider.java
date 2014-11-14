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

	static {
		try {
			Bundle currentBundle = Platform.getBundle("roadblock.bin");
			
			URL mc2Url = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/mc2.jar"), Collections.EMPTY_MAP));
			mc2Path = mc2Url.getPath();
			
			// instantiate the BinaryPathResolver in order to call its static constructor
			// the instantiation is made by reflection as the class is available only at runtime
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

	public static BinaryPathProvider getInstance() {
		return instance;
	}

	private BinaryPathProvider() {
	}
}
