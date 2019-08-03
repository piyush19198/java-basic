package com.Thread;

public class Thread_WaitAndNotify{
	class StackClass{
		private Object[] stackArray;
		private volatile int topOfStack;
		
		StackClass(int capacity){
			stackArray = new Object[capacity];
			topOfStack = -1;
		}
		
		public synchronized Object pop(){
			System.out.println(Thread.currentThread()+" : popping");
			while(isEmpty()){
				try{
					System.out.println(Thread.currentThread()+" : waiting to pop");
					
					wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
			Object.obj = stackArray[topOfStack];
			stackArray[topOfStack--] = null;
			System.out.println(Thread.currentThread()+" : notifying after pop");
			notify();
			return obj;
		}
		
		public synchronized void push(Object element){
			while(isFull()){
				try{
					System.out.println(Thread.currentThread()+" : waiting to push");
					wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
			stackArray[++topOfStack] = element;
			System.out.println(Thread.currentThread()+" : notifying after push");
			notify();
		}
		
		public boolean isFull(){
		return topOfStack >= stackArray.length - 1;
		}
	
		public boolean isEmpty(){
			return topOfStack < 0;
		}
	}
	
	abstract class StackUser extends Thread{
		protected StackClass stack;
		StackUser(String threadName, StackClass stack){
		super(threadName);
		this.stack = stack;
		System.out.println(this);
		setDaemon(true);
		start();
	}
}

class StackPopper extends StackUser{
	StackPopper (String threadName, StackClass stack){
		super(threadName, stack);
	}
	public void run(){
		while (true){
			stack.pop();
		}
	}
}                                                                                                                                                                                                                                                                                                                                                                     +


class StackPusher extends StackUser{
	StackPusher (String threadName, StackClass stack){
		super(threadName, stack);
	}
	public void run (){
		while (true)
		stack.push(new Integer(1));
	}
}

public class Thread_WaitAndNotify extends Thread{
	public static void main(String[] args){
		StackClass stack = new StackClass(5);
		new StackPusher("one" , stack);
		new StackPusher("two" , stack);
		new StackPusher("three" , stack);
		
		System.out.println("Main thread sleeping...");
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("exit From Main Thread...");
	}
}
