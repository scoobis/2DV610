package MathGame;

import java.util.Scanner;

public class MathGame {
	
	public String printMenu() {
		System.out.print("Set Level\n");
		System.out.print("1. Simple\n");
		System.out.print("2. Medium\n");
		System.out.print("3. Advanced\n");
		return getInput();
	}
	
	public String getInput() {
		Scanner s = new Scanner(System.in);
		while(s.hasNextLine()) { return s.nextLine(); }
		return null;
	}
	
	public void setDifficulity(int option) {
		if (option == 1) {
			simpleQuestions();
		} else if (option == 2) {
			mediumQuestions();
		}
		advancedQuestions();
	}
	
	public void simpleQuestions() {
		
	}
	
	public void mediumQuestions() {
		
	}
	
	public void advancedQuestions() {
		
	}
}
