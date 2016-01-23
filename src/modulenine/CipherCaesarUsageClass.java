package src.modulenine;

import static src.modulenine.CipherCaesarMain.cipherCaesar;

/**
 * public class CipherCaesarUsageClass {
 */
public class CipherCaesarUsageClass {

	public static void main(String[] args) {
		String myMessage = "Hello! I am Anastasiia and I love Java!";
		System.out.println("My message to the world: " + myMessage);
		String encrypted = cipherCaesar(myMessage, 3);
		System.out.println("My encrypted message: " + encrypted);
		String decrypted = cipherCaesar(encrypted, -3);
		System.out.println("My decrypted message: " + decrypted);
	}
}
