package src.moduleeight;

import java.util.ArrayList;

/**
 * PrintCollections
 */
public class PrintCollections {

	public static void printCollectionAsTable(ArrayList<Integer> arrayList) {
		System.out.println("Index\tValue");

		for (int element = 0; element < arrayList.size(); element++) {
			System.out.println(element + "\t" + "\t" + arrayList.get(element));
		}
	}
}
