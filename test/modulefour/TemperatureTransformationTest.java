package test.modulefour;

import org.junit.Before;
import org.junit.Test;
import src.modulefour.TemperatureTransformation;

import static org.junit.Assert.assertEquals;

public class TemperatureTransformationTest {
	private TemperatureTransformation temperatureTransformation;
	private String result;

	@Before
	public void setUp() throws Exception {
		temperatureTransformation = new TemperatureTransformation();
	}

	@Test
	public void testTransformToCelsius() throws Exception {
		final int degree = 32;
		result = temperatureTransformation.transformToCelsius(degree);
		String formulaResult = String.valueOf((degree - 32) * 5 / 9);

		assertEquals("Result is not correct", formulaResult, result);
	}

	@Test
	public void testTransformToFahrenheit() throws Exception {
		final int degree = 25;
		result = temperatureTransformation.transformToFahrenheit(degree);
		String formulaResult = String.valueOf((degree * 9 / 5) + 32);

		assertEquals("Result is not correct", formulaResult, result);
	}
}