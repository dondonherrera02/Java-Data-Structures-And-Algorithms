package EvenOrOdd;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		int[] input = {2, 3, 4, 5};
		
		for(int i = 0; i <= input.length - 1; i++) {
			if (input[i] % 2 == 0) {
				System.out.println("Hey! This is even number");
			}
			else {
				System.out.println("Hey! This is odd number");
			}
		}
	}
}