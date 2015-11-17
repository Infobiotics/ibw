package roadblock.modelchecking.ui.model;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import roadblock.emf.ibl.Ibl.IProperty;
import roadblock.emf.ibl.Ibl.Model;

public class PropertyTreeData {

	public Model model;

	public Map<IProperty, EObject> semanticEntityByProperty;
}
