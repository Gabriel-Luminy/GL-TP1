import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {

	@Test
	public void test() throws Exception {
		assertEquals(5, Main.additionner(2, 3));
		assertEquals(10, Main.additionner(10, 0));
			
	}

}
