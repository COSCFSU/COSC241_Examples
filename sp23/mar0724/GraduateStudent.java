package mar0724;

public class GraduateStudent extends Student implements Exerciser {

	public GraduateStudent(String name) {
		super(name);
	}

	public void teachLab() {
		System.out.println(name + " teaches a lab");
	}
	
	// overriding
	public void doSomething() {
		super.doSomething();
		System.out.println(name + " goes to work");
	}
	
	// overloading
	public void doSomething(String thing) {
		doSomething();
		System.out.println(" and then " + thing);
	}

	@Override
	public void run() {
		System.out.println(" This grad student runs!");
	}

	@Override
	public void workOut() {
		System.out.println(name + " works out");
	}
}
