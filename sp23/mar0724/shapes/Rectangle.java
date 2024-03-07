package mar0724.shapes;

public class Rectangle extends Square {
//	protected double width; // <-- comes from square
	protected double height;
	
	public Rectangle(double width, double height) {
		super(width);
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return (width * height);
	}
}
