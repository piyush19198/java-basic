package com.Thread;

public class Stack_Test_2{
	private object[] stackArray;
	private volatile int topOfStack;
	
	Stack_Class(int capacity){
		stackArray = new object[capacity];
		topOfStack = -1;
	}
	
	public Object pop(){
		Object obj = stackArray[topOfStack];
		stackArray[topOfStack--] = null;
		return obj;
	}	
	
	public void push(Object element){
		stackArray[++topOfStack] = element;
	}
	
	public boolean isFull(){
		return topOfStack >= stackArray.length - 1;
	}
	
	public boolean isEmpty(){
		return topOfStack < 0;
	}
	
	public static void main(String[] args){
		Stack_Test_2 stack = new Stack_Test_2(5);
		stack.push("Nibba");
		stack.push("Nibber");
		stack.push("Nibbi");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
