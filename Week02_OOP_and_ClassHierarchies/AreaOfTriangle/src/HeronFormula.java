
public class HeronFormula {

	public static void main(String[] args) {
		double aSide = 3;
		double bSide = 4;
		double cSide = 5;
		
		double s = (aSide + bSide + cSide) / 2;
		double areaHeron = Math.sqrt(s * (s - aSide) * (s - bSide) * (s - cSide));
		
		System.out.println("The area of triangle (heron formula) " + areaHeron);
	}

}
