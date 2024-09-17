package problems;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static boolean check(int n) {
		
		  Set<Integer> set=new HashSet<>();
		   while(n!=1) {  
			   if(set.contains(n)) {
				   return false;
			   }else {
				   set.add(n);
			   }
			      int sum=0;
			      while(n>0) {
			    	  int lastDigit=n%10;
			    	  sum+=lastDigit*lastDigit;
			    	  n=n/10;
			      }
			      n=sum;
		   }
		   return true;
	}
	
	public static void main(String[] args) {
		  int n=20;
		  System.out.println(check(n));
	}
}
