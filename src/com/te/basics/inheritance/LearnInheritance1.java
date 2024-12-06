package com.te.basics.inheritance;

class A {
	int a = 10;
}

class B extends A {
	int b = 20;
}

class C extends B {
	int c = 30;
}

public class LearnInheritance1 {
	public static void main(String[] args) {
		A a = new B();
		C c = (C) a;

		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);

	}
}
