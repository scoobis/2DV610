package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import MathGame.MathGame;
import MathGame.MathQuestions;

class TestMathGameView {
	
	@Test
	void squareRootShouldDisplayQuestion() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    String input = "9";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    MathGame sut = new MathGame(new MathQuestions());
	    sut.squareRoot(81);
	    
	    // NOTE you need to run with UTF-8
	    // How to enable: Run -> Run configurations.. -> Common -> Other -> UTF-8
	    String expected = "\u221A81 = ";
	    
	    assertEquals(expected, outContent.toString());
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
	void simpleSubtractionShouldDisplayQuestion() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    MathGame sut = new MathGame(new MathQuestions());
	    sut.simpleSubtraction(5, 5);
	    
	    String expected = "5 - 5 = ";
	    
	    assertEquals(expected, outContent.toString());
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

}
