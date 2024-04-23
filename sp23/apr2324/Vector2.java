package apr2324;

import apr1624.Vector;

public class Vector2 extends Vector {

	/**
	 * Shrink the internal array to avoid wasting memory.
	 */
	public void trim() {
		if (count < data.length) { // if its smaller, then make a new array
			int[] data2 = new int[count];
			
			// loop through data, and copy it all over to data2
			for (int i=0; i<count; i++) {
				data2[i] = data[i];  // just copy it over
			}
			
			data = data2;  // this will replace our array with the new one
		}
	}
}
