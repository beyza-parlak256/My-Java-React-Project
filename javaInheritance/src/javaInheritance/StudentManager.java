package javaInheritance;

public class StudentManager {

	public void addStudent(Student student) {
		System.out.println(student.firstName + " " + student.lastName + " kullanıcısı eklendi");
	}
	
	public void updateStudent(Student student) {
		System.out.println(student.firstName + " " + student.lastName + " kullanıcısı güncellendi");
	}
	
	
}
