package feb0124;

public class Example {

	public void runStringExample() {
		String myStr = "Luffy";
		
		String str2 = "Luffy" + "Spike";
		System.out.println(str2);
		
		
		char ex1 = myStr.charAt(0); // get first letter
		char ex2 = myStr.charAt(3); // get 4th letter....
		
		System.out.println(ex1);
		System.out.println(ex2);
		System.out.println(ex1 + ex2);
		
		char ch1 = 'A';
		char ch2 = 'A';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1 + ch2);
		
		String str3 = "Eren";
		boolean c = str3.contains("re");
		System.out.println(c);
		
		int i = str3.indexOf('e');
		System.out.println(i);
	}
	
	public void runWhileExample() {
		int i = 10;
		while(i > 0) {
			System.out.println(i);
			i -= 1;
//			i--;
//			--i;
		}
	}
	
	public void runForExample(int n) {
//		for(init; condition; update) {
		for(int i = 0; i < n; i+=1) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void makeLineofStars(int n) {
		for(int i=0; i < n; i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	
	public int add(int a, int b) {
//		System.out.println(a + b);
		return a+b;
	}
}
