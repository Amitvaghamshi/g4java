package g4class;

import java.util.*;
public class StudentDemo {

	   ArrayList<Student> students;
	   
	   StudentDemo(){
		   students=new ArrayList<>();
	   }
	   
	   public void addStudent(int roll,String name,String addr) {
		     Student s=new Student(roll,name,addr);
		     students.add(s);
	   }
	   
	   public void displayStudents() {
		   for( Student s:students  ) {
			   System.out.println("roll: "+s.roll+  " name: "+s.name+" addr: "+s.addr);
		   }
	   }
	   
	   public void updateStudent(int roll,String newName) {
		    for(Student s:students) {
		    	if(s.roll==roll) {
		    		s.name=newName;
		    		return;
		    	}
		    }
	   }
	   
	   public void removeStudent(int roll) {
		     for(int i=0;i<students.size();i++) {
		    	    if(students.get(i).roll==roll) {
		    	    	students.remove(i);
		    	    	return;
		    	    }
		     }
	   }
	   
	   public void getTotalStudents() {
		      System.out.println("Total number of student is "+students.size());
	   }
	   
	   
	   public static void main(String[] args) {
		 
		   StudentDemo students=new StudentDemo();
		   students.addStudent(1, "Albert", "delhi");
		   students.addStudent(2, "pulkit", "Ahmdabad");
		   students.addStudent(3, "Harsh", "surat");
		   
		   students.displayStudents();
		   System.out.println("--------------------------");
		   students.updateStudent(3, "Harshit");
		   students.displayStudents();
		   
		   System.out.println("---------------------");
		   students.removeStudent(2);
		   students.displayStudents();
		   students.getTotalStudents();
	  }
	   
}
