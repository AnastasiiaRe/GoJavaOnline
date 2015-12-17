package src.flowers;

import java.util.ArrayList;
import java.util.List;

/**
 * BunchOfFlowers
 */
public class BunchOfFlowers {
	private List<Flower> bunchOfFlowers;

	public BunchOfFlowers() {
		bunchOfFlowers = new ArrayList<Flower>();
	}

	public void addFlowerToBunch(Flower flower) {
		bunchOfFlowers.add(flower);
	}

	@Override
	public String toString() {
		String description = "My bunch contains: ";

		for (Flower flower : bunchOfFlowers) {
			description += flower.toString();
		}

		return description;
	}
}
