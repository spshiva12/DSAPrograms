package com.dsa.getnumbers;

public class GetNumbersInrange {

	public static String getNumbersInRange(int start, int end, int step) {
		if (start <= 0 || end <= 0 || step <= 0) {
			return "-1";
		} else if (start == end) {
			return "-2";
		} else if (start > end) {
			return "-3";
		} else {
			String result = "";
			for (int i = start + step; i < end; i += step) {
				result += i + " ";
			}
			return result.trim();
		}
	}

	public static void main(String[] args) {
		System.out.println(getNumbersInRange(10, 30, 2)); // 11 13 15 17 19 21 23 25 27 29
		System.out.println(getNumbersInRange(-1, 5, 1)); // -1
		System.out.println(getNumbersInRange(10, 10, 2)); // -2
		System.out.println(getNumbersInRange(5, 2, 1)); // -3

	}

}
