package test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import MathGame.MathGame;
import MathGame.MathQuestions;
import Run.GameController;
import static org.mockito.Mockito.*;

class TestGameController {

	@Test
	void printMainMenuShouldPrintGamesToPlayAndExit() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    GameController sut = new GameController(new MathGame(new MathQuestions()));
	    sut.printMainMenu();
	    
	    String expected = "Pick a game!\n1. MathGame\n2. Guess the number\n3. Exit\n";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void getInputShouldReturnOption() {
		GameController sut = new GameController(new MathGame(new MathQuestions()));

	    String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals(input, sut.getInput());
	}
	
	@Test
	void printMainMenuShouldReturngetInput() {
		GameController sut = new GameController(new MathGame(new MathQuestions()));
		GameController spy = spy(sut);
		
		String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    spy.printMainMenu();
		
		verify(spy).getInput();
	}
	
	@Test
	void optionsShouldCallPrintMainMenu() {
		GameController sut = new GameController(new MathGame(new MathQuestions()));
		GameController spy = spy(sut);
		
		String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    spy.option();
		
		verify(spy).getInput();
	}
	
	@Test
	void optionShouldReturnFalseIfThree() {
		GameController sut = new GameController(new MathGame(new MathQuestions()));
		String input = "3";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		assertFalse(sut.option());
	}
	
	@Test
	void optionShouldCallRunMathIfOne() {
		GameController sut = new GameController(new MathGame(new MathQuestions()));
		GameController spy = spy(sut);
		
		String input = "1";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    spy.option();
		
		verify(spy).runMath();
	}
	
	@Test
	void optionShouldCallRunGuessNumberIfTwo() {
		GameController sut = new GameController(new MathGame(new MathQuestions()));
		GameController spy = spy(sut);
		
		String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    spy.option();
		
		verify(spy).runGuessNumber();
	}
	
	@Test
	void runMathShouldCallRunFromMathGame() {
		MathGame game = mock(MathGame.class);
		GameController sut = new GameController(game);
		
		 sut.runMath();
		
		 verify(game).run();
	}
	
	@Test
	void optionShouldPrintExitIfThree() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    String input = "3";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    GameController sut = new GameController(new MathGame(new MathQuestions()));
	    sut.option();
	    
	    // Needs all the other out prints aswell since it is called prior to exit
	    String expected = "Pick a game!\n1. MathGame\n2. Guess the number\n3. Exit\nExit...";
	    
	    assertEquals(expected, outContent.toString());
	}

}
