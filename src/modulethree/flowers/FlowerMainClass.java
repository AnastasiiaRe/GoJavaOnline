package src.modulethree.flowers;

/**
 * FlowerMainClass
 */
public class FlowerMainClass {

	public static void main(String[] args) {
		BunchOfFlowers bunchOfFlowers = new BunchOfFlowers();

		bunchOfFlowers.addFlowerToBunch(new Aster());
		bunchOfFlowers.addFlowerToBunch(new Chamomile());
		bunchOfFlowers.addFlowerToBunch(new Rose());
		bunchOfFlowers.addFlowerToBunch(new RoseBush());
		bunchOfFlowers.addFlowerToBunch(new Tulip());


		System.out.println(bunchOfFlowers.toString());
	}
}
