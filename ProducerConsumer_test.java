package com.Stack;

class MessageBox {
	private String message;
	private boolean hasMessage;

	// Producer

	public synchronized void putMessage(String message) {
		while (hasMessage) { // no room for other message
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		// acquire lock and continue
		hasMessage = true;
		this.message = message + "Put @" + System.nanoTime();
		notify();
	}

	// Consumer

	public synchronized String getMessage() {
		while (!hasMessage) { // no new message
			try {
				wait(); // release the lock of this object
			} catch (InterruptedException e) {
			}
		}
		// acquire the lock and continue
		hasMessage = false;
		notify();
		return message + "Get @ " + System.nanoTime();
	}

}

public class ProducerConsumer_test {

	public static void main(String[] args) {
		
		final MessageBox box = new MessageBox();
		Thread producerThread = new Thread(){
		
		@Override
		public void run(){
			System.out.println("Produer thread started....");
			for(int i=0;i<=6;i++){
				box.putMessage("message" + i);
				System.out.println("Put Message "+i);
			}
		} 
	};

	Thread consumerThread1 = new Thread(){
		
		@Override
		public void run(){
			System.out.println("Consumer1 thread started....");
			for(int i=0;i<=3;i++){
				System.out.println("Consumer thread1 started...." + box.getMessage());
			}
		} 
	};
	
	Thread consumerThread2 = new Thread(){
		@Override
		public void run(){
			System.out.println("Consumer2 thread started....");
			for(int i=0;i<=3;i++){
				System.out.println("Consumer thread2 Get "+box.getMessage());
			}
		} 
	};
	
		consumerThread2.start();
		consumerThread1.start();
		producerThread.start();
	
	}

}
	

