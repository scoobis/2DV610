package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import GuessNumber.RandomNumber;
import GuessNumber.RandomNumberGame;

class TestRandomNumberGame {

	@Test
	void menuShouldDisplaySetLevel() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.printMenu();
	    
	    String expected = "Set Level\n1. Easy\n2. Medium\n3. Hard\n4. Expert\n5. Custom";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void getInputShouldReturnOption() {
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());

	    String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals(input, sut.getInput());
	}
	
	@Test
	void setDifficulityShouldBeEasy() {
		RandomNumber rand = new RandomNumber();
	    RandomNumberGame sut = new RandomNumberGame(rand);

	    String input = "1";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    sut.setDifficulity();
	    int actual = rand.getRandomNumber();
	    
	    assertTrue(actual >= 1  && actual <= 10);
	}
	
	@Test
	void setDifficulityShouldBeMedium() {
		RandomNumber rand = new RandomNumber();
	    RandomNumberGame sut = new RandomNumberGame(rand);

	    String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    sut.setDifficulity();
	    int actual = rand.getRandomNumber();
	    
	    assertTrue(actual >= 1  && actual <= 20);
	}
	
	@Test
	void printMenuShouldReturnTwo() {
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());

	    String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals(input, sut.printMenu());
	}
	
	@Test
	void printCustomOptionMaxShouldReturnTwenty() {
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());

	    String input = "20";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals(input, sut.printCustomOptionMax());
	}
	
	@Test
	void printCustomOptionMinShouldReturnFive() {
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());

	    String input = "5";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals(input, sut.printCustomOptionMin());
	}
	
	@Test
	void customOptionMaxShouldPrintSetValue() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.printCustomOptionMax();
	    
	    String expected = "Set max value: ";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void customOptionMinShouldPrintSetValue() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.printCustomOptionMin();
	    
	    String expected = "Set min value: ";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void diplayGuessNumberShouldPrintGuessNumber() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.displayGuessNumber();
	    
	    String expected = "Guess number: ";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void displyGuessNumberShouldReturnTen() {
		RandomNumberGame sut = new RandomNumberGame(new RandomNumber());

	    String input = "10";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals(input, sut.displayGuessNumber());
	}

}
