package iVoteSim;

import java.util.List;

// for MC questions
public class MultipleChoiceQuestion extends Question {

	public MultipleChoiceQuestion(String question, List<String> answers) {
		super(question, answers);
	}

	@Override
	public boolean isAnswerValid(String answer) {
		return answers.contains(answer);
	}
}
