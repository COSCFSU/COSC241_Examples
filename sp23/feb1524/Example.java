package feb1524;

public class Example {

	/**
	 * Makes an n by n multiplication table.
	 * 
	 * (currently not formatted nicely, but that's for a later time)
	 * 
	 * @param n size of table
	 */
	public void makeMultiplicationTable(int n) {
		for (int i = 1; i <= n; i += 1) { // n rows
			for (int j = 1; j <= n; j += 1) { // n cols
				System.out.print(i * j + " ");
			} // end inner loop
			System.out.println();
		} // end outer loop
	}

	/**
	 * Prints the Unicode values of all the characters in the string.
	 * 
	 * @param word the string
	 */
	public void convertToUnicode(String word) {
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			int code = (int) letter;
			System.out.println(letter + ":" + code);
		}
	}

	/**
	 * Lets try out some different types
	 */
	public void runTypeCastingExample() {
		double mydouble = 9.8765;
		float myfloat = 9.8765f;
		float myf2 = (float) mydouble; // cast it
		double myd2 = myfloat; // this automatically casts because floats are smaller

		System.out.println(mydouble);
		System.out.println(myfloat);
		System.out.println(myf2);
		System.out.println(myd2);

		if (myf2 == myd2) { // * Be very very careful when comparing floating point values
			System.out.println("They are the same");
		} else {
			System.out.println("They are not the same");
		}
	}

	public void runTypeCastingExample2() {
		double mydouble = 9.8765;
		int myint = 9;
		myint = (int) mydouble;

		System.out.println(mydouble);
		System.out.println(myint);
		mydouble = myint; // autocast back to double...
		System.out.println(mydouble);
	}

	public void runTypeCastingExample3() {
		boolean myb = true; // or false
//		int myi = (int)myb;  // sadly, Java does not let you do this
		byte mybyte = 100;
		int myi = mybyte;
		byte mybyte2 = (byte) myi;

		float myf = 100.0f;
		int myi2 = (int) myf;
		myf = myi2;
	}

	/**
	 * Literal fencepost problem. Prints a fencepost type thing.
	 * 
	 * @param post  |
	 * @param fence =
	 * @param size  how many of post/fence combos to print
	 */
	public void printFence(char post, char fence, int size) {
		// constraint! must use while loop!

		// really just a weird for loop in this case
		int i = 0;
		while (i < size) {
			// print stuff
			System.out.print(post);
			System.out.print(fence);
			i++;
		}
		System.out.println(post);
	}

//	/**
//	 * ssttrreettcchh(String word)
//		a. Duplicate all the letters in the original word *and print* the new string. (e.g., if word is
//		“magic”, return “mmaaggiicc”.
//	 */
//	public void ssttrreettcchh(String word) {
//		for (int i=0; i<word.length(); i++) {
//			System.out.print(word.charAt(i));
//			System.out.print(word.charAt(i));
//		}
//		System.out.println();
//	}

	/**
	 * ssttrreettcchh(String word) a. Duplicate all the letters in the original word
	 * *and return* the new string. (e.g., if word is “magic”, return “mmaaggiicc”.
	 */
	public String ssttrreettcchh(String word) {
		String myWord = ""; // begin at nothing
		for (int i = 0; i < word.length(); i++) {			
			myWord = myWord + word.charAt(i) + word.charAt(i);
		}
		
		return myWord; // got it!
	}
	
	/**
	 * Ssttrreettcchh(String word, int repeat)
		a. This is the same as the previous one, except instead of repeating the letter once, the
		argument repeat tells you how many times to repeat it. If repeat was 4, “magic” would
		return “mmmmaaaaggggiiiicccc”.
	 */
	public String ssttrreettcchh(String word, int repeat) {
		String myWord = ""; // begin at nothing
		for (int i = 0; i < word.length(); i++) {			
//			myWord = myWord + word.charAt(i) + word.charAt(i); // <-- old solution
			
			for (int j=0; j<repeat; j++) { // do this "repeat" number of times
				myWord = myWord + word.charAt(i);
			} // end repeat loop
		} // end main loop
		
		return myWord; // got it!
	}
}
