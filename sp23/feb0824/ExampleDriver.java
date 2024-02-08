package feb0824;

public class ExampleDriver {

	public static void main(String[] args) {
		Example feb8 = new Example();

//		feb8.runSubStringExample("Eraser");
//		feb8.runSubStringExample("Abracadabra");
//		
//		feb8.runConditionalExample1(true);
//		feb8.runConditionalExample1(false);
//		
//		feb8.runConditionalExample2(5, 3);
//		feb8.runConditionalExample2(3, 5);
//		feb8.runConditionalExample2(5, 5);

//		runTriangle(feb8, 1,2,3);

//		runLogicExamples(feb8);

		feb8.fizzbuzz(30);
	}

	public static void runLogicExamples(Example ex) {
		boolean a = false;
		boolean b = true;

		boolean result = ex.xor(a, b);

		System.out.println(a + " XOR " + b + " = " + result);
	}

	public static void runTriangle(Example ex, int a, int b, int c) {
		boolean result = ex.isEquilateral(a, b, c);

		System.out.println("Is it equilateral? -> " + result);
	}

}
