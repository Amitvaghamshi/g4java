package collectionpractice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(55);
		list.add(57);
		list.add(77);
		
		
		Collections.sort(list); // used to sort list
		Collections.reverse(list);  // reversing list
		Collections.swap(list, 1, 2);  // swap the element
		Collections.binarySearch(list,12);  // used to search the element 
		Collections.frequency(list, 77);  // return count of element
		//Collections.copy(dest, src);   // used to copy list
		///Collections.
	}
}
