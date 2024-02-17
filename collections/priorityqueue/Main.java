package collections.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Maximum PriorityQueue;
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // Minimum PriorityQueue;
        // PriorityQueue<Integer> pq = new PriorityQueue();
        
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Ram");
        pq.add("Banana");
        
        System.out.println(pq);
        
        System.out.println(pq.peek()); pq.poll();
        System.out.println(pq.peek()); pq.poll();
        System.out.println(pq.peek()); pq.poll();
	}

}
