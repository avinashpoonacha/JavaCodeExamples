package com.corejava.examples;

public class StackImpl {

	public static void main(String[] args) {
		StackImp<Integer> stack = new StackImp<Integer>();
		stack.push(5).push(6).push(3).push(9);
		System.out.println(stack.pop() + stack.pop());

	}
	
	interface Stack<T> {
		Stack<T> push (T element);
		T pop();
	}
	
	public static class StackImp<T> implements Stack<T> {
		
		private Node first;
		private int total;
		
		public StackImp () {}
		
		
		private class Node {
	        private T ele;
	        private Node next;
	    }
		
		@Override
		public Stack<T> push(T element) {
			Node current = first;
			first = new Node();
			first.ele = element;
			first.next= current;
			total++;
			return this;
		}
		@Override
		public T pop() {
			if(first==null ) throw new java.util.NoSuchElementException();
			T element = first.ele;
			first = first.next;
			total--;
			return element;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			Node tmp = first;
			while (tmp != null){
				sb.append(tmp.ele).append(",");
				tmp=tmp.next;
			}
			return sb.toString();
		}
		
	}

}
