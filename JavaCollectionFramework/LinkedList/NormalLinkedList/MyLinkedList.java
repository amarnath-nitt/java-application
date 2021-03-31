package JavaCollectionFramework.LinkedList.NormalLinkedList;

public class MyLinkedList {
   
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	Node head=null;
	Node tail;
	public void add(int x) {
		Node toAdd = new Node(x);
		if(head==null) {
			head=toAdd;
			tail=toAdd;
		}
		else {
			tail.next=toAdd;
			tail=toAdd;
		}
	}
	
	public void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
	
	public int get(int ind) {
		Node temp=head;
		int i=0, ele=0;
		while(temp!=null) {
			if(i==ind) {
				ele = temp.data;
				break;
			}
			i++;
			temp=temp.next;
		}
		return ele;
	}
	
}
