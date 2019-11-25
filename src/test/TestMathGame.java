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
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
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
	void simpleAdditionShouldReturnTrue() {
		MathQuestions mock = mock(MathQuestions.class);
		MathGame sut = new MathGame(mock);
		
		String input = "10";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		when(mock.simpleAddition(anyInt(), anyInt())).thenReturn(10);
		
		assertTrue(sut.simpleAddition(5, 5));
	}
	
	@Test
	void simpleSubtractionShouldReturnTrue() {
		MathQuestions mock = mock(MathQuestions.class);
		MathGame sut = new MathGame(mock);
		
		String input = "20";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		when(mock.simpleSubtraction(anyInt(), anyInt())).thenReturn(20);
		
		assertTrue(sut.simpleSubtraction(25, 5));
	}
	
	@Test
	void simpleMultiplicationShouldReturnTrue() {
		MathQuestions mock = mock(MathQuestions.class);
		MathGame sut = new MathGame(mock);
		
		String input = "20";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		when(mock.simpleMultiplication(anyInt(), anyInt())).thenReturn(20);
		
		assertTrue(sut.simpleMultiplication(4, 5));
	}
	
	@Test
	void simpleDivisionShouldReturnTrue() {
		MathQuestions mock = mock(MathQuestions.class);
		MathGame sut = new MathGame(mock);
		
		String input = "40";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		when(mock.simpleDivision(anyInt(), anyInt())).thenReturn(40);
		
		assertTrue(sut.simpleDivision(80, 2));
	}
	
	@Test
	void squareRootShouldReturnTrue() {
		MathQuestions mock = mock(MathQuestions.class);
		MathGame sut = new MathGame(mock);
		
		String input = "9";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		when(mock.squareRoot(anyInt())).thenReturn(9);
		
		assertTrue(sut.squareRoot(81));
	}
	
	@Test
	void simpleQuestionsShouldCallSimpleAddition() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).simpleAddition(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldCallSimpleSubtraction() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).simpleSubtraction(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldCallSimpleMultiplication() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).simpleMultiplication(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldCallSimpleDivision() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).simpleDivision(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldCallsquareRoot() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).squareRoot(anyInt());
	}
	
	@Test
	void simpleQuestionsShouldReturnAScore() {
		MathGame sut = new MathGame(new MathQuestions());
		
		int actual = sut.simpleQuestions();
		
		assertTrue(actual >= 0  && actual <= 5);
	}
	
	@Test
	void mediumAdditionShouldReturnTrue() {
		MathQuestions mock = mock(MathQuestions.class);
		MathGame sut = new MathGame(mock);
		
		String input = "20";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		when(mock.mediumAddition(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(20);
		
		assertTrue(sut.mediumAddition(5, 5, 5, 5));
	}
	
	@Test
	void mediumSubtractionShouldReturnTrue() {
		MathQuestions mock = mock(MathQuestions.class);
		MathGame sut = new MathGame(mock);
		
		String input = "20";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		when(mock.mediumSubtraction(anyInt(), anyInt(), anyInt(), anyInt())).thenReturn(20);
		
		assertTrue(sut.mediumSubtraction(35, 5, 5, 5));
	}
}
