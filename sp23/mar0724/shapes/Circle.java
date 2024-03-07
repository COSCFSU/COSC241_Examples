package mar0724.shapes;

public class Circle extends Shape {
	// field members
	private double radius; 

	// constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// pi * r^2
		return Math.PI * (radius * radius);
	}
}
