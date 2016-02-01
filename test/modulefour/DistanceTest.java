package test.modulefour;

import org.junit.Test;
import src.modulefour.Distance;

import static org.junit.Assert.assertEquals;

public class DistanceTest {

	@Test(timeout = 1000)
	public void testDistanceCalculator() throws Exception {
		final int x1 = 30;
		final int y1 = 50;
		final int x2 = 60;
		final int y2 = 70;
		Distance distance = new Distance();
		final String result = distance.distanceCalculator(x1, y1, x2, y2);

		assertEquals("Result is not correct", "36.06", result);
	}
}