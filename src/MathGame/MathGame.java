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
	
	public void simpleQuestions() {
		Random rand = new Random();
		
		simpleAddition(rand.nextInt(50), rand.nextInt(50));
		simpleSubtraction(rand.nextInt(80-40) + 40, rand.nextInt(40));
	}
	
	public boolean simpleAddition(int num1, int num2) {
		int answer = question.simpleAddition(num1, num2);
		System.out.print(num1 + " + " + num2 + " = ");
		String guess = getInput();
		return answer == Integer.parseInt(guess);
	}
	
	public boolean simpleSubtraction(int num1, int num2) {
		int answer = question.simpleSubtraction(num1, num2);
		System.out.print(num1 + " - " + num2 + " = ");
		String guess = getInput();
		return answer == Integer.parseInt(guess);
	}
	
	public boolean simpleMultiplication(int num1, int num2) {
		int answer =  question.simpleMultiplication(num1, num2);
		System.out.print(num1 + " * " + num2 + " = ");
		String guess = getInput();
		return answer == Integer.parseInt(guess);
	}
	
	public boolean simpleDivision(int num1, int num2) {
		int answer =  question.simpleDivision(num1, num2);
		System.out.print(num1 + " / " + num2 + " = ");
		String guess = getInput();
		return answer == Integer.parseInt(guess);
	}
	
	public boolean squareRoot(int num) {
		int answer = question.squareRoot(num);
		System.out.print("\u221A"+num+ " = ");
		String guess = getInput();
		return answer == Integer.parseInt(guess);
	}
	
	public void mediumQuestions() {
		
	}
	
	public void advancedQuestions() {
		
	}
}
