package javaInheritance;

public class InstructorManager {

	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.firstName + " " + instructor.lastName + " isimli e�itmen eklendi");
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.firstName + " isimli e�itmen" + instructor.courseName + " kursu ekledi");
	}
}
