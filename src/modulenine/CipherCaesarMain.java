package src.modulenine;

/**
 * Caesar Cipher Main Class
 */
public class CipherCaesarMain {
	private static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static char[] specialChars = {' ', '!', '[', ']', ','};

	public static String cipherCaesar(String text, int offset) {
		char[] inputText = text.toCharArray();

		String output = "";

		for (int j = 0; j != inputText.length; j++) {
			if (Character.isUpperCase(inputText[j])) {
				output += Character.toUpperCase(calculateOffset(getIndex(inputText[j]), offset));
			} else {
				output += calculateOffset(getIndex(inputText[j]), offset);
			}
		}
		return output;
	}

	public static char calculateOffset(int index, int offset) {
		if (index >= 50 && index < 900) {
			return specialChars[index - 50];
		}

		if (index + offset < 0) {
			int neIndex = 26 + (index + offset);
			return alphabet[neIndex];
		}
		if (index + offset > 25) {
			int newIndex = (index + offset) - 26;
			return alphabet[newIndex];
		}
		if (index + offset < 25 && index + offset >= 0) {
			return alphabet[index + offset];
		}
		return 'X';
	}

	public static int getIndex(char letter) {
		if (isSpecialChar(letter) != 999) {
			return (isSpecialChar(letter) + 50);
		}
		if (Character.isUpperCase(letter)) {
			letter = Character.toLowerCase(letter);
		}
		for (int i = 0; i != alphabet.length; i++) {
			if (alphabet[i] == letter) {
				return i;
			}
		}
		return 999;
	}

	public static int isSpecialChar(char checkMe) {
		for (int i = 0; i != specialChars.length; i++) {
			if (specialChars[i] == checkMe) {
				return i;
			}
		}
		return 999;
	}
}
