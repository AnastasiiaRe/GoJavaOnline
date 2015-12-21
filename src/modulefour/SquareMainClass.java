package src.modulefour;

public class SquareMainClass {

	public static void main(String[] args) {
		SquareCalculation area = new SquareCalculation();

		System.out.println("Square of triangle is " + area.triangleSquare(20.5, 10.5));
		System.out.println("Square of rectangle is " + area.rectangleSquare(40, 10));
		System.out.println("Square of circle is " + area.circleSquare(35.5, 12.2));
	}
}
