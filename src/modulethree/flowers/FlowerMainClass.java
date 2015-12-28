package src.modulethree.flowers;

/**
 * FlowerMainClass
 */
public class FlowerMainClass {

	public static void main(String[] args) {
		BunchOfFlowers bunchOfFlowers = new BunchOfFlowers();

		try {
			bunchOfFlowers.addFlowerToBunch(new Aster());
			bunchOfFlowers.addFlowerToBunch(new Chamomile());
			bunchOfFlowers.addFlowerToBunch(new Rose());
			bunchOfFlowers.addFlowerToBunch(new Tulip());
			bunchOfFlowers.addFlowerToBunch(new RoseBush());

		} catch (NotSuitableFlowerForBunchException e1) {
			System.out.println("[Error]: Please, choose another type of flower!");
		}
		System.out.println(bunchOfFlowers.toString());
	}
}
