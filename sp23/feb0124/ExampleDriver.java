package feb0124;

public class ExampleDriver {

	public static void main(String[] args) {
		Example cosc = new Example();
		
//		cosc.runStringExample();
//		cosc.runWhileExample();
//		cosc.runForExample(10);
//		cosc.makeLineofStars(5);
//		cosc.makeLineofStars(3);
		int x = cosc.add(5, 6);
		int y = cosc.add(20, -23);
		int result = x + y;
		System.out.println(result);
	}

}
