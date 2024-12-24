package com.te.basics.multithreading2;

public class LearnThreadSleep {
	public static void main(String[] args) {
		System.out.println("main starts");
		Thread thread = new Thread("my-thread1");
		System.out.println(thread.getName());
		try {
			thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ends");
	}
}
