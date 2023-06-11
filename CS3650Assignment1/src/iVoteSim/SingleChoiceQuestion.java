package iVoteSim;

import java.util.List;

//for SC questions
public class SingleChoiceQuestion extends Question {
	
	public SingleChoiceQuestion(String question, List<String> answers) {
		super(question, answers);
	}

	@Override
	public boolean isAnswerValid(String answer) {
		return answers.contains(answer);
	}
}
