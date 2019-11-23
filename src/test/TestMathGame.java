package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import MathGame.MathGame;

class TestMathGame {

	@Test
	void menuShouldDisplaySetLevel() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    MathGame sut = new MathGame();
	    sut.printMenu();
	    
	    String expected = "Set Level\n1. Simple\n2. Medium\n3. Advanced\n";
	    
	    assertEquals(expected, outContent.toString());
	}

}
