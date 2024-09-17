package collectionpractice;

import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(123);
		set.add(1);
		set.add(6543);
		set.add(674);
		set.add(674);
		set.add(674);
		set.add(null);
		System.out.println(set);
	}
}
