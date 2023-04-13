package com.dsa.april10th;

public class GetNthTerm {

	public static int getNthTerm(int n) {
		// find the coefficient of the n^2 term
		int secondDiff = 2; // replace with the actual value of the second difference
		int a = secondDiff / 2;

		// find the value of the first term
		int firstTerm = 1; // replace with the actual value of the first term
		int b = firstTerm - a;

		// write the nth term of the sequence
		int nthTerm = a * n * (n - 1) + b * n;

		return nthTerm;
	}

	public static void main(String[] args) {
		int n = 2;

		System.out.println(getNthTerm(n));
	}

}
