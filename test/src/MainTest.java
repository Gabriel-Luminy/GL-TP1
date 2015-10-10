import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(JUnit4.class)

public class MainTest extends TestCase {

	
	@Test
	public void test() throws Exception {
		assertEquals(5, Main.additionner(2, 3));
		assertEquals(7, Main.additionner(4, 3));
		assertEquals(10, Main.additionner(7, 3));
		
	}
	


}
