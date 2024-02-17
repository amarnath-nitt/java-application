package oops.classesandobjects.finalkeyword.finalclass;

/**
 * final class can not be extendable with any subclass.
 * */
public final class Student {
  String name;
  int age;
  
  public void getDetails() {
	  System.out.println("Name "+ name + " and age " +age );
  }
}
