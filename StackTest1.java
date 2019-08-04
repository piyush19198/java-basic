package com.Thread;

public class Stack_Class{
	private object[] stackArray;mn
	private volatile int topOfStack;
	
	Stack_Class(int capacity){
		stackArray = new object[capacity];
		topOfStack = -1;
	}
	
	public synchronized Object pop(){
		System.out.println(Thread.currentThread()+" : popping");
		while (isEmpty()){
			try{
				System.out.println(Thread.currentThread()+" : waiting to pop");
				wait();
			}
		}
	}
}
