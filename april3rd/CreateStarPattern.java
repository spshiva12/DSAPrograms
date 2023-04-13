package com.dsa.april3rd;

public class CreateStarPattern {

	public static String createStarPattern(int rows) {
		if (rows < 1) {
			return "-1";
		} else if (rows == 1) {
			return "*";
		}

		StringBuilder pattern = new StringBuilder();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				pattern.append("* ");
			}
			pattern.append("\n");
		}

		return pattern.toString();
	}

	public static void main(String[] args) {
		System.out.println(createStarPattern(-5));
		System.out.println();
		System.out.println(createStarPattern(0));
		System.out.println();
		System.out.println(createStarPattern(1));
		System.out.println();
		System.out.println(createStarPattern(3));
	}

}
