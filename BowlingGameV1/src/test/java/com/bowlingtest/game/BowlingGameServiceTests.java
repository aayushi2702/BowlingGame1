package com.bowlingtest.game;

import org.junit.Before;
import org.junit.Test;

import com.bowling.game.BowlingGameService;

public class BowlingGameServiceTests {
	
	BowlingGameService bowlingGameService;
	
	@Before
	public void setUp() {
		bowlingGameService = new BowlingGameService();
	}
	
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
