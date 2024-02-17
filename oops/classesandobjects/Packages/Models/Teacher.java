package oops.classesandobjects.Packages.Models;

public class Teacher {
    private String name;
    private int age;
    private long mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
    
    public void getDetails() {
    	System.out.println("***** Teacher Details *****");
    	System.out.println("Name: "+ name);
    	System.out.println("Age: "+ age);
    	System.out.println("Mobile No: "+ mobile);
    }
    
}
