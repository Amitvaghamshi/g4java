package packagedemo;

public class Student {
	
	private String name;
	private  int age;
	
	
	 @Override
	 public String toString() {
	         return name+" "+age;
	 }
	
	public void setAge(int age) {
		if(age<0) {
			throw new InvalidAgeException("age can not be less than 0");
		}
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	

}
