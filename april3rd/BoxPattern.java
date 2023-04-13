package com.dsa.april3rd;

public class BoxPattern {

	public static String createBoxPattern(int rows, int columns) {
		if (rows < 0 || columns < 0) {
			return "-1";
		}

		if (rows == 0 || columns == 0) {
			return "-2";
		}

		String box = "";

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				if (i == 1 || i == rows || j == 1 || j == columns) {
					box += "* ";
				} else {
					box += "  ";
				}
			}

			box += "\n";
		}

		return box;
	}

	public static void main(String[] args) {
		int r = 4, c = 5;
		System.out.println(createBoxPattern(r, c));
	}

}
