package roadblock.biocompiler.util

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.core.internal.preferences.Base64
import roadblock.bin.BinaryPathProvider

// base 64 encoding of the images, used for standalone webpages.
class EncodedImages {

	// encode a file in base64
	def String encodeFile(String path, String filename) throws IOException 
	{
		Base64::encode(Files.readAllBytes(Paths.get(path + filename))).map[it as char].join
	}

	val pathToImages = BinaryPathProvider.instance.imagesPath;

	val public promoter = encodeFile(pathToImages, 'promoter.png')
	val public promoterReversed = encodeFile(pathToImages, 'promoterReversed.png')
	val public rbs = encodeFile(pathToImages, 'rbs.png')
	val public rbsReversed = encodeFile(pathToImages, 'rbsReversed.png')
	val public gene = encodeFile(pathToImages, 'cds.png')
	val public geneReversed = encodeFile(pathToImages, 'cdsReversed.png')
	val public cloningsite = encodeFile(pathToImages, 'cloningSite.png')
	val public cloningsiteReversed = encodeFile(pathToImages, 'cloningSiteReversed.png')
	val public terminator = encodeFile(pathToImages, 'terminator.png')
	val public terminatorReversed = encodeFile(pathToImages, 'terminatorReversed.png')
}