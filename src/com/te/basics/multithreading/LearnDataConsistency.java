package com.te.basics.multithreading;

class Counter {
	private int count = 0;

	public void increment() {
		synchronized (this) {
			count++;
		}

	}

	public int getCount() {
		return count;
	}
}

public class LearnDataConsistency {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}

		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
		System.out.println("Final count= " + counter.getCount());

	}
}
