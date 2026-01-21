package GradeCalculator;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		double a = 0, b = 0, c = 0;
		String[] list = new String[] {"a", "b", "c" };
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <= list.length -1; i++) {
			System.out.println("Enter " + list[i]);
			if (list[i] == "a") {
				a = input.nextDouble();
			}
			else if (list[i] == "b") {
				b = input.nextDouble();
			}
			else if (list[i] == "c") {
				c = input.nextDouble();
			}
		}
		
		String result = "";
		double equation = b * b - 4 * a * c;
		
		if (equation == 0)
			result = "One real root";
		else if (equation > 0)
			result = "Two real root";
		else if (equation < 0)
			result = "Two complex root";
		
		System.out.println(result);
		
		
	}

}
