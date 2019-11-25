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
		return "-1";
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
		printSimple(num1, num2, "+");
		
		return validation(getInput(), answer);
	}
	
	public boolean simpleSubtraction(int num1, int num2) {
		int answer = question.simpleSubtraction(num1, num2);
		printSimple(num1, num2, "-");
		
		return validation(getInput(), answer);
	}
	
	public boolean simpleMultiplication(int num1, int num2) {
		int answer =  question.simpleMultiplication(num1, num2);
		printSimple(num1, num2, "*");
		
		return validation(getInput(), answer);
	}
	
	public boolean simpleDivision(int num1, int num2) {
		int answer =  question.simpleDivision(num1, num2);
		printSimple(num1, num2, "/");
		
		return validation(getInput(), answer);
	}
	
	public boolean squareRoot(int num) {
		int answer = question.squareRoot(num);
		System.out.print("\u221A"+num+ " = ");
		
		return validation(getInput(), answer);
	}
	
	public boolean mediumAddition(int num1, int num2, int num3, int num4) {
		int answer = question.mediumAddition(num1, num2, num3, num4);
		printMedium(num1, num2, num3, num4, "+");
		
		return validation(getInput(), answer);
	}
	
	public boolean mediumSubtraction(int num1, int num2, int num3, int num4) {
		int answer = question.mediumSubtraction(num1, num2, num3, num4);
		
		printMedium(num1, num2, num3, num4, "-");
		
		return validation(getInput(), answer);
	}
	
	public boolean mediumMultiplication(int num1, int num2, int num3) {
		int answer = question.mediumMultiplication(num1, num2, num3);
		
		printMediumShort(num1, num2, num3, "*");
		
		return validation(getInput(), answer);
	}
	
	public boolean mediumDivision(int num1, int num2, int num3) {
		int answer = question.mediumDivision(num1, num2, num3);
		
		printMediumShort(num1, num2, num3, "/");
		
		return validation(getInput(), answer);
	}
	
	public boolean cubeRoot(int num) {
		return question.cubeRoot(num) == 4;
	}
	
	public void mediumQuestions() {
		
	}
	
	public void advancedQuestions() {
		
	}
	
	private boolean validation(String guess, int answer) {
		return answer == Integer.parseInt(guess);
	}
	
	private void printSimple(int num1, int num2, String symbol) {
		System.out.print(num1 + " "+ symbol +" " + num2 + " = ");
	}
	
	private void printMedium(int num1, int num2, int num3, int num4, String symbol) {
		System.out.print(num1+ " " +symbol+ " " +num2+ " " +symbol+ " " +num3+ " " +symbol+ " " +num4+ " = ");
	}
	
	private void printMediumShort(int num1, int num2, int num3, String symbol) {
		System.out.print(num1+ " " +symbol+ " " +num2+ " " +symbol+ " " +num3+ " = ");
	}
}
