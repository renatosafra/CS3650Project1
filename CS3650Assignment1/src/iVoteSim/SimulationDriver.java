package iVoteSim;

import java.util.*;

public class SimulationDriver {
	public static void main(String[] args) {
        // make a MCQ
		String MCQuestion = "What is the capital of France?";
		String SCQuestion = "Is Java a programming language?";
        List<String> mcqAnswers = Arrays.asList("A", "B", "C", "D");
        Question multipleChoiceQuestion = new MultipleChoiceQuestion(MCQuestion, mcqAnswers);

        // make a SCQ
        List<String> scqAnswers = Arrays.asList("1. Right", "2. Wrong");
        Question singleChoiceQuestion = new SingleChoiceQuestion(SCQuestion, scqAnswers);

        // configure the question for service for MCQ
        VotingService votingServiceMCQ = new VotingService(multipleChoiceQuestion);

        // configure question for service for SCQ
        VotingService votingServiceSCQ = new VotingService(singleChoiceQuestion);
        
        
        // generate students and submit answers to service for MCQ
        List<Student> students = generateStudents(30, multipleChoiceQuestion); //30 students
        for (Student student : students) {
            votingServiceMCQ.submitAnswer(student);
        }

        // generate students and submit answers to service for SCQ
        
        students = generateStudents(30, singleChoiceQuestion);
        for (Student student : students) {
            votingServiceSCQ.submitAnswer(student);
        }
        // display results
        System.out.println("Results for \"" + MCQuestion + "\": ");
        votingServiceMCQ.output();
        System.out.println();
        System.out.println("Results for \"" + SCQuestion + "\": ");
        votingServiceSCQ.output();
    }
	
	private static List<Student> generateStudents(int numStudents, Question question) {
        List<Student> students = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < numStudents; i++) {
            //make studentID
            String id = "S" + i;

            //generate a random answer
            List<String> answers = question.getAnswers();
            String answer = answers.get(random.nextInt(answers.size()));

            students.add(new Student(id, answer));
        }

        return students;
    }
}