package oops.classesandobjects.FinalKeyword.FinalVariable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      final Student s1 = new Student();
      Student s2 = new Student();
       
      s2.name = "Amar"; 
      
     // s1 = s2; // It can not be assigned again to a new object;
      
      s1.name = "Ram";
      // But we can change internal value of that object;
 	}

}
