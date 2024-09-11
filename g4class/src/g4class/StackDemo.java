package g4class;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		  Stack<Integer> st=new Stack<>();
		  
		  st.add(23);
		  st.remove(1);
		  st.contains(12);
		  st.get(1);
		  
		  // SPECIFIC METHODS
		  st.push(12);  // adding the element at top
		  st.pop();  // removing the element at top
		  st.peek();   // getting the top elememt
		  
		  
	}
}
