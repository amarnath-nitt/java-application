package oops.classesandobjects.Packages;

import oops.classesandobjects.Packages.Models.Student;
import oops.classesandobjects.Packages.Models.Teacher;

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
