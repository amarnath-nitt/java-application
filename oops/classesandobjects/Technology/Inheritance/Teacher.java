package oops.classesandobjects.Technology.Inheritance;

public class Teacher extends Person {
	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	   
	 public void teach() {
		   System.out.println(name + " is teaching.");
	 }
}
