import GuessNumber.RandomNumber;
import GuessNumber.RandomNumberGame;
import MathGame.MathGame;
import MathGame.MathQuestions;
import Run.GameController;

public class Main {
	
	public static void main(String[] args) {
		GameController game = new GameController(new MathGame(new MathQuestions()), new RandomNumberGame(new RandomNumber()));
		while(game.option());
		
		/*
		randomNumberGame.setDifficulity();
		int randNr = randomNumberGame.getRandomNumber();
		
		do {
			guess = randomNumberGame.displayGuessNumber();
			randomNumberGame.displayState(Integer.parseInt(guess), randNr);
		} while(!randomNumberGame.checkIfEqual(Integer.parseInt(guess), randNr));
		*/
	}
}
