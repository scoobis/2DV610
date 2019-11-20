package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import GuessNumber.RandomNumber;

class TestNumber {

	@Test
	void randomNumberShouldBeOneOrTwo() {
		RandomNumber sut = new RandomNumber();
		sut.setMaxNumber(2);
		sut.setMinNumber(1);
		
		int actual = sut.getRandomNumber();
		
		assertTrue(actual == 2 || actual == 1);
	}
	
	@Test
	void randomNumberShouldBeBetweenTenAndHundred() {
		RandomNumber sut = new RandomNumber();
		sut.setMaxNumber(100);
		sut.setMinNumber(10);
		
		int actual = sut.getRandomNumber();
		
		assertTrue(actual >= 10  && actual <= 100);
	}
	
	@Test
	void easyLevelShouldBeBetweenOneAndTen() {
		RandomNumber sut = new RandomNumber();
		sut.setEasyLevel();
		
		int actual = sut.getRandomNumber();
		
		assertTrue(actual >= 1  && actual <= 10);
	}
	
	@Test
	void MediumLevelShouldBeBetweenOneAndTwenty() {
		RandomNumber sut = new RandomNumber();
		sut.setMediumLevel();
		
		int actual = sut.getRandomNumber();
		
		assertTrue(actual >= 1  && actual <= 20);
	}
	
	@Test
	void HardLevelShouldBeBetweenOneAndTwenty() {
		RandomNumber sut = new RandomNumber();
		sut.setHardLevel();
		
		int actual = sut.getRandomNumber();
		
		assertTrue(actual >= 1  && actual <= 30);
	}
	
	@Test
	void ExpertLevelShouldBeBetweenOneAndTwenty() {
		RandomNumber sut = new RandomNumber();
		sut.setExpertLevel();
		
		int actual = sut.getRandomNumber();
		
		assertTrue(actual >= 1  && actual <= 100);
	}

}
