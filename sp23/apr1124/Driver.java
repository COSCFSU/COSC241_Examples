package apr1124;

public class Driver {

	public static void main(String[] args) {
		Driver apr11 = new Driver();
		
		apr11.runStackExample1();
	}

	private void runStackExample1() {
		Stack stack = new Stack();
		
		String example = "ABCDEF";
		for (int i=0; i<example.length(); i=i+1) {
			stack.push(Character.toString(example.charAt(i)));
		}
		
		for (int i=0; i<5; i++) {
			String s = stack.pop();
			System.out.println("Popped " + s);
		}
		
		System.out.println(stack);
		example = "XYZ";
		for (int i=0; i<example.length(); i=i+1) {
			stack.push(Character.toString(example.charAt(i)));
		}
		
		System.out.println("Top:" + stack.top());
		System.out.println(stack);
	}

}
