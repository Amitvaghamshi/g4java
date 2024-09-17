package collectionpractice;

import java.util.HashMap;

public class RansomNote {
	
	public static boolean check(String mag,String note) {
		 HashMap<Character,Integer> map=new HashMap<>();
		 for(int i=0;i<mag.length();i++) {
			  char ch=mag.charAt(i);
			  if(map.containsKey(ch)) {
				  map.put(ch, map.get(ch) +1);
			  }else {
				  map.put(ch, 1);
			  }
		 }
		 
		 for(int i=0;i<note.length();i++) {
			   char ch=note.charAt(i);
			   if(!map.containsKey(ch)) {
				   return false;
			   }else {
				   if(map.get(ch)<=0) {
					   return false;
				   }else {
					   map.put(ch, map.get(ch)-1);
				   }
			   }
		 }
		 return true;
	}

	public static void main(String[] args) {
		  String mag="aab";
		  String note="aaab";
		 System.out.println( check(mag,note));
	}
}














