package OOPS.ClassesObjects.Technology.Inheritance;

public class Person {
    protected String name;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name) {
    	this.name = name;
    }
	public void walk() {
		System.out.println(name + " is walking.");
	}
	public void eat() {
		System.out.println(name + " is eating.");
	}
}
