package JavaCollectionFramework.Stack;

import JavaCollectionFramework.LinkedList.GenericLinkedList.MyLinkedList;

public class MyStack<E> {
  MyLinkedList<E> list = new MyLinkedList<>();
  
  public void push(E e) {
	  list.add(e);
  }
  
  public E peek() throws Exception{
	  return list.getLastElement();
  }
  
  public void pop() throws Exception {
	  list.removeLast();
  }
  
}
