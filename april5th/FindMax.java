package com.dsa.april5th;

public class FindMax {

	public static int findMaxRec(int A[], int n) {

		if (n == 1) {
			return A[0];
		}
		return Math.max(A[n - 1], findMaxRec(A, n - 1));
	}

	public static void main(String args[]) {
		int A[] = { 1, 2, 3, -3, -6, -6 };
		int n = A.length;
		System.out.println(findMaxRec(A, n));
	}
}
