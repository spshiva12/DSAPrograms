package com.dsa.april5th;

public class T20ScoringRate {

	public static String getDisplayDetails(int runs, float overs) {
		if (runs <= 0 || overs <= 0) {
			return "Error";
		}
		String displayType;
		float ballsRemaining = (overs - (int) overs) * 10 + (int) overs * 6;
		if (runs < 100 || ballsRemaining < 100) {
			displayType = "balls";
//			int ballsRequired = (int) (overs - (int) overs) * 10 + (int) overs * 6;
			int ballsRequired = (int) Math.ceil(ballsRemaining);
			return runs + " runs in " + ballsRequired + " " + displayType + " @ "
					+ String.format("%.2f", runs / ballsRemaining) + " runs per " + displayType;
		} else {
			displayType = "overs";
			float oversRemaining = (int) overs + (ballsRemaining - (int) ballsRemaining) / 10;
			return runs + " runs in " + String.format("%.1f", oversRemaining) + " " + displayType + " @ "
					+ String.format("%.2f", runs / oversRemaining) + " runs per over";
		}
	}

	public static void main(String[] args) {

		int runs = 127;
		float overs = 18f;
		System.out.println(getDisplayDetails(runs, overs));

	}

}
