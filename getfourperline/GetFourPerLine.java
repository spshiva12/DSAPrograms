package com.dsa.getfourperline;

public class GetFourPerLine {

	public static String getFourPerLine(int num) {
		if (num <= 0) {
			return "-2";
		} else if (num > 99) {
			return "-3";
		} else {
			StringBuilder result = new StringBuilder();
			for (int i = 1; i <= num; i++) {
				result.append(i).append(" ");
				if (i % 4 == 0) {
					result.append("\n");
				}
			}
			return result.toString().trim();
		}
	}

	public static void main(String[] args) {
		System.out.println(getFourPerLine(12));
		System.out.println(getFourPerLine(-1));
		System.out.println(getFourPerLine(100));
		System.out.println(getFourPerLine(10));

	}

}
