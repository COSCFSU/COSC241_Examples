package feb2724;

/**
 * Holds a bunch of Students and prints them out.
 */
public class Classroom {

	// attributes ("fields")
	private Student[] allStudents;
	private int count;
	
	public Classroom(int n) {
		allStudents = new Student[n];
		count = 0;  // even though we know it defaults to zero, 
					// 	good programming principles says to do this anyway
	}
	
	public void addStudent(Student stu) {
		if (count >= allStudents.length) {
			System.err.println("Cannot add more students to this classroom");
			return;
		}
		allStudents[count] = stu;
		count +=1;
	}
	
	public Student findStudent(String name) {
		
		return null;
	}
	
	/**
	 * Prints all the elements from the classroom's array
	 */
	public void printClassroom() {
		for (int i=0; i<allStudents.length; i++) {
			System.out.println(allStudents[i]);
		}
	}
}
