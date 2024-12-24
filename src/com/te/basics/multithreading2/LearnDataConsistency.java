package com.te.basics.multithreading2;

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
	public static void main(String[] args) {
		System.out.println("main starts");
		Counter counter = new Counter();
		Thread thread1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				counter.increment();
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				counter.increment();
			}
		});
		thread1.start();
		thread2.start();

		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The final count is " + counter.getCount());
		System.out.println("main ends");
	}
}
