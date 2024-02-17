package oops.classesandobjects.Technology.Inheritance;

public class Singer extends Person {
   public Singer(String name) {
		super(name);
	}
   
   public void sing() {
	   super.eat();
	   System.out.println(name + " is singing.");
   }
}
