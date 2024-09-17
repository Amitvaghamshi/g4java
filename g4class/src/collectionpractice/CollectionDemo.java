package collectionpractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class CollectionDemo {

	public static void main(String[] args) {
		
		 ArrayList<Integer> list=new ArrayList<>();
		 // ADD
		 list.add(123);
		 list.add(2345);
		 list.add(234);
		
		 
		 //GETTING ELEMENT
		 System.out.println(list.get(2));
		  
		 
		 System.out.println(list);
		 
		 // 1st method
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 // 2nd method
		 for(int x:list) {
			 System.out.println(x);
		 }
		 
		 // 3rd method
		 Iterator<Integer> itr=  list.iterator();
		 while(itr.hasNext()) {
			 int el=itr.next();
			 if(el==123) {
				 itr.remove();
			 }
			 System.out.println(itr.next());
		 }
		 // 4th method
		  ListIterator<Integer> itr2= list.listIterator();
		  while(itr2.hasNext()) {
			  System.out.println(itr2.next());
		  }
		  while(itr2.hasPrevious()) {
			  System.out.println(itr2.previous());
		  }
		  //5th mathod
		  list.stream().forEach(e->System.out.println(e));
		 
	}
}
