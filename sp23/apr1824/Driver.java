package apr1824;

public class Driver {

	public static void main(String[] args) {
		Driver apr18 = new Driver();
		
		apr18.runStackExample();
	}

	private void runStackExample() {
		Stack<String> s = new Stack<>();
		
		s.push("A");
		s.push("B");
		s.push("C");
		
		String x = s.pop();
		
		System.out.println(x);
	}

}
