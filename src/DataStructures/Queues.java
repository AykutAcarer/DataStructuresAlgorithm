package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new LinkedList<String>();
		
		System.out.println(queue.isEmpty()); //true
		
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue.isEmpty()); //false
		System.out.println(queue.size()); //4
		System.out.println(queue.contains("Chad")); //true 
		System.out.println(queue); //[Karen, Chad, Steve, Harold]
		System.out.println(queue.peek()); //Karen
		
		queue.poll();
		
		System.out.println(queue); //[Chad, Steve, Harold]
		
	}

}
