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
	    sut.printCustomOptionMax();
	    
	    String expected = "Set min value: ";
	    
	    assertEquals(expected, outContent.toString());
	}

}
