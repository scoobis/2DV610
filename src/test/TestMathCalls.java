package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

import MathGame.MathGame;
import MathGame.MathQuestions;

class TestMathCalls {
	
	@Test
	void simpleQuestionsShouldCallSimpleAddition() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).simpleAddition(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldCallSimpleSubtraction() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).simpleSubtraction(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldCallSimpleMultiplication() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).simpleMultiplication(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldCallSimpleDivision() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).simpleDivision(anyInt(), anyInt());
	}
	
	@Test
	void simpleQuestionsShouldCallsquareRoot() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.simpleQuestions();
		
		 verify(spy, times(1)).squareRoot(anyInt());
	}
	
	@Test
	void mediumQuestionsShouldCallMediumAddition() {
		MathGame sut = new MathGame(new MathQuestions());
		MathGame spy = spy(sut);
		
		String input = "8";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
		
		 spy.mediumQuestions();
		
		 verify(spy, times(1)).mediumAddition(anyInt(), anyInt(), anyInt(), anyInt());
	}
}
