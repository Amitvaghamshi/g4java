package g4class;

import java.util.Collections;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>(Collections.reverseOrder());
		set.add(123);
		set.add(1);
		set.add(6543);
		set.add(674);
		set.add(674);
		set.add(674);
		System.out.println(set);
	}
}
