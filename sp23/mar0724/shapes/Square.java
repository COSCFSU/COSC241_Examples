package mar0724.shapes;

public class Square extends Shape {
	protected double width;

	public Square(double width) {
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return (width * width);
	}
}
