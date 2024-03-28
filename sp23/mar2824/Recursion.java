package mar2824;

/**
 * A class that shows recursion examples.
 * 
 * Recursion - methods that call themselves
 * 	- base case (end the recursion)
 *  - recursive case (the recursive call - must make progress towards the base case)
 */
public class Recursion {

	public void badExample() {
		badExample();  // recursion!
	}
	
	public void count(int n) {
		if (n == 0) {
			return;
		} // base case: stop at 0
		
//		System.out.println(n);
		count(n-1);
		System.out.println(n);
	}
	
	/**
	 * Returns a to the power of b
	 * @param a number
	 * @param b exponent
	 * @return a^b
	 */
	public long pow(int a, int b) {
		// get a, b times, and multiply them
		if (b == 0) {
			return 1;
		}
		
		System.out.println("z");
		return pow(a,b-1) * a;
	}
	
	// O(2^n) space + time
	public long fib(int n) {
		if (n <= 1) {
			return 1; 
		}
		return fib(n-1) + fib(n-2);
	}
	
	// O(n) space + time
	public long fib1(int n) {
		int[] nums = new int[n];
		nums[0] = 1;
		nums[1] = 1;
		
		for (int i=2; i<nums.length; i++) {
			nums[i] = nums[i-1] + nums[i-2];
		}
		
		return nums[nums.length-1];
	}
	
	public String reverse(String word) {
		// base
		if (word.length() == 0) {
			return "";
		}
		
		System.out.println(word);
		// recursion
		return reverse(word.substring(1)) + word.charAt(0);
	}
}
