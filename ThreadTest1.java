package com.Thread;

public class Thread_Test_1{
	public static void main(String[] args){
		//WORKING WITH MAIN THREAD
		System.out.println("Starting Thread...");
		Thread currentThread = Thread.currentThread();
		
		System.out.println("Thread Name: "+currentThread.getName());
		System.out.println("Thread Priority: "+currentThread.getName());
		
		currentThread.setName("MET");
		System.out.println("Thread Name: "+currentThread.getName());
		
		for(int i=1; i<=10; i++){
			System.out.println("Counter: "+i);
			try{
				currentThread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
