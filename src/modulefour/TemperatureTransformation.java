package src.modulefour;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TemperatureTransformation {

	private int temperature;
	private final static String PATTERN = "#0.00";      //when we use the same value several times it's better to use  field instead of hard code

	public String transformToCelsius(int degreeF) {
		NumberFormat formatter = new DecimalFormat(PATTERN);
		temperature = (degreeF - 32) * 5 / 9;
		return formatter.format(temperature);
	}

	public String transformToFahrenheit(int degreeC) {
		NumberFormat formatter = new DecimalFormat(PATTERN);
		temperature = (degreeC * 9 / 5) + 32;
		return formatter.format(temperature);
	}
}
