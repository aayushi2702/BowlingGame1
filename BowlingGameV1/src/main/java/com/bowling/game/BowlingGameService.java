package com.bowling.game;

public class BowlingGameService {

	private int score = 0;
	private int roll = 0;
	private int[] rolls = new int[21];

	public BowlingGameService() {
		super();
	}

	public void rollingABowlInBowlingGameTest(int pinDows) {
		System.out.println("Calling a method to roll a bowl");
	}
	
	public void rollingABowl_InBowlingGameTest(int pinDows) {
		score=score+pinDows;
		rolls[roll++] = pinDows;
	}

	public int getScoreAfterBowlHits() {
		int score = 0;
		int curser = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (isSpare(curser)) {
				score += 10 + rolls[curser + 2];
				curser += 2;
			} else {
				score += rolls[curser] + rolls[curser + 1];
				curser += 2;
			}
		}
		return score;
	}
	
	public void rollABowl(int...rolls) {
		for (int pinsDown : rolls) {
			rollingABowl_InBowlingGameTest(pinsDown);

		}
	}
	
	private boolean isSpare(int curser) {
		return rolls[curser] + rolls[curser + 1] == 10;
	}
}