package com.dsa.getnaturalnumbers;

public class GetNaturalnumbers {

	public static String getNaturalNumbers(int a, int b) {
		if (a <= 0 || b <= 0) {
			return "-2";
		} else if (a > b) {
			return "-1";
		} else {
			int i = a;
			String result = "";
			while (i <= b) {
				result += i + " ";
				i++;
			}
			return result.trim();
		}
	}

	public static void main(String[] args) {
		System.out.println(getNaturalNumbers(1, 10));
		System.out.println(getNaturalNumbers(5, 7));
		System.out.println(getNaturalNumbers(-1, 4)); // -1
		System.out.println(getNaturalNumbers(0, 4));

	}

}
