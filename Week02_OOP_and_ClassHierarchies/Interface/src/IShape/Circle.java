package IShape;

public class Circle implements IShape {
	
	private double radius = 5;
	private final double PI = 3.14;
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * radius * PI;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Draw circle on the screen.");
	}

}
