package com.dsa.april12th;

public class SumOfEveneNumbers {

	public static int getSumOfEvenNumbers(int arr[]) {
		int sum = 0;
		boolean hasNegative = false;
		boolean hasZero = false;
		boolean hasNegativeZero = false;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				hasNegative = true;
				if (hasZero) {
					hasNegativeZero = true;
					break;
				}
			} else if (arr[i] == 0) {
				hasZero = true;
				if (hasNegative) {
					hasNegativeZero = true;
					break;

				}
			} else if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		if (hasNegativeZero) {
			return -1;
		} else if (hasNegative) {
			return -1;
		} else if (hasZero) {
			return -2;
		} else if (arr.length == 0) {
			return -3;
		} else {
			return sum;
		}

	}

	public static void main(String[] args) {

		int arr[] = { 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		int sum = getSumOfEvenNumbers(arr);
		System.out.println(sum);

	}

}
