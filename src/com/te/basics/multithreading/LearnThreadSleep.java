package com.te.basics.multithreading;

public class LearnThreadSleep {
	public static void main(String[] args) {
		System.out.println("Thread before sleeping");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread after sleeping");

	}

}
