package feb0624;

public class Example {

//	@Override
//	public void someMethod() {
//		boolean isAwesome = true;
//		byte myB = -128;
//		short mySh = 30000;
//		int myI = 400000;
//		int myOtherInt = Integer.MAX_VALUE;
//		long myL = -23452345;
//		double myDb = 5.5;
//		float myF = 5.5f;
//		char myCh = 'A';
//		
//		System.out.println(myCh);
//		System.out.println(myCh + 1);
//		System.out.println(myCh + myCh);
//		
//	}

	// Thanks to Gavin, and his assistant, Harvey
	public void runLoopExample(int n) {
		for (int i = 0; i < n; i += 1) {
			System.out.print('*');
		}

		System.out.println();
	}

	/**
	 * Prints 0 to n, skipping skip values.
	 * 
	 * @param n    how far to count
	 * @param skip the amount to skip
	 */
	public void runLoopCounter(int n, int skip) {
		if (skip <= 0) {
			System.err.println("We can't skip less than 1");
			return;
		}

		for (int i = 0; i < n; i += skip) {
			System.out.println(i);
		}
	}

	// drawing a lanterns
	// Bonus +1: Make a method that calls all of these,
	//	but it doesn't let you go below height 0 and width 3.

	// top of lantern
	public void drawTop(int width) {
		for(int i=0; i<width/3; i+=1) {
			System.out.print(' ');
		}
		for(int i=0; i<width/3; i+=1) {
			System.out.print('^');
		}
		System.out.println();
		printWalls(width, 1, '*');
	}
	
	// middle of lantern
	public void drawMiddle(int width, int height) {
		printLineOfChars(width, '-');
		printWalls(width, height, '|');
		printLineOfChars(width, '-');
	}
	
	public void printLineOfChars(int n, char ch) {
		for (int i = 0; i < n; i += 1) {
			System.out.print(ch);
		}

		System.out.println();
	}
	
	public void printWalls(int width, int height, char ch) {
		for (int j = 0; j < height; j += 1) {
			System.out.print(ch);
			for (int i = 0; i < width - 2; i += 1) {
				System.out.print(' ');
			}
			System.out.println(ch);
		}
	}
	
	// bottom of lantern
	public void drawBase(int width, int height) {
		printLineOfChars(width, '*'); // first line

		printWalls(width, height, '*');

		printLineOfChars(width, '*'); // last line
	}
}
