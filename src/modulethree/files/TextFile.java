package src.modulethree.files;
/**
 * TextFile
 */
public class TextFile implements File, Comparable {

	@Override
	public String toString() {
		return "TextFile";
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
