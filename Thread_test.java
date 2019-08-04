package com.thread;

public class Thread_test {

	public static void main(String[] args) {
			
		System.out.println("Starting Thread....");
		
		Thread currentThread =  Thread.currentThread();
		
		System.out.println("Thread Name : "+currentThread.getName());
		System.out.println("Thread Priority : "+currentThread.getPriority());
		
		currentThread.setName("Karan");
		System.out.println("Thread name : "+currentThread.getName());
		System.out.println("Thread Priority : "+currentThread.getPriority());
		
		for(int index=0; index<=10; index++){
			System.out.println("Counter :"+index);
			try {
				currentThread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
