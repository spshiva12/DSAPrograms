package com.dsa.april7th;

public class EvaluateMultipleChoice {

	public static int evaluate(char[] attempt, char[] key) {
		if (attempt.length != key.length) {
			return -1;
		}
		int marks = 0;
		for (int i = 0; i < attempt.length; i++) {
			if (attempt[i] == key[i]) {
				marks += 2;
			}
		}
		return marks;
	}

	public static void main(String[] args) {
		char[] attempt = { 'a', 'b', 'c', 'd', 'a', 'a', 'b', 'b', 'c', 'c' };
		char[] key = { 'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd', 'a', 'b' };

		char[] attempt1 = { 'a', 'b', 'c', 'd', 'a', 'a', 'b', 'b', 'c', 'c' };
		char[] key1 = { 'a', 'b', 'c', 'd', 'a' };

		int marks = evaluate(attempt, key);
		int marks1 = evaluate(attempt1, key1);
		System.out.println(marks);
		System.out.println(marks1);
	}

}
