package com.dsa.april3rd;

public class NumberPattern {

	public static String numberPattern4(int rows) {
		if (rows < 0) {
			return "-1";
		}

		if (rows == 0) {
			return "-2";
		}

		String pattern = "";

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				pattern += i * j + " ";
			}
			pattern += "\n";
		}

		return pattern;
	}

	public static void main(String[] args) {
		int rows = 4;
		System.out.println(numberPattern4(rows));
	}

}
