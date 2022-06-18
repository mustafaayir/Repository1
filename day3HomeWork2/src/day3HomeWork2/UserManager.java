package day3HomeWork2;

public class UserManager  {

	public void add(User user) {
		System.out.println(user.getFullName() + " adl� kisi sisteme kaydedildi.");
	}

	public void list(User user) {
		System.out.println("Kullanici: " + user.getFullName());
	}

	public void login(User user) {
		System.out.println(user.getFullName() + " sisteme giris yapti.");
	}

	public void exit(User user) {
		System.out.println(user.getFullName() + " sistemden cikis yapti.");
	}
	
	//--------------------Student----------------------
	//--------------------------------------------------
	//--------------------------------------------------
	//--------------------------------------------------
	//--------------------------------------------------

	public void add(Student student) {
		System.out.println(student.getFullName() + " adl� ogrenci sisteme kaydedildi.");
	}

	public void list(Student student) {
		System.out.println("Ogrenci: " + student.getFullName());
	}

	public void login(Student student) {
		System.out.println(student.getFullName() + " adl� ogrenci sisteme giris yapti.");
	}

	public void exit(Student student) {
		System.out.println(student.getFullName() + " adl� ogrenci sistemden cikis yapti.");
	}
	
	//------------------Instructor----------------------
	//--------------------------------------------------
	//--------------------------------------------------
	//--------------------------------------------------
	//--------------------------------------------------

	public void add(Instructor instructor) {
		System.out.println(instructor.getFullName() + " adl� ogretmen sisteme kaydedildi.");
	}

	public void list(Instructor instructor) {
		System.out.println("Ogretmen: " + instructor.getFullName());
	}

	public void login(Instructor instructor) {
		System.out.println(instructor.getFullName() + " adl� ogretmen sisteme giris yapti.");
	}

	public void exit(Instructor instructor) {
		System.out.println(instructor.getFullName() + " adl� ogretmen sistemden cikis yapti.");
	}
}
