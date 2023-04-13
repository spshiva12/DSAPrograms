package com.dsa.april6th;

public class EncryptText {

	static String plainText = "abcdefghijklmnopqrstuvwxyz";
	static String cipherText = "zyxwvutsrqponmlkjihgfedcba";

	public static String encrypt(String input) {
		if (!input.matches("^[a-z]+$")) {
			return null;
		}

		String output = "";
		for (int i = 0; i < input.length(); i++) {
			int index = plainText.indexOf(input.charAt(i));
			output += cipherText.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "abc";
		System.out.println(encrypt(input));
	}

}
