package com.corejava.examples;

public class LinkedListImpl {

	public static void main(String[] args) {

	//	int data =  ....
	//	LinkedElement<Integer> head = reference to head 
	//	head = insertFront(head,data);
		System.out.println("this is a sample Linked List Impl");
	}
	
	
	public class LinkedElement<T> {
		private LinkedElement<T> next;
		private T data;
		
		public LinkedElement (T value) { data = value;}  
	public T value () { return data;}
	public LinkedElement<T> next() { return next;}
	
		
		public void setNext(LinkedElement<T> element) {
			this.next = element;
		}
		public void setValue(T data) {
			this.data = data;
		}
		
		
	}
	
	public LinkedElement<Integer> insertFront(LinkedElement<Integer> head, int data)
	{
		LinkedElement<Integer> list = new LinkedElement<Integer>(data);
		list.setNext(head);
		return list;
		
	}

}
