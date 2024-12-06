package com.te.basics.polymorphism;

class Aa {
	public void m1() {
		System.out.println("m1() from Aa!");
	}
}

class Bb extends Aa {
	@Override
	public void m1() {
		System.out.println("m1() from Bb!");
	}
}

public class LearnPolymorphism2 {

	public static void main(String[] args) {
		Aa o1 = new Aa();
		Aa o2 = new Bb();
		Bb o3 = new Bb();

		o1.m1();
		o2.m1();
		o3.m1();
	}
}
