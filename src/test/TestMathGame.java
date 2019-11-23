package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import MathGame.MathGame;
import MathGame.MathQuestions;

class TestMathGame {

	@Test
	void menuShouldDisplaySetLevel() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    MathGame sut = new MathGame(new MathQuestions());
	    sut.printMenu();
	    
	    String expected = "Set Level\n1. Simple\n2. Medium\n3. Advanced\n";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void getInputShouldReturnOption() {
	    MathGame sut = new MathGame(new MathQuestions());

	    String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals(input, sut.getInput());
	}
	
	@Test
	void printMenuShouldReturnTwo() {
	    MathGame sut = new MathGame(new MathQuestions());

	    String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals(input, sut.printMenu());
	}
	
	@Test
	void setDifficulityShouldCallSimpleQuestions() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		spy.setDifficulity(1);
		
		 verify(spy).simpleQuestions();
	}
	
	@Test
	void setDifficulityShouldCallMediumQuestions() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		spy.setDifficulity(2);
		
		 verify(spy).mediumQuestions();
	}
	
	@Test
	void setDifficulityShouldCallAdvancedQuestions() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		spy.setDifficulity(3);
		
		 verify(spy).advancedQuestions();
	}
	
	@Test
	void simpleQuestionsShouldReturnSimpleAddition() {
		MathQuestions math = mock(MathQuestions.class);
		MathGame sut = new MathGame(math);
		
		sut.simpleQuestions();
		verify(math, times(1)).simpleAddition(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldReturnSimpleSubtraction() {
		MathQuestions math = mock(MathQuestions.class);
		MathGame sut = new MathGame(math);
		
		sut.simpleQuestions();
		verify(math, times(1)).simpleSubtraction(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldReturnSimpleMultiplication() {
		MathQuestions math = mock(MathQuestions.class);
		MathGame sut = new MathGame(math);
		
		sut.simpleQuestions();
		verify(math, times(1)).simpleMultiplication(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldReturnSimpleDivision() {
		MathQuestions math = mock(MathQuestions.class);
		MathGame sut = new MathGame(math);
		
		sut.simpleQuestions();
		verify(math, times(1)).simpleDivision(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldReturnsquareRoot() {
		MathQuestions math = mock(MathQuestions.class);
		MathGame sut = new MathGame(math);
		
		sut.simpleQuestions();
		verify(math, times(1)).squareRoot(anyInt());
	}
	
	@Test
	void simpleQuestionsShouldCallGetInputFiveTimes() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		spy.simpleQuestions();
		
		 verify(spy, times(5)).getInput();
	}

}
