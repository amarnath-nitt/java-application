package JavaCollectionFramework.LinkedList.GenericLinkedList;

public class MyLinkedList<E>{
   
	public static class Node<E>{
		 public E data;
		 public Node<E> next;
		
		public Node(E data){
			this.data=data;
		}
	}
	
	Node<E> head=null;
	Node<E> tail;
	public void add(E x) {
		Node<E> toAdd = new Node<>(x);
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
		Node<E> temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
	public E removeLast() throws Exception {
		Node<E> temp = head;
		if(temp==null) {
			throw new Exception("Under Flow Condition.");
		}
		if(temp.next==null) {
			Node<E> toRemove = head;
			head=null;
			return toRemove.data;
		}
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node<E> toRemove = temp;
		temp.next=null;
		return toRemove.data;
		
	}
	
	public E getLastElement() throws Exception {
		Node<E> temp=head;
		if(temp==null) {
			throw new Exception("Under Flow Condition.");
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp.data;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public E get(int ind) {
		Node<E> temp=head;
		int i=0;
		E ele;
		while(temp!=null) {
			if(i==ind) {
				ele = temp.data;
				return ele;
			}
			i++;
			temp=temp.next;
		}
		return null;
	}
	
}
