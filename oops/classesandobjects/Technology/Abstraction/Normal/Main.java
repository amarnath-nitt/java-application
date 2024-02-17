package oops.classesandobjects.Technology.Abstraction.Normal;

public class Main {
	
   public static void repairedCar(WagonR car) {
	   System.out.println("Car is repaired.");
   }
   public static void repairedCar(Audi car) {
	   System.out.println("Car is repaired.");
   }
   
   public static void main(String[] args) {
	   // For WagonR Car;
	   WagonR w = new WagonR();
	   repairedCar(w);
	   
	   // For Audi Car;
	   Audi a = new Audi();
	   repairedCar(a);
	   
   }
}
