import GuessNumber.RandomNumber;
import GuessNumber.RandomNumberGame;
import MathGame.MathGame;
import MathGame.MathQuestions;

public class Main {
	
	public static void main(String[] args) {
		
		MathGame g = new MathGame(new MathQuestions());
		g.simpleQuestions();
		
		RandomNumberGame randomNumberGame = new RandomNumberGame(new RandomNumber());
		
		String guess;
		
		randomNumberGame.setDifficulity();
		int randNr = randomNumberGame.getRandomNumber();
		
		do {
			guess = randomNumberGame.displayGuessNumber();
			randomNumberGame.displayState(Integer.parseInt(guess), randNr);
		} while(!randomNumberGame.checkIfEqual(Integer.parseInt(guess), randNr));
	}
}
