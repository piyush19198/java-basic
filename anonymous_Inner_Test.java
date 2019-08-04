package com.Stack;

public class anonymous_Inner_Test {

	public static void main(String[] args) {
		System.out.println("Started--> Anonymous_Inner_Test....");

		Runnable runnable = new RunnableThreads();
		new Thread(runnable).start();

		// using anonymous inner class
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous RunnableThread started...");
			}
		}).start();

		// using java8 lambda expression

		new Thread(() -> System.out.println("Lambda Anonymous " + "Runnable Thread started ")).start();
		// if there is only one method in INTERFACE then we can use Lambda
		// Expression i.e it will automatically know that we have to execute
		// that method. (Runnable is Interface )

		System.out.println("Ended--> Anonymous_Inner_Test....");
	}
}

class RunnableThreads implements Runnable {

	@Override
	public void run() {
		System.out.println("RunnableThread started...");
	}

}
