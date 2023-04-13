package com.dsa.april13th;

public class KaprekarNumber {

	public static String isKaprekarNumber(int num) {
		if (num < 0) {
			return "-1";
		} else if (num == 0) {
			return "-2";
		} else {
			int square = num * num;
			String squareStr = String.valueOf(square);
			int length = squareStr.length();
			for (int i = 1; i < length; i++) {
				int left = Integer.parseInt(squareStr.substring(0, i));
				int right = Integer.parseInt(squareStr.substring(i));
				if (left + right == num) {
					return "True";
				}
			}
			return "False";
		}
	}

	public static void main(String[] args) {
		System.out.println(isKaprekarNumber(9));
		System.out.println(isKaprekarNumber(297));
		System.out.println(isKaprekarNumber(367));
		System.out.println(isKaprekarNumber(-221));
		System.out.println(isKaprekarNumber(0));
	}

}
