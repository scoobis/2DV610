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
		sut.setMaxNumber(10);
		sut.setMinNumber(100);
		
		int actual = sut.getRandomNumber();
		
		assertTrue(actual >= 10  && actual <= 100);
	}

}
