/*
 * LinkedList Structure: LinkedLists are doubly linked, meaning each element has references to the next and previous elements.
	Operations: LinkedLists are efficient for adding and removing elements but slower for random access compared to ArrayLists.
	Thread Safety: LinkedLists are not synchronized by default but can be made thread-safe using Collections.synchronizedList.
 * 
 * */

package DataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShoppingList {

	public static void main(String[] args) {
		LinkedList<String> shoppingList = new LinkedList<>();
		
		shoppingList.add("apple");
		shoppingList.add("banana");
		shoppingList.add("pear");
		System.out.println(shoppingList);
		
		shoppingList.add(1, "mango");
		System.out.println(shoppingList);
		
		shoppingList.removeFirst();
		System.out.println(shoppingList);
		
		List<String> syncList = Collections.synchronizedList(shoppingList);
		System.out.println(syncList);
		
	}

}
