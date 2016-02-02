package src.finaltask;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RectanglesMethods {
	public static double integralValue = 0.0;
	private final static String PATTERN = "#0.000";

	public static String leftRectanglesMethod(int pointsCount, Point[] points) {
		NumberFormat formatter = new DecimalFormat(PATTERN);
		for (int i = 1; i < pointsCount; i++) {
			integralValue += (points[i].getX() - points[i - 1].getX()) * points[i - 1].getY();
		}
		return formatter.format(integralValue);
	}

	public static String rightRectanglesMethod(int pointsCount, Point[] points) {
		NumberFormat formatter = new DecimalFormat(PATTERN);
		for (int i = 1; i < pointsCount; i++) {
			integralValue += (points[i].getX() - points[i - 1].getX()) * points[i].getY();
		}
		return formatter.format(integralValue);
	}
}
