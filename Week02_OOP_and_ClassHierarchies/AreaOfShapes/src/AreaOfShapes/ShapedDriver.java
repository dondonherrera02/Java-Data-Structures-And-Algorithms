package AreaOfShapes;

public class ShapedDriver {

	public static void main(String[] args) {
		
		RectangleClass r1 = new RectangleClass();
		SquareClass sq1 = new SquareClass();
		
		System.out.println("Area of Rectangle: " + r1.getArea());
		System.out.println("Perimeter of Square: " + sq1.getPerimeter());
	}

}
