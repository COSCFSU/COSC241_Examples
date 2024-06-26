package apr1124;

/**
 * Class implementation of a Stack.  (This implementation is an array-based stack).
 * 	!Pro tip: Know this inside and out.
 */
public class Stack {

	// constant value
	public static final int DEFAULT_SIZE = 10;
	
	// list
	private String[] data;
	private int count; // number of elements in this stack
	
	/**
	 * Constructor.  Makes a stack, sets up the default list.
	 */
	public Stack(int size) {
		data = new String[size];
		count = 0;
	}
	
	/**
	 * Default constructor.  If user doesn't give us a size, we'll pick the default size.
	 */
	public Stack() {
		this(DEFAULT_SIZE);
	}

	/**
	 * Push an element onto the stack.  Throws an exception if the inner array is full.
	 * @param e the element
	 */
	public void push(String e) { // e stands for "element"
		if (count >= data.length) {			// 1
			System.err.println("Whoopsie!"); // 1
			throw new ArrayIndexOutOfBoundsException(); //1
		}
		data[count++] = e;  //count = count + 1;
	}
	
	
	/**
	 * Removes and returns the top element of the stack.
	 * @return what was on top
	 */
	public String pop() {
		
		String top = data[--count];
		// erase what's on top?  Not usually.
		return top;
		// return data[--count];
	}
	
	/**
	 * Returns the top element of the stack (without removing).
	 * @return
	 */
	public String top() {
		String top = data[count-1]; // this does not change count
		return top;
	}
	
	// count accessor
	public int getCount() {
		return count;
	}
	
	public String toString() {
		String list = "";
		
		// Note: this toString prints the whole data array, not just the stack.
		//		This is for example purposes.  A real stack should only print the stack.
		for (int i=0; i<data.length; i++) {
			if (i == count) {
				list += "|";
			}
			list += data[i] + " ";
		}
		return list;
	}
}
