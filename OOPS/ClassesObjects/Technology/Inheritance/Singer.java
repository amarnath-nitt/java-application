package OOPS.ClassesObjects.Technology.Inheritance;

public class Singer extends Person {
   public Singer(String name) {
		super(name);
	}
   
   public void sing() {
	   super.eat();
	   System.out.println(name + " is singing.");
   }
}
