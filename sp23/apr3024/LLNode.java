package apr3024;

/* package private */ class LLNode {
	int data; // where we put stuff
	LLNode next;
	
	public LLNode(LLNode next, int data) {
		this.next = next;
		this.data = data;
	}
	
	public LLNode(int data) {
		this.data = data;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LLNode getNext() {
		return next;
	}

	public void setNext(LLNode next) {
		this.next = next;
	}
}
