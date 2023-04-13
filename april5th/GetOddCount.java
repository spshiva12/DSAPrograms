package com.dsa.april5th;

public class GetOddCount {

	public static String getOddCount(int arr[]) {

		if (arr == null) {
			return "-4";
		}
		if (arr.length != 5) {
			return "-1";
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				return "-2";
			}

		}

		int sum = 0;
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum++;
			} else {
				return "-3";
			}
		}
		result += sum;
		return result;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 8, 20, 2 };
		System.out.println(getOddCount(arr));
	}
}
