package apr1124;

public class Driver {

	public static void main(String[] args) {
		Driver apr11 = new Driver();
		
//		apr11.runStackExample1();
		apr11.runQueueExample1();
	}

	private void runQueueExample1() {
		Queue q = new Queue();
		int[] examples = new int[] {1,2,3,4,5};
		
		for (int i=0; i<examples.length; i++) {
			q.enq(examples[i]);
		}
		
		System.out.println(q);
		
		for (int i=0; i<3; i++) {
			int first = q.deq();
			System.out.println("Dequeued " + first);
		}
		System.out.println(q);
		
		examples = new int[] {10, 11, 12, 13};
		for (int i=0; i<examples.length; i++) {
			q.enq(examples[i]);
		}
		System.out.println(q);
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
