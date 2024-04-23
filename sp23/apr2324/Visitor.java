package apr2324;

/**
 * Iterator implementation
 */
import apr1624.Vector;

/**
 * Object for helping us visit a Vector
 */
public class Visitor {
	// vector
	private Vector vec;
	// position
	private int position; //<- this will be where the visitor is looking
	
	public Visitor(Vector vec) {
		this.vec = vec;
		position = 0;
	}
	
	public boolean hasNext() {
		if (position >= (vec.getCount() -1)) {
			return false;
		}
		return true;
	}
	
	// next
	public void next() {
		if (position == vec.getCount()-1) {
			System.out.println("Can't go right");
		} else {
			position = position + 1;
		}
	}
	
	// prev
	public void prev() {
		if (position == 0) {
			System.out.println("Can't go left");
		} else {
			position = position - 1;
		}
	}
	
	/**
	 * Return the data that this visitor is looking at.
	 * @return
	 */
	public int getData() {
		return vec.get(position);
	}
	
	/**
	 * Returns the index of a, or -1 if not found.
	 * @param a
	 * @return
	 */
	public int find(int a) {
		
		for (int i=position; i<vec.getCount(); i++, position++) {
			if(vec.get(i) == a) {
				return i;
			}
		}

		return -1;
		
	}
	
	/**
	 * Add an element at the visitor's position.
	 * @param num
	 */
	public void insert(int num) {
		vec.insert(num, position);
	}
}
