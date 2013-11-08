/**
 * generated by Xtext
 */
package roadblock.xtext.ibl.generator;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import roadblock.xtext.ibl.ibl.FunctionDefinition;
import roadblock.xtext.ibl.ibl.Model;
import roadblock.xtext.ibl.ibl.RuleDefinition;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class IblGenerator implements IGenerator {
  private /* IblFactory */Object factory;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    throw new Error("Unresolved compilation problems:"
      + "\nIblPackageImpl cannot be resolved to a type."
      + "\nIblFactory cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\ninit cannot be resolved"
      + "\neINSTANCE cannot be resolved"
      + "\ncreateModel cannot be resolved"
      + "\nsetName cannot be resolved");
  }
  
  public void addProcessDefinition(final /* Model */Object emfModel, final FunctionDefinition process) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateProcess cannot be resolved"
      + "\nsetName cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nprocessList cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nruleList cannot be resolved");
  }
  
  public Object populateRule(final RuleDefinition rule) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateRule cannot be resolved"
      + "\nsetName cannot be resolved"
      + "\ncreateMolecule cannot be resolved"
      + "\nsetName cannot be resolved"
      + "\nsetIsBidirectional cannot be resolved"
      + "\nsetForwardRate cannot be resolved"
      + "\nsetReverseRate cannot be resolved");
  }
  
  public String showModelAttributes(final int level, final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public String showModel(final int level, final /* Model */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nprocessList cannot be resolved");
  }
  
  public String showModel(final /* Model */Object model) {
    return this.showModel(1, model);
  }
  
  public String showProcessDefinitionAttributes(final int level, final Process process) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method name is undefined for the type IblGenerator");
  }
  
  public String showProcessDefinition(final int level, final Process process) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method ruleList is undefined for the type IblGenerator");
  }
  
  public String showRuleAttributes(final int level, final /* Rule */Object rule) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method name is undefined for the type IblGenerator"
      + "\nThe method name is undefined for the type IblGenerator"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nname cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nrightHandSide cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nleftHandSide cannot be resolved");
  }
  
  public String showRule(final int level, final /* Rule */Object rule) {
    return this.showRuleAttributes(level, rule);
  }
  
  public static void emfModelToFile(final Model model, final String filename) {
    final Registry reg = Registry.INSTANCE;
    Map<String,Object> _extensionToFactoryMap = reg.getExtensionToFactoryMap();
    final Map<String,Object> m = ((Map<String,Object>) _extensionToFactoryMap);
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    m.put("iblXtextModel", _xMIResourceFactoryImpl);
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    final ResourceSetImpl resSet = _resourceSetImpl;
    URI _createURI = URI.createURI(filename);
    Resource resource = resSet.createResource(_createURI);
    EList<EObject> _contents = resource.getContents();
    _contents.add(model);
    try {
      resource.save(Collections.EMPTY_MAP);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        InputOutput.<String>println("emfModelToFile: something wrong when writing to file");
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static EObject fileToEmfModel(final String filename) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    final ResourceSetImpl resSet = _resourceSetImpl;
    URI _createURI = URI.createURI(filename);
    final Resource resource2 = resSet.getResource(_createURI, true);
    EList<EObject> _contents = resource2.getContents();
    return _contents.get(0);
  }
}
