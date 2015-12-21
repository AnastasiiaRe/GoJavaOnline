package src.modulefour;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TemperatureTransformation {

	private int temperature;

	public String transformToCelsius(int degreeF) {
		NumberFormat formatter = new DecimalFormat("#0.00");
		temperature = (degreeF - 32) * 5 / 9;
		return formatter.format(temperature);
	}

	public String transformToFahrenheit(int degreeC) {
		NumberFormat formatter = new DecimalFormat("#0.00");
		temperature = (degreeC * 9 / 5) + 32;
		return formatter.format(temperature);
	}
}
