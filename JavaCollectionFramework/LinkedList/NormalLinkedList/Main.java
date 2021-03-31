package JavaCollectionFramework.LinkedList.NormalLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyLinkedList list = new MyLinkedList();
        
        for(int i=0; i<10; i++) {
        	list.add(i);
        }
        
        System.out.println("Element at index 3: "+ list.get(3));
        
        System.out.println("List is :");
        list.print();      
	}

}
