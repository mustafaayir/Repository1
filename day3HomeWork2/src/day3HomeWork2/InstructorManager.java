package day3HomeWork2;

public class InstructorManager extends UserManager {

	public void sellCourse(Instructor instructor) {
		System.out.println(instructor.getFullName() + " isimli egitmen " + instructor.getCoursesGiven()
				+ " isimli kursu satisa sundu.");
	}

}
