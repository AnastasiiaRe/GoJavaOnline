package test.finaltask;

import org.junit.Before;
import org.junit.Test;
import src.finaltask.Point;

import static org.junit.Assert.assertTrue;
import static src.finaltask.CalcIntegral.generateRandomDouble;
import static src.finaltask.RectanglesMethods.leftRectanglesMethod;
import static src.finaltask.RectanglesMethods.rightRectanglesMethod;

public class RectanglesMethodsTest {
	private Point[] points;
	private int pointsCount;
	private double result;

	@Before
	public void setUp() throws Exception {
		pointsCount = 50;
		points = new Point[pointsCount];

	}

	@Test
	public void testLeftRectanglesMethod() throws Exception {
		for (int i = 0; i < pointsCount; i++) {
			points[i] = new Point(generateRandomDouble(), generateRandomDouble());
		}
		result = Double.parseDouble(leftRectanglesMethod(pointsCount, points));
		System.out.println(result);
		assertTrue("Result is not correct", result != 0);
	}

	@Test
	public void testRightRectanglesMethod() throws Exception {
		for (int i = 0; i < pointsCount; i++) {
			points[i] = new Point(generateRandomDouble(), generateRandomDouble());
		}
		result = Double.parseDouble(rightRectanglesMethod(pointsCount, points));
		System.out.println(result);
		assertTrue("Result is not correct", result != 0);
	}
}