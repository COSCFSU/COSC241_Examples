package may0224;

import apr3024.LinkedList;

/**
 * Manipulate a linked list
 */
public class Example {

	public static void main(String[] args) {

		Example ex = new Example();
		
		ex.runTest1(20);
		
	}
	


	private void runTest1(int n) {
		LinkedList list = new LinkedList();
		for(int i=0; i<n; i++) {
			list.addLast(i);
		}
		
//		list.printList();
		
//		System.out.println("rem:"+list.remove(20));
//		
//		list.printList();
		
		list.putEvenNumbersAtTheEnd();
	}

}
