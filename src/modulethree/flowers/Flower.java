package src.modulethree.flowers;

/**
 * Flower
 */
public abstract class Flower {

	@Override
	public String toString() {
		return "I am a " + this.getClass() + " ";
	}
}
