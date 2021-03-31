package JavaCollectionFramework.ArrayDeque;

//import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        ArrayDeque<Integer> arrDeq = new ArrayDeque<>();
//        for(int i=0; i<10; i++) {
//        	arrDeq.push(i);
//        }
//        Object[] myArr = arrDeq.toArray();
//        for(Object x: myArr) {
//        	System.out.println(x+ " ");
//        }
		
		// Using MyDeque
		MyDeque<Integer>myDeq = new MyDeque<>();
		
		for(int i=0; i<10; i++) {
			myDeq.addFirst(i);
		}
		
		System.out.println(myDeq.removeLast());
		System.out.println(myDeq.removeLast());
		System.out.println(myDeq.removeLast());
		System.out.println(myDeq.removeLast());
		
		
	}

}
