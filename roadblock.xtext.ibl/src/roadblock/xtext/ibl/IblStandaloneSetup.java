/*
* generated by Xtext
*/
package roadblock.xtext.ibl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class IblStandaloneSetup extends IblStandaloneSetupGenerated{

	public static void doSetup() {
		new IblStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
