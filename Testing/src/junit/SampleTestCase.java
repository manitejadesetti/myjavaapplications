package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTestCase {
    Arithmetic am = new Arithmetic();
	@Test
	public void testAddPositive() {
		assertEquals(8,am.add(5, 3));
	}
	@Test
	public void testAddNegative() {
		assertNotEquals(4,am.add(20, 20));
	}

}
