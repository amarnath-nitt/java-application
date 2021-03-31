package JavaCollectionFramework.Queue;

import JavaCollectionFramework.LinkedList.GenericLinkedList.MyLinkedList.Node;

public class MyQueue<E> {
    
	private Node<E> front=null,rear=null;
	
	public void enqueue(E e) {
		Node<E> toAdd = new Node<E>(e);
		if(front==null) {
			front=rear = toAdd;
		}
		else {
			rear.next=toAdd;
			rear=toAdd;
		}
	}
	
	public E dequeu() {
		if(front==null) {
			return null;
		}
		Node<E> temp = front;
		Node<E> toRemove = front;
		front=front.next;
		temp.next=null;
		return toRemove.data;
	}
	
}
