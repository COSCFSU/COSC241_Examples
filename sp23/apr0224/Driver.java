package apr0224;

public class Driver {

	public static void main(String[] args) {
		Driver apr2 = new Driver();

//		apr2.runExample1();
		apr2.runExample2();
	}
	
	public void runExample1() {
		AlgorithmHelper helper = new AlgorithmHelper();
		int[] list = helper.getArray(100000000);
		
		Search s = new Search();
		int result = 0;
		int target = 53;
		
		System.out.println("-Sequential search");
		helper.startTimer();
		result = s.sequential(list, target);
		helper.endTimer();
		System.out.printf("Found %d at index %d%n", target, result);
		System.out.printf("That took %,dns%n", helper.getTimeNano());
		
		System.out.println("-Binary search");
		helper.startTimer();
		result = s.binarySearch(list, target);
		helper.endTimer();
		System.out.printf("Found %d at index %d%n", target, result);
		System.out.printf("That took %,dns%n", helper.getTimeNano());
	}
	
	public void runExample2() {
		AlgorithmHelper helper = new AlgorithmHelper();
		Sort sort = new Sort();
		int[] list = helper.getArrayRando(15);
		sort.insertion(list);
	}
	
}
