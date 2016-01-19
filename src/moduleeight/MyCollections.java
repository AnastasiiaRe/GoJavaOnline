package src.moduleeight;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * MyCollections
 */
public class MyCollections extends PrintCollections {

	public static void main(String[] args) {
		Integer[] intArray = {54, 10, 2, 52, 120};
		ArrayList<Integer> intArrayList = new ArrayList<Integer>(Arrays.asList(intArray));

		System.out.println("Print ArrayList as a table");
		printCollectionAsTable(intArrayList);

		intArrayList.add(33);

		System.out.println("Print ArrayList as a table after adding new element");
		printCollectionAsTable(intArrayList);
	}
}
