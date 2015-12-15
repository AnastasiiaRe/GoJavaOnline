package musicInstruments;

import java.util.ArrayList;
import java.util.List;

/**
 * MusicShop
 */
public class MusicShop {

	private List<MusicInstrument> musicInstruments;

	public MusicShop() {
		musicInstruments = new ArrayList<MusicInstrument>();
	}

	public void addMusicInstrument(MusicInstrument instrument) {
		musicInstruments.add(instrument);
	}

	@Override
	public String toString() {
		String description = "There are ";
		for (MusicInstrument instrument : musicInstruments) {
			description += instrument.toString();
		}
		return description + "in my Music shop";
	}
}
