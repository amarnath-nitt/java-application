package oops.classesandobjects.technology.Inheritance;

public class Singer extends Person {
   public Singer(String name) {
		super(name);
	}
   
   public void sing() {
	   super.eat();
	   System.out.println(name + " is singing.");
   }
}
