package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import GuessNumber.RandomNumber;
import GuessNumber.RandomNumberGame;

class TestRandomNumberGame {

	@Test
	void menuShouldDisplaySetLevel() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.printMenu();
	    
	    String expected = "Set Level\n1. Easy\n2. Medium\n3. Hard\n4. Expert\n5. Custom\n";
	    
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
		RandomNumber rand = Mockito.mock(RandomNumber.class);
	    RandomNumberGame sut = new RandomNumberGame(rand);

	    String input = "1";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    sut.setDifficulity();
	    
	    Mockito.when(rand.getRandomNumber()).thenReturn(6);
	    int actual = rand.getRandomNumber();
	    
	    assertTrue(actual >= 1  && actual <= 10);
	}
	
	@Test
	void setDifficulityShouldBeMedium() {
		RandomNumber rand = Mockito.mock(RandomNumber.class);
	    RandomNumberGame sut = new RandomNumberGame(rand);

	    String input = "2";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    sut.setDifficulity();
	    Mockito.when(rand.getRandomNumber()).thenReturn(17);
	    int actual = rand.getRandomNumber();
	    
	    assertTrue(actual >= 1  && actual <= 20);
	}
	
	@Test
	void setDifficulityShouldBeHard() {
		RandomNumber rand = Mockito.mock(RandomNumber.class);
	    RandomNumberGame sut = new RandomNumberGame(rand);

	    String input = "3";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    sut.setDifficulity();
	    Mockito.when(rand.getRandomNumber()).thenReturn(24);
	    int actual = rand.getRandomNumber();
	    
	    assertTrue(actual >= 1  && actual <= 30);
	}
	
	@Test
	void setDifficulityShouldBeExpert() {
		RandomNumber rand = Mockito.mock(RandomNumber.class);
	    RandomNumberGame sut = new RandomNumberGame(rand);

	    String input = "4";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    sut.setDifficulity();
	    Mockito.when(rand.getRandomNumber()).thenReturn(78);
	    int actual = rand.getRandomNumber();
	    
	    assertTrue(actual >= 1  && actual <= 100);
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
	
	@Test
	void checkIfEqualShouldReturnTrueWithEqualValues() {
		RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
		
		assertTrue(sut.checkIfEqual(15, 15));
	}
	
	@Test
	void checkIfEqualShouldReturnFalseWithDifferentValues() {
		RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
		
		assertFalse(sut.checkIfEqual(15, 10));
	}
	
	@Test
	void getRandomNumberShouldReturnCorrectValue() {
		RandomNumber rand = Mockito.mock(RandomNumber.class);
		RandomNumberGame sut = new RandomNumberGame(rand);
		
		Mockito.when(rand.getRandomNumber()).thenReturn(8);
		
		assertEquals(sut.getRandomNumber(), 8);
	}
	
	@Test
	void displayTooHighShouldPrintTooHigh() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.displayToHigh();
	    
	    String expected = "Too high!\n";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void displayTooLowShouldPrintTooLow() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.displayTooLow();
	    
	    String expected = "Too low!\n";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void displayWonShouldPrintYouWon() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.displayWon();
	    
	    String expected = "YOU WON!\n";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void displayStateShouldReturnYouWonIfEqualsIsTrue() {
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.displayState(10, 10);
	    
	    String expected = "YOU WON!\n";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void displayStateShouldReturnTooHighIfGuessIsTooHigh() {
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.displayState(10, 5);
	    
	    String expected = "Too high!\n";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void displayStateShouldReturnTooHighIfGuessIsTooLow() {
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
	    sut.displayState(5, 10);
	    
	    String expected = "Too low!\n";
	    
	    assertEquals(expected, outContent.toString());
	}
	
	@Test
	void runshouldCallSetDifficulity() {
		RandomNumberGame sut = new RandomNumberGame(new RandomNumber());
		RandomNumberGame spy = Mockito.spy(sut);
		
		spy.run();
		
		verify(spy).setDifficulity();;
	}

}
