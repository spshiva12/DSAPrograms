package com.dsa.april12th;

public class AdamNumber {
	// To reverse Digits of numbers
	static int reverseDigits(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

	// To square number
	static int square(int num) {
		return (num * num);
	}

	// To check Adam Number
	static boolean checkAdamNumber(int num) {
		// Square first number and square
		// reverse digits of second number
		int a = square(num);
		System.out.println(a);
		int b = square(reverseDigits(num));
		System.out.println(b);

		// If reverse of b equals a then given
		// number is Adam number
		if (a == reverseDigits(b))
			return true;
		return false;
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		int num = 12;

		if (checkAdamNumber(num))
			System.out.println("Adam Number");
		else
			System.out.println("Not a Adam Number");
	}

}
