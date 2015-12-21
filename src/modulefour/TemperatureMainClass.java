package src.modulefour;

public class TemperatureMainClass {

	public static void main(String[] args) {
		TemperatureTransformation degree = new TemperatureTransformation();

		System.out.println("Degree in Celsius is " + degree.transformToCelsius(95));
		System.out.println("Degree in Fahrenheit is " + degree.transformToFahrenheit(20));
	}
}
