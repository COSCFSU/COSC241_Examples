package mar0724.shapes;

public class Driver {

	public static void main(String[] args) {
		Driver shapes = new Driver();
		shapes.run();
	}
	
	public void run() {
		Circle c1 = new Circle(14.0);
		double c1Area = c1.getArea();
		System.out.println(c1Area);
		
		Square sq1 = new Square(25.0);
		double sqArea = sq1.getArea();
		System.out.println(sqArea);
		
		Rectangle r1 = new Rectangle(25.0, 2);
		double r1Area = r1.getArea();
		System.out.println(r1Area);
	}

}
