package src.musicInstruments;

/**
 * MusicInstrument
 */
public abstract class MusicInstrument {

	@Override
	public String toString() {
		return "I am a " + this.getClass() + " ";
	}
}
