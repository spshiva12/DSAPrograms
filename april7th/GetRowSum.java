package com.dsa.april7th;

import java.util.Arrays;

public class GetRowSum {

	public static int[] getRowSum(int[][] arr) {
		if (arr == null || arr.length != 3 || arr[0].length != 3) {
			return null;
		}

		int[] rowSum = new int[3];
		for (int i = 0; i < 3; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += arr[i][j];
			}
			rowSum[i] = sum;
		}
		return rowSum;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int rowSum[] = getRowSum(arr);
		if (rowSum != null) {
			System.out.println(Arrays.toString(rowSum));
		}
	}

}
