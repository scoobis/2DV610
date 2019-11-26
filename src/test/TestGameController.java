package test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import Run.GameController;

class TestGameController {

	@Test
	void printMainMenuShouldPrintGamesToPlayAndExit() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    GameController sut = new GameController();
	    sut.printMainMenu();
	    
	    String expected = "Pick a game!\n1. MathGame\n2. Guess the number\n3. Exit\n";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void getInputShouldReturnOption() {
		GameController sut = new GameController();

	    String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals(input, sut.getInput());
	}
	
	@Test
	void printMainMenuShouldReturngetInput() {
		GameController sut = new GameController();
		GameController spy = spy(sut);
		
		String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    spy.printMainMenu();
		
		verify(spy).getInput();
	}
	
	@Test
	void optionsShouldCallPrintMainMenu() {
		GameController sut = new GameController();
		GameController spy = spy(sut);
		
		String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    spy.options();
		
		verify(spy).getInput();
	}
	
	@Test
	void optionShoudlReturnFalseIfThree() {
		GameController sut = new GameController();
		String input = "3";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		assertFalse(sut.options());
	}

}
