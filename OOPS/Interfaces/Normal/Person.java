package OOPS.ClassesObjects.Interface.Normal;

//public class Person extends Student, YouTuber {
// We can not extends multiple class to a child class. Means, Multiple Inheritance is not possible in java.
// To get behavior of both classes, we use interface and implement behavior of both classes;
public class Person extends Student{
	public static void main(String[] args) {
		
       Person p = new Person();
       p.study();
       
       
       
	}

}
