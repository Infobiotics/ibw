package roadblock.biocompiler.tests;

import java.io.File;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteException;
import com.almworks.sqlite4java.SQLiteStatement;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqliteTests {

	@Test
	public void testExample() { // just checking that the libraries and the database are there and sqlite is working.
		String databaseLocation = "resources/partRegistry.db";
		
		assertTrue((new File(databaseLocation)).exists());
		
		SQLiteConnection db = new SQLiteConnection(new File(databaseLocation));
		try {
			if (!db.isOpen()) db.open();
			SQLiteStatement sql = db.prepare("SELECT *FROM partRegistry LIMIT 10");
			int count = 0;
			while(sql.step()) count++;
			assertEquals(10, count);
			sql.dispose();
			
		} catch (SQLiteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.dispose();
	}
	
	
}
