package test.modulenine;

import org.junit.Test;
import src.modulenine.CipherCaesarMain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CipherCaesarMainTest {

	@Test
	public void testCipherCaesar() throws Exception {
		String text = "This text for ciphering";
		CipherCaesarMain cipherCaesar = new CipherCaesarMain();

		String encrypted = cipherCaesar.cipherCaesar(text, 3);

		assertNotEquals("Cipher does not work", text, encrypted);

		String decrypted = cipherCaesar.cipherCaesar(encrypted, -3);
		assertEquals("Deciphering does not work", text, decrypted);
	}

}