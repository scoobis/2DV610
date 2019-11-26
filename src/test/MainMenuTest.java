package test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class MainMenuTest {

	@Test
	void printMainMenuShouldPrintGamesToPlayAndExit() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    String input = "1";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    String expected = "Pick a game!\n1. MathGame\n2. Guess the number\n";
	    
	    assertEquals(expected, outContent.toString());
	}

}
