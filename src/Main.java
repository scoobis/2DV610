import GuessNumber.RandomNumber;
import GuessNumber.RandomNumberGame;

public class Main {
	
	public static void main(String[] args) {
		
		RandomNumberGame randomNumberGame = new RandomNumberGame(new RandomNumber());
		
		String guess;
		
		randomNumberGame.setDifficulity();
		
		do {
			guess = randomNumberGame.displayGuessNumber();
		} while(!randomNumberGame.checkIfEqual(Integer.parseInt(guess), randomNumberGame.getRandomNumber()));
	}
}
