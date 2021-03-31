package OOPS.ClassesObjects.Introduction.Student;
public class Main{
    public static void main(String[] args){
          Student s1 = new Student();
          s1.name = "AMARNATH"; 
          s1.age=22; 
          s1.gender="Male";  
          s1.email="amarnath97.nitt@gmail.com";
          System.out.println("Student "+ s1.name + " , his age is "+ s1.age);
    }
}
class Student{
    String name;
    int age;
    String gender;
    long mobile;
    String email;
}
