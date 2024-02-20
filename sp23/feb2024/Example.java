package feb2024;

public class Example {

	public void runArrayExample1() {
		// type identifer = //stuff to put in this variable
		// int x = 5; // for example

		// int[] arr =...
		String[] spanishRockBand = { "Amanda", "Zach", "Ethan", "Aron", "Kemarsh" };

		System.out.println(spanishRockBand);
		System.out.println(spanishRockBand[2]);
		
		print(spanishRockBand);
	}

	public void print(String[] list) {
		// fencepost problem style print!
		for (int i = 0; i < list.length-1; i++) {
			System.out.print(list[i] + ", ");
		}
		System.out.println(list[list.length-1]);
	}
	
	/**
	 * Returns an array containing the first n elements, counting by x
	 * @param x
	 * @return
	 */
	public long[] countByX(int n, int x) {		
		
		long[] list = new long[n]; // length goes inside brackets on the right
		
		// if i is divisible by x, then add it to the list
		for (int i=0, c=0; i<(n*x); i+=x, c+=1) {
//			System.out.println("i:"+i);
			list[c] = i;
		}
		
		return list;
	}
	
	/**
	 * Returns a new list that is the reverse of the original.
	 * 
	 * @param list
	 * @return
	 */
	public long[] reverse(long[] list) {
		
	}
}
