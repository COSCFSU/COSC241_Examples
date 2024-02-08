package feb0824;

public class Example {
	public void runSubStringExample(String word) {
		System.out.println(word);

		String otherString = word.substring(1);
		String otherString2 = word.substring(1, 3);

		System.out.println(otherString);
		System.out.println(otherString2);
	}

	public void runConditionalExample1(boolean isTrue) {
		if (isTrue) {
			System.out.println("It's true!");
		} else {
			System.out.println("It's not true!");
		}
	}

	public void runConditionalExample2(int a, int b) {
		if (a > b) {
			System.out.println(a + " is greater!");
		} else if (b > a) {
			System.out.println(b + " is greater!");
		} else {
			System.out.println("I guess they are the same...");
		}
	}

	/**
	 * Returns true, if these side lengths would make an equilateral triangle. (ie,
	 * they are all the same)
	 * 
	 * @param a side1
	 * @param b side2
	 * @param c side3
	 * @return true when they are equal
	 */
	public boolean isEquilateral(int a, int b, int c) {
		// if they are all equal, it will be true
		if (a == b && b == c) {
			return true;
		}
		return false;
	}

	public boolean xor(boolean a, boolean b) {
		if (((a == true) && (b == false)) || ((a == false) && (b == true))) {
			return true;
		}
		return false;
	}

	/**
	 * Counting from 1 to n, print "fizz" when the number is div by 3, "buzz when
	 * div by 5", "fizzbuzz" when div by both.
	 * 
	 * eg. n=5: 1 2 3 fizz 4 5 buzz
	 * 
	 * @param n the number to count to.
	 */
	public void fizzbuzz(int n) {
		for (int i = 1; i <= n; i += 1) {
			String word = fbHelper(i);
			System.out.println(i + " " + word);
		}
	}

	/**
	 * This does fizzbuzz on a single number.
	 * @param i the number
	 * @return fizz, buzz, or fizzbuzz
	 */
	public String fbHelper(int i) {
		if (i % 3 == 0 && i % 5 == 0) {
			return "fizzbuzz";
		} else if (i % 5 == 0) {
			return "buzz";
		} else if (i % 3 == 0) {
			return "fizz";
		} else { // nice defensive programming
			return " ";
		}
	}
}
