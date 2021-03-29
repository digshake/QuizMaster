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
	
	public void displayQuizzes() {
		for(int i = 0; i < quizzes.size(); i++) {
			System.out.println(i + 1 + ": " + quizzes.get(i).getName());
		}
	}
	
	public int getNumberOfQuizzes() {
		return this.quizzes.size();
	}
	
	public Quiz getQuiz(int index) {
		return this.quizzes.get(index);
	}
}
