package com.dsa.april5th;

import java.util.Scanner;

public class Palindrome {

	static boolean isPalindrome(int num) {
		boolean b = false;
		int temp = num, rev = 0;
		while (temp > 0) {
			rev = (rev * 10) + temp % 10;
			temp = temp / 10;
		}
		if (rev == num) {
			b = true;
		}
		return b;
	}

	static int revNum(int num) {
		int rev = 0;
		while (num > 0) {
			rev = (rev * 10) + num % 10;
			num /= 10;
		}
		return rev;
	}

	public static String getPalindromeList(int num) {

		String res = "";
		int count = 0;
		if (num <= 0 || num < 100 || num > 999 || (int) Math.log10(num) + 1 != 3) {
			res = "Error";
		} else {
			int sum = num, rev = 0;
			while (!isPalindrome(sum) && count++ < 10) {
				res = res + sum + ", ";
				rev = revNum(sum);
				res = res + rev + ", ";
				sum = sum + rev;

			}
			res += sum;
		}

		return res;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		System.out.println(isPalindrome(number));
		System.out.println(revNum(number));
		System.out.println(getPalindromeList(number));

	}

}
