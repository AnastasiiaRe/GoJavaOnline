package src.moduleten;

import java.io.FileWriter;
import java.io.IOException;

import static src.modulenine.CipherCaesarMain.cipherCaesar;

/**
 * Save Text in file
 */
public class SaveText {
	public static void main(String[] args) throws IOException {
		String message = "It is a task for Module ten and I did it!";
		String encryptedMessage = cipherCaesar(message, 3);
		String decryptedMessage = cipherCaesar(encryptedMessage, -3);
		try (FileWriter writer = new FileWriter("MyFileForTextMessage.txt", false)) {
			writer.write(encryptedMessage);
		}
		try (FileWriter writerDec = new FileWriter("MyFileForDecryptedMessage.txt", false)) {
			writerDec.write(decryptedMessage);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
