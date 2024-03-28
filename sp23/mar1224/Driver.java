package mar1224;

public class Driver {

	public static void main(String[] args) {
		Driver ex = new Driver();
		ex.go();
	}
	
	private void go() {
		SortMachine sort = new SortMachine();
		
		int[] arr = {9,8,7,6,5,4};
		sort.bubblesort(arr);
	}

}
