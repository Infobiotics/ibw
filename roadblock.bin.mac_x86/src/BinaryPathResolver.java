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
			Bundle currentBundle = Platform.getBundle("roadblock.bin.mac_x86");

			URL prismUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/prism/bin/prism"), Collections.<String, String> emptyMap()));
			BinaryPathProvider.getInstance().setPrismPath(prismUrl.getPath());

			URL nuSmvUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/nuxmv/nuXmv"), Collections.<String, String> emptyMap()));
			BinaryPathProvider.getInstance().setNuSmvPath(nuSmvUrl.getPath());

			URL ngssBinaryUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/ngss/ngss"), Collections.<String, String> emptyMap()));
			URL ngssUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/ngss/ngssWrapper.sh"), Collections.<String, String> emptyMap()));
			BinaryPathProvider.getInstance().setNgssPath(ngssUrl.getPath());

			URL imagesPath = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/atgc/resources/images/"), Collections.<String, String> emptyMap()));
			BinaryPathProvider.getInstance().setImagesPath(imagesPath.getPath());

			URL codonUsageDbPath = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/atgc/resources/db/codonUsage.db"), Collections.<String, String> emptyMap()));
			BinaryPathProvider.getInstance().setCodonUsageDbPath(codonUsageDbPath.getPath());

			URL partRegistryDbPath = FileLocator
					.resolve(FileLocator.find(currentBundle, new Path("resources/atgc/resources/db/partRegistry.db"), Collections.<String, String> emptyMap()));
			BinaryPathProvider.getInstance().setPartRegistryDbPath(partRegistryDbPath.getPath());

			URL restrictionEnzymesDbPath = FileLocator
					.resolve(FileLocator.find(currentBundle, new Path("resources/atgc/resources/db/restrictionEnzymes.db"), Collections.<String, String> emptyMap()));
			BinaryPathProvider.getInstance().setRestrictionEnzymesDbPath(restrictionEnzymesDbPath.getPath());
			
			URL rbsCalculatorPath = FileLocator
					.resolve(FileLocator.find(currentBundle, new Path("resources/atgc/resources/RBSCalculator/"), Collections.<String, String> emptyMap()));
			BinaryPathProvider.getInstance().setRbsCalculatorPath(rbsCalculatorPath.getPath());

			URL sqlite4JavaUrl = FileLocator.resolve(FileLocator.find(currentBundle, new Path("resources/atgc/resources/sqlite4java/"), Collections.<String, String> emptyMap()));
			
			setBinaryFullPermissions(BinaryPathProvider.getInstance().getPrismPath());
			setBinaryFullPermissions(BinaryPathProvider.getInstance().getNuSmvPath());
			setBinaryFullPermissions(ngssBinaryUrl.getPath());
			setBinaryFullPermissions(BinaryPathProvider.getInstance().getNgssPath());

			// permissions for ATGC
			Set<String> programs = new HashSet<String>();
			programs.add("resources/atgc/atgcWrapper.sh");
			programs.add("resources/atgc/resources/RBSCalculator/fakeRBSCalculator.py");
			programs.add("resources/atgc/resources/RBSCalculator/NuPACK");
			programs.add("resources/atgc/resources/RBSCalculator/RBS_Calculator");
			programs.add("resources/atgc/resources/RBSCalculator/RBSDesignerWrapper.sh");
			programs.add("resources/atgc/resources/RBSCalculator/RBS_MC_Design");
			programs.add("resources/atgc/resources/RBSCalculator/Run_RBS_Calculator");
			programs.add("resources/atgc/resources/RBSCalculator/Run_RBS_Design");
			programs.add("resources/atgc/resources/RBSCalculator/ViennaRNA");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/complexes");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/concentrations");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/count");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/defect");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/design");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/distributions");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/energy");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/mfe");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/pairs");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/pfunc");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/prob");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/sample");
			programs.add("resources/atgc/resources/RBSCalculator/nupack3.0.4/bin/subopt");

			for (String filename : programs) {
				setBinaryFullPermissions(FileLocator.resolve(FileLocator.find(currentBundle, new Path(filename), Collections.<String, String> emptyMap())).getPath());
			}
			
			System.setProperty("sqlite4java.library.path", sqlite4JavaUrl.getPath());
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
