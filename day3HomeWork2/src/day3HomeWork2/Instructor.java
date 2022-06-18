package day3HomeWork2;

public class Instructor extends User {

	private String coursesGiven;

	public Instructor() {

	}

	public Instructor(String courseGiven, int id, String firstName, String lastName, String email, String password) {
		super(id, firstName, lastName, email, password);
		this.coursesGiven = courseGiven;
	}

	public String getCoursesGiven() {
		return coursesGiven;
	}

	public void setCoursesGiven(String coursesGiven) {
		this.coursesGiven = coursesGiven;
	}

}
