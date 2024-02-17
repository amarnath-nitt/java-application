package oops.classesandobjects.finalkeyword.finalmethod;

public class Student {
  String name;
  int age;

  /**
   * final method can not be overridden in any subclass.
   * */
  public final void getDetails() {
	  System.out.println("Student name is "+ name + " and his age is "+ age);
  }
}
