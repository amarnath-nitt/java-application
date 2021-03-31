package OOPS.ClassesObjects.Interface.ActualInterface;

//public class Person extends Student, YouTuber {
// We can not extends multiple class to a child class. Means, Multiple Inheritance is not possible in java.
// To get behavior of both classes, we use interface and implement behavior of both classes;
public class Person implements  Student, YouTuber {
	public static void main(String[] args) {
		
       Person p = new Person();
       p.study();
       p.makeVide();
       
       
       
	}


	public void makeVide() {
		System.out.println("Person is making videos.");
	}


	public void study() {
		System.out.println("Person is studying.");
	}

}
