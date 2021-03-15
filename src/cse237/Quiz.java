package cse237;

import java.util.ArrayList;

public class Quiz {

	private String name;
	private ArrayList<Question> questions;
	
	public Quiz(String name) {
		this.name = name;
		this.questions = new ArrayList<Question>();
	}
	
	public void addQuestion(Question addMe) {
		questions.add(addMe);
	}
	
	public int getNumberOfQuestions() {
		return questions.size();
	}
	
	
}
