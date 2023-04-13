package com.dsa.april3rd;

public class FindSum {

	public static String getSum(int a, int b) {

		int result = a + b;
		String sum = "";

		if ((a + b) <= 0) {
			return "Error";
		} else {
			sum += result;
			return sum;
		}
	}

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(getSum(a, b));
	}

}
