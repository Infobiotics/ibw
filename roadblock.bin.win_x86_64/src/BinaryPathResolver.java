import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import roadblock.bin.BinaryPathProvider;

public class BinaryPathResolver {

	static {
		try {
			Bundle currentBundle = Platform.getBundle("roadblock.bin.win_x86_64");

			URL prismUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/prism/bin/prism.bat"), Collections.EMPTY_MAP));
			BinaryPathProvider.getInstance().setPrismPath(prismUrl.getPath());

			URL nuSmvUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/nusmv/bin/NuSMV.exe"), Collections.EMPTY_MAP));
			BinaryPathProvider.getInstance().setNuSmvPath(nuSmvUrl.getPath());

			//URL ngssUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/ngss.exe"), Collections.EMPTY_MAP));
			//BinaryPathProvider.getInstance().setNgssPath(ngssUrl.getPath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
