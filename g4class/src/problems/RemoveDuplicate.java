package problems;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(45);
		v.add(56);
		v.add(24);
		v.add(1);
		v.add(1);
		
		Set<Integer> set=new HashSet<>(v);
		v.clear();
		v.addAll(set);
		
		System.out.println(v);
	}
}
