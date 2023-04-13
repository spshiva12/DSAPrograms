package com.dsa.april5th;

public class GetOddSum {

	public static int getOddSum(int[] arr) {
		if (arr == null) {
			return -4;
		}

		if (arr.length != 5) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				return -2;
			}
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {	
				sum += arr[i];
			}
		}

		if (sum == 0) {
			return -3;
		}

		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5 };
		System.out.println(getOddSum(arr));
	}

}
