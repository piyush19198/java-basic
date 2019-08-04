package com.Stack;


public class Stack_test {

	private Object[] stackArray;
	private int topOfStack;

	public Stack_test(int capacity) {
		stackArray = new Object[capacity];
		topOfStack = -1;
	}

	public void push(Object element) {
		stackArray[++topOfStack] = element;
		System.out.println("Pushed element is : " + element);
	}

	public Object pop() {
		Object obj = stackArray[topOfStack];
		stackArray[topOfStack] = null;
		return obj;
	}

	public boolean isFull() {
		return topOfStack >= stackArray.length - 1;
	}

	public boolean isEmpty() {
		return topOfStack < 0;
	}

	public static void main(String[] args) {

		Stack_test stack = new Stack_test(5);
		stack.push("JAVA");
		stack.push("HTML");
		stack.push("JavaScript");
		System.out.println("Popped element is : " + stack.pop());
		System.out.println("Stack Empty? :"+stack.isEmpty());
		System.out.println("Stack Full? :"+stack.isFull());
	}

}
