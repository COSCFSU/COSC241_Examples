package mar2824;

public class Driver {

	public static void main(String[] args) {
		Driver mar28 = new Driver();
		
		mar28.runExamples();
	}
	
	public void runExamples() {
		Recursion r = new Recursion();
		
//		r.badExample();
//		r.count(3);  // O(1) * n == O(n)
//		System.out.println(r.pow(9, 9)); // O(n)
		
		long f = r.fib(39);
		long f1 = r.fib1(39);
		
		long msBefore = System.nanoTime();
		System.out.println(f);
		long msAfter = System.nanoTime();
		System.out.println("took " + (msAfter - msBefore) + "ms");
		msBefore = System.nanoTime();
		System.out.println(f);
		msAfter = System.nanoTime();
		System.out.println("took " + (msAfter - msBefore) + "ms");

		
//		String word = "hello";
//		word = r.reverse(word);
//		System.out.println(word);
	}

}
