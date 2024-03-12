package proj1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Driver project = new Driver();
//		project.go();
		
		project.runScannerExample();
	}

	private void runScannerExample() {
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()) {
			String line = input.nextLine();
			
			System.out.println(line);
		}
	}

	public void go() {
		Farm farm = new Farm("animal_farm_data.csv");
		
		
	}
}
