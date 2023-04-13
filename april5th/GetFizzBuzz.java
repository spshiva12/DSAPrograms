package com.dsa.april5th;

public class GetFizzBuzz {

	public static String getFizzBuzz(int n) {

		if (n <= 0) {
			return "Error";
		}

		else if (n % 3 == 0 && n % 5 == 0) {
			return "FIZZBIZZ";
		} else if (n % 3 == 0) {
			return "BIZZ";
		} else if (n % 5 == 0) {
			return "FIZZ";
		}
		return Integer.toString(n);
	}

	public static void main(String[] args) {
		int n = 15;
		System.out.println(getFizzBuzz(n));
	}

}
