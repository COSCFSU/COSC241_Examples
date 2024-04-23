package apr2324;

public class LinkedList {

	private LLNode head;
	private int count;
	
	public LinkedList() {
		head = null;
		count = 0;
	}
	
	public void addFirst(int e) {
		if (count == 0) {
			LLNode nd = new LLNode(e, null);
			head = nd;
		} else {
			LLNode nd = new LLNode(e, head);
			head = nd;
		}
		count++;
	}
}
