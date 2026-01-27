package IShape;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IShape iSquare;
		iSquare = new Square();
		iSquare.drawShape();
		
		IShape iCircle = new Circle();
		iCircle.drawShape();
		
	}

}
