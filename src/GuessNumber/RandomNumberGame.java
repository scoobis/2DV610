package GuessNumber;

import java.util.Scanner;

public class RandomNumberGame {
	
	public RandomNumberGame(RandomNumber rand) {
		
	}
	
	public void printMenu() {
		System.out.print("Set Level\n");
		System.out.print("1. Easy\n");
		System.out.print("2. Medium\n");
		System.out.print("3. Hard\n");
		System.out.print("4. Expert\n");
		System.out.print("5. Custom");
	}
	
	public String getInput() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	public void printCustomOptionMax() {
		System.out.print("Set max value: ");
	}

}
