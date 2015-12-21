package src.modulethree.musicinstruments;

/**
 * MusicInstrumentsMainClass
 */
public class MusicInstrumentsMainClass {

	public static void main(String[] args) {
		MusicShop myShop = new MusicShop();

		myShop.addMusicInstrument(new Guitar());
		myShop.addMusicInstrument(new Piano());
		myShop.addMusicInstrument(new Trumpet());

		System.out.println(myShop.toString());
	}
}
