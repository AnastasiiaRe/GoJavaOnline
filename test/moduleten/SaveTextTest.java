package test.moduleten;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static src.modulenine.CipherCaesarMain.cipherCaesar;

public class SaveTextTest {
	private File encFile;
	private File decFile;

	@Before
	public void setUp() throws Exception {
		encFile = new File("MyFileForTextMessage.txt");
		decFile = new File("MyFileForDecryptedMessage.txt");
	}

	@Test
	public void testSaveTextInFile() throws Exception {
		String message = "It is a task for Module ten and I did it!";
		String encryptedMessage = cipherCaesar(message, 3);
		String decryptedMessage = cipherCaesar(encryptedMessage, -3);

		try (FileWriter writer = new FileWriter(encFile, false)) {
			writer.write(encryptedMessage);
		}
		try (FileWriter writerDec = new FileWriter(decFile, false)) {
			writerDec.write(decryptedMessage);
		}

		assertTrue("File with encrypted message was not created", encFile.exists());
		System.out.println("File with encrypted message was created here:" + encFile.getAbsolutePath().toString());
		read(encFile);

		assertTrue("File with decrypted message was not created", decFile.exists());
		System.out.println("File with decrypted message was created here:" + decFile.getAbsolutePath().toString());
		read(decFile);
	}

	public static String read(File fileName) throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();

		try {
			BufferedReader in = new BufferedReader(new FileReader(fileName.getAbsoluteFile()));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append("\n");
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		System.out.println("Message in file is: " + sb.toString());
		return sb.toString();

	}

	@After
	public void tearDown() throws Exception {
		encFile.delete();
		decFile.delete();
	}
}