package com.dsa.april12th;

public class GetNearestMinvalue {

	public static int getNearestMinValue(int arr[]) {
		int min = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				min = arr[i];
			}
		}
		return min - 1;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 5, -23, 24 };
		System.out.println(getNearestMinValue(arr1));
		int arr2[] = { 13, 4, 5, 23, 24 };
		System.out.println(getNearestMinValue(arr2));
		int arr3[] = { 13, 4, 5, 1, 24 };
		System.out.println(getNearestMinValue(arr3));
	}

}
