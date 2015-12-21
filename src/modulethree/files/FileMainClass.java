package src.modulethree.files;

/**
 * MainClass
 */
public class FileMainClass {
	public static void main(String[] args) {
		Directory directory = new Directory();

		directory.addFileToList(new AudioFile());
		directory.addFileToList(new ImageFile());
		directory.addFileToList(new TextFile());

		System.out.println(directory.toString());
	}
}
