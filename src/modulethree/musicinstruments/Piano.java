package src.modulethree.musicinstruments;

/**
 * Piano
 */
public class Piano implements MusicInstrument, Comparable {

	@Override
	public String toString() {
		return "Piano";
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
