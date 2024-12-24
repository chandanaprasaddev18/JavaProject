package com.te.basics.multithreading;

class Lock {
	public synchronized void method1() {
		System.out.println("method 1 begins");
	}

	public synchronized void method2() {
		System.out.println("method 2 begins");

	}
}

public class LearnSynchronized {
	public static void main(String[] args) {
		Lock lock = new Lock();
		Thread thread1 = new Thread(() -> lock.method1());
		Thread thread2 = new Thread(() -> lock.method2());

		thread1.start();
		thread2.start();
	}
}
