package problems;

import java.util.PriorityQueue;

public class Kclosest {
	
	public static void findClosest(int[][] arr,int k) {
		  PriorityQueue<Pair> pq=new PriorityQueue<>();
		  for(int i=0;i<arr.length;i++) {
			  pq.add(new Pair(arr[i][0] , arr[i][1]));
		  }
		  
		  while(k>0) {
			  Pair pr=pq.poll();
			  System.out.println(pr.x+" "+pr.y);
			  k--;
		  }
	}

	public static void main(String[] args) {
		int[][] arr= {{1,3},{3,6},{1,3},{2,4}};
		int k=3;
		findClosest(arr,k);
	}
}

class Pair implements Comparable<Pair>{
	int x;
	int y;
	int dist;
	
	
	Pair(int x,int y){
		this.x=x;
		this.y=y;
		this.dist=x*x+y*y;
	}
	
	public int compareTo(Pair p) {
		  if(this.dist>p.dist) {
			  return 1;
		  }else {
			  return -1;
		  }
	}
	
}