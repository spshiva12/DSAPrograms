package com.dsa.april6th;

public class DecryptText {

	static String plainText = "abcdefghijklmnopqrstuvwxyz";
	static String cipherText = "zyxwvutsrqponmlkjihgfedcba";

	public static String decrypt(String input) {
		if (!input.matches("^[a-z]+$")) {
			return null;
		}

		String output = "";
		for (int i = 0; i < input.length(); i++) {
			int index = cipherText.indexOf(input.charAt(i));
			output += plainText.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "zyx";
		System.out.println(decrypt(input));
	}

}
