
public class Course {
	
	public Course(){
		System.out.println("Kursa kay�t oldum.");
	}
	
	public Course(int id, String name, String detail, double price) {
		this(); // this class also runs the one without parameters
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.price = price;
		
	}
	
	int id;
	String name;
	String detail;
	double price;

}
