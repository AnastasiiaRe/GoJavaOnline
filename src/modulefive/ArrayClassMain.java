package src.modulefive;

		import java.util.Arrays;
		import java.util.Scanner;

public class ArrayClassMain {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		final ArrayClass arrayClass = new ArrayClass();

		System.out.println("Please, choose method:");

		final Integer command = Integer.valueOf(scanner.nextLine());

		int[] arrayOfInts = {5, 4, 10, 1, 6};

		switch (command) {
			case 1:
				int min = Arrays.stream(arrayOfInts).min().getAsInt();
				int max = Arrays.stream(arrayOfInts).max().getAsInt();

				System.out.println("Min = " + min);
				System.out.println("Max = " + max);
				break;
			case 2:
				Arrays.sort(arrayOfInts);

				System.out.println("Min = " + arrayOfInts[0]);
				System.out.println("Max = " + arrayOfInts[4]);
				break;
			case 3:
				System.out.println("Max = " + arrayClass.minValue(arrayOfInts));  //it's better to use here separate methods
				System.out.println("Max = " + arrayClass.maxValue(arrayOfInts));  //instead of putting all code here
		}
	}
}
