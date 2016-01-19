package src.modulethree.musicinstruments;

/**
 * Guitar
 */
public class Guitar implements MusicInstrument, Comparable {

	@Override
	public String toString() {
		return "Guitar";
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
