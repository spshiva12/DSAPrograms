package com.dsa.april5th;

public class GetOddPalindromeList {

	public static String getOddPalindromeList(int startNum, int endNum) {
		if (startNum <= 0 || endNum <= 0 || startNum < 100 || endNum > 999 || startNum > endNum) {
			return "Error";
		}
		String output = "";
		boolean foundPalindrome = false;
		for (int i = startNum; i <= endNum; i++) {
			if (i % 2 != 0 && isPalindrome(i)) {
				output += Integer.toString(i) + ",";
				foundPalindrome = true;
			}
		}
		if (!foundPalindrome) {
			return "";
		}
		return output.substring(0, output.length() - 1);
	}

	public static boolean isPalindrome(int n) {
		String str = Integer.toString(n);
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int firstnum = 100, secondnum = 200;
		System.out.println(getOddPalindromeList(firstnum, secondnum));

	}

}
