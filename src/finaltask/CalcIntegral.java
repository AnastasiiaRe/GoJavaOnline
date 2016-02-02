package src.finaltask;

import java.util.Random;

import static src.finaltask.RectanglesMethods.leftRectanglesMethod;
import static src.finaltask.RectanglesMethods.rightRectanglesMethod;

public class CalcIntegral {

	public static void main(String[] args) {

		int pointsCount = generateRandomInt(50);
		System.out.println("Amount of points is: " + pointsCount);
		Point[] points = new Point[pointsCount];
		// getting points' coordinates
		for (int i = 0; i < pointsCount; i++) {
			points[i] = new Point(generateRandomDouble(), generateRandomDouble());
		}

		String integralValueFirst = leftRectanglesMethod(pointsCount, points);
		System.out.println("Integral value is: " + integralValueFirst + " (by using left rectangles method)");

		String integralValueSecond = rightRectanglesMethod(pointsCount, points);
		System.out.println("Integral value is: " + integralValueSecond + " (by using right rectangles method)");
	}


	private static int generateRandomInt(int maxNumber) {
		return new Random().nextInt(maxNumber);
	}

	public static double generateRandomDouble() {
		return new Random().nextDouble();
	}
}
