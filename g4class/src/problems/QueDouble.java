package problems;

import java.util.LinkedList;
import java.util.Queue;

public class QueDouble {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		
		LinkedList<Integer> ls = (LinkedList<Integer>)q;
		
		for(int i=0;i<q.size();i+=2) {
			ls.add(i,ls.get(i));
		}
		System.out.println(q);
		
	}
}
