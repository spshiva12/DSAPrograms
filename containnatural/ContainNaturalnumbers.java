package com.dsa.containnatural;

public class ContainNaturalnumbers {

	public static String getNumbersInRange(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return "-1";
		}
		if (num1 == num2) {
			return "-2";
		}
		if (num1 > num2) {
			return "-3";
		}
		StringBuilder result = new StringBuilder();
		for (int i = num1; i <= num2; i++) {
			result.append(i).append(" ");
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {
		int n1 = 10, n2 = 10;
		System.out.println(getNumbersInRange(n1, n2));
	}

}
