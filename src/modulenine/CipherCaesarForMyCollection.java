package src.modulenine;

import src.modulethree.files.AudioFile;
import src.modulethree.files.File;
import src.modulethree.files.ImageFile;
import src.modulethree.files.TextFile;

import java.util.ArrayList;
import java.util.List;

import static src.modulenine.CipherCaesarMain.cipherCaesar;

/**
 * Caesar Cipher
 */
public class CipherCaesarForMyCollection {
	public static void main(String[] args) {
		List<File> myList = new ArrayList<File>();
		myList.add(new AudioFile());
		myList.add(new ImageFile());
		myList.add(new TextFile());
		String objectsInMyList = myList.toString();
		System.out.println("My list has the following objects:" + objectsInMyList);

		String encrypted = cipherCaesar(objectsInMyList, 3);
		System.out.println("My encrypted objects in the list: " + encrypted);
		String decrypted = cipherCaesar(encrypted, -3);
		System.out.println("My decrypted objects in the list: " + decrypted);
	}
}
