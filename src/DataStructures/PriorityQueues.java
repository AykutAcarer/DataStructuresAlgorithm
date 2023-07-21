package dataStructures;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Queue<Double> queue = new LinkedList<>(); 	// 3.0 2.5 4.0 1.5 2.0
		
		// Queue<Double> queue = new PriorityQueue<>();    // 1.5 2.0 2.5 3.0 4.0
		
		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());    // 4.0 3.0 2.5 2.0 1.5
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll()); 
		}
		
		
		//Queue<String> queue2 = new PriorityQueue<>();    // A B C D F
		
		Queue<String> queue2 = new PriorityQueue<>(Collections.reverseOrder());    // 
		
		queue2.offer("B");
		queue2.offer("C");
		queue2.offer("A");
		queue2.offer("F");
		queue2.offer("D");
		
		while(!queue2.isEmpty()) {
			System.out.println(queue2.poll()); 
		}
		
	}

}
