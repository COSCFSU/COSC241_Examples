package apr3024;

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
			
}
