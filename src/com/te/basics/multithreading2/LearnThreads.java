package com.te.basics.multithreading2;

public class LearnThreads {
	public static void main(String[] args) {
		Thread thread = new Thread();
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
//		thread.start();
		System.out.println(thread.getState());

	}
}
