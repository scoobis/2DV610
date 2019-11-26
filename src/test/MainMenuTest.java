package test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import Run.GameController;

class MainMenuTest {

	@Test
	void printMainMenuShouldPrintGamesToPlayAndExit() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    GameController sut = new GameController();
	    sut.printMainMenu();
	    
	    String expected = "Pick a game!\n1. MathGame\n2. Guess the number\n";
	    
	    assertEquals(expected, outContent.toString());
	}

}
