package com.te.basics.polymorphism;

class A {
	int a = 10;
	static int s = 18;

	public static void m1() {
		System.out.println("m1() from A!");
	}

	public void m2() {
		System.out.println("m2() from A!");
	}

}

class B extends A {
	int a = 20;
	static int s = 28;

	public static void m1() {
		System.out.println("m1() from B!");
	}

	public void m2() {
		System.out.println("m2() from B!");
	}
}

public class LearnPolymorphism1 {
	public static void main(String[] args) {

		A a1 = new A();
//		B b1 = (B) new A();
		A a2 = new B();
		B b2 = new B();

		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(b2.a);

		System.out.println(a1.s);
		System.out.println(a2.s);
		System.out.println(b2.s);

		/*
		 * For variable hiding the type of the reference variable matters.
		 * 
		 * 
		 * Case 1: A a1 = new A(); Here reference variable is of type A and also the
		 * object created. But only reference variable type is considered. So, when we
		 * call a1.a; we get the result 10;
		 * 
		 * Case 2: A a2 = new B(); Here the reference type is of A class, but the object
		 * is of B class. And as in variable hiding only reference type is
		 * considered, when we perform a2.a we still get 10. Data of a stored in class B
		 * object is not considered.
		 * 
		 * Case 3: B b2 = new B(); In this case reference and object are of same type so
		 * B class 'a' variable was used.
		 */

		a1.m1();
		a2.m1();
		b2.m1();

		a1.m2();
		a2.m2();
		b2.m2();

		/*
		 * Runtime polymorphism can be seen using method overriding, but for method
		 * overriding to happen up-casted reference is required!.
		 * 
		 * Without upcasting there is no method overriding.
		 */

		/*
		 * At the complile time it is decided that m2() method of class A will get
		 * executed. But this decision was changed at the Runtime and overriden version
		 * of m2() method in the child class was executed.
		 */
	}
}