package JavaCollectionFramework.ArrayDeque;


public class MyDeque<E> {
  
	static class Node<E>{
		E data;
		Node<E> next;
		Node<E> prev;
		
		public Node(E data){
			this.data =data;
			this.next=null;
			this.prev=null;
		}
 	}
	
	Node<E> head=null, tail;
	public void addFirst(E e) {
		Node<E> toAdd = new Node<>(e);
		if(head==null) {
			head=tail=toAdd;
		}
		else {
			tail.next = toAdd;
			toAdd.prev = tail;
			tail=toAdd;
		}
	}
	
	public E removeLast() {
		if(head==null) {
			return null;
		}
		else {
			Node<E> temp=tail;
			Node<E> toRemove=tail;
			tail= tail.prev;
			tail.next=null;
			temp.prev=null;
			return toRemove.data;
		}
	}
	
}
