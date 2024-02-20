package feb2024;

public class ExampleDriver {

	public static void main(String[] args) {
		Example feb20 = new Example();
		
//		System.out.println(feb20);
		feb20.runArrayExample1();
		long[] nums = feb20.countByX(20, 5);
		long[] nums2 = feb20.reverse(nums);
		
		long[] ex1 = {2,4,6,8};
		ex1 = feb20.reverse(ex1);
		
		int target = 11;
		int idx = feb20.seqSearch(nums2, target);
		System.out.println(target +":" + idx);
		
		long larg = feb20.getLargestFrom(nums2);
		System.out.println("Largest:" + larg);
	}

}
