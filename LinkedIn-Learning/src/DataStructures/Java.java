/*
 * •	TreeSet Structure: TreeSets store unique elements in a sorted order, either ascending or based on a custom comparator.
•	Adding Elements: Use the add method to add elements to a TreeSet. Duplicate values are not allowed.
•	Order: Elements are stored in ascending order by default. You can define a custom order using a comparator.
•	Removing Elements: Use the remove method to remove elements from a TreeSet.

 * */

package DataStructures;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class Java {

	public static void main(String[] args) {
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(300);
		treeSet.add(47);
		treeSet.add(6);
		
		System.out.println(treeSet);
		treeSet.add(6);
		System.out.println(treeSet);
		
		Set<String> words = new TreeSet<>(Comparator.comparing(String::length));
		words.add("tiger");
		words.add("lion");
		words.add("elephant");
		System.out.println(words);
		
		words.add("bear"); // same length, consider as duplicate..
		System.out.println(words);
		
		words.remove("lion");
		System.out.println(words);
		
		TreeSet<String> set = new TreeSet<>(Comparator.comparing(String::length));
		set.addAll(Arrays.asList("apple", "banana", "orange"));
		System.out.println(set);
		
		
	}

}
