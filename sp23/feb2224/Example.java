package feb2224;

public class Example {

	public void run2dArrayExample() {
		int[] arr = new int[11];
//		String[] arr2 = new String[111];
//		
//		int[][] arr2d = new int[11][11];
//		int[][][] arr3d = new int[11][11][11];
		
		char[][] ttt = new char[3][3];
		
		ttt[1][1] = 'x';
		ttt[1][0] = 'o';
		ttt[2][1] = 'x';
		ttt[0][0] = 'o';
		ttt[0][1] = 'x';
		
		System.out.println(arr);
		System.out.println(ttt);
		
		print(ttt);
	}
	
	/**
	 * Makes a multiplication table in a 2d array.  Then
	 * 		prints it.
	 * @param n  size of the table (n x n)
	 */
	public int[][] makeMultiTable(int n) {
		int[][] table = new int[n][n];
		
		// store into array
		for(int r=1; r<=table.length; r+=1) {
			for(int c=1; c<=table.length; c+=1) {
				table[r-1][c-1] = r * c;
			}
		} // end array
		
//		print(table);
		return table;
	}
	
	/**
	 * Prints "found at x,y" if the target is in the table.
	 * 		Otherwise, prints Not found.
	 * @param table a 2d array
	 * @param target what to find
	 */
	public void find(int[][] table, int target) {
		
		// this is iterating through every element
		for(int r=0; r<table.length; r++) {  // all the rows
			for(int c=0; c<table.length; c++) { // all the cols
				// if the current element is equal to the target
				if (table[r][c] == target) {
					System.out.println("found at " + r + ", " + c + ": " + (r + 1) + "x" + (c + 1));
					return;
				} // end of if
			} // end inner loop
		} // end outer loop
		
		System.out.println(target + " Not found");
	}
	
	public void print(int[][] arr) {
		for(int r=0; r<arr.length; r+=1) {
			for(int c=0; c<arr.length; c+=1) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		} // end array
	}
	
	public void print(char[][] arr) {
		for(int r=0; r<arr.length; r+=1) {
			for(int c=0; c<arr.length; c+=1) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		} // end array
	}
	
	public void messingAround() {
		for (int i=0; i<10; i++) {
			
		}
	}
}
