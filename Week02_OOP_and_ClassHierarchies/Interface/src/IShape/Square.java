package IShape;

public class Square implements IShape {
	
	private double side = 10.0;
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Draw square on the screen.");
	}

}
