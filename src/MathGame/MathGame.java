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
		Random rand = new Random();
		int score = 0;
		
		if (simpleAddition(rand.nextInt(50), rand.nextInt(50))) { score++; }
		if (simpleSubtraction(rand.nextInt(80-40) + 40, rand.nextInt(40))) { score++; }
		if (simpleMultiplication(rand.nextInt(10), rand.nextInt(10))) { score++; }
		if (simpleDivision(rand.nextInt(100-20) + 100, rand.nextInt(20))) { score++; }
		if (squareRoot(rand.nextInt(100))) { score++; }
		
		return score;
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
	
	public boolean mediumAddition(int num1, int num2, int num3, int num4) {
		int answer = question.mediumAddition(num1, num2, num3, num4);
		System.out.print(num1+ " + " +num2+ " + " +num3+ " + " +num4+ " = ");
		String guess = getInput();
		return answer == Integer.parseInt(guess);
	}
	
	public boolean mediumSubtraction(int num1, int num2, int num3, int num4) {
		return question.mediumSubtraction(num1, num2, num3, num4) == 20;
	}
	
	public void mediumQuestions() {
		
	}
	
	public void advancedQuestions() {
		
	}
}
