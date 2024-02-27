package feb2224;

public class Driver {

	public static void main(String[] args) {
		Example feb22 = new Example();
		
//		feb22.run2dArrayExample();
		int[][] table = feb22.makeMultiTable(10);
		feb22.find(table, 42);
	}

}
