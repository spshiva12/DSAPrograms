package com.dsa.april5th;

import java.util.Arrays;

public class GetIncreaseDecrease {

	public static int[] getIncreaseDecrease(int n) {
		if (n <= 1 || n > 20) {
			return null;
		}
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		Arrays.sort(array);
		for (int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i - 1];
			array[n - i - 1] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		int n = 8;
		System.out.println(Arrays.toString(getIncreaseDecrease(n)));
	}

}
