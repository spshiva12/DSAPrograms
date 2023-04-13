package com.dsa.april7th;

public class GetAverageWordLength {

	public static int getAverageWordLength(String sentence) {
		String[] words = sentence.split("\\s+");
		int total = 0;
		for (String word : words) {
			total += word.length();
		}
		return total / words.length;
	}

	public static void main(String[] args) {

		System.out.println(getAverageWordLength("Hi dad"));
		System.out.println(getAverageWordLength("Hi everyone"));
		System.out.println(getAverageWordLength("How Are You"));

	}

}
