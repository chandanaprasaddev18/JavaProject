package com.te.basics.multithreading2;

public class CreationOfThread {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			System.out.println("This run() is invoked by " + Thread.currentThread().getName());
		}, "MyThread");
		thread.run();
		thread.start();

	}
}
