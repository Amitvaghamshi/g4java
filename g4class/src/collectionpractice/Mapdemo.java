package collectionpractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args) {
		   
		HashMap<Integer , String  >  map=new HashMap<>();
		map.put(1, "abc");
		map.put(2, "asdf");
		map.put(3, "erf3wd");
		map.put(1, "xyz");
		
		System.out.println(map.get(3976));
		
		System.out.println(map.containsKey(10));
		map.remove(2);
		System.out.println(map);
		
		Set<Integer> keySet= map.keySet();
		
		 Set<Entry<Integer,String>> entrys=  map.entrySet();
		 
		 for(Entry<Integer,String> e:entrys) {
			   System.out.println(e.getKey()   +"  "+e.getValue());
		 }
		
		 String str="wxuruwtegrfbwnktuyvkyuntkbwc4";
		 HashMap<Character,Integer> m=new HashMap<>();
		 for(int i=0;i<str.length();i++) {
			  char ch=str.charAt(i);
			  if(m.containsKey(ch)) {
				  m.put(ch, m.get(ch)+1 );
			  }else {
				  m.put(ch, 1);
			  }
			//  m.put(ch, m.getOrDefault(ch, 1));
		 }
		 
		 
		 
		 
		 System.out.println(m);
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
}
