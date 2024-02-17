package oops.classesandobjects.Technology.Abstraction.ComplexityReduced;

public class Main {
	
   public static void repairedCar(Car car) {
	   System.out.println("Car is repaired.");
   }
   
   public static void main(String[] args) {
	   // For WagonR Car;
	   WagonR w = new WagonR();
	   repairedCar(w);
	   
	   // We cannot make object of abstract class
	   //Car c = new Car();
	   
	   // For Audi Car;
	   Audi a = new Audi();
	   repairedCar(a);
	   
   }
}
