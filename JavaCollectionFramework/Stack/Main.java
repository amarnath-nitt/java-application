package JavaCollectionFramework.Stack;

//import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 //Using Stack form Collections; 
		
//        Stack<Integer> st = new Stack<>();
//        for(int i=0; i<10; i++) {
//        	st.push(i);
//        }
//        System.out.println("Peek element before pop operation: " + st.peek());
//        st.pop();
//        System.out.println("Peek element after pop operation: "+ st.peek() );
		
		// Using MyStack;
		
		MyStack<Integer> myStack = new MyStack<>();
		for(int i=0; i<100; i++) {
			myStack.push(i);
		}
		
		System.out.println("Peek element before pop operation: " + myStack.peek());
	    myStack.pop();
	    System.out.println("Peek element after pop operation: "+ myStack.peek() );
		
	}

}
