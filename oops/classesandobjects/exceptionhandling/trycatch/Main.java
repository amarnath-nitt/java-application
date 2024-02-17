package oops.classesandobjects.exceptionhandling.trycatch;

public class Main {

	public static void main(String[] args) {
		try {
//			int a = 19;
//			int b = 0;
//			
//			int c = a/b;
//			
//			System.out.println("c: "+ c);
			
//			int[] myArr = new int[5];
//			int a = myArr[5];
//			System.out.println(a);
			
			long num = 8948663599L;
			int a =  (int)num;
			System.out.println(a);

		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " occured, please check your code.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index should be in the range of 0 to size of Array.");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Check your casting carefully");
		}
		finally {
			System.out.println("Sorry for the inconvenience.");
		}
		
//		fun1();
	}
	
	public static void fun1() {
		int a =10;
		int b =0;
		
		int c= a/b;
		
		System.out.println("C: "+c);
	}
	

}
