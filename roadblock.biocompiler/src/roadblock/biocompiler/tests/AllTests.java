package roadblock.biocompiler.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JacopTests.class, SqliteTests.class, PartGatheringTests.class })

public class AllTests {

}