package apr0224;

import java.util.Random;

public class AlgorithmHelper {
	
	private long startTime;
	private long endTime;
	private long time; // actual time
	
	// a timer
	public void startTimer() {
		startTime = System.nanoTime();
	}
	
	public void endTimer() {
		endTime = System.nanoTime();
		time = endTime - startTime;
	}
	
	public long getTimeNano() {
		return time;
	}
	
	// a method that just returns a bunch of numbers in an array
	public int[] getArray(int size) {
		int[] list = new int[size];
		
		// put 1,2,3,4...
		for(int i=0; i<list.length; i++) {
			list[i] = i+1;
		}
		
		return list;
	}
	
	// get random numbers
	public int[] getArrayRando(int size) {
		int[] list = new int[size];
		Random rando = new Random(); // rng
		
		for(int i=0; i<list.length; i++) {
			list[i] = rando.nextInt(100)+1;
		}
		
		return list;
	}
}
