package apr3024;

import java.util.NoSuchElementException;

import may0224.RandomMadeUpException;

public class LinkedList {
	private LLNode head;
	private LLNode tail;
	private int count;

	public LinkedList() {
//		head = null;
//		tail = null;
		head = tail = null; // optional new syntax
		count = 0;
	}

	public void addFirst(int e) {
		if (count == 0) {
			LLNode nd = new LLNode(e);
			head = tail = nd;
		} else {
			LLNode nd = new LLNode(head, e);
			head = nd;
		}
		count += 1;
	}

	public void addLast(int e) {
		if (count == 0) {
			LLNode nd = new LLNode(e);
			head = tail = nd;
		} else { // list is not empty
			// make last node point to new node
			LLNode nd = new LLNode(e);
			tail.setNext(nd);
			tail = nd;
		}
		count += 1;
	}

	/**
	 * Insert element e ant position i
	 * 
	 * @param e
	 * @param i
	 */
	public void insert(int e, int i) {
		// defensive programming
		// what if i is negative or too large?
		if (i < 0 || i >= count) {
			System.err.println("Sorry can't insert at index " + i);
//			throw new ArrayIndexOutOfBoundsException();
			return;
		}

		if (count == 0 || count == 1) {
			addFirst(e);
		} else { // main situation
			// find left node
			int c = i - 1;
			LLNode current = head;
			while (c > 0) {
				current = current.getNext();
				c = c - 1;
			}
			// make new node
			// new.next = right node
			LLNode nd = new LLNode(current.getNext(), e);
			// left.next = new node
			current.setNext(nd);
		}

		// also, are there edge cases? count == 0? count == 1? count == a lot????
	}

	public int removeFirst() {
		if (count == 0) {
			throw new NoSuchElementException();
		} else {
			count = count - 1;
			int value = head.getData();
			head = head.getNext();
			return value;
		}
	}
	
	// removeLast
	public int removeLast() {
		if (count == 0) {
			throw new NoSuchElementException();
		} else {
			LLNode current = head;
			while(current.getNext() != tail) {
				current = current.getNext();
			}
			int value = tail.getData();
			current.setNext(null);
			tail = current;
			return value;
		}
	}
	
	/**
	 * Remove the ith element and return it.
	 * @param i index
	 * @return element i, if it exists
	 */
	public int remove(int i) {
		if (count <= 0 || i < 0 || i >= count) {
			throw new RandomMadeUpException();
		} else if (i == 0) {
			return removeFirst();
		} else {
			LLNode left = head;
			LLNode nd;
			for (int j=0; j<i-1; j++) {
				// iterate i up at the end
				left = left.getNext();
			}
//			System.out.println("?:"+left.getData());
			nd = left.getNext();
			left.setNext(nd.getNext());
		
			return nd.getData();
		}
	}
	
	/**
	 * Prints the list out
	 */
	public void printList() {
		LLNode current = head;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
	
	public void putEvenNumbersAtTheEnd() {
		LinkedList q = new LinkedList();
		// while loop to find evens
		LLNode left = head;
		while(left.getNext() != null) {
			LLNode nd = left.getNext();
			if(nd.getData() % 2 == 0) { // is it even
				q.addLast(nd.getData());
				left.setNext(nd.getNext());
			}
			
			left = left.getNext();
		}
		
		// now put the q elements back into this list
		left = q.head;
		while(left != null) {
//			System.out.println(left.getData());
			addLast(q.removeFirst());
			left = left.getNext();
		}
		
		
		printList();
		q.printList();
	}

}
