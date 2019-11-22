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

}
