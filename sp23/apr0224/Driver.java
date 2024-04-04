package apr0224;

public class Driver {

	public static void main(String[] args) {
		Driver apr2 = new Driver();

//		apr2.runExample1();
//		apr2.runExample2();
//		apr2.runExample3();
//		apr2.runExample4(); // compare sorts
		apr2.runExample5();
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
	
	public void runExample3() {
		AlgorithmHelper helper = new AlgorithmHelper();
		Sort sort = new Sort();
//		int[] list = helper.getArrayRando(15);
		int[] list = helper.getBoardList();
		sort.selection(list);
	}
	
	public void runExample4() {
		AlgorithmHelper helper = new AlgorithmHelper();
		Sort sort = new Sort();
		int[] one = helper.getArrayRando(10);
		int[] two = helper.copyArray(one);
		
		helper.printArray(one);
		helper.startTimer();
		sort.insertion(one);
		helper.endTimer();
		helper.printArray(one);
		System.out.printf("Insertion took %,dns%n", helper.getTimeNano());
		
		helper.printArray(two);
		helper.startTimer();
		sort.selection(two);
		helper.endTimer();
		helper.printArray(two);
		System.out.printf("Selection took %,dns%n", helper.getTimeNano());
	}
	
	public void runExample5() {
		AlgorithmHelper helper = new AlgorithmHelper();
		Sort sort = new Sort();
		int[] list = helper.getArrayRando(10);
		
		helper.printArray(list);
		helper.startTimer();
//		sort.quicksort(list);
		sort.quicksort(list, 0, list.length-1);
		helper.endTimer();
		helper.printArray(list);
		System.out.printf("Quicksort took %,dns%n", helper.getTimeNano());
	}
	
}
