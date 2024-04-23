package apr2324;

import java.util.Random;

import apr1624.Vector;

public class Driver {

	public static void main(String[] args) {
		Driver apr23 = new Driver();
		
		Vector v = apr23.getExample();
//		apr23.runTest1();
		apr23.runVisitorExample(v);
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
