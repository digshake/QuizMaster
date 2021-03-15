package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cse237.Quiz;
import cse237.QuizManager;

class QuizManagerTests {

	@Test
	void testAddQuizToManager() {
		QuizManager quizManagerUnderTest = new QuizManager();
		Quiz quizUnderTest = new Quiz("Sample Quiz");
		assertTrue(quizManagerUnderTest.getNumberOfQuizzes() == 0);
		quizManagerUnderTest.addQuiz(quizUnderTest);
		assertTrue(quizManagerUnderTest.getNumberOfQuizzes() == 1);	
	}

}
