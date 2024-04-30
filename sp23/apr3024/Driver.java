package apr3024;

public class Driver {

	public static void main(String[] args) {
		Driver apr30 = new Driver();
		
//		apr30.runLLExample1();
//		apr30.runLLtest1();
		apr30.runLLtest2();
	}

	private void runLLtest2() {
		LinkedList list = new LinkedList();
		
		for (int i=0; i<10; i++) {
			list.addLast(i+1);
		}
		
		list.printList();
		
		System.out.println(list.removeLast());
		list.printList();
		System.out.println(list.removeLast());
		list.printList();
		System.out.println(list.removeLast());
		list.printList();
		System.out.println(list.removeLast());
		list.printList();
		
		System.out.println(list.removeFirst());
		list.printList();
		System.out.println(list.removeFirst());
		list.printList();
		System.out.println(list.removeFirst());
		list.printList();
		System.out.println(list.removeFirst());
		list.printList();
	}

	private void runLLtest1() {
		LinkedList list = new LinkedList();
		list.insert(999, -1);
		list.insert(999, 10);
		
		list.addFirst(9);
		list.insert(-1, 0);
		
		list.printList();
	}

	private void runLLExample1() {
		LinkedList list = new LinkedList();
		
		list.addFirst(1);
		list.addFirst(5);
		list.addFirst(99);
		
		list.printList();
		
		list.addLast(7);
		list.addLast(77);
		list.addLast(777);
		
		list.printList();
		
		list.insert(0, 3);
		list.printList();


	}
}
