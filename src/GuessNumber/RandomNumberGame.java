package GuessNumber;

import java.util.Scanner;

public class RandomNumberGame {
	
	RandomNumber rand;
	
	public RandomNumberGame(RandomNumber newRand) {
		rand = newRand;
	}
	
	public String printMenu() {
		System.out.print("Set Level\n");
		System.out.print("1. Easy\n");
		System.out.print("2. Medium\n");
		System.out.print("3. Hard\n");
		System.out.print("4. Expert\n");
		System.out.print("5. Custom\n");
		return getInput();
	}
	
	public boolean checkIfEqual(int guess, int randNr) {
		return guess == randNr;
	}
	
	public int getRandomNumber() { return rand.getRandomNumber(); }
	
	public void setDifficulity() {
		String temp = printMenu();
		int option = Integer.parseInt(temp);
		
		if (option == 1) { rand.setEasyLevel(); }
		else if (option == 2) { rand.setMediumLevel(); }
		else if (option == 3) { rand.setHardLevel(); }
		else if (option == 4)  { rand.setExpertLevel(); }
	}
	
	public String getInput() {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) { return s.nextLine(); }
		return null;
	}
	
	public String printCustomOptionMax() {
		System.out.print("Set max value: ");
		return getInput();
	}
	
	public String printCustomOptionMin() {
		System.out.print("Set min value: ");
		return getInput();
	}
	
	public String displayGuessNumber() {
		System.out.print("Guess number: ");
		return getInput();
	}
	
	public void displayToHigh() { System.out.print("Too high!\n"); }
	
	public void displayTooLow() { System.out.print("Too low!\n"); }
	
	public void displayWon() { System.out.print("YOU WON!\n"); }
	
	public void displayState(int guess, int randNr) {
		if (this.checkIfEqual(guess, randNr)) {
			displayWon();
		} else if (guess > randNr)
			displayToHigh();
	}
}

