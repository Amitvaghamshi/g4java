package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompDemo {
	
	public static void main(String[] args) {
		  ArrayList<Student> list=new ArrayList<>();
		  list.add(new Student(2,"Albert",97));
		  list.add(new Student(6,"Ankit",65));
		  list.add(new Student(15,"Harshit",78));
		  list.add(new Student(64,"Kaushal",67));
		  list.add(new Student(13,"Harshit",78));
		  
		  Collections.sort(list,new StudentComparator());
		  System.out.println(list);
	}
	
}

class StudentComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		   if(s1.marks>s2.marks) {
			   return 1;
		   }else if(s1.marks<s2.marks) {
			   return -1;
		   }else if(!s1.name.equals(s2.name)) {
			   return s1.name.compareTo(s2.name);
		   }else if(s1.roll>s2.roll) {
			   return 1;
		   }else {
			   return -1;
		   }
	}
}



class Student{
	int roll;
	String name;
	int marks;
	
	Student(int roll,String name,int marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return name+" "+roll+" "+marks;
	}
}
