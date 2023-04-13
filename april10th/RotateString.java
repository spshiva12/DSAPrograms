package com.dsa.april10th;

public class RotateString {

	public static String rotate(String s, int no_of_positions) {
		// perform left rotation
		String rotated = s;
		for (int i = 0; i < no_of_positions; i++) {
			String lastChar = rotated.substring(rotated.length() - 1);
			System.out.println(lastChar);
			String remainingChars = rotated.substring(0, rotated.length() - 1);
			System.out.println(remainingChars);
			rotated = lastChar + remainingChars;
		}

		// move last character to first position
		String lastChar = rotated.substring(rotated.length() - 1);
		String remainingChars = rotated.substring(0, rotated.length() - 1);
		rotated = lastChar + remainingChars;

		return rotated;
	}

	public static void main(String[] args) {
		String s = "talent";
		int n = 1;

		System.out.println(rotate(s, n));
	}

}
