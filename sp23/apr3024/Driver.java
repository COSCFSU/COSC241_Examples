package apr3024;

public class Driver {

	public static void main(String[] args) {
		Driver apr30 = new Driver();
		
		apr30.runLLExample1();
	}

	private void runLLExample1() {
		LinkedList list = new LinkedList();
		
		list.addFirst(1);
		list.addFirst(5);
		list.addFirst(99);
	}
}
