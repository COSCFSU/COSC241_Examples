package apr0224;

public class Sort {

	public void insertion(int[] list) {
		// move left pointer (sort marker) forward ->
		// insert element to the right of that <--

		for (int i = 1; i < list.length; i++) { // unsorted numbers
			int key = list[i]; // the first unsorted number
			int j = i - 1; // the last sorted number

			while (j >= 0 && list[j] > key) {
				list[j + 1] = list[j];
				j = j - 1;
			}
			list[j + 1] = key;
		}
	}

	public void selection(int[] list) {
		for (int i = 0; i < list.length; i++) { // go through array
			int ismall = i; // index of smallest
			for (int j = i; j < list.length; j++) { // find the smallest from the unsorted part
				// find smallest
				if (list[j] < list[ismall]) {
					ismall = j;
				} // ismall now points to the smallest element
			}
			// swap to end of sorted part
			int tmp = list[i];
			list[i] = list[ismall];
			list[ismall] = tmp;
		}
	}

	private int partition(int[] list, int left, int right) {
		int pivot = list[right]; // get last element
		int i = (left - 1);
		
		for (int j=left; j<right; j++) { // one time for every element in this (sub)list
			// if current element is smaller than the pivot value
			if (list[j] < pivot) {
				i++;
				
				// swap
				int tmp = list[i];
				list[i] = list[j];
				list[j] = tmp;
			}
		}
		
		int tmp = list[i+1];
		list[i+1] = list[right];
		list[right] = tmp;
		
		return i+1;
	}

	public void quicksort(int[] list, int left, int right) {
		// base case
		if (left < right) {
			int parti = partition(list, left, right);
			quicksort(list, left, parti - 1);
			quicksort(list, parti + 1, right);
		}

	}
}
