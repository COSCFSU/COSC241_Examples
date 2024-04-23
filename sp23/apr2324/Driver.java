package apr2324;

import java.util.Random;
import java.util.Scanner;

import apr1624.Vector;

public class Driver {

	public static void main(String[] args) {
		Driver apr23 = new Driver();
		
		Vector v = apr23.getExample();
//		apr23.runTest1();
//		apr23.runVisitorExample(v);
		
//		apr23.runVisitorExample2(v);
//		apr23.runScannerExample();
		
		apr23.runLLExample();
	}

	private void runLLExample() {
		LinkedList list = new LinkedList();
		
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
	}

	private void runScannerExample() {
		Scanner in = new Scanner(System.in);
		
		Vector v = new Vector(); // default size vector...
		
		System.out.print("Enter a number to add or -1 to stop>");
		while(in.hasNextLine()) {
			System.out.print(">");
			String txt = in.nextLine();
			// insert try catch here later...
			int num = Integer.parseInt(txt);
			if (num >= 0)
				v.addLast(num);
			else
				break;
		}
		
//		v.printVector();
		// get a number to find from the user
		System.out.print("Enter a number to find>");
		String line = in.nextLine();
		int num = Integer.parseInt(line);
		
		// have a visitor try to find that number, and print out not found if not found
		Visitor ethan = new Visitor(v);
		int result = ethan.find(num);
		
		if (result > 0) {
			System.out.printf("Ethan found %d at %d%n", num, result);
		} else {
			System.out.println("Ethan didn't find it.  :(");			
		}
	}

	private void runVisitorExample2(Vector v) {
		Visitor ann = new Visitor(v);
		
		while(ann.hasNext()) {
			System.out.println(ann.getData());
			ann.next();
		}
	}

	private Vector getExample() {
		Vector v = new Vector();
		
		Random r = new Random();
		for (int i=0; i<100; i++) {
			v.addFirst(r.nextInt(100));
		}
		
		return v;
	}
	
	private void runVisitorExample(Vector v) {		
		Visitor bob = new Visitor(v);
		System.out.println(bob.getData());
		bob.next();
		System.out.println(bob.getData());
		bob.next();
		System.out.println(bob.getData());
		bob.next();
		System.out.println(bob.getData());
		
		bob.prev();
		System.out.println(bob.getData());
		bob.prev();
		System.out.println(bob.getData());
		bob.prev();
		System.out.println(bob.getData());
		
		
		
		
		v.addLast(7);
		int num = 7;
		int r = bob.find(num);
		if (r >= 0) {
			System.out.println("Bob found " + num + " at " + r);
		} else {
			System.out.println("Bob found nothing :(");
		}
			
		
		bob.insert(-13);
		bob.insert(-7);
		bob.insert(-99);
	}

	private void runTest1() {
		Vector2 v = new Vector2();
		
		v.addFirst(7);
		v.addLast(3);
		v.insert(13, 1);
		
		v.printVector();
	}

}
