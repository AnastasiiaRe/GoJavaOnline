package test.modulefive;

import org.junit.Before;
import org.junit.Test;
import src.modulefive.ArrayClass;

import static org.junit.Assert.assertEquals;

public class ArrayClassTest {
	private ArrayClass arrayClass;
	private int result;

	@Before
	public void setUp() throws Exception {
		arrayClass = new ArrayClass();
	}

	@Test(timeout = 1000)
	public void testMaxValue() throws Exception {
		final int[] intsArray = {15, 22, 1, 32, 5};
		result = arrayClass.maxValue(intsArray);

		assertEquals("Result is not correct", 32, result);
	}

	@Test(timeout = 1000)
	public void testMinValue() throws Exception {
		final int[] intsArray = {25, 44, 0, 15, 46};
		result = arrayClass.minValue(intsArray);

		assertEquals("Result is not correct", 0, result);
	}
}