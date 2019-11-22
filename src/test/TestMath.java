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

}
