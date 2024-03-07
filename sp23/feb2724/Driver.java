package feb2724;

/**
 * Demo's the Student and Classroom classes.
 */
public class Driver {

	public static void main(String[] args) {
		Driver feb27 = new Driver();
		
//		feb27.runStudentBattle("Cristian", "Zach");
//		feb27.runStudentBattle("Ethan", "Kamden");
		
		feb27.runClassroomExample();
	}
	
	public void runClassroomExample() {
		Classroom ccit270 = new Classroom(5);
		
		Student s1 = new Student("Mario", "Mushroom Science", 20);
		Student s2 = new Student("Peach", "Cake Science", 20);
		Student s3 = new Student("Luigi", "Ghost Engineering", 20);
		Student s4 = new Student("Toad", "Exploration", 10);
		Student s5 = new Student("Yoshi", "Eating", 20);
		Student s6 = new Student("Wario", "Evil Science", 21);
		ccit270.addStudent(s1);
		ccit270.addStudent(s2);
		ccit270.addStudent(s3);
		ccit270.addStudent(s4);
		ccit270.addStudent(s5);
		ccit270.addStudent(s6);
		
//		ccit270.printClassroom();
		
		// now find
		System.out.println("Finding student...");
		String target = "Wario";
		Student foundStudent = ccit270.findStudent(target);
		System.out.println(foundStudent);
	}
	
	public void runStudentBattle(String n1, String n2) {
		Student stu1 = new Student(n1, "Art", 20);
		Student stu2 = new Student(n2, "Philosophy", 21);
			
		System.out.println("Studentmon Battle Start!");
		System.out.println(stu1);
		System.out.println("\tVS");
		System.out.println(stu2);
		
		System.out.println();
		stu1.play("Cricket");
		stu2.study();
	}
}
