package apr1824;

/**
 * Generic version of a stack.
 */
public class Stack<T> {

	// constant value
	public static final int DEFAULT_SIZE = 10;
	
	// list
	private T[] data;
	private int count; // number of elements in this stack
	
	/**
	 * Constructor.  Makes a stack, sets up the default list.
	 */
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		data = (T[])new Object[size];
		count = 0;
	}
	
	/**
	 * Default constructor.  If user doesn't give us a size, we'll pick the default size.
	 */
	public Stack() {
		this(DEFAULT_SIZE);
	}
	
	public void push(T e) {
		if (count >= data.length) { // we don't have any spaces left
			System.out.println("!Can't add element " + e);
			throw new ArrayIndexOutOfBoundsException();
		}
		data[count++] = e;
	}
	
	public T pop() {
		T e = data[--count];
		return e;
	}
}
