package apr1124;

/**
 * Class implementation of an array-based queue.
 * 	!Pro tip: Know this inside and out (along with stack)
 */
public class Queue {

	public static final int DEFAULT_SIZE = 10;

	// list
	private int[] data;
	private int count;

	/**
	 * Constructor
	 * 
	 * @param size
	 */
	public Queue(int size) {
		data = new int[size];
		count = 0;
	}

	/**
	 * Default constructor
	 */
	public Queue() {
		this(DEFAULT_SIZE);
	}

	/**
	 * Add an element to the end of the queue.
	 * 
	 * @param e the element to add
	 */
	public void enq(int e) {
		if (count >= data.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		data[count++] = e;
	}

	/**
	 * Remove the first element from the beginning of the queue.
	 * 
	 * @return first element
	 */
	public int deq() {

		int first = data[0]; // first element
		count = count - 1;
		// everyday I'm shufflin'
		for (int i = 0; i < count; i++) {
			data[i] = data[i + 1];
		}

		return first;
	}

	/**
	 * Return (but not remove) the first element
	 * @return first element
	 */
	public int first() {
		return data[0];
	}

	public int getCount() {
		return count;
	}
	
	public String toString() {
		String s = "";
		
		for(int i=0; i<count; i++) {
			s += data[i] + " ";
		}
		
		return s;
	}
}
