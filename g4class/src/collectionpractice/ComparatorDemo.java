package collectionpractice;

import java.util.Comparator;
import java.util.TreeSet;
public class ComparatorDemo{

	public static void main(String[] args) {
		  TreeSet<Employee> set=new TreeSet<>();
		  
		  set.add(new Employee(2,"Albert",53345));
		  set.add(new Employee(1,"rahul",68743));
		  set.add(new Employee(3,"harshit",65455));
		  
		  System.out.println(set);
	}
}



class EmployeeComparator implements Comparator<Employee>{
	
	    @Override
	    public int compare( Employee e1,Employee e2){
	    	  if(e1.salary>e2.salary) {
	    		  return -1;
	    	  }else {
	    		  return 1;
	    	  }
	    }
}




class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee e) {
		   if(this.salary>e.salary) {
			   return 1;
		   }else {
			   return -1;
		   }
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
}