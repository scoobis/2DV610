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
	void simpleAdditionShouldDisplayQuestion() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    MathGame sut = new MathGame(new MathQuestions());
	    sut.simpleAddition(5, 5);
	    
	    String expected = "5 + 5 = ";
	    
	    assertEquals(expected, outContent.toString());
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
	void simpleSubtractionShouldDisplayQuestion() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    MathGame sut = new MathGame(new MathQuestions());
	    sut.simpleSubtraction(5, 5);
	    
	    String expected = "5 - 5 = ";
	    
	    assertEquals(expected, outContent.toString());
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
	void simpleMultiplicationShouldDisplayQuestion() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    String input = "25";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    MathGame sut = new MathGame(new MathQuestions());
	    sut.simpleMultiplication(5, 5);
	    
	    String expected = "5 * 5 = ";
	    
	    assertEquals(expected, outContent.toString());
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
	void simpleDivisionShouldDisplayQuestion() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    String input = "40";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    MathGame sut = new MathGame(new MathQuestions());
	    sut.simpleDivision(80, 2);
	    
	    String expected = "80 / 2 = ";
	    
	    assertEquals(expected, outContent.toString());
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
	void squareRootShouldDisplayQuestion() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    String input = "9";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    MathGame sut = new MathGame(new MathQuestions());
	    sut.squareRoot(81);
	    
	    String expected = "\u221A81";
	    
	    assertEquals(expected, outContent.toString());
	}
}
