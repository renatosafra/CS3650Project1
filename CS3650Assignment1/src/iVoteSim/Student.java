package iVoteSim;

public class Student {

	private String id;
    private String answer;
    
    //default constructor for student
    public Student() {
    }
    //constructor with given id
    public Student(String id) {
    	this.id = id;
    }
    //constructor with given id and answer
    public Student(String id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    //returns id of student
    public String getId() {
        return id;
    }
    //returns answer of student
    public String getAnswer() {
        return answer;
    }
}