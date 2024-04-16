package apr1624;

import java.util.Arrays;

/**
 * In class example - Vector ("dynamic array")
 * 	This is our array-based list.
 */
public class Vector {

	public static final int DEFAULT_SIZE = 10;
	
	/* Field members */
	private int[] data;
	private int count;
	
	public Vector() {
		count = 0;
		data = new int[DEFAULT_SIZE];
	}
	
	// behavior ---
	// addlast
	public void addLast(int e) {
		if (count >= data.length) {
			// this is we previously threw an exception
			// *resize -- get a new, bigger array
			resize();
		}
		data[count++] = e;
	}
	
	// addfirst
	// insert
	// remlast
	// remfirst
	// remove
	// get
	// clear
	
	/* helper methods --------------------- */
	
	private void resize() {
		int[] dat2 = new int[data.length*2]; // the new array
//		int[] dat2 = new int[data.length+1];
		
		for (int i=0; i<count; i++) {
			dat2[i] = data[i];
		}
		
		data = dat2;
	}
	
	/**
	 * Prints the contents of the Vector to standard output.
	 */
	public void printVector() {
		for (int i=0; i<count-1; i++) {
			System.out.print(data[i] + ", ");
		}
		System.out.println(data[count-1]);
	}
	/* package */ void printArray() {
		for (int i=0; i<data.length-1; i++) {
			System.out.print(data[i] + ", ");
		}
		System.out.println(data[data.length-1]);
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Vector [data=" + Arrays.toString(data) + ", count=" + count + "]";
	}
}
