package GuessNumber;

import java.util.Random;

public class RandomNumber {
	
	int max = 1;
	int min = 1;
	
	public void setMaxNumber(int newMax) { max = newMax +1; }
	
	public void setMinNumber(int newMin) { min = newMin; }
	
	public int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(max-min) + min;
	}
	
	public void setEasyLevel() {
		max = 10;
		min = 1;
	}
}
