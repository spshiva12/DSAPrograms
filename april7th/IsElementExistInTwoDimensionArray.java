package com.dsa.april7th;

public class IsElementExistInTwoDimensionArray {

	public static boolean isElementExist(int arr[][], int searchVal) {

		if (arr == null) {
			return (Boolean) null;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == searchVal) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 1, 8, 3, 5 }, { 1, 2, 4 } };
		int searchVal1 = 8;
		System.out.println(isElementExist(arr, searchVal1));

		int searchVal2 = 6;
		System.out.println(isElementExist(arr, searchVal2));

		int[][] arrNull = null;
		System.out.println(isElementExist(arrNull, searchVal1));

	}
}
