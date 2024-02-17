package oops.classesandobjects.constructors.ConstructorOverloading;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name="Ajay Yadav";
        s.age= 23;
        s.gender="Male";
        s.mobile=9118105790L;
        s.displayDetails();
        Student s1 = new Student("AMARNATH", 22, "MALE", 8948663599L);
        s1.displayDetails();
    }
}
class Student {
    String name;
    int age;
    String gender;
    long mobile;
    // Default Constructor
    Student(){
        name="";
        age=0;
        gender="M";
        mobile= 8948663599L;  
    }
    // Parameterized Constructor
    Student(String n, int a, String gender, long mob){
        name = n;
        age = a;
        this.gender=gender;
        mobile = mob;
    }
    // To Dispaly
    public void displayDetails(){
        System.out.println("Name : "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);
        System.out.println("Mobile No: "+ mobile);
    }
}