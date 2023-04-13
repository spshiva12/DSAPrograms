package com.dsa.april10th;

public class ReverseWords {

	public static String reverse(String s) {
		if (s == null || s.isEmpty()) {
			return null;
		}
		String[] words = s.split("\\s+");
		StringBuilder reversed = new StringBuilder();
		for (String word : words) {
			reversed.append(new StringBuilder(word).reverse().toString() + " ");
		}
		return reversed.toString().trim();
	}

	public static void main(String[] args) {
		String str = "dasarpavihs naylak";
		System.out.println(reverse(str));
	}

}
