package mar0724;

public class Mailperson extends Human {

	public Mailperson(String name) {
		super(name);
	}

	@Override
	void doSomething() {
		System.out.println(name + " delivers mail");
	}

}
