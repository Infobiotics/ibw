package roadblock.ibw.imports;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.wizards.datatransfer.IImportStructureProvider;

import roadblock.importing.ImportManager;
import roadblock.importing.ImportType;

public class IBLImportStructureProvider implements IImportStructureProvider {

	private ImportManager importManager = ImportManager.getInstance();
	private ImportType importType;
	
	private Set visitedDirs;

	@Override
	public List getChildren(Object element) {
		File folder = (File) element;
		String[] children = folder.list();
		int childrenLength = children == null ? 0 : children.length;
		List result = new ArrayList(childrenLength);

		for (int i = 0; i < childrenLength; i++) {
			File file = new File(folder, children[i]);
			if(isRecursiveLink(file))
				continue;
			result.add(file);
		}

		return result;
	}

	private void initVisitedDirs(){
		if(visitedDirs == null){
			visitedDirs = new HashSet();
		}
	}

	private boolean isRecursiveLink(File childFile) {

		if (childFile.isDirectory()) {
			try {
				String canonicalPath = childFile.getCanonicalPath();
				initVisitedDirs();
				return !visitedDirs.add(canonicalPath);
			} catch (IOException e) {
				IDEWorkbenchPlugin.log(e.getMessage(), e);
			}
		}
		return false;
	}

	@Override
	public InputStream getContents(Object element) {
		try {
			File fileToImport = (File) element;
			String iblModel = importManager.translate(fileToImport.getPath(), importType);
			InputStream contentStream = new ByteArrayInputStream(iblModel.getBytes());
			return contentStream;
		} catch (Exception e) {
			e.printStackTrace();
			IDEWorkbenchPlugin.log(e.getLocalizedMessage(), e);
			return null;
		}
	}

	@Override
	public String getFullPath(Object element) {
		return ((File) element).getPath();
	}

	@Override
	public String getLabel(Object element) {

		//Get the name - if it is empty then return the path as it is a file root
		File file = (File) element;
		String name = file.getName();
		
		int pos = name.lastIndexOf(".");
		if (pos > 0) {
			name = name.substring(0, pos);
		}
		
		if (name.length() == 0) {
			return file.getPath();
		}
		
		return name + ".ibl";
	}

	@Override
	public boolean isFolder(Object element) {
		return ((File) element).isDirectory();
	}

	/**
	 * Clears the visited dir information
	 */
	public void clearVisitedDirs() {
		if(visitedDirs!=null)
			visitedDirs.clear();
	}
	
	public IBLImportStructureProvider(ImportType importType) {
		this.importType = importType;
	}
}
