package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
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

}
