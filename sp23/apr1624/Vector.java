package apr1624;

import java.util.Arrays;

/**
 * In class example - Vector ("dynamic array") This is our array-based list.
 */
public class Vector {

	public static final int DEFAULT_SIZE = 10;

	/* Field members */
	protected int[] data;
	protected int count;

	public Vector() {
		this(DEFAULT_SIZE);
	}
	
	public Vector(int size) {
		count = 0;
		data = new int[size];
	}
	
	public Vector(int[] data) {
		int[] dat2 = new int[data.length];
		
		for (int i=0; i<data.length; i++) {
			dat2[i] = data[i];
		}
		data = dat2;
	}

	/**
	 * Add an element to the end of the Vector.
	 * 	Best: O(1)
	 *  Worst: O(n)
	 *  Avg: O(lg n)
	 * @param e
	 */
	public void addLast(int e) {
		if (count >= data.length) {
			// this is we previously threw an exception
			// *resize -- get a new, bigger array
			resize();
		}
		data[count++] = e;
	}
	
	public void addLastBy1(int e) {
		if (count >= data.length) {
			resizeBy1();
		}
		data[count++] = e;
	}

	/**
	 * Add an element to the front of the array
	 * O(n)
	 * @param e
	 */
	public void addFirst(int e) {
		if (count >= data.length) {
			resize();
		}
			
		for (int i = count; i > 0; i--) {
			data[i] = data[i-1];
		}
		data[0] = e;
		count = count + 1; // we added an element, so count increases
	}
	
	/**
	 * Insert element at specified index.
	 * @param e element
	 * @param idx index to insert
	 */
	public void insert(int e, int idx) {
		if (idx >= count) {
			System.out.println("!Can't insert at index " + idx);
			return;
		}
		
		if (count >= data.length) {
			resize();
		}

		
		for (int i = count; i > idx; i--) {
			data[i] = data[i-1];
		}
		
		data[idx] = e;
		count = count + 1; // we added an element, so count increases
	}
	
	// remlast
	// remfirst
	// remove
	// get
	/**
	 * Return element at this index.
	 * @param idx
	 */
	public int get(int idx) {
		if (idx < count && idx >= 0) {
			return data[idx];
		}
		return -1;
	}
	
	// clear

	/* helper methods --------------------- */

	private void resize() {
		int[] dat2 = new int[data.length * 2]; // the new array

		for (int i = 0; i < count; i++) {
			dat2[i] = data[i];
		}

		data = dat2;
	}

	private void resizeBy1() {
		int[] dat2 = new int[data.length + 1];
		
		for (int i = 0; i < count; i++) {
			dat2[i] = data[i];
		}

		data = dat2;
	}
	
	public Vector copy(Vector vOld) {
		Vector vNew = new Vector(vOld.data);
		
		return vNew;
	}

	/**
	 * Prints the contents of the Vector to standard output.
	 */
	public void printVector() {
		for (int i = 0; i < count - 1; i++) {
			System.out.print(data[i] + ", ");
		}
		System.out.println(data[count - 1]);
	}

	/* package */ void printArray() {
		for (int i = 0; i < data.length - 1; i++) {
			System.out.print(data[i] + ", ");
		}
		System.out.println(data[data.length - 1]);
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Vector [data=" + Arrays.toString(data) + ", count=" + count + "]";
	}
}
