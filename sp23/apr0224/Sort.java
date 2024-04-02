package apr0224;

public class Sort {

	public void insertion(int[] list) {
		// move left pointer (sort marker) forward ->
		//	insert element to the right of that <--
		
		for (int i=1; i < list.length; i++) { // unsorted numbers
			int key = list[i]; // the first unsorted number
			int j = i-1; // the last sorted number
			
			while(j >= 0 && list[j] > key) {
				list[j+1] = list[j];
				j = j-1;
			}
			list[j+1] = key;
		}
	}
}
