package src.modulethree.flowers;

public class NotSuitableFlowerForBunchException extends Exception {
	private Object flower;

	public NotSuitableFlowerForBunchException(final Object flower) {
		this.flower = flower;
	}

	public Object getFlower() {
		return flower;
	}
}
