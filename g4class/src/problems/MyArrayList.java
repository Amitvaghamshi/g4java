package problems;

public class MyArrayList<T> {

	  private Object[] arr;
	  private int capacity=100;
	  private int size=0;
	  
	  MyArrayList(){
		  arr=new Object[capacity];
	  }
	  
	  public void add(T val) {
		  arr[size]=val;
		  size++;
	  }
	  
	  public T get(int ind) {
		   if(ind<0 || ind>=size) {
			   throw new ArrayIndexOutOfBoundsException("Invalid index");
		   }
		   return (T)arr[ind];
	  }
	  
	  public String toString() {
		   String str="";
		   for(int i=0;i<size;i++) {
			   str+=arr[i]+" ";
		   }
		   return str;
	  }
	  
	  
	  public static void main(String[] args) {
		  MyArrayList<Integer> ls=new MyArrayList<>();
		  ls.add(64);
		  ls.add(53);
		  ls.add(64);
		  ls.add(65);
		  
		  System.out.println(ls);
	}
	  
}
