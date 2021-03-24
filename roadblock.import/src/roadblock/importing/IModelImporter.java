package roadblock.importing;

public interface IModelImporter {

	public String translate(String filename) throws Exception;
	
	public ImportType getTarget();
}
