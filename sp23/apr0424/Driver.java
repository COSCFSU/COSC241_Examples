package apr0424;

public class Driver {

	public static void main(String[] args) {
		Analyzer efficiency = new Analyzer();
		
		int n = 100;
		System.out.println(efficiency.bigO1(n));
		System.out.println(efficiency.bigOn(n));
		System.out.println(efficiency.bigOnxn(n));
		System.out.println(efficiency.bigOlgn(n));
		System.out.println(efficiency.bigOnlgn(n));
	}

}
