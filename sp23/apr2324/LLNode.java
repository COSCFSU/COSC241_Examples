package apr2324;

class LLNode {
	private int data;
	private LLNode next; // reference to the next element
	
	public LLNode(int data, LLNode next) {
		this.data = data;
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public LLNode next() {
		return next;
	}
	
	public void setNext(LLNode next) {
		this.next = next;
	}
}
