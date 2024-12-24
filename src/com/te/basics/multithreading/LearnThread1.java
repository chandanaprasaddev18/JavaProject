package com.te.basics.multithreading;

public class LearnThread1 {
	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.getName());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
		System.out.println(thread.getThreadGroup());
		thread.start();
		System.out.println(thread.getState());
		

	}
}
