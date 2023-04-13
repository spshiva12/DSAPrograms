package com.dsa.april12th;

public class Anagrams {

	public static boolean isAnagrams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] count = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static int validateStrings(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return -1;
		}
		if (s1.contains(" ") || s2.contains(" ")) {
			return -2;
		}
		return 1;
	}

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		int isValid = validateStrings(s1, s2);
		if (isValid == 1) {
			boolean isAnagrams = isAnagrams(s1, s2);
			System.out.println(isAnagrams); // Output: true
		} else {
			System.out.println(isValid);
		}

		s1 = "abc";
		s2 = "xyz";
		isValid = validateStrings(s1, s2);
		if (isValid == 1) {
			boolean isAnagrams = isAnagrams(s1, s2);
			System.out.println(isAnagrams); // Output: false
		} else {
			System.out.println(isValid);
		}

		s1 = "abc  d";
		s2 = "xy xy";
		isValid = validateStrings(s1, s2);
		System.out.println(isValid); // Output: -2
	}

}
