package proj1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Farm {

	public Farm(String filename) {
		// TODO: Maybe add other stuff
		readFile(filename); // returns animal array...
	}
	
	private Animal[] readFile(String filename) {
		int nAnimals = 23;  // <-- note that in future programs, there are better ways to do this part
		File theFile = new File(filename);  // get the file
		
		
		
		try { // try to do this, but might run into problems
			Scanner input = new Scanner(theFile);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String[] values = line.split(","); // this will separate the line into individual values
				
				String name = values[0];
				String type = values[1];
				int nLegs = Integer.parseInt(values[2]); // turn the string into an int
				String sound = values[3];
				String food = values[4];
				int age = Integer.parseInt(values[5]);
				double weight = Double.parseDouble(values[6]);
				
				// next would be to put these into an animal and instantiate it
				//	then, add that Animal to our array
				
//				System.out.println(line);  // useful for testing
			}
			
		} catch (FileNotFoundException e) { // do this if you run into problems
			e.printStackTrace();
			System.out.println("Oops!  Can't find " + theFile);
			
		} finally { // always does this part
			// I don't have anything here yet
		}
			
		return null;  // TODO: need to return the Animal array
	}
}
