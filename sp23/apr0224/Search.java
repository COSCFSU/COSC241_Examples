package apr0224;

public class Search {

	/**
	 * Sequential search for t.  Returns index of t or -1.
	 * @param list the data
	 * @param t the search target
	 * @return
	 */
	public int sequential(int[] list, int t) {
		if (list == null || t < 0 || t >= list.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		for (int i=0; i<list.length; i+=1) {
			if (list[i] == t) {
				return i; // the index
			}
		} // end of the loop
		
		// not found
		return -1;
	}
	
	/**
	 * A recursive binary search.  (Helper method)
	 * @param list some numbers
	 * @param t search target
	 * @return
	 */
	public int binarySearch(int[] list, int t) {
		return binarySearch(list, t, 0, list.length-1);
	}
	
	private int binarySearch(int[] list, int t, int left, int right) {
		if ((list == null) || (t < 0) || (t >= list.length)) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		// base case
		if (left > right) { // not found
			return -1;
		}
		
		// pick the middle
		int mid = left + ((right - left) / 2);
		
		// compare mid to t
		if (list[mid] == t) { // found it!
			return mid;
		} else if (t < list[mid]) { // if less than, look on left half
			return binarySearch(list, t, left, mid-1);
		} else { // if greater than, look on right
			return binarySearch(list, t, mid+1, right);
		}
		
	}
}
