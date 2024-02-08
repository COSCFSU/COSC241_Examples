package Jan3024;
/**
 * This is our example class.  It will print words that we like.
 * 
 * @author sdkennedy
 * @version 1
 */
public class WordPrinter {
	// state
	public String favoriteWord = "none";
	
	// constructor
	//	constructors help instantiate an object
	public WordPrinter(String word) {
		// this code is run when the object is instantiated
		favoriteWord = word;
	}
	
	// behavior
	public void sayHello() {
		System.out.println("Hello World!");
	}
	
	public void sayFavoriteWord() {
		System.out.println(favoriteWord);
	}
	
//	public void makeFavorite(String word) {
//		favoriteWord = word;
//	}
}
