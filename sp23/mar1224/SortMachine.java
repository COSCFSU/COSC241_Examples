package mar1224;

import java.util.Arrays;

public class SortMachine {

	public void bubblesort(int[] list) {
		// iterate through the array (once for each number)
		for (int i=0; i<list.length; i++) {
			// iterate through the array (the bubble)
			for (int bub=0; bub<list.length-1; bub++) {
				// compare 2 numbers
				if (list[bub] > list[bub+1]) {
					// swap
					int tmp = list[bub];
					list[bub] = list[bub+1];
					list[bub+1] = tmp;
				}
			}  // end bubble
//			System.out.println(Arrays.toString(list));
			System.out.println(list);
		}
		System.out.println(Arrays.toString(list));

	}
}
