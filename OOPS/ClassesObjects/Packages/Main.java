package OOPS.ClassesObjects.Packages;

import OOPS.ClassesObjects.Packages.Models.Student;
import OOPS.ClassesObjects.Packages.Models.Teacher;

public class Main{ 
    public static void main(String[] args) {
       Teacher t = new Teacher();
       t.setName("AMARNATH"); t.setAge(22); t.setMobile(8948663599L);
       
       t.getDetails();
       
       Student s = new Student();
       s.setName("RAM KUMAR"); s.setAge(20); s.setMobile(9118105790L);
       
       s.getDetails();
    }
}
