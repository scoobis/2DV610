package MathGame;

import java.util.Random;
import java.util.Scanner;

public class MathGame {
	
	MathQuestions question;
	
	public MathGame(MathQuestions a_question) {
		question = a_question;
	}
	
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
		return "0";
	}
	
	public void setDifficulity(int option) {
		if (option == 1) {
			simpleQuestions();
		} else if (option == 2) {
			mediumQuestions();
		} else if (option == 3) {
			advancedQuestions();
		}
	}
	
	public int simpleQuestions() {
		return 0;
	}
	
	public boolean simpleAddition(int num1, int num2) {
		int answer = question.simpleAddition(num1, num2);
		System.out.print("5 + 5 = ");
		String guess = getInput();
		return answer == Integer.parseInt(guess);
	}
	
	public void mediumQuestions() {
		
	}
	
	public void advancedQuestions() {
		
	}
}
