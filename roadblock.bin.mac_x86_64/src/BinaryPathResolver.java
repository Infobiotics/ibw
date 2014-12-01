import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import roadblock.bin.BinaryPathProvider;

public class BinaryPathResolver {

	static {
		try {
			Bundle currentBundle = Platform.getBundle("roadblock.bin.mac_x86_64");

			URL prismUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/prism/bin/prism"), Collections.EMPTY_MAP));
			BinaryPathProvider.getInstance().setPrismPath(prismUrl.getPath());

			URL nuSmvUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/nuxmv/nuXmv"), Collections.EMPTY_MAP));
			BinaryPathProvider.getInstance().setNuSmvPath(nuSmvUrl.getPath());

			URL ngssUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/ngss/ngss"), Collections.EMPTY_MAP));
			BinaryPathProvider.getInstance().setNgssPath(ngssUrl.getPath());

			setBinaryFullPermissions(BinaryPathProvider.getInstance().getPrismPath());
			setBinaryFullPermissions(BinaryPathProvider.getInstance().getNuSmvPath());
			setBinaryFullPermissions(BinaryPathProvider.getInstance().getNgssPath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void setBinaryFullPermissions(String binaryPath) throws IOException {

		Set<PosixFilePermission> perms = new HashSet<PosixFilePermission>();
		
		// add owners permission
		perms.add(PosixFilePermission.OWNER_READ);
		perms.add(PosixFilePermission.OWNER_WRITE);
		perms.add(PosixFilePermission.OWNER_EXECUTE);
		
		// add group permissions
		perms.add(PosixFilePermission.GROUP_READ);
		perms.add(PosixFilePermission.GROUP_WRITE);
		perms.add(PosixFilePermission.GROUP_EXECUTE);
		
		// add others permissions
		perms.add(PosixFilePermission.OTHERS_READ);
		perms.add(PosixFilePermission.OTHERS_WRITE);
		perms.add(PosixFilePermission.OTHERS_EXECUTE);

		Files.setPosixFilePermissions(Paths.get(binaryPath), perms);
	}
}
