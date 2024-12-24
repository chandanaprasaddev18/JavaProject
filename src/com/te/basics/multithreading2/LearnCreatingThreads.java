package com.te.basics.multithreading2;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println("character " + (char) i);
		}
		super.run();
	}
}

class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 18; i++) {
			System.out.println("int " + i);
		}
	}

}

public class LearnCreatingThreads {
	public static void main(String[] args) {
		
		// thread created using Thread class
		MyThread myThread1 = new MyThread();
		myThread1.start();
		
		// thread created using Runnable interface
		MyRunnableThread myRunnableThread1 = new MyRunnableThread();
		Thread thread = new Thread(myRunnableThread1);
		thread.start();
		
		//thread created using lambda expression
		Thread lambdaThread = new Thread(() -> {
			for (int i = 100; i < 200; i++) {
				System.out.println(i);
			}
		});
		lambdaThread.start();

	}
}
