package com.bowling.game;

public class BowlingGameService {

	private int score = 0;

	public BowlingGameService() {
		super();
	}

	public void rollingABowlInBowlingGameTest(int pinDows) {
		System.out.println("Calling a method to roll a bowl");
	}
	
	public void rollingABowl_InBowlingGameTest(int pinDows) {
		score = score + pinDows;
	}

	public int getScoreAfterBowlHits() {
		return score;
	}
}
