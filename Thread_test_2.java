package com.thread;

public class Thread_test_2 {

	public static void main(String[] args) {
		System.out.println("Thread Test 2....");

		Thread extendThread = new ExtendThread();
		extendThread.setName("ExtendThread ");
		extendThread.start();

		Thread runnablethread = new Thread(new RunnableThread());
		runnablethread.setName("Runnable Thread ");
		runnablethread.start();

		// main thread execution
		for (int index = 0; index <= 10; index++) {
			System.out.println(Thread.currentThread().getName() + " : " + index);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main Thread Ended");
	}
}

class ExtendThread extends Thread {

	@Override
	public void run() {
		for (int index = 0; index <= 10; index++) {
			System.out.println("\t" + Thread.currentThread().getName() + index);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	class RunnableThread implements Runnable {
		@Override
		public void run() {
			for (int index = 0; index <= 10; index++) {
				System.out.println("\t\t" + Thread.currentThread().getName() + index);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
