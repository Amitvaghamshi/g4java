package g4class;

import java.util.LinkedList;

public class LinkedLIstDemo {

	public static void main(String[] args) {
		
		   LinkedList<Integer> ll=new LinkedList<>();
		   ll.add(123); // adding element in LL
		   ll.add(234);
		   ll.add(453);
		   System.out.println(ll);
		   
		   System.out.println(ll.get(0)); // getting the element
		   
		   ll.remove(1);  // remove the element at 1st index
		   
		   ll.addFirst(12);  // adding the element at the head of LL
		   ll.offerFirst(54);
		   
		   ll.addLast(12);  // adding the element at tail
		   ll.offerLast(234);
		   
		   ll.peek();  // return head of the LL
		   ll.poll();   // removing the head OF LL
		   
		   ll.pollFirst();  // remove head of LL
		   ll.pollLast();    // remove tail of LL
		   
	}
}
