package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MathGame.MathQuestions;

class TestMath {

	@Test
	void simpleAdditionShouldReturnTen() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(sut.simpleAddition(5, 5), 10);
	}
	
	@Test
	void simpleSubtractionShouldReturnFive() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(sut.simpleSubtraction(10, 5), 5);
	}
	
	@Test
	void simpleMultiplicationShouldReturnTwenty() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(sut.simpleMultiplication(10, 2), 20);
	}
	
	@Test
	void simpleDivisionShouldReturnTen() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(sut.simpleDivision(20, 2), 10);
	}

}
