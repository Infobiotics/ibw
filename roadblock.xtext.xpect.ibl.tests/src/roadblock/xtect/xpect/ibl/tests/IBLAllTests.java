package roadblock.xtect.xpect.ibl.tests;

import roadblock.xtext.xpect.ibl.tests.generator.IBLGenerator;
import roadblock.xtext.xpect.ibl.tests.validation.IBLValidation;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({
/*    */IBLGenerator.class, 
		IBLValidation.class,
})
@RunWith(Suite.class)

public class IBLAllTests {

}
