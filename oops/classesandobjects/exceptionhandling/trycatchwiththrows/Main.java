package oops.classesandobjects.exceptionhandling.trycatchwiththrows;

public class Main {

	public static void main(String[] args) {
		 fun1();
	}
	public static void fun1() {
		int a = 5;
		int b = 3;
		
		int c = a/b;
		
		System.out.println(c);
		
		try {
			Thread.sleep(1099);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After delay.");
//		try {
//			fun2();
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage() + " occured.");
//		}
	}
	public static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
		if(isDanger) {
			throw  new ArrayIndexOutOfBoundsException("Danger wad coming ->");
		}
	}

}
