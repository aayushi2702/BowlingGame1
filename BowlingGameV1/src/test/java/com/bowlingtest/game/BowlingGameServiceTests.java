package com.bowlingtest.game;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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

	@Test
	public void getARollerBowlScoringAGutterBowlTests() {
		for (int i = 0; i < 20; i++) {
			bowlingGameService.rollingABowl_InBowlingGameTest(0);

		}
		assertThat(bowlingGameService.getScoreAfterBowlHits(), is(0));
	}
	
	@Test
	public void getARollerBowlToScoreAGameOf_1Tests() {
		for (int i = 0; i < 20; i++) {
			bowlingGameService.rollingABowl_InBowlingGameTest(1);

		}
		assertThat(bowlingGameService.getScoreAfterBowlHits(),is(20));
	}
}
