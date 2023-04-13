package com.dsa.april7th;

public class GetNameScore {

	public static int getNameScore(String name) {
		if (name == null || name.isEmpty()) {
			return -1;
		}
		if (!name.matches("[a-zA-Z]+")) {
			return -1;
		}
		int score = 0;
		for (char c : name.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				score += c - 'a' + 1;
			} else {
				score += c - 'A' + 1;
			}
		}
		return score;
	}

	public static void main(String[] args) {
		String name1 = "abc", name2 = "DAD";
		System.out.println(getNameScore(name1));
		System.out.println(getNameScore(name2));
	}

}
