package Array;

import java.util.ArrayList;

public class DemoArrayList {
	
	public static void mulList(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> solution = new ArrayList<Integer>();
		
		for(int i = 0; i < a.size(); i++) {
			var myNumber = a.get(i);
			var myNumber2 = b.get(i);
			
			var result = myNumber * myNumber2;
			solution.add(result);
		}
		
		for (int i : solution)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>(2);
		myNumbers.add(1);
		myNumbers.add(2);
		myNumbers.add(3);
		
		ArrayList<Integer> myNumbers2 = new ArrayList<Integer>(2);
		myNumbers2.add(1);
		myNumbers2.add(2);
		myNumbers2.add(3);
		
		mulList(myNumbers, myNumbers2);
	}

}
