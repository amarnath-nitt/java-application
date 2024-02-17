package oops.classesandobjects.technology.Polymorphism;

public class Main {
  public static void main(String[] args) {
	  Dog d = new Dog();
	  Pet p = d;
	  
	  @SuppressWarnings("unused")
	Animal a = p;
	  
	  d.walk();
	  p.walk();
	  // In the above call of function. We know, second function call will give "Pet is walking." But output will come "Dog is walking" ;
	  // This is called Run Time Polymorphism;
	  
	  
	  // a.walk();  // Here Compile Time Error will come. Since, Animal doesn't has any walk() function;;
	  greeting("Good Morning", 3);
  }
  
  // Method OverLoading is an example of Compile Time Polymorphism;;
  public static void greeting() {
	  System.out.println("Hi!! I am there.");
  }
  public static void greeting(String name) {
	  System.out.println("Hello!! "+ name);
  }
  public static void greeting(String name, int n) {
	  for(int i=0; i<n; i++) {
		  System.out.println("Hi! " + name + " I am there.");
	  }
  }
}
