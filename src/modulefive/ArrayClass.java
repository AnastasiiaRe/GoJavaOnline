package src.modulefive;

public class ArrayClass {

	public int maxValue(int[] intsArray) {
		int maxVal = intsArray[0];
		for (int anIntsArray : intsArray) {
			if (anIntsArray > maxVal) {
				maxVal = anIntsArray;
			}
		}
		return maxVal;
	}

	public int minValue(int[] intsArray) {
		int minVal = intsArray[0];
		for (int anIntsArray : intsArray) {
			if (anIntsArray < minVal) {
				minVal = anIntsArray;
			}
		}
		return minVal;
	}
}
