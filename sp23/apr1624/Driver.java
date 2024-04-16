package apr1624;

public class Driver {

	public static void main(String[] args) {
		Driver apr16 = new Driver();
		
		apr16.runTest1(10);
	}

	/**
	 * Test the adding and figure out resizing
	 */
	private void runTest1(int n) {
		Vector v = new Vector();
		
		for (int i=0; i<n; i++) {
			v.addLast(i);
		}
		
		v.printVector();
		v.printArray();
		
		v.addLast(99);
		
		System.out.println(v);
	}

}
