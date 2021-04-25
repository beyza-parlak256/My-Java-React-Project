import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C# - Angular", "C# ve Angular ile programlama",0);
		Course course2 = new Course(2,"Java - React", "Java ve React ile programlama",0);
		Course course3 = new Course(3,"Programlamaya Giri� ��in Temel Kurs", "PYTHON, JAVA, C# ile programlama",0);
		
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println(course.name);	
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		
		Instructor instructor1 = new Instructor(1,"Engin","Demiro�","Yaz�l�m geli�tirmeye lisede 'yaz�l�m' b�l�m�nde okurken ba�lad�m.");
		Instructor instructor2 = new Instructor(2,"Beyza","Parlak","Yaz�l�m geli�tirmeye �niversitede 'bilgisayar m�hendisli�i' b�l�m�nde okurken ba�lad�m.");
		
		Instructor[] instructors = {instructor1, instructor2};
		
		for (Instructor instructor : instructors) {
			System.out.println(instructor.name);	
		}
		
	}

}
