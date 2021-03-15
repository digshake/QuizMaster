package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse237.Question;
import cse237.Quiz;

class QuizTests {

	@Test
	void testAddQuestion() {
		Quiz quizUnderTest = new Quiz("Sample Quiz");
		Question questionUnderTest = new Question("Why did the chicken cross the road?", "bazinga"); //setup
		assertTrue(quizUnderTest.getNumberOfQuestions() == 0);
		quizUnderTest.addQuestion(questionUnderTest);
		assertTrue(quizUnderTest.getNumberOfQuestions() == 1);
	}
	
	

}
