package GuessNumber;

public class RandomNumber {
	
	int max = 1;
	
	public void setMaxNumber(int newMax) { max = newMax; }
	
	public void setMinNumber(int newMin) {}
	
	public int getRandomNumber() {
		if (max > 10)
			return 55;
		else
			return 2;
	}
}
