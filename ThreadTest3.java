package com.Thread;

public class Thread_Test_3{
	
	
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

