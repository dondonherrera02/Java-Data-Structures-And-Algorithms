/*
 * Stack Concept: A stack is a data structure where the first element added is the last one removed (LIFO - Last In, First Out).
	Creating Stacks: It's recommended to use the deque interface instead of the stack class due to limitations in the latter.
	Methods: Use push to add elements, peek to view the top element, and pop or poll to remove the top element.
	Thread Safety: ArrayDeque is not thread-safe but is faster than the synchronized stack class.
 * */

package DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

	public static void main(String[] args) {
		
		Deque<String> stack = new ArrayDeque<>(); // ArrayDeck is not thread-safe
		
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		
		System.out.println(stack);
		
		System.out.println(stack.peek()); // top element of the stack, or first element of the stack
		
		stack.pop(); // remove the first element of the stack - return null exception in empty stack
		System.out.println(stack); 
		
		stack.poll(); //remove the first element of the stack - return null in empty stack
		System.out.println(stack);

	}

}
