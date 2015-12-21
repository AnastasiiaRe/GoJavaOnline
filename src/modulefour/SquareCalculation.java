package src.modulefour;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SquareCalculation {

	private double square;

	public String triangleSquare(double base, double height) {
		NumberFormat formatter = new DecimalFormat("#0.00");
		square = (base * height) / 2;
		return formatter.format(square);
	}

	public double rectangleSquare(int aSide, int bSide) {
		return square = aSide * bSide;
	}

	public String circleSquare(double semicircle, double radius) {
		NumberFormat formatter = new DecimalFormat("#0.0");
		square = semicircle * radius;
		return formatter.format(square);
	}
}
