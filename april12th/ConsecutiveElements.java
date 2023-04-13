package com.dsa.april12th;

public class ConsecutiveElements {

	public static boolean containsConsecutiveElements(int[] arr, int target) {
		int sum = arr[0];
		int start = 0;
		for (int i = 1; i <= arr.length; i++) {
			while (sum > target && start < i - 1) {
				sum = sum - arr[start];
				start++;
			}
			if (sum == target) {
				return true;
			}
			if (i < arr.length) {
				sum = sum + arr[i];
			}
		}
		return false;
	}

	public static int validateInputs(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				return -2;
			}
		}
		if (target <= 0) {
			return -3;
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int target1 = 8;
		System.out.println(containsConsecutiveElements(arr1, target1));

		int[] arr2 = { 1, 3, 5, 7, 9 };
		int target2 = 15;
		System.out.println(containsConsecutiveElements(arr2, target2));

		int[] arr3 = { 1, 3, 5, 7, 9 };
		int target3 = 10;
		System.out.println(containsConsecutiveElements(arr3, target3));

		int[] arr4 = {};
		int target4 = 15;
		System.out.println(validateInputs(arr4, target4));

		int[] arr5 = { 1, 3, -5, 7, 9 };
		int target5 = 15;
		System.out.println(validateInputs(arr5, target5));

		int[] arr6 = { 1, 3, 5, 0, 9 };
		int target6 = 15;
		System.out.println(validateInputs(arr6, target6));
		int[] arr7 = { 1, 3, 5, 7, 9 };
		int target7 = 0;
		System.out.println(validateInputs(arr7, target7));

		int[] arr8 = { 1, 3, 5, 7, 9 };
		int target8 = -15;
		System.out.println(validateInputs(arr8, target8));
	}

}
