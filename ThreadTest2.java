package com.Thread;

public class Thread_Test_2{
	public static void main(String[] args){
		//WORKING WITH MAIN THREAD
		System.out.println("Starting Thread Test 2...");
		
		Thread extendedThread = new ExtendedThread();
		extendedThread.setName("Extended Thread");
		extendedThread.start();
		
		for(int i=1; i<=10; i++){
			System.out.println(Thread.currentThread().getName()+"->"+i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	class ExtendThread extends Thread{
	
	@Override
	public void run(){
		for(int i=1; i<=20; i++){
			System.out.println("\t"+Thread.currentThread().getName());
			try{
					Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
}
