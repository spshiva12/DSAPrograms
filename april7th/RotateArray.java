package com.dsa.april7th;

import java.util.Arrays;

public class RotateArray {

	public static int[] rotate(int arr[], int no_of_positions) {
		if (arr.length == 0) {
			return arr;
		}
		no_of_positions %= arr.length;

		int rotatedArr[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			rotatedArr[i] = arr[(i + arr.length - no_of_positions) % arr.length];

		}

		return rotatedArr;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int n = 2;

		System.out.println(Arrays.toString(rotate(arr, n)));
	}

}
