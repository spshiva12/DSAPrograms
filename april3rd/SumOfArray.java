package com.dsa.april3rd;

public class SumOfArray {

	public static int sumOfArray(int arr[]) {
		if (arr.length == 0) {
			return -1;

		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				return -2;
			} else {
				sum += arr[i];
				
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(sumOfArray(arr));
	}

}
