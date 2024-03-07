package mar0724;

public class Mailperson extends Human implements Exerciser {

	public Mailperson(String name) {
		super(name);
	}

	@Override
	void doSomething() {
		System.out.println(name + " delivers mail");
	}

	@Override
	public void run() {
		System.out.println(name + " runs");
	}

	@Override
	public void workOut() {
		System.out.println(name + " didn't forget leg day!");
	}

}
