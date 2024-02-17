package oops.classesandobjects.finalkeyword.finalvariable;

// final keyword works same as constant (const) in C++;
public class Student {
//  final String name;
//  final int age;
  
  
//We can declare a static block. if n only if vairable is static or final static;  
  
//  name = "AMAR";
//  age = 10;

//  {
//	  name = "AMARNATH";
//  }
//  
//  public Student(){
//	  age = 30;
//  } 
  
// We can re-assigned final variables;
  
// name = "Survesh";
// age = 20;
  
  
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
