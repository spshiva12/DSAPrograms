package com.dsa.april12th;

import java.util.ArrayList;
import java.util.Arrays;

public class GetWordsContainPattern {

	public static String[] getWordsContainsPattern(String[] words, String pattern) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].toUpperCase().contains(pattern.toUpperCase())) {
				result.add(words[i].toUpperCase());
			}
		}
		return result.toArray(new String[result.size()]);
	}

	public static void main(String[] args) {
		String[] words = { "South Africa", "Afghanistan", "Sri Lanka", "New Zealand", "West Indies", "England", "India",
				"Australia", "Pakistan", "Bangladesh" };

		String pattern = "an";
		System.out.println(Arrays.toString(getWordsContainsPattern(words, pattern)));
	}

}
