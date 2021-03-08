package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse237.Question;

class QuestionTests {

	@Test
	void testQuestionCheckAnswerCorrect() {
		Question q = new Question("Why did the chicken cross the road?", "bazinga"); //setup
		boolean correct = q.checkAnswer("bazinga"); //test a method
		assertTrue(correct); //check for correctness
	}
	
	@Test
	void testQuestionCheckAnswerIncorrect() {
		Question q = new Question("Why did the chicken cross the road?", "bazinga"); //setup
		boolean correct = q.checkAnswer("bok"); //test a method
		assertFalse(correct); //check for correctness
	}

}
