package day3HomeWork2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor("JAVA + REACT", 1, "Engin", "DEMIROG", "email", "0000");
		
		Student student = new Student("JAVA GIRIS",1,"Mustafa","AYIR","email","1234");
		
		UserManager userManager = new UserManager();
		userManager.list(instructor);;
		userManager.list(student);
		
		System.out.println("");
		
		InstructorManager instructorManager = new InstructorManager();
		userManager.add(instructor);
		userManager.login(instructor);
		instructorManager.sellCourse(instructor);
		userManager.exit(instructor);
		
		System.out.println("");
		
		StudentManager studentManager = new StudentManager();
		userManager.add(student);
		userManager.login(student);
		studentManager.buyCourse(student);
		userManager.exit(student);
		
		

	}

}
