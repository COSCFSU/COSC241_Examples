package may0224;

import apr3024.LinkedList;

/**
 * Manipulate a linked list
 */
public class Example {

	public static void main(String[] args) {
		// for loop/ while loop
		// 	if even numbers, take them out, and put them in a separate queue
		// after that, put all the numbers from the other queue, back into the end of the list
		Example ex = new Example();
		
//		ex.runTest1(20);
	}
	
	private void runTest1(int n) {
		LinkedList list = new LinkedList();
		for(int i=0; i<n; i++) {
			list.addLast(i);
		}
		
		list.printList();
		
		System.out.println("rem:"+list.remove(20));
		
		list.printList();
	}

}
