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
		return null;
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
	
	public void simpleQuestions() {
		Random rand = new Random(); 
		question.simpleAddition(rand.nextInt(50), rand.nextInt(50));
		question.simpleSubtraction(rand.nextInt(200), rand.nextInt(30));
		question.simpleMultiplication(rand.nextInt(10), rand.nextInt(10));
		question.simpleDivision(rand.nextInt(50), rand.nextInt(10));
		question.squareRoot(rand.nextInt(100));
	}
	
	public void mediumQuestions() {
		
	}
	
	public void advancedQuestions() {
		
	}
}
