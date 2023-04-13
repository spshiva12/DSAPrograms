package com.dsa.april3rd;

public class GetCount {

	public static int getCount(int arr[], int value) {

		if (arr == null || arr.length == 0) {
			return -1;
		}

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 3, 5 };
		System.out.println(getCount(arr1, 3));

		int arr2[] = { 1, 2, 3, 4, 5 };
		System.out.println(getCount(arr2, 3));

		int arr3[] = {};
		System.out.println(getCount(arr3, 1));
	}

}
