package feb2724;

/**
 * Represents a random student at FSU.  Doesn't do much.
 * 
 * @author sdkennedy + friends
 */
public class Student {

	// fields
	private String name;
	private String major;
	private int age;
	private double gpa; // this one really isn't used.
	
//	int count;
	
	/* Constructor -------------------------- */
	public Student(String name, String major, int age) {
		this.name = name;
		this.major = major;
		this.age = age;
		
		gpa = 3.0;
	}
	
	
	// methods
	public void play(String sport) {
		System.out.println(name + " starts playing " + sport);
	}
	
	public void study() {
		System.out.println(name + " starts studying... ");
		System.out.println("Studying was super effective!");
		gpa += 0.5;
		System.out.println(name + "'s GPA went up to " + gpa);
	}
	
	// getters and setters
	public String getName() {
//		System.out.println("You got the name!");
//		count += 1;
		return name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	// no set age
	// no set/get gpa
	
	public String toString() {
		String mystr = name + ":" + major;
		
		return mystr;
	}
}
