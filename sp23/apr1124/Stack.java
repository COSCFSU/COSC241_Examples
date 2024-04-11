package apr1124;

/**
 * Class implementation of a Stack.
 * 	!Pro tip: Know this inside and out.
 */
public class Stack {

	// constant value
	public static final int DEFAULT_SIZE = 10;
	
	// list
	private String[] data;
	private int count;
	
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
		if (count >= data.length) {
			System.err.println("Whoopsie!");
			throw new ArrayIndexOutOfBoundsException();
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
		
		for (int i=0; i<data.length; i++) {
			if (i == count) {
				list += "|";
			}
			list += data[i] + " ";
		}
		return list;
	}
}
