package GradeCalculator;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		int marks;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks out of 100: ");
		marks = input.nextInt();
		String letter_grade = "";
		
		if(marks >= 95 && marks <= 100) {
			letter_grade = "A+";
		}
		else if(marks >= 85) {
			letter_grade = "A-";
		}
		else if(marks >= 60) {
			letter_grade = "B+";
		}
		else {
			letter_grade = "F";
		}
		
		System.out.println("Your grade is " +  letter_grade);
	}

}
