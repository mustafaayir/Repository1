package day3HomeWork2;

public class StudentManager extends UserManager {

	public void buyCourse(Student student) {
		System.out.println(
				student.getFullName() + " isimli ogrenci " + student.getCoursesTaken() + " isimli kursu satın aldı.");
	}

}
