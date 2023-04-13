package com.dsa.april10th;

public class QuadraticSequemce {

	public static String getQuadraticSequence(int n) {
		int[] sequence = new int[n];
		sequence[0] = 1; // replace with the actual value of the first term
		sequence[1] = 3; // replace with the actual value of the second term
		sequence[2] = 6; // replace with the actual value of the third term
		int[] differences = new int[n - 1];
		for (int i = 1; i < n; i++) {
			differences[i - 1] = sequence[i] - sequence[i - 1];
		}
		int a = differences[1] - differences[0];
		int b = differences[0] - a;
		int c = sequence[0] - a;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int term = a * (i * i) + b * i + c;
			sb.append(term);
			if (i != n - 1) {
				sb.append(",");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		int n = 5;
		System.out.println(getQuadraticSequence(n));
	}

}
