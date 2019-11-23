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
		String[] result = new String[5];
		Random rand = new Random();
		
		result[0] = getInput();
		question.simpleAddition(rand.nextInt(50), rand.nextInt(50));
		result[1] = getInput();
		question.simpleSubtraction(rand.nextInt(200), rand.nextInt(30));
		result[2] = getInput();
		question.simpleMultiplication(rand.nextInt(10), rand.nextInt(10));
		result[3] = getInput();
		question.simpleDivision(rand.nextInt(50), rand.nextInt(10));
		result[4] = getInput();
		question.squareRoot(rand.nextInt(100));
		
	}
	
	public void mediumQuestions() {
		
	}
	
	public void advancedQuestions() {
		
	}
}
