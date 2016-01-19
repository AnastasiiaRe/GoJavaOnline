package src.moduleeight;

import src.modulethree.files.AudioFile;
import src.modulethree.files.ImageFile;
import src.modulethree.files.TextFile;
import src.modulethree.flowers.Aster;
import src.modulethree.flowers.Chamomile;
import src.modulethree.flowers.Rose;
import src.modulethree.flowers.Tulip;
import src.modulethree.musicinstruments.Guitar;
import src.modulethree.musicinstruments.Piano;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Main Ordered List
 */
public class MainOrderedList {

	public static void main(String[] args) {
		TreeMap<String, Double> myList = new TreeMap<String, Double>();

		myList.put("This is " + new AudioFile(), 10.23);
		myList.put("This is " + new TextFile(), 20.45);
		myList.put("This is " + new ImageFile(), 22.1);
		myList.put("This is " + new Aster(), 26.15);
		myList.put("This is " + new Chamomile(), 55.12);
		myList.put("This is " + new Rose(), 9.05);
		myList.put("This is " + new Tulip(), 1.02);
		myList.put("This is " + new Guitar(), 14.14);
		myList.put("This is " + new Piano(), 120.2);

		Set<Map.Entry<String, Double>> set = myList.entrySet();
		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + " with value: ");
			System.out.println(me.getValue());
		}
		System.out.println();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
