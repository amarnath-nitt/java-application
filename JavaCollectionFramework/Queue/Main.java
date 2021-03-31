package JavaCollectionFramework.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyQueue<Integer> Q = new MyQueue<>();
        for(int i=0; i<4; i++) {
        	Q.enqueue(i);
        }
        
        System.out.println(Q.dequeu());
        System.out.println(Q.dequeu());
        System.out.println(Q.dequeu());
        System.out.println(Q.dequeu());
        System.out.println(Q.dequeu());
        Q.enqueue(45);
        System.out.println(Q.dequeu());
        
	}

}
