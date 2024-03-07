package mar0724;

public abstract class Human {

	protected String name;
	protected int age;
	
//	private boolean fly() {
//		return false;
//	}
	
	public Human(String name) {
		this.name = name;
	}
	
	abstract void doSomething();
	
	public void exampleInAbstractClass() {
		System.out.println(name + "!");
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
