package iVoteSim;

import java.util.List;

//question class for the question and answers attached to it
public abstract class Question {
	protected String question;
	protected List<String> answers;
	
	public Question() {
	}

	public Question(String question, List<String> answers) {
		this.question = question;
		this.answers = answers;
	}

	public abstract boolean isAnswerValid(String answer);

	public String getQuestion() {
		return question;
	}	

	public List<String> getAnswers() {
		return answers;
	}
}
