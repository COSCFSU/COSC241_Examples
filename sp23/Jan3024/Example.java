package Jan3024;
/**
 * ABC
 * @author sdkennedy and friends
 */
public class Example {

	// inline comment
	
	/**
	 * JavaDocs
	 * 	Here, you put comment stuff.
	 * 
	 * The main method kicks off the program.
	 * 
	 * This is where we will do stuff today
	 * 
	 * @param args - runtime commands...
	 */
	public static void main(String[] args) {
		// we aren't using this code...
//		/*
//		 * Block comment.  
//		 * 	// def main(): 
//		 */
//		
//		// print("hello") # Python version
//		System.out.println("Hello World!");
//		
//		System.out.println(5 + 5);
//		System.out.println("Hello" + "World!");
		
		// we are using this code instead
		
		// instantiate the WordPrinter		
//		int x = 5;
		WordPrinter wp1 = new WordPrinter("Bee's Knees!"); // make a new WP
		WordPrinter wp2 = new WordPrinter("Rad!"); // makes another one
//		WordPrinter wp1;  // this line doesn't work by itself
							// because we don't have a real WordPrinter
		wp1.sayHello();
//		wp1.makeFavorite("something");
		wp1.sayFavoriteWord();
		
		wp2.sayHello();
//		wp2.makeFavorite("other word");
		wp2.sayFavoriteWord();
	}
}
