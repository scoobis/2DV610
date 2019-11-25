package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MathGame.MathQuestions;

class TestMath {

	@Test
	void simpleAdditionShouldReturnTen() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(10, sut.simpleAddition(5, 5));
	}
	
	@Test
	void simpleSubtractionShouldReturnFive() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(5, sut.simpleSubtraction(10, 5));
	}
	
	@Test
	void simpleMultiplicationShouldReturnTwenty() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(20, sut.simpleMultiplication(10, 2));
	}
	
	@Test
	void simpleDivisionShouldReturnTen() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(10, sut.simpleDivision(20, 2));
	}
	
	@Test
	void SquareRootShouldReturnThree() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(3, sut.squareRoot(9));
	}
	
	@Test
	void MediumAdditionShouldReturnTen() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(10, sut.mediumAddition(1, 2, 3, 4));
	}
	
	@Test
	void MediumSubtractionShouldReturnTen() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(10, sut.mediumSubtraction(30, 5, 5, 10));
	}
	
	@Test
	void MediumMultiplicationShouldReturnEighty() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(80, sut.mediumMultiplication(4, 2, 10));
	}
	
	@Test
	void MediumDivisionShouldReturnTen() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(10, sut.mediumDivision(100, 5, 2));
	}
	
	@Test
	void cubeRootShouldReturnThree() {
		MathQuestions sut = new MathQuestions();
		
		assertEquals(3, sut.cubeRoot(27));
	}

}
