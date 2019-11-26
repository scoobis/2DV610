package Run;

import java.util.Scanner;

import MathGame.MathGame;

public class GameController {
	
	MathGame mathGame;
	
	public GameController(MathGame mathGame) {
		this.mathGame = mathGame;
	}
	
	public String printMainMenu() {
		System.out.print("Pick a game!\n");
		System.out.print("1. MathGame\n");
		System.out.print("2. Guess the number\n");
		System.out.print("3. Exit\n");
		return getInput();
	}
	
	public String getInput() {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) { return s.nextLine(); }
		return "-1";
	}
	
	public boolean options() {
		int option = Integer.parseInt(printMainMenu());
		if (option == 1) { runMath(); }
		else if (option == 2) { runGuessNumber(); }
		else if (option == 3) { return false; }
		return true;
	}
	
	public void runMath() {
		mathGame.run();
	}
	
	public void runGuessNumber() {
		
	}
}
