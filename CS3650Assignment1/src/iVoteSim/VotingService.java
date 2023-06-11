package iVoteSim;

import java.util.HashMap;
import java.util.Map;

public class VotingService {
	
    private Question question;
    private Map<String, Student> submissions;

    public VotingService(Question question) {
        this.question = question;
        this.submissions = new HashMap<>();
    }

    public void submitAnswer(Student student) {
    	if (submissions.containsKey(student.getId())) {
            // update the answer of student if they already have an answer
            submissions.put(student.getId(), student);
        } else {
            // add answer to students answer for the first time
            submissions.put(student.getId(), student);
        }
    }

    public void output() {
        Map<String, Integer> answerCounts = new HashMap<>();

        //counts the amount of times the answer is put
        for (Student student : submissions.values()) {
            String answer = student.getAnswer();
            answerCounts.put(answer, answerCounts.getOrDefault(answer, 0) + 1);
        }

        //prints out the answer and the amount of times its been chosen
        for (String answer : answerCounts.keySet()) {
            int count = answerCounts.get(answer);
            System.out.println(answer + " : " + count);
        }
    }
}