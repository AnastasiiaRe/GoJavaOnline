package src.modulethree.files;

/**
 * MainClass
 */
public class FileMainClass {
	public static void main(String[] args) {
		Directory directory = new Directory();
		try {
			directory.addFileToList(new AudioFile());
			directory.addFileToList(new TextFile());
			directory.addFileToList(new ImageFile());
		} catch (RuntimeException e) {
			System.out.println(e);
		}

		System.out.println(directory.toString());
	}
}
