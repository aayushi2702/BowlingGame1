package com.bowlingtest.game;

import org.junit.Test;

import com.bowling.game.BowlingGameService;

public class BowlingGameServiceTests {
	
	@Test
	public void getABowlingGame() {
		new BowlingGameService();
	}

	@Test
	public void getARollBowlInBowlingGame() {
		BowlingGameService bowlingGameService = new BowlingGameService();
		bowlingGameService.rollingABowlInBowlingGameTest(0);  //to simply roll a bowl
	}
}
