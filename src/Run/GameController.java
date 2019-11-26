package Run;

import java.util.Scanner;

public class GameController {
	
	public String printMainMenu() {
		System.out.print("Pick a game!\n");
		System.out.print("1. MathGame\n");
		System.out.print("2. Guess the number\n");
		getInput();
		return "";
	}
	
	public String getInput() {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) { return s.nextLine(); }
		return "-1";
	}
}
