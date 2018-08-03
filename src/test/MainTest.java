package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void fibTest() {
		assertEquals(8, Main.fib(6));
	}

}
