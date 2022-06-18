package day3HomeWork2;

public class Student extends User {

	private String coursesTaken;

	public Student() {

	}

	public Student(String coursesTaken, int id, String firstName, String lastName, String email, String password) {
		super(id, firstName, lastName, email, password);
		this.coursesTaken = coursesTaken;
	}

	public String getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(String coursesTaken) {
		this.coursesTaken = coursesTaken;
	}

}
