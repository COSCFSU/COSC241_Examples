package mar0724;

public class Student extends Human {

	public Student(String name) {
		super(name);
	}

	@Override
	public void doSomething() {
		System.out.println(name + " studies.");
	}


}
