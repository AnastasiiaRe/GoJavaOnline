package src.modulefour;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Distance {

	public String distanceCalculator(int x1, int y1, int x2, int y2) {
		NumberFormat formatter = new DecimalFormat("#0.00");
		int xDiff = x2 - x1;
		double xDiffPow = Math.pow(xDiff, 2);
		int yDiff = y2 - y1;
		Double yDiffPow = Math.pow(yDiff, 2);
		double sum = xDiffPow + yDiffPow;
		double distance = Math.sqrt(sum);
		return formatter.format(distance);
	}
}
