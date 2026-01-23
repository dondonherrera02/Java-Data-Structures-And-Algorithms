/*
 * •	Queue Concept: In a queue, the first element added is the first one removed (FIFO - First In, First Out).
•	Implementation: Queues in Java can be implemented using various classes like ArrayDeque, LinkedList, and PriorityQueue.
•	Methods: Use offer to add elements, peek to view the first element, and poll to remove the first element.
•	Performance: ArrayDeque generally offers better performance than LinkedList, except when removing the current element during iteration.
 * 
 * */

package DataStructures;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		
		Queue<String> queue = new ArrayDeque<>();
		queue.offer("One");
		queue.offer("Two");
		queue.offer("Three");
		System.out.println(queue);
		
		System.out.println(queue.peek()); // get the first element
		queue.poll(); // remove the first element
		
		System.out.println(queue);
		
	}

}
