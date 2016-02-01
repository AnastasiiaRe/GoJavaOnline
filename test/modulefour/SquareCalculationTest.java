package test.modulefour;

import org.junit.Before;
import org.junit.Test;
import src.modulefour.SquareCalculation;

import static org.junit.Assert.assertEquals;

public class SquareCalculationTest {

	private SquareCalculation squareCalculation;

	@Before
	public void setUp() throws Exception {
		squareCalculation = new SquareCalculation();
	}

	@Test(timeout = 1000)
	public void testTriangleSquare() throws Exception {
		final double base = 30.50;
		final double height = 15.23;
		String result = squareCalculation.triangleSquare(base, height);

		assertEquals("Triangle square is not correct", "232.26", result);
	}

	@Test(timeout = 1000)
	public void testRectangleSquare() throws Exception {
		final int a = 10;
		final int b = 20;
		double result = squareCalculation.rectangleSquare(a, b);

		assertEquals("Rectangle square is not correct", a * b, result, 0);

	}

	@Test(timeout = 1000)
	public void testCircleSquare() throws Exception {
		final double semicircle = 35.50;
		final double radius = 15.23;
		String result = squareCalculation.circleSquare(semicircle, radius);

		assertEquals("Rectangle square is not correct", "540.7", result);
	}
}