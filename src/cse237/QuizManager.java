package cse237;

import java.util.ArrayList;

public class QuizManager {

	private ArrayList<Quiz> quizzes;
	
	public QuizManager() {
		this.quizzes = new ArrayList<Quiz>();
	}
	
	public void addQuiz(Quiz addMe) {
		this.quizzes.add(addMe);
	}
	
	public int getNumberOfQuizzes() {
		return this.quizzes.size();
	}
}
