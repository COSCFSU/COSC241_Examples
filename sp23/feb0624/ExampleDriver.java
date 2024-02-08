package feb0624;

public class ExampleDriver {

	public static void main(String[] args) {
		Example feb6 = new Example();
		
//		feb6.someMethod();
//		feb6.runLoopExample(10);
//		feb6.runLoopCounter(10, -1);
		
		// draw a lantern
		int width = 9;
		feb6.drawTop(width);
		feb6.drawMiddle(width, 3);
		feb6.drawBase(width, 1);
	}

}
