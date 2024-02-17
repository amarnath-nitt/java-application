package oops.classesandobjects.FinalKeyword.FinalMethod;

public class Main extends Student {
    
//	 public void getDetails() {
//		  System.out.println("Student name is "+ name + " and his age is "+ age);
//	  }
	// We can not override a final methods ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Main m = new Main();
        m.age = 10;
        m.name = "Ram";
        m.getDetails();
	}

}
