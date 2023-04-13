package com.dsa.april7th;

public class DiagonalSum {

	public static int getDiagonalSum(int[][] arr) {
		if (arr == null || arr.length != 3 || arr[0].length != 3) {
			return -1;
		}
		int diagonalSum = 0;
		for (int i = 0; i < 3; i++) {
			diagonalSum += arr[i][i];
		}
		return diagonalSum;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 1, 8, 3 }, { 1, 2, 4 } };

		int diagonalSum = getDiagonalSum(arr);
		System.out.println(diagonalSum);
	}

}
