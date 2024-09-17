package collectionpractice;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		 
		Queue<Integer> que=new ArrayDeque<>();
		que.offer(234);  // adding the element
		que.add(1234);
		
		
		que.poll();   // for removing the element
		que.remove();
		
		que.peek();  // return the head of the queue
		
		
		
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		dq.offerFirst(12);  // adding the element at start
		dq.addFirst(145);
		
		dq.offerLast(123);   // adding the element to the last
		dq.addLast(134);
		
		dq.pollFirst();     // used to remove element from head
		dq.removeFirst();
		
		dq.pollLast();    // removing the element from last
		dq.removeLast();
		
		dq.peekFirst();  // returning the head of the queue
		dq.peekLast();   // returning the tail of the queue
		
		
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		pq.offer(13);
		pq.offer(42);
		pq.offer(4);
		pq.offer(15);
		pq.offer(54);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		//Queue<Integer> q=new LinkedList<>();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
