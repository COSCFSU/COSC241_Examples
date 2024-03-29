package mar0724;

public class Driver {

	public static void main(String[] args) {
		Driver mar7 = new Driver();
		
		mar7.runHumanExample();
	}

	/**
	 * Examples for inheritance, abstraction, polymorphism
	 */
	private void runHumanExample() {
//		Human guy = new Human();  <- doesn't work
		
//		Student guy = new Student();
		Human guy = new Student("Zach");  // <-- polymorphism
		Human gal = new Mailperson("Amanda");
//		Human tiger = new Tiger();  // <-- impossible
		
		
		guy.doSomething();  // <-- polymorphism too
		gal.doSomething();  // <-- polymorphism too
		
		guy = new GraduateStudent("Harvey (grad)");
		GraduateStudent gradStu1 = new GraduateStudent("Kemarsh");

		guy.doSomething();
//		guy.teachLab();  // <-- Humans can't do this
		
		gradStu1.teachLab();
		
		GraduateStudent gradGuy = (GraduateStudent) guy;
		gradGuy.teachLab();
		gradGuy.doSomething("goes to a party");
		
		
		// interface examples
		gradStu1.run();
		gradStu1.workOut();
		
		Mailperson mailgal = (Mailperson) gal;
		mailgal.run();
		mailgal.workOut();
		
		Exerciser person1 = new Mailperson("Gavin");
		Tiger ti = new Tiger();
		person1.workOut();
		person1 = (Exerciser) gal;
		person1.workOut();
		person1 = ti;
		person1.run();
	}

}
