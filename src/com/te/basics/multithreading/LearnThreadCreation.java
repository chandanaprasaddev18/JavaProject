package com.te.basics.multithreading;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println("char:" + (char) i);
		}
		super.run();
	}
}

class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("int:" + i);
		}
	}

}

public class LearnThreadCreation {
	public static void main(String[] args) {
		System.out.println("main starts");
		MyThread myThread = new MyThread();
		myThread.start();
//		MyRunnableThread myRunnableThread = new MyRunnableThread();
//		Thread thread = new Thread(myRunnableThread);
//		thread.start();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread lambdaThread = new Thread(() -> {
			for (int i = 1; i <= 20; i++) {
				System.out.println("int:" + i);
			}
		});
		lambdaThread.start();
		System.out.println("main ends");

	}
}
