package apr1624;

import apr0224.AlgorithmHelper;

public class Driver {

	public static void main(String[] args) {
		Driver apr16 = new Driver();
		
//		apr16.runTest1(10);
//		apr16.runTest2(10000);
//		apr16.runTest3(5);
		apr16.runTest4(5);
	}



	private void runTest3(int n) {
		Vector v = new Vector(n);
		
		for (int i=1; i<=n*2; i++) {
			v.addFirst(i);
		}
		v.printVector();
		v.printArray();
	}

	private void runTest4(int n) {
		Vector v = new Vector(n);
		
		for (int i=1; i<=n*2; i++) {
			v.addLast(i);
		}
		v.printVector();
		
		v.insert(99, 5);
		v.printVector();
		v.printArray();

		v.insert(98, 7);
		v.printVector();
		v.printArray();
		
		v.insert(98, 15);
		v.printVector();
		v.printArray();
	}
	
	/**
	 * Compare the different resize methods
	 * @param i
	 */
	private void runTest2(int n) {
		AlgorithmHelper helper = new AlgorithmHelper();
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		
		// test each
		helper.startTimer();
		for (int i=0; i<n; i++) {
			v1.addLast(i);
		}
		helper.endTimer();
		System.out.printf("The time was %d when doubling%n", helper.getTimeNano());
		
		helper.startTimer();
		for (int i=0; i<n; i++) {
			v2.addLastBy1(i);
		}
		helper.endTimer();
		System.out.printf("The time was %d when increasing by 1%n", helper.getTimeNano());
		
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
