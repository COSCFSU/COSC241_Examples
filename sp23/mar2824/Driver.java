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
		
		long f = r.fib(5);
		long f1 = r.fib1(5);
		
		System.out.println(f);
		System.out.println(f);
		
		String word = "hello";
		word = r.reverse(word);
		System.out.println(word);
	}

}
